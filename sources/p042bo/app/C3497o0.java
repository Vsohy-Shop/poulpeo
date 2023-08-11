package p042bo.app;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.o0 */
public final class C3497o0 {

    /* renamed from: e */
    public static final C3498a f2278e = new C3498a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C3500b f2279a;

    /* renamed from: b */
    public final C3785x1 f2280b;

    /* renamed from: c */
    public final C3289j5 f2281c;

    /* renamed from: d */
    public final C3042c2 f2282d;

    /* renamed from: bo.app.o0$a */
    public static final class C3498a {

        /* renamed from: bo.app.o0$a$a */
        static final class C3499a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C3499a f2283b = new C3499a();

            C3499a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "There should be a session ID here";
            }
        }

        public /* synthetic */ C3498a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3497o0 mo29432a(C3785x1 x1Var) {
            C12775o.m28639i(x1Var, NotificationCompat.CATEGORY_EVENT);
            return new C3497o0(C3500b.ADD_BRAZE_EVENT, x1Var, (C3289j5) null, (C3042c2) null, 12, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public final C3497o0 mo29433b(C3785x1 x1Var) {
            C12775o.m28639i(x1Var, NotificationCompat.CATEGORY_EVENT);
            return new C3497o0(C3500b.ADD_PENDING_BRAZE_EVENT, x1Var, (C3289j5) null, (C3042c2) null, 12, (DefaultConstructorMarker) null);
        }

        private C3498a() {
        }

        /* renamed from: a */
        public final C3497o0 mo29431a(C3289j5 j5Var) {
            if (j5Var == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3499a.f2283b, 7, (Object) null);
            }
            return new C3497o0(C3500b.FLUSH_PENDING_BRAZE_EVENTS, (C3785x1) null, j5Var, (C3042c2) null, 10, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public final C3497o0 mo29430a(C3042c2 c2Var) {
            C12775o.m28639i(c2Var, "request");
            return new C3497o0(C3500b.ADD_REQUEST, (C3785x1) null, (C3289j5) null, c2Var, 6, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: bo.app.o0$b */
    public enum C3500b {
        ADD_PENDING_BRAZE_EVENT,
        ADD_BRAZE_EVENT,
        FLUSH_PENDING_BRAZE_EVENTS,
        ADD_REQUEST
    }

    private C3497o0(C3500b bVar, C3785x1 x1Var, C3289j5 j5Var, C3042c2 c2Var) {
        this.f2279a = bVar;
        this.f2280b = x1Var;
        this.f2281c = j5Var;
        this.f2282d = c2Var;
    }

    /* renamed from: a */
    public final C3500b mo29423a() {
        return this.f2279a;
    }

    /* renamed from: b */
    public final C3785x1 mo29424b() {
        return this.f2280b;
    }

    /* renamed from: c */
    public final C3289j5 mo29425c() {
        return this.f2281c;
    }

    /* renamed from: d */
    public final C3042c2 mo29426d() {
        return this.f2282d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3497o0)) {
            return false;
        }
        C3497o0 o0Var = (C3497o0) obj;
        if (this.f2279a == o0Var.f2279a && C12775o.m28634d(this.f2280b, o0Var.f2280b) && C12775o.m28634d(this.f2281c, o0Var.f2281c) && C12775o.m28634d(this.f2282d, o0Var.f2282d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.f2279a.hashCode() * 31;
        C3785x1 x1Var = this.f2280b;
        int i3 = 0;
        if (x1Var == null) {
            i = 0;
        } else {
            i = x1Var.hashCode();
        }
        int i4 = (hashCode + i) * 31;
        C3289j5 j5Var = this.f2281c;
        if (j5Var == null) {
            i2 = 0;
        } else {
            i2 = j5Var.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        C3042c2 c2Var = this.f2282d;
        if (c2Var != null) {
            i3 = c2Var.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        return C13745o.m31511f("\n            commandType = " + this.f2279a + "\n            brazeEvent = " + this.f2280b + "\n            sessionId = " + this.f2281c + "\n            brazeRequest = " + this.f2282d + "\n        ");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C3497o0(C3500b bVar, C3785x1 x1Var, C3289j5 j5Var, C3042c2 c2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i & 2) != 0 ? null : x1Var, (i & 4) != 0 ? null : j5Var, (i & 8) != 0 ? null : c2Var);
    }
}
