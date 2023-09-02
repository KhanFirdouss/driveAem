package com.myaem.core.models;

import com.myaem.core.services.DemoService;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy= DefaultInjectionStrategy.OPTIONAL)
public class PersonImpl implements Person{
    @ValueMapValue
    private String firstName;
    @ValueMapValue
  /*  @Default(values="khan")*/
    private String lastName;
  /*  @OSGiService
    DemoService demo;*/
  @ValueMapValue
  private String gender;

    public String getFname() {
        return firstName;}

        public String getLname() {
            return lastName ;
        }
    public String getGender() {
        return gender;}
    }

