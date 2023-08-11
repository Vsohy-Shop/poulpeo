package p270x;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.appboy.Constants;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.models.push.BrazeNotificationPayload;
import com.braze.configuration.C4216a;
import com.braze.configuration.C4218b;
import com.braze.configuration.C4245d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import p031b0.C2805b;
import p031b0.C2807d;
import p031b0.C2811f;
import p031b0.C2812g;
import p031b0.C2813h;
import p042bo.app.C2993a2;
import p042bo.app.C2995a4;
import p042bo.app.C3006b;
import p042bo.app.C3023b2;
import p042bo.app.C3026b5;
import p042bo.app.C3030b6;
import p042bo.app.C3043c3;
import p042bo.app.C3162g2;
import p042bo.app.C3203h2;
import p042bo.app.C3206h4;
import p042bo.app.C3240j;
import p042bo.app.C3285j2;
import p042bo.app.C3303k1;
import p042bo.app.C3317k4;
import p042bo.app.C3395l4;
import p042bo.app.C3423m0;
import p042bo.app.C3429m2;
import p042bo.app.C3501o1;
import p042bo.app.C3704t6;
import p042bo.app.C3732u6;
import p042bo.app.C3748v3;
import p042bo.app.C3785x1;
import p042bo.app.C3820z;
import p042bo.app.C3822z0;
import p042bo.app.C3832z3;
import p042bo.app.C3834z4;
import p043c0.C3840a;
import p043c0.C3864b;
import p081f0.C7554a;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8287i;
import p126j0.C8300j;
import p126j0.C8303k;
import p281y.C10606a;
import p292z.C10731b;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13970h;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* renamed from: x.b */
public final class C10156b implements C10346h {

    /* renamed from: m */
    public static final C10157a f15345m = new C10157a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final ReentrantLock f15346n = new ReentrantLock();

    /* renamed from: o */
    private static final Set<String> f15347o = C12729x0.m28549c("calypso appcrawler");

    /* renamed from: p */
    private static final Set<String> f15348p = C12731y0.m28555i("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static volatile C10156b f15349q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final ReentrantLock f15350r = new ReentrantLock();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static C10349j f15351s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static boolean f15352t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static boolean f15353u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static C3834z4 f15354v;

    /* renamed from: w */
    private static final List<C4216a> f15355w = new ArrayList();

    /* renamed from: x */
    private static final C4216a f15356x = new C4216a.C4217a().mo30863a();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static C10350k f15357y;

    /* renamed from: a */
    public C3864b f15358a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f15359b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3030b6 f15360c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3748v3 f15361d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C10300f f15362e;

    /* renamed from: f */
    private Boolean f15363f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f15364g;

    /* renamed from: h */
    public C3162g2 f15365h;

    /* renamed from: i */
    private C3285j2 f15366i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C3429m2 f15367j;

    /* renamed from: k */
    public C4218b f15368k;

    /* renamed from: l */
    public C3043c3 f15369l;

    /* renamed from: x.b$a */
    public static final class C10157a {

        /* renamed from: x.b$a$a */
        static final class C10158a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10158a f15370g = new C10158a();

            C10158a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Braze network requests already being mocked. Note that events dispatched in this mode are dropped.";
            }
        }

        /* renamed from: x.b$a$b */
        static final class C10159b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10159b f15371g = new C10159b();

