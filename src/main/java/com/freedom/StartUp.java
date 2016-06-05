package com.freedom;

/**
 * Created by Huangxiaoxu on 2016/6/3.
 */

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.util.resource.ResourceCollection;
import org.eclipse.jetty.webapp.WebAppContext;

public class StartUp
{
   public static void  main(String[] args) throws Exception {
       Server server = new Server(8088);

       WebAppContext context = new WebAppContext();
       context.setContextPath("/freedom");
       context.setDescriptor("src/main/webapp/WEB-INF/web.xml");
       context.setResourceBase("src/main/webapp");
       context.setParentLoaderPriority(true);
       server.setHandler(context);

       server.start();
       server.join();
   }
}