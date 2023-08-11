package com.rmn.apiclient.core.data_access.service.http;

import androidx.annotation.NonNull;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.net.URL;

public interface IFakeJSONAccessor {
    @NonNull
    String getJSON(@NonNull ContextContainer contextContainer);

    boolean isMatching(@NonNull URL url);
}
