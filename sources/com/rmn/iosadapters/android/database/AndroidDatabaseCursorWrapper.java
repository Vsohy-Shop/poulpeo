package com.rmn.iosadapters.android.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AndroidDatabaseCursorWrapper {
    @NonNull

    /* renamed from: a */
    private final Cursor f18088a;

    public AndroidDatabaseCursorWrapper(@Nullable Cursor cursor) {
        if (cursor != null) {
            this.f18088a = cursor;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public void mo47846a() {
        this.f18088a.close();
    }

    /* renamed from: b */
    public int mo47847b() {
        return this.f18088a.getColumnCount();
    }

    /* renamed from: c */
    public int mo47848c(@NonNull String str) {
        return this.f18088a.getColumnIndex(str);
    }

    @Nullable
    /* renamed from: d */
    public String mo47849d(int i) {
        return this.f18088a.getColumnName(i);
    }

    /* renamed from: e */
    public double mo47850e(int i) {
        return this.f18088a.getDouble(i);
    }

    /* renamed from: f */
    public int mo47851f(int i) {
        return this.f18088a.getInt(i);
    }

    @Nullable
    /* renamed from: g */
    public String mo47852g(int i) {
        return this.f18088a.getString(i);
    }

    /* renamed from: h */
    public boolean mo47853h() {
        return this.f18088a.moveToNext();
    }
}
