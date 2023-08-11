package androidx.compose.p002ui.platform;

import android.graphics.Matrix;
import androidx.compose.p002ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.platform.LayerMatrixCache */
/* compiled from: LayerMatrixCache.android.kt */
public final class LayerMatrixCache<T> {
    private Matrix androidMatrixCache;
    private final C13088o<T, Matrix, C11921v> getMatrix;
    private float[] inverseMatrixCache;
    private boolean isDirty = true;
    private boolean isInverseDirty = true;
    private boolean isInverseValid = true;
    private float[] matrixCache;
    private Matrix previousAndroidMatrix;

    public LayerMatrixCache(C13088o<? super T, ? super Matrix, C11921v> oVar) {
        C12775o.m28639i(oVar, "getMatrix");
        this.getMatrix = oVar;
    }

    /* renamed from: calculateInverseMatrix-bWbORWo  reason: not valid java name */
    public final float[] m37741calculateInverseMatrixbWbORWo(T t) {
        float[] fArr = this.inverseMatrixCache;
        if (fArr == null) {
            fArr = androidx.compose.p002ui.graphics.Matrix.m35898constructorimpl$default((float[]) null, 1, (DefaultConstructorMarker) null);
            this.inverseMatrixCache = fArr;
        }
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m37739invertToJiSxe2E(m37742calculateMatrixGrdbGEg(t), fArr);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArr;
        }
        return null;
    }

    /* renamed from: calculateMatrix-GrdbGEg  reason: not valid java name */
    public final float[] m37742calculateMatrixGrdbGEg(T t) {
        float[] fArr = this.matrixCache;
        if (fArr == null) {
            fArr = androidx.compose.p002ui.graphics.Matrix.m35898constructorimpl$default((float[]) null, 1, (DefaultConstructorMarker) null);
            this.matrixCache = fArr;
        }
        if (!this.isDirty) {
            return fArr;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(t, matrix);
        Matrix matrix2 = this.previousAndroidMatrix;
        if (matrix2 == null || !C12775o.m28634d(matrix, matrix2)) {
            AndroidMatrixConversions_androidKt.m35534setFromtUYjHk(fArr, matrix);
            this.androidMatrixCache = matrix2;
            this.previousAndroidMatrix = matrix;
        }
        this.isDirty = false;
        return fArr;
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }
}
