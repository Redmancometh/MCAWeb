package com.redmancometh.mcasite;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.redmancometh.mcasite.config.Config;
import com.redmancometh.mcasite.modules.MainModule;

import lombok.Data;

@Data
public class Site
{
    private static ScheduledExecutorService pool = Executors.newScheduledThreadPool(32);
    private static SiteManager siteManager;
    private static Injector injector;

    public static void main(String[] args)
    {
        injector = Guice.createInjector(new MainModule());
        siteManager = injector.getInstance(SiteManager.class);
    }

    public static Config cfg()
    {
        return siteManager.getApplication().getSiteCfg().getConfig();
    }

    public static ScheduledExecutorService getPool()
    {
        return pool;
    }

    public static void setPool(ScheduledExecutorService pool)
    {
        Site.pool = pool;
    }

    public static SiteManager getSiteManager()
    {
        return siteManager;
    }

    public static Injector getInjector()
    {
        return injector;
    }

    public static void setSiteManager(SiteManager siteManager)
    {
        Site.siteManager = siteManager;
    }

    public static void setInjector(Injector injector)
    {
        Site.injector = injector;
    }

}
