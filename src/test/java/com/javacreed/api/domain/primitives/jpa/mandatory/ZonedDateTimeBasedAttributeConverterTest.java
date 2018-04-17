package com.javacreed.api.domain.primitives.jpa.mandatory;

import java.sql.Timestamp;
import java.time.ZonedDateTime;

import org.junit.Assert;
import org.junit.Test;

import com.javacreed.api.domain.primitives.mandatory.ZonedDateTimeBasedDomainPrimitive;

public class ZonedDateTimeBasedAttributeConverterTest {

  public static class TestConverter extends ZonedDateTimeBasedAttributeConverter<TestField> {
    @Override
    protected TestField createDomainPrimitive(final ZonedDateTime dbData) {
      return new TestField(dbData);
    }
  }

  public static class TestField extends ZonedDateTimeBasedDomainPrimitive {
    public TestField(final ZonedDateTime value) throws NullPointerException {
      super(value);
    }
  }

  @Test
  public void test() {
    final long millis = 1511940600000L; /* Wednesday, November 29, 2017 8:30:00 AM GMT+01:00 */
    final TestField field = new TestConverter().convertToEntityAttribute(new Timestamp(millis));
    Assert.assertEquals("2017-11-29 07:30 UTC", field.format("yyyy-MM-dd hh:mm z"));
  }
}
