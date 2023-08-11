package p472zf;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12079g;
import p466yf.C13933b1;
import p466yf.C13934b2;
import p466yf.C13943d1;
import p466yf.C14001m2;
import p466yf.C14002n;

@SourceDebugExtension({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,217:1\n1#2:218\n17#3:219\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n*L\n147#1:219\n*E\n"})
/* renamed from: zf.d */
/* compiled from: HandlerDispatcher.kt */
public final class C14122d extends C14125e {
    private volatile C14122d _immediate;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f23196b;

    /* renamed from: c */
    private final String f23197c;

    /* renamed from: d */
    private final boolean f23198d;

    /* renamed from: e */
    private final C14122d f23199e;

    @SourceDebugExtension({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n148#2:19\n149#2:21\n1#3:20\n*E\n"})
    /* renamed from: zf.d$a */
    /* compiled from: Runnable.kt */
    public static final class C14123a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C14002n f23200b;

        /* renamed from: c */
        final /* synthetic */ C14122d f23201c;

        public C14123a(C14002n nVar, C14122d dVar) {
            this.f23200b = nVar;
            this.f23201c = dVar;
        }

        public final void run() {
            this.f23200b.mo49523c(this.f23201c, C11921v.f18618a);
        }
    }

    /* renamed from: zf.d$b */
    /* compiled from: HandlerDispatcher.kt */
    static final class C14124b extends C12777p implements Function1<Throwable, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C14122d f23202g;

        /* renamed from: h */
        final /* synthetic */ Runnable f23203h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14124b(C14122d dVar, Runnable runnable) {
            super(1);
            this.f23202g = dVar;
            this.f23203h = runnable;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C11921v.f18618a;
        }

        public final void invoke(Throwable th) {
            this.f23202g.f23196b.removeCallbacks(this.f23203h);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C14122d(Handler handler, String str, boolean z) {
        super((DefaultConstructorMarker) null);
        C14122d dVar = null;
        this.f23196b = handler;
        this.f23197c = str;
        this.f23198d = z;
        this._immediate = z ? this : dVar;
        C14122d dVar2 = this._immediate;
        if (dVar2 == null) {
            dVar2 = new C14122d(handler, str, true);
            this._immediate = dVar2;
        }
        this.f23199e = dVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public static final void m32781A0(C14122d dVar, Runnable runnable) {
        dVar.f23196b.removeCallbacks(runnable);
    }

    /* renamed from: y0 */
    private final void m32784y0(C12079g gVar, Runnable runnable) {
        C13934b2.m32215c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C13933b1.m32211b().dispatch(gVar, runnable);
    }

    /* renamed from: b */
    public void mo49020b(long j, C14002n<? super C11921v> nVar) {
        C14123a aVar = new C14123a(nVar, this);
        if (this.f23196b.postDelayed(aVar, C13537l.m30883j(j, 4611686018427387903L))) {
            nVar.mo49526f(new C14124b(this, aVar));
        } else {
            m32784y0(nVar.getContext(), aVar);
        }
    }

    /* renamed from: c */
    public C13943d1 mo49021c(long j, Runnable runnable, C12079g gVar) {
        if (this.f23196b.postDelayed(runnable, C13537l.m30883j(j, 4611686018427387903L))) {
            return new C14121c(this, runnable);
        }
        m32784y0(gVar, runnable);
        return C14001m2.f22925b;
    }

    public void dispatch(C12079g gVar, Runnable runnable) {
        if (!this.f23196b.post(runnable)) {
            m32784y0(gVar, runnable);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C14122d) || ((C14122d) obj).f23196b != this.f23196b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return System.identityHashCode(this.f23196b);
    }

    public boolean isDispatchNeeded(C12079g gVar) {
        if (!this.f23198d || !C12775o.m28634d(Looper.myLooper(), this.f23196b.getLooper())) {
            return true;
        }
        return false;
    }

    public String toString() {
        String u0 = mo53773u0();
        if (u0 != null) {
            return u0;
        }
        String str = this.f23197c;
        if (str == null) {
            str = this.f23196b.toString();
        }
        if (!this.f23198d) {
            return str;
        }
        return str + ".immediate";
    }

    /* renamed from: z0 */
    public C14122d mo53899v0() {
        return this.f23199e;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14122d(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public C14122d(Handler handler, String str) {
        this(handler, str, false);
    }
}
