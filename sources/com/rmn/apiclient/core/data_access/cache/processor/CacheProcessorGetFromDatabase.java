package com.rmn.apiclient.core.data_access.cache.processor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.cache.call.CacheInput;
import com.rmn.apiclient.core.data_access.cache.call.CacheOutput;
import com.rmn.iosadapters.android.content.ContextContainer;
import p446vd.C13633n;

public class CacheProcessorGetFromDatabase extends BaseCacheActionProcessor {
    public boolean canProcessAction(@NonNull CacheInput cacheInput, @NonNull CacheOutput cacheOutput) {
        C13633n.m31166v("TODO implement the processor");
        return false;
    }

    public void process(@NonNull ContextContainer contextContainer, @NonNull CacheInput cacheInput, @NonNull CacheOutput cacheOutput, @NonNull IActionProcessorListener<CacheOutput> iActionProcessorListener) {
        iActionProcessorListener.onActionProcessed(this, cacheOutput);
    }
}
