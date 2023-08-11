package com.rmn.apiclient.core.data_access.service.http;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.config.IAPIConfig;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.Map;

public final class HttpCallManagerFactory {
    @NonNull
    public IHttpCallManager newHttpCallManager(@NonNull ContextContainer contextContainer, @NonNull IAPIConfig iAPIConfig, @Nullable Map<String, String> map) {
        return new AndroidHttpCallManager(contextContainer, iAPIConfig, map);
    }
}
