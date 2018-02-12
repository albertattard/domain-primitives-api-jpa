package com.javacreed.api.domain.primitives.jpa.optional;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Converter;

import com.javacreed.api.domain.primitives.optional.LocalDateTimeBasedDomainPrimitive;

@Converter(autoApply = true)
public abstract class LocalDateTimeBasedAttributeConverter<T extends LocalDateTimeBasedDomainPrimitive>
    extends MismatchedObjectBasedAttributeConverter<LocalDateTime, T, Timestamp> {

  @Override
  protected Timestamp convertNotNullToDatabaseColumn(final T value) {
    return value.toSqlTimestamp().orElse(null);
  }

  @Override
  protected LocalDateTime convertNotNullToValue(final Timestamp dbData) {
    return dbData.toLocalDateTime();
  }
}
