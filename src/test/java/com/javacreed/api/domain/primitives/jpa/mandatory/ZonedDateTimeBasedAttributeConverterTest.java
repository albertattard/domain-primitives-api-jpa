package com.javacreed.api.domain.primitives.jpa.mandatory;

import java.sql.Timestamp;
import java.time.ZoneId;
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
    final long millis = 1511940600000L; /* 29th November 2017 7:30am GMT (UTC/+0000) */
    final TestConverter converter = new TestConverter();

    /* All dates/times are read in GMT/UTC timezone */
    final TestField read = converter.convertToEntityAttribute(new Timestamp(millis));
    Assert.assertEquals("2017-11-29 07:30 +0000", read.format("yyyy-MM-dd hh:mm Z"));

    /* All dates/times need to be converted to GMT/UTC before written into the database */
    final ZoneId zone = ZoneId.of("Europe/Malta");
    final TestField write = new TestField(ZonedDateTime.of(2017, 11, 29, 8, 30, 0, 0, zone));
    Assert.assertEquals(new Timestamp(millis), converter.convertToDatabaseColumn(write));
  }
}
