package p296z3;

import android.net.Uri;
import android.text.TextUtils;
import com.appboy.Constants;
import com.google.android.gms.internal.gtm.C5271b;
import com.google.android.gms.internal.gtm.C5273b1;
import com.google.android.gms.internal.gtm.C5286c;
import com.google.android.gms.internal.gtm.C5301d;
import com.google.android.gms.internal.gtm.C5392j;
import com.google.android.gms.internal.gtm.C5422l;
import com.google.android.gms.internal.gtm.C5437m;
import com.google.android.gms.internal.gtm.C5451md;
import com.google.android.gms.internal.gtm.C5466nd;
import com.google.android.gms.internal.gtm.C5484od;
import com.google.android.gms.internal.gtm.C5485p;
import com.google.android.gms.internal.gtm.C5499pd;
import com.google.android.gms.internal.gtm.C5502q1;
import com.google.android.gms.internal.gtm.C5514qd;
import com.google.android.gms.internal.gtm.C5529rd;
import com.google.android.gms.internal.gtm.C5544sd;
import com.google.android.gms.internal.gtm.C5560td;
import com.google.android.gms.internal.gtm.C5575ud;
import com.google.android.gms.internal.gtm.C5590vd;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p022a4.C2200a;
import p022a4.C2201b;
import p022a4.C2202c;
import p231t4.C9713p;

/* renamed from: z3.h */
public final class C10804h extends C5392j implements C10819t {

    /* renamed from: f */
    private static DecimalFormat f16538f;

    /* renamed from: c */
    private final C5437m f16539c;

    /* renamed from: d */
    private final String f16540d;

    /* renamed from: e */
    private final Uri f16541e;

    public C10804h(C5437m mVar, String str) {
        this(mVar, str, true, false);
    }

    /* renamed from: N0 */
    private static String m23016N0(double d) {
        if (f16538f == null) {
            f16538f = new DecimalFormat("0.######");
        }
        return f16538f.format(d);
    }

    /* renamed from: O0 */
    private static void m23017O0(Map<String, String> map, String str, double d) {
        if (d != 0.0d) {
            map.put(str, m23016N0(d));
        }
    }

