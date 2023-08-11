package com.rmn.api.p322v2.poulpeo.user;

import com.rmn.api.p322v2.common.model.PinnedObject;
import com.rmn.api.p322v2.common.pinned_object.PinnedObjectAction;
import com.rmn.api.p322v2.common.pinned_object.PinnedObjectModel;
import com.rmn.api.p322v2.common.pinned_object.PinnedObjectType;
import com.rmn.api.p322v2.common.pinned_object.PinnedObjectsManager;
import com.rmn.api.p322v2.common.pinned_object.PinnedObjectsMultipleManager;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.model.ModelRef;
import com.rmn.api.p322v2.main.oauth.OAuthAccountManager;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPPinnedObject;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPPinnedObject;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.rmn.api.v2.poulpeo.user.PLPPinnedObjectsManager */
public class PLPPinnedObjectsManager extends PinnedObjectsMultipleManager {
    protected static PLPPinnedObjectsManager instance;

    private PLPPinnedObjectsManager(ContextContainer contextContainer) {
        super(contextContainer);
    }

    public static PLPPinnedObjectsManager getInstance(ContextContainer contextContainer) {
        if (instance == null) {
            synchronized (PinnedObjectsManager.class) {
                if (instance == null) {
                    instance = new PLPPinnedObjectsManager(contextContainer);
                }
            }
        }
        return instance;
    }

    /* access modifiers changed from: protected */
    public CacheBundleInputAdd getCacheBundleInputAdd() {
        CacheBundleInputAdd cacheBundleInputAdd = new CacheBundleInputAdd(this.contextContainer, CacheMethodsPLPPinnedObject.GET_LIST, CacheBundleInputAdd.AddOption.REPLACE_IF_EXISTING);
        PinnedObject[] pinnedObjectArr = new PinnedObject[this.localPinnedObjects.size()];
        int i = 0;
        for (ModelRef<PinnedObject> modelRef : this.localPinnedObjects) {
            pinnedObjectArr[i] = (PinnedObject) modelRef.get();
            i++;
        }
        cacheBundleInputAdd.addObjectToStore(PLPMethodReturns.PLP_PINNED_OBJECT_ARRAY, pinnedObjectArr);
        return cacheBundleInputAdd;
    }

    /* access modifiers changed from: protected */
    public ICacheMethodType getCacheMethodGetList() {
        return CacheMethodsPLPPinnedObject.GET_LIST;
    }

    /* access modifiers changed from: protected */
    public ProxyBundleInput getProxyInputGetList(ProxyBundleInput.ProxySourcesOption proxySourcesOption, LogoutListener logoutListener) {
        return new ProxyBundleInput(this.contextContainer, ProxyMethodsPLPPinnedObject.PLP_PINNED_OBJECT_GET_LIST, proxySourcesOption, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, logoutListener);
    }

    /* access modifiers changed from: protected */
    public ProxyBundleInput getProxyInputSend(PinnedObjectAction pinnedObjectAction, List<PinnedObject> list, PinnedObjectType pinnedObjectType, PinnedObjectModel pinnedObjectModel, LogoutListener logoutListener) {
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(this.contextContainer, getSendMethodType(pinnedObjectAction), ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, logoutListener);
        ArrayList arrayList = new ArrayList();
        for (PinnedObject modelId : list) {
            arrayList.add(String.valueOf(modelId.getModelId()));
        }
        proxyBundleInput.addParamValue(PLPMethodParameters.IDS_ARRAY_REQUIRED, arrayList);
        proxyBundleInput.addParamValue(PLPMethodParameters.PLP_PINNED_OBJECT_TYPE_REQUIRED, pinnedObjectType.getJSONValue());
        proxyBundleInput.addParamValue(PLPMethodParameters.PLP_PINNED_OBJECT_MODEL_REQUIRED, pinnedObjectModel.getJSONValue());
        return proxyBundleInput;
    }

    /* access modifiers changed from: protected */
    public PinnedObject[] getResponseObjectGetList(ProxyBundleOutput proxyBundleOutput) {
        return (PinnedObject[]) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_PINNED_OBJECT_ARRAY);
    }

    /* access modifiers changed from: protected */
    public IProxyMethodType getSendMethodType(PinnedObjectAction pinnedObjectAction) {
        if (pinnedObjectAction == PinnedObjectAction.ADD) {
            return ProxyMethodsPLPPinnedObject.PLP_PINNED_OBJECTS_ADD;
        }
        if (pinnedObjectAction == PinnedObjectAction.REMOVE) {
            return ProxyMethodsPLPPinnedObject.PLP_PINNED_OBJECT_REMOVE;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean isLogged() {
        return OAuthAccountManager.getInstance().isConnectedToAccount(PLPApiType.PLP);
    }
}
