package p205r;

import android.view.View;
import androidx.annotation.MainThread;
import coil.request.ViewTargetRequestDelegate;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.SourceDebugExtension;
import p259w.C10070i;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13933b1;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14020q1;
import p466yf.C14027s0;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nViewTargetRequestManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewTargetRequestManager.kt\ncoil/request/ViewTargetRequestManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
/* renamed from: r.r */
/* compiled from: ViewTargetRequestManager.kt */
public final class C9356r implements View.OnAttachStateChangeListener {

    /* renamed from: b */
    private final View f13911b;

    /* renamed from: c */
    private C9355q f13912c;

    /* renamed from: d */
    private C14054y1 f13913d;

    /* renamed from: e */
    private ViewTargetRequestDelegate f13914e;

    /* renamed from: f */
    private boolean f13915f;

    @C12739f(mo50609c = "coil.request.ViewTargetRequestManager$dispose$1", mo50610f = "ViewTargetRequestManager.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: r.r$a */
    /* compiled from: ViewTargetRequestManager.kt */
    static final class C9357a extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f13916h;

        /* renamed from: i */
        final /* synthetic */ C9356r f13917i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9357a(C9356r rVar, C12074d<? super C9357a> dVar) {
            super(2, dVar);
            this.f13917i = rVar;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C9357a(this.f13917i, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f13916h == 0) {
                C11910n.m25701b(obj);
                this.f13917i.mo43781c((ViewTargetRequestDelegate) null);
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C9357a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    public C9356r(View view) {
        this.f13911b = view;
    }

    /* renamed from: a */
    public final synchronized void mo43779a() {
        C14054y1 y1Var = this.f13913d;
        if (y1Var != null) {
            C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f13913d = C13985j.m32422d(C14020q1.f22944b, C13933b1.m32212c().mo49059t0(), (C14004n0) null, new C9357a(this, (C12074d<? super C9357a>) null), 2, (Object) null);
        this.f13912c = null;
    }

    /* renamed from: b */
    public final synchronized C9355q mo43780b(C14027s0<? extends C9342h> s0Var) {
        C9355q qVar = this.f13912c;
        if (qVar == null || !C10070i.m21158r() || !this.f13915f) {
            C14054y1 y1Var = this.f13913d;
            if (y1Var != null) {
                C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f13913d = null;
            C9355q qVar2 = new C9355q(this.f13911b, s0Var);
            this.f13912c = qVar2;
            return qVar2;
        }
        this.f13915f = false;
        qVar.mo43778a(s0Var);
        return qVar;
    }

    @MainThread
    /* renamed from: c */
    public final void mo43781c(ViewTargetRequestDelegate viewTargetRequestDelegate) {
        ViewTargetRequestDelegate viewTargetRequestDelegate2 = this.f13914e;
        if (viewTargetRequestDelegate2 != null) {
            viewTargetRequestDelegate2.mo30069b();
        }
        this.f13914e = viewTargetRequestDelegate;
    }

    @MainThread
    public void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f13914e;
        if (viewTargetRequestDelegate != null) {
            this.f13915f = true;
            viewTargetRequestDelegate.mo30070c();
        }
    }

    @MainThread
    public void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f13914e;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.mo30069b();
        }
    }
}
