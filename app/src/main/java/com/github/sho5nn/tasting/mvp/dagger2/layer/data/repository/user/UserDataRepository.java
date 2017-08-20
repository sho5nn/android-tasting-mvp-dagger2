package com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.user;

import com.github.sho5nn.tasting.mvp.dagger2.layer.application.SomethingApplicationScopeObject;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.DataScope;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.SomethingDataScopeObject;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.Local;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.Remote;

import javax.inject.Inject;

import io.reactivex.Single;

@DataScope
public class UserDataRepository implements UserDataSource {

  private UserDataSource remoteSource;
  private UserDataSource localSource;

  private SomethingApplicationScopeObject applicationScopeObject;
  private SomethingDataScopeObject dataScopeObject;

  @Inject
  public UserDataRepository(@Remote UserDataSource remoteSource,
                            @Local UserDataSource localSource,
                            SomethingApplicationScopeObject applicationScopeObject,
                            SomethingDataScopeObject dataScopeObject) {
    this.remoteSource = remoteSource;
    this.localSource = localSource;
    this.applicationScopeObject = applicationScopeObject;
    this.dataScopeObject = dataScopeObject;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) +
      "\n        - " + remoteSource +
      "\n        - " + localSource +
      "\n        - " + dataScopeObject +
      "\n        - " + applicationScopeObject;
  }

  @Override
  public Single<UserEntity> getUser() {
    return null;
  }

  @Override
  public Single<UserEntity> saveUser(UserEntity entity) {
    return null;
  }
}
