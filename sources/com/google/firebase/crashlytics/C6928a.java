package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.C6922c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p025a7.C2217f;
import p050c7.C3892d;
import p113h8.C8028a;
import p124i8.C8213d;
import p192p6.C9063a;
import p212r6.C9389d;
import p222s6.C9502a;
import p222s6.C9505d;
import p222s6.C9508e;
import p222s6.C9511f;
import p255v6.C10000m;
import p255v6.C10019s;
import p255v6.C10021u;
import p255v6.C10026w;
import p255v6.C9960a;
import p255v6.C9972g;
import p276x5.C10394a;
import p276x5.C10410i;
import p299z6.C10826b;

/* renamed from: com.google.firebase.crashlytics.a */
/* compiled from: FirebaseCrashlytics */
public class C6928a {
    @VisibleForTesting

    /* renamed from: a */
    final C10000m f9149a;

    /* renamed from: com.google.firebase.crashlytics.a$a */
    /* compiled from: FirebaseCrashlytics */
    class C6929a implements C10394a<Void, Object> {
        C6929a() {
        }

        /* renamed from: a */
        public Object mo39780a(@NonNull Task<Void> task) {
            if (task.mo35465p()) {
                return null;
            }
            C9511f.m19696f().mo43968e("Error fetching settings.", task.mo35460k());
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.a$b */
    /* compiled from: FirebaseCrashlytics */
    class C6930b implements Callable<Void> {

        /* renamed from: b */
        final /* synthetic */ boolean f9150b;

        /* renamed from: c */
        final /* synthetic */ C10000m f9151c;

        /* renamed from: d */
        final /* synthetic */ C3892d f9152d;

        C6930b(boolean z, C10000m mVar, C3892d dVar) {
            this.f9150b = z;
            this.f9151c = mVar;
            this.f9152d = dVar;
        }

        /* renamed from: a */
        public Void call() {
            if (!this.f9150b) {
                return null;
            }
            this.f9151c.mo44563g(this.f9152d);
            return null;
        }
    }

    private C6928a(@NonNull C10000m mVar) {
        this.f9149a = mVar;
    }

    @NonNull
    /* renamed from: a */
    public static C6928a m12081a() {
        C6928a aVar = (C6928a) C6922c.m12057i().mo39765g(C6928a.class);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    @Nullable
    /* renamed from: b */
    static C6928a m12082b(@NonNull C6922c cVar, @NonNull C8213d dVar, @NonNull C8028a<C9502a> aVar, @NonNull C8028a<C9063a> aVar2) {
        Context h = cVar.mo39766h();
        String packageName = h.getPackageName();
        C9511f f = C9511f.m19696f();
        f.mo43969g("Initializing Firebase Crashlytics " + C10000m.m20922i() + " for " + packageName);
        C2217f fVar = new C2217f(h);
        C10019s sVar = new C10019s(cVar);
        C10026w wVar = new C10026w(h, packageName, dVar, sVar);
        C9505d dVar2 = new C9505d(aVar);
        C9389d dVar3 = new C9389d(aVar2);
        C6922c cVar2 = cVar;
        C10026w wVar2 = wVar;
        C10019s sVar2 = sVar;
        C10000m mVar = new C10000m(cVar2, wVar2, dVar2, sVar2, dVar3.mo43808e(), dVar3.mo43807d(), fVar, C10021u.m21020c("Crashlytics Exception Handler"));
        String c = cVar.mo39769k().mo39785c();
        String n = C9972g.m20824n(h);
        C9511f f2 = C9511f.m19696f();
        f2.mo43965b("Mapping file ID is: " + n);
        try {
            C9960a a = C9960a.m20783a(h, wVar, c, n, new C9508e(h));
            C9511f f3 = C9511f.m19696f();
            f3.mo43971i("Installer package name is: " + a.f14939c);
            ExecutorService c2 = C10021u.m21020c("com.google.firebase.crashlytics.startup");
            C3892d l = C3892d.m4396l(h, c, wVar, new C10826b(), a.f14941e, a.f14942f, fVar, sVar);
            l.mo29940p(c2).mo35457h(c2, new C6929a());
            C10410i.m21829c(c2, new C6930b(mVar.mo44568o(a, l), mVar, l));
            return new C6928a(mVar);
        } catch (PackageManager.NameNotFoundException e) {
            C9511f.m19696f().mo43968e("Error retrieving app package info.", e);
            return null;
        }
    }

    /* renamed from: c */
    public void mo39779c(@NonNull Throwable th) {
        if (th == null) {
            C9511f.m19696f().mo43973k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f9149a.mo44565l(th);
        }
    }
}
