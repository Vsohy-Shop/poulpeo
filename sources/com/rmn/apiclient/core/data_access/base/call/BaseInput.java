package com.rmn.apiclient.core.data_access.base.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.BaseInput;
import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCompleteListener;
import com.rmn.apiclient.core.data_access.base.descriptor.BaseMethodDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptor;
import com.rmn.apiclient.core.data_access.base.strategy.StrategyChain;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class BaseInput<I extends BaseInput<I, O>, O extends BaseOutput<I>> {
    @NonNull
    private final BodyContainer<?> body;
    @Nullable
    private final Map<String, String> headers;
    @NonNull
    private final BaseMethodDescriptor methodDescriptor;
    @NonNull
    private final ParamSet params;
    @NonNull
    private final StrategyChain<I, O> strategy;

    protected BaseInput(@NonNull BaseMethodDescriptor baseMethodDescriptor, @NonNull StrategyChain<I, O> strategyChain, @NonNull ParamSet paramSet, @Nullable BodyContainer<?> bodyContainer, @Nullable Map<String, String> map) {
        HashMap hashMap;
        this.methodDescriptor = baseMethodDescriptor;
        this.strategy = strategyChain;
        this.params = paramSet;
        this.body = bodyContainer == null ? new BodyContainer<>() : bodyContainer;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = null;
        }
        this.headers = hashMap;
        checkParamsValidity();
    }

    private void checkParamsValidity() {
        for (ParamDescriptor next : this.methodDescriptor.paramDescriptors.getMandatoryParamDescriptors()) {
            if (this.params.findParam(next.name, next.type) == null) {
                throw new IllegalStateException("When creating an input, the mandatory param " + next.name + " (" + next.type + ") was not provided");
            }
        }
        Iterator<APIParam<?>> it = this.params.iterator();
        while (it.hasNext()) {
            APIParam next2 = it.next();
            ParamDescriptor<?> findParamDescriptor = this.methodDescriptor.paramDescriptors.findParamDescriptor(next2.name);
            if (findParamDescriptor != null) {
                Class type = next2.getType();
                if (type != null && !findParamDescriptor.type.isAssignableFrom(type)) {
                    throw new IllegalStateException("When creating an input, the param " + next2.name + " (" + type + ") was added but the type is different from the param descriptor type (" + findParamDescriptor.type + ")");
                }
            } else {
                throw new IllegalStateException("When creating an input, the param " + next2.name + " was added but it doesn't exist in param descriptor set");
            }
        }
    }

    @NonNull
    public final BaseCall<I, O> call(@NonNull ContextContainer contextContainer) {
        BaseCall<I, O> newCall = newCall((OnCompleteListener) null);
        newCall.process(contextContainer);
        return newCall;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseInput)) {
            return false;
        }
        BaseInput baseInput = (BaseInput) obj;
        if (!this.methodDescriptor.equals(baseInput.methodDescriptor) || !this.strategy.equals(baseInput.strategy) || !this.params.equals(baseInput.params) || !this.body.equals(baseInput.body) || !Objects.equals(this.headers, baseInput.headers)) {
            return false;
        }
        return true;
    }

    @NonNull
    public BodyContainer<?> getBody() {
        return this.body;
    }

    @Nullable
    public final Map<String, String> getHeaders() {
        if (this.headers != null) {
            return new HashMap(this.headers);
        }
        return null;
    }

    @NonNull
    public BaseMethodDescriptor getMethodDescriptor() {
        return this.methodDescriptor;
    }

    @NonNull
    public ParamSet getParams() {
        return this.params;
    }

    @NonNull
    public final Set<APIParam<?>> getParamsForParamType(@NonNull ParamType paramType) {
        APIParam<?> findParam;
        HashSet hashSet = new HashSet();
        Iterator<ParamDescriptor<?>> it = this.methodDescriptor.paramDescriptors.iterator();
        while (it.hasNext()) {
            ParamDescriptor next = it.next();
            if (next.paramType == paramType && (findParam = this.params.findParam(next.name, next.type)) != null) {
                hashSet.add(findParam);
            }
        }
        return hashSet;
    }

    @NonNull
    public StrategyChain<I, O> getStrategy() {
        return this.strategy;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.methodDescriptor, this.strategy, this.params, this.body, this.headers});
    }

    @NonNull
    public abstract BaseCall<I, O> newCall(@Nullable OnCompleteListener<I, O> onCompleteListener);
}
