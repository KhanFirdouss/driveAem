package com.myaem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
@Model(adaptables = Resource.class,defaultInjectionStrategy= DefaultInjectionStrategy.OPTIONAL)
public class MyHeader {
    @ValueMapValue
  //  @Default(values = "BootCamp Blog")
    private String mainHeading;

    @ValueMapValue
    private String fileName;
    @ValueMapValue
    private String fileReference;
    @ValueMapValue
    private String home;
    @ValueMapValue
    private String published;


    public String getMainHeading() {
        return mainHeading;}
    public String getFileName() {
        return fileName;}
    public String getFileReference() {
        return fileReference;}
    public String getHome() {
        return home;}
    public String getPublished() {
        return published;}
}
