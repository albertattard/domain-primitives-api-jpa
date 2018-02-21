package com.javacreed.api.domain.primitives.jpa.optional;

import com.javacreed.api.domain.primitives.optional.DoubleBasedDomainPrimitive;

public abstract class DoubleBasedAttributeConverter<T extends DoubleBasedDomainPrimitive>
    extends ObjectBasedAttributeConverter<T, Double> {}
