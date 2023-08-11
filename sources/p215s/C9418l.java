package p215s;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p215s.C9406c;
import p336ef.C11907m;
import p336ef.C11921v;
import p355hf.C12074d;
import p466yf.C14002n;
import p466yf.C14010o;

@SourceDebugExtension({"SMAP\nViewSizeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewSizeResolver.kt\ncoil/size/ViewSizeResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,118:1\n1#2:119\n314#3,11:120\n*S KotlinDebug\n*F\n+ 1 ViewSizeResolver.kt\ncoil/size/ViewSizeResolver\n*L\n42#1:120,11\n*E\n"})
/* renamed from: s.l */
/* compiled from: ViewSizeResolver.kt */
public interface C9418l<T extends View> extends C9416j {

    /* renamed from: s.l$a */
    /* compiled from: ViewSizeResolver.kt */
    static final class C9419a extends C12777p implements Function1<Throwable, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C9418l<T> f13998g;

        /* renamed from: h */
        final /* synthetic */ ViewTreeObserver f13999h;

        /* renamed from: i */
        final /* synthetic */ C9420b f14000i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9419a(C9418l lVar, ViewTreeObserver viewTreeObserver, C9420b bVar) {
            super(1);
            this.f13998g = lVar;
            this.f13999h = viewTreeObserver;
            this.f14000i = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C11921v.f18618a;
        }

        public final void invoke(Throwable th) {
            this.f13998g.m19470d(this.f13999h, this.f14000i);
        }
    }

    /* renamed from: s.l$b */
    /* compiled from: ViewSizeResolver.kt */
    public static final class C9420b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        private boolean f14001b;

        /* renamed from: c */
        final /* synthetic */ C9418l<T> f14002c;

        /* renamed from: d */
        final /* synthetic */ ViewTreeObserver f14003d;

        /* renamed from: e */
        final /* synthetic */ C14002n<C9414i> f14004e;

        C9420b(C9418l<T> lVar, ViewTreeObserver viewTreeObserver, C14002n<? super C9414i> nVar) {
            this.f14002c = lVar;
            this.f14003d = viewTreeObserver;
            this.f14004e = nVar;
        }

        public boolean onPreDraw() {
            C9414i c = this.f14002c.getSize();
            if (c != null) {
                this.f14002c.m19470d(this.f14003d, this);
                if (!this.f14001b) {
                    this.f14001b = true;
                    this.f14004e.resumeWith(C11907m.m25696a(c));
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    private C9406c m19468b(int i, int i2, int i3) {
        if (i == -2) {
            return C9406c.C9408b.f13982a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            return C9404a.m19457a(i4);
        }
        int i5 = i2 - i3;
        if (i5 > 0) {
            return C9404a.m19457a(i5);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    void m19470d(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    /* renamed from: f */
    static /* synthetic */ <T extends View> Object m19471f(C9418l<T> lVar, C12074d<? super C9414i> dVar) {
        C9414i size = lVar.getSize();
        if (size != null) {
            return size;
        }
        C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
        oVar.mo53786B();
        ViewTreeObserver viewTreeObserver = lVar.getView().getViewTreeObserver();
        C9420b bVar = new C9420b(lVar, viewTreeObserver, oVar);
        viewTreeObserver.addOnPreDrawListener(bVar);
        oVar.mo49526f(new C9419a(lVar, viewTreeObserver, bVar));
        Object y = oVar.mo53797y();
        if (y == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        return y;
    }

    private C9406c getHeight() {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.height;
        } else {
            i = -1;
        }
        int height = getView().getHeight();
        if (mo43830e()) {
            i2 = getView().getPaddingTop() + getView().getPaddingBottom();
        } else {
            i2 = 0;
        }
        return m19468b(i, height, i2);
    }

    /* access modifiers changed from: private */
    C9414i getSize() {
        C9406c height;
        C9406c width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new C9414i(width, height);
    }

    private C9406c getWidth() {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = -1;
        }
        int width = getView().getWidth();
        if (mo43830e()) {
            i2 = getView().getPaddingLeft() + getView().getPaddingRight();
        } else {
            i2 = 0;
        }
        return m19468b(i, width, i2);
    }

    /* renamed from: a */
    Object mo41580a(C12074d<? super C9414i> dVar) {
        return m19471f(this, dVar);
    }

    /* renamed from: e */
    boolean mo43830e() {
        return true;
    }

    T getView();
}
