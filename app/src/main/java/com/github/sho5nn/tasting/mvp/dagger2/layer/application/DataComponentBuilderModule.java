package com.github.sho5nn.tasting.mvp.dagger2.layer.application;

import com.github.sho5nn.tasting.mvp.dagger2.layer.data.DataComponent;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module(subcomponents = DataComponent.class)
public abstract class DataComponentBuilderModule {

  @ApplicationScope
  @Binds
  @IntoMap
  @DataComponentBuilderMapKey(DataComponent.class)
  public abstract DataComponent.Builder dataComponentBuilder(DataComponent.Builder builder);
}
