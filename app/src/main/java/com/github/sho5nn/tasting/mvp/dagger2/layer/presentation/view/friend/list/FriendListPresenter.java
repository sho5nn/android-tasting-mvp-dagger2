package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.friend.list;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.usecase.FriendUseCase;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.SomethingPresentationScopeObject;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.BasePresenter;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.SomethingViewScopeObject;

public interface FriendListPresenter extends BasePresenter {

  void onCreate(FriendListView view, @Nullable Bundle savedInstanceState);

  class FriendListPresenterImpl implements FriendListPresenter {

    private FriendListView view;
    private FriendUseCase friendUseCase;
    private SomethingPresentationScopeObject somethingPresentationScopeObject;
    private SomethingViewScopeObject somethingViewScopeObject;

    public FriendListPresenterImpl(FriendUseCase friendUseCase,
                                   SomethingPresentationScopeObject somethingPresentationScopeObject,
                                   SomethingViewScopeObject somethingViewScopeObject) {
      this.friendUseCase = friendUseCase;
      this.somethingPresentationScopeObject = somethingPresentationScopeObject;
      this.somethingViewScopeObject = somethingViewScopeObject;
    }

    @Override
    public void onCreate(FriendListView view, @Nullable Bundle savedInstanceState) {
      this.view = view;
      view.initialize();
    }

    @Override
    public String toString() {
      return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) +
        "\n    - " + somethingViewScopeObject +
        "\n    - " + somethingPresentationScopeObject +
        "\n    - " + friendUseCase;
    }
  }
}
