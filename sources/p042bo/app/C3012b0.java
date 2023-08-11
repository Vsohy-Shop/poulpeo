package p042bo.app;

import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.b0 */
public final class C3012b0 extends C3591r {

    /* renamed from: w */
    public static final C3013a f1459w = new C3013a((DefaultConstructorMarker) null);

    /* renamed from: r */
    private final long f1460r;

    /* renamed from: s */
    private final long f1461s;

    /* renamed from: t */
    private String f1462t;

    /* renamed from: u */
    private int f1463u;

    /* renamed from: v */
    private final boolean f1464v;

    /* renamed from: bo.app.b0$a */
    public static final class C3013a {
        public /* synthetic */ C3013a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3013a() {
        }
    }

    /* renamed from: bo.app.b0$b */
    static final class C3014b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f1465b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3014b(long j) {
            super(0);
            this.f1465b = j;
        }

        /* renamed from: a */
        public final String invoke() {
            return "ContentCardsSyncRequest scheduled for retry in " + this.f1465b + " ms.";
        }
    }

    /* renamed from: bo.app.b0$c */
    static final class C3015c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3015c f1466b = new C3015c();

        C3015c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "ContentCardsSyncRequest executed successfully.";
        }
    }

    /* renamed from: bo.app.b0$d */
    static final class C3016d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3016d f1467b = new C3016d();

        C3016d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while creating Content Cards request. Returning null.";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3012b0(String str, long j, long j2, String str2, int i) {
        super(new C3753v4(C12775o.m28647q(str, "content_cards/sync")));
        C12775o.m28639i(str, "urlBase");
        this.f1460r = j;
        this.f1461s = j2;
        this.f1462t = str2;
        this.f1463u = i;
    }

    /* renamed from: a */
    public String mo28603a() {
        return this.f1462t;
    }

    /* renamed from: b */
    public boolean mo28606b() {
        return this.f1464v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028 A[Catch:{ JSONException -> 0x0032 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo28608l() {
        /*
            r10 = this;
            org.json.JSONObject r0 = super.mo28608l()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r2 = "last_full_sync_at"
            long r3 = r10.f1461s     // Catch:{ JSONException -> 0x0032 }
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r2 = "last_card_updated_at"
            long r3 = r10.f1460r     // Catch:{ JSONException -> 0x0032 }
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r2 = r10.mo28603a()     // Catch:{ JSONException -> 0x0032 }
            if (r2 == 0) goto L_0x0025
            boolean r2 = p454wf.C13754v.m31532t(r2)     // Catch:{ JSONException -> 0x0032 }
            if (r2 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r2 = 0
            goto L_0x0026
        L_0x0025:
            r2 = 1
        L_0x0026:
            if (r2 != 0) goto L_0x0031
            java.lang.String r2 = "user_id"
            java.lang.String r3 = r10.mo28603a()     // Catch:{ JSONException -> 0x0032 }
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x0032 }
        L_0x0031:
            return r0
        L_0x0032:
            r0 = move-exception
            r5 = r0
            j0.c r2 = p126j0.C8266c.f11641a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11651g
            bo.app.b0$d r7 = p042bo.app.C3012b0.C3016d.f1467b
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r10
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3012b0.mo28608l():org.json.JSONObject");
    }

    /* renamed from: t */
    public final int mo28618t() {
        return this.f1463u;
    }

    /* renamed from: a */
    public void mo28605a(String str) {
        this.f1462t = str;
    }

    /* renamed from: a */
    public void mo28604a(C3285j2 j2Var, C3285j2 j2Var2, C3084d dVar) {
        Map<String, String> f;
        String str;
        Long a;
        C12775o.m28639i(j2Var, "internalPublisher");
        C12775o.m28639i(j2Var2, "externalPublisher");
        if (dVar == null || (f = dVar.mo28800f()) == null || (str = f.get("retry-after")) == null || (a = C3745v1.m4012a(str)) == null) {
            j2Var.mo29152a(new C3759w(), C3759w.class);
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3015c.f1466b, 7, (Object) null);
            return;
        }
        long longValue = a.longValue();
        j2Var.mo29152a(new C3780x(longValue, mo28618t() + 1), C3780x.class);
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3014b(longValue), 7, (Object) null);
    }

    /* renamed from: a */
    public void mo28617a(Map<String, String> map) {
        C12775o.m28639i(map, "existingHeaders");
        super.mo28617a(map);
        map.put("X-Braze-DataRequest", "true");
        map.put("X-Braze-ContentCardsRequest", "true");
        map.put("BRAZE-SYNC-RETRY-COUNT", String.valueOf(this.f1463u));
    }
}
