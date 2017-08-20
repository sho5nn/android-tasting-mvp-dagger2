package com.github.sho5nn.tasting.mvp.dagger2.layer.data;

import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.DomainComponent;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module(subcomponents = DomainComponent.class)
public abstract class DomainComponentBuilderModule {

  @DataScope
  @Binds
  @IntoMap
  @DomainComponentBuilderMapKey(DomainComponent.class)
  public abstract DomainComponent.Builder domainComponentBuilder(DomainComponent.Builder builder);
}
