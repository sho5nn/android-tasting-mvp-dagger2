package com.github.sho5nn.tasting.mvp.dagger2.di;

public interface ArchitectureLayer<T extends IComponent> {
  T getComponent();
}
