package com.redmancometh.mcasite.views;

import com.google.inject.Inject;
import com.redmancometh.mcasite.monitor.MainUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class NewsView extends VerticalLayout
{
    private static final long serialVersionUID = 1L;
    @Inject
    private MainUI view;

    public NewsView()
    {
        Label l = new Label("MCA News");
        addComponent(l);
        l.setHeight(300, Unit.PERCENTAGE);
        setComponentAlignment(l, Alignment.TOP_CENTER);
    }
}
