package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.autofill.HintConstants;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.q3 */
final class C5504q3 extends SQLiteOpenHelper {

    /* renamed from: b */
    private boolean f6253b;

    /* renamed from: c */
    private long f6254c = 0;

    /* renamed from: d */
    private final /* synthetic */ C5471o3 f6255d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5504q3(C5471o3 o3Var, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f6255d = o3Var;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static void m8411a(SQLiteDatabase sQLiteDatabase, String str, List<String> list) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" WHERE 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
        HashSet hashSet = new HashSet();
        try {
            String[] columnNames = rawQuery.getColumnNames();
            for (String add : columnNames) {
                hashSet.add(add);
            }
            rawQuery.close();
            for (String next : list) {
                if (!hashSet.remove(next)) {
                    throw new SQLiteException(String.format("Database column %s missing in table %s.", new Object[]{next, str}));
                }
            }
            if (!hashSet.isEmpty()) {
                throw new SQLiteException(String.format("Database has extra columns in table %s.", new Object[]{str}));
            }
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    /* renamed from: b */
    private static boolean m8412b(String str, SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{HintConstants.AUTOFILL_HINT_NAME}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
            boolean moveToFirst = query.moveToFirst();
            query.close();
            return moveToFirst;
        } catch (SQLiteException unused) {
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

    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        if (!this.f6253b || this.f6254c + 3600000 <= this.f6255d.f6190g.mo33547a()) {
            this.f6253b = true;
            this.f6254c = this.f6255d.f6190g.mo33547a();
            try {
                sQLiteDatabase = super.getWritableDatabase();
            } catch (SQLiteException unused) {
                this.f6255d.f6187d.getDatabasePath(this.f6255d.f6188e).delete();
                sQLiteDatabase = null;
            }
            if (sQLiteDatabase == null) {
                sQLiteDatabase = super.getWritableDatabase();
            }
            this.f6253b = false;
            return sQLiteDatabase;
        }
        throw new SQLiteException("Database creation failed");
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        if (C5594w2.m8624a() >= 9) {
            File file = new File(path);
            file.setReadable(false, false);
            file.setWritable(false, false);
            file.setReadable(true, true);
            file.setWritable(true, true);
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!m8412b("gtm_hit_unique_ids", sQLiteDatabase)) {
            sQLiteDatabase.execSQL(C5471o3.f6180i);
        } else {
            m8411a(sQLiteDatabase, "gtm_hit_unique_ids", Arrays.asList(new String[]{"hit_unique_id"}));
        }
        if (!m8412b("gtm_hits", sQLiteDatabase)) {
            sQLiteDatabase.execSQL(C5471o3.f6181j);
        } else {
            m8411a(sQLiteDatabase, "gtm_hits", Arrays.asList(new String[]{"hit_id", "hit_url", "hit_time", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body"}));
        }
        sQLiteDatabase.execSQL(C5471o3.f6182k);
        sQLiteDatabase.execSQL(C5471o3.f6183l);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
