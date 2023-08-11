package p256v7;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.webkit.ProxyConfig;
import com.google.firebase.inappmessaging.display.FiamListener;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p026a8.C2224g;
import p101g8.C7796a;
import p101g8.C7802c;
import p101g8.C7809f;
import p101g8.C7812g;
import p101g8.C7814h;
import p101g8.C7817i;
import p101g8.C7818j;
import p223s7.C9564q;
import p223s7.C9567t;
import p278x7.C10561a;
import p278x7.C10563c;
import p278x7.C10569e;
import p278x7.C10573g;
import p278x7.C10578i;
import p278x7.C10582l;
import p278x7.C10584m;
import p278x7.C10585n;
import p289y7.C10703c;
import p330df.C11814a;

/* renamed from: v7.b */
/* compiled from: FirebaseInAppMessagingDisplay */
public class C10031b extends C10578i {

    /* renamed from: b */
    private final C9564q f15106b;

    /* renamed from: c */
    private final Map<String, C11814a<C10582l>> f15107c;

    /* renamed from: d */
    private final C10569e f15108d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C10585n f15109e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10585n f15110f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10573g f15111g;

    /* renamed from: h */
    private final C10561a f15112h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Application f15113i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C10563c f15114j;

    /* renamed from: k */
    private FiamListener f15115k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C7817i f15116l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C9567t f15117m;
    @VisibleForTesting
    @Nullable

    /* renamed from: n */
    String f15118n;

    /* renamed from: v7.b$a */
    /* compiled from: FirebaseInAppMessagingDisplay */
    class C10032a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Activity f15119b;

        /* renamed from: c */
        final /* synthetic */ C10703c f15120c;

        C10032a(Activity activity, C10703c cVar) {
            this.f15119b = activity;
            this.f15120c = cVar;
        }

