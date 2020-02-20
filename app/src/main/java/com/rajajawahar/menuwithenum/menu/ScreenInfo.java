package com.rajajawahar.menuwithenum.menu;

import android.content.res.Resources;

import com.rajajawahar.menuwithenum.base.BaseFragment;

public interface ScreenInfo {

    String getActionBarTitle(Resources res);

    Integer getNavigationId();

    Class<? extends BaseFragment> getFragmentClass();

}
