package com.rmn.apiclient.core.data_access.base.call;

import androidx.annotation.Nullable;
import java.util.Objects;

public class BodyContainer<T> {
    @Nullable
    public final T body;

    public BodyContainer() {
        this((Object) null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BodyContainer)) {
            return false;
        }
        return Objects.equals(this.body, ((BodyContainer) obj).body);
    }

    @Nullable
    public Class<T> getType() {
        T t = this.body;
        if (t == null) {
            return null;
        }
        return t.getClass();
    }

    public boolean hasBody() {
        if (this.body != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.body});
    }

    public BodyContainer(@Nullable T t) {
        this.body = t;
    }
}
