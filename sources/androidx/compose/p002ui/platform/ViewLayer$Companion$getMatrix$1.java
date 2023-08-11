package androidx.compose.p002ui.platform;

import android.graphics.Matrix;
import android.view.View;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1 */
/* compiled from: ViewLayer.android.kt */
final class ViewLayer$Companion$getMatrix$1 extends C12777p implements C13088o<View, Matrix, C11921v> {
    public static final ViewLayer$Companion$getMatrix$1 INSTANCE = new ViewLayer$Companion$getMatrix$1();

    ViewLayer$Companion$getMatrix$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((View) obj, (Matrix) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(View view, Matrix matrix) {
        C12775o.m28639i(view, "view");
        C12775o.m28639i(matrix, "matrix");
        matrix.set(view.getMatrix());
    }
}
