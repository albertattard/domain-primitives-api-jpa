package com.javacreed.api.domain.primitives.jpa.optional;

import com.javacreed.api.domain.primitives.optional.ByteBasedDomainPrimitive;

public abstract class ByteBasedAttributeConverter<T extends ByteBasedDomainPrimitive>
    extends ObjectBasedAttributeConverter<T, Byte> {}
