package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.friend.profile;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.usecase.FriendUseCase;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.SomethingPresentationScopeObject;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.BasePresenter;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.SomethingViewScopeObject;

public interface FriendProfilePresenter extends BasePresenter {

  void onCreate(FriendProfileView view, @Nullable Bundle savedInstanceState);

  class FriendProfilePresenterImpl implements FriendProfilePresenter {

    private FriendProfileView view;
    private FriendUseCase friendUseCase;
    private SomethingPresentationScopeObject somethingPresentationScopeObject;
    private SomethingViewScopeObject somethingViewScopeObject;

    public FriendProfilePresenterImpl(FriendUseCase friendUseCase,
                                      SomethingPresentationScopeObject somethingPresentationScopeObject,
                                      SomethingViewScopeObject somethingViewScopeObject) {
      this.friendUseCase = friendUseCase;
      this.somethingPresentationScopeObject = somethingPresentationScopeObject;
      this.somethingViewScopeObject = somethingViewScopeObject;
    }

    @Override
    public void onCreate(FriendProfileView view, @Nullable Bundle savedInstanceState) {
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
