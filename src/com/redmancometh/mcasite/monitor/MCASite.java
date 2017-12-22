package com.redmancometh.mcasite.monitor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.vaadin.jetty.VaadinJettyServer;

import com.google.inject.Inject;
import com.redmancometh.mcasite.config.ConfigManager;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class MCASite extends UI
{

    private static final long serialVersionUID = -8633210585410721487L;
    ScheduledExecutorService heartbeat = Executors.newSingleThreadScheduledExecutor();
    @Inject
    private ConfigManager siteCfg;
    @Inject
    private VaadinServlet servlet;

    @Inject
    public MCASite(ConfigManager siteCfg, VaadinServlet servlet)
    {
        this.siteCfg = siteCfg;
        this.servlet = servlet;
    }

    public void start()
    {
        siteCfg.init();
        try
        {
            ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
            contextHandler.setContextPath("/");
            ServletHolder sh = new ServletHolder(servlet);
            contextHandler.addServlet(sh, "/*");
            contextHandler.setInitParameter("ui", MainUI.class.getCanonicalName());
            VaadinJettyServer server = new VaadinJettyServer(80, siteCfg.getConfig().getTemplatePath());
            server.setHandler(contextHandler);
            server.start();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    protected void init(VaadinRequest request)
    {

    }

}
