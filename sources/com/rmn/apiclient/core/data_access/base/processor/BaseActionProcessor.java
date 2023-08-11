package com.rmn.apiclient.core.data_access.base.processor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.descriptor.IDocumentDescriptor;
import com.rmn.apiclient.core.data.serializer.IDocumentSerializer;
import com.rmn.apiclient.core.data_access.base.call.BaseInput;
import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.Objects;

public abstract class BaseActionProcessor<I extends BaseInput<?, ?>, O extends BaseOutput<?>> {
    private boolean mustInterruptCallIfCantProcess = true;
    private boolean mustInterruptCallOnFailure = true;
    private boolean mustInterruptCallOnSuccess = false;

    public abstract boolean canProcessAction(@NonNull I i, @NonNull O o);

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return getClass().equals(obj.getClass());
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final IDocumentSerializer getDocumentSerializer(I i) {
        IDocumentDescriptor iDocumentDescriptor = i.getMethodDescriptor().documentDescriptor;
        if (iDocumentDescriptor != null) {
            return iDocumentDescriptor.getSerializer();
        }
        throw new IllegalStateException("No descriptor have been provided for the action processor");
    }

    public int hashCode() {
        return Objects.hash(new Object[]{getClass()});
    }

    public boolean isMustInterruptCallOnFailure() {
        return this.mustInterruptCallOnFailure;
    }

    public boolean isMustInterruptCallOnSuccess() {
        return this.mustInterruptCallOnSuccess;
    }

    public boolean mustInterruptCallIfCantProcess() {
        return this.mustInterruptCallIfCantProcess;
    }

    public abstract void process(@NonNull ContextContainer contextContainer, @NonNull I i, @NonNull O o, @NonNull IActionProcessorListener<O> iActionProcessorListener);

    @NonNull
    public BaseActionProcessor<I, O> setMustInterrupt(boolean z, boolean z2, boolean z3) {
        this.mustInterruptCallIfCantProcess = z;
        this.mustInterruptCallOnSuccess = z2;
        this.mustInterruptCallOnFailure = z3;
        return this;
    }
}
