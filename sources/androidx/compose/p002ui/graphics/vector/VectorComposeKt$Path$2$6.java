package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.graphics.Brush;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6 */
/* compiled from: VectorCompose.kt */
final class VectorComposeKt$Path$2$6 extends C12777p implements C13088o<PathComponent, Brush, C11921v> {
    public static final VectorComposeKt$Path$2$6 INSTANCE = new VectorComposeKt$Path$2$6();

    VectorComposeKt$Path$2$6() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PathComponent) obj, (Brush) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(PathComponent pathComponent, Brush brush) {
        C12775o.m28639i(pathComponent, "$this$set");
        pathComponent.setStroke(brush);
    }
}
