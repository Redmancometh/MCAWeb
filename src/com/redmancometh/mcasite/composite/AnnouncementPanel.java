package com.redmancometh.mcasite.composite;

import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Label;

public class AnnouncementPanel extends Label
{

    private static final long serialVersionUID = 1L;

    public AnnouncementPanel()
    {
        setContentMode(ContentMode.HTML);
        this.setCaption("Announcements");
        setWidth(70, Unit.PERCENTAGE);
        setValue("We're coming soon!");

    }
}
