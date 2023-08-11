package com.rmn.apiclient.core.data_access.cache.processor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.cache.call.CacheInput;
import com.rmn.apiclient.core.data_access.cache.call.CacheOutput;
import com.rmn.iosadapters.android.content.ContextContainer;

public class CacheProcessorAddInDatabase extends BaseCacheProcessorAdd {
    public void process(@NonNull ContextContainer contextContainer, @NonNull CacheInput cacheInput, @NonNull CacheOutput cacheOutput, @NonNull IActionProcessorListener<CacheOutput> iActionProcessorListener) {
        cacheInput.getMethodDescriptor().getCacheAccessDescriptor();
        getNonNullDocumentToAddInCache(cacheInput);
        iActionProcessorListener.onActionProcessed(this, cacheOutput);
    }
}
