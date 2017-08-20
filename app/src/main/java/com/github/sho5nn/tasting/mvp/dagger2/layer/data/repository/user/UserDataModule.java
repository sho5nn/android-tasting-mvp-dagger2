package com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.user;

import com.github.sho5nn.tasting.mvp.dagger2.layer.data.DataScope;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.Local;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.Remote;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.user.source.UserDataLocalSource;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.user.source.UserDataRemoteSource;

import dagger.Module;
import dagger.Provides;

@Module
public class UserDataModule {

  @Local
  @DataScope
  @Provides
  UserDataSource provideUserDataLocalSource() {
    return new UserDataLocalSource();
  }

  @Remote
  @DataScope
  @Provides
  UserDataSource provideUserDataRemoteSource() {
    return new UserDataRemoteSource();
  }
}
