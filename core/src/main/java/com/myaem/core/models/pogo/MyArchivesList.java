package com.myaem.core.models.pogo;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MyArchivesList {
    @ValueMapValue
    public String text;
    @ValueMapValue
    public String pth;

    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }

    public String getPth() {

        return pth;
    }

    public void setPth(String pth) {

        this.pth = pth;
    }


}

