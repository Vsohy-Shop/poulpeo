package com.rmn.apiclient.core.data_access.service.http;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.service.call.ServiceCallListener;
import com.rmn.apiclient.core.data_access.service.call.ServiceInput;

public interface IHttpCallManager {
    void call(@NonNull ServiceInput serviceInput, @NonNull ServiceCallListener serviceCallListener);
}
