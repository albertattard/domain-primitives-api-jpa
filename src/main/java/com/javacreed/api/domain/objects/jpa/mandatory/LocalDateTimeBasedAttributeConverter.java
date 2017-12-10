package com.javacreed.api.domain.objects.jpa.mandatory;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Converter;

import com.javacreed.api.domain.objects.jpa.ObjectBasedAttributeConverter;
import com.javacreed.api.domain.objects.mandatory.LocalDateTimeBasedDomainObject;

@Converter(autoApply = true)
public abstract class LocalDateTimeBasedAttributeConverter<T extends LocalDateTimeBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, Timestamp> {

  @Override
  protected Timestamp convertNotNullToDatabaseColumn(final T attribute) {
    return attribute.map(Timestamp::valueOf);
  }

  protected abstract T convertNotNullToEntityAttribute(final LocalDateTime dbData);

  @Override
  protected T convertNotNullToEntityAttribute(final Timestamp dbData) {
    return convertNotNullToEntityAttribute(dbData.toLocalDateTime());
  }
}
