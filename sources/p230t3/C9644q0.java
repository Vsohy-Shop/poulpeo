package p230t3;

import android.database.sqlite.SQLiteDatabase;
import p230t3.C9650t0;

/* renamed from: t3.q0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C9644q0 implements C9650t0.C9651a {
    /* renamed from: a */
    public final void mo44109a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}