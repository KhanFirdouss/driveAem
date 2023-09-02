package com.myaem.core.models.pogo;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.Date;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MyBlogList {
    @ValueMapValue
    private String heading;
    public String getHeading() {
        return heading;}

    @ValueMapValue
    @Default(values = "Featured Post")
    private String title;
    public String getTitle() {
        return title;}

    @ValueMapValue
    @Default(values = "This is a wider card with supporting text below as a natural lead-in to additional content. This is a wider card with supporting text below as a natural lead-in to additional content. This is a wider card with supporting text below as a natural lead-in to additional content.")
    private String description;
    public String getDescription() {
        return description;}
    @ValueMapValue
    private String text;
    public String getText() {
        return text;}
    @ValueMapValue
    private String image;
    public String getImage() {
        return image;}

    @ValueMapValue
    @Default(values = "http://localhost:4502/editor.html/content/driveAem/us/en/blogs.html")
    private String more;
    public String getMore() {
        return more;}



}
