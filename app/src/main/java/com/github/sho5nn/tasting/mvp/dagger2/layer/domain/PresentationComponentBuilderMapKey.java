package com.github.sho5nn.tasting.mvp.dagger2.layer.domain;

import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.PresentationComponent;

import dagger.MapKey;

@MapKey
public @interface PresentationComponentBuilderMapKey {
  Class<PresentationComponent> value();
}
