package p293z0;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p018a0.C2106e;
import p018a0.C2108f;
import p043c0.C3864b;
import p069e0.C7358a;
import p069e0.C7362e;
import p069e0.C7363f;
import p069e0.C7389i;
import p069e0.C7390j;
import p126j0.C8266c;
import p126j0.C8316l;
import p238u0.C9783d;
import p270x.C10156b;
import p281y.C10606a;
import p292z.C10734d;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13933b1;
import p466yf.C13970h;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* renamed from: z0.a */
/* compiled from: BackgroundInAppMessagePreparer.kt */
public final class C10735a {

    /* renamed from: a */
    public static final C10735a f16429a = new C10735a();

    /* renamed from: z0.a$a */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    public /* synthetic */ class C10736a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16430a;

        static {
            int[] iArr = new int[C2108f.values().length];
            iArr[C2108f.HTML_FULL.ordinal()] = 1;
            iArr[C2108f.HTML.ordinal()] = 2;
            iArr[C2108f.SLIDEUP.ordinal()] = 3;
            iArr[C2108f.MODAL.ordinal()] = 4;
            f16430a = iArr;
        }
    }

    @C12739f(mo50609c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2", mo50610f = "BackgroundInAppMessagePreparer.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: z0.a$b */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10737b extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f16431h;

        /* renamed from: i */
        final /* synthetic */ C10735a f16432i;

        /* renamed from: j */
        final /* synthetic */ C7358a f16433j;

        /* renamed from: z0.a$b$a */
        /* compiled from: BackgroundInAppMessagePreparer.kt */
        static final class C10738a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10738a f16434g = new C10738a();

            C10738a() {
                super(0);
            }

            public final String invoke() {
                return "Displaying in-app message.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10737b(C10735a aVar, C7358a aVar2, C12074d<? super C10737b> dVar) {
            super(2, dVar);
            this.f16432i = aVar;
            this.f16433j = aVar2;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C10737b(this.f16432i, this.f16433j, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f16431h == 0) {
                C11910n.m25701b(obj);
                C8266c.m16396e(C8266c.f11641a, this.f16432i, (C8266c.C8267a) null, (Throwable) null, false, C10738a.f16434g, 7, (Object) null);
                C9783d.f14623G.mo44312a().mo44310w(this.f16433j, false);
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C10737b) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* renamed from: z0.a$c */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10739c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f16435g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10739c(String str) {
            super(0);
            this.f16435g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Passing in-app message local image url to image loader: ", this.f16435g);
        }
    }

    /* renamed from: z0.a$d */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10740d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f16436g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10740d(String str) {
            super(0);
            this.f16436g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Removing local image url from IAM since it could not be loaded. URL: ", this.f16436g);
        }
    }

    /* renamed from: z0.a$e */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10741e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10741e f16437g = new C10741e();

        C10741e() {
            super(0);
        }

        public final String invoke() {
            return "Skipping in-app message preparation for control in-app message.";
        }
    }

    /* renamed from: z0.a$f */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10742f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10742f f16438g = new C10742f();

        C10742f() {
            super(0);
        }

        public final String invoke() {
            return "Starting asynchronous in-app message preparation for message.";
        }
    }

    /* renamed from: z0.a$g */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10743g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10743g f16439g = new C10743g();

        C10743g() {
            super(0);
        }

        public final String invoke() {
            return "Logging html in-app message zip asset download failure";
        }
    }

    /* renamed from: z0.a$h */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10744h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10744h f16440g = new C10744h();

        C10744h() {
            super(0);
        }

        public final String invoke() {
            return "Logging in-app message image download failure";
        }
    }

    @C12739f(mo50609c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1", mo50610f = "BackgroundInAppMessagePreparer.kt", mo50611l = {43}, mo50612m = "invokeSuspend")
    /* renamed from: z0.a$i */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10745i extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f16441h;

        /* renamed from: i */
        private /* synthetic */ Object f16442i;

        /* renamed from: j */
        final /* synthetic */ C7358a f16443j;

        /* renamed from: z0.a$i$a */
        /* compiled from: BackgroundInAppMessagePreparer.kt */
        static final class C10746a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10746a f16444g = new C10746a();

            C10746a() {
                super(0);
            }

            public final String invoke() {
                return "Cannot display the in-app message because the in-app message was null.";
            }
        }

        /* renamed from: z0.a$i$b */
        /* compiled from: BackgroundInAppMessagePreparer.kt */
        static final class C10747b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C10747b f16445g = new C10747b();

            C10747b() {
                super(0);
            }

            public final String invoke() {
                return "Caught error while preparing in app message in background";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10745i(C7358a aVar, C12074d<? super C10745i> dVar) {
            super(2, dVar);
            this.f16443j = aVar;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C10745i iVar = new C10745i(this.f16443j, dVar);
            iVar.f16442i = obj;
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            Exception exc;
            C13995l0 l0Var;
            Object c = C12150d.m26492c();
            int i = this.f16441h;
            if (i == 0) {
                C11910n.m25701b(obj);
                C13995l0 l0Var2 = (C13995l0) this.f16442i;
                try {
                    C10735a aVar = C10735a.f16429a;
                    C7358a b = aVar.m22891f(this.f16443j);
                    if (b == null) {
                        C8266c.m16396e(C8266c.f11641a, l0Var2, C8266c.C8267a.f11651g, (Throwable) null, false, C10746a.f16444g, 6, (Object) null);
                    } else {
                        this.f16442i = l0Var2;
                        this.f16441h = 1;
                        if (aVar.m22888c(b, this) == c) {
                            return c;
                        }
                    }
                } catch (Exception e) {
                    l0Var = l0Var2;
                    exc = e;
                    C8266c.m16396e(C8266c.f11641a, l0Var, C8266c.C8267a.f11649e, exc, false, C10747b.f16445g, 4, (Object) null);
                    return C11921v.f18618a;
                }
            } else if (i == 1) {
                C13995l0 l0Var3 = (C13995l0) this.f16442i;
                try {
                    C11910n.m25701b(obj);
                } catch (Exception e2) {
                    exc = e2;
                    l0Var = l0Var3;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C10745i) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* renamed from: z0.a$j */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10748j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10748j f16446g = new C10748j();

        C10748j() {
            super(0);
        }

        public final String invoke() {
            return "Cannot prepare non IInAppMessageWithImage object with bitmap download.";
        }
    }

    /* renamed from: z0.a$k */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10749k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10749k f16447g = new C10749k();

        C10749k() {
            super(0);
        }

        public final String invoke() {
            return "In-app message already contains image bitmap. Not downloading image from URL.";
        }
    }

    /* renamed from: z0.a$l */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10750l extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10750l f16448g = new C10750l();

        C10750l() {
            super(0);
        }

        public final String invoke() {
            return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
        }
    }

    /* renamed from: z0.a$m */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10751m extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f16449g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10751m(String str) {
            super(0);
            this.f16449g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("In-app message has remote image url. Downloading image at url: ", this.f16449g);
        }
    }

    /* renamed from: z0.a$n */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10752n extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10752n f16450g = new C10752n();

        C10752n() {
            super(0);
        }

        public final String invoke() {
            return "In-app message has no remote image url. Not downloading image.";
        }
    }

    /* renamed from: z0.a$o */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10753o extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10753o f16451g = new C10753o();

        C10753o() {
            super(0);
        }

        public final String invoke() {
            return "In-app message full has no remote image url yet is required to have an image. Failing message display.";
        }
    }

    /* renamed from: z0.a$p */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10754p extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10754p f16452g = new C10754p();

        C10754p() {
            super(0);
        }

        public final String invoke() {
            return "HTML in-app message does not have prefetched assets. Not performing any substitutions.";
        }
    }

    /* renamed from: z0.a$q */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10755q extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10755q f16453g = new C10755q();

        C10755q() {
            super(0);
        }

        public final String invoke() {
            return "HTML in-app message does not have message. Not performing any substitutions.";
        }
    }

    /* renamed from: z0.a$r */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10756r extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f16454g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10756r(String str) {
            super(0);
            this.f16454g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Local assets for html in-app message are already populated. Not downloading assets. Location = ", this.f16454g);
        }
    }

    /* renamed from: z0.a$s */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10757s extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10757s f16455g = new C10757s();

        C10757s() {
            super(0);
        }

        public final String invoke() {
            return "Html in-app message has no remote asset zip. Continuing with in-app message preparation.";
        }
    }

    /* renamed from: z0.a$t */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10758t extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10758t f16456g = new C10758t();

        C10758t() {
            super(0);
        }

        public final String invoke() {
            return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
        }
    }

    /* renamed from: z0.a$u */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10759u extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f16457g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10759u(String str) {
            super(0);
            this.f16457g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Local url for html in-app message assets is ", this.f16457g);
        }
    }

    /* renamed from: z0.a$v */
    /* compiled from: BackgroundInAppMessagePreparer.kt */
    static final class C10760v extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C7363f f16458g;

        /* renamed from: h */
        final /* synthetic */ String f16459h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10760v(C7363f fVar, String str) {
            super(0);
            this.f16458g = fVar;
            this.f16459h = str;
        }

        public final String invoke() {
            return "Download of html content to local directory failed for remote url: " + this.f16458g.mo40984O() + " . Returned local url is: " + this.f16459h;
        }
    }

    private C10735a() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final Object m22888c(C7358a aVar, C12074d<? super C11921v> dVar) {
        Object g = C13970h.m32378g(C13933b1.m32212c(), new C10737b(this, aVar, (C12074d<? super C10737b>) null), dVar);
        if (g == C12150d.m26492c()) {
            return g;
        }
        return C11921v.f18618a;
    }

    /* renamed from: d */
    private final C10734d m22889d(C7358a aVar) {
        int i = C10736a.f16430a[aVar.mo40944I().ordinal()];
        if (i == 3) {
            return C10734d.IN_APP_MESSAGE_SLIDEUP;
        }
        if (i != 4) {
            return C10734d.NO_BOUNDS;
        }
        return C10734d.IN_APP_MESSAGE_MODAL;
    }

    /* renamed from: e */
    private final boolean m22890e(String str, C7362e eVar, C3864b bVar, Context context, C7358a aVar, C10734d dVar) {
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, C8266c.C8267a.I, (Throwable) null, false, new C10739c(str), 6, (Object) null);
        eVar.mo40982y(bVar.mo29856e(context, aVar, str, dVar));
        if (eVar.mo40980w() != null) {
            eVar.mo40978a(true);
            return true;
        }
        C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C10740d(str), 7, (Object) null);
        eVar.mo40981x((String) null);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final C7358a m22891f(C7358a aVar) {
        C7358a aVar2 = aVar;
        if (aVar.isControl()) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10741e.f16437g, 7, (Object) null);
            return aVar2;
        }
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C10742f.f16438g, 7, (Object) null);
        int i = C10736a.f16430a[aVar.mo40944I().ordinal()];
        if (i == 1) {
            if (!m22894j((C7363f) aVar2)) {
                C8266c.m16396e(cVar, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10743g.f16439g, 6, (Object) null);
                aVar2.mo40958b(C2106e.ZIP_ASSET_DOWNLOAD);
                return null;
            }
        } else if (i == 2) {
            mo45661i((C7390j) aVar2);
        } else if (!m22893h(aVar)) {
            C8266c.m16396e(cVar, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10744h.f16440g, 6, (Object) null);
            aVar2.mo40958b(C2106e.IMAGE_DOWNLOAD);
            return null;
        }
        return aVar2;
    }

    /* renamed from: g */
    public static final void m22892g(C7358a aVar) {
        C12775o.m28639i(aVar, "inAppMessageToPrepare");
        C14054y1 unused = C13985j.m32422d(C10606a.f16162b, (C12079g) null, (C14004n0) null, new C10745i(aVar, (C12074d<? super C10745i>) null), 3, (Object) null);
    }

    @VisibleForTesting
    /* renamed from: h */
    public static final boolean m22893h(C7358a aVar) {
        boolean z;
        boolean z2;
        C7358a aVar2 = aVar;
        if (!(aVar2 instanceof C7362e)) {
            C8266c.m16396e(C8266c.f11641a, f16429a, (C8266c.C8267a) null, (Throwable) null, false, C10748j.f16446g, 7, (Object) null);
            return false;
        }
        C7362e eVar = (C7362e) aVar2;
        if (eVar.mo40980w() != null) {
            C8266c.m16396e(C8266c.f11641a, f16429a, C8266c.C8267a.I, (Throwable) null, false, C10749k.f16447g, 6, (Object) null);
            eVar.mo40978a(true);
            return true;
        }
        C10735a aVar3 = f16429a;
        C10734d d = aVar3.m22889d(aVar2);
        Context b = C9783d.f14623G.mo44312a().mo44374b();
        if (b == null) {
            C8266c.m16396e(C8266c.f11641a, aVar3, C8266c.C8267a.f11651g, (Throwable) null, false, C10750l.f16448g, 6, (Object) null);
            return false;
        }
        C3864b P = C10156b.f15345m.mo44811g(b).mo44772P();
        String z3 = eVar.mo40983z();
        if (z3 == null || C13754v.m31532t(z3)) {
            z = true;
        } else {
            z = false;
        }
        if (!z && aVar3.m22890e(z3, eVar, P, b, aVar, d)) {
            return true;
        }
        String v = eVar.mo40979v();
        if (v == null || C13754v.m31532t(v)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            C8266c.m16396e(C8266c.f11641a, aVar3, C8266c.C8267a.I, (Throwable) null, false, new C10751m(v), 6, (Object) null);
            eVar.mo40982y(P.mo29856e(b, aVar2, v, d));
            if (eVar.mo40980w() == null) {
                return false;
            }
            eVar.mo40978a(true);
            return true;
        }
        C8266c cVar = C8266c.f11641a;
        C8266c.C8267a aVar4 = C8266c.C8267a.f11651g;
        C8266c.m16396e(cVar, aVar3, aVar4, (Throwable) null, false, C10752n.f16450g, 6, (Object) null);
        if (!(eVar instanceof C7389i)) {
            return true;
        }
        C8266c.m16396e(cVar, aVar3, aVar4, (Throwable) null, false, C10753o.f16451g, 6, (Object) null);
        return false;
    }

    @VisibleForTesting
    /* renamed from: j */
    public static final boolean m22894j(C7363f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        C7363f fVar2 = fVar;
        C12775o.m28639i(fVar2, "inAppMessageHtml");
        String B = fVar.mo40970B();
        if (B == null || C13754v.m31532t(B)) {
            z = true;
        } else {
            z = false;
        }
        if (z || !new File(B).exists()) {
            String O = fVar.mo40984O();
            if (O == null || C13754v.m31532t(O)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C8266c.m16396e(C8266c.f11641a, f16429a, C8266c.C8267a.I, (Throwable) null, false, C10757s.f16455g, 6, (Object) null);
                return true;
            }
            Context b = C9783d.f14623G.mo44312a().mo44374b();
            if (b == null) {
                C8266c.m16396e(C8266c.f11641a, f16429a, C8266c.C8267a.f11651g, (Throwable) null, false, C10758t.f16456g, 6, (Object) null);
                return false;
            }
            String b2 = C8316l.m16518b(C8316l.m16517a(b), O);
            if (b2 == null || C13754v.m31532t(b2)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                C8266c.m16396e(C8266c.f11641a, f16429a, (C8266c.C8267a) null, (Throwable) null, false, new C10759u(b2), 7, (Object) null);
                fVar2.mo40971C(b2);
                return true;
            }
            C8266c.m16396e(C8266c.f11641a, f16429a, C8266c.C8267a.f11651g, (Throwable) null, false, new C10760v(fVar2, b2), 6, (Object) null);
            return false;
        }
        C8266c.m16396e(C8266c.f11641a, f16429a, C8266c.C8267a.I, (Throwable) null, false, new C10756r(B), 6, (Object) null);
        return true;
    }

    @VisibleForTesting
    /* renamed from: i */
    public final void mo45661i(C7390j jVar) {
        C12775o.m28639i(jVar, "inAppMessage");
        if (jVar.mo41026u0().isEmpty()) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10754p.f16452g, 7, (Object) null);
            return;
        }
        String message = jVar.getMessage();
        if (message == null) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10755q.f16453g, 7, (Object) null);
            return;
        }
        jVar.mo40999p0(C8316l.m16519c(message, jVar.mo41026u0()));
    }
}
