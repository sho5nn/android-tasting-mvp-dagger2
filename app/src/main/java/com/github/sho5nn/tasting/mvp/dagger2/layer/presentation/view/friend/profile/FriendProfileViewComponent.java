package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.friend.profile;

import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.ViewComponent;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.ViewModule;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.ViewScope;

import dagger.Subcomponent;

@ViewScope
@Subcomponent(modules = {ViewModule.class, FriendProfileViewModule.class})
public interface FriendProfileViewComponent extends ViewComponent {

  void inject(FriendProfileView.FriendProfileActivity activity);

  @Subcomponent.Builder
  interface Builder extends ViewComponent.Builder<FriendProfileViewComponent> {
    Builder viewModule(ViewModule module);
  }
}
