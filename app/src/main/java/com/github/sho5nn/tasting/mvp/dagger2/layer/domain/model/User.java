package com.github.sho5nn.tasting.mvp.dagger2.layer.domain.model;

import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.user.UserEntity;

public class User {

  private UserEntity entiy;

  public User(UserEntity entiy) {
    this.entiy = entiy;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
  }
}
