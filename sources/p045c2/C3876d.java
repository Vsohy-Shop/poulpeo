package p045c2;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.annotation.UiThread;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p033b2.C2867m;
import p118i2.C8093b;
import p251v2.C9925a;
import p454wf.C13735j;

/* renamed from: c2.d */
/* compiled from: MetadataViewObserver.kt */
public final class C3876d implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: f */
    private static final Map<Integer, C3876d> f2954f = new HashMap();

    /* renamed from: g */
    public static final C3877a f2955g = new C3877a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final Set<String> f2956b;

    /* renamed from: c */
    private final Handler f2957c;

    /* renamed from: d */
    private final WeakReference<Activity> f2958d;

    /* renamed from: e */
    private final AtomicBoolean f2959e;

    /* renamed from: c2.d$a */
    /* compiled from: MetadataViewObserver.kt */
    public static final class C3877a {
        private C3877a() {
        }

        public /* synthetic */ C3877a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final String m4358c(String str, String str2) {
            if (C12775o.m28634d("r2", str)) {
                return new C13735j("[^\\d.]").mo53413f(str2, "");
            }
            return str2;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
            if (r7.equals("r5") != false) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            if (r7.equals("r4") != false) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
            r8 = new p454wf.C13735j("[^a-z]+").mo53413f(r8, "");
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m4359d(java.util.Map<java.lang.String, java.lang.String> r6, java.lang.String r7, java.lang.String r8) {
            /*
                r5 = this;
                int r0 = r7.hashCode()
                r1 = 0
                r2 = 2
                r3 = 0
                switch(r0) {
                    case 3585: goto L_0x005b;
                    case 3586: goto L_0x0045;
                    case 3587: goto L_0x003c;
                    case 3588: goto L_0x000c;
                    default: goto L_0x000a;
                }
            L_0x000a:
                goto L_0x0080
            L_0x000c:
                java.lang.String r0 = "r6"
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L_0x0080
                java.lang.String r0 = "-"
                boolean r1 = p454wf.C13755w.m31552J(r8, r0, r3, r2, r1)
                if (r1 == 0) goto L_0x0080
                wf.j r1 = new wf.j
                r1.<init>((java.lang.String) r0)
                java.util.List r8 = r1.mo53415h(r8, r3)
                java.util.Collection r8 = (java.util.Collection) r8
                java.lang.String[] r0 = new java.lang.String[r3]
                java.lang.Object[] r8 = r8.toArray(r0)
                if (r8 == 0) goto L_0x0034
                java.lang.String[] r8 = (java.lang.String[]) r8
                r8 = r8[r3]
                goto L_0x0080
            L_0x0034:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException
                java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T>"
                r6.<init>(r7)
                throw r6
            L_0x003c:
                java.lang.String r0 = "r5"
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L_0x0080
                goto L_0x004d
            L_0x0045:
                java.lang.String r0 = "r4"
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L_0x0080
            L_0x004d:
                wf.j r0 = new wf.j
                java.lang.String r1 = "[^a-z]+"
                r0.<init>((java.lang.String) r1)
                java.lang.String r1 = ""
                java.lang.String r8 = r0.mo53413f(r8, r1)
                goto L_0x0080
            L_0x005b:
                java.lang.String r0 = "r3"
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L_0x0080
                java.lang.String r0 = "m"
                boolean r4 = p454wf.C13754v.m31525E(r8, r0, r3, r2, r1)
                if (r4 != 0) goto L_0x007f
                java.lang.String r4 = "b"
                boolean r4 = p454wf.C13754v.m31525E(r8, r4, r3, r2, r1)
                if (r4 != 0) goto L_0x007f
                java.lang.String r4 = "ge"
                boolean r8 = p454wf.C13754v.m31525E(r8, r4, r3, r2, r1)
                if (r8 == 0) goto L_0x007c
                goto L_0x007f
            L_0x007c:
                java.lang.String r8 = "f"
                goto L_0x0080
            L_0x007f:
                r8 = r0
            L_0x0080:
                r6.put(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p045c2.C3876d.C3877a.m4359d(java.util.Map, java.lang.String, java.lang.String):void");
        }

        @UiThread
        /* renamed from: e */
        public final void mo29922e(Activity activity) {
            C12775o.m28639i(activity, "activity");
            int hashCode = activity.hashCode();
            Map a = C3876d.m4349a();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = a.get(valueOf);
            if (obj == null) {
                obj = new C3876d(activity, (DefaultConstructorMarker) null);
                a.put(valueOf, obj);
            }
            C3876d.m4351c((C3876d) obj);
        }
    }

    /* renamed from: c2.d$b */
    /* compiled from: MetadataViewObserver.kt */
    static final class C3878b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C3876d f2960b;

        /* renamed from: c */
        final /* synthetic */ View f2961c;

        C3878b(C3876d dVar, View view) {
            this.f2960b = dVar;
            this.f2961c = view;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        View view = this.f2961c;
                        if (view instanceof EditText) {
                            C3876d.m4350b(this.f2960b, view);
                        }
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    private C3876d(Activity activity) {
        this.f2956b = new LinkedHashSet();
        this.f2957c = new Handler(Looper.getMainLooper());
        this.f2958d = new WeakReference<>(activity);
        this.f2959e = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public static final /* synthetic */ Map m4349a() {
        Class<C3876d> cls = C3876d.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f2954f;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m4350b(C3876d dVar, View view) {
        Class<C3876d> cls = C3876d.class;
        if (!C9925a.m20734d(cls)) {
            try {
                dVar.m4353e(view);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m4351c(C3876d dVar) {
        Class<C3876d> cls = C3876d.class;
        if (!C9925a.m20734d(cls)) {
            try {
                dVar.m4355g();
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: d */
    private final void m4352d(View view) {
        if (!C9925a.m20734d(this)) {
            try {
                m4354f(new C3878b(this, view));
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: e */
    private final void m4353e(View view) {
        boolean z;
        boolean z2;
        if (!C9925a.m20734d(this)) {
            if (view != null) {
                try {
                    String obj = ((EditText) view).getText().toString();
                    if (obj != null) {
                        String obj2 = C13755w.m31561N0(obj).toString();
                        if (obj2 != null) {
                            String lowerCase = obj2.toLowerCase();
                            C12775o.m28638h(lowerCase, "(this as java.lang.String).toLowerCase()");
                            if (lowerCase.length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z && !this.f2956b.contains(lowerCase)) {
                                if (lowerCase.length() <= 100) {
                                    this.f2956b.add(lowerCase);
                                    HashMap hashMap = new HashMap();
                                    List<String> b = C3873b.m4336b(view);
                                    List<String> list = null;
                                    for (C3874c next : C3874c.f2950e.mo29919c()) {
                                        C3877a aVar = f2955g;
                                        String a = aVar.m4358c(next.mo29916c(), lowerCase);
                                        if (next.mo29917d().length() > 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (!z2 || C3873b.m4340f(a, next.mo29917d())) {
                                            if (C3873b.m4339e(b, next.mo29915b())) {
                                                aVar.m4359d(hashMap, next.mo29916c(), a);
                                            } else {
                                                if (list == null) {
                                                    list = C3873b.m4335a(view);
                                                }
                                                if (C3873b.m4339e(list, next.mo29915b())) {
                                                    aVar.m4359d(hashMap, next.mo29916c(), a);
                                                }
                                            }
                                        }
                                    }
                                    C2867m.f1252b.mo28399d(hashMap);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.EditText");
            }
        }
    }

    /* renamed from: f */
    private final void m4354f(Runnable runnable) {
        if (!C9925a.m20734d(this)) {
            try {
                Thread currentThread = Thread.currentThread();
                Looper mainLooper = Looper.getMainLooper();
                C12775o.m28638h(mainLooper, "Looper.getMainLooper()");
                if (currentThread == mainLooper.getThread()) {
                    runnable.run();
                } else {
                    this.f2957c.post(runnable);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: g */
    private final void m4355g() {
        View e;
        if (!C9925a.m20734d(this)) {
            try {
                if (!this.f2959e.getAndSet(true) && (e = C8093b.m15923e(this.f2958d.get())) != null) {
                    ViewTreeObserver viewTreeObserver = e.getViewTreeObserver();
                    C12775o.m28638h(viewTreeObserver, "observer");
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalFocusChangeListener(this);
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (!C9925a.m20734d(this)) {
            if (view != null) {
                try {
                    m4352d(view);
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                    return;
                }
            }
            if (view2 != null) {
                m4352d(view2);
            }
        }
    }

    public /* synthetic */ C3876d(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }
}
