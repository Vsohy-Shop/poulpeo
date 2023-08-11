package p059d2;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.UiThread;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p059d2.C7227a;
import p059d2.C7240d;
import p071e2.C7443a;
import p071e2.C7447b;
import p071e2.C7449c;
import p071e2.C7454f;
import p118i2.C8093b;
import p198q2.C9138d0;
import p198q2.C9177p;
import p198q2.C9181q;
import p198q2.C9191t;
import p251v2.C9925a;

/* renamed from: d2.c */
/* compiled from: CodelessMatcher.kt */
public final class C7234c {

    /* renamed from: f */
    private static final String f9946f = C7234c.class.getCanonicalName();

    /* renamed from: g */
    private static C7234c f9947g;

    /* renamed from: h */
    public static final C7235a f9948h = new C7235a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Handler f9949a;

    /* renamed from: b */
    private final Set<Activity> f9950b;

    /* renamed from: c */
    private final Set<C7237c> f9951c;

    /* renamed from: d */
    private HashSet<String> f9952d;

    /* renamed from: e */
    private final HashMap<Integer, HashSet<String>> f9953e;

    /* renamed from: d2.c$a */
    /* compiled from: CodelessMatcher.kt */
    public static final class C7235a {
        private C7235a() {
        }

        public /* synthetic */ C7235a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final synchronized C7234c mo40794a() {
            C7234c a;
            if (C7234c.m14023a() == null) {
                C7234c.m14026d(new C7234c((DefaultConstructorMarker) null));
            }
            a = C7234c.m14023a();
            if (a == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            }
            return a;
        }

