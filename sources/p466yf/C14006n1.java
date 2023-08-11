package p466yf;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p355hf.C12068b;
import p355hf.C12079g;

/* renamed from: yf.n1 */
/* compiled from: Executors.kt */
public abstract class C14006n1 extends C13971h0 implements Closeable {

    /* renamed from: b */
    public static final C14007a f22932b = new C14007a((DefaultConstructorMarker) null);

    /* renamed from: yf.n1$a */
    /* compiled from: Executors.kt */
    public static final class C14007a extends C12068b<C13971h0, C14006n1> {

        /* renamed from: yf.n1$a$a */
        /* compiled from: Executors.kt */
        static final class C14008a extends C12777p implements Function1<C12079g.C12082b, C14006n1> {

            /* renamed from: g */
            public static final C14008a f22933g = new C14008a();

            C14008a() {
                super(1);
            }

            /* renamed from: a */
            public final C14006n1 invoke(C12079g.C12082b bVar) {
                if (bVar instanceof C14006n1) {
                    return (C14006n1) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ C14007a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14007a() {
            super(C13971h0.Key, C14008a.f22933g);
        }
    }

    /* renamed from: t0 */
    public abstract Executor mo49424t0();
}
