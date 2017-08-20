package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.friend.list;

import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.ViewComponent;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.ViewModule;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.ViewScope;

import dagger.Subcomponent;

@ViewScope
@Subcomponent(modules = {ViewModule.class, FriendListViewModule.class})
public interface FriendListViewComponent extends ViewComponent {

  void inject(FriendListView.FriendListActivity activity);

  @Subcomponent.Builder
  interface Builder extends ViewComponent.Builder<FriendListViewComponent> {
    Builder viewModule(ViewModule module);
  }
}
