package com.rmn.apiclient.core.data_access.cache.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.OutputStatus;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCompleteListener;
import com.rmn.apiclient.core.data_access.cache.call.CacheOutput;

public class CacheCall extends BaseCall<CacheInput, CacheOutput> {
    public CacheCall(@NonNull CacheInput cacheInput) {
        super(cacheInput, (OnCompleteListener) null);
    }

    public CacheCall(@NonNull CacheInput cacheInput, @Nullable OnCompleteListener<CacheInput, CacheOutput> onCompleteListener) {
        super(cacheInput, onCompleteListener);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public CacheOutput newOutput(@NonNull OutputStatus outputStatus, @Nullable CallException callException) {
        return new CacheOutput.Builder((CacheInput) getInput(), outputStatus).setException(callException).build();
    }
}
