package p042bo.app;

import androidx.core.app.NotificationCompat;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.b1 */
public final class C3017b1 {

    /* renamed from: a */
    private final C3811y1 f1468a;

    /* renamed from: b */
    private boolean f1469b;

    /* renamed from: bo.app.b1$a */
    static final class C3018a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3785x1 f1470b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3018a(C3785x1 x1Var) {
            super(0);
            this.f1470b = x1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Storage manager is closed. Not adding event: ", this.f1470b);
        }
    }

    /* renamed from: bo.app.b1$b */
    static final class C3019b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Set<C3785x1> f1471b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3019b(Set<? extends C3785x1> set) {
            super(0);
            this.f1471b = set;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Storage manager is closed. Not deleting events: ", this.f1471b);
        }
    }

    /* renamed from: bo.app.b1$c */
    static final class C3020c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3020c f1472b = new C3020c();

        C3020c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Storage manager is closed. Not starting offline recovery.";
        }
    }

    /* renamed from: bo.app.b1$d */
    static final class C3021d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3021d f1473b = new C3021d();

        C3021d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Started offline event recovery task.";
        }
    }

    /* renamed from: bo.app.b1$e */
    static final class C3022e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3785x1 f1474b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3022e(C3785x1 x1Var) {
            super(0);
            this.f1474b = x1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Adding event to dispatch from storage: ", this.f1474b);
        }
    }

    public C3017b1(C3811y1 y1Var) {
        C12775o.m28639i(y1Var, "brazeEventStorageProvider");
        this.f1468a = y1Var;
    }

    /* renamed from: a */
    public final void mo28624a(C3785x1 x1Var) {
        C12775o.m28639i(x1Var, NotificationCompat.CATEGORY_EVENT);
        if (this.f1469b) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3018a(x1Var), 6, (Object) null);
            return;
        }
        this.f1468a.mo28571a(x1Var);
    }

    /* renamed from: a */
    public final void mo28625a(Set<? extends C3785x1> set) {
        C12775o.m28639i(set, "events");
        if (this.f1469b) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3019b(set), 6, (Object) null);
            return;
        }
        this.f1468a.mo28572a(set);
    }

    /* renamed from: a */
    public final void mo28622a() {
        this.f1469b = true;
        this.f1468a.close();
    }

    /* renamed from: a */
    public final void mo28623a(C3203h2 h2Var) {
        C12775o.m28639i(h2Var, "dispatchManager");
        if (this.f1469b) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C3020c.f1472b, 6, (Object) null);
            return;
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3021d.f1473b, 7, (Object) null);
        for (C3785x1 x1Var : C12686e0.m28218W(this.f1468a.mo28570a())) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3022e(x1Var), 6, (Object) null);
            h2Var.mo28894a(x1Var);
        }
    }
}
