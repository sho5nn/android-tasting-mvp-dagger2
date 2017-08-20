package com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.user;

import io.reactivex.Single;

public interface UserDataSource {

  Single<UserEntity> getUser();

  Single<UserEntity> saveUser(UserEntity entity);
}
