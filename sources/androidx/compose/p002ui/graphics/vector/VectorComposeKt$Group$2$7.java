package androidx.compose.p002ui.graphics.vector;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7 */
/* compiled from: VectorCompose.kt */
final class VectorComposeKt$Group$2$7 extends C12777p implements C13088o<GroupComponent, Float, C11921v> {
    public static final VectorComposeKt$Group$2$7 INSTANCE = new VectorComposeKt$Group$2$7();

    VectorComposeKt$Group$2$7() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
        return C11921v.f18618a;
    }

    public final void invoke(GroupComponent groupComponent, float f) {
        C12775o.m28639i(groupComponent, "$this$set");
        groupComponent.setTranslationX(f);
    }
}
