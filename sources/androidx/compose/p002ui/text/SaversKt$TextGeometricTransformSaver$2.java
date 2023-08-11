package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.style.TextGeometricTransform;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2 */
/* compiled from: Savers.kt */
final class SaversKt$TextGeometricTransformSaver$2 extends C12777p implements Function1<Object, TextGeometricTransform> {
    public static final SaversKt$TextGeometricTransformSaver$2 INSTANCE = new SaversKt$TextGeometricTransformSaver$2();

    SaversKt$TextGeometricTransformSaver$2() {
        super(1);
    }

    public final TextGeometricTransform invoke(Object obj) {
        C12775o.m28639i(obj, "it");
        List list = (List) obj;
        return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }
}
