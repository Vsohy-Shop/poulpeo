package com.rmn.iosadapters.android.content;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ContentValuesWrapper {
    @NonNull

    /* renamed from: a */
    private final ContentValues f18086a = new ContentValues();

    public ContentValuesWrapper() {
        mo47840b();
    }

    @NonNull
    /* renamed from: a */
    public ContentValues mo47839a() {
        return this.f18086a;
    }

    /* renamed from: c */
    public void mo47841c(@NonNull String str, @Nullable String str2) {
        this.f18086a.put(str, str2);
    }

    /* renamed from: d */
    public void mo47842d(@NonNull String str) {
        this.f18086a.putNull(str);
    }

    /* renamed from: b */
    public void mo47840b() {
    }
}
