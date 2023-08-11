package com.rmn.apiclient.core.data_access.proxy.strategy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.processor.ProxyProcessorAddToCache;
import com.rmn.apiclient.core.data_access.proxy.processor.ProxyProcessorCallService;
import com.rmn.apiclient.core.data_access.proxy.processor.ProxyProcessorClearCache;
import com.rmn.apiclient.core.data_access.proxy.processor.ProxyProcessorGetFromCache;
import com.rmn.apiclient.core.data_access.proxy.processor.ProxyProcessorGetRemoteImageConfig;
import java.util.List;

public final class ProxyStrategy {

    public static class BaseStrategyNoData extends ProxyStrategyChain {
        @NonNull
        public ProxyStrategyServiceData thenCallService() {
            return new ProxyStrategyServiceData(new ProxyActionProcessorList(getActions(), new ProxyProcessorCallService()));
        }

        private BaseStrategyNoData(@Nullable ProxyActionProcessorList proxyActionProcessorList) {
            super((List<BaseActionProcessor<ProxyInput, ProxyOutput>>) proxyActionProcessorList);
        }
    }

    public static class ProxyStrategyCacheData extends ProxyStrategyChain {
        @NonNull
        public ProxyStrategyServiceData orThenCallService() {
            return new ProxyStrategyServiceData(new ProxyActionProcessorList(getActions(), new ProxyProcessorCallService()));
        }

        private ProxyStrategyCacheData(@Nullable ProxyActionProcessorList proxyActionProcessorList) {
            super((List<BaseActionProcessor<ProxyInput, ProxyOutput>>) proxyActionProcessorList);
        }
    }

    public static class ProxyStrategyServiceData extends ProxyStrategyChain {
        @NonNull
        public ProxyStrategyChain thenAddInCache() {
            return new ProxyStrategyChain((List<BaseActionProcessor<ProxyInput, ProxyOutput>>) new ProxyActionProcessorList(getActions(), new ProxyProcessorAddToCache()));
        }

        private ProxyStrategyServiceData(@Nullable ProxyActionProcessorList proxyActionProcessorList) {
            super((List<BaseActionProcessor<ProxyInput, ProxyOutput>>) proxyActionProcessorList);
        }
    }

    public static class ProxyStrategyServiceOnlyData extends ProxyStrategyChain {
        @NonNull
        public ProxyStrategyChain thenAddInCache() {
            return new ProxyStrategyChain((List<BaseActionProcessor<ProxyInput, ProxyOutput>>) new ProxyActionProcessorList(getActions(), new ProxyProcessorAddToCache()));
        }

        @NonNull
        public ProxyStrategyChain thenClearCache() {
            return new ProxyStrategyServiceData(new ProxyActionProcessorList(getActions(), new ProxyProcessorClearCache()));
        }

        private ProxyStrategyServiceOnlyData(@Nullable ProxyActionProcessorList proxyActionProcessorList) {
            super((List<BaseActionProcessor<ProxyInput, ProxyOutput>>) proxyActionProcessorList);
        }
    }

    private ProxyStrategy() {
    }

    @NonNull
    public static ProxyStrategyServiceOnlyData callService() {
        return new ProxyStrategyServiceOnlyData(new ProxyActionProcessorList(new ProxyProcessorGetRemoteImageConfig().setMustInterrupt(false, false, true), new ProxyProcessorCallService()));
    }

    @NonNull
    public static BaseStrategyNoData clearCache() {
        return new BaseStrategyNoData(new ProxyActionProcessorList(new ProxyProcessorGetRemoteImageConfig().setMustInterrupt(false, false, true), new ProxyProcessorClearCache()));
    }

    @NonNull
    public static ProxyStrategyCacheData getFromCache() {
        return new ProxyStrategyCacheData(new ProxyActionProcessorList(new ProxyProcessorGetRemoteImageConfig().setMustInterrupt(false, false, true), new ProxyProcessorGetFromCache().setMustInterrupt(false, true, false)));
    }

    @NonNull
    public static ProxyStrategyChain getThenStoreConfig() {
        return new ProxyStrategyChain((List<BaseActionProcessor<ProxyInput, ProxyOutput>>) new ProxyActionProcessorList(new ProxyProcessorGetFromCache().setMustInterrupt(false, true, false), new ProxyProcessorCallService(), new ProxyProcessorAddToCache()));
    }
}
