/*
 *  Copyright 2015 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
/*
package com.myaem.core.servlets;

import com.day.cq.commons.jcr.JcrConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.request.RequestParameter;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;
import org.slf4j.LoggerFactory;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;

import static com.adobe.cq.wcm.core.components.commons.editor.dialog.childreneditor.Item.LOG;

/**
 * Servlet that writes some sample content into the response. It is mounted for
 * all resources of a specific Sling resource type. The
 * {@link SlingSafeMethodsServlet} shall be used for HTTP methods that are
 * idempotent. For write operations use the {@link SlingAllMethodsServlet}.
 */
/*
@Component(service = { Servlet.class })
@SlingServletResourceTypes(
        resourceTypes="driveAem/components/text",
        methods= {HttpConstants.METHOD_GET, HttpConstants.METHOD_POST},
        extensions="html")
@ServiceDescription("Simple Demo Servlet")
public class SimpleServlet extends SlingAllMethodsServlet {

    private static final long serialVersionUID = 1L;
    //private static final Logger LOG = LoggerFactory.getLogger(SimpleServlet.class)
    @Override
    protected void doGet(final SlingHttpServletRequest req, final SlingHttpServletResponse resp)
            throws ServletException, IOException {
        final Resource resource = req.getResource();
        resp.setContentType("text/plain");
        resp.getWriter().write("Title = "+ resource.getValueMap().get(JcrConstants.JCR_TITLE));
    }
   @Override
    protected void doPost(final SlingHttpServletRequest req, final SlingHttpServletResponse resp)
           throws ServletException, IOException {
        try{
            LOG.info("\n ##### STARTED POST ########");
            List<RequestParameter> requestParameterList=req.getRequestParameterList();
            for(RequestParameter requestParameter: requestParameterList){
                LOG.info("\n == PARAMETERS ==>   {} : {} ",requestParameter.getName(),requestParameter.getString());
            }
        }
        catch (Exception e){
                LOG.info("\n ERROR IN REQUEST{}",e.getMessage());
            }
        resp.getWriter().write("##### Form SUBMITTED ####");
    }
}
*/