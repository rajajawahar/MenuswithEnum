package com.rajajawahar.menuwithenum.menu;

import android.content.res.Resources;

import com.rajajawahar.menuwithenum.base.BaseFragment;

public enum ScreenAdmin implements ScreenInfo {

    PROFILE {
        @Override
        public String getActionBarTitle(Resources res) {
            return null;
        }

        @Override
        public Integer getNavigationId() {
            return null;
        }

        @Override
        public Class<? extends BaseFragment> getFragmentClass() {
            return null;
        }
    },
    ADMIN {
        @Override
        public String getActionBarTitle(Resources res) {
            return null;
        }

        @Override
        public Integer getNavigationId() {
            return null;
        }

        @Override
        public Class<? extends BaseFragment> getFragmentClass() {
            return null;
        }
    },
    SETTINGS {
        @Override
        public String getActionBarTitle(Resources res) {
            return null;
        }

        @Override
        public Integer getNavigationId() {
            return null;
        }

        @Override
        public Class<? extends BaseFragment> getFragmentClass() {
            return null;
        }
    }
}
