package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation;

import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view.ViewComponent;

import dagger.MapKey;

@MapKey
public @interface ViewComponentBuilderMapKey {
  Class<? extends ViewComponent> value();
}
