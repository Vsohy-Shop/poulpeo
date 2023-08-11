package androidx.compose.p002ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.jvm.internal.C12775o;

@RequiresApi(29)
/* renamed from: androidx.compose.ui.platform.CalculateMatrixToWindowApi29 */
/* compiled from: AndroidComposeView.android.kt */
final class CalculateMatrixToWindowApi29 implements CalculateMatrixToWindow {
    private final Matrix tmpMatrix = new Matrix();
    private final int[] tmpPosition = new int[2];

    @DoNotInline
    /* renamed from: calculateMatrixToWindow-EL8BTi8  reason: not valid java name */
    public void m37718calculateMatrixToWindowEL8BTi8(View view, float[] fArr) {
        C12775o.m28639i(view, "view");
        C12775o.m28639i(fArr, "matrix");
        this.tmpMatrix.reset();
        view.transformMatrixToGlobal(this.tmpMatrix);
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof View) {
            view = (View) viewParent;
            viewParent = view.getParent();
        }
        view.getLocationOnScreen(this.tmpPosition);
        int[] iArr = this.tmpPosition;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.tmpPosition;
        this.tmpMatrix.postTranslate((float) (iArr2[0] - i), (float) (iArr2[1] - i2));
        AndroidMatrixConversions_androidKt.m35534setFromtUYjHk(fArr, this.tmpMatrix);
    }
}
