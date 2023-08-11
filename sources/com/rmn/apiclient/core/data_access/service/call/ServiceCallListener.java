package com.rmn.apiclient.core.data_access.service.call;

import androidx.annotation.NonNull;

public interface ServiceCallListener {
    void onError(@NonNull Throwable th);

    void onSuccess(int i, @NonNull String str);
}
