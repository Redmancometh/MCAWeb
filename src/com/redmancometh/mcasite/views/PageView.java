package com.redmancometh.mcasite.views;

public abstract interface PageView
{
    
    public default void init()
    {

    }

    /**
     * This will automatically be called from the default init method.
     */
    public abstract void initContent();

    public default void initFooter()
    {

    }

    public default void initNavBar()
    {

    }
}
