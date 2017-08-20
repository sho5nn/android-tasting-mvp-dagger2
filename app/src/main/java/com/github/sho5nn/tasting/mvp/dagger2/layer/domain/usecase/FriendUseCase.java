package com.github.sho5nn.tasting.mvp.dagger2.layer.domain.usecase;

import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.friend.FriendDataRepository;
import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.DomainScope;
import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.SomethingDomainScopeObject;

import javax.inject.Inject;

@DomainScope
public class FriendUseCase {

  private SomethingDomainScopeObject domainScopeObject;
  private FriendDataRepository friendDataRepository;

  @Inject
  public FriendUseCase(SomethingDomainScopeObject domainScopeObject, FriendDataRepository friendDataRepository) {
    this.domainScopeObject = domainScopeObject;
    this.friendDataRepository = friendDataRepository;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) +
      "\n      - " + domainScopeObject +
      "\n      - " + friendDataRepository;
  }
}
