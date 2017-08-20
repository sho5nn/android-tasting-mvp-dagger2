package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation;

import dagger.Module;
import dagger.Provides;

@Module
public class PresentationModule {

  @PresentationScope
  @Provides
  SomethingPresentationScopeObject provideSomethingPresentationScopeObject() {
    return new SomethingPresentationScopeObject();
  }
}
