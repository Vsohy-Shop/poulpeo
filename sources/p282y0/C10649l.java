package p282y0;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.C12775o;
import p282y0.C10645k;

/* renamed from: y0.l */
/* compiled from: TouchAwareSwipeDismissTouchListener.kt */
public final class C10649l extends C10645k {

    /* renamed from: p */
    private C10650a f16215p;

    /* renamed from: y0.l$a */
    /* compiled from: TouchAwareSwipeDismissTouchListener.kt */
    public interface C10650a {
        /* renamed from: a */
        void mo44363a();

        /* renamed from: b */
        void mo44364b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10649l(View view, Object obj, C10645k.C10648c cVar) {
        super(view, obj, cVar);
        C12775o.m28639i(view, "view");
    }

    /* renamed from: g */
    public final void mo45594g(C10650a aVar) {
        C12775o.m28639i(aVar, "newTouchListener");
        this.f16215p = aVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C10650a aVar;
        C12775o.m28639i(view, "view");
        C12775o.m28639i(motionEvent, "motionEvent");
        int action = motionEvent.getAction();
        if (action == 0) {
            C10650a aVar2 = this.f16215p;
            if (aVar2 != null) {
                aVar2.mo44364b();
            }
        } else if ((action == 1 || action == 3) && (aVar = this.f16215p) != null) {
            aVar.mo44363a();
        }
        return super.onTouch(view, motionEvent);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10649l(View view, C10645k.C10648c cVar) {
        this(view, (Object) null, cVar);
        C12775o.m28639i(view, "view");
    }
}
