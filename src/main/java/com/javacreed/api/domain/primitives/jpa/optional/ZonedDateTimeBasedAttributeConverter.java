package com.javacreed.api.domain.primitives.jpa.optional;

import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.persistence.Converter;

import com.javacreed.api.domain.primitives.optional.ZonedDateTimeBasedDomainPrimitive;

@Converter(autoApply = true)
public abstract class ZonedDateTimeBasedAttributeConverter<T extends ZonedDateTimeBasedDomainPrimitive>
    extends MismatchedObjectBasedAttributeConverter<ZonedDateTime, T, Timestamp> {

  private static final ZoneId UTC_ZONE_ID = ZoneId.of("UTC");

  @Override
  protected Timestamp convertNotNullToDatabaseColumn(final T value) {
    return value.toUtcSqlTimestamp().orElse(null);
  }

  @Override
  protected ZonedDateTime convertNotNullToValue(final Timestamp dbData) {
    return dbData.toLocalDateTime().atZone(ZonedDateTimeBasedAttributeConverter.UTC_ZONE_ID);
  }
}
