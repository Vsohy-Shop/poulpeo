package com.rmn.apiclient.core.data_access.cache.strategy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor;
import com.rmn.apiclient.core.data_access.base.strategy.BaseStrategyChain;
import com.rmn.apiclient.core.data_access.base.strategy.StrategyChain;
import com.rmn.apiclient.core.data_access.cache.call.CacheInput;
import com.rmn.apiclient.core.data_access.cache.call.CacheOutput;
import java.util.List;

public class CacheStrategyChain extends StrategyChain<CacheInput, CacheOutput> {
    public CacheStrategyChain(@Nullable List<BaseActionProcessor<CacheInput, CacheOutput>> list) {
        super(list);
    }

    public CacheStrategyChain(@NonNull BaseStrategyChain<CacheInput, CacheOutput> baseStrategyChain) {
        super(baseStrategyChain);
    }
}
