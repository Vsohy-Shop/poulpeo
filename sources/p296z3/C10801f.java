package p296z3;

import android.text.TextUtils;
import com.appboy.Constants;
import com.google.android.gms.internal.gtm.C5318e1;
import com.google.android.gms.internal.gtm.C5407k;
import com.google.android.gms.internal.gtm.C5437m;
import com.google.android.gms.internal.gtm.C5502q1;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import p231t4.C9713p;

/* renamed from: z3.f */
public class C10801f extends C5407k {

    /* renamed from: d */
    private boolean f16528d;

    /* renamed from: e */
    private final Map<String, String> f16529e;

    /* renamed from: f */
    private final Map<String, String> f16530f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5318e1 f16531g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C10802a f16532h;

    C10801f(C5437m mVar, String str, C5318e1 e1Var) {
        super(mVar);
        HashMap hashMap = new HashMap();
        this.f16529e = hashMap;
        if (str != null) {
            hashMap.put("&tid", str);
        }
        hashMap.put("useSecure", "1");
        hashMap.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.f16531g = new C5318e1("tracking", mo33279k0());
        this.f16532h = new C10802a(mVar);
    }

    /* renamed from: U0 */
    private static String m22993U0(Map.Entry<String, String> entry) {
        boolean z;
        String key = entry.getKey();
        if (!key.startsWith("&") || key.length() < 2) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        return entry.getKey().substring(1);
    }

    /* renamed from: W0 */
    private static void m22995W0(Map<String, String> map, Map<String, String> map2) {
        C9713p.m20275j(map2);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                String U0 = m22993U0(next);
                if (U0 != null) {
                    map2.put(U0, (String) next.getValue());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public final void mo33181P0() {
        this.f16532h.mo33309O0();
        String R0 = mo33286y0().mo33491R0();
        if (R0 != null) {
            mo45729T0("&an", R0);
        }
        String S0 = mo33286y0().mo33492S0();
        if (S0 != null) {
            mo45729T0("&av", S0);
        }
    }

    /* renamed from: R0 */
    public void mo45727R0(boolean z) {
        this.f16528d = z;
    }

    /* renamed from: S0 */
    public void mo45728S0(Map<String, String> map) {
        long a = mo33279k0().mo33547a();
        if (mo33283v0().mo45713h()) {
            mo33267J0("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        boolean j = mo33283v0().mo45714j();
        HashMap hashMap = new HashMap();
        m22995W0(this.f16529e, hashMap);
        m22995W0(map, hashMap);
        int i = 1;
        boolean l = C5502q1.m8405l(this.f16529e.get("useSecure"), true);
        Map<String, String> map2 = this.f16530f;
        C9713p.m20275j(hashMap);
        if (map2 != null) {
            for (Map.Entry next : map2.entrySet()) {
                String U0 = m22993U0(next);
                if (U0 != null && !hashMap.containsKey(U0)) {
                    hashMap.put(U0, (String) next.getValue());
                }
            }
        }
        this.f16530f.clear();
        String str = (String) hashMap.get(Constants.APPBOY_PUSH_TITLE_KEY);
        if (TextUtils.isEmpty(str)) {
            mo33280p0().mo33215S0(hashMap, "Missing hit type parameter");
            return;
        }
        String str2 = (String) hashMap.get("tid");
        if (TextUtils.isEmpty(str2)) {
            mo33280p0().mo33215S0(hashMap, "Missing tracking id parameter");
            return;
        }
        boolean z = this.f16528d;
        synchronized (this) {
            if ("screenview".equalsIgnoreCase(str) || "pageview".equalsIgnoreCase(str) || "appview".equalsIgnoreCase(str) || TextUtils.isEmpty(str)) {
                int parseInt = Integer.parseInt(this.f16529e.get("&a")) + 1;
                if (parseInt < Integer.MAX_VALUE) {
                    i = parseInt;
                }
                this.f16529e.put("&a", Integer.toString(i));
            }
        }
        mo33282u0().mo45758d(new C10820u(this, hashMap, z, str, a, j, l, str2));
    }

    /* renamed from: T0 */
    public void mo45729T0(String str, String str2) {
        C9713p.m20276k(str, "Key should be non-null");
        if (!TextUtils.isEmpty(str)) {
            this.f16529e.put(str, str2);
        }
    }

    /* renamed from: z3.f$a */
    class C10802a extends C5407k {

        /* renamed from: d */
        private long f16533d = -1;

        /* renamed from: e */
        private boolean f16534e;

        protected C10802a(C5437m mVar) {
            super(mVar);
        }

        /* renamed from: R0 */
        public final synchronized boolean mo45730R0() {
            boolean z;
            z = this.f16534e;
            this.f16534e = false;
            return z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: P0 */
        public final void mo33181P0() {
        }
    }
}
