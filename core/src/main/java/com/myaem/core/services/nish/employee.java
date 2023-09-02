package com.myaem.core.services.nish;

import com.myaem.core.services.employee1;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Component(service = employee1.class,immediate = true)
@Designate(ocd = employee.employInfo.class)
public class employee implements employee1 {

    String name;
    String dept;
    int ID;
    @ObjectClassDefinition(name="EmployeeDetail",description = "this is employee Detail")
    @interface employInfo{
        @AttributeDefinition(name = "employName",description = "enter employee name",type = AttributeType.STRING)
        String getName();
        @AttributeDefinition(name = "employID",description = "enter employee ID",type = AttributeType.INTEGER)
        int getID();
        @AttributeDefinition(name = "employDept",description = "enter employee Department",type = AttributeType.STRING)
        String getDeparment();  }
        @Activate
        @Modified
        protected void activate (employee.employInfo e){
            name=e.getName();
            dept=e.getDeparment();
            ID=e.getID();



    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getDepartment() {
        return dept;
    }
}
