package com.javacreed.api.domain.primitives.jpa.optional;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Converter;

import com.javacreed.api.domain.primitives.optional.LocalDateTimeBasedDomainObject;

@Converter(autoApply = true)
public abstract class LocalDateTimeBasedAttributeConverter<T extends LocalDateTimeBasedDomainObject>
    extends MismatchedObjectBasedAttributeConverter<LocalDateTime, T, Timestamp> {

  @Override
  protected Timestamp convertNotNullToDatabaseColumn(final T value) {
    return value.toTimestamp().orElse(null);
  }

  @Override
  protected LocalDateTime convertNotNullToValue(final Timestamp dbData) {
    return dbData.toLocalDateTime();
  }
}
