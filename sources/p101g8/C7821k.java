package p101g8;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;
import p051c8.C3961l2;
import p101g8.C7796a;
import p101g8.C7802c;
import p101g8.C7805d;
import p101g8.C7809f;
import p101g8.C7814h;
import p101g8.C7818j;
import p101g8.C7828n;
import p111h6.C8012n;
import p223s7.C9516a0;
import p223s7.C9521b0;
import p223s7.C9524c0;
import p223s7.C9528d0;
import p223s7.C9533e0;
import p223s7.C9537f0;
import p223s7.C9541g0;
import p223s7.C9575z;

/* renamed from: g8.k */
/* compiled from: ProtoMarshallerClient */
public class C7821k {

    /* renamed from: g8.k$a */
    /* compiled from: ProtoMarshallerClient */
    class C7822a extends C7817i {
        C7822a(C7808e eVar, MessageType messageType, Map map) {
            super(eVar, messageType, map);
        }
    }

    /* renamed from: g8.k$b */
    /* compiled from: ProtoMarshallerClient */
    static /* synthetic */ class C7823b {

        /* renamed from: a */
        static final /* synthetic */ int[] f10900a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                s7.d0$b[] r0 = p223s7.C9528d0.C9530b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10900a = r0
                s7.d0$b r1 = p223s7.C9528d0.C9530b.BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10900a     // Catch:{ NoSuchFieldError -> 0x001d }
                s7.d0$b r1 = p223s7.C9528d0.C9530b.IMAGE_ONLY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10900a     // Catch:{ NoSuchFieldError -> 0x0028 }
                s7.d0$b r1 = p223s7.C9528d0.C9530b.MODAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10900a     // Catch:{ NoSuchFieldError -> 0x0033 }
                s7.d0$b r1 = p223s7.C9528d0.C9530b.CARD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p101g8.C7821k.C7823b.<clinit>():void");
        }
    }

    C7821k() {
    }

    /* renamed from: a */
    private static C7796a.C7798b m15288a(C9575z zVar) {
        C7796a.C7798b a = C7796a.m15212a();
        if (!TextUtils.isEmpty(zVar.mo44050J())) {
            a.mo41451b(zVar.mo44050J());
        }
        return a;
    }

    /* renamed from: b */
    private static C7796a m15289b(C9575z zVar, C9521b0 b0Var) {
        C7796a.C7798b a = m15288a(zVar);
        if (!b0Var.equals(C9521b0.m19761K())) {
            C7805d.C7807b a2 = C7805d.m15237a();
            if (!TextUtils.isEmpty(b0Var.mo43993J())) {
                a2.mo41481b(b0Var.mo43993J());
            }
            if (b0Var.mo43995M()) {
                C7828n.C7830b a3 = C7828n.m15308a();
                C9541g0 L = b0Var.mo43994L();
                if (!TextUtils.isEmpty(L.mo44032L())) {
                    a3.mo41535c(L.mo44032L());
                }
                if (!TextUtils.isEmpty(L.mo44031K())) {
                    a3.mo41534b(L.mo44031K());
                }
                a2.mo41482c(a3.mo41533a());
            }
            a.mo41452c(a2.mo41480a());
        }
        return a.mo41450a();
    }

    /* renamed from: c */
    public static C7817i m15290c(C9528d0 d0Var, @NonNull String str, @NonNull String str2, boolean z, Map<String, String> map) {
        C8012n.m15756o(d0Var, "FirebaseInAppMessaging content cannot be null.");
        C8012n.m15756o(str, "FirebaseInAppMessaging campaign id cannot be null.");
        C8012n.m15756o(str2, "FirebaseInAppMessaging campaign name cannot be null.");
        C3961l2.m4602a("Decoding message: " + d0Var.toString());
        C7808e eVar = new C7808e(str, str2, z);
        int i = C7823b.f10900a[d0Var.mo44015N().ordinal()];
        if (i == 1) {
            return m15292e(d0Var.mo44012J()).mo41470a(eVar, map);
        }
        if (i == 2) {
            return m15294g(d0Var.mo44014M()).mo41511a(eVar, map);
        }
        if (i == 3) {
            return m15295h(d0Var.mo44016P()).mo41522a(eVar, map);
        }
        if (i != 4) {
            return new C7822a(new C7808e(str, str2, z), MessageType.UNSUPPORTED, map);
        }
        return m15293f(d0Var.mo44013K()).mo41495a(eVar, map);
    }

    /* renamed from: d */
    private static C7828n m15291d(C9541g0 g0Var) {
        C7828n.C7830b a = C7828n.m15308a();
        if (!TextUtils.isEmpty(g0Var.mo44031K())) {
            a.mo41534b(g0Var.mo44031K());
        }
        if (!TextUtils.isEmpty(g0Var.mo44032L())) {
            a.mo41535c(g0Var.mo44032L());
        }
        return a.mo41533a();
    }

    /* renamed from: e */
    private static C7802c.C7804b m15292e(C9516a0 a0Var) {
        C7802c.C7804b d = C7802c.m15225d();
        if (!TextUtils.isEmpty(a0Var.mo43984K())) {
            d.mo41472c(a0Var.mo43984K());
        }
        if (!TextUtils.isEmpty(a0Var.mo43986N())) {
            d.mo41474e(C7812g.m15263a().mo41507b(a0Var.mo43986N()).mo41506a());
        }
        if (a0Var.mo43988R()) {
            d.mo41471b(m15288a(a0Var.mo43983J()).mo41450a());
        }
        if (a0Var.mo43989S()) {
            d.mo41473d(m15291d(a0Var.mo43985L()));
        }
        if (a0Var.mo43990T()) {
            d.mo41475f(m15291d(a0Var.mo43987P()));
        }
        return d;
    }

    /* renamed from: f */
    private static C7809f.C7811b m15293f(C9524c0 c0Var) {
        C7809f.C7811b d = C7809f.m15246d();
        if (c0Var.mo44010a0()) {
            d.mo41502h(m15291d(c0Var.mo44004U()));
        }
        if (c0Var.mo44005V()) {
            d.mo41497c(m15291d(c0Var.mo43997K()));
        }
        if (!TextUtils.isEmpty(c0Var.mo43996J())) {
            d.mo41496b(c0Var.mo43996J());
        }
        if (c0Var.mo44006W() || c0Var.mo44007X()) {
            d.mo41500f(m15289b(c0Var.mo44000P(), c0Var.mo44001R()));
        }
        if (c0Var.mo44008Y() || c0Var.mo44009Z()) {
            d.mo41501g(m15289b(c0Var.mo44002S(), c0Var.mo44003T()));
        }
        if (!TextUtils.isEmpty(c0Var.mo43999N())) {
            d.mo41499e(C7812g.m15263a().mo41507b(c0Var.mo43999N()).mo41506a());
        }
        if (!TextUtils.isEmpty(c0Var.mo43998M())) {
            d.mo41498d(C7812g.m15263a().mo41507b(c0Var.mo43998M()).mo41506a());
        }
        return d;
    }

    /* renamed from: g */
    private static C7814h.C7816b m15294g(C9533e0 e0Var) {
        C7814h.C7816b d = C7814h.m15267d();
        if (!TextUtils.isEmpty(e0Var.mo44019L())) {
            d.mo41513c(C7812g.m15263a().mo41507b(e0Var.mo44019L()).mo41506a());
        }
        if (e0Var.mo44020M()) {
            d.mo41512b(m15288a(e0Var.mo44018J()).mo41450a());
        }
        return d;
    }

    /* renamed from: h */
    private static C7818j.C7820b m15295h(C9537f0 f0Var) {
        C7818j.C7820b d = C7818j.m15276d();
        if (!TextUtils.isEmpty(f0Var.mo44024L())) {
            d.mo41524c(f0Var.mo44024L());
        }
        if (!TextUtils.isEmpty(f0Var.mo44026P())) {
            d.mo41526e(C7812g.m15263a().mo41507b(f0Var.mo44026P()).mo41506a());
        }
        if (f0Var.mo44028S()) {
            d.mo41523b(m15289b(f0Var.mo44022J(), f0Var.mo44023K()));
        }
        if (f0Var.mo44029T()) {
            d.mo41525d(m15291d(f0Var.mo44025M()));
        }
        if (f0Var.mo44030U()) {
            d.mo41527f(m15291d(f0Var.mo44027R()));
        }
        return d;
    }
}
