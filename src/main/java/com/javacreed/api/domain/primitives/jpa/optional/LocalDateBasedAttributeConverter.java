package com.javacreed.api.domain.primitives.jpa.optional;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Converter;

import com.javacreed.api.domain.primitives.optional.LocalDateBasedDomainPrimitive;

@Converter(autoApply = true)
public abstract class LocalDateBasedAttributeConverter<T extends LocalDateBasedDomainPrimitive>
    extends MismatchedObjectBasedAttributeConverter<LocalDate, T, Date> {

  @Override
  protected Date convertNotNullToDatabaseColumn(final T value) {
    return value.toSqlDate().orElse(null);
  }

  @Override
  protected LocalDate convertNotNullToValue(final Date dbData) {
    return dbData.toLocalDate();
  }
}
