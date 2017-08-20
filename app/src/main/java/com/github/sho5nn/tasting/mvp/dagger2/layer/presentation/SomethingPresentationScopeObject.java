package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation;

import javax.inject.Inject;

@PresentationScope
public class SomethingPresentationScopeObject {

  @Inject
  public SomethingPresentationScopeObject() {
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
  }
}
