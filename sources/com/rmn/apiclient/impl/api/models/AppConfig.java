package com.rmn.apiclient.impl.api.models;

import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.core.model.IRemoteImageConfig;
import java.net.MalformedURLException;
import java.net.URL;
import p446vd.C13633n;

public class AppConfig extends BaseModel implements IRemoteImageConfig {
    @Nullable
    public final URL endpointImage = null;
    public final boolean forceRecaptcha = BaseModel.defaultBoolean();
    public final float paymentThreshold = ((float) BaseModel.defaultNumber());
    public final int reviewMaxCharCount = BaseModel.defaultNumber();
    public final int reviewMinCharCount = BaseModel.defaultNumber();
    public final int reviewMinPaidCharCount = BaseModel.defaultNumber();
    public final float sponsorshipBonusAmount = ((float) BaseModel.defaultNumber());
    public final boolean tabUnderEnabled = BaseModel.defaultBoolean();
    public final float uaebBonusAmount = ((float) BaseModel.defaultNumber());
    public final float welcomeBonusAmount = ((float) BaseModel.defaultNumber());

    public AppConfig() {
        super("");
    }

    @Nullable
    public URL newRemoteImageUrl(@Nullable String str) {
        if (this.endpointImage == null || str == null) {
            return null;
        }
        if (!str.startsWith("/")) {
            str = "/" + str;
        }
        try {
            return new URL(this.endpointImage.toString() + str);
        } catch (MalformedURLException e) {
            C13633n.m31165u(this, e);
            return null;
        }
    }
}
