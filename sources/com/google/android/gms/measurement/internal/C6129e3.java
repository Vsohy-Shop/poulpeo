package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.WorkerThread;

/* renamed from: com.google.android.gms.measurement.internal.e3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6129e3 extends SQLiteOpenHelper {

    /* renamed from: b */
    final /* synthetic */ C6140f3 f7738b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6129e3(C6140f3 f3Var, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f7738b = f3Var;
    }

    @WorkerThread
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f7738b.f7899a.mo34920b().mo35075r().mo35037a("Opening the local database failed, dropping and recreating it");
            this.f7738b.f7899a.mo35211z();
            if (!this.f7738b.f7899a.mo34927f().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f7738b.f7899a.mo34920b().mo35075r().mo35038b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f7738b.f7899a.mo34920b().mo35075r().mo35038b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @WorkerThread
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C6191k.m10846b(this.f7738b.f7899a.mo34920b(), sQLiteDatabase);
    }

    @WorkerThread
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C6191k.m10845a(this.f7738b.f7899a.mo34920b(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    @WorkerThread
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @WorkerThread
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
