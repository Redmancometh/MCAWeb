package com.redmancometh.mcasite.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.vaadin.ui.UI;

public class MainModule extends AbstractModule
{

    @Override
    protected void configure()
    {
    }

    @Provides
    UI ui()
    {
        return UI.getCurrent();
    }
}
