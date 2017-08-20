package com.github.sho5nn.tasting.mvp.dagger2.layer.domain;

import com.github.sho5nn.tasting.mvp.dagger2.layer.data.DataLayer;
import com.github.sho5nn.tasting.mvp.dagger2.di.ArchitectureLayer;

public class DomainLayer implements ArchitectureLayer<DomainComponent> {

  private DomainComponent component;

  public DomainLayer(DataLayer dataLayer) {
    component = dataLayer.getComponent()
      .domainComponentBuilderMap().get(DomainComponent.class)
      .domainModule(new DomainModule())
      .build();
  }

  @Override
  public DomainComponent getComponent() {
    return component;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
  }
}
