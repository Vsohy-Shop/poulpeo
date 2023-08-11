package com.rmn.apiclient.core.data_access.base.strategy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.BaseInput;
import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor;
import java.util.List;

public class StrategyChain<I extends BaseInput<?, ?>, O extends BaseOutput<?>> extends BaseStrategyChain<I, O> {
    public StrategyChain(@Nullable List<BaseActionProcessor<I, O>> list) {
        super(list);
    }

    public StrategyChain(@NonNull BaseStrategyChain<I, O> baseStrategyChain) {
        this(baseStrategyChain.getActions());
    }
}
