package com.github.sho5nn.tasting.mvp.dagger2.layer.data;

import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.DomainComponent;

import dagger.MapKey;

@MapKey
public @interface DomainComponentBuilderMapKey {
  Class<DomainComponent> value();
}
