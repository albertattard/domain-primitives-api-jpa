package com.javacreed.api.domain.objects.jpa.mandatory;

import java.math.BigDecimal;

import com.javacreed.api.domain.objects.mandatory.BigDecimalBasedDomainObject;

public abstract class BigDecimalBasedAttributeConverter<T extends BigDecimalBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, BigDecimal> {}
