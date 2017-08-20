package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.user;

import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.usecase.UserUseCase;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.ViewScope;

import dagger.Module;
import dagger.Provides;

@Module
public class UserViewModule {

  @ViewScope
  @Provides
  UserPresenter provideUserPresenter(UserUseCase userUseCase) {
    return new UserPresenter.UserPresenterImpl(userUseCase);
  }
}
