package com.javacreed.api.domain.primitives.jpa.mandatory;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Converter;

import com.javacreed.api.domain.primitives.mandatory.LocalDateTimeBasedDomainPrimitive;

@Converter(autoApply = true)
public abstract class LocalDateTimeBasedAttributeConverter<T extends LocalDateTimeBasedDomainPrimitive>
    extends MismatchedObjectBasedAttributeConverter<LocalDateTime, T, Timestamp> {

  @Override
  protected Timestamp convertNotNullToDatabaseColumn(final T attribute) {
    return attribute.asSqlTimestamp();
  }

  @Override
  protected LocalDateTime convertNotNullToValue(final Timestamp dbData) {
    return dbData.toLocalDateTime();
  }
}
