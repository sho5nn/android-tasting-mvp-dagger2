package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view;

import javax.inject.Inject;

@ViewScope
public class SomethingViewScopeObject {

  @Inject
  public SomethingViewScopeObject() {
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
  }
}
