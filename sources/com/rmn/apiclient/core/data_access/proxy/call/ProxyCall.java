package com.rmn.apiclient.core.data_access.proxy.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.OutputStatus;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCanceledListener;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCompleteListener;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnFailureListener;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnSuccessListener;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import java.util.Collection;

public class ProxyCall extends BaseCall<ProxyInput, ProxyOutput> {
    public ProxyCall(@NonNull ProxyInput proxyInput) {
        super(proxyInput, (OnCompleteListener) null);
    }

    @NonNull
    public ProxyCall onCanceled(@NonNull OnCanceledListener onCanceledListener) {
        return (ProxyCall) super.addOnCanceledListener(onCanceledListener);
    }

    @NonNull
    public ProxyCall onComplete(@NonNull OnCompleteListener<ProxyInput, ProxyOutput> onCompleteListener) {
        return (ProxyCall) super.addOnCompleteListener(onCompleteListener);
    }

    @NonNull
    public ProxyCall onFailure(@NonNull OnFailureListener onFailureListener) {
        return (ProxyCall) super.addOnFailureListener(onFailureListener);
    }

    @NonNull
    public ProxyCall onSuccess(@NonNull OnSuccessListener<ProxyOutput> onSuccessListener) {
        return (ProxyCall) super.addOnSuccessListener(onSuccessListener);
    }

    @NonNull
    public ProxyCall registerCallId(Collection<Integer> collection) {
        collection.add(Integer.valueOf(this.callId));
        return this;
    }

    public ProxyCall(@NonNull ProxyInput proxyInput, @Nullable OnCompleteListener<ProxyInput, ProxyOutput> onCompleteListener) {
        super(proxyInput, onCompleteListener);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public ProxyOutput newOutput(@NonNull OutputStatus outputStatus, @Nullable CallException callException) {
        return new ProxyOutput.Builder((ProxyInput) getInput(), outputStatus).setException(callException).build();
    }
}
