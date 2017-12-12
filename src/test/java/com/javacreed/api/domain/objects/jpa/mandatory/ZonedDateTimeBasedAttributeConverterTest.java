package com.javacreed.api.domain.objects.jpa.mandatory;

import java.sql.Timestamp;
import java.time.ZonedDateTime;

import org.junit.Assert;
import org.junit.Test;

import com.javacreed.api.domain.objects.mandatory.ZonedDateTimeBasedDomainObject;

public class ZonedDateTimeBasedAttributeConverterTest {

  public static class TestConverter extends ZonedDateTimeBasedAttributeConverter<TestField> {
    @Override
    protected Timestamp convertNotNullToDatabaseColumn(final TestField attribute) {
      throw new UnsupportedOperationException();
    }

    @Override
    protected TestField convertNotNullToEntityAttribute(final ZonedDateTime zonedDateTime) {
      return new TestField(zonedDateTime);
    }
  }

  public static class TestField extends ZonedDateTimeBasedDomainObject {
    public TestField(final ZonedDateTime value) throws NullPointerException {
      super(value);
    }
  }

  @Test
  public void test() {
    final long millis = 1511940600000L; /* 29th November 2017 8:30am */
    final TestField field = new TestConverter().convertNotNullToEntityAttribute(new Timestamp(millis));
    Assert.assertEquals("2017-11-29 08:30 UTC", field.format("yyyy-MM-dd hh:mm z"));
  }
}
