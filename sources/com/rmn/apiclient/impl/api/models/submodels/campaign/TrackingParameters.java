package com.rmn.apiclient.impl.api.models.submodels.campaign;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.ITrackableParameters;

public class TrackingParameters implements ITrackableParameters {
    @Nullable
    private final String campaign_id = null;
    @Nullable
    private final String campaign_name = null;
    @Nullable
    private final String location = null;
    @Nullable
    private final String location_id = null;
    @Nullable
    private final String medium = null;
    @Nullable
    private final String source = null;

    @NonNull
    public String getCampaignId() {
        String str = this.campaign_id;
        if (str != null) {
            return str;
        }
        return "";
    }

    @NonNull
    public String getCampaignName() {
        String str = this.campaign_name;
        if (str != null) {
            return str;
        }
        return "";
    }

    @NonNull
    public String getLocation() {
        String str = this.location;
        if (str != null) {
            return str;
        }
        return "";
    }

    @NonNull
    public String getLocationId() {
        String str = this.location_id;
        if (str != null) {
            return str;
        }
        return "";
    }

    @NonNull
    public String getMedium() {
        String str = this.medium;
        if (str != null) {
            return str;
        }
        return "";
    }

    @NonNull
    public String getSource() {
        String str = this.source;
        if (str != null) {
            return str;
        }
        return "";
    }
}
