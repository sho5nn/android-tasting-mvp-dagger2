package com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.view;

import com.github.sho5nn.tasting.mvp.dagger2.di.ISubcomponent;

public interface ViewComponent extends ISubcomponent {

  interface Builder<T extends ViewComponent> {
    T build();
  }
}
