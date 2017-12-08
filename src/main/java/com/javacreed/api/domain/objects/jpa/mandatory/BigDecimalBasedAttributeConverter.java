package com.javacreed.api.domain.objects.jpa.mandatory;

import java.math.BigDecimal;

import com.javacreed.api.domain.objects.jpa.ObjectBasedAttributeConverter;
import com.javacreed.api.domain.objects.mandatory.BigDecimalBasedDomainObject;

public abstract class BigDecimalBasedAttributeConverter<T extends BigDecimalBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, BigDecimal> {

  @Override
  public BigDecimal convertToDatabaseColumn(final T attribute) {
    return attribute == null ? null : attribute.getValue();
  }

  @Override
  public T convertToEntityAttribute(final BigDecimal dbData) {
    return dbData == null ? null : convertNotNullToEntityAttribute(dbData);
  }
}
