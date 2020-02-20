package com.rajajawahar.menuwithenum.menu;

import android.content.res.Resources;

import com.rajajawahar.menuwithenum.base.BaseFragment;

public enum ScreenUser implements ScreenInfo {

    HOME {
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
    LOGS {
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
