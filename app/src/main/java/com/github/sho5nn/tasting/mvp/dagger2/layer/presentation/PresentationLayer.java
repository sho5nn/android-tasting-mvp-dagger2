package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation;

import com.github.sho5nn.tasting.mvp.dagger2.di.ArchitectureLayer;
import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.DomainLayer;

public class PresentationLayer implements ArchitectureLayer<PresentationComponent> {

  private PresentationComponent component;

  public PresentationLayer(DomainLayer layer) {
    component = layer.getComponent()
      .presentationComponentBuilderMap().get(PresentationComponent.class)
      .presentationModule(new PresentationModule())
      .build();
  }

  @Override
  public PresentationComponent getComponent() {
    return component;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
  }
}
