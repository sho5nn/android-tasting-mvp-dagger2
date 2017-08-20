package com.github.sho5nn.tasting.mvp.dagger2.layer.domain;

public class SomethingDomainScopeObject {

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
  }
}
