package com.github.sho5nn.tasting.mvp.dagger2.layer.domain.model;

import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.friend.FriendEntity;

public class Friend {

  private FriendEntity entity;

  public Friend(FriendEntity entity) {
    this.entity = entity;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
  }
}
