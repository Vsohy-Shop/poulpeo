package com.rmn.apiclient.core.data_access.service.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.APIParam;
import com.rmn.apiclient.core.data_access.base.call.BaseInput;
import com.rmn.apiclient.core.data_access.base.call.BodyContainer;
import com.rmn.apiclient.core.data_access.base.call.ParamSet;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCompleteListener;
import com.rmn.apiclient.core.data_access.base.strategy.StrategyChain;
import com.rmn.apiclient.core.data_access.service.descriptor.ServiceMethodDescriptor;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class ServiceInput extends BaseInput<ServiceInput, ServiceOutput> {

    public static final class Builder {
        @Nullable
        private BodyContainer<?> body;
        @Nullable
        private Map<String, String> headers;
        @NonNull
        private final ServiceMethodDescriptor methodDescriptor;
        @NonNull
        private final Set<APIParam<?>> params = new HashSet();
        @NonNull
        private final StrategyChain<ServiceInput, ServiceOutput> strategy;

        public Builder(@NonNull ServiceMethodDescriptor serviceMethodDescriptor, @NonNull StrategyChain<ServiceInput, ServiceOutput> strategyChain) {
            this.methodDescriptor = serviceMethodDescriptor;
            this.strategy = strategyChain;
        }

        @NonNull
        public Builder addParam(@NonNull APIParam<?> aPIParam) {
            this.params.add(aPIParam);
            return this;
        }

        @NonNull
        public Builder addParamSet(@NonNull ParamSet paramSet) {
            this.params.addAll(paramSet.getParams());
            return this;
        }

        @NonNull
        public ServiceInput build() {
            return new ServiceInput(this.methodDescriptor, this.strategy, new ParamSet(this.params), this.body, this.headers);
        }

        @NonNull
        public Builder setBody(@Nullable BodyContainer<?> bodyContainer) {
            this.body = bodyContainer;
            return this;
        }

        @NonNull
        public Builder setHeaders(@NonNull Map<String, String> map) {
            this.headers = map;
            return this;
        }
    }

    public void callService(@NonNull ServiceCallListener serviceCallListener) {
        getMethodDescriptor().getHttpCallManager().call(this, serviceCallListener);
    }

    private ServiceInput(@NonNull ServiceMethodDescriptor serviceMethodDescriptor, @NonNull StrategyChain<ServiceInput, ServiceOutput> strategyChain, @NonNull ParamSet paramSet, @Nullable BodyContainer<?> bodyContainer, @Nullable Map<String, String> map) {
        super(serviceMethodDescriptor, strategyChain, paramSet, bodyContainer, map);
    }

    @NonNull
    public ServiceMethodDescriptor getMethodDescriptor() {
        return (ServiceMethodDescriptor) super.getMethodDescriptor();
    }

    @NonNull
    public ServiceCall newCall(@Nullable OnCompleteListener<ServiceInput, ServiceOutput> onCompleteListener) {
        return new ServiceCall(this, onCompleteListener);
    }
}
