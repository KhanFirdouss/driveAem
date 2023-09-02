package com.myaem.core.services.impl;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(
        name="demourl",description = "this is description"
)

public @interface fk {
    @AttributeDefinition(name="demourl",description="this is description",type = AttributeType.STRING )
    String getName();
}
