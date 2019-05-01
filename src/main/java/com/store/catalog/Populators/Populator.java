package com.store.catalog.Populators;

public interface Populator<SOURCE,TARGET>
{
    void populate(SOURCE source, TARGET target);
}