package com.javacreed.api.domain.objects.jpa.mandatory;

import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.persistence.Converter;

import com.javacreed.api.domain.objects.mandatory.ZonedDateTimeBasedDomainObject;

@Converter(autoApply = true)
public abstract class ZonedDateTimeBasedAttributeConverter<T extends ZonedDateTimeBasedDomainObject>
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
