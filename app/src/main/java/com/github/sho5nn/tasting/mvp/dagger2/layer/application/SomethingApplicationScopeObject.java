package com.github.sho5nn.tasting.mvp.dagger2.layer.application;

import javax.inject.Inject;

@ApplicationScope
public class SomethingApplicationScopeObject {

  @Inject
  public SomethingApplicationScopeObject() {
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
  }
}
