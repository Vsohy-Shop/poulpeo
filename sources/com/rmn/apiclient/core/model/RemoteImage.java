package com.rmn.apiclient.core.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheRemoteImageConfig;
import java.net.MalformedURLException;
import java.net.URL;
import p446vd.C13633n;

public class RemoteImage {
    @NonNull
    public final String imagePath;

    public RemoteImage(@NonNull String str) {
        if (!TextUtils.isEmpty(str)) {
            this.imagePath = str;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Nullable
    private URL tryConvertingPathToUrl() {
        if (!this.imagePath.startsWith("http://") && !this.imagePath.startsWith("https://")) {
            return null;
        }
        try {
            return new URL(this.imagePath);
        } catch (MalformedURLException e) {
            C13633n.m31165u(this, e);
            return null;
        }
    }

    @Nullable
    public URL getImageURL() {
        URL tryConvertingPathToUrl = tryConvertingPathToUrl();
        if (tryConvertingPathToUrl != null) {
            return tryConvertingPathToUrl;
        }
        IRemoteImageConfig config = MemoryCacheRemoteImageConfig.instance.getConfig();
        if (config == null) {
            return null;
        }
        return config.newRemoteImageUrl(this.imagePath);
    }

    @Nullable
    public URL getImageURL(@NonNull IRemoteImageConfig iRemoteImageConfig) {
        URL tryConvertingPathToUrl = tryConvertingPathToUrl();
        if (tryConvertingPathToUrl != null) {
            return tryConvertingPathToUrl;
        }
        return iRemoteImageConfig.newRemoteImageUrl(this.imagePath);
    }
}