        @UiThread
        /* renamed from: b */
        public final Bundle mo40795b(C7443a aVar, View view, View view2) {
            List<C7447b> c;
            List<C7236b> list;
            boolean z;
            boolean z2;
            C12775o.m28639i(view, "rootView");
            C12775o.m28639i(view2, "hostView");
            Bundle bundle = new Bundle();
            if (!(aVar == null || (c = aVar.mo41114c()) == null)) {
                for (C7447b next : c) {
                    if (next.mo41121d() != null) {
                        if (next.mo41121d().length() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            bundle.putString(next.mo41118a(), next.mo41121d());
                        }
                    }
                    if (next.mo41119b().size() > 0) {
                        if (C12775o.m28634d(next.mo41120c(), "relative")) {
                            C7237c.C7238a aVar2 = C7237c.f9956g;
                            List<C7449c> b = next.mo41119b();
                            String simpleName = view2.getClass().getSimpleName();
                            C12775o.m28638h(simpleName, "hostView.javaClass.simpleName");
                            list = aVar2.mo40801a(aVar, view2, b, 0, -1, simpleName);
                        } else {
                            C7237c.C7238a aVar3 = C7237c.f9956g;
                            List<C7449c> b2 = next.mo41119b();
                            String simpleName2 = view.getClass().getSimpleName();
                            C12775o.m28638h(simpleName2, "rootView.javaClass.simpleName");
                            list = aVar3.mo40801a(aVar, view, b2, 0, -1, simpleName2);
                        }
                        Iterator<C7236b> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C7236b next2 = it.next();
                            if (next2.mo40796a() != null) {
                                String k = C7454f.m14608k(next2.mo40796a());
                                if (k.length() > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    bundle.putString(next.mo41118a(), k);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }
    }

    /* renamed from: d2.c$b */
    /* compiled from: CodelessMatcher.kt */
    public static final class C7236b {

        /* renamed from: a */
        private final WeakReference<View> f9954a;

        /* renamed from: b */
        private final String f9955b;

        public C7236b(View view, String str) {
            C12775o.m28639i(view, "view");
            C12775o.m28639i(str, "viewMapKey");
            this.f9954a = new WeakReference<>(view);
            this.f9955b = str;
        }

        /* renamed from: a */
        public final View mo40796a() {
            WeakReference<View> weakReference = this.f9954a;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        /* renamed from: b */
        public final String mo40797b() {
            return this.f9955b;
        }
    }

    @UiThread
    /* renamed from: d2.c$c */
    /* compiled from: CodelessMatcher.kt */
    public static final class C7237c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: g */
        public static final C7238a f9956g = new C7238a((DefaultConstructorMarker) null);

        /* renamed from: b */
        private final WeakReference<View> f9957b;

        /* renamed from: c */
        private List<C7443a> f9958c;

        /* renamed from: d */
        private final Handler f9959d;

        /* renamed from: e */
        private final HashSet<String> f9960e;

        /* renamed from: f */
        private final String f9961f;

        /* renamed from: d2.c$c$a */
        /* compiled from: CodelessMatcher.kt */
        public static final class C7238a {
            private C7238a() {
            }

            public /* synthetic */ C7238a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: b */
            private final List<View> m14042b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    C12775o.m28638h(childAt, "child");
                    if (childAt.getVisibility() == 0) {
                        arrayList.add(childAt);
                    }
                }
                return arrayList;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
                if ((!kotlin.jvm.internal.C12775o.m28634d(r10.getClass().getSimpleName(), (java.lang.String) r12.get(r12.size() - 1))) != false) goto L_0x006a;
             */
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private final boolean m14043c(android.view.View r10, p071e2.C7449c r11, int r12) {
                /*
                    r9 = this;
                    int r0 = r11.mo41126e()
                    r1 = -1
                    r2 = 0
                    if (r0 == r1) goto L_0x000f
                    int r0 = r11.mo41126e()
                    if (r12 == r0) goto L_0x000f
                    return r2
                L_0x000f:
                    java.lang.Class r12 = r10.getClass()
                    java.lang.String r12 = r12.getCanonicalName()
                    java.lang.String r0 = r11.mo41122a()
                    boolean r12 = kotlin.jvm.internal.C12775o.m28634d(r12, r0)
                    r0 = 1
                    r12 = r12 ^ r0
                    if (r12 == 0) goto L_0x006b
                    java.lang.String r12 = r11.mo41122a()
                    wf.j r1 = new wf.j
                    java.lang.String r3 = ".*android\\..*"
                    r1.<init>((java.lang.String) r3)
                    boolean r12 = r1.mo53412e(r12)
                    if (r12 == 0) goto L_0x006a
                    java.lang.String r3 = r11.mo41122a()
                    java.lang.String r12 = "."
                    java.lang.String[] r4 = new java.lang.String[]{r12}
                    r5 = 0
                    r6 = 0
                    r7 = 6
                    r8 = 0
                    java.util.List r12 = p454wf.C13755w.m31594t0(r3, r4, r5, r6, r7, r8)
                    r1 = r12
                    java.util.Collection r1 = (java.util.Collection) r1
                    boolean r1 = r1.isEmpty()
                    r1 = r1 ^ r0
                    if (r1 == 0) goto L_0x006a
                    int r1 = r12.size()
                    int r1 = r1 - r0
                    java.lang.Object r12 = r12.get(r1)
                    java.lang.String r12 = (java.lang.String) r12
                    java.lang.Class r1 = r10.getClass()
                    java.lang.String r1 = r1.getSimpleName()
                    boolean r12 = kotlin.jvm.internal.C12775o.m28634d(r1, r12)
                    r12 = r12 ^ r0
                    if (r12 == 0) goto L_0x006b
                L_0x006a:
                    return r2
                L_0x006b:
                    int r12 = r11.mo41127f()
                    e2.c$b r1 = p071e2.C7449c.C7451b.ID
                    int r1 = r1.mo41130a()
                    r12 = r12 & r1
                    if (r12 <= 0) goto L_0x0083
                    int r12 = r11.mo41125d()
                    int r1 = r10.getId()
                    if (r12 == r1) goto L_0x0083
                    return r2
                L_0x0083:
                    int r12 = r11.mo41127f()
                    e2.c$b r1 = p071e2.C7449c.C7451b.TEXT
                    int r1 = r1.mo41130a()
                    r12 = r12 & r1
                    java.lang.String r1 = ""
                    if (r12 <= 0) goto L_0x00b1
                    java.lang.String r12 = r11.mo41129h()
                    java.lang.String r3 = p071e2.C7454f.m14608k(r10)
                    java.lang.String r4 = p198q2.C9138d0.m18668v0(r3)
                    java.lang.String r4 = p198q2.C9138d0.m18639h(r4, r1)
                    boolean r3 = kotlin.jvm.internal.C12775o.m28634d(r12, r3)
                    r3 = r3 ^ r0
                    if (r3 == 0) goto L_0x00b1
                    boolean r12 = kotlin.jvm.internal.C12775o.m28634d(r12, r4)
                    r12 = r12 ^ r0
                    if (r12 == 0) goto L_0x00b1
                    return r2
                L_0x00b1:
                    int r12 = r11.mo41127f()
                    e2.c$b r3 = p071e2.C7449c.C7451b.DESCRIPTION
                    int r3 = r3.mo41130a()
                    r12 = r12 & r3
                    if (r12 <= 0) goto L_0x00e9
                    java.lang.String r12 = r11.mo41123b()
                    java.lang.CharSequence r3 = r10.getContentDescription()
                    if (r3 != 0) goto L_0x00ca
                    r3 = r1
                    goto L_0x00d2
                L_0x00ca:
                    java.lang.CharSequence r3 = r10.getContentDescription()
                    java.lang.String r3 = r3.toString()
                L_0x00d2:
                    java.lang.String r4 = p198q2.C9138d0.m18668v0(r3)
                    java.lang.String r4 = p198q2.C9138d0.m18639h(r4, r1)
                    boolean r3 = kotlin.jvm.internal.C12775o.m28634d(r12, r3)
                    r3 = r3 ^ r0
                    if (r3 == 0) goto L_0x00e9
                    boolean r12 = kotlin.jvm.internal.C12775o.m28634d(r12, r4)
                    r12 = r12 ^ r0
                    if (r12 == 0) goto L_0x00e9
                    return r2
                L_0x00e9:
                    int r12 = r11.mo41127f()
                    e2.c$b r3 = p071e2.C7449c.C7451b.HINT
                    int r3 = r3.mo41130a()
                    r12 = r12 & r3
                    if (r12 <= 0) goto L_0x0115
                    java.lang.String r12 = r11.mo41124c()
                    java.lang.String r3 = p071e2.C7454f.m14606i(r10)
                    java.lang.String r4 = p198q2.C9138d0.m18668v0(r3)
                    java.lang.String r4 = p198q2.C9138d0.m18639h(r4, r1)
                    boolean r3 = kotlin.jvm.internal.C12775o.m28634d(r12, r3)
                    r3 = r3 ^ r0
                    if (r3 == 0) goto L_0x0115
                    boolean r12 = kotlin.jvm.internal.C12775o.m28634d(r12, r4)
                    r12 = r12 ^ r0
                    if (r12 == 0) goto L_0x0115
                    return r2
                L_0x0115:
                    int r12 = r11.mo41127f()
                    e2.c$b r3 = p071e2.C7449c.C7451b.TAG
                    int r3 = r3.mo41130a()
                    r12 = r12 & r3
                    if (r12 <= 0) goto L_0x014d
                    java.lang.String r11 = r11.mo41128g()
                    java.lang.Object r12 = r10.getTag()
                    if (r12 != 0) goto L_0x012e
                    r10 = r1
                    goto L_0x0136
                L_0x012e:
                    java.lang.Object r10 = r10.getTag()
                    java.lang.String r10 = r10.toString()
                L_0x0136:
                    java.lang.String r12 = p198q2.C9138d0.m18668v0(r10)
                    java.lang.String r12 = p198q2.C9138d0.m18639h(r12, r1)
                    boolean r10 = kotlin.jvm.internal.C12775o.m28634d(r11, r10)
                    r10 = r10 ^ r0
                    if (r10 == 0) goto L_0x014d
                    boolean r10 = kotlin.jvm.internal.C12775o.m28634d(r11, r12)
                    r10 = r10 ^ r0
                    if (r10 == 0) goto L_0x014d
                    return r2
                L_0x014d:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p059d2.C7234c.C7237c.C7238a.m14043c(android.view.View, e2.c, int):boolean");
            }

            /* renamed from: a */
            public final List<C7236b> mo40801a(C7443a aVar, View view, List<C7449c> list, int i, int i2, String str) {
                C12775o.m28639i(list, "path");
                C12775o.m28639i(str, "mapKey");
                String str2 = str + '.' + i2;
                ArrayList arrayList = new ArrayList();
                if (view == null) {
                    return arrayList;
                }
                if (i >= list.size()) {
                    arrayList.add(new C7236b(view, str2));
                } else {
                    C7449c cVar = list.get(i);
                    if (C12775o.m28634d(cVar.mo41122a(), "..")) {
                        ViewParent parent = view.getParent();
                        if (parent instanceof ViewGroup) {
                            List<View> b = m14042b((ViewGroup) parent);
                            int size = b.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                arrayList.addAll(mo40801a(aVar, b.get(i3), list, i + 1, i3, str2));
                            }
                        }
                        return arrayList;
                    } else if (C12775o.m28634d(cVar.mo41122a(), ".")) {
                        arrayList.add(new C7236b(view, str2));
                        return arrayList;
                    } else if (!m14043c(view, cVar, i2)) {
                        return arrayList;
                    } else {
                        if (i == list.size() - 1) {
                            arrayList.add(new C7236b(view, str2));
                        }
                    }
                }
                if (view instanceof ViewGroup) {
                    List<View> b2 = m14042b((ViewGroup) view);
                    int size2 = b2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        arrayList.addAll(mo40801a(aVar, b2.get(i4), list, i + 1, i4, str2));
                    }
                }
                return arrayList;
            }
        }

        public C7237c(View view, Handler handler, HashSet<String> hashSet, String str) {
            C12775o.m28639i(handler, "handler");
            C12775o.m28639i(hashSet, "listenerSet");
            C12775o.m28639i(str, "activityName");
            this.f9957b = new WeakReference<>(view);
            this.f9959d = handler;
            this.f9960e = hashSet;
            this.f9961f = str;
            handler.postDelayed(this, 200);
        }

        /* renamed from: a */
        private final void m14036a(C7236b bVar, View view, C7443a aVar) {
            if (aVar != null) {
                try {
                    View a = bVar.mo40796a();
                    if (a != null) {
                        View a2 = C7454f.m14598a(a);
                        if (a2 == null || !C7454f.f10335d.mo41131p(a, a2)) {
                            String name = a.getClass().getName();
                            C12775o.m28638h(name, "view.javaClass.name");
                            if (!C13754v.m31525E(name, "com.facebook.react", false, 2, (Object) null)) {
                                if (!(a instanceof AdapterView)) {
                                    m14037b(bVar, view, aVar);
                                } else if (a instanceof ListView) {
                                    m14038c(bVar, view, aVar);
                                }
                            }
                        } else {
                            m14039d(bVar, view, aVar);
                        }
                    }
                } catch (Exception e) {
                    C9138d0.m18624Z(C7234c.m14024b(), e);
                }
            }
        }

        /* renamed from: b */
        private final void m14037b(C7236b bVar, View view, C7443a aVar) {
            boolean z;
            View a = bVar.mo40796a();
            if (a != null) {
                String b = bVar.mo40797b();
                View.OnClickListener g = C7454f.m14604g(a);
                if (g instanceof C7227a.C7228a) {
                    if (g == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                    } else if (((C7227a.C7228a) g).mo40784a()) {
                        z = true;
                        if (!this.f9960e.contains(b) && !z) {
                            a.setOnClickListener(C7227a.m14002a(aVar, view, a));
                            this.f9960e.add(b);
                            return;
                        }
                    }
                }
                z = false;
                if (!this.f9960e.contains(b)) {
                }
            }
        }

        /* renamed from: c */
        private final void m14038c(C7236b bVar, View view, C7443a aVar) {
            boolean z;
            AdapterView adapterView = (AdapterView) bVar.mo40796a();
            if (adapterView != null) {
                String b = bVar.mo40797b();
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                if (onItemClickListener instanceof C7227a.C7229b) {
                    if (onItemClickListener == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                    } else if (((C7227a.C7229b) onItemClickListener).mo40786a()) {
                        z = true;
                        if (!this.f9960e.contains(b) && !z) {
                            adapterView.setOnItemClickListener(C7227a.m14003b(aVar, view, adapterView));
                            this.f9960e.add(b);
                            return;
                        }
                    }
                }
                z = false;
                if (!this.f9960e.contains(b)) {
                }
            }
        }

        /* renamed from: d */
        private final void m14039d(C7236b bVar, View view, C7443a aVar) {
            boolean z;
            View a = bVar.mo40796a();
            if (a != null) {
                String b = bVar.mo40797b();
                View.OnTouchListener h = C7454f.m14605h(a);
                if (h instanceof C7240d.C7241a) {
                    if (h == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                    } else if (((C7240d.C7241a) h).mo40803a()) {
                        z = true;
                        if (!this.f9960e.contains(b) && !z) {
                            a.setOnTouchListener(C7240d.m14045a(aVar, view, a));
                            this.f9960e.add(b);
                            return;
                        }
                    }
                }
                z = false;
                if (!this.f9960e.contains(b)) {
                }
            }
        }

        /* renamed from: e */
        private final void m14040e(C7443a aVar, View view) {
            boolean z;
            if (aVar != null && view != null) {
                String a = aVar.mo41112a();
                if (a == null || a.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || !(!C12775o.m28634d(aVar.mo41112a(), this.f9961f))) {
                    List<C7449c> d = aVar.mo41115d();
                    if (d.size() <= 25) {
                        for (C7236b a2 : f9956g.mo40801a(aVar, view, d, 0, -1, this.f9961f)) {
                            m14036a(a2, view, aVar);
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        private final void m14041f() {
            List<C7443a> list = this.f9958c;
            if (list != null && this.f9957b.get() != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    m14040e(list.get(i), this.f9957b.get());
                }
            }
        }

        public void onGlobalLayout() {
            m14041f();
        }

        public void onScrollChanged() {
            m14041f();
        }

        public void run() {
            View view;
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C9177p j = C9181q.m18806j(FacebookSdk.getApplicationId());
                        if (j == null) {
                            return;
                        }
                        if (j.mo43454b()) {
                            List<C7443a> b = C7443a.f10290j.mo41117b(j.mo43456d());
                            this.f9958c = b;
                            if (b != null && (view = this.f9957b.get()) != null) {
                                C12775o.m28638h(view, "rootView.get() ?: return");
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                C12775o.m28638h(viewTreeObserver, "observer");
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.addOnGlobalLayoutListener(this);
                                    viewTreeObserver.addOnScrollChangedListener(this);
                                }
                                m14041f();
                            }
                        }
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: d2.c$d */
    /* compiled from: CodelessMatcher.kt */
    static final class C7239d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C7234c f9962b;

        C7239d(C7234c cVar) {
            this.f9962b = cVar;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C7234c.m14025c(this.f9962b);
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    private C7234c() {
        this.f9949a = new Handler(Looper.getMainLooper());
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        C12775o.m28638h(newSetFromMap, "Collections.newSetFromMap(WeakHashMap())");
        this.f9950b = newSetFromMap;
        this.f9951c = new LinkedHashSet();
        this.f9952d = new HashSet<>();
        this.f9953e = new HashMap<>();
    }

    /* renamed from: a */
    public static final /* synthetic */ C7234c m14023a() {
        Class<C7234c> cls = C7234c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f9947g;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ String m14024b() {
        Class<C7234c> cls = C7234c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f9946f;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m14025c(C7234c cVar) {
        Class<C7234c> cls = C7234c.class;
        if (!C9925a.m20734d(cls)) {
            try {
                cVar.m14027g();
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m14026d(C7234c cVar) {
        Class<C7234c> cls = C7234c.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f9947g = cVar;
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: g */
    private final void m14027g() {
        if (!C9925a.m20734d(this)) {
            try {
                for (Activity next : this.f9950b) {
                    if (next != null) {
                        View e = C8093b.m15923e(next);
                        String simpleName = next.getClass().getSimpleName();
                        C12775o.m28638h(simpleName, "activity.javaClass.simpleName");
                        this.f9951c.add(new C7237c(e, this.f9949a, this.f9952d, simpleName));
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: i */
    private final void m14028i() {
        if (!C9925a.m20734d(this)) {
            try {
                Thread currentThread = Thread.currentThread();
                Looper mainLooper = Looper.getMainLooper();
                C12775o.m28638h(mainLooper, "Looper.getMainLooper()");
                if (currentThread == mainLooper.getThread()) {
                    m14027g();
                } else {
                    this.f9949a.post(new C7239d(this));
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    @UiThread
    /* renamed from: e */
    public final void mo40791e(Activity activity) {
        if (!C9925a.m20734d(this)) {
            try {
                C12775o.m28639i(activity, "activity");
                if (!C9191t.m18822b()) {
                    Thread currentThread = Thread.currentThread();
                    Looper mainLooper = Looper.getMainLooper();
                    C12775o.m28638h(mainLooper, "Looper.getMainLooper()");
                    if (currentThread == mainLooper.getThread()) {
                        this.f9950b.add(activity);
                        this.f9952d.clear();
                        HashSet<String> hashSet = this.f9953e.get(Integer.valueOf(activity.hashCode()));
                        if (hashSet != null) {
                            C12775o.m28638h(hashSet, "it");
                            this.f9952d = hashSet;
                        }
                        m14028i();
                        return;
                    }
                    throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    @UiThread
    /* renamed from: f */
    public final void mo40792f(Activity activity) {
        if (!C9925a.m20734d(this)) {
            try {
                C12775o.m28639i(activity, "activity");
                this.f9953e.remove(Integer.valueOf(activity.hashCode()));
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    @UiThread
    /* renamed from: h */
    public final void mo40793h(Activity activity) {
        if (!C9925a.m20734d(this)) {
            try {
                C12775o.m28639i(activity, "activity");
                if (!C9191t.m18822b()) {
                    Thread currentThread = Thread.currentThread();
                    Looper mainLooper = Looper.getMainLooper();
                    C12775o.m28638h(mainLooper, "Looper.getMainLooper()");
                    if (currentThread == mainLooper.getThread()) {
                        this.f9950b.remove(activity);
                        this.f9951c.clear();
                        HashMap<Integer, HashSet<String>> hashMap = this.f9953e;
                        Integer valueOf = Integer.valueOf(activity.hashCode());
                        Object clone = this.f9952d.clone();
                        if (clone != null) {
                            hashMap.put(valueOf, (HashSet) clone);
                            this.f9952d.clear();
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.HashSet<kotlin.String> /* = java.util.HashSet<kotlin.String> */");
                    }
                    throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    public /* synthetic */ C7234c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
