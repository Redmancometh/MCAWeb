package com.redmancometh.mcasite.databasing;

import lombok.Getter;
import org.hibernate.SessionFactory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

public class MasterDatabase implements Iterable<SubDatabase>
{
    @Getter
    private Map<Class, SubDatabase> subDBMap = new HashMap();

    public SubDatabase getSubDBForType(Class clazz)
    {
        return subDBMap.get(clazz);
    }

    @Override
    public Iterator<SubDatabase> iterator()
    {
        return subDBMap.values().iterator();
    }

    @Override
    public void forEach(Consumer<? super SubDatabase> action)
    {
        subDBMap.values().forEach(action);
    }

    public void registerDatabase(Class ofType, SessionFactory factory)
    {
        this.subDBMap.put(ofType, new SubDatabase(ofType, factory));
    }

}
