package com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.friend;

import java.util.List;

import io.reactivex.Single;

public interface FriendDataSource {

  Single<List<FriendEntity>> getFriend();
}
