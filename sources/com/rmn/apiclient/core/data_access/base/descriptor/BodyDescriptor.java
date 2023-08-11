package com.rmn.apiclient.core.data_access.base.descriptor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

public class BodyDescriptor<T> {
    @NonNull
    public final Class<T> type;

    public BodyDescriptor(@NonNull Class<T> cls) {
        this.type = cls;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BodyDescriptor)) {
            return false;
        }
        return this.type.equals(((BodyDescriptor) obj).type);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.type});
    }
}
