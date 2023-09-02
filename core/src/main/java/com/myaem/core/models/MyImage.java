package com.myaem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy= DefaultInjectionStrategy.OPTIONAL)
public class MyImage {

   // @ValueMapValue
  //  private String fileReference;
   @ValueMapValue
    private String image;
   // @ValueMapValue
  /*  private String file;

    public String getFile() {
        return file;
    }

    public String getFileReference() {
        return fileReference;
    }

    */
    public String getImage() {
        return image;
    }

}
