package com.javacreed.api.domain.primitives.jpa.mandatory;

import java.math.BigDecimal;

import com.javacreed.api.domain.primitives.mandatory.BigDecimalBasedDomainPrimitive;

public abstract class BigDecimalBasedAttributeConverter<T extends BigDecimalBasedDomainPrimitive>
    extends ObjectBasedAttributeConverter<T, BigDecimal> {}
