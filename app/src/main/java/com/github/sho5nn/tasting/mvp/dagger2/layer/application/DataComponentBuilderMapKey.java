package com.github.sho5nn.tasting.mvp.dagger2.layer.application;

import com.github.sho5nn.tasting.mvp.dagger2.layer.data.DataComponent;

import dagger.MapKey;

@MapKey
public @interface DataComponentBuilderMapKey {
  Class<DataComponent> value();
}
