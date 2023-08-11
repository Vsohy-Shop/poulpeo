package p230t3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.autofill.HintConstants;
import com.facebook.applinks.AppLinkData;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p119i3.C8109b;
import p139k3.C8538h;
import p139k3.C8539i;
import p139k3.C8549o;
import p159m3.C8821a;
import p179o3.C8957a;
import p179o3.C8959b;
import p179o3.C8961c;
import p179o3.C8964d;
import p179o3.C8966e;
import p179o3.C8968f;
import p189p3.C9050a;
import p241u3.C9880a;
import p252v3.C9927a;
import p263w3.C10111a;

@WorkerThread
/* renamed from: t3.m0 */
/* compiled from: SQLiteEventStore */
public class C9632m0 implements C9609d, C9880a, C9607c {

    /* renamed from: g */
    private static final C8109b f14327g = C8109b.m15970b("proto");

    /* renamed from: b */
    private final C9650t0 f14328b;

    /* renamed from: c */
    private final C9927a f14329c;

    /* renamed from: d */
    private final C9927a f14330d;

    /* renamed from: e */
    private final C9611e f14331e;

    /* renamed from: f */
    private final C8821a<String> f14332f;

    /* renamed from: t3.m0$b */
    /* compiled from: SQLiteEventStore */
    interface C9634b<T, U> {
        U apply(T t);
    }

    /* renamed from: t3.m0$c */
    /* compiled from: SQLiteEventStore */
    private static class C9635c {

        /* renamed from: a */
        final String f14333a;

        /* renamed from: b */
        final String f14334b;

        private C9635c(String str, String str2) {
            this.f14333a = str;
            this.f14334b = str2;
        }
    }

    /* renamed from: t3.m0$d */
    /* compiled from: SQLiteEventStore */
    interface C9636d<T> {
        /* renamed from: a */
        T mo44099a();
    }

    C9632m0(C9927a aVar, C9927a aVar2, C9611e eVar, C9650t0 t0Var, C8821a<String> aVar3) {
        this.f14328b = t0Var;
        this.f14329c = aVar;
        this.f14330d = aVar2;
        this.f14331e = eVar;
        this.f14332f = aVar3;
    }

    /* renamed from: F0 */
    private C8961c.C8963b m19993F0(int i) {
        C8961c.C8963b bVar = C8961c.C8963b.REASON_UNKNOWN;
        if (i == bVar.mo43122y()) {
            return bVar;
        }
        C8961c.C8963b bVar2 = C8961c.C8963b.MESSAGE_TOO_OLD;
        if (i == bVar2.mo43122y()) {
            return bVar2;
        }
        C8961c.C8963b bVar3 = C8961c.C8963b.CACHE_FULL;
        if (i == bVar3.mo43122y()) {
            return bVar3;
        }
        C8961c.C8963b bVar4 = C8961c.C8963b.PAYLOAD_TOO_BIG;
        if (i == bVar4.mo43122y()) {
            return bVar4;
        }
        C8961c.C8963b bVar5 = C8961c.C8963b.MAX_RETRIES_REACHED;
        if (i == bVar5.mo43122y()) {
            return bVar5;
        }
        C8961c.C8963b bVar6 = C8961c.C8963b.INVALID_PAYLOD;
        if (i == bVar6.mo43122y()) {
            return bVar6;
        }
        C8961c.C8963b bVar7 = C8961c.C8963b.SERVER_ERROR;
        if (i == bVar7.mo43122y()) {
            return bVar7;
        }
        C9050a.m18380a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return bVar;
    }

    /* renamed from: G0 */
    private void m19995G0(SQLiteDatabase sQLiteDatabase) {
        m20049w1(new C9618g0(sQLiteDatabase), new C9620h0());
    }

