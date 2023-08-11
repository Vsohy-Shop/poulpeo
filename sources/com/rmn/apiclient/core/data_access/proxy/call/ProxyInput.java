package com.rmn.apiclient.core.data_access.proxy.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.APIParam;
import com.rmn.apiclient.core.data_access.base.call.BaseInput;
import com.rmn.apiclient.core.data_access.base.call.BodyContainer;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.data_access.base.call.ParamSet;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCompleteListener;
import com.rmn.apiclient.core.data_access.base.strategy.StrategyChain;
import com.rmn.apiclient.core.data_access.proxy.descriptor.ProxyMethodDescriptor;
import com.rmn.apiclient.core.login.ILogoutListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ProxyInput extends BaseInput<ProxyInput, ProxyOutput> {
    @Nullable
    public final ILogoutListener logoutListener;

    public static final class Builder {
        @Nullable
        private BodyContainer<?> body;
        @Nullable
        private Map<String, String> headers;
        @Nullable
        private ILogoutListener logoutListener;
        @NonNull
        private final ProxyMethodDescriptor methodDescriptor;
        @NonNull
        private final Set<APIParam<?>> params = new HashSet();
        @NonNull
        private final StrategyChain<ProxyInput, ProxyOutput> strategy;

        public Builder(@NonNull ProxyMethodDescriptor proxyMethodDescriptor, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
            this.methodDescriptor = proxyMethodDescriptor;
            this.strategy = strategyChain;
        }

        @NonNull
        public Builder addParam(@NonNull String str, @Nullable Object obj) {
            return addParam(new APIParam(str, obj));
        }

        @NonNull
        public Builder addParamSet(@NonNull ParamSet paramSet) {
            Iterator<APIParam<?>> it = paramSet.iterator();
            while (it.hasNext()) {
                addParam(it.next());
            }
            return this;
        }

        @NonNull
        public ProxyInput build() {
            return new ProxyInput(this.methodDescriptor, this.strategy, new ParamSet(this.params), this.body, this.logoutListener, this.headers);
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

        @NonNull
        public Builder setLogoutListener(@Nullable ILogoutListener iLogoutListener) {
            this.logoutListener = iLogoutListener;
            return this;
        }

        @NonNull
        public Builder addParam(@NonNull APIParam<?> aPIParam) {
            for (APIParam<?> aPIParam2 : this.params) {
                if (aPIParam.name.equals(aPIParam2.name)) {
                    throw new IllegalArgumentException("You already added the param " + aPIParam.name + " to the input of " + this.methodDescriptor.name);
                }
            }
            this.params.add(aPIParam);
            return this;
        }
    }

    @NonNull
    public ProxyCall call(@NonNull CallManager callManager) {
        return callManager.call(this);
    }

    private ProxyInput(@NonNull ProxyMethodDescriptor proxyMethodDescriptor, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain, @NonNull ParamSet paramSet, @Nullable BodyContainer<?> bodyContainer, @Nullable ILogoutListener iLogoutListener, @Nullable Map<String, String> map) {
        super(proxyMethodDescriptor, strategyChain, paramSet, bodyContainer, map);
        this.logoutListener = iLogoutListener;
    }

    @NonNull
    public ProxyMethodDescriptor getMethodDescriptor() {
        return (ProxyMethodDescriptor) super.getMethodDescriptor();
    }

    @NonNull
    public ProxyCall newCall(@Nullable OnCompleteListener<ProxyInput, ProxyOutput> onCompleteListener) {
        return new ProxyCall(this, onCompleteListener);
    }
}
