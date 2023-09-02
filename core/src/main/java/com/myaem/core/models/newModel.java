package com.myaem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;


@Model (adaptables =Resource.class)
public class newModel {

    @ValueMapValue
    private String text;



    public String getText() {
        return text;
    }


}