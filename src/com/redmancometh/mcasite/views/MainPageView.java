package com.redmancometh.mcasite.views;

import com.google.inject.Inject;
import com.redmancometh.mcasite.composite.AnnouncementPanel;
import com.redmancometh.mcasite.composite.DefaultSidebar;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class MainPageView extends VerticalLayout
{

    private static final long serialVersionUID = 749951811492206960L;

    @Inject
    public MainPageView(DefaultSidebar sidebar, AnnouncementPanel news)
    {
        Label l = new Label("Minecraft Avenue Coming Soon");
        addComponent(l);
        l.setHeight(300, Unit.PERCENTAGE);
        addComponent(sidebar);
        addComponent(news);
        setComponentAlignment(l, Alignment.TOP_CENTER);
    }

}
