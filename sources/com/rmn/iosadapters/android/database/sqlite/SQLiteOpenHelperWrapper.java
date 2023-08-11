package com.rmn.iosadapters.android.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.iosadapters.android.content.ContextContainer;

public abstract class SQLiteOpenHelperWrapper extends SQLiteOpenHelper {
    public SQLiteOpenHelperWrapper(@NonNull ContextContainer contextContainer, @Nullable String str, int i) {
        super(contextContainer.mo47843a(), str, (SQLiteDatabase.CursorFactory) null, i);
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        }
    }

    private native void init(@NonNull String str, int i);

    public final synchronized void close() {
        super.close();
    }

    @NonNull
    @Deprecated
    public final synchronized SQLiteDatabase getReadableDatabase() {
        return super.getReadableDatabase();
    }

    @NonNull
    public synchronized SQLiteDatabaseWrapper getReadableDatabaseWrapper() {
        return new SQLiteDatabaseWrapper(getReadableDatabase());
    }

    @NonNull
    @Deprecated
    public final synchronized SQLiteDatabase getWritableDatabase() {
        return super.getWritableDatabase();
    }

    @NonNull
    public synchronized SQLiteDatabaseWrapper getWritableDatabaseWrapper() {
        return new SQLiteDatabaseWrapper(getWritableDatabase());
    }

    @Deprecated
    public final void onCreate(@NonNull SQLiteDatabase sQLiteDatabase) {
        onCreate(new SQLiteDatabaseWrapper(sQLiteDatabase));
    }

    /* access modifiers changed from: protected */
    public abstract void onCreate(@NonNull SQLiteDatabaseWrapper sQLiteDatabaseWrapper);

    @Deprecated
    public final void onOpen(@NonNull SQLiteDatabase sQLiteDatabase) {
        onOpen(new SQLiteDatabaseWrapper(sQLiteDatabase));
    }

    /* access modifiers changed from: protected */
    public abstract void onOpen(@NonNull SQLiteDatabaseWrapper sQLiteDatabaseWrapper);

    @Deprecated
    public final void onUpgrade(@NonNull SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(new SQLiteDatabaseWrapper(sQLiteDatabase), i, i2);
    }

    /* access modifiers changed from: protected */
    public abstract void onUpgrade(@NonNull SQLiteDatabaseWrapper sQLiteDatabaseWrapper, int i, int i2);
}
