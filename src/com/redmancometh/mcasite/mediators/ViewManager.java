package com.redmancometh.mcasite.mediators;

import com.google.inject.Inject;
import com.redmancometh.mcasite.views.ForumsView;
import com.redmancometh.mcasite.views.MainPageView;
import com.redmancometh.mcasite.views.NewsView;
import com.redmancometh.mcasite.views.WikiView;

import lombok.Data;

@Data
public class ViewManager
{
    @Inject
    private ForumsView forumView;
    @Inject
    private MainPageView mainView;
    @Inject
    private NewsView newsView;
    @Inject
    private WikiView wikiView;
}
