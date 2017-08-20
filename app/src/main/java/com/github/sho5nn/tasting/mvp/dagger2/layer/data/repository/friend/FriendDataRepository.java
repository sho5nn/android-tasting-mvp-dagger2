package com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.friend;

import com.github.sho5nn.tasting.mvp.dagger2.layer.application.SomethingApplicationScopeObject;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.DataScope;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.SomethingDataScopeObject;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.Local;
import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.Remote;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

@DataScope
public class FriendDataRepository implements FriendDataSource {

  private FriendDataSource remoteSource;
  private FriendDataSource localSource;

  private SomethingApplicationScopeObject applicationScopeObject;
  private SomethingDataScopeObject dataScopeObject;

  @Inject
  public FriendDataRepository(@Remote FriendDataSource remoteSource,
                              @Local FriendDataSource localSource,
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
  public Single<List<FriendEntity>> getFriend() {
    return null;
  }
}