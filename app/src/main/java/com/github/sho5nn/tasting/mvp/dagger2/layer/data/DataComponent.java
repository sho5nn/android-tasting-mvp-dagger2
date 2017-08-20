package com.github.sho5nn.tasting.mvp.dagger2.layer.data;

import com.github.sho5nn.tasting.mvp.dagger2.di.ISubcomponent;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.friend.FriendDataModule;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.user.UserDataModule;
import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.DomainComponent;

import java.util.Map;

import dagger.Subcomponent;

@DataScope
@Subcomponent(modules = {
  UserDataModule.class,
  FriendDataModule.class,
  DomainComponentBuilderModule.class
})
public interface DataComponent extends ISubcomponent {

  @Subcomponent.Builder
  interface Builder extends ISubcomponent.Builder<DataComponent> {
    Builder userDataModule(UserDataModule module);
    Builder friendDataModule(FriendDataModule module);
  }

  Map<Class<DomainComponent>, DomainComponent.Builder> domainComponentBuilderMap();
}
