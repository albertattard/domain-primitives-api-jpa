package com.javacreed.api.domain.primitives.jpa.mandatory;

import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.persistence.Converter;

import com.javacreed.api.domain.primitives.mandatory.ZonedDateTimeBasedDomainPrimitive;

@Converter(autoApply = true)
public abstract class ZonedDateTimeBasedAttributeConverter<T extends ZonedDateTimeBasedDomainPrimitive>
    extends MismatchedObjectBasedAttributeConverter<ZonedDateTime, T, Timestamp> {

  @Override
  protected Timestamp convertNotNullToDatabaseColumn(final T attribute) {
    return attribute.toUtcTimestamp();
  }

  @Override
  protected ZonedDateTime convertNotNullToValue(final Timestamp dbData) {
    return dbData.toLocalDateTime().atZone(ZoneId.of("UTC"));
  }
}
