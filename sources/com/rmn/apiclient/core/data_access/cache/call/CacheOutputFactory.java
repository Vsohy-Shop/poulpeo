package com.rmn.apiclient.core.data_access.cache.call;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.apiclient.core.data_access.base.call.IOutputFactory;
import com.rmn.apiclient.core.data_access.base.call.OutputStatus;
import com.rmn.apiclient.core.data_access.cache.call.CacheOutput;

public class CacheOutputFactory implements IOutputFactory {
    @NonNull
    public static final CacheOutputFactory instance = new CacheOutputFactory();

    private CacheOutputFactory() {
    }

    @NonNull
    public CacheOutput.Builder newBuilder(@NonNull BaseOutput<?> baseOutput, @NonNull OutputStatus outputStatus) {
        return CacheOutput.Builder.newBuilder((CacheOutput) baseOutput, outputStatus);
    }
}
