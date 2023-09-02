package com.myaem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy= DefaultInjectionStrategy.OPTIONAL)
public class MyHeading {
    @ValueMapValue
    @Default(values = "Sample blog post")
    private String heading;
    public String getHeading() {
        return heading;}
    @ValueMapValue
    @Default(values = "January 1, 2014")
    private String datepicker;
    public String getDatepicker() {
        return datepicker;}

    @ValueMapValue
    private String writer;
    public String getWriter() {
        return writer;}

}
