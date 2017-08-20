package com.github.sho5nn.tasting.mvp.dagger2.layer.application;

import android.app.Application;

import com.github.sho5nn.tasting.mvp.dagger2.layer.data.DataLayer;
import com.github.sho5nn.tasting.mvp.dagger2.di.ArchitectureLayer;
import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.DomainLayer;
import com.github.sho5nn.tasting.mvp.dagger2.layer.presentation.PresentationLayer;

import javax.inject.Inject;

import timber.log.Timber;

public class ApplicationLayer extends Application implements ArchitectureLayer<ApplicationComponent> {

  private ApplicationComponent applicationComponent;

  @Inject
  DataLayer dataLayer;
  @Inject
  DomainLayer domainLayer;
  @Inject
  PresentationLayer presentationLayer;

  @Override
  public void onCreate() {
    super.onCreate();
    Timber.plant(new Timber.DebugTree());

    applicationComponent = DaggerApplicationComponent
      .builder()
      .architectureLayerModule(new ArchitectureLayerModule(this))
      .applicationModule(new ApplicationModule(this))
      .build();
    applicationComponent.inject(this);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) +
      "\n  - " + dataLayer +
      "\n  - " + domainLayer +
      "\n  - " + presentationLayer;
  }

  @Override
  public ApplicationComponent getComponent() {
    return applicationComponent;
  }

  public DataLayer getDataLayer() {
    return dataLayer;
  }

  public DomainLayer getDomainLayer() {
    return domainLayer;
  }

  public PresentationLayer getPresentationLayer() {
    return presentationLayer;
  }
}
