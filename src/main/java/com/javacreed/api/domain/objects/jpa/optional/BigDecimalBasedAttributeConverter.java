package com.javacreed.api.domain.objects.jpa.optional;

import java.math.BigDecimal;

import com.javacreed.api.domain.objects.jpa.ObjectBasedAttributeConverter;
import com.javacreed.api.domain.objects.optional.BigDecimalBasedDomainObject;

public abstract class BigDecimalBasedAttributeConverter<T extends BigDecimalBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, BigDecimal> {

  @Override
  public BigDecimal convertToDatabaseColumn(final T attribute) {
    return attribute == null ? null : attribute.getValue().orElse(null);
  }

  @Override
  public T convertToEntityAttribute(final BigDecimal dbData) {
    return dbData == null ? null : convertNotNullToEntityAttribute(dbData);
  }
}
