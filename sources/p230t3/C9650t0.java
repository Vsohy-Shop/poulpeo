package p230t3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* renamed from: t3.t0 */
/* compiled from: SchemaManager */
final class C9650t0 extends SQLiteOpenHelper {

    /* renamed from: d */
    private static final String f14350d = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");

    /* renamed from: e */
    static int f14351e = 5;

    /* renamed from: f */
    private static final C9651a f14352f;

    /* renamed from: g */
    private static final C9651a f14353g;

    /* renamed from: h */
    private static final C9651a f14354h;

    /* renamed from: i */
    private static final C9651a f14355i;

    /* renamed from: j */
    private static final C9651a f14356j;

    /* renamed from: k */
    private static final List<C9651a> f14357k;

    /* renamed from: b */
    private final int f14358b;

    /* renamed from: c */
    private boolean f14359c = false;

    /* renamed from: t3.t0$a */
    /* compiled from: SchemaManager */
    public interface C9651a {
        /* renamed from: a */
        void mo44109a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C9640o0 o0Var = new C9640o0();
        f14352f = o0Var;
        C9642p0 p0Var = new C9642p0();
        f14353g = p0Var;
        C9644q0 q0Var = new C9644q0();
        f14354h = q0Var;
        C9646r0 r0Var = new C9646r0();
        f14355i = r0Var;
        C9648s0 s0Var = new C9648s0();
        f14356j = s0Var;
        f14357k = Arrays.asList(new C9651a[]{o0Var, p0Var, q0Var, r0Var, s0Var});
    }

    C9650t0(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f14358b = i;
    }

    /* renamed from: G */
    private void m20082G(SQLiteDatabase sQLiteDatabase) {
        if (!this.f14359c) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static /* synthetic */ void m20083O(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static /* synthetic */ void m20084Q(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public static /* synthetic */ void m20086V(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public static /* synthetic */ void m20087X(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f14350d);
    }

    /* renamed from: Y */
    private void m20088Y(SQLiteDatabase sQLiteDatabase, int i) {
        m20082G(sQLiteDatabase);
        m20090a0(sQLiteDatabase, 0, i);
    }

    /* renamed from: a0 */
    private void m20090a0(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<C9651a> list = f14357k;
        if (i2 <= list.size()) {
            while (i < i2) {
                f14357k.get(i).mo44109a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f14359c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m20088Y(sQLiteDatabase, this.f14358b);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m20088Y(sQLiteDatabase, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m20082G(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m20082G(sQLiteDatabase);
        m20090a0(sQLiteDatabase, i, i2);
    }
}