            C10159b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Braze network requests will be mocked. Events dispatchedin this mode will be dropped.";
            }
        }

        /* renamed from: x.b$a$c */
        static final class C10160c extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10160c f15372g = new C10160c();

            C10160c() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.";
            }
        }

        /* renamed from: x.b$a$d */
        static final class C10161d extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10161d f15373g = new C10161d();

            C10161d() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Caught exception trying to get a Braze API endpoint from the BrazeEndpointProvider. Using the original URI";
            }
        }

        /* renamed from: x.b$a$e */
        static final class C10162e extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10162e f15374g = new C10162e();

            C10162e() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Caught exception while retrieving API key.";
            }
        }

        /* renamed from: x.b$a$f */
        static final class C10163f extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10163f f15375g = new C10163f();

            C10163f() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "SDK enablement provider was null. Returning SDK as enabled.";
            }
        }

        /* renamed from: x.b$a$g */
        static final class C10164g extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10164g f15376g = new C10164g();

            C10164g() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "API key not present. Actions will not be performed on the SDK.";
            }
        }

        /* renamed from: x.b$a$h */
        static final class C10165h extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10165h f15377g = new C10165h();

            C10165h() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "SDK is disabled. Actions will not be performed on the SDK.";
            }
        }

        /* renamed from: x.b$a$i */
        static final class C10166i extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ boolean f15378g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10166i(boolean z) {
                super(0);
                this.f15378g = z;
            }

            /* renamed from: a */
            public final String invoke() {
                String str;
                if (this.f15378g) {
                    str = "disabled";
                } else {
                    str = "enabled";
                }
                return C12775o.m28647q("Braze SDK outbound network requests are now ", str);
            }
        }

        /* renamed from: x.b$a$j */
        static final class C10167j extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10167j f15379g = new C10167j();

            C10167j() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Push contained key for fetching test triggers, fetching triggers.";
            }
        }

        /* renamed from: x.b$a$k */
        static final class C10168k extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10168k f15380g = new C10168k();

            C10168k() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "The instance is null. Allowing instance initialization";
            }
        }

        /* renamed from: x.b$a$l */
        static final class C10169l extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10169l f15381g = new C10169l();

            C10169l() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "The instance was stopped. Allowing instance initialization";
            }
        }

        /* renamed from: x.b$a$m */
        static final class C10170m extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10170m f15382g = new C10170m();

            C10170m() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "No API key was found previously. Allowing instance initialization";
            }
        }

        public /* synthetic */ C10157a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public final C3834z4 m21493i(Context context) {
            C3834z4 j = mo44813j();
            if (j != null) {
                return j;
            }
            C3834z4 z4Var = new C3834z4(context);
            mo44819q(z4Var);
            return z4Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public static final Uri m21494n(String str, Uri uri) {
            boolean z;
            C12775o.m28639i(uri, "brazeEndpoint");
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String encodedAuthority = parse.getEncodedAuthority();
            Uri.Builder buildUpon = uri.buildUpon();
            boolean z2 = false;
            if (scheme == null || C13754v.m31532t(scheme)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (encodedAuthority == null || C13754v.m31532t(encodedAuthority)) {
                    z2 = true;
                }
                if (!z2) {
                    buildUpon.encodedAuthority(encodedAuthority);
                    buildUpon.scheme(scheme);
                    return buildUpon.build();
                }
            }
            return buildUpon.encodedAuthority(str).build();
        }

        /* renamed from: r */
        private final boolean m21495r() {
            C10156b l = C10156b.f15349q;
            if (l == null) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, C10168k.f15380g, 6, (Object) null);
                return true;
            } else if (l.f15364g) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10169l.f15381g, 7, (Object) null);
                return true;
            } else if (!C12775o.m28634d(Boolean.FALSE, l.mo44775T())) {
                return false;
            } else {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10170m.f15382g, 7, (Object) null);
                return true;
            }
        }

        /* renamed from: c */
        public final boolean mo44807c() {
            if (C10156b.f15349q == null) {
                ReentrantLock g = C10156b.f15346n;
                g.lock();
                try {
                    if (C10156b.f15349q == null) {
                        if (C10156b.f15352t) {
                            C8266c.m16396e(C8266c.f11641a, C10156b.f15345m, C8266c.C8267a.I, (Throwable) null, false, C10158a.f15370g, 6, (Object) null);
                        } else {
                            C8266c.m16396e(C8266c.f11641a, C10156b.f15345m, C8266c.C8267a.I, (Throwable) null, false, C10159b.f15371g, 6, (Object) null);
                            C10156b.f15352t = true;
                        }
                        return true;
                    }
                    C11921v vVar = C11921v.f18618a;
                    g.unlock();
                } finally {
                    g.unlock();
                }
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10160c.f15372g, 6, (Object) null);
            return false;
        }

        /* renamed from: d */
        public final Uri mo44808d(Uri uri) {
            C12775o.m28639i(uri, "brazeEndpoint");
            ReentrantLock k = C10156b.f15350r;
            k.lock();
            try {
                C10349j j = C10156b.f15351s;
                if (j != null) {
                    Uri a = j.mo44761a(uri);
                    if (a != null) {
                        k.unlock();
                        return a;
                    }
                }
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, C10156b.f15345m, C8266c.C8267a.f11651g, e, false, C10161d.f15373g, 4, (Object) null);
            } catch (Throwable th) {
                k.unlock();
                throw th;
            }
            k.unlock();
            return uri;
        }

        /* renamed from: e */
        public final String mo44809e(C4218b bVar) {
            C12775o.m28639i(bVar, "configurationProvider");
            try {
                return bVar.getBrazeApiKey().toString();
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C10162e.f15374g, 4, (Object) null);
                return null;
            }
        }

        /* renamed from: f */
        public final C10350k mo44810f() {
            return C10156b.f15357y;
        }

        /* renamed from: g */
        public final C10156b mo44811g(Context context) {
            C12775o.m28639i(context, "context");
            if (m21495r()) {
                ReentrantLock g = C10156b.f15346n;
                g.lock();
                try {
                    if (C10156b.f15345m.m21495r()) {
                        C10156b bVar = new C10156b(context);
                        bVar.f15364g = false;
                        C10156b.f15349q = bVar;
                        return bVar;
                    }
                    C11921v vVar = C11921v.f18618a;
                    g.unlock();
                } finally {
                    g.unlock();
                }
            }
            C10156b l = C10156b.f15349q;
            if (l != null) {
                return l;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.braze.Braze");
        }

        /* renamed from: h */
        public final boolean mo44812h() {
            return C10156b.f15353u;
        }

        /* renamed from: j */
        public final C3834z4 mo44813j() {
            return C10156b.f15354v;
        }

        /* renamed from: k */
        public final boolean mo44814k() {
            C3834z4 j = mo44813j();
            if (j == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10163f.f15375g, 7, (Object) null);
                return false;
            }
            C10156b l = C10156b.f15349q;
            if (l == null || !C12775o.m28634d(Boolean.FALSE, l.mo44775T())) {
                boolean a = j.mo29850a();
                if (a) {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10165h.f15377g, 6, (Object) null);
                }
                return a;
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10164g.f15376g, 6, (Object) null);
            return true;
        }

        /* renamed from: l */
        public final void mo44815l(Intent intent, C3023b2 b2Var) {
            Intent intent2 = intent;
            C3023b2 b2Var2 = b2Var;
            C12775o.m28639i(intent2, "intent");
            C12775o.m28639i(b2Var2, "brazeManager");
            String stringExtra = intent2.getStringExtra(Constants.APPBOY_PUSH_FETCH_TEST_TRIGGERS_KEY);
            if (stringExtra != null && C12775o.m28634d(stringExtra, "true")) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C10167j.f15379g, 6, (Object) null);
                b2Var2.mo28634a(new C2995a4.C2996a((String) null, (Boolean) null, (Boolean) null, (C3832z3) null, 15, (DefaultConstructorMarker) null).mo28600c());
            }
        }

        /* renamed from: m */
        public final void mo44816m(String str) {
            ReentrantLock k = C10156b.f15350r;
            k.lock();
            try {
                C10156b.f15345m.mo44817o(new C10155a(str));
                C11921v vVar = C11921v.f18618a;
            } finally {
                k.unlock();
            }
        }

        /* renamed from: o */
        public final void mo44817o(C10349j jVar) {
            ReentrantLock k = C10156b.f15350r;
            k.lock();
            try {
                C10156b.f15351s = jVar;
                C11921v vVar = C11921v.f18618a;
            } finally {
                k.unlock();
            }
        }

        /* renamed from: p */
        public final void mo44818p(boolean z) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C10166i(z), 6, (Object) null);
            ReentrantLock g = C10156b.f15346n;
            g.lock();
            try {
                C10156b.f15353u = z;
                C10156b l = C10156b.f15349q;
                if (l != null) {
                    l.m21441w0(z);
                    C11921v vVar = C11921v.f18618a;
                }
            } finally {
                g.unlock();
            }
        }

        /* renamed from: q */
        public final void mo44819q(C3834z4 z4Var) {
            C10156b.f15354v = z4Var;
        }

        private C10157a() {
        }
    }

    /* renamed from: x.b$a0 */
    static final class C10171a0 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15383g;

        /* renamed from: h */
        final /* synthetic */ String f15384h;

        /* renamed from: i */
        final /* synthetic */ C10156b f15385i;

        /* renamed from: x.b$a0$a */
        static final class C10172a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10172a f15386g = new C10172a();

            C10172a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Push story page click input was invalid. Not logging in-app purchase to Braze.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10171a0(String str, String str2, C10156b bVar) {
            super(0);
            this.f15383g = str;
            this.f15384h = str2;
            this.f15385i = bVar;
        }

        /* renamed from: a */
        public final void mo44833a() {
            if (!C8303k.m16503h(this.f15383g, this.f15384h)) {
                C8266c.m16396e(C8266c.f11641a, this.f15385i, C8266c.C8267a.f11651g, (Throwable) null, false, C10172a.f15386g, 6, (Object) null);
                return;
            }
            C3240j.C3241a aVar = C3240j.f1842h;
            String str = this.f15383g;
            C12775o.m28636f(str);
            String str2 = this.f15384h;
            C12775o.m28636f(str2);
            C3785x1 e = aVar.mo29083e(str, str2);
            if (e != null) {
                this.f15385i.mo44773R().mo28715m().mo28641a(e);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44833a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$a1 */
    static final class C10173a1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15387g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10173a1(String str) {
            super(0);
            this.f15387g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to log custom event: ", this.f15387g);
        }
    }

    /* renamed from: x.b$b */
    static final class C10174b extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15388g;

        /* renamed from: h */
        final /* synthetic */ String f15389h;

        /* renamed from: i */
        final /* synthetic */ BigDecimal f15390i;

        /* renamed from: j */
        final /* synthetic */ int f15391j;

        /* renamed from: k */
        final /* synthetic */ C10156b f15392k;

        /* renamed from: l */
        final /* synthetic */ C7554a f15393l;

        /* renamed from: x.b$b$a */
        static final class C10175a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10175a f15394g = new C10175a();

            C10175a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Log purchase input was invalid. Not logging in-app purchase to Braze.";
            }
        }

        /* renamed from: x.b$b$b */
        static final class C10176b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10176b f15395g = new C10176b();

            C10176b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Purchase logged with invalid properties. Not logging custom event to Braze.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10174b(String str, String str2, BigDecimal bigDecimal, int i, C10156b bVar, C7554a aVar) {
            super(0);
            this.f15388g = str;
            this.f15389h = str2;
            this.f15390i = bigDecimal;
            this.f15391j = i;
            this.f15392k = bVar;
            this.f15393l = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
            if (r2.mo41304y() == true) goto L_0x0038;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo44836a() {
            /*
                r18 = this;
                r0 = r18
                java.lang.String r1 = r0.f15388g
                java.lang.String r2 = r0.f15389h
                java.math.BigDecimal r3 = r0.f15390i
                int r4 = r0.f15391j
                x.b r5 = r0.f15392k
                bo.app.c3 r5 = r5.mo44773R()
                bo.app.e5 r5 = r5.mo28707e()
                boolean r2 = p126j0.C8303k.m16501f(r1, r2, r3, r4, r5)
                if (r2 != 0) goto L_0x002a
                j0.c r3 = p126j0.C8266c.f11641a
                x.b r4 = r0.f15392k
                j0.c$a r5 = p126j0.C8266c.C8267a.f11651g
                x.b$b$a r8 = p270x.C10156b.C10174b.C10175a.f15394g
                r6 = 0
                r7 = 0
                r9 = 6
                r10 = 0
                p126j0.C8266c.m16396e(r3, r4, r5, r6, r7, r8, r9, r10)
                return
            L_0x002a:
                f0.a r2 = r0.f15393l
                if (r2 != 0) goto L_0x002f
                goto L_0x0037
            L_0x002f:
                boolean r2 = r2.mo41304y()
                r3 = 1
                if (r2 != r3) goto L_0x0037
                goto L_0x0038
            L_0x0037:
                r3 = 0
            L_0x0038:
                if (r3 == 0) goto L_0x004a
                j0.c r4 = p126j0.C8266c.f11641a
                x.b r5 = r0.f15392k
                j0.c$a r6 = p126j0.C8266c.C8267a.f11651g
                x.b$b$b r9 = p270x.C10156b.C10174b.C10176b.f15395g
                r7 = 0
                r8 = 0
                r10 = 6
                r11 = 0
                p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            L_0x004a:
                java.lang.String r1 = p126j0.C8303k.m16497a(r1)
                bo.app.j$a r12 = p042bo.app.C3240j.f1842h
                java.lang.String r14 = r0.f15389h
                kotlin.jvm.internal.C12775o.m28636f(r14)
                java.math.BigDecimal r15 = r0.f15390i
                kotlin.jvm.internal.C12775o.m28636f(r15)
                int r2 = r0.f15391j
                f0.a r3 = r0.f15393l
                r13 = r1
                r16 = r2
                r17 = r3
                bo.app.x1 r2 = r12.mo29071a(r13, r14, r15, r16, r17)
                if (r2 != 0) goto L_0x006a
                return
            L_0x006a:
                x.b r3 = r0.f15392k
                bo.app.c3 r3 = r3.mo44773R()
                bo.app.b2 r3 = r3.mo28715m()
                boolean r3 = r3.mo28641a((p042bo.app.C3785x1) r2)
                if (r3 == 0) goto L_0x008e
                x.b r3 = r0.f15392k
                bo.app.c3 r3 = r3.mo44773R()
                bo.app.k6 r3 = r3.mo28714l()
                bo.app.f4 r4 = new bo.app.f4
                f0.a r5 = r0.f15393l
                r4.<init>(r1, r5, r2)
                r3.mo29206a((p042bo.app.C3766w2) r4)
            L_0x008e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p270x.C10156b.C10174b.mo44836a():void");
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44836a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$b0 */
    static final class C10177b0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10177b0 f15396g = new C10177b0();

        C10177b0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to initialize geofences with the geofence manager.";
        }
    }

    /* renamed from: x.b$b1 */
    static final class C10178b1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10178b1 f15397g = new C10178b1();

        C10178b1() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to refresh feature flags.";
        }
    }

    /* renamed from: x.b$c */
    static final class C10179c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10179c f15398g = new C10179c();

        C10179c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to retrieve and publish feed from offline cache.";
        }
    }

    /* renamed from: x.b$c0 */
    static final class C10180c0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10180c0 f15399g = new C10180c0();

        C10180c0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Applying any pending runtime configuration values";
        }
    }

    /* renamed from: x.b$c1 */
    static final class C10181c1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C2813h f15400g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10181c1(C2813h hVar) {
            super(0);
            this.f15400g = hVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Error retrying In-App Message from event ", this.f15400g);
        }
    }

    /* renamed from: x.b$d */
    static final class C10182d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10182d f15401g = new C10182d();

        C10182d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to add subscriber for Content Cards updates.";
        }
    }

    /* renamed from: x.b$d0 */
    static final class C10183d0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10183d0 f15402g = new C10183d0();

        C10183d0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to open session.";
        }
    }

    /* renamed from: x.b$d1 */
    static final class C10184d1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10184d1 f15403g = new C10184d1();

        C10184d1() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to close session.";
        }
    }

    /* renamed from: x.b$e */
    static final class C10185e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10185e f15404g = new C10185e();

        C10185e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze SDK Initializing";
        }
    }

    /* renamed from: x.b$e0 */
    static final class C10186e0 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ C10156b f15405g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10186e0(C10156b bVar) {
            super(0);
            this.f15405g = bVar;
        }

        /* renamed from: a */
        public final void mo44848a() {
            this.f15405g.mo44773R().mo28711i().mo29259b();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44848a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$e1 */
    static final class C10187e1 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ Activity f15406g;

        /* renamed from: h */
        final /* synthetic */ C10156b f15407h;

        /* renamed from: x.b$e1$a */
        static final class C10188a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10188a f15408g = new C10188a();

            C10188a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Cannot close session with null activity.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10187e1(Activity activity, C10156b bVar) {
            super(0);
            this.f15406g = activity;
            this.f15407h = bVar;
        }

        /* renamed from: a */
        public final void mo44849a() {
            if (this.f15406g == null) {
                C8266c.m16396e(C8266c.f11641a, this.f15407h, C8266c.C8267a.f11651g, (Throwable) null, false, C10188a.f15408g, 6, (Object) null);
            } else {
                this.f15407h.mo44773R().mo28715m().closeSession(this.f15406g);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44849a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$f */
    static final class C10189f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10189f f15409g = new C10189f();

        C10189f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log push notification action clicked.";
        }
    }

    /* renamed from: x.b$f0 */
    static final class C10190f0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15410g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10190f0(String str) {
            super(0);
            this.f15410g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "The Braze SDK requires the permission " + this.f15410g + ". Check your AndroidManifest.";
        }
    }

    /* renamed from: x.b$f1 */
    static final class C10191f1 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15411g;

        /* renamed from: h */
        final /* synthetic */ C10156b f15412h;

        /* renamed from: i */
        final /* synthetic */ C7554a f15413i;

        /* renamed from: x.b$f1$a */
        static final class C10192a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ Ref$ObjectRef<String> f15414g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10192a(Ref$ObjectRef<String> ref$ObjectRef) {
                super(0);
                this.f15414g = ref$ObjectRef;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Logged custom event with name " + this.f15414g.f20403b + " was invalid. Not logging custom event to Braze.";
            }
        }

        /* renamed from: x.b$f1$b */
        static final class C10193b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ Ref$ObjectRef<String> f15415g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10193b(Ref$ObjectRef<String> ref$ObjectRef) {
                super(0);
                this.f15415g = ref$ObjectRef;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Custom event with name " + this.f15415g.f20403b + " logged with invalid properties. Not logging custom event to Braze.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10191f1(String str, C10156b bVar, C7554a aVar) {
            super(0);
            this.f15411g = str;
            this.f15412h = bVar;
            this.f15413i = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
            if (r1.mo41304y() == true) goto L_0x003a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo44853a() {
            /*
                r11 = this;
                kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
                r0.<init>()
                java.lang.String r1 = r11.f15411g
                r0.f20403b = r1
                x.b r2 = r11.f15412h
                bo.app.c3 r2 = r2.mo44773R()
                bo.app.e5 r2 = r2.mo28707e()
                boolean r1 = p126j0.C8303k.m16500e(r1, r2)
                if (r1 != 0) goto L_0x002c
                j0.c r2 = p126j0.C8266c.f11641a
                x.b r3 = r11.f15412h
                j0.c$a r4 = p126j0.C8266c.C8267a.f11651g
                x.b$f1$a r7 = new x.b$f1$a
                r7.<init>(r0)
                r5 = 0
                r6 = 0
                r8 = 6
                r9 = 0
                p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
                return
            L_0x002c:
                f0.a r1 = r11.f15413i
                if (r1 != 0) goto L_0x0031
                goto L_0x0039
            L_0x0031:
                boolean r1 = r1.mo41304y()
                r2 = 1
                if (r1 != r2) goto L_0x0039
                goto L_0x003a
            L_0x0039:
                r2 = 0
            L_0x003a:
                if (r2 == 0) goto L_0x004f
                j0.c r3 = p126j0.C8266c.f11641a
                x.b r4 = r11.f15412h
                j0.c$a r5 = p126j0.C8266c.C8267a.f11651g
                x.b$f1$b r8 = new x.b$f1$b
                r8.<init>(r0)
                r6 = 0
                r7 = 0
                r9 = 6
                r10 = 0
                p126j0.C8266c.m16396e(r3, r4, r5, r6, r7, r8, r9, r10)
                return
            L_0x004f:
                T r1 = r0.f20403b
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = p126j0.C8303k.m16497a(r1)
                r0.f20403b = r1
                bo.app.j$a r2 = p042bo.app.C3240j.f1842h
                f0.a r3 = r11.f15413i
                bo.app.x1 r1 = r2.mo29069a((java.lang.String) r1, (p081f0.C7554a) r3)
                if (r1 != 0) goto L_0x0064
                return
            L_0x0064:
                x.b r2 = r11.f15412h
                T r3 = r0.f20403b
                java.lang.String r3 = (java.lang.String) r3
                boolean r2 = r2.m21419U(r3)
                if (r2 == 0) goto L_0x007f
                x.b r2 = r11.f15412h
                bo.app.c3 r2 = r2.mo44773R()
                bo.app.e5 r2 = r2.mo28707e()
                boolean r2 = r2.mo28873n()
                goto L_0x008d
            L_0x007f:
                x.b r2 = r11.f15412h
                bo.app.c3 r2 = r2.mo44773R()
                bo.app.b2 r2 = r2.mo28715m()
                boolean r2 = r2.mo28641a((p042bo.app.C3785x1) r1)
            L_0x008d:
                if (r2 == 0) goto L_0x00a7
                x.b r2 = r11.f15412h
                bo.app.c3 r2 = r2.mo44773R()
                bo.app.k6 r2 = r2.mo28714l()
                bo.app.e0 r3 = new bo.app.e0
                T r0 = r0.f20403b
                java.lang.String r0 = (java.lang.String) r0
                f0.a r4 = r11.f15413i
                r3.<init>(r0, r4, r1)
                r2.mo29206a((p042bo.app.C3766w2) r3)
            L_0x00a7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p270x.C10156b.C10191f1.mo44853a():void");
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44853a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$g */
    static final class C10194g extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ C10156b f15416g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10194g(C10156b bVar) {
            super(0);
            this.f15416g = bVar;
        }

        /* renamed from: a */
        public final void mo44856a() {
            this.f15416g.mo44771O().mo29152a(this.f15416g.mo44773R().mo28709g().getCachedCardsAsEvent(), FeedUpdatedEvent.class);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44856a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$g0 */
    static final class C10195g0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10195g0 f15417g = new C10195g0();

        C10195g0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Clearing config values";
        }
    }

    /* renamed from: x.b$g1 */
    static final class C10196g1 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ C10156b f15418g;

        /* renamed from: x.b$g1$a */
        static final class C10197a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10197a f15419g = new C10197a();

            C10197a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Feature flags not enabled. Not refreshing feature flags.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10196g1(C10156b bVar) {
            super(0);
            this.f15418g = bVar;
        }

        /* renamed from: a */
        public final void mo44858a() {
            if (this.f15418g.mo44773R().mo28707e().mo28874o()) {
                this.f15418g.mo44773R().mo28718p().mo28847d();
            } else {
                C8266c.m16396e(C8266c.f11641a, this.f15418g, C8266c.C8267a.I, (Throwable) null, false, C10197a.f15419g, 6, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44858a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$h */
    static final class C10198h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15420g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10198h(String str) {
            super(0);
            this.f15420g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Device build model matches a known crawler. Enabling mock network request mode. Device it: ", this.f15420g);
        }
    }

    /* renamed from: x.b$h0 */
    static final class C10199h0 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ Activity f15421g;

        /* renamed from: h */
        final /* synthetic */ C10156b f15422h;

        /* renamed from: x.b$h0$a */
        static final class C10200a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10200a f15423g = new C10200a();

            C10200a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Cannot open session with null activity.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10199h0(Activity activity, C10156b bVar) {
            super(0);
            this.f15421g = activity;
            this.f15422h = bVar;
        }

        /* renamed from: a */
        public final void mo44861a() {
            if (this.f15421g == null) {
                C8266c.m16396e(C8266c.f11641a, this.f15422h, C8266c.C8267a.I, (Throwable) null, false, C10200a.f15423g, 6, (Object) null);
            } else {
                this.f15422h.mo44773R().mo28715m().openSession(this.f15421g);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44861a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$h1 */
    static final class C10201h1 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ C10156b f15424g;

        /* renamed from: h */
        final /* synthetic */ C2813h f15425h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10201h1(C10156b bVar, C2813h hVar) {
            super(0);
            this.f15424g = bVar;
            this.f15425h = hVar;
        }

        /* renamed from: a */
        public final void mo44863a() {
            this.f15424g.mo44773R().mo28714l().mo29207a(this.f15425h.mo28296c(), this.f15425h.mo28295b());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44863a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$i */
    static final class C10202i extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15426g;

        /* renamed from: h */
        final /* synthetic */ C10156b f15427h;

        /* renamed from: i */
        final /* synthetic */ String f15428i;

        /* renamed from: j */
        final /* synthetic */ String f15429j;

        /* renamed from: x.b$i$a */
        static final class C10203a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10203a f15430g = new C10203a();

            C10203a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification action clicked.";
            }
        }

        /* renamed from: x.b$i$b */
        static final class C10204b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10204b f15431g = new C10204b();

            C10204b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Action ID cannot be null or blank.";
            }
        }

        /* renamed from: x.b$i$c */
        static final class C10205c extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10205c f15432g = new C10205c();

            C10205c() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Action Type cannot be null or blank.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10202i(String str, C10156b bVar, String str2, String str3) {
            super(0);
            this.f15426g = str;
            this.f15427h = bVar;
            this.f15428i = str2;
            this.f15429j = str3;
        }

        /* renamed from: a */
        public final void mo44864a() {
            boolean z;
            boolean z2;
            String str = this.f15426g;
            boolean z3 = false;
            if (str == null || C13754v.m31532t(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C8266c.m16396e(C8266c.f11641a, this.f15427h, C8266c.C8267a.f11651g, (Throwable) null, false, C10203a.f15430g, 6, (Object) null);
                return;
            }
            String str2 = this.f15428i;
            if (str2 == null || C13754v.m31532t(str2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C8266c.m16396e(C8266c.f11641a, this.f15427h, C8266c.C8267a.f11651g, (Throwable) null, false, C10204b.f15431g, 6, (Object) null);
                return;
            }
            String str3 = this.f15429j;
            if (str3 == null || C13754v.m31532t(str3)) {
                z3 = true;
            }
            if (z3) {
                C8266c.m16396e(C8266c.f11641a, this.f15427h, C8266c.C8267a.f11651g, (Throwable) null, false, C10205c.f15432g, 6, (Object) null);
            } else {
                this.f15427h.mo44773R().mo28715m().mo28641a(C3206h4.f1802k.mo29002a(this.f15426g, this.f15428i, this.f15429j));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44864a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$i0 */
    static final class C10206i0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10206i0 f15433g = new C10206i0();

        C10206i0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to request data flush.";
        }
    }

    @C12739f(mo50609c = "com.braze.Braze$run$1", mo50610f = "Braze.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: x.b$i1 */
    static final class C10207i1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f15434h;

        /* renamed from: i */
        final /* synthetic */ C13074a<C11921v> f15435i;

        @C12739f(mo50609c = "com.braze.Braze$run$1$1", mo50610f = "Braze.kt", mo50611l = {}, mo50612m = "invokeSuspend")
        /* renamed from: x.b$i1$a */
        static final class C10208a extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

            /* renamed from: h */
            int f15436h;

            /* renamed from: i */
            final /* synthetic */ C13074a<C11921v> f15437i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10208a(C13074a<C11921v> aVar, C12074d<? super C10208a> dVar) {
                super(2, dVar);
                this.f15437i = aVar;
            }

            /* renamed from: a */
            public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
                return ((C10208a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
            }

            public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                return new C10208a(this.f15437i, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C12150d.m26492c();
                if (this.f15436h == 0) {
                    C11910n.m25701b(obj);
                    this.f15437i.invoke();
                    return C11921v.f18618a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10207i1(C13074a<C11921v> aVar, C12074d<? super C10207i1> dVar) {
            super(2, dVar);
            this.f15435i = aVar;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C10207i1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C10207i1(this.f15435i, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f15434h == 0) {
                C11910n.m25701b(obj);
                Object unused2 = C13976i.m32394b((C12079g) null, new C10208a(this.f15435i, (C12074d<? super C10208a>) null), 1, (Object) null);
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: x.b$j */
    static final class C10209j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10209j f15438g = new C10209j();

        C10209j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to request geofence refresh.";
        }
    }

    /* renamed from: x.b$j0 */
    static final class C10210j0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10210j0 f15439g = new C10210j0();

        C10210j0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The Braze SDK requires a non-empty API key. Check your braze.xml or BrazeConfig.";
        }
    }

    /* renamed from: x.b$j1 */
    static final class C10211j1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10211j1 f15440g = new C10211j1();

        C10211j1() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Got error in singleton run without result";
        }
    }

    /* renamed from: x.b$k */
    static final class C10212k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10212k f15441g = new C10212k();

        C10212k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to add subscriber for feed updates.";
        }
    }

    /* renamed from: x.b$k0 */
    static final class C10213k0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C4216a f15442g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10213k0(C4216a aVar) {
            super(0);
            this.f15442g = aVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Setting pending config object: ", this.f15442g);
        }
    }

    /* renamed from: x.b$k1 */
    static final class C10214k1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15443g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10214k1(String str) {
            super(0);
            this.f15443g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to set the push token ", this.f15443g);
        }
    }

    /* renamed from: x.b$l */
    static final class C10215l extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10215l f15444g = new C10215l();

        C10215l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to perform initial Braze singleton setup.";
        }
    }

    /* renamed from: x.b$l0 */
    static final class C10216l0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10216l0 f15445g = new C10216l0();

        C10216l0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error handling test in-app message push";
        }
    }

    /* renamed from: x.b$l1 */
    static final class C10217l1 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ C10156b f15446g;

        /* renamed from: h */
        final /* synthetic */ String f15447h;

        /* renamed from: x.b$l1$a */
        static final class C10218a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f15448g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10218a(String str) {
                super(0);
                this.f15448g = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Push token " + this.f15448g + " registered and immediately being flushed.";
            }
        }

        /* renamed from: x.b$l1$b */
        static final class C10219b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10219b f15449g = new C10219b();

            C10219b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Push token must not be null or blank. Not registering for push with Braze.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10217l1(C10156b bVar, String str) {
            super(0);
            this.f15446g = bVar;
            this.f15447h = str;
        }

        /* renamed from: a */
        public final void mo44879a() {
            boolean z;
            C8266c cVar = C8266c.f11641a;
            C8266c.m16396e(cVar, this.f15446g, C8266c.C8267a.I, (Throwable) null, false, new C10218a(this.f15447h), 6, (Object) null);
            String str = this.f15447h;
            if (str == null || C13754v.m31532t(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C8266c.m16396e(cVar, this.f15446g, C8266c.C8267a.f11651g, (Throwable) null, false, C10219b.f15449g, 6, (Object) null);
                return;
            }
            C3429m2 n = this.f15446g.f15367j;
            if (n == null) {
                C12775o.m28656z("registrationDataProvider");
                n = null;
            }
            n.mo29313a(this.f15447h);
            this.f15446g.mo44773R().mo28705c().mo29174e();
            this.f15446g.mo44795l0();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44879a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$m */
    static final class C10220m extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ C10156b f15450g;

        /* renamed from: h */
        final /* synthetic */ Context f15451h;

        /* renamed from: x.b$m$a */
        static final class C10221a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10221a f15452g = new C10221a();

            C10221a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to startup user dependency manager.";
            }
        }

        /* renamed from: x.b$m$b */
        static final class C10222b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10222b f15453g = new C10222b();

            C10222b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.";
            }
        }

        /* renamed from: x.b$m$c */
        static final class C10223c extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10223c f15454g = new C10223c();

            C10223c() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.";
            }
        }

        /* renamed from: x.b$m$d */
        static final class C10224d extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10224d f15455g = new C10224d();

            C10224d() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.";
            }
        }

        /* renamed from: x.b$m$e */
        static final class C10225e extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10225e f15456g = new C10225e();

            C10225e() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Amazon Device Messaging found. Setting up Amazon Device Messaging";
            }
        }

        /* renamed from: x.b$m$f */
        static final class C10226f extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10226f f15457g = new C10226f();

            C10226f() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "ADM manifest requirements not met. Braze will not register for ADM.";
            }
        }

        /* renamed from: x.b$m$g */
        static final class C10227g extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10227g f15458g = new C10227g();

            C10227g() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.";
            }
        }

        /* renamed from: x.b$m$h */
        static final class C10228h extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10228h f15459g = new C10228h();

            C10228h() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to setup pre SDK tasks";
            }
        }

        /* renamed from: x.b$m$i */
        static final class C10229i extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10229i f15460g = new C10229i();

            C10229i() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Starting up a new user dependency manager";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10220m(C10156b bVar, Context context) {
            super(0);
            this.f15450g = bVar;
            this.f15451h = context;
        }

        /* renamed from: a */
        public final void mo44882a() {
            boolean z;
            C3748v3 v3Var;
            C3429m2 m2Var;
            C3030b6 b6Var;
            this.f15450g.mo44765I();
            this.f15450g.mo44801s0(new C4218b(this.f15450g.f15359b));
            C10156b bVar = this.f15450g;
            C10157a aVar = C10156b.f15345m;
            String e = aVar.mo44809e(bVar.mo44768L());
            boolean z2 = false;
            if (e == null || C13754v.m31532t(e)) {
                z = true;
            } else {
                z = false;
            }
            bVar.mo44800r0(Boolean.valueOf(!z));
            C8266c.m16409s(this.f15450g.mo44768L().getLoggerInitialLogLevel());
            C8266c.m16400i(false, 1, (Object) null);
            this.f15450g.f15360c = new C3030b6();
            C3030b6 q = this.f15450g.f15360c;
            if (q == null) {
                C12775o.m28656z("testUserDeviceLoggingManager");
                q = null;
            }
            C8266c.m16411u(q);
            if (aVar.m21493i(this.f15451h).mo29850a()) {
                aVar.mo44818p(true);
            }
            this.f15450g.mo44802t0(new C3423m0(this.f15450g.f15359b));
            this.f15450g.f15361d = new C3748v3(this.f15450g.f15359b);
            this.f15450g.f15367j = new C3395l4(this.f15450g.f15359b, this.f15450g.mo44768L());
            String customEndpoint = this.f15450g.mo44768L().getCustomEndpoint();
            if (customEndpoint == null || C13754v.m31532t(customEndpoint)) {
                z2 = true;
            }
            if (!z2) {
                aVar.mo44816m(this.f15450g.mo44768L().getCustomEndpoint());
            }
            try {
                if (this.f15450g.mo44768L().isFirebaseCloudMessagingRegistrationEnabled()) {
                    Context context = this.f15451h;
                    C3429m2 n = this.f15450g.f15367j;
                    if (n == null) {
                        C12775o.m28656z("registrationDataProvider");
                        n = null;
                    }
                    C3303k1 k1Var = new C3303k1(context, n);
                    if (k1Var.mo29183a()) {
                        C8266c.m16396e(C8266c.f11641a, this.f15450g, C8266c.C8267a.I, (Throwable) null, false, C10222b.f15453g, 6, (Object) null);
                        String firebaseCloudMessagingSenderIdKey = this.f15450g.mo44768L().getFirebaseCloudMessagingSenderIdKey();
                        if (firebaseCloudMessagingSenderIdKey != null) {
                            k1Var.mo29182a(firebaseCloudMessagingSenderIdKey);
                        }
                    } else {
                        C8266c.m16396e(C8266c.f11641a, this.f15450g, C8266c.C8267a.f11651g, (Throwable) null, false, C10223c.f15454g, 6, (Object) null);
                    }
                } else {
                    C8266c.m16396e(C8266c.f11641a, this.f15450g, C8266c.C8267a.I, (Throwable) null, false, C10224d.f15455g, 6, (Object) null);
                }
                if (!this.f15450g.mo44768L().isAdmMessagingRegistrationEnabled()) {
                    C8266c.m16396e(C8266c.f11641a, this.f15450g, C8266c.C8267a.I, (Throwable) null, false, C10227g.f15458g, 6, (Object) null);
                } else if (C3006b.f1452c.mo28612a(this.f15450g.f15359b)) {
                    C8266c.m16396e(C8266c.f11641a, this.f15450g, C8266c.C8267a.I, (Throwable) null, false, C10225e.f15456g, 6, (Object) null);
                    Context e2 = this.f15450g.f15359b;
                    C3429m2 n2 = this.f15450g.f15367j;
                    if (n2 == null) {
                        C12775o.m28656z("registrationDataProvider");
                        n2 = null;
                    }
                    new C3006b(e2, n2).mo28611a();
                } else {
                    C8266c.m16396e(C8266c.f11641a, this.f15450g, C8266c.C8267a.f11651g, (Throwable) null, false, C10226f.f15457g, 6, (Object) null);
                }
                this.f15450g.m21413B0();
            } catch (Exception e3) {
                C8266c.m16396e(C8266c.f11641a, this.f15450g, C8266c.C8267a.f11649e, e3, false, C10228h.f15459g, 4, (Object) null);
            }
            C8266c.m16396e(C8266c.f11641a, this.f15450g, C8266c.C8267a.f11650f, (Throwable) null, false, C10229i.f15460g, 6, (Object) null);
            try {
                C10156b bVar2 = this.f15450g;
                Context e4 = bVar2.f15359b;
                C3748v3 m = this.f15450g.f15361d;
                if (m == null) {
                    C12775o.m28656z("offlineUserStorageProvider");
                    v3Var = null;
                } else {
                    v3Var = m;
                }
                C4218b L = this.f15450g.mo44768L();
                C3285j2 O = this.f15450g.mo44771O();
                C3162g2 N = this.f15450g.mo44770N();
                C3429m2 n3 = this.f15450g.f15367j;
                if (n3 == null) {
                    C12775o.m28656z("registrationDataProvider");
                    m2Var = null;
                } else {
                    m2Var = n3;
                }
                boolean p = C10156b.f15352t;
                boolean f = C10156b.f15353u;
                C3030b6 q2 = this.f15450g.f15360c;
                if (q2 == null) {
                    C12775o.m28656z("testUserDeviceLoggingManager");
                    b6Var = null;
                } else {
                    b6Var = q2;
                }
                bVar2.m21444y0(new C3732u6(e4, v3Var, L, O, N, m2Var, p, f, b6Var));
            } catch (Exception e5) {
                C8266c.m16396e(C8266c.f11641a, this.f15450g, C8266c.C8267a.f11649e, e5, false, C10221a.f15452g, 4, (Object) null);
                this.f15450g.m21421e0(e5);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44882a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$m0 */
    static final class C10230m0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10230m0 f15461g = new C10230m0();

        C10230m0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "User dependency manager is uninitialized. Not publishing error.";
        }
    }

    /* renamed from: x.b$m1 */
    static final class C10231m1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10231m1 f15462g = new C10231m1();

        C10231m1() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log that the feed was displayed.";
        }
    }

    /* renamed from: x.b$n */
    static final class C10232n extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ C2993a2 f15463g;

        /* renamed from: h */
        final /* synthetic */ C10156b f15464h;

        /* renamed from: x.b$n$a */
        static final class C10233a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10233a f15465g = new C10233a();

            C10233a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Cannot request Geofence refresh with null location.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10232n(C2993a2 a2Var, C10156b bVar) {
            super(0);
            this.f15463g = a2Var;
            this.f15464h = bVar;
        }

        /* renamed from: a */
        public final void mo44894a() {
            if (this.f15463g == null) {
                C8266c.m16396e(C8266c.f11641a, this.f15464h, (C8266c.C8267a) null, (Throwable) null, false, C10233a.f15465g, 7, (Object) null);
            } else {
                this.f15464h.mo44773R().mo28711i().mo29252a(this.f15463g);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44894a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$n0 */
    static final class C10234n0 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ C10156b f15466g;

        /* renamed from: x.b$n0$a */
        static final class C10235a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10235a f15467g = new C10235a();

            C10235a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Requesting immediate data flush to Braze.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10234n0(C10156b bVar) {
            super(0);
            this.f15466g = bVar;
        }

        /* renamed from: a */
        public final void mo44896a() {
            C8266c.m16396e(C8266c.f11641a, this.f15466g, C8266c.C8267a.I, (Throwable) null, false, C10235a.f15467g, 6, (Object) null);
            this.f15466g.mo44773R().mo28715m().mo28642b();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44896a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$n1 */
    static final class C10236n1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Class<T> f15468g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10236n1(Class<T> cls) {
            super(0);
            this.f15468g = cls;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to remove " + this.f15468g.getName() + " subscriber.";
        }
    }

    /* renamed from: x.b$o */
    static final class C10237o extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ boolean f15469g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10237o(boolean z) {
            super(0);
            this.f15469g = z;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to request geofence refresh with rate limit ignore: ", Boolean.valueOf(this.f15469g));
        }
    }

    /* renamed from: x.b$o0 */
    static final class C10238o0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10238o0 f15470g = new C10238o0();

        C10238o0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/docs/developer_guide/platform_integration_guides/android/initial_sdk_setup/android_sdk_integration/";
        }
    }

    /* renamed from: x.b$o1 */
    static final class C10239o1 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ C10156b f15471g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10239o1(C10156b bVar) {
            super(0);
            this.f15471g = bVar;
        }

        /* renamed from: a */
        public final void mo44901a() {
            C3785x1 a = C3240j.f1842h.mo29059a();
            if (a != null) {
                this.f15471g.mo44773R().mo28715m().mo28641a(a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44901a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$p */
    static final class C10240p extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10240p f15472g = new C10240p();

        C10240p() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to add subscriber to new in-app messages.";
        }
    }

    /* renamed from: x.b$p0 */
    static final class C10241p0 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ Intent f15473g;

        /* renamed from: h */
        final /* synthetic */ C10156b f15474h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10241p0(Intent intent, C10156b bVar) {
            super(0);
            this.f15473g = intent;
            this.f15474h = bVar;
        }

        /* renamed from: a */
        public final void mo44903a() {
            C10156b.f15345m.mo44815l(this.f15473g, this.f15474h.mo44773R().mo28715m());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44903a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$p1 */
    static final class C10242p1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ boolean f15475g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10242p1(boolean z) {
            super(0);
            this.f15475g = z;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to request Content Cards refresh. Requesting from cache: ", Boolean.valueOf(this.f15475g));
        }
    }

    /* renamed from: x.b$q */
    static final class C10243q extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ long f15476g;

        /* renamed from: h */
        final /* synthetic */ long f15477h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10243q(long j, long j2) {
            super(0);
            this.f15476g = j;
            this.f15477h = j2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze SDK loaded in " + TimeUnit.MILLISECONDS.convert(this.f15476g - this.f15477h, TimeUnit.NANOSECONDS) + " ms.";
        }
    }

    /* renamed from: x.b$q0 */
    static final class C10244q0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Throwable f15478g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10244q0(Throwable th) {
            super(0);
            this.f15478g = th;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to log throwable: ", this.f15478g);
        }
    }

    /* renamed from: x.b$q1 */
    static final class C10245q1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10245q1 f15479g = new C10245q1();

        C10245q1() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log location recorded event.";
        }
    }

    /* renamed from: x.b$r */
    static final class C10246r extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Intent f15480g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10246r(Intent intent) {
            super(0);
            this.f15480g = intent;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Error logging push notification with intent: ", this.f15480g);
        }
    }

    /* renamed from: x.b$r0 */
    static final class C10247r0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10247r0 f15481g = new C10247r0();

        C10247r0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Location permissions were granted. Requesting geofence and location initialization.";
        }
    }

    /* renamed from: x.b$r1 */
    static final class C10248r1 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ boolean f15482g;

        /* renamed from: h */
        final /* synthetic */ C10156b f15483h;

        /* renamed from: x.b$r1$a */
        static final class C10249a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10249a f15484g = new C10249a();

            C10249a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Content Cards is not enabled, skipping API call to refresh";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10248r1(boolean z, C10156b bVar) {
            super(0);
            this.f15482g = z;
            this.f15483h = bVar;
        }

        /* renamed from: a */
        public final void mo44910a() {
            if (this.f15482g) {
                this.f15483h.mo44771O().mo29152a(this.f15483h.mo44773R().mo28712j().getCachedCardsAsEvent(), C2807d.class);
            } else if (this.f15483h.mo44773R().mo28707e().mo28872m()) {
                C3023b2.m2597a(this.f15483h.mo44773R().mo28715m(), this.f15483h.mo44773R().mo28712j().mo28537e(), this.f15483h.mo44773R().mo28712j().mo28539f(), 0, 4, (Object) null);
            } else {
                C8266c.m16396e(C8266c.f11641a, this.f15483h, (C8266c.C8267a) null, (Throwable) null, false, C10249a.f15484g, 7, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44910a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$s */
    static final class C10250s extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ C10156b f15485g;

        /* renamed from: h */
        final /* synthetic */ boolean f15486h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10250s(C10156b bVar, boolean z) {
            super(0);
            this.f15485g = bVar;
            this.f15486h = z;
        }

        /* renamed from: a */
        public final void mo44912a() {
            this.f15485g.mo44773R().mo28711i().mo29262b(this.f15486h);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44912a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$s0 */
    static final class C10251s0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10251s0 f15487g = new C10251s0();

        C10251s0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Ephemeral events enabled";
        }
    }

    /* renamed from: x.b$s1 */
    static final class C10252s1 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ C2993a2 f15488g;

        /* renamed from: h */
        final /* synthetic */ C10156b f15489h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10252s1(C2993a2 a2Var, C10156b bVar) {
            super(0);
            this.f15488g = a2Var;
            this.f15489h = bVar;
        }

        /* renamed from: a */
        public final void mo44914a() {
            C3785x1 a = C3240j.f1842h.mo29061a(this.f15488g);
            if (a != null) {
                this.f15489h.mo44773R().mo28715m().mo28641a(a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44914a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$t */
    static final class C10253t extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15490g;

        /* renamed from: h */
        final /* synthetic */ String f15491h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10253t(String str, String str2) {
            super(0);
            this.f15490g = str;
            this.f15491h = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to update ContentCard storage provider with single card update. User id: " + this.f15490g + " Serialized json: " + this.f15491h;
        }
    }

    /* renamed from: x.b$t0 */
    static final class C10254t0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10254t0 f15492g = new C10254t0();

        C10254t0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to post geofence report.";
        }
    }

    /* renamed from: x.b$t1 */
    static final class C10255t1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10255t1 f15493g = new C10255t1();

        C10255t1() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to request refresh of feed.";
        }
    }

    /* renamed from: x.b$u */
    static final class C10256u extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15494g;

        /* renamed from: h */
        final /* synthetic */ C10156b f15495h;

        /* renamed from: i */
        final /* synthetic */ String f15496i;

        /* renamed from: x.b$u$a */
        static final class C10257a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f15497g;

            /* renamed from: h */
            final /* synthetic */ String f15498h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10257a(String str, String str2) {
                super(0);
                this.f15497g = str;
                this.f15498h = str2;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Cannot add null or blank card json to storage. Returning. User id: " + this.f15497g + " Serialized json: " + this.f15498h;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10256u(String str, C10156b bVar, String str2) {
            super(0);
            this.f15494g = str;
            this.f15495h = bVar;
            this.f15496i = str2;
        }

        /* renamed from: a */
        public final void mo44918a() {
            if (C13754v.m31532t(this.f15494g)) {
                C8266c.m16396e(C8266c.f11641a, this.f15495h, C8266c.C8267a.f11651g, (Throwable) null, false, new C10257a(this.f15496i, this.f15494g), 6, (Object) null);
                return;
            }
            this.f15495h.mo44773R().mo28712j().mo28520a(new C3820z(this.f15494g), this.f15496i);
            this.f15495h.mo44771O().mo29152a(this.f15495h.mo44773R().mo28712j().getCachedCardsAsEvent(), C2807d.class);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44918a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$u0 */
    static final class C10258u0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10258u0 f15499g = new C10258u0();

        C10258u0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to request single location update";
        }
    }

    /* renamed from: x.b$u1 */
    static final class C10259u1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ boolean f15500g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10259u1(boolean z) {
            super(0);
            this.f15500g = z;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to set sync policy offline to ", Boolean.valueOf(this.f15500g));
        }
    }

    /* renamed from: x.b$v */
    static final class C10260v extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ Intent f15501g;

        /* renamed from: h */
        final /* synthetic */ C10156b f15502h;

        /* renamed from: x.b$v$a */
        static final class C10261a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10261a f15503g = new C10261a();

            C10261a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Cannot logPushNotificationOpened with null intent. Not logging push click.";
            }
        }

        /* renamed from: x.b$v$b */
        static final class C10262b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f15504g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10262b(String str) {
                super(0);
                this.f15504g = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Logging push click. Campaign Id: ", this.f15504g);
            }
        }

        /* renamed from: x.b$v$c */
        static final class C10263c extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10263c f15505g = new C10263c();

            C10263c() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "No campaign Id associated with this notification (this is expected for test sends). Not logging push click.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10260v(Intent intent, C10156b bVar) {
            super(0);
            this.f15501g = intent;
            this.f15502h = bVar;
        }

        /* renamed from: a */
        public final void mo44922a() {
            boolean z;
            Intent intent = this.f15501g;
            if (intent == null) {
                C8266c.m16396e(C8266c.f11641a, this.f15502h, C8266c.C8267a.I, (Throwable) null, false, C10261a.f15503g, 6, (Object) null);
                return;
            }
            String stringExtra = intent.getStringExtra(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY);
            if (stringExtra == null || C13754v.m31532t(stringExtra)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C8266c.m16396e(C8266c.f11641a, this.f15502h, C8266c.C8267a.I, (Throwable) null, false, new C10262b(stringExtra), 6, (Object) null);
                this.f15502h.mo44773R().mo28715m().mo28641a((C3785x1) C3317k4.f1982j.mo29199a(stringExtra));
            } else {
                C8266c.m16396e(C8266c.f11641a, this.f15502h, C8266c.C8267a.I, (Throwable) null, false, C10263c.f15505g, 6, (Object) null);
            }
            C10156b.f15345m.mo44815l(this.f15501g, this.f15502h.mo44773R().mo28715m());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44922a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$v0 */
    static final class C10264v0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15506g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10264v0(String str) {
            super(0);
            this.f15506g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to set external id to: ", this.f15506g);
        }
    }

    /* renamed from: x.b$v1 */
    static final class C10265v1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15507g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10265v1(String str) {
            super(0);
            this.f15507g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to log purchase event of: ", this.f15507g);
        }
    }

    @C12739f(mo50609c = "com.braze.Braze$getCurrentUser$1", mo50610f = "Braze.kt", mo50611l = {767}, mo50612m = "invokeSuspend")
    /* renamed from: x.b$w */
    static final class C10266w extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f15508h;

        /* renamed from: i */
        final /* synthetic */ C2812g<C10300f> f15509i;

        /* renamed from: j */
        final /* synthetic */ C10156b f15510j;

        @C12739f(mo50609c = "com.braze.Braze$getCurrentUser$1$1", mo50610f = "Braze.kt", mo50611l = {}, mo50612m = "invokeSuspend")
        /* renamed from: x.b$w$a */
        static final class C10267a extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

            /* renamed from: h */
            int f15511h;

            /* renamed from: i */
            final /* synthetic */ C2812g<C10300f> f15512i;

            /* renamed from: j */
            final /* synthetic */ C10156b f15513j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10267a(C2812g<C10300f> gVar, C10156b bVar, C12074d<? super C10267a> dVar) {
                super(2, dVar);
                this.f15512i = gVar;
                this.f15513j = bVar;
            }

            /* renamed from: a */
            public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
                return ((C10267a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
            }

            public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                return new C10267a(this.f15512i, this.f15513j, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C12150d.m26492c();
                if (this.f15511h == 0) {
                    C11910n.m25701b(obj);
                    C2812g<C10300f> gVar = this.f15512i;
                    C10300f h = this.f15513j.f15362e;
                    if (h == null) {
                        C12775o.m28656z("brazeUser");
                        h = null;
                    }
                    gVar.mo28292a(h);
                    return C11921v.f18618a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10266w(C2812g<C10300f> gVar, C10156b bVar, C12074d<? super C10266w> dVar) {
            super(2, dVar);
            this.f15509i = gVar;
            this.f15510j = bVar;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C10266w) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C10266w(this.f15509i, this.f15510j, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f15508h;
            if (i == 0) {
                C11910n.m25701b(obj);
                C12079g coroutineContext = C10606a.f16162b.getCoroutineContext();
                C10267a aVar = new C10267a(this.f15509i, this.f15510j, (C12074d<? super C10267a>) null);
                this.f15508h = 1;
                if (C13970h.m32378g(coroutineContext, aVar, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$w0 */
    static final class C10268w0 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15514g;

        /* renamed from: h */
        final /* synthetic */ C10156b f15515h;

        /* renamed from: i */
        final /* synthetic */ String f15516i;

        /* renamed from: x.b$w0$a */
        static final class C10269a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10269a f15517g = new C10269a();

            C10269a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "userId passed to changeUser was null or empty. The current user will remain the active user.";
            }
        }

        /* renamed from: x.b$w0$b */
        static final class C10270b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f15518g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10270b(String str) {
                super(0);
                this.f15518g = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Rejected user id with byte length longer than 997. Not changing user. Input user id: ", this.f15518g);
            }
        }

        /* renamed from: x.b$w0$c */
        static final class C10271c extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f15519g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10271c(String str) {
                super(0);
                this.f15519g = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Received request to change current user " + this.f15519g + " to the same user id. Not changing user.";
            }
        }

        /* renamed from: x.b$w0$d */
        static final class C10272d extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f15520g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10272d(String str) {
                super(0);
                this.f15520g = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Set sdk auth signature on changeUser call: ", this.f15520g);
            }
        }

        /* renamed from: x.b$w0$e */
        static final class C10273e extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f15521g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10273e(String str) {
                super(0);
                this.f15521g = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Changing anonymous user to ", this.f15521g);
            }
        }

        /* renamed from: x.b$w0$f */
        static final class C10274f extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f15522g;

            /* renamed from: h */
            final /* synthetic */ String f15523h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10274f(String str, String str2) {
                super(0);
                this.f15522g = str;
                this.f15523h = str2;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Changing current user " + this.f15522g + " to new user " + this.f15523h + '.';
            }
        }

        /* renamed from: x.b$w0$g */
        static final class C10275g extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f15524g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10275g(String str) {
                super(0);
                this.f15524g = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Set sdk auth signature on changeUser call: ", this.f15524g);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10268w0(String str, C10156b bVar, String str2) {
            super(0);
            this.f15514g = str;
            this.f15515h = bVar;
            this.f15516i = str2;
        }

        /* renamed from: a */
        public final void mo44930a() {
            boolean z;
            C3748v3 v3Var;
            C3429m2 m2Var;
            C3030b6 b6Var;
            String str = this.f15514g;
            boolean z2 = true;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C8266c.m16396e(C8266c.f11641a, this.f15515h, C8266c.C8267a.f11651g, (Throwable) null, false, C10269a.f15517g, 6, (Object) null);
            } else if (C8300j.m16487a(this.f15514g) > 997) {
                C8266c.m16396e(C8266c.f11641a, this.f15515h, C8266c.C8267a.f11651g, (Throwable) null, false, new C10270b(this.f15514g), 6, (Object) null);
            } else {
                C10300f h = this.f15515h.f15362e;
                if (h == null) {
                    C12775o.m28656z("brazeUser");
                    h = null;
                }
                String d = h.mo44965d();
                if (C12775o.m28634d(d, this.f15514g)) {
                    C8266c cVar = C8266c.f11641a;
                    C8266c.m16396e(cVar, this.f15515h, C8266c.C8267a.I, (Throwable) null, false, new C10271c(this.f15514g), 6, (Object) null);
                    String str2 = this.f15516i;
                    if (str2 != null && !C13754v.m31532t(str2)) {
                        z2 = false;
                    }
                    if (!z2) {
                        C8266c.m16396e(cVar, this.f15515h, (C8266c.C8267a) null, (Throwable) null, false, new C10272d(this.f15516i), 7, (Object) null);
                        this.f15515h.mo44773R().mo28717o().mo29829a(this.f15516i);
                        return;
                    }
                    return;
                }
                this.f15515h.mo44773R().mo28713k().mo29839b();
                if (C12775o.m28634d(d, "")) {
                    C8266c.m16396e(C8266c.f11641a, this.f15515h, C8266c.C8267a.I, (Throwable) null, false, new C10273e(this.f15514g), 6, (Object) null);
                    C3748v3 m = this.f15515h.f15361d;
                    if (m == null) {
                        C12775o.m28656z("offlineUserStorageProvider");
                        m = null;
                    }
                    m.mo29746a(this.f15514g);
                    C10300f h2 = this.f15515h.f15362e;
                    if (h2 == null) {
                        C12775o.m28656z("brazeUser");
                        h2 = null;
                    }
                    h2.mo44961A(this.f15514g);
                } else {
                    C8266c.m16396e(C8266c.f11641a, this.f15515h, C8266c.C8267a.I, (Throwable) null, false, new C10274f(d, this.f15514g), 6, (Object) null);
                    this.f15515h.mo44771O().mo29152a(new FeedUpdatedEvent(new ArrayList(), this.f15514g, false, C8273e.m16436i()), FeedUpdatedEvent.class);
                }
                this.f15515h.mo44773R().mo28715m().mo28649e();
                C3748v3 m2 = this.f15515h.f15361d;
                if (m2 == null) {
                    C12775o.m28656z("offlineUserStorageProvider");
                    m2 = null;
                }
                m2.mo29746a(this.f15514g);
                C3043c3 R = this.f15515h.mo44773R();
                Context e = this.f15515h.f15359b;
                C3748v3 m3 = this.f15515h.f15361d;
                if (m3 == null) {
                    C12775o.m28656z("offlineUserStorageProvider");
                    v3Var = null;
                } else {
                    v3Var = m3;
                }
                C4218b L = this.f15515h.mo44768L();
                C3285j2 O = this.f15515h.mo44771O();
                C3162g2 N = this.f15515h.mo44770N();
                C3429m2 n = this.f15515h.f15367j;
                if (n == null) {
                    C12775o.m28656z("registrationDataProvider");
                    m2Var = null;
                } else {
                    m2Var = n;
                }
                boolean p = C10156b.f15352t;
                boolean f = C10156b.f15353u;
                C3030b6 q = this.f15515h.f15360c;
                if (q == null) {
                    C12775o.m28656z("testUserDeviceLoggingManager");
                    b6Var = null;
                } else {
                    b6Var = q;
                }
                this.f15515h.m21444y0(new C3732u6(e, v3Var, L, O, N, m2Var, p, f, b6Var));
                String str3 = this.f15516i;
                if (str3 != null && !C13754v.m31532t(str3)) {
                    z2 = false;
                }
                if (!z2) {
                    C8266c.m16396e(C8266c.f11641a, this.f15515h, (C8266c.C8267a) null, (Throwable) null, false, new C10275g(this.f15516i), 7, (Object) null);
                    this.f15515h.mo44773R().mo28717o().mo29829a(this.f15516i);
                }
                this.f15515h.mo44773R().mo28704b().mo29705h();
                this.f15515h.mo44773R().mo28715m().mo28648d();
                this.f15515h.mo44773R().mo28715m().mo28634a(new C2995a4.C2996a((String) null, (Boolean) null, (Boolean) null, (C3832z3) null, 15, (DefaultConstructorMarker) null).mo28596b());
                this.f15515h.mo44791h0(false);
                R.mo28703a();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44930a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$w1 */
    static final class C10276w1 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ C10156b f15525g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10276w1(C10156b bVar) {
            super(0);
            this.f15525g = bVar;
        }

        /* renamed from: a */
        public final void mo44938a() {
            this.f15525g.mo44773R().mo28715m().mo28634a(new C2995a4.C2996a((String) null, (Boolean) null, (Boolean) null, (C3832z3) null, 15, (DefaultConstructorMarker) null).mo28596b());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44938a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$x */
    static final class C10277x extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15526g;

        /* renamed from: h */
        final /* synthetic */ String f15527h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10277x(String str, String str2) {
            super(0);
            this.f15526g = str;
            this.f15527h = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log push story page clicked for pageId: " + this.f15526g + " campaignId: " + this.f15527h;
        }
    }

    /* renamed from: x.b$x0 */
    static final class C10278x0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15528g;

        /* renamed from: h */
        final /* synthetic */ Set<String> f15529h;

        /* renamed from: i */
        final /* synthetic */ boolean f15530i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10278x0(String str, Set<String> set, boolean z) {
            super(0);
            this.f15528g = str;
            this.f15529h = set;
            this.f15530i = z;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Checking event key [" + this.f15528g + "] against ephemeral event list " + this.f15529h + " and got match?: " + this.f15530i;
        }
    }

    /* renamed from: x.b$x1 */
    static final class C10279x1 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ C10156b f15531g;

        /* renamed from: h */
        final /* synthetic */ boolean f15532h;

        /* renamed from: x.b$x1$a */
        static final class C10280a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ boolean f15533g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10280a(boolean z) {
                super(0);
                this.f15533g = z;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Setting the image loader deny network downloads to ", Boolean.valueOf(this.f15533g));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10279x1(C10156b bVar, boolean z) {
            super(0);
            this.f15531g = bVar;
            this.f15532h = z;
        }

        /* renamed from: a */
        public final void mo44941a() {
            this.f15531g.mo44773R().mo28715m().mo28645b(this.f15532h);
            this.f15531g.mo44773R().mo28706d().mo28956a(this.f15532h);
            C10156b bVar = this.f15531g;
            if (bVar.f15358a != null) {
                C8266c.m16396e(C8266c.f11641a, bVar, (C8266c.C8267a) null, (Throwable) null, false, new C10280a(this.f15532h), 7, (Object) null);
                this.f15531g.mo44772P().mo29855d(this.f15532h);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44941a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$y */
    static final class C10281y extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Class<T> f15534g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10281y(Class<T> cls) {
            super(0);
            this.f15534g = cls;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to add synchronous subscriber for class: ", this.f15534g);
        }
    }

    /* renamed from: x.b$y0 */
    static final class C10282y0 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15535g;

        /* renamed from: h */
        final /* synthetic */ C3501o1 f15536h;

        /* renamed from: i */
        final /* synthetic */ C10156b f15537i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10282y0(String str, C3501o1 o1Var, C10156b bVar) {
            super(0);
            this.f15535g = str;
            this.f15536h = o1Var;
            this.f15537i = bVar;
        }

        /* renamed from: a */
        public final void mo44944a() {
            boolean z;
            String str = this.f15535g;
            if (str == null || C13754v.m31532t(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z && this.f15536h != null) {
                this.f15537i.mo44773R().mo28711i().mo29261b(this.f15535g, this.f15536h);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44944a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: x.b$z */
    static final class C10283z extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10283z f15538g = new C10283z();

        C10283z() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to retrieve the current user.";
        }
    }

    /* renamed from: x.b$z0 */
    static final class C10284z0 extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ C10156b f15539g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10284z0(C10156b bVar) {
            super(0);
            this.f15539g = bVar;
        }

        /* renamed from: a */
        public final void mo44946a() {
            this.f15539g.mo44773R().mo28710h().mo29310a();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo44946a();
            return C11921v.f18618a;
        }
    }

    public C10156b(Context context) {
        C12775o.m28639i(context, "context");
        long nanoTime = System.nanoTime();
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C10185e.f15404g, 7, (Object) null);
        Context applicationContext = context.getApplicationContext();
        C12775o.m28638h(applicationContext, "context.applicationContext");
        this.f15359b = applicationContext;
        String str = Build.MODEL;
        if (str != null) {
            Set<String> set = f15347o;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C12775o.m28638h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (set.contains(lowerCase)) {
                C8266c.m16396e(cVar, this, C8266c.C8267a.I, (Throwable) null, false, new C10198h(str), 6, (Object) null);
                f15345m.mo44807c();
            }
        }
        mo44803u0(new C3840a(this.f15359b));
        this.f15366i = new C3822z0(f15345m.m21493i(this.f15359b));
        mo44799p0(C10215l.f15444g, false, new C10220m(this, context));
        C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C10243q(System.nanoTime(), nanoTime), 7, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public final void m21413B0() {
        boolean z = true;
        for (String next : f15348p) {
            if (!C8287i.m16471b(this.f15359b, next)) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C10190f0(next), 6, (Object) null);
                z = false;
            }
        }
        if (C13754v.m31532t(mo44768L().getBrazeApiKey().toString())) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10210j0.f15439g, 6, (Object) null);
            z = false;
        }
        if (!z) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10238o0.f15470g, 6, (Object) null);
        }
    }

    /* renamed from: Q */
    public static final C10156b m21418Q(Context context) {
        return f15345m.mo44811g(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public final boolean m21419U(String str) {
        if (!mo44768L().isEphemeralEventsEnabled()) {
            return false;
        }
        C8266c cVar = C8266c.f11641a;
        C8266c.C8267a aVar = C8266c.C8267a.f11650f;
        C8266c.m16396e(cVar, this, aVar, (Throwable) null, false, C10251s0.f15487g, 6, (Object) null);
        Set<String> ephemeralEventKeys = mo44768L().getEphemeralEventKeys();
        boolean contains = ephemeralEventKeys.contains(str);
        C8266c.m16396e(cVar, this, aVar, (Throwable) null, false, new C10278x0(str, ephemeralEventKeys, contains), 6, (Object) null);
        return contains;
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public final void m21421e0(Throwable th) {
        if (this.f15369l == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, th, false, C10230m0.f15461g, 4, (Object) null);
            return;
        }
        try {
            mo44773R().mo28713k().mo29152a(th, Throwable.class);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C10244q0(th), 4, (Object) null);
        }
    }

    /* renamed from: q0 */
    public static /* synthetic */ void m21434q0(C10156b bVar, C13074a aVar, boolean z, C13074a aVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        bVar.mo44799p0(aVar, z, aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public final void m21441w0(boolean z) {
        m21434q0(this, new C10259u1(z), false, new C10279x1(this, z), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public final void m21444y0(C3732u6 u6Var) {
        mo44805x0(u6Var);
        C3026b5.f1477a.mo28664a(mo44773R().mo28713k());
        C3704t6 b = mo44773R().mo28704b();
        C3023b2 m = mo44773R().mo28715m();
        C3748v3 v3Var = this.f15361d;
        C3030b6 b6Var = null;
        if (v3Var == null) {
            C12775o.m28656z("offlineUserStorageProvider");
            v3Var = null;
        }
        this.f15362e = new C10300f(b, m, v3Var.mo29745a(), mo44773R().mo28710h(), mo44773R().mo28707e());
        mo44773R().mo28719q().mo29806a((C3285j2) mo44773R().mo28713k());
        mo44773R().mo28716n().mo28896d();
        mo44773R().mo28708f().mo28623a((C3203h2) mo44773R().mo28716n());
        C3030b6 b6Var2 = this.f15360c;
        if (b6Var2 == null) {
            C12775o.m28656z("testUserDeviceLoggingManager");
            b6Var2 = null;
        }
        b6Var2.mo28668a(mo44773R().mo28715m());
        C3030b6 b6Var3 = this.f15360c;
        if (b6Var3 == null) {
            C12775o.m28656z("testUserDeviceLoggingManager");
        } else {
            b6Var = b6Var3;
        }
        b6Var.mo28671a(mo44773R().mo28707e().mo28877r());
    }

    /* renamed from: A0 */
    public void mo44762A0(C2811f<C2813h> fVar) {
        C12775o.m28639i(fVar, "subscriber");
        try {
            this.f15366i.mo29155c(fVar, C2813h.class);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, C10240p.f15472g, 4, (Object) null);
            m21421e0(e);
        }
    }

    /* renamed from: G */
    public final /* synthetic */ void mo44763G(String str, String str2) {
        C12775o.m28639i(str, "serializedCardJson");
        m21434q0(this, new C10253t(str2, str), false, new C10256u(str, this, str2), 2, (Object) null);
    }

    /* renamed from: H */
    public <T> void mo44764H(C2811f<T> fVar, Class<T> cls) {
        C12775o.m28639i(fVar, "subscriber");
        C12775o.m28639i(cls, "eventClass");
        try {
            this.f15366i.mo29153a(fVar, cls);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10281y(cls), 4, (Object) null);
            m21421e0(e);
        }
    }

    /* renamed from: I */
    public final /* synthetic */ void mo44765I() {
        ReentrantLock reentrantLock = f15346n;
        reentrantLock.lock();
        try {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10180c0.f15399g, 7, (Object) null);
            C4245d dVar = new C4245d(this.f15359b);
            for (C4216a next : f15355w) {
                if (C12775o.m28634d(next, f15356x)) {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, C10195g0.f15417g, 6, (Object) null);
                    dVar.mo30975b();
                } else {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C10213k0(next), 6, (Object) null);
                    dVar.mo30985o(next);
                }
            }
            f15355w.clear();
            C11921v vVar = C11921v.f18618a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: J */
    public void mo44766J(String str, String str2) {
        m21434q0(this, new C10264v0(str), false, new C10268w0(str, this, str2), 2, (Object) null);
    }

    /* renamed from: K */
    public void mo44767K(Activity activity) {
        m21434q0(this, C10184d1.f15403g, false, new C10187e1(activity, this), 2, (Object) null);
    }

    /* renamed from: L */
    public final C4218b mo44768L() {
        C4218b bVar = this.f15368k;
        if (bVar != null) {
            return bVar;
        }
        C12775o.m28656z("configurationProvider");
        return null;
    }

    /* renamed from: M */
    public void mo44769M(C2812g<C10300f> gVar) {
        C12775o.m28639i(gVar, "completionCallback");
        if (f15345m.mo44814k()) {
            gVar.mo28293d();
            return;
        }
        try {
            C14054y1 unused = C13985j.m32422d(C3026b5.f1477a, (C12079g) null, (C14004n0) null, new C10266w(gVar, this, (C12074d<? super C10266w>) null), 3, (Object) null);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, C10283z.f15538g, 4, (Object) null);
            gVar.mo28293d();
            m21421e0(e);
        }
    }

    /* renamed from: N */
    public final C3162g2 mo44770N() {
        C3162g2 g2Var = this.f15365h;
        if (g2Var != null) {
            return g2Var;
        }
        C12775o.m28656z("deviceIdReader");
        return null;
    }

    /* renamed from: O */
    public final C3285j2 mo44771O() {
        return this.f15366i;
    }

    /* renamed from: P */
    public C3864b mo44772P() {
        C3864b bVar = this.f15358a;
        if (bVar != null) {
            return bVar;
        }
        C12775o.m28656z("imageLoader");
        return null;
    }

    /* renamed from: R */
    public final C3043c3 mo44773R() {
        C3043c3 c3Var = this.f15369l;
        if (c3Var != null) {
            return c3Var;
        }
        C12775o.m28656z("udm");
        return null;
    }

    /* renamed from: S */
    public final /* synthetic */ void mo44774S(Intent intent) {
        C12775o.m28639i(intent, "intent");
        m21434q0(this, C10216l0.f15445g, false, new C10241p0(intent, this), 2, (Object) null);
    }

    /* renamed from: T */
    public final Boolean mo44775T() {
        return this.f15363f;
    }

    /* renamed from: V */
    public void mo44776V(String str, C7554a aVar) {
        C7554a aVar2;
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = aVar.mo41300e();
        }
        m21434q0(this, new C10173a1(str), false, new C10191f1(str, this, aVar2), 2, (Object) null);
    }

    /* renamed from: W */
    public void mo44777W() {
        m21434q0(this, C10231m1.f15462g, false, new C10239o1(this), 2, (Object) null);
    }

    /* renamed from: X */
    public final /* synthetic */ void mo44778X(C2993a2 a2Var) {
        C12775o.m28639i(a2Var, "location");
        m21434q0(this, C10245q1.f15479g, false, new C10252s1(a2Var, this), 2, (Object) null);
    }

    /* renamed from: Y */
    public void mo44779Y(String str, String str2, BigDecimal bigDecimal, int i, C7554a aVar) {
        C7554a aVar2;
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = aVar.mo41300e();
        }
        C7554a aVar3 = aVar2;
        m21434q0(this, new C10265v1(str), false, new C10174b(str, str2, bigDecimal, i, this, aVar3), 2, (Object) null);
    }

    /* renamed from: Z */
    public void mo44780Z(String str, String str2, String str3) {
        m21434q0(this, C10189f.f15409g, false, new C10202i(str, this, str2, str3), 2, (Object) null);
    }

    /* renamed from: a */
    public <T> void mo44781a(C2811f<T> fVar, Class<T> cls) {
        C12775o.m28639i(cls, "eventClass");
        if (fVar != null) {
            try {
                mo44771O().mo29154b(fVar, cls);
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10236n1(cls), 4, (Object) null);
                m21421e0(e);
            }
        }
    }

    /* renamed from: a0 */
    public void mo44782a0(Intent intent) {
        m21434q0(this, new C10246r(intent), false, new C10260v(intent, this), 2, (Object) null);
    }

    /* renamed from: b */
    public void mo44783b() {
        m21434q0(this, C10255t1.f15493g, false, new C10276w1(this), 2, (Object) null);
    }

    /* renamed from: b0 */
    public void mo44784b0(String str, String str2) {
        m21434q0(this, new C10277x(str2, str), false, new C10171a0(str, str2, this), 2, (Object) null);
    }

    /* renamed from: c */
    public void mo44785c(C2811f<FeedUpdatedEvent> fVar) {
        C12775o.m28639i(fVar, "subscriber");
        try {
            this.f15366i.mo29155c(fVar, FeedUpdatedEvent.class);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, C10212k.f15441g, 4, (Object) null);
            m21421e0(e);
        }
    }

    /* renamed from: c0 */
    public void mo44786c0(Activity activity) {
        m21434q0(this, C10183d0.f15402g, false, new C10199h0(activity, this), 2, (Object) null);
    }

    /* renamed from: d */
    public void mo44787d() {
        m21434q0(this, C10179c.f15398g, false, new C10194g(this), 2, (Object) null);
    }

    /* renamed from: d0 */
    public final /* synthetic */ void mo44788d0(C10731b bVar, BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(bVar, "pushActionType");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        this.f15366i.mo29152a(new C2805b(bVar, brazeNotificationPayload), C2805b.class);
    }

    /* renamed from: f0 */
    public final /* synthetic */ void mo44789f0(String str, C3501o1 o1Var) {
        m21434q0(this, C10254t0.f15492g, false, new C10282y0(str, o1Var, this), 2, (Object) null);
    }

    /* renamed from: g0 */
    public void mo44790g0() {
        m21434q0(this, C10178b1.f15397g, false, new C10196g1(this), 2, (Object) null);
    }

    /* renamed from: h0 */
    public void mo44791h0(boolean z) {
        m21434q0(this, new C10242p1(z), false, new C10248r1(z, this), 2, (Object) null);
    }

    /* renamed from: i0 */
    public final /* synthetic */ void mo44792i0(C2993a2 a2Var) {
        m21434q0(this, C10209j.f15438g, false, new C10232n(a2Var, this), 2, (Object) null);
    }

    /* renamed from: j0 */
    public final /* synthetic */ void mo44793j0(boolean z) {
        m21434q0(this, new C10237o(z), false, new C10250s(this, z), 2, (Object) null);
    }

    /* renamed from: k0 */
    public final /* synthetic */ void mo44794k0() {
        m21434q0(this, C10177b0.f15396g, false, new C10186e0(this), 2, (Object) null);
    }

    /* renamed from: l0 */
    public void mo44795l0() {
        m21434q0(this, C10206i0.f15433g, false, new C10234n0(this), 2, (Object) null);
    }

    /* renamed from: m0 */
    public void mo44796m0() {
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10247r0.f15481g, 7, (Object) null);
        mo44794k0();
        mo44797n0();
    }

    /* renamed from: n0 */
    public final /* synthetic */ void mo44797n0() {
        m21434q0(this, C10258u0.f15499g, false, new C10284z0(this), 2, (Object) null);
    }

    /* renamed from: o0 */
    public final /* synthetic */ void mo44798o0(C2813h hVar) {
        C12775o.m28639i(hVar, NotificationCompat.CATEGORY_EVENT);
        m21434q0(this, new C10181c1(hVar), false, new C10201h1(this, hVar), 2, (Object) null);
    }

    /* renamed from: p0 */
    public final /* synthetic */ void mo44799p0(C13074a aVar, boolean z, C13074a aVar2) {
        C12775o.m28639i(aVar2, "block");
        if (!z || !f15345m.mo44814k()) {
            try {
                C14054y1 unused = C13985j.m32422d(C3026b5.f1477a, (C12079g) null, (C14004n0) null, new C10207i1(aVar2, (C12074d<? super C10207i1>) null), 3, (Object) null);
            } catch (Exception e) {
                if (aVar == null) {
                    C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, e, false, C10211j1.f15440g, 5, (Object) null);
                } else {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, aVar, 4, (Object) null);
                }
                m21421e0(e);
            }
        }
    }

    /* renamed from: r0 */
    public final void mo44800r0(Boolean bool) {
        this.f15363f = bool;
    }

    /* renamed from: s0 */
    public final void mo44801s0(C4218b bVar) {
        C12775o.m28639i(bVar, "<set-?>");
        this.f15368k = bVar;
    }

    /* renamed from: t0 */
    public final void mo44802t0(C3162g2 g2Var) {
        C12775o.m28639i(g2Var, "<set-?>");
        this.f15365h = g2Var;
    }

    /* renamed from: u0 */
    public void mo44803u0(C3864b bVar) {
        C12775o.m28639i(bVar, "<set-?>");
        this.f15358a = bVar;
    }

    /* renamed from: v0 */
    public void mo44804v0(String str) {
        m21434q0(this, new C10214k1(str), false, new C10217l1(this, str), 2, (Object) null);
    }

    /* renamed from: x0 */
    public final void mo44805x0(C3043c3 c3Var) {
        C12775o.m28639i(c3Var, "<set-?>");
        this.f15369l = c3Var;
    }

    /* renamed from: z0 */
    public void mo44806z0(C2811f<C2807d> fVar) {
        C12775o.m28639i(fVar, "subscriber");
        try {
            this.f15366i.mo29155c(fVar, C2807d.class);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, C10182d.f15401g, 4, (Object) null);
            m21421e0(e);
        }
    }
}
