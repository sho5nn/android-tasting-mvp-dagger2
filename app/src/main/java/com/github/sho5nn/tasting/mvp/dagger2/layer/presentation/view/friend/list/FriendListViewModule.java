package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.friend.list;

import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.usecase.FriendUseCase;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.ViewScope;

import dagger.Module;
import dagger.Provides;

@Module
public class FriendListViewModule {

  @ViewScope
  @Provides
  FriendListPresenter provideFriendListPresenter(FriendUseCase friendUseCase) {
    return new FriendListPresenter.FriendListPresenterImpl(friendUseCase);
  }
}
