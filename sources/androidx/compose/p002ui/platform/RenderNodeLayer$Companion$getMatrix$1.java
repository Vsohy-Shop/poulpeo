package androidx.compose.p002ui.platform;

import android.graphics.Matrix;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1 */
/* compiled from: RenderNodeLayer.android.kt */
final class RenderNodeLayer$Companion$getMatrix$1 extends C12777p implements C13088o<DeviceRenderNode, Matrix, C11921v> {
    public static final RenderNodeLayer$Companion$getMatrix$1 INSTANCE = new RenderNodeLayer$Companion$getMatrix$1();

    RenderNodeLayer$Companion$getMatrix$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((DeviceRenderNode) obj, (Matrix) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(DeviceRenderNode deviceRenderNode, Matrix matrix) {
        C12775o.m28639i(deviceRenderNode, "rn");
        C12775o.m28639i(matrix, "matrix");
        deviceRenderNode.getMatrix(matrix);
    }
}
