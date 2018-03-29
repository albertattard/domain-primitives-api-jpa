package com.javacreed.api.domain.primitives.jpa.mandatory;

import java.sql.Time;
import java.time.LocalTime;

import javax.persistence.Converter;

import com.javacreed.api.domain.primitives.mandatory.LocalTimeBasedDomainPrimitive;

@Converter(autoApply = true)
public abstract class LocalTimeBasedAttributeConverter<T extends LocalTimeBasedDomainPrimitive>
    extends MismatchedObjectBasedAttributeConverter<LocalTime, T, Time> {

  @Override
  protected Time convertNotNullToDatabaseColumn(final T attribute) {
    return attribute.toSqlTime();
  }

  @Override
  protected LocalTime convertNotNullToValue(final Time dbData) {
    return dbData.toLocalTime();
  }
}
