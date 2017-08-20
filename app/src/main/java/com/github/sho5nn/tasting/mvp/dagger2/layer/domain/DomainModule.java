package com.github.sho5nn.tasting.mvp.dagger2.layer.domain;

import dagger.Module;
import dagger.Provides;

@Module
public class DomainModule {

  @DomainScope
  @Provides
  SomethingDomainScopeObject provideSomethingDomainScopeObject() {
    return new SomethingDomainScopeObject();
  }
}
