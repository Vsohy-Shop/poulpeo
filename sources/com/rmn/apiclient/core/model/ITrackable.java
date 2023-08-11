package com.rmn.apiclient.core.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ITrackable {
    @Nullable
    ITrackableParameters getTrackableParameters();

    @NonNull
    String getTrackingCampaignId() {
        ITrackableParameters trackableParameters = getTrackableParameters();
        if (trackableParameters != null) {
            return trackableParameters.getCampaignId();
        }
        return "";
    }

    @NonNull
    String getTrackingCampaignName() {
        ITrackableParameters trackableParameters = getTrackableParameters();
        if (trackableParameters != null) {
            return trackableParameters.getCampaignName();
        }
        return "";
    }

    @NonNull
    String getTrackingLocation() {
        ITrackableParameters trackableParameters = getTrackableParameters();
        if (trackableParameters != null) {
            return trackableParameters.getLocation();
        }
        return "";
    }

    @NonNull
    String getTrackingLocationId() {
        ITrackableParameters trackableParameters = getTrackableParameters();
        if (trackableParameters != null) {
            return trackableParameters.getLocationId();
        }
        return "";
    }

    @NonNull
    String getTrackingMedium() {
        ITrackableParameters trackableParameters = getTrackableParameters();
        if (trackableParameters != null) {
            return trackableParameters.getMedium();
        }
        return "";
    }

    @NonNull
    String getTrackingSource() {
        ITrackableParameters trackableParameters = getTrackableParameters();
        if (trackableParameters != null) {
            return trackableParameters.getSource();
        }
        return "";
    }
}
