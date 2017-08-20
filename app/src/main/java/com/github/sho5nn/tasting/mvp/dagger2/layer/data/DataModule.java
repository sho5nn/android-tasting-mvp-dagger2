package com.github.sho5nn.tasting.mvp.dagger2.layer.data;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

  @DataScope
  @Provides
  SomethingDataScopeObject provideSomethingDataScopeObject() {
    return new SomethingDataScopeObject();
  }
}
