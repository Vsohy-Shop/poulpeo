package androidx.compose.foundation.relocation;

import android.view.View;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LayoutCoordinatesKt;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;

/* compiled from: BringIntoViewResponder.android.kt */
final class AndroidBringIntoViewParent implements BringIntoViewParent {
    private final View view;

    public AndroidBringIntoViewParent(View view2) {
        C12775o.m28639i(view2, "view");
        this.view = view2;
    }

    public Object bringChildIntoView(LayoutCoordinates layoutCoordinates, C13074a<Rect> aVar, C12074d<? super C11921v> dVar) {
        Rect r3;
        long positionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
        Rect invoke = aVar.invoke();
        if (invoke == null || (r3 = invoke.m35459translatek4lQ0M(positionInRoot)) == null) {
            return C11921v.f18618a;
        }
        this.view.requestRectangleOnScreen(BringIntoViewResponder_androidKt.toRect(r3), false);
        return C11921v.f18618a;
    }
}
