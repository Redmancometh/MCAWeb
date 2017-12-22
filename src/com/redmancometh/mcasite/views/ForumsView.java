package com.redmancometh.mcasite.views;

import com.google.inject.Inject;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ForumsView extends VerticalLayout
{
    private static final long serialVersionUID = 1L;

    @Inject
    public ForumsView()
    {
        System.out.println("CALLED FORUM VIEW CONSTRUCTOR!");
        Label l = new Label("Minecraft Avenue Forums");
        addComponent(l);
        l.setHeight(300, Unit.PERCENTAGE);
        setComponentAlignment(l, Alignment.TOP_CENTER);
    }
}
