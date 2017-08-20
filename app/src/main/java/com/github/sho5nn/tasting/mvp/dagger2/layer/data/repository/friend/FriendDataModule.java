package com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.friend;

import com.github.sho5nn.tasting.mvp.dagger2.layer.data.DataScope;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.Local;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.Remote;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.friend.source.FriendDataLocalSource;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.friend.source.FriendDataRemoteSource;

import dagger.Module;
import dagger.Provides;

@Module
public class FriendDataModule {

  @Local
  @DataScope
  @Provides
  FriendDataSource provideFriendDataLocalSource() {
    return new FriendDataLocalSource();
  }

  @Remote
  @DataScope
  @Provides
  FriendDataSource provideFriendDataRemoteSource() {
    return new FriendDataRemoteSource();
  }
}
