package com.github.sho5nn.tasting.mvp.dagger2.layer.application;

import com.github.sho5nn.tasting.mvp.dagger2.layer.data.DataComponent;
import com.github.sho5nn.tasting.mvp.dagger2.di.IComponent;

import java.util.Map;

import dagger.Component;

@ApplicationScope
@Component(modules = {ApplicationModule.class, ArchitectureLayerModule.class, DataComponentBuilderModule.class})
public interface ApplicationComponent extends IComponent {

  @Component.Builder
  interface Builder extends IComponent.Builder<ApplicationComponent> {
    Builder architectureLayerModule(ArchitectureLayerModule module);
    Builder applicationModule(ApplicationModule module);
  }

  Map<Class<DataComponent>, DataComponent.Builder> dataComponentBuilderMap();

  void inject(ApplicationLayer application);
}
