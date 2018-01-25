package com.javacreed.api.domain.primitives.jpa.mandatory;

import com.javacreed.api.domain.primitives.mandatory.StringBasedDomainPrimitive;

public abstract class StringBasedAttributeConverter<T extends StringBasedDomainPrimitive>
    extends ObjectBasedAttributeConverter<T, String> {}