        public void run() {
            C10031b.this.m21079w(this.f15119b, this.f15120c);
        }
    }

    /* renamed from: v7.b$b */
    /* compiled from: FirebaseInAppMessagingDisplay */
    class C10033b implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Activity f15122b;

        C10033b(Activity activity) {
            this.f15122b = activity;
        }

        public void onClick(View view) {
            if (C10031b.this.f15117m != null) {
                C10031b.this.f15117m.mo29972b(C9567t.C9568a.CLICK);
            }
            C10031b.this.m21075s(this.f15122b);
        }
    }

    /* renamed from: v7.b$c */
    /* compiled from: FirebaseInAppMessagingDisplay */
    class C10034c implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ C7796a f15124b;

        /* renamed from: c */
        final /* synthetic */ Activity f15125c;

        C10034c(C7796a aVar, Activity activity) {
            this.f15124b = aVar;
            this.f15125c = activity;
        }

        public void onClick(View view) {
            if (C10031b.this.f15117m != null) {
                C10584m.m22520f("Calling callback for click action");
                C10031b.this.f15117m.mo29971a(this.f15124b);
            }
            C10031b.this.m21048A(this.f15125c, Uri.parse(this.f15124b.mo41446b()));
            C10031b.this.m21050C();
            C10031b.this.m21053F(this.f15125c);
            C7817i unused = C10031b.this.f15116l = null;
            C9567t unused2 = C10031b.this.f15117m = null;
        }
    }

    /* renamed from: v7.b$d */
    /* compiled from: FirebaseInAppMessagingDisplay */
    class C10035d extends C10569e.C10570a {

        /* renamed from: f */
        final /* synthetic */ C10703c f15127f;

        /* renamed from: g */
        final /* synthetic */ Activity f15128g;

        /* renamed from: h */
        final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f15129h;

        /* renamed from: v7.b$d$a */
        /* compiled from: FirebaseInAppMessagingDisplay */
        class C10036a implements View.OnTouchListener {
            C10036a() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 4) {
                    return false;
                }
                if (C10031b.this.f15117m != null) {
                    C10031b.this.f15117m.mo29972b(C9567t.C9568a.UNKNOWN_DISMISS_TYPE);
                }
                C10035d dVar = C10035d.this;
                C10031b.this.m21075s(dVar.f15128g);
                return true;
            }
        }

        /* renamed from: v7.b$d$b */
        /* compiled from: FirebaseInAppMessagingDisplay */
        class C10037b implements C10585n.C10587b {
            C10037b() {
            }

            public void onFinish() {
                if (C10031b.this.f15116l != null && C10031b.this.f15117m != null) {
                    C10584m.m22520f("Impression timer onFinish for: " + C10031b.this.f15116l.mo41514a().mo41483a());
                    C10031b.this.f15117m.mo29974d();
                }
            }
        }

        /* renamed from: v7.b$d$c */
        /* compiled from: FirebaseInAppMessagingDisplay */
        class C10038c implements C10585n.C10587b {
            C10038c() {
            }

            public void onFinish() {
                if (!(C10031b.this.f15116l == null || C10031b.this.f15117m == null)) {
                    C10031b.this.f15117m.mo29972b(C9567t.C9568a.AUTO);
                }
                C10035d dVar = C10035d.this;
                C10031b.this.m21075s(dVar.f15128g);
            }
        }

        /* renamed from: v7.b$d$d */
        /* compiled from: FirebaseInAppMessagingDisplay */
        class C10039d implements Runnable {
            C10039d() {
            }

            public void run() {
                C10573g p = C10031b.this.f15111g;
                C10035d dVar = C10035d.this;
                p.mo45500i(dVar.f15127f, dVar.f15128g);
                if (C10035d.this.f15127f.mo45624b().mo45513n().booleanValue()) {
                    C10031b.this.f15114j.mo45487a(C10031b.this.f15113i, C10035d.this.f15127f.mo45628f(), C10563c.C10566c.TOP);
                }
            }
        }

        C10035d(C10703c cVar, Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            this.f15127f = cVar;
            this.f15128g = activity;
            this.f15129h = onGlobalLayoutListener;
        }

        /* renamed from: j */
        public void mo44616j(Exception exc) {
            C10584m.m22519e("Image download failure ");
            if (this.f15129h != null) {
                this.f15127f.mo45627e().getViewTreeObserver().removeGlobalOnLayoutListener(this.f15129h);
            }
            C10031b.this.m21074r();
            C7817i unused = C10031b.this.f15116l = null;
            C9567t unused2 = C10031b.this.f15117m = null;
        }

        /* renamed from: l */
        public void mo44617l() {
            if (!this.f15127f.mo45624b().mo45515p().booleanValue()) {
                this.f15127f.mo45628f().setOnTouchListener(new C10036a());
            }
            C10031b.this.f15109e.mo45540b(new C10037b(), 5000, 1000);
            if (this.f15127f.mo45624b().mo45514o().booleanValue()) {
                C10031b.this.f15110f.mo45540b(new C10038c(), 20000, 1000);
            }
            this.f15128g.runOnUiThread(new C10039d());
        }
    }

    /* renamed from: v7.b$e */
    /* compiled from: FirebaseInAppMessagingDisplay */
    static /* synthetic */ class C10040e {

        /* renamed from: a */
        static final /* synthetic */ int[] f15135a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.firebase.inappmessaging.model.MessageType[] r0 = com.google.firebase.inappmessaging.model.MessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15135a = r0
                com.google.firebase.inappmessaging.model.MessageType r1 = com.google.firebase.inappmessaging.model.MessageType.BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15135a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.inappmessaging.model.MessageType r1 = com.google.firebase.inappmessaging.model.MessageType.MODAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15135a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.inappmessaging.model.MessageType r1 = com.google.firebase.inappmessaging.model.MessageType.IMAGE_ONLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15135a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.inappmessaging.model.MessageType r1 = com.google.firebase.inappmessaging.model.MessageType.CARD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p256v7.C10031b.C10040e.<clinit>():void");
        }
    }

    C10031b(C9564q qVar, Map<String, C11814a<C10582l>> map, C10569e eVar, C10585n nVar, C10585n nVar2, C10573g gVar, Application application, C10561a aVar, C10563c cVar) {
        this.f15106b = qVar;
        this.f15107c = map;
        this.f15108d = eVar;
        this.f15109e = nVar;
        this.f15110f = nVar2;
        this.f15111g = gVar;
        this.f15113i = application;
        this.f15112h = aVar;
        this.f15114j = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m21048A(Activity activity, Uri uri) {
        if (!m21081y(uri) || !m21055H(activity)) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            ResolveInfo resolveActivity = activity.getPackageManager().resolveActivity(intent, 0);
            intent.addFlags(BasicMeasure.EXACTLY);
            intent.addFlags(268435456);
            if (resolveActivity != null) {
                activity.startActivity(intent);
            } else {
                C10584m.m22519e("Device cannot resolve intent for: android.intent.action.VIEW");
            }
        } else {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            Intent intent2 = build.intent;
            intent2.addFlags(BasicMeasure.EXACTLY);
            intent2.addFlags(268435456);
            build.launchUrl(activity, uri);
        }
    }

    /* renamed from: B */
    private void m21049B(Activity activity, C10703c cVar, C7812g gVar, C10569e.C10570a aVar) {
        if (m21080x(gVar)) {
            this.f15108d.mo45491c(gVar.mo41503b()).mo45496d(activity.getClass()).mo45495c(C10043e.image_placeholder).mo45494b(cVar.mo45627e(), aVar);
        } else {
            aVar.mo44617l();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m21050C() {
        FiamListener fiamListener = this.f15115k;
        if (fiamListener != null) {
            fiamListener.onFiamClick();
        }
    }

    /* renamed from: D */
    private void m21051D() {
        FiamListener fiamListener = this.f15115k;
        if (fiamListener != null) {
            fiamListener.onFiamDismiss();
        }
    }

    /* renamed from: E */
    private void m21052E() {
        FiamListener fiamListener = this.f15115k;
        if (fiamListener != null) {
            fiamListener.onFiamTrigger();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m21053F(Activity activity) {
        if (this.f15111g.mo45499h()) {
            this.f15111g.mo45498a(activity);
            m21074r();
        }
    }

    /* renamed from: G */
    private void m21054G(@NonNull Activity activity) {
        C10703c cVar;
        if (this.f15116l == null || this.f15106b.mo44045c()) {
            C10584m.m22519e("No active message found to render");
        } else if (this.f15116l.mo41515c().equals(MessageType.UNSUPPORTED)) {
            C10584m.m22519e("The message being triggered is not supported by this version of the sdk.");
        } else {
            m21052E();
            C10582l lVar = (C10582l) this.f15107c.get(C2224g.m1879a(this.f15116l.mo41515c(), m21078v(this.f15113i))).get();
            int i = C10040e.f15135a[this.f15116l.mo41515c().ordinal()];
            if (i == 1) {
                cVar = this.f15112h.mo45482a(lVar, this.f15116l);
            } else if (i == 2) {
                cVar = this.f15112h.mo45485d(lVar, this.f15116l);
            } else if (i == 3) {
                cVar = this.f15112h.mo45484c(lVar, this.f15116l);
            } else if (i != 4) {
                C10584m.m22519e("No bindings found for this message type");
                return;
            } else {
                cVar = this.f15112h.mo45483b(lVar, this.f15116l);
            }
            activity.findViewById(16908290).post(new C10032a(activity, cVar));
        }
    }

    /* renamed from: H */
    private boolean m21055H(Activity activity) {
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        intent.setPackage("com.android.chrome");
        List<ResolveInfo> queryIntentServices = activity.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    private void m21056I(Activity activity) {
        String str = this.f15118n;
        if (str != null && str.equals(activity.getLocalClassName())) {
            C10584m.m22520f("Unbinding from activity: " + activity.getLocalClassName());
            this.f15106b.mo44046d();
            this.f15108d.mo45490b(activity.getClass());
            m21053F(activity);
            this.f15118n = null;
        }
    }

    /* renamed from: q */
    private void m21073q(Activity activity) {
        String str = this.f15118n;
        if (str == null || !str.equals(activity.getLocalClassName())) {
            C10584m.m22520f("Binding to activity: " + activity.getLocalClassName());
            this.f15106b.mo44048g(new C10030a(this, activity));
            this.f15118n = activity.getLocalClassName();
        }
        if (this.f15116l != null) {
            m21054G(activity);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m21074r() {
        this.f15109e.mo45539a();
        this.f15110f.mo45539a();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m21075s(Activity activity) {
        C10584m.m22515a("Dismissing fiam");
        m21051D();
        m21053F(activity);
        this.f15116l = null;
        this.f15117m = null;
    }

    /* renamed from: t */
    private List<C7796a> m21076t(C7817i iVar) {
        ArrayList arrayList = new ArrayList();
        int i = C10040e.f15135a[iVar.mo41515c().ordinal()];
        if (i == 1) {
            arrayList.add(((C7802c) iVar).mo41464e());
        } else if (i == 2) {
            arrayList.add(((C7818j) iVar).mo41516e());
        } else if (i == 3) {
            arrayList.add(((C7814h) iVar).mo41508e());
        } else if (i != 4) {
            arrayList.add(C7796a.m15212a().mo41450a());
        } else {
            C7809f fVar = (C7809f) iVar;
            arrayList.add(fVar.mo41492i());
            arrayList.add(fVar.mo41493j());
        }
        return arrayList;
    }

    /* renamed from: u */
    private C7812g m21077u(C7817i iVar) {
        if (iVar.mo41515c() != MessageType.CARD) {
            return iVar.mo41463b();
        }
        C7809f fVar = (C7809f) iVar;
        C7812g h = fVar.mo41490h();
        C7812g g = fVar.mo41489g();
        if (m21078v(this.f15113i) == 1) {
            if (m21080x(h)) {
                return h;
            }
            return g;
        } else if (m21080x(g)) {
            return g;
        } else {
            return h;
        }
    }

    /* renamed from: v */
    private static int m21078v(Application application) {
        return application.getResources().getConfiguration().orientation;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m21079w(Activity activity, C10703c cVar) {
        Object obj;
        C10033b bVar = new C10033b(activity);
        HashMap hashMap = new HashMap();
        for (C7796a next : m21076t(this.f15116l)) {
            if (next == null || TextUtils.isEmpty(next.mo41446b())) {
                C10584m.m22520f("No action url found for action. Treating as dismiss.");
                obj = bVar;
            } else {
                obj = new C10034c(next, activity);
            }
            hashMap.put(next, obj);
        }
        ViewTreeObserver.OnGlobalLayoutListener g = cVar.mo45629g(hashMap, bVar);
        if (g != null) {
            cVar.mo45627e().getViewTreeObserver().addOnGlobalLayoutListener(g);
        }
        m21049B(activity, cVar, m21077u(this.f15116l), new C10035d(cVar, activity, g));
    }

    /* renamed from: x */
    private boolean m21080x(@Nullable C7812g gVar) {
        if (gVar == null || TextUtils.isEmpty(gVar.mo41503b())) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private boolean m21081y(Uri uri) {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        if (scheme.equalsIgnoreCase(ProxyConfig.MATCH_HTTP) || scheme.equalsIgnoreCase("https")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m21082z(Activity activity, C7817i iVar, C9567t tVar) {
        if (this.f15116l != null || this.f15106b.mo44045c()) {
            C10584m.m22515a("Active FIAM exists. Skipping trigger");
            return;
        }
        this.f15116l = iVar;
        this.f15117m = tVar;
        m21054G(activity);
    }

    public void onActivityPaused(Activity activity) {
        m21056I(activity);
        this.f15106b.mo44047f();
        super.onActivityPaused(activity);
    }

    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        m21073q(activity);
    }
}
