package com.github.sho5nn.tasting.mvp.dagger2.layer.data;

import javax.inject.Inject;

@DataScope
public class SomethingDataScopeObject {

  @Inject
  public SomethingDataScopeObject() {
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
  }
}
