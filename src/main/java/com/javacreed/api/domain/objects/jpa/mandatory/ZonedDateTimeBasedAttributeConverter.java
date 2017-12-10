package com.javacreed.api.domain.objects.jpa.mandatory;

import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.persistence.Converter;

import com.javacreed.api.domain.objects.jpa.ObjectBasedAttributeConverter;
import com.javacreed.api.domain.objects.mandatory.ZonedDateTimeBasedDomainObject;

@Converter(autoApply = true)
public abstract class ZonedDateTimeBasedAttributeConverter<T extends ZonedDateTimeBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, Timestamp> {

  @Override
  protected Timestamp convertNotNullToDatabaseColumn(final T attribute) {
    return Timestamp.valueOf(attribute.toLocalDateTime());
  }

  @Override
  protected T convertNotNullToEntityAttribute(final Timestamp dbData) {
    return convertNotNullToEntityAttribute(dbData.toLocalDateTime().atZone(ZoneId.systemDefault()));
  }

  protected abstract T convertNotNullToEntityAttribute(final ZonedDateTime dbData);
}
