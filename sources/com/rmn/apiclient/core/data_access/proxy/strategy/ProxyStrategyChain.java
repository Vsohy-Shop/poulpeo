package com.rmn.apiclient.core.data_access.proxy.strategy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor;
import com.rmn.apiclient.core.data_access.base.strategy.BaseStrategyChain;
import com.rmn.apiclient.core.data_access.base.strategy.StrategyChain;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import java.util.List;

public class ProxyStrategyChain extends StrategyChain<ProxyInput, ProxyOutput> {
    public ProxyStrategyChain(@Nullable List<BaseActionProcessor<ProxyInput, ProxyOutput>> list) {
        super(list);
    }

    public ProxyStrategyChain(@NonNull BaseStrategyChain<ProxyInput, ProxyOutput> baseStrategyChain) {
        super(baseStrategyChain);
    }
}
