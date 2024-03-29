package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.friend.profile;

import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.usecase.FriendUseCase;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.SomethingPresentationScopeObject;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.SomethingViewScopeObject;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.ViewScope;

import dagger.Module;
import dagger.Provides;

@Module
public class FriendProfileViewModule {

  @ViewScope
  @Provides
  FriendProfilePresenter provideFriendProfilePresenter(FriendUseCase friendUseCase,
                                                       SomethingPresentationScopeObject somethingPresentationScopeObject,
                                                       SomethingViewScopeObject somethingViewScopeObject) {
    return new FriendProfilePresenter.FriendProfilePresenterImpl(friendUseCase, somethingPresentationScopeObject, somethingViewScopeObject);
  }
}
