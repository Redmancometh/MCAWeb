package com.redmancometh.mcasite.monitor;

import com.redmancometh.mcasite.Site;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

public class MainUI extends UI
{

    private static final long serialVersionUID = 1L;

    public void init(VaadinRequest request)
    {
        setContent(Site.getSiteManager().getViewManager().getMainView());
    }

}