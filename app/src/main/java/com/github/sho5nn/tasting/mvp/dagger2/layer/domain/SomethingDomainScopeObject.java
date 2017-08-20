package com.github.sho5nn.tasting.mvp.dagger2.layer.domain;

import javax.inject.Inject;

@DomainScope
public class SomethingDomainScopeObject {

  @Inject
  public SomethingDomainScopeObject() {
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
  }
}
