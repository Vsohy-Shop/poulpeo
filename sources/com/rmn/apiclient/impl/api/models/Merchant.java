package com.rmn.apiclient.impl.api.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.core.model.ModelReference;
import com.rmn.apiclient.core.model.ModelRelationship;
import com.rmn.apiclient.core.model.RemoteImage;
import java.net.URL;
import p446vd.C13631l;

public class Merchant extends MerchantLight {
    @NonNull
    public final String autocheckTips = BaseModel.defaultString();
    @NonNull
    public final ModelRelationship<CashbackObject> cashbackObjectRelationship;
    @NonNull
    private final String description = BaseModel.defaultString();
    public final boolean extensionAutocheckStatus = BaseModel.defaultBoolean();
    public final boolean extensionFlagStatus = BaseModel.defaultBoolean();
    public final boolean extensionIconBlinkStatus = BaseModel.defaultBoolean();
    public final boolean extensionSerpStatus = BaseModel.defaultBoolean();
    public final boolean extensionShoppingbarStatus = BaseModel.defaultBoolean();
    @NonNull
    public final String grade = BaseModel.defaultString();
    @Nullable
    public final RemoteImage illustrationMobile = null;
    @Nullable
    public final RemoteImage illustrationTopMobile = null;
    @Nullable
    private final RemoteImage logoPath = null;
    @Nullable
    private final RemoteImage logoRetinaPath = null;
    private final boolean manageTrackingAppToAppAndroid = BaseModel.defaultBoolean();
    private final boolean manageTrackingAppToAppIos = BaseModel.defaultBoolean();
    @NonNull
    public final ModelRelationship<MerchantInfo> merchantInfoRelationship;
    public final int numberReviews = BaseModel.defaultNumber();
    @Nullable
    public final String rewrite = null;
    public final float scoreReview = ((float) BaseModel.defaultNumber());
    public final boolean support = BaseModel.defaultBoolean();

    public Merchant(@NonNull String str, @Nullable ModelReference<CashbackObject> modelReference, @Nullable ModelReference<MerchantInfo> modelReference2, @NonNull String str2) {
        super(str, str2);
        this.cashbackObjectRelationship = new ModelRelationship<>(modelReference);
        this.merchantInfoRelationship = new ModelRelationship<>(modelReference2);
    }

    @Nullable
    public CashbackObject getCashbackObject() {
        return this.cashbackObjectRelationship.getModel();
    }

    @NonNull
    public String getHtmlDescription() {
        return this.description;
    }

    @Nullable
    public URL getLogoUrl() {
        RemoteImage remoteImage = this.logoRetinaPath;
        if (remoteImage != null) {
            return remoteImage.getImageURL();
        }
        RemoteImage remoteImage2 = this.logoPath;
        if (remoteImage2 != null) {
            return remoteImage2.getImageURL();
        }
        return null;
    }

    @Nullable
    public MerchantInfo getMerchantInfo() {
        return this.merchantInfoRelationship.getModel();
    }

    @NonNull
    public String getPlainTextDescription() {
        return C13631l.m31143a(this.description);
    }

    public boolean hasAppToAppTracking() {
        return this.manageTrackingAppToAppAndroid;
    }

    public boolean hasCashback() {
        return this.cashbackObjectRelationship.exists();
    }

    @NonNull
    public String toString() {
        return "Merchant{id='" + this.f18063id + '\'' + ", cashbackObjectRelationship.id='" + this.cashbackObjectRelationship.f18064id + '\'' + ", merchantInfoRelationship.id='" + this.merchantInfoRelationship.f18064id + '\'' + ", name='" + this.name + '\'' + '}';
    }
}
