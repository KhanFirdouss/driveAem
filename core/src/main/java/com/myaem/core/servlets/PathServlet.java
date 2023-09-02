/*
package com.myaem.core.servlets;

import com.day.cq.commons.jcr.JcrConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(service = Servlet.class)
@SlingServletPaths(value = {"/bin/pages","/driveAem/page"})

public class PathServlet extends SlingAllMethodsServlet {
    @Override
    protected void doGet(final SlingHttpServletRequest request, final SlingHttpServletResponse response)
            throws ServletException, IOException {
        final Resource resource = request.getResourceResolver().getResource("driveAem/components/person");
        response.setContentType("text/plain");
        response.getWriter().write("Title = " + resource.getValueMap().get(JcrConstants.JCR_TITLE));
    }
}
*/