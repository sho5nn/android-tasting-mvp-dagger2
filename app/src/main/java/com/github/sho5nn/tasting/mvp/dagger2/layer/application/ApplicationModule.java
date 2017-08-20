package com.github.sho5nn.tasting.mvp.dagger2.layer.application;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

  private Application application;

  public ApplicationModule(Application application) {
    this.application = application;
  }

  @ApplicationScope
  @Provides
  Context provideApplicationContext() {
    return application.getApplicationContext();
  }
}
