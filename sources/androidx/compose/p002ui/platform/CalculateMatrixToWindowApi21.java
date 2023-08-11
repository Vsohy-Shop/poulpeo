package androidx.compose.p002ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p002ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.p002ui.graphics.Matrix;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.platform.CalculateMatrixToWindowApi21 */
/* compiled from: AndroidComposeView.android.kt */
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {
    private final int[] tmpLocation = new int[2];
    private final float[] tmpMatrix = Matrix.m35898constructorimpl$default((float[]) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: preConcat-tU-YjHk  reason: not valid java name */
    private final void m37714preConcattUYjHk(float[] fArr, android.graphics.Matrix matrix) {
        AndroidMatrixConversions_androidKt.m35534setFromtUYjHk(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m37712preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* renamed from: preTranslate-3XD1CNM  reason: not valid java name */
    private final void m37715preTranslate3XD1CNM(float[] fArr, float f, float f2) {
        Matrix.m35907resetimpl(this.tmpMatrix);
        Matrix.m35918translateimpl$default(this.tmpMatrix, f, f2, 0.0f, 4, (Object) null);
        AndroidComposeView_androidKt.m37712preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* renamed from: transformMatrixToWindow-EL8BTi8  reason: not valid java name */
    private final void m37716transformMatrixToWindowEL8BTi8(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            m37716transformMatrixToWindowEL8BTi8((View) parent, fArr);
            m37715preTranslate3XD1CNM(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            m37715preTranslate3XD1CNM(fArr, (float) view.getLeft(), (float) view.getTop());
        } else {
            int[] iArr = this.tmpLocation;
            view.getLocationInWindow(iArr);
            m37715preTranslate3XD1CNM(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            m37715preTranslate3XD1CNM(fArr, (float) iArr[0], (float) iArr[1]);
        }
        android.graphics.Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            C12775o.m28638h(matrix, "viewMatrix");
            m37714preConcattUYjHk(fArr, matrix);
        }
    }

    /* renamed from: calculateMatrixToWindow-EL8BTi8  reason: not valid java name */
    public void m37717calculateMatrixToWindowEL8BTi8(View view, float[] fArr) {
        C12775o.m28639i(view, "view");
        C12775o.m28639i(fArr, "matrix");
        Matrix.m35907resetimpl(fArr);
        m37716transformMatrixToWindowEL8BTi8(view, fArr);
    }
}
