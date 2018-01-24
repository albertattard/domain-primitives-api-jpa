package com.javacreed.api.domain.objects.jpa.mandatory;

import com.javacreed.api.domain.objects.mandatory.StringBasedDomainObject;

public abstract class StringBasedAttributeConverter<T extends StringBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, String> {}
