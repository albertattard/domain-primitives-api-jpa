package com.javacreed.api.domain.primitives.jpa.optional;

import java.sql.Time;
import java.time.LocalTime;

import javax.persistence.Converter;

import com.javacreed.api.domain.primitives.optional.LocalTimeBasedDomainPrimitive;

@Converter(autoApply = true)
public abstract class LocalTimeBasedAttributeConverter<T extends LocalTimeBasedDomainPrimitive>
    extends MismatchedObjectBasedAttributeConverter<LocalTime, T, Time> {

  @Override
  protected Time convertNotNullToDatabaseColumn(final T value) {
    return value.toSqlTime().orElse(null);
  }

  @Override
  protected LocalTime convertNotNullToValue(final Time dbData) {
    return dbData.toLocalTime();
  }
}
