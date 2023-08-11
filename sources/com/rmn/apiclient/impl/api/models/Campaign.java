package com.rmn.apiclient.impl.api.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.methods.BaseApiMethod;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategyChain;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.core.model.IDisplayable;
import com.rmn.apiclient.core.model.ITrackable;
import com.rmn.apiclient.core.model.ITrackableParameters;
import com.rmn.apiclient.core.model.ModelReference;
import com.rmn.apiclient.core.model.ModelRelationship;
import com.rmn.apiclient.core.model.RemoteImage;
import com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget;
import com.rmn.apiclient.impl.api.models.submodels.campaign.TrackingParameters;
import java.net.URL;
import java.util.Date;
import p446vd.C13633n;

public class Campaign extends BaseModel implements IDisplayable, ITrackable {
    @Nullable
    public final Date dataDateEnd = null;
    @Nullable
    public final Date dataDateStart = null;
    @Nullable
    public final RemoteImage dataIllustration = null;
    @Nullable
    public final String dataLabelUrl = null;
    @Nullable
    public final URL dataSpecificUrl = null;
    private final boolean dataSponsored = BaseModel.defaultBoolean();
    @NonNull
    public final CampaignTarget dataTarget;
    @Nullable
    public final ModelRelationship<?> targetRelationship;
    @Nullable
    public final String title;
    @Nullable
    private final TrackingParameters trackingParameters = null;

    public Campaign(@NonNull String str, @NonNull CampaignTarget campaignTarget, @Nullable ModelReference<?> modelReference, @Nullable String str2) {
        super(str);
        this.dataTarget = campaignTarget;
        if (modelReference == null) {
            this.targetRelationship = null;
        } else {
            this.targetRelationship = new ModelRelationship<>(modelReference);
        }
        this.title = str2;
    }

    @Nullable
    public Date getDateEnd() {
        return this.dataDateEnd;
    }

    @Nullable
    public Date getDateStart() {
        return this.dataDateStart;
    }

    @NonNull
    public String getId() {
        return this.f18063id;
    }

    @Nullable
    public <T extends BaseApiMethod> T getTargetApiMethod(@NonNull ProxyStrategyChain proxyStrategyChain) {
        ModelRelationship<?> modelRelationship = this.targetRelationship;
        if (modelRelationship != null) {
            return this.dataTarget.getTargetApiMethod(proxyStrategyChain, modelRelationship);
        }
        C13633n.m31166v("Can't retrieve the model of this campaign, please use the method canRetrieveTargetModel() before");
        return null;
    }

    @Nullable
    public String getTargetId() {
        ModelRelationship<?> modelRelationship = this.targetRelationship;
        if (modelRelationship != null) {
            return modelRelationship.f18064id;
        }
        return null;
    }

    @Nullable
    public ITrackableParameters getTrackableParameters() {
        return this.trackingParameters;
    }

    public boolean isSponsored() {
        return this.dataSponsored;
    }

    @NonNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Campaign{id='");
        sb.append(this.f18063id);
        sb.append('\'');
        sb.append(", dataTarget='");
        sb.append(this.dataTarget);
        sb.append('\'');
        sb.append(", targetRelationship.id='");
        ModelRelationship<?> modelRelationship = this.targetRelationship;
        if (modelRelationship != null) {
            str = modelRelationship.f18064id;
        } else {
            str = null;
        }
        sb.append(str);
        sb.append('\'');
        sb.append(", title='");
        sb.append(this.title);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
