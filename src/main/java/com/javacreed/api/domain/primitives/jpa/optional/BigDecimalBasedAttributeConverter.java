package com.javacreed.api.domain.primitives.jpa.optional;

import java.math.BigDecimal;

import com.javacreed.api.domain.primitives.optional.BigDecimalBasedDomainPrimitive;

public abstract class BigDecimalBasedAttributeConverter<T extends BigDecimalBasedDomainPrimitive>
    extends ObjectBasedAttributeConverter<T, BigDecimal> {}
