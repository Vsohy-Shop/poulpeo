package com.rmn.apiclient.core.data_access.cache.processor;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data.structure.IResource;
import com.rmn.apiclient.core.data.structure.ResourceList;
import com.rmn.apiclient.core.data_access.base.call.BaseInput;
import com.rmn.apiclient.core.data_access.base.call.OutputStatus;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.base.processor.ProcessorDeserializeManager;
import com.rmn.apiclient.core.data_access.cache.access.BaseCacheAccessDescriptor;
import com.rmn.apiclient.core.data_access.cache.call.CacheInput;
import com.rmn.apiclient.core.data_access.cache.call.CacheOutput;
import com.rmn.apiclient.core.data_access.cache.descriptor.CacheMethodDescriptor;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheMethods;
import com.rmn.apiclient.core.data_access.cache.memory.MemoryCacheModels;
import com.rmn.apiclient.core.model.ModelReference;
import com.rmn.apiclient.impl.jsonapi.descriptor.JSONAPIDocumentDescriptor;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CacheProcessorAddInMemory extends BaseCacheProcessorAdd {
    private ResourceList addOrReplaceModelReferencesInCache(@NonNull ResourceList resourceList, @NonNull MemoryCacheModels memoryCacheModels, @NonNull BaseInput baseInput) {
        ModelReference<M> modelReference;
        ArrayList arrayList = new ArrayList();
        Iterator<IResource<?>> it = resourceList.iterator();
        while (it.hasNext()) {
            IResource next = it.next();
            Set<String> extractFieldsFilter = BaseCacheActionProcessor.extractFieldsFilter(next, baseInput);
            String newCacheId = ModelReference.newCacheId(next.getResourceId().getId(), extractFieldsFilter);
            if (memoryCacheModels.getElement(next.getResourceDescriptor(), newCacheId) != null) {
                modelReference = memoryCacheModels.addOrReplaceModel(next.getResourceDescriptor(), next.getModel(), extractFieldsFilter);
            } else {
                modelReference = next.getModelReference();
                memoryCacheModels.addOrReplaceElement(next.getResourceDescriptor(), newCacheId, modelReference);
            }
            arrayList.add(next.copy(modelReference));
        }
        return new ResourceList((List<IResource<?>>) arrayList);
    }

    public void process(@NonNull ContextContainer contextContainer, @NonNull CacheInput cacheInput, @NonNull CacheOutput cacheOutput, @NonNull IActionProcessorListener<CacheOutput> iActionProcessorListener) {
        CacheMethodDescriptor methodDescriptor = cacheInput.getMethodDescriptor();
        BaseCacheAccessDescriptor cacheAccessDescriptor = methodDescriptor.getCacheAccessDescriptor();
        IDocument nonNullDocumentToAddInCache = getNonNullDocumentToAddInCache(cacheInput);
        MemoryCacheModels<?> memoryCacheModels = cacheAccessDescriptor.getMemoryCacheModels();
        if (memoryCacheModels != null) {
            nonNullDocumentToAddInCache = nonNullDocumentToAddInCache.copy(addOrReplaceModelReferencesInCache(nonNullDocumentToAddInCache.getDataResources(), memoryCacheModels, cacheInput), addOrReplaceModelReferencesInCache(nonNullDocumentToAddInCache.getIncludedResources(), memoryCacheModels, cacheInput));
            JSONAPIDocumentDescriptor jSONAPIDocumentDescriptor = (JSONAPIDocumentDescriptor) cacheInput.getMethodDescriptor().documentDescriptor;
            if (jSONAPIDocumentDescriptor != null) {
                Iterator<IResource<?>> it = nonNullDocumentToAddInCache.getDataResources().iterator();
                while (it.hasNext()) {
                    ProcessorDeserializeManager.assignModelRelationships(nonNullDocumentToAddInCache, jSONAPIDocumentDescriptor.resourceDescriptors, it.next());
                }
            }
        }
        MemoryCacheMethods memoryCacheMethods = cacheAccessDescriptor.getMemoryCacheMethods();
        if (memoryCacheMethods == null) {
            iActionProcessorListener.onActionProcessed(this, cacheOutput);
            return;
        }
        memoryCacheMethods.addOrReplaceElement(methodDescriptor, cacheAccessDescriptor.extractInputParamsForCacheAccess(cacheInput), nonNullDocumentToAddInCache);
        iActionProcessorListener.onActionProcessed(this, CacheOutput.Builder.newBuilder(cacheOutput, OutputStatus.SUCCESS).setDocument(nonNullDocumentToAddInCache).build());
    }
}
