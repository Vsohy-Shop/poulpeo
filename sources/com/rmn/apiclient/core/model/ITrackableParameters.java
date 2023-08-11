package com.rmn.apiclient.core.model;

import androidx.annotation.NonNull;

public interface ITrackableParameters {
    @NonNull
    String getCampaignId();

    @NonNull
    String getCampaignName();

    @NonNull
    String getLocation();

    @NonNull
    String getLocationId();

    @NonNull
    String getMedium();

    @NonNull
    String getSource();
}
