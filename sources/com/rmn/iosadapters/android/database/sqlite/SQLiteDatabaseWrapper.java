package com.rmn.iosadapters.android.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.iosadapters.android.content.ContentValuesWrapper;
import com.rmn.iosadapters.android.database.AndroidDatabaseCursorWrapper;
import java.io.File;

public class SQLiteDatabaseWrapper {
    @NonNull

    /* renamed from: a */
    private final SQLiteDatabase f18089a;

    public SQLiteDatabaseWrapper(@Nullable SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            this.f18089a = sQLiteDatabase;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public void mo47854a() {
        this.f18089a.close();
    }

    /* renamed from: b */
    public void mo47855b(@NonNull String str, @Nullable String str2, @Nullable String[] strArr) {
        this.f18089a.delete(str, str2, strArr);
    }

    /* renamed from: c */
    public void mo47856c(@NonNull String str) {
        this.f18089a.execSQL(str);
    }

    /* renamed from: d */
    public long mo47857d() {
        return new File(this.f18089a.getPath()).length();
    }

    /* renamed from: e */
    public boolean mo47858e() {
        return this.f18089a.isOpen();
    }

    @NonNull
    /* renamed from: f */
    public AndroidDatabaseCursorWrapper mo47859f(@NonNull String str, @NonNull String[] strArr, @NonNull String str2, @Nullable String[] strArr2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new AndroidDatabaseCursorWrapper(this.f18089a.query(str, strArr, str2, strArr2, str3, str4, str5));
    }

    @NonNull
    /* renamed from: g */
    public AndroidDatabaseCursorWrapper mo47860g(@NonNull String str, @Nullable String[] strArr) {
        return new AndroidDatabaseCursorWrapper(this.f18089a.rawQuery(str, strArr));
    }

    /* renamed from: h */
    public void mo47861h(@NonNull String str, @Nullable String str2, @NonNull ContentValuesWrapper contentValuesWrapper) {
        this.f18089a.replaceOrThrow(str, str2, contentValuesWrapper.mo47839a());
    }
}
