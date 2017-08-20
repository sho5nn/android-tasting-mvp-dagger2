package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view;

import dagger.Module;
import dagger.Provides;

@Module
public class ViewModule {

  @ViewScope
  @Provides
  SomethingViewScopeObject provideSomethingViewScopeObject() {
    return new SomethingViewScopeObject();
  }
}
