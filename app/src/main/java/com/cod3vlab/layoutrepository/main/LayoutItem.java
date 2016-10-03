package com.cod3vlab.layoutrepository.main;

/**
 * Created by Cod3vLab on 01/10/2016.
 */

public class LayoutItem {

    //region Properties

    private final Class mActivityClass;

    private final String mName;

    //endregion

    //region Constructors

    public LayoutItem(Class activityClass, String name) {
        this.mActivityClass = activityClass;
        this.mName = name;
    }

    //endregion

    //region Getters

    public Class getActivityClass() {
        return mActivityClass;
    }

    public String getName() {
        return mName;
    }

    //endregion

    //region Override methods

    @Override
    public String toString() {
        return mName;
    }

    //endregion

}
