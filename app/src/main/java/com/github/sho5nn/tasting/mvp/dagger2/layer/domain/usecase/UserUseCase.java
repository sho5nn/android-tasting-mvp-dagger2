package com.github.sho5nn.tasting.mvp.dagger2.layer.domain.usecase;

import com.github.sho5nn.tasting.mvp.dagger2.layer.data.repository.user.UserDataRepository;
import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.DomainScope;
import com.github.sho5nn.tasting.mvp.dagger2.layer.domain.SomethingDomainScopeObject;

import javax.inject.Inject;

@DomainScope
public class UserUseCase {

  private SomethingDomainScopeObject domainScopeObject;
  private UserDataRepository userDataRepository;

  @Inject
  public UserUseCase(SomethingDomainScopeObject domainScopeObject, UserDataRepository userDataRepository) {
    this.domainScopeObject = domainScopeObject;
    this.userDataRepository = userDataRepository;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) +
      "\n      - " + domainScopeObject +
      "\n      - " + userDataRepository;
  }
}
