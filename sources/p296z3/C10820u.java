package p296z3;

import android.text.TextUtils;
import com.appboy.Constants;
import com.google.android.gms.internal.gtm.C5273b1;
import com.google.android.gms.internal.gtm.C5316e;
import com.google.android.gms.internal.gtm.C5422l;
import com.google.android.gms.internal.gtm.C5451md;
import com.google.android.gms.internal.gtm.C5485p;
import com.google.android.gms.internal.gtm.C5502q1;
import java.util.HashMap;
import java.util.Map;
import p231t4.C9713p;

/* renamed from: z3.u */
final class C10820u implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ Map f16570b;

    /* renamed from: c */
    private final /* synthetic */ boolean f16571c;

    /* renamed from: d */
    private final /* synthetic */ String f16572d;

    /* renamed from: e */
    private final /* synthetic */ long f16573e;

    /* renamed from: f */
    private final /* synthetic */ boolean f16574f;

    /* renamed from: g */
    private final /* synthetic */ boolean f16575g;

    /* renamed from: h */
    private final /* synthetic */ String f16576h;

    /* renamed from: i */
    private final /* synthetic */ C10801f f16577i;

    C10820u(C10801f fVar, Map map, boolean z, String str, long j, boolean z2, boolean z3, String str2) {
        this.f16577i = fVar;
        this.f16570b = map;
        this.f16571c = z;
        this.f16572d = str;
        this.f16573e = j;
        this.f16574f = z2;
        this.f16575g = z3;
        this.f16576h = str2;
    }

    public final void run() {
        boolean z;
        if (this.f16577i.f16532h.mo45730R0()) {
            this.f16570b.put("sc", "start");
        }
        Map map = this.f16570b;
        C10797b v0 = this.f16577i.mo33283v0();
        C9713p.m20274i("getClientId can not be called from the main thread");
        C5502q1.m8406m(map, Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, v0.mo45735g().mo33344s().mo33207U0());
        String str = (String) this.f16570b.get("sf");
        if (str != null) {
            double a = C5502q1.m8394a(str, 100.0d);
            if (C5502q1.m8398e(a, (String) this.f16570b.get(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY))) {
                this.f16577i.mo33272R("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(a));
                return;
            }
        }
        C5316e X0 = this.f16577i.mo33259B0();
        if (this.f16571c) {
            C5502q1.m8404k(this.f16570b, "ate", X0.mo33182S0());
            C5502q1.m8403j(this.f16570b, "adid", X0.mo33183T0());
        } else {
            this.f16570b.remove("ate");
            this.f16570b.remove("adid");
        }
        C5451md R0 = this.f16577i.mo33260C0().mo33622R0();
        C5502q1.m8403j(this.f16570b, "an", R0.mo33369j());
        C5502q1.m8403j(this.f16570b, "av", R0.mo33370k());
        C5502q1.m8403j(this.f16570b, "aid", R0.mo33371l());
        C5502q1.m8403j(this.f16570b, "aiid", R0.mo33372m());
        this.f16570b.put("v", "1");
        this.f16570b.put("_v", C5422l.f6101b);
        C5502q1.m8403j(this.f16570b, "ul", this.f16577i.mo33261D0().mo33508R0().mo33502e());
        C5502q1.m8403j(this.f16570b, "sr", this.f16577i.mo33261D0().mo33509S0());
        if (this.f16572d.equals("transaction") || this.f16572d.equals("item")) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.f16577i.f16531g.mo33184a()) {
            long g = C5502q1.m8400g((String) this.f16570b.get("ht"));
            if (g == 0) {
                g = this.f16573e;
            }
            long j = g;
            if (this.f16574f) {
                this.f16577i.mo33280p0().mo33275a0("Dry run enabled. Would have sent hit", new C5273b1(this.f16577i, this.f16570b, j, this.f16575g));
                return;
            }
            HashMap hashMap = new HashMap();
            C5502q1.m8397d(hashMap, "uid", this.f16570b);
            C5502q1.m8397d(hashMap, "an", this.f16570b);
            C5502q1.m8397d(hashMap, "aid", this.f16570b);
            C5502q1.m8397d(hashMap, "av", this.f16570b);
            C5502q1.m8397d(hashMap, "aiid", this.f16570b);
            this.f16570b.put("_s", String.valueOf(this.f16577i.mo33284w0().mo33201T0(new C5485p(0, (String) this.f16570b.get(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY), this.f16576h, !TextUtils.isEmpty((CharSequence) this.f16570b.get("adid")), 0, hashMap))));
            this.f16577i.mo33284w0().mo33203W0(new C5273b1(this.f16577i, this.f16570b, j, this.f16575g));
            return;
        }
        this.f16577i.mo33280p0().mo33215S0(this.f16570b, "Too many hits sent too quickly, rate limiting invoked");
    }
}
