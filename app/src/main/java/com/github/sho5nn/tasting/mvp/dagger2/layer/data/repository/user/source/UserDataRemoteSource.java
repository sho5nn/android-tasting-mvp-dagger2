package com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.user.source;

import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.user.UserDataSource;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.user.UserEntity;

import io.reactivex.Single;

public class UserDataRemoteSource implements UserDataSource {

  @Override
  public Single<UserEntity> getUser() {
    return null;
  }

  @Override
  public Single<UserEntity> saveUser(UserEntity entity) {
    return null;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
  }
}
