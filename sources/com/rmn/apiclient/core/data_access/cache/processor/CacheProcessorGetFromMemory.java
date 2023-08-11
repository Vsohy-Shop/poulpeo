package com.rmn.apiclient.core.data_access.cache.processor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data.structure.IResource;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.OutputStatus;
import com.rmn.apiclient.core.data_access.base.call.exceptions.NotFoundInCacheCallException;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.base.processor.ProcessorDeserializeManager;
import com.rmn.apiclient.core.data_access.cache.access.BaseCacheAccessDescriptor;
import com.rmn.apiclient.core.data_access.cache.call.CacheInput;
import com.rmn.apiclient.core.data_access.cache.call.CacheOutput;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheMethods;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheModels;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.Iterator;

public class CacheProcessorGetFromMemory extends BaseCacheActionProcessor {
    public boolean canProcessAction(@NonNull CacheInput cacheInput, @NonNull CacheOutput cacheOutput) {
        return true;
    }

    public void process(@NonNull ContextContainer contextContainer, @NonNull CacheInput cacheInput, @NonNull CacheOutput cacheOutput, @NonNull IActionProcessorListener<CacheOutput> iActionProcessorListener) {
        BaseCacheAccessDescriptor cacheAccessDescriptor = cacheInput.getMethodDescriptor().getCacheAccessDescriptor();
        MemoryCacheMethods memoryCacheMethods = cacheInput.getMethodDescriptor().getCacheAccessDescriptor().getMemoryCacheMethods();
        IDocument iDocument = memoryCacheMethods != null ? (IDocument) memoryCacheMethods.getElement(cacheInput.getMethodDescriptor(), cacheAccessDescriptor.extractInputParamsForCacheAccess(cacheInput)) : null;
        if (iDocument == null) {
            iActionProcessorListener.onActionProcessed(this, CacheOutput.Builder.newBuilder(cacheOutput, OutputStatus.FAILURE).setException((CallException) new NotFoundInCacheCallException()).build());
            return;
        }
        MemoryCacheModels<?> memoryCacheModels = cacheAccessDescriptor.getMemoryCacheModels();
        if (memoryCacheModels != null) {
            Iterator<IResource<?>> it = iDocument.getDataResources().iterator();
            while (it.hasNext()) {
                IResource next = it.next();
                memoryCacheModels.addOrReplaceModel(next.getResourceDescriptor(), next.getModel(), BaseCacheActionProcessor.extractFieldsFilter(next, cacheInput));
            }
            Iterator<IResource<?>> it2 = iDocument.getIncludedResources().iterator();
            while (it2.hasNext()) {
                IResource next2 = it2.next();
                memoryCacheModels.addOrReplaceModel(next2.getResourceDescriptor(), next2.getModel(), BaseCacheActionProcessor.extractFieldsFilter(next2, cacheInput));
            }
        }
        ProcessorDeserializeManager.processResolveRelationships(this, cacheInput.getMethodDescriptor().documentDescriptor, iDocument);
        iActionProcessorListener.onActionProcessed(this, CacheOutput.Builder.newBuilder(cacheOutput, OutputStatus.SUCCESS).setDocument(iDocument).build());
    }
}
