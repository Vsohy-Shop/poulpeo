package androidx.core.view;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: androidx.core.view.u */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1877u implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ DragStartHelper f530b;

    public /* synthetic */ C1877u(DragStartHelper dragStartHelper) {
        this.f530b = dragStartHelper;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f530b.onTouch(view, motionEvent);
    }
}
