package p259w;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p080f.C7546h;
import p195q.C9082c;
import p195q.C9083d;
import p195q.C9085e;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nSystemCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemCallbacks.kt\ncoil/util/SystemCallbacks\n+ 2 Logs.kt\ncoil/util/-Logs\n*L\n1#1,78:1\n69#1:79\n70#1:84\n69#1:85\n70#1:90\n21#2,4:80\n21#2,4:86\n*S KotlinDebug\n*F\n+ 1 SystemCallbacks.kt\ncoil/util/SystemCallbacks\n*L\n50#1:79\n50#1:84\n57#1:85\n57#1:90\n51#1:80,4\n58#1:86,4\n*E\n"})
/* renamed from: w.s */
/* compiled from: SystemCallbacks.kt */
public final class C10082s implements ComponentCallbacks2, C9083d.C9084a {

    /* renamed from: g */
    public static final C10083a f15237g = new C10083a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final Context f15238b;

    /* renamed from: c */
    private final WeakReference<C7546h> f15239c;

    /* renamed from: d */
    private final C9083d f15240d;

    /* renamed from: e */
    private volatile boolean f15241e;

    /* renamed from: f */
    private final AtomicBoolean f15242f;

    /* renamed from: w.s$a */
    /* compiled from: SystemCallbacks.kt */
    public static final class C10083a {
        private C10083a() {
        }

        public /* synthetic */ C10083a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C10082s(C7546h hVar, Context context, boolean z) {
        C9083d dVar;
        this.f15238b = context;
        this.f15239c = new WeakReference<>(hVar);
        if (z) {
            hVar.mo41293h();
            dVar = C9085e.m18457a(context, this, (C10080q) null);
        } else {
            dVar = new C9082c();
        }
        this.f15240d = dVar;
        this.f15241e = dVar.mo43301a();
        this.f15242f = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public void mo43303a(boolean z) {
        C11921v vVar;
        C7546h hVar = this.f15239c.get();
        if (hVar != null) {
            hVar.mo41293h();
            this.f15241e = z;
            vVar = C11921v.f18618a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            mo44661d();
        }
    }

    /* renamed from: b */
    public final boolean mo44659b() {
        return this.f15241e;
    }

    /* renamed from: c */
    public final void mo44660c() {
        this.f15238b.registerComponentCallbacks(this);
    }

    /* renamed from: d */
    public final void mo44661d() {
        if (!this.f15242f.getAndSet(true)) {
            this.f15238b.unregisterComponentCallbacks(this);
            this.f15240d.shutdown();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.f15239c.get() == null) {
            mo44661d();
            C11921v vVar = C11921v.f18618a;
        }
    }

    public void onLowMemory() {
        onTrimMemory(80);
    }

    public void onTrimMemory(int i) {
        C11921v vVar;
        C7546h hVar = this.f15239c.get();
        if (hVar != null) {
            hVar.mo41293h();
            hVar.mo41294l(i);
            vVar = C11921v.f18618a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            mo44661d();
        }
    }
}
