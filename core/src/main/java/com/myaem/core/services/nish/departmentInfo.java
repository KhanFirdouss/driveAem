package com.myaem.core.services.nish;

import com.myaem.core.services.department1;
import org.apache.commons.lang3.StringUtils;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Component(service = department1.class,immediate = true)
@Designate(ocd = departmentInfo.Config.class)
public class departmentInfo implements department1 {
    String demoName= StringUtils.EMPTY;

    int demoID;
    @ObjectClassDefinition(name="departmentInfo",description = "information of the department")
    @interface Config{
        @AttributeDefinition(name = "demoName",description = "enter the name",type = AttributeType.STRING)
        String getName();

        @AttributeDefinition(name = "demoID",description = "enter the department ID",type = AttributeType.INTEGER)
        int getID();
    }
    @Activate
    @Modified
    protected void activate(departmentInfo.Config props){
        demoName=props.getName();

        demoID= props.getID();
    }
    @Override
    public String getname() {return demoName;}
    @Override
    public int getID() {return demoID;
    }
}
