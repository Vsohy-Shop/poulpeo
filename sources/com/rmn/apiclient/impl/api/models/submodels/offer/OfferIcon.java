package com.rmn.apiclient.impl.api.models.submodels.offer;

import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.RemoteImage;

public class OfferIcon {
    @Nullable
    public final String altText;
    @Nullable
    public final String caption;
    @Nullable
    public final String iconName;
    @Nullable
    public final String iconStyle;
    @Nullable
    public final RemoteImage imgPath;
    @Nullable
    public final String secondaryIconName;
    @Nullable
    public final String secondaryIconSize;
    @Nullable
    public final String secondaryIconStyle;

    public OfferIcon(@Nullable String str, @Nullable RemoteImage remoteImage, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.altText = str;
        this.imgPath = remoteImage;
        this.iconName = str2;
        this.iconStyle = str3;
        this.secondaryIconName = str4;
        this.secondaryIconStyle = str5;
        this.secondaryIconSize = str6;
        this.caption = str7;
    }
}
