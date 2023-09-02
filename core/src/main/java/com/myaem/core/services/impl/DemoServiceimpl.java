package com.myaem.core.services.impl;

import com.myaem.core.services.DemoService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;


@Component(service=DemoService.class,immediate = true)
@Designate(ocd = fk.class)
public class DemoServiceimpl implements DemoService {
    String y;

    @Activate
    @Modified
    protected void activate(fk x){
        y=x.getName();

    }



    @Override
    public String getUrl() {
        return y;
    }
}