    /* renamed from: H0 */
    private long m19996H0(SQLiteDatabase sQLiteDatabase, C8549o oVar) {
        Long O0 = m20002O0(sQLiteDatabase, oVar);
        if (O0 != null) {
            return O0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.mo42580b());
        contentValues.put("priority", Integer.valueOf(C10111a.m21240a(oVar.mo42582d())));
        contentValues.put("next_request_ms", 0);
        if (oVar.mo42581c() != null) {
            contentValues.put(AppLinkData.ARGUMENTS_EXTRAS_KEY, Base64.encodeToString(oVar.mo42581c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    /* renamed from: K0 */
    private C8959b m19997K0() {
        return C8959b.m18180b().mo43116b(C8966e.m18197c().mo43131b(mo44103I0()).mo43132c(C9611e.f14311a.mo44070f()).mo43130a()).mo43115a();
    }

    /* renamed from: L0 */
    private long m19998L0() {
        return mo44104J0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: M0 */
    private long m19999M0() {
        return mo44104J0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: N0 */
    private C8968f m20000N0() {
        return (C8968f) mo44105P0(new C9608c0(this.f14329c.mo44504a()));
    }

    @Nullable
    /* renamed from: O0 */
    private Long m20002O0(SQLiteDatabase sQLiteDatabase, C8549o oVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{oVar.mo42580b(), String.valueOf(C10111a.m21240a(oVar.mo42582d()))}));
        if (oVar.mo42581c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.mo42581c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m20055z1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), new C9647s());
    }

    /* renamed from: Q0 */
    private boolean m20004Q0() {
        if (m19998L0() * m19999M0() >= this.f14331e.mo44070f()) {
            return true;
        }
        return false;
    }

    /* renamed from: R0 */
    private List<C9627k> m20006R0(List<C9627k> list, Map<Long, Set<C9635c>> map) {
        ListIterator<C9627k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C9627k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo44081c()))) {
                C8539i.C8540a l = next.mo44080b().mo42603l();
                for (C9635c cVar : map.get(Long.valueOf(next.mo44081c()))) {
                    l.mo42606c(cVar.f14333a, cVar.f14334b);
                }
                listIterator.set(C9627k.m19983a(next.mo44081c(), next.mo44082d(), l.mo42558d()));
            }
        }
        return list;
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public /* synthetic */ Object m20007S0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo44088k((long) i, C8961c.C8963b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: T0 */
    public /* synthetic */ Integer m20008T0(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m20055z1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C9645r(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public static /* synthetic */ Object m20011V0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public static /* synthetic */ SQLiteDatabase m20012W0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public static /* synthetic */ Long m20014X0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z0 */
    public static /* synthetic */ C8968f m20017Z0(long j, SQLiteDatabase sQLiteDatabase) {
        return (C8968f) m20055z1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new C9610d0(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: a1 */
    public static /* synthetic */ Long m20019a1(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: b1 */
    public /* synthetic */ Boolean m20020b1(C8549o oVar, SQLiteDatabase sQLiteDatabase) {
        Long O0 = m20002O0(sQLiteDatabase, oVar);
        if (O0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m20055z1(mo44104J0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{O0.toString()}), new C9658z());
    }

    /* access modifiers changed from: private */
    /* renamed from: c1 */
    public static /* synthetic */ List m20022c1(SQLiteDatabase sQLiteDatabase) {
        return (List) m20055z1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new C9628k0());
    }

    /* access modifiers changed from: private */
    /* renamed from: d1 */
    public static /* synthetic */ List m20023d1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(C8549o.m17165a().mo42586b(cursor.getString(1)).mo42588d(C10111a.m21241b(cursor.getInt(2))).mo42587c(m20043t1(cursor.getString(3))).mo42585a());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: e1 */
    public /* synthetic */ List m20024e1(C8549o oVar, SQLiteDatabase sQLiteDatabase) {
        List<C9627k> r1 = m20040r1(sQLiteDatabase, oVar);
        return m20006R0(r1, m20041s1(sQLiteDatabase, r1));
    }

    /* access modifiers changed from: private */
    /* renamed from: f1 */
    public /* synthetic */ C8957a m20025f1(Map map, C8957a.C8958a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C8961c.C8963b F0 = m19993F0(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C8961c.m18184c().mo43121c(F0).mo43120b(j).mo43119a());
        }
        m20045u1(aVar, map);
        aVar.mo43113e(m20000N0());
        aVar.mo43112d(m19997K0());
        aVar.mo43111c(this.f14332f.get());
        return aVar.mo43110b();
    }

    /* access modifiers changed from: private */
    /* renamed from: g1 */
    public /* synthetic */ C8957a m20026g1(String str, Map map, C8957a.C8958a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C8957a) m20055z1(sQLiteDatabase.rawQuery(str, new String[0]), new C9606b0(this, map, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: h1 */
    public /* synthetic */ Object m20027h1(List list, C8549o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            C8539i.C8540a k = C8539i.m17122a().mo42564j(cursor.getString(1)).mo42563i(cursor.getLong(2)).mo42565k(cursor.getLong(3));
            if (z) {
                k.mo42562h(new C8538h(m20051x1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k.mo42562h(new C8538h(m20051x1(cursor.getString(4)), m20047v1(j)));
            }
            if (!cursor.isNull(6)) {
                k.mo42561g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(C9627k.m19983a(j, oVar, k.mo42558d()));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public static /* synthetic */ Object m20028i1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C9635c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public /* synthetic */ Long m20030j1(C8539i iVar, C8549o oVar, SQLiteDatabase sQLiteDatabase) {
        boolean z;
        byte[] bArr;
        if (m20004Q0()) {
            mo44088k(1, C8961c.C8963b.CACHE_FULL, iVar.mo42555j());
            return -1L;
        }
        long H0 = m19996H0(sQLiteDatabase, oVar);
        int e = this.f14331e.mo44068e();
        byte[] a = iVar.mo42551e().mo42594a();
        if (a.length <= e) {
            z = true;
        } else {
            z = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(H0));
        contentValues.put("transport_name", iVar.mo42555j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.mo42553f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.mo42556k()));
        contentValues.put("payload_encoding", iVar.mo42551e().mo42595b().mo41963a());
        contentValues.put("code", iVar.mo42550d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z));
        if (z) {
            bArr = a;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(((double) a.length) / ((double) e));
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a, (i - 1) * e, Math.min(i * e, a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : iVar.mo42602i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put(HintConstants.AUTOFILL_HINT_NAME, (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public static /* synthetic */ byte[] m20032k1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ Object m20033l1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo44088k((long) i, C8961c.C8963b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ Object m20034m1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m20055z1(sQLiteDatabase.rawQuery(str2, (String[]) null), new C9657y(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public static /* synthetic */ Boolean m20035n1(Cursor cursor) {
        boolean z;
        if (cursor.getCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public static /* synthetic */ Object m20036o1(String str, C8961c.C8963b bVar, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m20055z1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo43122y())}), new C9656x())).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.mo43122y()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo43122y())});
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static /* synthetic */ Object m20038p1(long j, C8549o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.mo42580b(), String.valueOf(C10111a.m21240a(oVar.mo42582d()))}) < 1) {
            contentValues.put("backend_name", oVar.mo42580b());
            contentValues.put("priority", Integer.valueOf(C10111a.m21240a(oVar.mo42582d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public /* synthetic */ Object m20039q1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f14329c.mo44504a()).execute();
        return null;
    }

    /* renamed from: r1 */
    private List<C9627k> m20040r1(SQLiteDatabase sQLiteDatabase, C8549o oVar) {
        ArrayList arrayList = new ArrayList();
        Long O0 = m20002O0(sQLiteDatabase, oVar);
        if (O0 == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        m20055z1(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{O0.toString()}, (String) null, (String) null, (String) null, String.valueOf(this.f14331e.mo44067d())), new C9654v(this, arrayList, oVar));
        return arrayList;
    }

    /* renamed from: s1 */
    private Map<Long, Set<C9635c>> m20041s1(SQLiteDatabase sQLiteDatabase, List<C9627k> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo44081c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m20055z1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", HintConstants.AUTOFILL_HINT_NAME, "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new C9649t(hashMap));
        return hashMap;
    }

    /* renamed from: t1 */
    private static byte[] m20043t1(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: u1 */
    private void m20045u1(C8957a.C8958a aVar, Map<String, List<C8961c>> map) {
        for (Map.Entry next : map.entrySet()) {
            aVar.mo43109a(C8964d.m18191c().mo43127c((String) next.getKey()).mo43126b((List) next.getValue()).mo43125a());
        }
    }

    /* renamed from: v1 */
    private byte[] m20047v1(long j) {
        return (byte[]) m20055z1(mo44104J0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), new C9604a0());
    }

    /* renamed from: w1 */
    private <T> T m20049w1(C9636d<T> dVar, C9634b<Throwable, T> bVar) {
        long a = this.f14330d.mo44504a();
        while (true) {
            try {
                return dVar.mo44099a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f14330d.mo44504a() >= ((long) this.f14331e.mo44065b()) + a) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    /* renamed from: x1 */
    private static C8109b m20051x1(@Nullable String str) {
        if (str == null) {
            return f14327g;
        }
        return C8109b.m15970b(str);
    }

    /* renamed from: y1 */
    private static String m20053y1(Iterable<C9627k> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<C9627k> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo44081c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @VisibleForTesting
    /* renamed from: z1 */
    static <T> T m20055z1(Cursor cursor, C9634b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: E */
    public long mo44089E(C8549o oVar) {
        return ((Long) m20055z1(mo44104J0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.mo42580b(), String.valueOf(C10111a.m21240a(oVar.mo42582d()))}), new C9615f0())).longValue();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: I0 */
    public long mo44103I0() {
        return m19998L0() * m19999M0();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: J0 */
    public SQLiteDatabase mo44104J0() {
        C9650t0 t0Var = this.f14328b;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) m20049w1(new C9655w(t0Var), new C9613e0());
    }

    /* renamed from: P */
    public void mo44090P(C8549o oVar, long j) {
        mo44105P0(new C9637n(j, oVar));
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: P0 */
    public <T> T mo44105P0(C9634b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase J0 = mo44104J0();
        J0.beginTransaction();
        try {
            T apply = bVar.apply(J0);
            J0.setTransactionSuccessful();
            return apply;
        } finally {
            J0.endTransaction();
        }
    }

    /* renamed from: a */
    public <T> T mo44106a(C9880a.C9881a<T> aVar) {
        SQLiteDatabase J0 = mo44104J0();
        m19995G0(J0);
        try {
            T execute = aVar.execute();
            J0.setTransactionSuccessful();
            return execute;
        } finally {
            J0.endTransaction();
        }
    }

    /* renamed from: b */
    public void mo44086b() {
        mo44105P0(new C9639o(this));
    }

    /* renamed from: c */
    public C8957a mo44087c() {
        return (C8957a) mo44105P0(new C9652u(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), C8957a.m18169e()));
    }

    public void close() {
        this.f14328b.close();
    }

    /* renamed from: j */
    public int mo44091j() {
        return ((Integer) mo44105P0(new C9626j0(this, this.f14329c.mo44504a() - this.f14331e.mo44066c()))).intValue();
    }

    /* renamed from: k */
    public void mo44088k(long j, C8961c.C8963b bVar, String str) {
        mo44105P0(new C9631m(str, bVar, j));
    }

    /* renamed from: l0 */
    public void mo44092l0(Iterable<C9627k> iterable) {
        if (iterable.iterator().hasNext()) {
            mo44105P0(new C9643q(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m20053y1(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    /* renamed from: m */
    public void mo44093m(Iterable<C9627k> iterable) {
        if (iterable.iterator().hasNext()) {
            mo44104J0().compileStatement("DELETE FROM events WHERE _id in " + m20053y1(iterable)).execute();
        }
    }

    @Nullable
    /* renamed from: n */
    public C9627k mo44094n(C8549o oVar, C8539i iVar) {
        C9050a.m18381b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.mo42582d(), iVar.mo42555j(), oVar.mo42580b());
        long longValue = ((Long) mo44105P0(new C9623i0(this, iVar, oVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return C9627k.m19983a(longValue, oVar, iVar);
    }

    /* renamed from: u */
    public Iterable<C8549o> mo44095u() {
        return (Iterable) mo44105P0(new C9629l());
    }

    /* renamed from: v */
    public Iterable<C9627k> mo44096v(C8549o oVar) {
        return (Iterable) mo44105P0(new C9641p(this, oVar));
    }

    /* renamed from: w */
    public boolean mo44097w(C8549o oVar) {
        return ((Boolean) mo44105P0(new C9630l0(this, oVar))).booleanValue();
    }
}
