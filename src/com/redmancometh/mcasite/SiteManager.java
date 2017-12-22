package com.redmancometh.mcasite;

import com.google.inject.Inject;
import com.redmancometh.mcasite.mediators.ViewManager;
import com.redmancometh.mcasite.monitor.MCASite;

import lombok.Data;

@Data
public class SiteManager
{
    @Inject
    private MCASite application;
    @Inject
    private ViewManager viewManager;

    @Inject
    public SiteManager(ViewManager viewManager, MCASite application)
    {
        this.viewManager = viewManager;
        this.application = application;
        this.application.start();
    }
}
