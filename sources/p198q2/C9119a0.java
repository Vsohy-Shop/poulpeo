package p198q2;

import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q2.a0 */
/* compiled from: SmartLoginOption.kt */
public enum C9119a0 {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final EnumSet<C9119a0> f13306g = null;

    /* renamed from: h */
    public static final C9120a f13307h = null;

    /* renamed from: b */
    private final long f13308b;

    /* renamed from: q2.a0$a */
    /* compiled from: SmartLoginOption.kt */
    public static final class C9120a {
        private C9120a() {
        }

        public /* synthetic */ C9120a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumSet<C9119a0> mo43388a(long j) {
            EnumSet<C9119a0> noneOf = EnumSet.noneOf(C9119a0.class);
            Iterator it = C9119a0.f13306g.iterator();
            while (it.hasNext()) {
                C9119a0 a0Var = (C9119a0) it.next();
                if ((a0Var.mo43387b() & j) != 0) {
                    noneOf.add(a0Var);
                }
            }
            C12775o.m28638h(noneOf, "result");
            return noneOf;
        }
    }

    static {
        f13307h = new C9120a((DefaultConstructorMarker) null);
        EnumSet<C9119a0> allOf = EnumSet.allOf(C9119a0.class);
        C12775o.m28638h(allOf, "EnumSet.allOf(SmartLoginOption::class.java)");
        f13306g = allOf;
    }

    private C9119a0(long j) {
        this.f13308b = j;
    }

    /* renamed from: b */
    public final long mo43387b() {
        return this.f13308b;
    }
}
