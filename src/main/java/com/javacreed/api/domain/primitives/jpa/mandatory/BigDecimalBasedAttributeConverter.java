package com.javacreed.api.domain.primitives.jpa.mandatory;

import java.math.BigDecimal;

import com.javacreed.api.domain.primitives.mandatory.BigDecimalBasedDomainObject;

public abstract class BigDecimalBasedAttributeConverter<T extends BigDecimalBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, BigDecimal> {}
