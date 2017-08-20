package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.user;

import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.ViewComponent;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.ViewModule;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.ViewScope;

import dagger.Subcomponent;

@ViewScope
@Subcomponent(modules = {ViewModule.class, UserViewModule.class})
public interface UserViewComponent extends ViewComponent {

  void inject(UserView.UserActivity activity);

  @Subcomponent.Builder
  interface Builder extends ViewComponent.Builder<UserViewComponent> {
    Builder viewModule(ViewModule module);
  }
}
