package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation;

import com.github.sho5nn.tasting.mvp.dagger2.di.ISubcomponent;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.ViewComponent;

import java.util.Map;

import dagger.Subcomponent;

@PresentationScope
@Subcomponent(modules = {PresentationModule.class, ViewComponentBuilderModule.class})
public interface PresentationComponent extends ISubcomponent {

  @Subcomponent.Builder
  interface Builder extends ISubcomponent.Builder<PresentationComponent> {
    Builder presentationModule(PresentationModule module);
  }

  Map<Class<? extends ViewComponent>, ViewComponent.Builder> viewComponentBuilderMap();
}
