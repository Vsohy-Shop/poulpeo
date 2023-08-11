package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$TextGeometricTransformSaver$1 extends C12777p implements C13088o<SaverScope, TextGeometricTransform, Object> {
    public static final SaversKt$TextGeometricTransformSaver$1 INSTANCE = new SaversKt$TextGeometricTransformSaver$1();

    SaversKt$TextGeometricTransformSaver$1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope, TextGeometricTransform textGeometricTransform) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(textGeometricTransform, "it");
        return C12726w.m28518e(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
    }
}
