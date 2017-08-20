package com.github.sho5nn.tasting.mvp.dagger2.layer.application;

import com.github.sho5nn.tasting.mvp.dagger2.layer.data.DataLayer;
import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.DomainLayer;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.PresentationLayer;

import dagger.Module;
import dagger.Provides;

@Module
public class ArchitectureLayerModule {

  private ApplicationLayer applicationLayer;

  public ArchitectureLayerModule(ApplicationLayer applicationLayer) {
    this.applicationLayer = applicationLayer;
  }

  @ApplicationScope
  @Provides
  ApplicationLayer provideApplicationLayer() {
    return applicationLayer;
  }

  @ApplicationScope
  @Provides
  DataLayer provideDataLayer() {
    return new DataLayer(applicationLayer);
  }

  @ApplicationScope
  @Provides
  DomainLayer provideDomainLayer(DataLayer dataLayer) {
    return new DomainLayer(dataLayer);
  }

  @ApplicationScope
  @Provides
  PresentationLayer providePresentationLayer(DomainLayer domainLayer) {
    return new PresentationLayer(domainLayer);
  }
}
