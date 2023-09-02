/*
package com.myaem.core.servlets;

import com.day.cq.commons.jcr.JcrConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(service = Servlet.class)
@SlingServletResourceTypes(resourceTypes="driveAem/components/person",
        methods={ HttpConstants.METHOD_GET,HttpConstants.METHOD_POST},
        extensions="html")
@ServiceDescription("First try servlet")

public class TryServlets extends SlingAllMethodsServlet{
    @Override
    protected void doGet(final SlingHttpServletRequest request, final SlingHttpServletResponse response)
        throws ServletException, IOException{

        final Resource resource = request.getResourceResolver().getResource("driveAem/components/person");

        response.setContentType("text/plain");
        response.getWriter().write("Title = "+ resource.getValueMap().get(JcrConstants.JCR_TITLE));


    }
}
*/
