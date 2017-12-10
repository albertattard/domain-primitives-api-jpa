package com.javacreed.api.domain.objects.jpa.optional;

import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.persistence.Converter;

import com.javacreed.api.domain.objects.jpa.ObjectBasedAttributeConverter;
import com.javacreed.api.domain.objects.optional.ZonedDateTimeBasedDomainObject;

@Converter(autoApply = true)
public abstract class ZonedDateTimeBasedAttributeConverter<T extends ZonedDateTimeBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, Timestamp> {

  @Override
  protected T convertNotNullToEntityAttribute(final Timestamp sqlTimestamp) {
    return convertNotNullToEntityAttribute(sqlTimestamp.toLocalDateTime().atZone(ZoneId.systemDefault()));
  }

  protected T convertNotNullToEntityAttribute(final ZonedDateTime zonedDateTime) {
    throw new UnsupportedOperationException();
  }
}
