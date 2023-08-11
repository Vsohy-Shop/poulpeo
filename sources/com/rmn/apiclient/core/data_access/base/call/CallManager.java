package com.rmn.apiclient.core.data_access.base.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCompleteListener;
import com.rmn.apiclient.core.data_access.base.descriptor.BaseMethodDescriptor;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyCall;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CallManager implements OnCompleteListener<ProxyInput, ProxyOutput> {
    @Nullable
    private static CallManager DEFAULT_CALL_MANAGER;
    @NonNull
    private final Set<ProxyCall> calls = new HashSet();
    @NonNull
    private final ContextContainer contextContainer;

    /* renamed from: com.rmn.apiclient.core.data_access.base.call.CallManager$a */
    class C11586a extends HashSet<ProxyCall> {

        /* renamed from: b */
        final /* synthetic */ ProxyCall f18029b;

        C11586a(ProxyCall proxyCall) {
            this.f18029b = proxyCall;
            add(proxyCall);
        }
    }

    public CallManager(@NonNull ContextContainer contextContainer2) {
        this.contextContainer = contextContainer2;
    }

    private void cancelCalls(@NonNull Set<ProxyCall> set) {
        for (ProxyCall remove : set) {
            this.calls.remove(remove);
        }
        for (ProxyCall cancel : set) {
            cancel.cancel();
        }
    }

    @NonNull
    public static CallManager getDefaultCallManager(@NonNull ContextContainer contextContainer2) {
        if (DEFAULT_CALL_MANAGER == null) {
            DEFAULT_CALL_MANAGER = new CallManager(contextContainer2);
        }
        return DEFAULT_CALL_MANAGER;
    }

    public ProxyCall call(@NonNull ProxyInput proxyInput) {
        for (ProxyCall next : this.calls) {
            if (((ProxyInput) next.getInput()).equals(proxyInput)) {
                return next;
            }
        }
        ProxyCall newCall = proxyInput.newCall((OnCompleteListener) this);
        this.calls.add(newCall);
        newCall.process(this.contextContainer);
        return newCall;
    }

    public void cancel(int i) {
        for (ProxyCall next : this.calls) {
            if (i == next.callId) {
                cancelCalls(new C11586a(next));
                return;
            }
        }
    }

    public void cancelAll() {
        cancelCalls(new HashSet(this.calls));
    }

    public void cancelAllForMethod(@NonNull BaseMethodDescriptor baseMethodDescriptor) {
        HashSet hashSet = new HashSet();
        for (ProxyCall next : this.calls) {
            if (((ProxyInput) next.getInput()).getMethodDescriptor() == baseMethodDescriptor) {
                hashSet.add(next);
            }
        }
        cancelCalls(hashSet);
    }

    public void cancelForMethod(@NonNull BaseMethodDescriptor baseMethodDescriptor, @Nullable ParamSet paramSet) {
        HashSet hashSet = new HashSet();
        for (ProxyCall next : this.calls) {
            if (((ProxyInput) next.getInput()).getMethodDescriptor() == baseMethodDescriptor && ((ProxyInput) next.getInput()).getParams().equals(paramSet)) {
                hashSet.add(next);
            }
        }
        cancelCalls(hashSet);
    }

    public void onComplete(@NonNull BaseCall<ProxyInput, ProxyOutput> baseCall) {
        this.calls.remove(baseCall);
    }

    public void cancel(Collection<Integer> collection) {
        HashSet hashSet = new HashSet();
        for (ProxyCall next : this.calls) {
            if (collection.contains(Integer.valueOf(next.callId))) {
                hashSet.add(next);
            }
        }
        cancelCalls(hashSet);
    }
}
