package com.rmn.apiclient.core.data_access.service.descriptor;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.config.IAPIConfig;
import com.rmn.apiclient.core.data_access.service.http.HttpCallManagerFactory;
import com.rmn.apiclient.core.data_access.service.http.IHttpCallManager;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.HashMap;

public class ServiceDescriptor {
    @Nullable
    private IAPIConfig config;
    @Nullable
    private IHttpCallManager httpCallManager;

    @NonNull
    public IAPIConfig getAPIConfig() {
        IAPIConfig iAPIConfig = this.config;
        if (iAPIConfig != null) {
            return iAPIConfig;
        }
        throw new UnsupportedOperationException("You must initialize the ServiceDescriptor with a IHttpCallManager");
    }

    @NonNull
    public IHttpCallManager getHttpCallManager() {
        IHttpCallManager iHttpCallManager = this.httpCallManager;
        if (iHttpCallManager != null) {
            return iHttpCallManager;
        }
        throw new UnsupportedOperationException("You must initialize the ServiceDescriptor with a IHttpCallManager");
    }

    public void init(@NonNull ContextContainer contextContainer, @NonNull IAPIConfig iAPIConfig, @Nullable String str) {
        this.config = iAPIConfig;
        HashMap hashMap = new HashMap();
        hashMap.put("X-CLIENT-ID", iAPIConfig.getClientId());
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("X-EXEC-ENV", str);
        }
        this.httpCallManager = new HttpCallManagerFactory().newHttpCallManager(contextContainer, iAPIConfig, hashMap);
    }
}
