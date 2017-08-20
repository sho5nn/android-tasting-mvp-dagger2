package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.user;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.usecase.UserUseCase;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.SomethingPresentationScopeObject;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.BasePresenter;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.SomethingViewScopeObject;

public interface UserPresenter extends BasePresenter {

  void onCreate(UserView view, @Nullable Bundle savedInstanceState);

  class UserPresenterImpl implements UserPresenter {

    private UserView view;
    private UserUseCase userUseCase;
    private SomethingPresentationScopeObject somethingPresentationScopeObject;
    private SomethingViewScopeObject somethingViewScopeObject;

    public UserPresenterImpl(UserUseCase userUseCase,
                             SomethingPresentationScopeObject somethingPresentationScopeObject,
                             SomethingViewScopeObject somethingViewScopeObject) {
      this.userUseCase = userUseCase;
      this.somethingPresentationScopeObject = somethingPresentationScopeObject;
      this.somethingViewScopeObject = somethingViewScopeObject;
    }

    @Override
    public void onCreate(UserView view, @Nullable Bundle savedInstanceState) {
      this.view = view;
      view.initialize();
    }

    @Override
    public String toString() {
      return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) +
        "\n    - " + somethingViewScopeObject +
        "\n    - " + somethingPresentationScopeObject +
        "\n    - " + userUseCase;
    }
  }
}
