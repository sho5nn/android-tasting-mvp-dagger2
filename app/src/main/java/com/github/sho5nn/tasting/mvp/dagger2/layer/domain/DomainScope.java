package com.github.sho5nn.tasting.mvp.dagger2.layer.domain;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Scope
@Retention(RUNTIME)
public @interface DomainScope {
}
