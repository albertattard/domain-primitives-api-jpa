package com.javacreed.api.domain.objects.jpa.optional;

import java.math.BigDecimal;

import com.javacreed.api.domain.objects.jpa.ObjectBasedAttributeConverter;
import com.javacreed.api.domain.objects.optional.BigDecimalBasedDomainObject;

public abstract class BigDecimalBasedAttributeConverter<T extends BigDecimalBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, BigDecimal> {

  @Override
  protected BigDecimal convertNotNullToDatabaseColumn(final T attribute) {
    return attribute.getValue().orElse(null);
  }
}