package com.myaem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;




@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TestComponentModel {


    @ValueMapValue
    private String text;
    String s = " -This is my text to this component  ";

    @ValueMapValue
    private String datepicker;
    @ValueMapValue
    private String image;


    public String getText() {
        return text + s ;
    }
    public String getImage(){
        return image;
    }



    public String getDatepicker()

    {
        return datepicker;
    }
}

