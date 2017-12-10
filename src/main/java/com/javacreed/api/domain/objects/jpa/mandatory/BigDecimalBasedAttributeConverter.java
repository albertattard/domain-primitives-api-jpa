package com.javacreed.api.domain.objects.jpa.mandatory;

import java.math.BigDecimal;

import com.javacreed.api.domain.objects.jpa.ObjectBasedAttributeConverter;
import com.javacreed.api.domain.objects.mandatory.BigDecimalBasedDomainObject;

public abstract class BigDecimalBasedAttributeConverter<T extends BigDecimalBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, BigDecimal> {

  @Override
  protected BigDecimal convertNotNullToDatabaseColumn(final T attribute) {
    return attribute.getValue();
  }
}
