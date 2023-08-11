package p212r6;

import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p113h8.C8028a;
import p113h8.C8030b;
import p192p6.C9063a;
import p222s6.C9511f;
import p233t6.C9757a;
import p233t6.C9759c;
import p233t6.C9760d;
import p233t6.C9761e;
import p233t6.C9762f;
import p244u6.C9892a;
import p244u6.C9893b;
import p244u6.C9894c;

/* renamed from: r6.d */
/* compiled from: AnalyticsDeferredProxy */
public class C9389d {

    /* renamed from: a */
    private final C8028a<C9063a> f13966a;

    /* renamed from: b */
    private volatile C9757a f13967b;

    /* renamed from: c */
    private volatile C9893b f13968c;
    @GuardedBy("this")

    /* renamed from: d */
    private final List<C9892a> f13969d;

    public C9389d(C8028a<C9063a> aVar) {
        this(aVar, new C9894c(), new C9762f());
    }

    /* renamed from: f */
    private void m19419f() {
        this.f13966a.mo41859a(new C9388c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m19420g(String str, Bundle bundle) {
        this.f13967b.mo43806a(str, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m19421h(C9892a aVar) {
        synchronized (this) {
            if (this.f13968c instanceof C9894c) {
                this.f13969d.add(aVar);
            }
            this.f13968c.mo43805a(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m19422i(C8030b bVar) {
        C9511f.m19696f().mo43965b("AnalyticsConnector now available.");
        C9063a aVar = (C9063a) bVar.get();
        C9761e eVar = new C9761e(aVar);
        C9390e eVar2 = new C9390e();
        if (m19423j(aVar, eVar2) != null) {
            C9511f.m19696f().mo43965b("Registered Firebase Analytics listener.");
            C9760d dVar = new C9760d();
            C9759c cVar = new C9759c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (C9892a a : this.f13969d) {
                    dVar.mo43805a(a);
                }
                eVar2.mo43809d(dVar);
                eVar2.mo43810e(cVar);
                this.f13968c = dVar;
                this.f13967b = cVar;
            }
            return;
        }
        C9511f.m19696f().mo43973k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    /* renamed from: j */
    private static C9063a.C9064a m19423j(@NonNull C9063a aVar, @NonNull C9390e eVar) {
        C9063a.C9064a f = aVar.mo30051f("clx", eVar);
        if (f == null) {
            C9511f.m19696f().mo43965b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            f = aVar.mo30051f("crash", eVar);
            if (f != null) {
                C9511f.m19696f().mo43973k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return f;
    }

    /* renamed from: d */
    public C9757a mo43807d() {
        return new C9387b(this);
    }

    /* renamed from: e */
    public C9893b mo43808e() {
        return new C9386a(this);
    }

    public C9389d(C8028a<C9063a> aVar, @NonNull C9893b bVar, @NonNull C9757a aVar2) {
        this.f13966a = aVar;
        this.f13968c = bVar;
        this.f13969d = new ArrayList();
        this.f13967b = aVar2;
        m19419f();
    }
}
