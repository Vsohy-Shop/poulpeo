package com.rmn.apiclient.core.data_access.service.strategy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor;
import com.rmn.apiclient.core.data_access.base.strategy.BaseStrategyChain;
import com.rmn.apiclient.core.data_access.base.strategy.StrategyChain;
import com.rmn.apiclient.core.data_access.service.call.ServiceInput;
import com.rmn.apiclient.core.data_access.service.call.ServiceOutput;
import java.util.List;

public class ServiceStrategyChain extends StrategyChain<ServiceInput, ServiceOutput> {
    public ServiceStrategyChain(@Nullable List<BaseActionProcessor<ServiceInput, ServiceOutput>> list) {
        super(list);
    }

    public ServiceStrategyChain(@NonNull BaseStrategyChain<ServiceInput, ServiceOutput> baseStrategyChain) {
        super(baseStrategyChain);
    }
}
