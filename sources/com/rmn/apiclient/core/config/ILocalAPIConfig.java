package com.rmn.apiclient.core.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.service.http.IFakeJSONAccessor;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import p446vd.C13633n;

public interface ILocalAPIConfig {
    @NonNull
    String getFakeJSON(@NonNull ContextContainer contextContainer, @NonNull String str) {
        Set<IFakeJSONAccessor> fakeJSONAccessors = getFakeJSONAccessors();
        if (fakeJSONAccessors == null) {
            return "";
        }
        try {
            URL url = new URL(str);
            for (IFakeJSONAccessor next : fakeJSONAccessors) {
                if (next.isMatching(url)) {
                    return next.getJSON(contextContainer);
                }
            }
        } catch (MalformedURLException e) {
            C13633n.m31147c(this, e);
        }
        return "";
    }

    @Nullable
    Set<IFakeJSONAccessor> getFakeJSONAccessors();

    @NonNull
    String getLocalDomain();

    boolean isLocalMode();
}
