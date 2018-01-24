package com.javacreed.api.domain.primitives.jpa.optional;

import java.math.BigDecimal;

import com.javacreed.api.domain.primitives.optional.BigDecimalBasedDomainObject;

public abstract class BigDecimalBasedAttributeConverter<T extends BigDecimalBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, BigDecimal> {}
