package com.rmn.apiclient.core.data_access.cache.strategy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor;
import com.rmn.apiclient.core.data_access.cache.call.CacheInput;
import com.rmn.apiclient.core.data_access.cache.call.CacheOutput;
import com.rmn.apiclient.core.data_access.cache.processor.CacheProcessorAddInDatabase;
import com.rmn.apiclient.core.data_access.cache.processor.CacheProcessorAddInMemory;
import com.rmn.apiclient.core.data_access.cache.processor.CacheProcessorClearInDatabase;
import com.rmn.apiclient.core.data_access.cache.processor.CacheProcessorClearInMemory;
import com.rmn.apiclient.core.data_access.cache.processor.CacheProcessorDeserialize;
import com.rmn.apiclient.core.data_access.cache.processor.CacheProcessorGetFromDatabase;
import com.rmn.apiclient.core.data_access.cache.processor.CacheProcessorGetFromMemory;
import java.util.List;

public final class CacheStrategy {

    public static class CacheStrategyAddedInMemory extends CacheStrategyChain {
        @NonNull
        public CacheStrategyChain thenAddInDatabase() {
            return new CacheStrategyChain((List<BaseActionProcessor<CacheInput, CacheOutput>>) new CacheActionProcessorList(getActions(), new CacheProcessorAddInDatabase()));
        }

        private CacheStrategyAddedInMemory(@Nullable CacheActionProcessorList cacheActionProcessorList) {
            super((List<BaseActionProcessor<CacheInput, CacheOutput>>) cacheActionProcessorList);
        }
    }

    public static class CacheStrategyClearedInMemory extends CacheStrategyChain {
        @NonNull
        public CacheStrategyChain thenClearInDatabase() {
            return new CacheStrategyChain((List<BaseActionProcessor<CacheInput, CacheOutput>>) new CacheActionProcessorList(getActions(), new CacheProcessorClearInDatabase()));
        }

        private CacheStrategyClearedInMemory(@Nullable CacheActionProcessorList cacheActionProcessorList) {
            super((List<BaseActionProcessor<CacheInput, CacheOutput>>) cacheActionProcessorList);
        }
    }

    public static class CacheStrategyDataFromMemory extends CacheStrategyChain {
        @NonNull
        public CacheStrategyRawData orThenGetFromDatabase() {
            return new CacheStrategyRawData(new CacheActionProcessorList(getActions(), new CacheProcessorGetFromDatabase()));
        }

        private CacheStrategyDataFromMemory(@Nullable CacheActionProcessorList cacheActionProcessorList) {
            super((List<BaseActionProcessor<CacheInput, CacheOutput>>) cacheActionProcessorList);
        }
    }

    public static class CacheStrategyDeserializedData extends CacheStrategyChain {
        @NonNull
        public CacheStrategyChain thenAddInMemory() {
            return new CacheStrategyChain((List<BaseActionProcessor<CacheInput, CacheOutput>>) new CacheActionProcessorList(getActions(), new CacheProcessorAddInMemory()));
        }

        private CacheStrategyDeserializedData(@Nullable CacheActionProcessorList cacheActionProcessorList) {
            super((List<BaseActionProcessor<CacheInput, CacheOutput>>) cacheActionProcessorList);
        }
    }

    public static class CacheStrategyRawData extends CacheStrategyChain {
        @NonNull
        public CacheStrategyDeserializedData thenDeserialize() {
            return new CacheStrategyDeserializedData(new CacheActionProcessorList(getActions(), new CacheProcessorDeserialize()));
        }

        private CacheStrategyRawData(@Nullable CacheActionProcessorList cacheActionProcessorList) {
            super((List<BaseActionProcessor<CacheInput, CacheOutput>>) cacheActionProcessorList);
        }
    }

    private CacheStrategy() {
    }

    @NonNull
    public static CacheStrategyChain addInDatabase() {
        return new CacheStrategyChain((List<BaseActionProcessor<CacheInput, CacheOutput>>) new CacheActionProcessorList(new CacheProcessorAddInDatabase()));
    }

    @NonNull
    public static CacheStrategyAddedInMemory addInMemory() {
        return new CacheStrategyAddedInMemory(new CacheActionProcessorList(new CacheProcessorAddInMemory()));
    }

    @NonNull
    public static CacheStrategyChain clearInDatabase() {
        return new CacheStrategyChain((List<BaseActionProcessor<CacheInput, CacheOutput>>) new CacheActionProcessorList(new CacheProcessorClearInDatabase()));
    }

    @NonNull
    public static CacheStrategyClearedInMemory clearInMemory() {
        return new CacheStrategyClearedInMemory(new CacheActionProcessorList(new CacheProcessorClearInMemory()));
    }

    @NonNull
    public static CacheStrategyDataFromMemory getFromMemory() {
        return new CacheStrategyDataFromMemory(new CacheActionProcessorList(new CacheProcessorGetFromMemory().setMustInterrupt(false, true, false)));
    }
}
