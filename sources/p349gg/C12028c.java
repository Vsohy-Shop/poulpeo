package p349gg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p331dg.C11828g0;
import p336ef.C11921v;
import p404of.C13089p;
import p466yf.C14002n;

/* renamed from: gg.c */
/* compiled from: Select.kt */
public final class C12028c {

    /* renamed from: a */
    private static final C13089p<Object, Object, Object, Object> f18799a = C12029a.f18805g;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C11828g0 f18800b = new C11828g0("STATE_REG");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C11828g0 f18801c = new C11828g0("STATE_COMPLETED");
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C11828g0 f18802d = new C11828g0("STATE_CANCELLED");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C11828g0 f18803e = new C11828g0("NO_RESULT");

    /* renamed from: f */
    private static final C11828g0 f18804f = new C11828g0("PARAM_CLAUSE_0");

    /* renamed from: gg.c$a */
    /* compiled from: Select.kt */
    static final class C12029a extends C12777p implements C13089p {

        /* renamed from: g */
        public static final C12029a f18805g = new C12029a();

        C12029a() {
            super(3);
        }

        /* renamed from: a */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final C12030d m26124a(int i) {
        if (i == 0) {
            return C12030d.SUCCESSFUL;
        }
        if (i == 1) {
            return C12030d.REREGISTER;
        }
        if (i == 2) {
            return C12030d.CANCELLED;
        }
        if (i == 3) {
            return C12030d.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i).toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m26131h(C14002n<? super C11921v> nVar, Function1<? super Throwable, C11921v> function1) {
        Object h = nVar.mo49528h(C11921v.f18618a, (Object) null, function1);
        if (h == null) {
            return false;
        }
        nVar.mo49531o(h);
        return true;
    }
}
