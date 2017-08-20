package com.github.sho5nn.tasting.mvp.dagger2.layer.domain;

import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.PresentationComponent;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module(subcomponents = PresentationComponent.class)
public abstract class PresentationComponentBuilderModule {

  @DomainScope
  @Binds
  @IntoMap
  @PresentationComponentBuilderMapKey(PresentationComponent.class)
  public abstract PresentationComponent.Builder presentationComponentBuilder(PresentationComponent.Builder builder);
}
