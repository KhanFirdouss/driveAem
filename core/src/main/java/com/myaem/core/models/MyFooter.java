package com.myaem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
@Model(adaptables = Resource.class,defaultInjectionStrategy= DefaultInjectionStrategy.OPTIONAL)
public class MyFooter {
    @ValueMapValue
    private String back;

    @ValueMapValue
    private String home;
    @ValueMapValue
    private String blog;



    public String getBack() {
        return back;}
    public String getBlog() {
        return blog;}
    public String getHome() {
        return home;}

}
