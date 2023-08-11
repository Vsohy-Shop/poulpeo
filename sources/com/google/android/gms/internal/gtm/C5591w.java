package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.autofill.HintConstants;
import com.appboy.Constants;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.gtm.w */
final class C5591w extends SQLiteOpenHelper {

    /* renamed from: b */
    private final /* synthetic */ C5576v f6399b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5591w(C5576v vVar, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f6399b = vVar;
    }

    /* renamed from: a */
    private final boolean m8621a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{HintConstants.AUTOFILL_HINT_NAME}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
            boolean moveToFirst = query.moveToFirst();
            query.close();
            return moveToFirst;
        } catch (SQLiteException e) {
            this.f6399b.mo33277c0("Error querying for table", str, e);
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    private static Set<String> m8622b(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
        try {
            String[] columnNames = rawQuery.getColumnNames();
            for (String add : columnNames) {
                hashSet.add(add);
            }
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public final SQLiteDatabase getWritableDatabase() {
        if (this.f6399b.f6372f.mo33444c(3600000)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                this.f6399b.f6372f.mo33443b();
                this.f6399b.mo33270M0("Opening the database failed, dropping the table and recreating it");
                this.f6399b.mo33276c().getDatabasePath(C5576v.m8559i1()).delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.f6399b.f6372f.mo33442a();
                    return writableDatabase;
                } catch (SQLiteException e) {
                    this.f6399b.mo33265H0("Failed to open freshly created database", e);
                    throw e;
                }
            }
        } else {
            throw new SQLiteException("Database open failed");
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        if (C5577v0.m8575a() >= 9) {
            File file = new File(path);
            file.setReadable(false, false);
            file.setWritable(false, false);
            file.setReadable(true, true);
            file.setWritable(true, true);
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2;
        if (!m8621a(sQLiteDatabase, "hits2")) {
            sQLiteDatabase.execSQL(C5576v.f6368g);
        } else {
            Set<String> b = m8622b(sQLiteDatabase, "hits2");
            String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
            for (int i = 0; i < 4; i++) {
                String str3 = strArr[i];
                if (!b.remove(str3)) {
                    String valueOf = String.valueOf(str3);
                    if (valueOf.length() != 0) {
                        str2 = "Database hits2 is missing required column: ".concat(valueOf);
                    } else {
                        str2 = new String("Database hits2 is missing required column: ");
                    }
                    throw new SQLiteException(str2);
                }
            }
            boolean z = !b.remove("hit_app_id");
            if (!b.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            } else if (z) {
                sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        }
        if (!m8621a(sQLiteDatabase, "properties")) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
            return;
        }
        Set<String> b2 = m8622b(sQLiteDatabase, "properties");
        String[] strArr2 = {"app_uid", Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, "tid", "params", "adid", "hits_count"};
        for (int i2 = 0; i2 < 6; i2++) {
            String str4 = strArr2[i2];
            if (!b2.remove(str4)) {
                String valueOf2 = String.valueOf(str4);
                if (valueOf2.length() != 0) {
                    str = "Database properties is missing required column: ".concat(valueOf2);
                } else {
                    str = new String("Database properties is missing required column: ");
                }
                throw new SQLiteException(str);
            }
        }
        if (!b2.isEmpty()) {
            throw new SQLiteException("Database properties table has extra columns");
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
