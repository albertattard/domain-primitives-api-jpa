package com.javacreed.api.domain.primitives.jpa.mandatory;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Converter;

import com.javacreed.api.domain.primitives.mandatory.LocalDateBasedDomainPrimitive;

@Converter(autoApply = true)
public abstract class LocalDateBasedAttributeConverter<T extends LocalDateBasedDomainPrimitive>
    extends MismatchedObjectBasedAttributeConverter<LocalDate, T, Date> {

  @Override
  protected Date convertNotNullToDatabaseColumn(final T attribute) {
    return attribute.toSqlDate();
  }

  @Override
  protected LocalDate convertNotNullToValue(final Date dbData) {
    return dbData.toLocalDate();
  }
}
