package com.github.sho5nn.tasting.mvp.dagger2.layer.data;

import com.github.sho5nn.tasting.mvp.dagger2.layer.application.ApplicationLayer;
import com.github.sho5nn.tasting.mvp.dagger2.di.ArchitectureLayer;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.friend.FriendDataModule;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.user.UserDataModule;

public class DataLayer implements ArchitectureLayer<DataComponent> {

  private DataComponent component;

  public DataLayer(ApplicationLayer applicationLayer) {
    component = applicationLayer.getComponent()
      .dataComponentBuilderMap().get(DataComponent.class)
      .userDataModule(new UserDataModule())
      .friendDataModule(new FriendDataModule())
      .build();
  }

  @Override
  public DataComponent getComponent() {
    return component;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
  }
}
