package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p231t4.C9713p;
import p286y4.C10677k;
import p296z3.C10812p;

/* renamed from: com.google.android.gms.internal.gtm.v */
final class C5576v extends C5407k implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String f6368g = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});

    /* renamed from: h */
    private static final String f6369h = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{"hit_time", "hits2"});

    /* renamed from: d */
    private final C5591w f6370d;

    /* renamed from: e */
    private final C5487p1 f6371e = new C5487p1(mo33279k0());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5487p1 f6372f = new C5487p1(mo33279k0());

    C5576v(C5437m mVar) {
        super(mVar);
        this.f6370d = new C5591w(this, mVar.mo33328a(), "google_analytics_v4.db");
    }

    /* renamed from: X0 */
    private final long m8553X0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo33562T0().rawQuery(str, (String[]) null);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            mo33263F0("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: Y0 */
    private final long m8554Y0(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo33562T0().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return 0;
        } catch (SQLiteException e) {
            mo33263F0("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: c1 */
    private final List<Long> m8557c1(long j) {
        C10812p.m23065i();
        mo33310Q0();
        if (j <= 0) {
            return Collections.emptyList();
        }
        SQLiteDatabase T0 = mo33562T0();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor query = T0.query("hits2", new String[]{"hit_id"}, (String) null, (String[]) null, (String) null, (String) null, String.format("%s ASC", new Object[]{"hit_id"}), Long.toString(j));
            if (query.moveToFirst()) {
                do {
                    arrayList.add(Long.valueOf(query.getLong(0)));
                } while (query.moveToNext());
            }
            query.close();
        } catch (SQLiteException e) {
            mo33262E0("Error selecting hit ids", e);
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return arrayList;
    }

    /* renamed from: f1 */
    private final long m8558f1() {
        C10812p.m23065i();
        mo33310Q0();
        return m8553X0("SELECT COUNT(*) FROM hits2", (String[]) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public static String m8559i1() {
        return "google_analytics_v4.db";
    }

    /* renamed from: l1 */
    private final Map<String, String> m8561l1(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                if (str.length() != 0) {
                    str = "?".concat(str);
                } else {
                    str = new String("?");
                }
            }
            return C10677k.m22691a(new URI(str), Constants.ENCODING);
        } catch (URISyntaxException e) {
            mo33265H0("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    /* renamed from: R0 */
    public final void mo33560R0() {
        mo33310Q0();
        mo33562T0().beginTransaction();
    }

    /* renamed from: S0 */
    public final void mo33561S0() {
        mo33310Q0();
        mo33562T0().endTransaction();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public final SQLiteDatabase mo33562T0() {
        try {
            return this.f6370d.getWritableDatabase();
        } catch (SQLiteException e) {
            mo33262E0("Error opening database", e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public final boolean mo33563U0() {
        if (m8558f1() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: V0 */
    public final void mo33564V0() {
        mo33310Q0();
        mo33562T0().setTransactionSuccessful();
    }

    /* renamed from: W0 */
    public final long mo33565W0(long j, String str, String str2) {
        C9713p.m20271f(str);
        C9713p.m20271f(str2);
        mo33310Q0();
        C10812p.m23065i();
        return m8554Y0("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{String.valueOf(j), str, str2}, 0);
    }

    /* renamed from: a1 */
    public final void mo33566a1(List<Long> list) {
        C9713p.m20275j(list);
        C10812p.m23065i();
        mo33310Q0();
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder("hit_id");
            sb.append(" in (");
            for (int i = 0; i < list.size(); i++) {
                Long l = list.get(i);
                if (l == null || l.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(l);
            }
            sb.append(")");
            String sb2 = sb.toString();
            try {
                SQLiteDatabase T0 = mo33562T0();
                mo33257A("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int delete = T0.delete("hits2", sb2, (String[]) null);
                if (delete != list.size()) {
                    mo33274X("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb2);
                }
            } catch (SQLiteException e) {
                mo33265H0("Error deleting hits", e);
                throw e;
            }
        }
    }

    public final void close() {
        try {
            this.f6370d.close();
        } catch (SQLiteException e) {
            mo33265H0("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            mo33265H0("Error closing database", e2);
        }
    }

    /* renamed from: d1 */
    public final void mo33568d1(C5273b1 b1Var) {
        String str;
        C9713p.m20275j(b1Var);
        C10812p.m23065i();
        mo33310Q0();
        C9713p.m20275j(b1Var);
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry next : b1Var.mo33109e().entrySet()) {
            String str2 = (String) next.getKey();
            if (!"ht".equals(str2) && !"qt".equals(str2) && !"AppUID".equals(str2)) {
                builder.appendQueryParameter(str2, (String) next.getValue());
            }
        }
        String encodedQuery = builder.build().getEncodedQuery();
        if (encodedQuery == null) {
            encodedQuery = "";
        }
        if (encodedQuery.length() > 8192) {
            mo33280p0().mo33214R0(b1Var, "Hit length exceeds the maximum allowed size");
            return;
        }
        int intValue = C5592w0.f6423f.mo33605a().intValue();
        long f1 = m8558f1();
        if (f1 > ((long) (intValue - 1))) {
            List<Long> c1 = m8557c1((f1 - ((long) intValue)) + 1);
            mo33262E0("Store full, deleting hits to make room, count", Integer.valueOf(c1.size()));
            mo33566a1(c1);
        }
        SQLiteDatabase T0 = mo33562T0();
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_string", encodedQuery);
        contentValues.put("hit_time", Long.valueOf(b1Var.mo33112h()));
        contentValues.put("hit_app_id", Integer.valueOf(b1Var.mo33110f()));
        if (b1Var.mo33114j()) {
            str = C5468o0.m8262h();
        } else {
            str = C5468o0.m8263i();
        }
        contentValues.put("hit_url", str);
        try {
            long insert = T0.insert("hits2", (String) null, contentValues);
            if (insert == -1) {
                mo33270M0("Failed to insert a hit (got -1)");
            } else {
                mo33273V("Hit saved to database. db-id, hit", Long.valueOf(insert), b1Var);
            }
        } catch (SQLiteException e) {
            mo33265H0("Error storing a hit", e);
        }
    }

    /* renamed from: e1 */
    public final List<C5273b1> mo33569e1(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C10812p.m23065i();
        mo33310Q0();
        Cursor cursor = null;
        try {
            Cursor query = mo33562T0().query("hits2", new String[]{"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"}, (String) null, (String[]) null, (String) null, (String) null, String.format("%s ASC", new Object[]{"hit_id"}), Long.toString(j));
            ArrayList arrayList = new ArrayList();
            if (query.moveToFirst()) {
                do {
                    long j2 = query.getLong(0);
                    arrayList.add(new C5273b1(this, m8561l1(query.getString(2)), query.getLong(1), C5502q1.m8402i(query.getString(3)), j2, query.getInt(4)));
                } while (query.moveToNext());
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            mo33265H0("Error loading hits from the database", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: g1 */
    public final int mo33570g1() {
        C10812p.m23065i();
        mo33310Q0();
        if (!this.f6371e.mo33444c(86400000)) {
            return 0;
        }
        this.f6371e.mo33443b();
        mo33266I0("Deleting stale hits (if any)");
        int delete = mo33562T0().delete("hits2", "hit_time < ?", new String[]{Long.toString(mo33279k0().mo33547a() - 2592000000L)});
        mo33257A("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    /* renamed from: h1 */
    public final long mo33571h1() {
        C10812p.m23065i();
        mo33310Q0();
        return m8554Y0(f6369h, (String[]) null, 0);
    }

    /* renamed from: k1 */
    public final void mo33572k1(long j) {
        C10812p.m23065i();
        mo33310Q0();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j));
        mo33257A("Deleting hit, id", Long.valueOf(j));
        mo33566a1(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public final void mo33181P0() {
    }
}
