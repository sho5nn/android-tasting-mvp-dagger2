package com.github.sho5nn.tasting.mvp.dagger2.layer.domain;

import com.github.sho5nn.tasting.mvp.dagger2.di.ISubcomponent;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.PresentationComponent;

import java.util.Map;

import dagger.Subcomponent;

@DomainScope
@Subcomponent(modules = {PresentationComponentBuilderModule.class})
public interface DomainComponent extends ISubcomponent {

  @Subcomponent.Builder
  interface Builder extends ISubcomponent.Builder<DomainComponent> {
  }

  Map<Class<PresentationComponent>, PresentationComponent.Builder> presentationComponentBuilderMap();
}
