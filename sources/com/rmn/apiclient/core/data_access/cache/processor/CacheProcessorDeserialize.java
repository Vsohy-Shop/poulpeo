package com.rmn.apiclient.core.data_access.cache.processor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.base.processor.ProcessorDeserializeManager;
import com.rmn.apiclient.core.data_access.cache.call.CacheInput;
import com.rmn.apiclient.core.data_access.cache.call.CacheOutput;
import com.rmn.apiclient.core.data_access.cache.call.CacheOutputFactory;
import com.rmn.iosadapters.android.content.ContextContainer;

public class CacheProcessorDeserialize extends BaseCacheActionProcessor {
    public void process(@NonNull ContextContainer contextContainer, @NonNull CacheInput cacheInput, @NonNull CacheOutput cacheOutput, @NonNull IActionProcessorListener<CacheOutput> iActionProcessorListener) {
        ProcessorDeserializeManager.processDeserialize(this, getDocumentSerializer(cacheInput), cacheOutput, -1, iActionProcessorListener, CacheOutputFactory.instance);
    }
}
