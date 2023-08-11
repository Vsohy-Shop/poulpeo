package p118i2;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import java.util.UUID;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: i2.h */
/* compiled from: SessionInfo.kt */
public final class C8103h {

    /* renamed from: g */
    public static final C8104a f11398g = new C8104a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f11399a;

    /* renamed from: b */
    private Long f11400b;

    /* renamed from: c */
    private C8106j f11401c;

    /* renamed from: d */
    private final Long f11402d;

    /* renamed from: e */
    private Long f11403e;

    /* renamed from: f */
    private UUID f11404f;

    /* renamed from: i2.h$a */
    /* compiled from: SessionInfo.kt */
    public static final class C8104a {
        private C8104a() {
        }

        public /* synthetic */ C8104a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo41950a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
            edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            edit.remove("com.facebook.appevents.SessionInfo.sessionId");
            edit.apply();
            C8106j.f11408c.mo41955a();
        }

        /* renamed from: b */
        public final C8103h mo41951b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
            long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", (String) null);
            if (j == 0 || j2 == 0 || string == null) {
                return null;
            }
            C8103h hVar = new C8103h(Long.valueOf(j), Long.valueOf(j2), (UUID) null, 4, (DefaultConstructorMarker) null);
            hVar.f11399a = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            hVar.mo41948l(C8106j.f11408c.mo41956b());
            hVar.mo41945i(Long.valueOf(System.currentTimeMillis()));
            UUID fromString = UUID.fromString(string);
            C12775o.m28638h(fromString, "UUID.fromString(sessionIDStr)");
            hVar.mo41946j(fromString);
            return hVar;
        }
    }

    public C8103h(Long l, Long l2, UUID uuid) {
        C12775o.m28639i(uuid, "sessionId");
        this.f11402d = l;
        this.f11403e = l2;
        this.f11404f = uuid;
    }

    /* renamed from: b */
    public final Long mo41938b() {
        long j;
        Long l = this.f11400b;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        return Long.valueOf(j);
    }

    /* renamed from: c */
    public final int mo41939c() {
        return this.f11399a;
    }

    /* renamed from: d */
    public final UUID mo41940d() {
        return this.f11404f;
    }

    /* renamed from: e */
    public final Long mo41941e() {
        return this.f11403e;
    }

    /* renamed from: f */
    public final long mo41942f() {
        Long l;
        if (this.f11402d == null || (l = this.f11403e) == null) {
            return 0;
        }
        if (l != null) {
            return l.longValue() - this.f11402d.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: g */
    public final C8106j mo41943g() {
        return this.f11401c;
    }

    /* renamed from: h */
    public final void mo41944h() {
        this.f11399a++;
    }

    /* renamed from: i */
    public final void mo41945i(Long l) {
        this.f11400b = l;
    }

    /* renamed from: j */
    public final void mo41946j(UUID uuid) {
        C12775o.m28639i(uuid, "<set-?>");
        this.f11404f = uuid;
    }

    /* renamed from: k */
    public final void mo41947k(Long l) {
        this.f11403e = l;
    }

    /* renamed from: l */
    public final void mo41948l(C8106j jVar) {
        this.f11401c = jVar;
    }

    /* renamed from: m */
    public final void mo41949m() {
        long j;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
        Long l = this.f11402d;
        long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", j);
        Long l2 = this.f11403e;
        if (l2 != null) {
            j2 = l2.longValue();
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", j2);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f11399a);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f11404f.toString());
        edit.apply();
        C8106j jVar = this.f11401c;
        if (jVar != null && jVar != null) {
            jVar.mo41953a();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C8103h(java.lang.Long r1, java.lang.Long r2, java.util.UUID r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L_0x000d
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r4 = "UUID.randomUUID()"
            kotlin.jvm.internal.C12775o.m28638h(r3, r4)
        L_0x000d:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p118i2.C8103h.<init>(java.lang.Long, java.lang.Long, java.util.UUID, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
