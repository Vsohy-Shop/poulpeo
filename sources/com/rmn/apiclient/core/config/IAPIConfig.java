package com.rmn.apiclient.core.config;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.methods.BaseApiMethod;

public interface IAPIConfig {
    @NonNull
    String getAPIUrl() {
        String domain = getDomain();
        if (!TextUtils.isEmpty(domain)) {
            String version = getVersion();
            if (!TextUtils.isEmpty(version)) {
                version = "/" + version;
            }
            String callingContext = getCallingContext();
            if (!TextUtils.isEmpty(callingContext)) {
                callingContext = "/" + callingContext;
            }
            return "https://" + domain + version + callingContext;
        }
        throw new IllegalStateException("The domain is not defined");
    }

    @NonNull
    String getCallingContext();

    @NonNull
    String getClientId();

    @NonNull
    String getDomain();

    @Nullable
    ILocalAPIConfig getLocalAPIConfig();

    long getMaxTimeoutSec() {
        return 10;
    }

    @Nullable
    BaseApiMethod getRemoteConfigMethod();

    @NonNull
    String getVersion();
}
