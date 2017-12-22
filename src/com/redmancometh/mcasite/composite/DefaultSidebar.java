package com.redmancometh.mcasite.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.redmancometh.mcasite.Site;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DefaultSidebar extends HorizontalLayout
{

    private static final long serialVersionUID = 2271609423232153560L;
    private List<Component> buttons = new ArrayList();

    public DefaultSidebar()
    {
        init();
    }

    public void init()
    {
        setStyleName("vertical-menu");
        Button home = new Button("Home");
        Button vote = new Button("Vote");
        Button forums = new Button("Forums");
        Button news = new Button("News");
        Button wiki = new Button("Wiki");
        home.setIcon(FontAwesome.HOME);
        vote.setIcon(FontAwesome.LINE_CHART);
        forums.setIcon(FontAwesome.PARAGRAPH);
        news.setIcon(FontAwesome.NEWSPAPER_O);
        wiki.setIcon(FontAwesome.ARCHIVE);
        buttons.addAll(Arrays.asList(new Button[]
        { home, vote, forums, news, wiki }));
        forums.addClickListener((event) -> UI.getCurrent().setContent(Site.getSiteManager().getViewManager().getForumView()));
        vote.addClickListener((event) ->
        {
        });

        wiki.addClickListener((event) -> UI.getCurrent().setContent(Site.getSiteManager().getViewManager().getWikiView()));
        news.addClickListener((event) -> UI.getCurrent().setContent(Site.getSiteManager().getViewManager().getNewsView()));
        //buttons.forEach((button) -> button.setWidth(100, Unit.PIXELS));
        buttons.forEach((button) -> addComponent(button));
        setSizeFull();
    }

}