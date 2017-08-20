package com.github.sho5nn.tasting.mvp.dagger2.di;

public interface IComponent {

  interface Builder<T extends IComponent> {
    T build();
  }
}