    /* renamed from: P0 */
    private static void m23018P0(Map<String, String> map, String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            map.put(str, sb.toString());
        }
    }

    /* renamed from: Q0 */
    private static void m23019Q0(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    /* renamed from: R0 */
    private static void m23020R0(Map<String, String> map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    /* renamed from: S0 */
    static Uri m23021S0(String str) {
        C9713p.m20271f(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    /* renamed from: T0 */
    private static Map<String, String> m23022T0(C10808l lVar) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        C5514qd qdVar = (C5514qd) lVar.mo45739a(C5514qd.class);
        if (qdVar != null) {
            for (Map.Entry next : qdVar.mo33488f().entrySet()) {
                Object value = next.getValue();
                String str3 = null;
                if (value != null) {
                    if (value instanceof String) {
                        String str4 = (String) value;
                        if (!TextUtils.isEmpty(str4)) {
                            str3 = str4;
                        }
                    } else if (value instanceof Double) {
                        Double d = (Double) value;
                        if (d.doubleValue() != 0.0d) {
                            str3 = m23016N0(d.doubleValue());
                        }
                    } else if (!(value instanceof Boolean)) {
                        str3 = String.valueOf(value);
                    } else if (value != Boolean.FALSE) {
                        str3 = "1";
                    }
                }
                if (str3 != null) {
                    hashMap.put((String) next.getKey(), str3);
                }
            }
        }
        C5590vd vdVar = (C5590vd) lVar.mo45739a(C5590vd.class);
        if (vdVar != null) {
            m23019Q0(hashMap, Constants.APPBOY_PUSH_TITLE_KEY, vdVar.mo33586i());
            m23019Q0(hashMap, Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, vdVar.mo33587j());
            m23019Q0(hashMap, "uid", vdVar.mo33588k());
            m23019Q0(hashMap, "sc", vdVar.mo33591n());
            m23017O0(hashMap, "sf", vdVar.mo33593p());
            m23020R0(hashMap, "ni", vdVar.mo33592o());
            m23019Q0(hashMap, "adid", vdVar.mo33589l());
            m23020R0(hashMap, "ate", vdVar.mo33590m());
        }
        C5271b bVar = (C5271b) lVar.mo45739a(C5271b.class);
        if (bVar != null) {
            m23019Q0(hashMap, "cd", bVar.mo33105e());
            m23017O0(hashMap, Constants.APPBOY_PUSH_CONTENT_KEY, (double) bVar.mo33106f());
            m23019Q0(hashMap, "dr", bVar.mo33107g());
        }
        C5560td tdVar = (C5560td) lVar.mo45739a(C5560td.class);
        if (tdVar != null) {
            m23019Q0(hashMap, "ec", tdVar.mo33544h());
            m23019Q0(hashMap, "ea", tdVar.mo33541e());
            m23019Q0(hashMap, "el", tdVar.mo33542f());
            m23017O0(hashMap, "ev", (double) tdVar.mo33543g());
        }
        C5466nd ndVar = (C5466nd) lVar.mo45739a(C5466nd.class);
        if (ndVar != null) {
            m23019Q0(hashMap, "cn", ndVar.mo33395f());
            m23019Q0(hashMap, "cs", ndVar.mo33396g());
            m23019Q0(hashMap, "cm", ndVar.mo33398i());
            m23019Q0(hashMap, "ck", ndVar.mo33399j());
            m23019Q0(hashMap, "cc", ndVar.mo33400k());
            m23019Q0(hashMap, "ci", ndVar.mo33394e());
            m23019Q0(hashMap, "anid", ndVar.mo33401l());
            m23019Q0(hashMap, "gclid", ndVar.mo33402m());
            m23019Q0(hashMap, "dclid", ndVar.mo33403n());
            m23019Q0(hashMap, "aclid", ndVar.mo33404o());
        }
        C5575ud udVar = (C5575ud) lVar.mo45739a(C5575ud.class);
        if (udVar != null) {
            m23019Q0(hashMap, "exd", udVar.f6366a);
            m23020R0(hashMap, "exf", udVar.f6367b);
        }
        C5286c cVar = (C5286c) lVar.mo45739a(C5286c.class);
        if (cVar != null) {
            m23019Q0(hashMap, "sn", cVar.f5890a);
            m23019Q0(hashMap, "sa", cVar.f5891b);
            m23019Q0(hashMap, "st", cVar.f5892c);
        }
        C5301d dVar = (C5301d) lVar.mo45739a(C5301d.class);
        if (dVar != null) {
            m23019Q0(hashMap, "utv", dVar.f5914a);
            m23017O0(hashMap, "utt", (double) dVar.f5915b);
            m23019Q0(hashMap, "utc", dVar.f5916c);
            m23019Q0(hashMap, "utl", dVar.f5917d);
        }
        C5484od odVar = (C5484od) lVar.mo45739a(C5484od.class);
        if (odVar != null) {
            for (Map.Entry next2 : odVar.mo33433e().entrySet()) {
                String b = C10805i.m23026b(((Integer) next2.getKey()).intValue());
                if (!TextUtils.isEmpty(b)) {
                    hashMap.put(b, (String) next2.getValue());
                }
            }
        }
        C5499pd pdVar = (C5499pd) lVar.mo45739a(C5499pd.class);
        if (pdVar != null) {
            for (Map.Entry next3 : pdVar.mo33463e().entrySet()) {
                String c = C10805i.m23027c(((Integer) next3.getKey()).intValue());
                if (!TextUtils.isEmpty(c)) {
                    hashMap.put(c, m23016N0(((Double) next3.getValue()).doubleValue()));
                }
            }
        }
        C5544sd sdVar = (C5544sd) lVar.mo45739a(C5544sd.class);
        if (sdVar != null) {
            C2201b e = sdVar.mo33520e();
            if (e != null) {
                for (Map.Entry next4 : e.mo23509a().entrySet()) {
                    if (((String) next4.getKey()).startsWith("&")) {
                        hashMap.put(((String) next4.getKey()).substring(1), (String) next4.getValue());
                    } else {
                        hashMap.put((String) next4.getKey(), (String) next4.getValue());
                    }
                }
            }
            int i = 1;
            for (C2202c f : sdVar.mo33523h()) {
                hashMap.putAll(f.mo23524f(C10805i.m23031g(i)));
                i++;
            }
            int i2 = 1;
            for (C2200a m : sdVar.mo33521f()) {
                hashMap.putAll(m.mo23507m(C10805i.m23029e(i2)));
                i2++;
            }
            int i3 = 1;
            for (Map.Entry next5 : sdVar.mo33522g().entrySet()) {
                String j = C10805i.m23034j(i3);
                int i4 = 1;
                for (C2200a aVar : (List) next5.getValue()) {
                    String valueOf = String.valueOf(j);
                    String valueOf2 = String.valueOf(C10805i.m23032h(i4));
                    if (valueOf2.length() != 0) {
                        str2 = valueOf.concat(valueOf2);
                    } else {
                        str2 = new String(valueOf);
                    }
                    hashMap.putAll(aVar.mo23507m(str2));
                    i4++;
                }
                if (!TextUtils.isEmpty((CharSequence) next5.getKey())) {
                    String valueOf3 = String.valueOf(j);
                    if ("nm".length() != 0) {
                        str = valueOf3.concat("nm");
                    } else {
                        str = new String(valueOf3);
                    }
                    hashMap.put(str, (String) next5.getKey());
                }
                i3++;
            }
        }
        C5529rd rdVar = (C5529rd) lVar.mo45739a(C5529rd.class);
        if (rdVar != null) {
            m23019Q0(hashMap, "ul", rdVar.mo33502e());
            m23017O0(hashMap, Constants.APPBOY_PUSH_NOTIFICATION_SOUND_KEY, (double) rdVar.f6289b);
            m23018P0(hashMap, "sr", rdVar.f6290c, rdVar.f6291d);
            m23018P0(hashMap, "vp", rdVar.f6292e, rdVar.f6293f);
        }
        C5451md mdVar = (C5451md) lVar.mo45739a(C5451md.class);
        if (mdVar != null) {
            m23019Q0(hashMap, "an", mdVar.mo33369j());
            m23019Q0(hashMap, "aid", mdVar.mo33371l());
            m23019Q0(hashMap, "aiid", mdVar.mo33372m());
            m23019Q0(hashMap, "av", mdVar.mo33370k());
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo45736a(C10808l lVar) {
        C9713p.m20275j(lVar);
        C9713p.m20267b(lVar.mo45747i(), "Can't deliver not submitted measurement");
        C9713p.m20274i("deliver should be called on worker thread");
        C10808l d = lVar.mo45742d();
        C5590vd vdVar = (C5590vd) d.mo45752n(C5590vd.class);
        if (TextUtils.isEmpty(vdVar.mo33586i())) {
            mo33280p0().mo33215S0(m23022T0(d), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(vdVar.mo33587j())) {
            mo33280p0().mo33215S0(m23022T0(d), "Ignoring measurement without client id");
        } else if (!this.f16539c.mo33341p().mo45713h()) {
            double p = vdVar.mo33593p();
            if (C5502q1.m8398e(p, vdVar.mo33587j())) {
                mo33272R("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(p));
                return;
            }
            Map<String, String> T0 = m23022T0(d);
            T0.put("v", "1");
            T0.put("_v", C5422l.f6101b);
            T0.put("tid", this.f16540d);
            if (this.f16539c.mo33341p().mo45714j()) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry next : T0.entrySet()) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append((String) next.getKey());
                    sb.append("=");
                    sb.append((String) next.getValue());
                }
                mo33275a0("Dry run is enabled. GoogleAnalytics would have sent", sb.toString());
                return;
            }
            HashMap hashMap = new HashMap();
            C5502q1.m8403j(hashMap, "uid", vdVar.mo33588k());
            C5451md mdVar = (C5451md) lVar.mo45739a(C5451md.class);
            if (mdVar != null) {
                C5502q1.m8403j(hashMap, "an", mdVar.mo33369j());
                C5502q1.m8403j(hashMap, "aid", mdVar.mo33371l());
                C5502q1.m8403j(hashMap, "av", mdVar.mo33370k());
                C5502q1.m8403j(hashMap, "aiid", mdVar.mo33372m());
            }
            T0.put("_s", String.valueOf(mo33284w0().mo33201T0(new C5485p(0, vdVar.mo33587j(), this.f16540d, !TextUtils.isEmpty(vdVar.mo33589l()), 0, hashMap))));
            mo33284w0().mo33203W0(new C5273b1(mo33280p0(), T0, lVar.mo45745g(), true));
        }
    }

    /* renamed from: b */
    public final Uri mo45737b() {
        return this.f16541e;
    }

    private C10804h(C5437m mVar, String str, boolean z, boolean z2) {
        super(mVar);
        C9713p.m20271f(str);
        this.f16539c = mVar;
        this.f16540d = str;
        this.f16541e = m23021S0(str);
    }
}
