package com.rmn.apiclient.core.data_access.cache.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.APIParam;
import com.rmn.apiclient.core.data_access.base.call.BaseInput;
import com.rmn.apiclient.core.data_access.base.call.BodyContainer;
import com.rmn.apiclient.core.data_access.base.call.ParamSet;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCompleteListener;
import com.rmn.apiclient.core.data_access.base.strategy.StrategyChain;
import com.rmn.apiclient.core.data_access.cache.descriptor.CacheMethodDescriptor;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CacheInput extends BaseInput<CacheInput, CacheOutput> {

    public static final class Builder {
        @Nullable
        private BodyContainer<?> body;
        @Nullable
        private Map<String, String> headers;
        @NonNull
        private final CacheMethodDescriptor methodDescriptor;
        @NonNull
        private final Set<APIParam<?>> params = new HashSet();
        @NonNull
        private final StrategyChain<CacheInput, CacheOutput> strategy;

        public Builder(@NonNull CacheMethodDescriptor cacheMethodDescriptor, @NonNull StrategyChain<CacheInput, CacheOutput> strategyChain) {
            this.methodDescriptor = cacheMethodDescriptor;
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
        public CacheInput build() {
            return new CacheInput(this.methodDescriptor, this.strategy, new ParamSet(this.params), this.body, this.headers);
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

    public CacheInput(@NonNull CacheMethodDescriptor cacheMethodDescriptor, @NonNull StrategyChain<CacheInput, CacheOutput> strategyChain, @NonNull ParamSet paramSet, @Nullable BodyContainer<?> bodyContainer, @Nullable Map<String, String> map) {
        super(cacheMethodDescriptor, strategyChain, paramSet, bodyContainer, map);
    }

    @NonNull
    public CacheMethodDescriptor getMethodDescriptor() {
        return (CacheMethodDescriptor) super.getMethodDescriptor();
    }

    @NonNull
    public CacheCall newCall(@Nullable OnCompleteListener<CacheInput, CacheOutput> onCompleteListener) {
        return new CacheCall(this, onCompleteListener);
    }
}
