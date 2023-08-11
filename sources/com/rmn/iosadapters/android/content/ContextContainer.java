package com.rmn.iosadapters.android.content;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ContextContainer {
    @NonNull

    /* renamed from: a */
    private final Context f18087a;

    public ContextContainer(@NonNull Context context) {
        this.f18087a = context.getApplicationContext();
    }

    @NonNull
    /* renamed from: a */
    public Context mo47843a() {
        return this.f18087a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        Context context = this.f18087a;
        if (context == obj || context.getClass() == obj.getClass()) {
            return true;
        }
        return this.f18087a.equals(obj);
    }

    public int hashCode() {
        return this.f18087a.hashCode();
    }
}
