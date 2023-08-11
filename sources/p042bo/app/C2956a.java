package p042bo.app;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p356hg.C12097d;
import p356hg.C12102f;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;

/* renamed from: bo.app.a */
public abstract class C2956a<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12097d f1377a = C12102f.m26316b(1, 0, 2, (Object) null);

    /* renamed from: bo.app.a$a */
    static final class C2957a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ T f1378b;

        /* renamed from: c */
        final /* synthetic */ boolean f1379c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2957a(T t, boolean z) {
            super(0);
            this.f1378b = t;
            this.f1379c = z;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Tried to confirm outboundObject [" + this.f1378b + "] with success [" + this.f1379c + "], but the cache wasn't locked, so not doing anything.";
        }
    }

    /* renamed from: bo.app.a$b */
    static final class C2958b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C2956a<T> f1380b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2958b(C2956a<T> aVar) {
            super(0);
            this.f1380b = aVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Notifying confirmAndUnlock listeners for cache: ", this.f1380b);
        }
    }

    /* renamed from: bo.app.a$c */
    static final class C2959c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C2956a<T> f1381b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2959c(C2956a<T> aVar) {
            super(0);
            this.f1381b = aVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Cache locked successfully for export: ", this.f1381b);
        }
    }

    /* renamed from: bo.app.a$d */
    static final class C2960d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C2960d f1382b = new C2960d();

        C2960d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Received call to export dirty object, but the cache was already locked.";
        }
    }

    @C12739f(mo50609c = "com.braze.storage.AbstractLockedCache$lockAndUnlock$1", mo50610f = "AbstractLockedCache.kt", mo50611l = {90}, mo50612m = "invokeSuspend")
    /* renamed from: bo.app.a$e */
    static final class C2961e extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: b */
        Object f1383b;

        /* renamed from: c */
        int f1384c;

        /* renamed from: d */
        final /* synthetic */ C2956a<T> f1385d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2961e(C2956a<T> aVar, C12074d<? super C2961e> dVar) {
            super(2, dVar);
            this.f1385d = aVar;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C2961e) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C2961e(this.f1385d, dVar);
        }

        /* JADX INFO: finally extract failed */
        public final Object invokeSuspend(Object obj) {
            C12097d dVar;
            Object c = C12150d.m26492c();
            int i = this.f1384c;
            if (i == 0) {
                C11910n.m25701b(obj);
                C12097d a = this.f1385d.f1377a;
                this.f1383b = a;
                this.f1384c = 1;
                if (a.mo49537c(this) == c) {
                    return c;
                }
                dVar = a;
            } else if (i == 1) {
                dVar = (C12097d) this.f1383b;
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C11921v vVar = C11921v.f18618a;
                dVar.release();
                return C11921v.f18618a;
            } catch (Throwable th) {
                dVar.release();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public abstract void mo28511b(T t, boolean z);

    /* renamed from: b */
    public final boolean mo28512b() {
        if (this.f1377a.mo49536b() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo28513c() {
        Object unused = C13976i.m32394b((C12079g) null, new C2961e(this, (C12074d<? super C2961e>) null), 1, (Object) null);
    }

    /* renamed from: d */
    public abstract T mo28514d();

    /* renamed from: a */
    public final synchronized T mo28509a() {
        T t;
        if (this.f1377a.mo49538g()) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C2959c(this), 7, (Object) null);
            t = mo28514d();
        } else {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C2960d.f1382b, 7, (Object) null);
            t = null;
        }
        return t;
    }

    /* renamed from: a */
    public final synchronized boolean mo28510a(T t, boolean z) {
        if (this.f1377a.mo49536b() != 0) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C2957a(t, z), 6, (Object) null);
            return false;
        }
        mo28511b(t, z);
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C2958b(this), 6, (Object) null);
        this.f1377a.release();
        return true;
    }
}
