package com.rmn.apiclient.core.data_access.base.strategy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.BaseInput;
import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class BaseStrategyChain<I extends BaseInput<?, ?>, O extends BaseOutput<?>> {
    @NonNull
    private final List<BaseActionProcessor<I, O>> actions;

    protected BaseStrategyChain(@Nullable List<BaseActionProcessor<I, O>> list) {
        ArrayList arrayList = new ArrayList();
        this.actions = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseStrategyChain)) {
            return false;
        }
        return this.actions.equals(((BaseStrategyChain) obj).actions);
    }

    @NonNull
    public final List<BaseActionProcessor<I, O>> getActions() {
        return new ArrayList(this.actions);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.actions});
    }

    public BaseStrategyChain(@NonNull BaseStrategyChain<I, O> baseStrategyChain) {
        this(baseStrategyChain.actions);
    }
}
