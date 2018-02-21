package com.javacreed.api.domain.primitives.jpa.optional;

import com.javacreed.api.domain.primitives.optional.CharacterBasedDomainPrimitive;

public abstract class CharacterBasedAttributeConverter<T extends CharacterBasedDomainPrimitive>
    extends ObjectBasedAttributeConverter<T, Character> {}
