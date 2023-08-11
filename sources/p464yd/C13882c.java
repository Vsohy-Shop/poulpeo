package p464yd;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.List;
import okio.C13133f;
import p111h6.C8012n;
import p306ae.C10871d;
import p364io.grpc.C12173h;
import p364io.grpc.C12564o;
import p364io.grpc.internal.C12367m2;
import p364io.grpc.internal.C12404r0;

/* renamed from: yd.c */
/* compiled from: Headers */
class C13882c {

    /* renamed from: a */
    public static final C10871d f22627a;

    /* renamed from: b */
    public static final C10871d f22628b;

    /* renamed from: c */
    public static final C10871d f22629c;

    /* renamed from: d */
    public static final C10871d f22630d;

    /* renamed from: e */
    public static final C10871d f22631e = new C10871d(C12404r0.f19749h.mo50255d(), "application/grpc");

    /* renamed from: f */
    public static final C10871d f22632f = new C10871d("te", "trailers");

    static {
        C13133f fVar = C10871d.f16685g;
        f22627a = new C10871d(fVar, "https");
        f22628b = new C10871d(fVar, ProxyConfig.MATCH_HTTP);
        C13133f fVar2 = C10871d.f16683e;
        f22629c = new C10871d(fVar2, ShareTarget.METHOD_POST);
        f22630d = new C10871d(fVar2, ShareTarget.METHOD_GET);
    }

    /* renamed from: a */
    public static List<C10871d> m31958a(C12564o oVar, String str, String str2, String str3, boolean z, boolean z2) {
        C8012n.m15756o(oVar, "headers");
        C8012n.m15756o(str, "defaultPath");
        C8012n.m15756o(str2, "authority");
        oVar.mo50240d(C12404r0.f19749h);
        oVar.mo50240d(C12404r0.f19750i);
        C12564o.C12571g<String> gVar = C12404r0.f19751j;
        oVar.mo50240d(gVar);
        ArrayList arrayList = new ArrayList(C12173h.m26564a(oVar) + 7);
        if (z2) {
            arrayList.add(f22628b);
        } else {
            arrayList.add(f22627a);
        }
        if (z) {
            arrayList.add(f22630d);
        } else {
            arrayList.add(f22629c);
        }
        arrayList.add(new C10871d(C10871d.f16686h, str2));
        arrayList.add(new C10871d(C10871d.f16684f, str));
        arrayList.add(new C10871d(gVar.mo50255d(), str3));
        arrayList.add(f22631e);
        arrayList.add(f22632f);
        byte[][] d = C12367m2.m27193d(oVar);
        for (int i = 0; i < d.length; i += 2) {
            C13133f v = C13133f.m29655v(d[i]);
            if (m31959b(v.mo52595N())) {
                arrayList.add(new C10871d(v, C13133f.m29655v(d[i + 1])));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m31959b(String str) {
        if (str.startsWith(":") || C12404r0.f19749h.mo50255d().equalsIgnoreCase(str) || C12404r0.f19751j.mo50255d().equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }
}
