package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation;

import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.ViewComponent;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.friend.list.FriendListViewComponent;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.friend.profile.FriendProfileViewComponent;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.user.UserViewComponent;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
  UserViewComponent.class,
  FriendListViewComponent.class,
  FriendProfileViewComponent.class
})
public abstract class ViewComponentBuilderModule {

  @PresentationScope
  @Binds
  @IntoMap
  @ViewComponentBuilderMapKey(UserViewComponent.class)
  public abstract ViewComponent.Builder userViewComponentBuilder(UserViewComponent.Builder builder);

  @PresentationScope
  @Binds
  @IntoMap
  @ViewComponentBuilderMapKey(FriendListViewComponent.class)
  public abstract ViewComponent.Builder friendListViewComponentBuilder(FriendListViewComponent.Builder builder);

  @PresentationScope
  @Binds
  @IntoMap
  @ViewComponentBuilderMapKey(FriendProfileViewComponent.class)
  public abstract ViewComponent.Builder friendProfileViewComponentBuilder(FriendProfileViewComponent.Builder builder);
}
