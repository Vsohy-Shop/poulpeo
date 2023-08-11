package p424rf;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p370jf.C12623b;

/* renamed from: rf.c */
/* compiled from: Random.kt */
public abstract class C13364c {

    /* renamed from: b */
    public static final C13365a f21412b = new C13365a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C13364c f21413c = C12623b.f20272a.mo50363b();

    /* renamed from: rf.c$a */
    /* compiled from: Random.kt */
    public static final class C13365a extends C13364c implements Serializable {

        /* renamed from: rf.c$a$a */
        /* compiled from: Random.kt */
        private static final class C13366a implements Serializable {

            /* renamed from: b */
            public static final C13366a f21414b = new C13366a();
            private static final long serialVersionUID = 0;

            private C13366a() {
            }

            private final Object readResolve() {
                return C13364c.f21412b;
            }
        }

        public /* synthetic */ C13365a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return C13366a.f21414b;
        }

        /* renamed from: b */
        public int mo52982b() {
            return C13364c.f21413c.mo52982b();
        }

        private C13365a() {
        }
    }

    /* renamed from: b */
    public abstract int mo52982b();
}
