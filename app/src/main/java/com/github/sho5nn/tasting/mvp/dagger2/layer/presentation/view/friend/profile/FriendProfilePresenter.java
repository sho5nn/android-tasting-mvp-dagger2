package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.friend.profile;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.usecase.FriendUseCase;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.BasePresenter;

public interface FriendProfilePresenter extends BasePresenter {

  void onCreate(FriendProfileView view, @Nullable Bundle savedInstanceState);

  class FriendProfilePresenterImpl implements FriendProfilePresenter {

    private FriendProfileView view;
    private FriendUseCase friendUseCase;

    public FriendProfilePresenterImpl(FriendUseCase friendUseCase) {
      this.friendUseCase = friendUseCase;
    }

    @Override
    public void onCreate(FriendProfileView view, @Nullable Bundle savedInstanceState) {
      this.view = view;
      view.initialize();
    }

    @Override
    public String toString() {
      return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) +
        "\n    - " + friendUseCase;
    }
  }
}
