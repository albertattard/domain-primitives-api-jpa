package com.javacreed.api.domain.primitives.jpa.optional;

import com.javacreed.api.domain.primitives.optional.IntegerBasedDomainPrimitive;

public abstract class IntegerBasedAttributeConverter<T extends IntegerBasedDomainPrimitive>
    extends ObjectBasedAttributeConverter<T, Integer> {}
