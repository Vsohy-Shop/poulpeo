package com.rmn.apiclient.impl.api.models.submodels.page.sections;

import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.core.model.RemoteImage;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;
import java.net.URL;

public class PageSectionJumbotron extends BasePageSection {
    @Nullable
    private final RemoteImage background_desktop = null;
    @Nullable
    private final RemoteImage background_mobile = null;
    @Nullable
    public final String content = BaseModel.defaultString();
    @Nullable
    private final RemoteImage logo = null;
    @Nullable
    public final String title = BaseModel.defaultString();

    @Nullable
    public URL getBackground() {
        RemoteImage remoteImage = this.background_mobile;
        if (remoteImage != null) {
            return remoteImage.getImageURL();
        }
        RemoteImage remoteImage2 = this.background_desktop;
        if (remoteImage2 != null) {
            return remoteImage2.getImageURL();
        }
        return null;
    }

    @Nullable
    public URL getLogo() {
        RemoteImage remoteImage = this.logo;
        if (remoteImage == null) {
            return null;
        }
        return remoteImage.getImageURL();
    }

    public boolean isValid() {
        return true;
    }
}
