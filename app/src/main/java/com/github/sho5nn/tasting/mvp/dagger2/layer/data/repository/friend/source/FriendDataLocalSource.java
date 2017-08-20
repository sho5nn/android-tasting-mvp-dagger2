package com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.friend.source;

import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.friend.FriendDataSource;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.friend.FriendEntity;

import java.util.List;

import io.reactivex.Single;

public class FriendDataLocalSource implements FriendDataSource {

  @Override
  public Single<List<FriendEntity>> getFriend() {
    return null;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
  }
}
