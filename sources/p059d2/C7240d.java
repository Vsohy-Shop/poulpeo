package p059d2;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C12775o;
import p071e2.C7443a;
import p071e2.C7454f;
import p251v2.C9925a;

/* renamed from: d2.d */
/* compiled from: RCTCodelessLoggingEventListener.kt */
public final class C7240d {

    /* renamed from: a */
    public static final C7240d f9963a = new C7240d();

    /* renamed from: d2.d$a */
    /* compiled from: RCTCodelessLoggingEventListener.kt */
    public static final class C7241a implements View.OnTouchListener {

        /* renamed from: b */
        private final C7443a f9964b;

        /* renamed from: c */
        private final WeakReference<View> f9965c;

        /* renamed from: d */
        private final WeakReference<View> f9966d;

        /* renamed from: e */
        private final View.OnTouchListener f9967e;

        /* renamed from: f */
        private boolean f9968f = true;

        public C7241a(C7443a aVar, View view, View view2) {
            C12775o.m28639i(aVar, "mapping");
            C12775o.m28639i(view, "rootView");
            C12775o.m28639i(view2, "hostView");
            this.f9964b = aVar;
            this.f9965c = new WeakReference<>(view2);
            this.f9966d = new WeakReference<>(view);
            this.f9967e = C7454f.m14605h(view2);
        }

        /* renamed from: a */
        public final boolean mo40803a() {
            return this.f9968f;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C12775o.m28639i(view, "view");
            C12775o.m28639i(motionEvent, "motionEvent");
            View view2 = this.f9966d.get();
            View view3 = this.f9965c.get();
            if (!(view2 == null || view3 == null || motionEvent.getAction() != 1)) {
                C7227a.m14004c(this.f9964b, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f9967e;
            if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
                return false;
            }
            return true;
        }
    }

    private C7240d() {
    }

    /* renamed from: a */
    public static final C7241a m14045a(C7443a aVar, View view, View view2) {
        Class<C7240d> cls = C7240d.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(aVar, "mapping");
            C12775o.m28639i(view, "rootView");
            C12775o.m28639i(view2, "hostView");
            return new C7241a(aVar, view, view2);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }
}
