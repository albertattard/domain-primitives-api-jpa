package com.javacreed.api.domain.objects.jpa.mandatory;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Converter;

import com.javacreed.api.domain.objects.mandatory.LocalDateTimeBasedDomainObject;

@Converter(autoApply = true)
public abstract class LocalDateTimeBasedAttributeConverter<T extends LocalDateTimeBasedDomainObject>
    extends MismatchedObjectBasedAttributeConverter<LocalDateTime, T, Timestamp> {

  @Override
  protected Timestamp convertNotNullToDatabaseColumn(final T attribute) {
    return attribute.map(Timestamp::valueOf);
  }

  @Override
  protected LocalDateTime convertNotNullToValue(final Timestamp dbData) {
    return dbData.toLocalDateTime();
  }
}
