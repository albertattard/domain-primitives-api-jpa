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
  protected Timestamp convertNotNullToDatabaseColumn(final T attribute) {
    return attribute.toLocalDateTime().map(Timestamp::valueOf).orElse(null);
  }

  @Override
  protected T convertNotNullToEntityAttribute(final Timestamp dbData) {
    return convertNotNullToEntityAttribute(dbData.toLocalDateTime().atZone(ZoneId.systemDefault()));
  }

  protected abstract T convertNotNullToEntityAttribute(final ZonedDateTime dbData);
}
