package androidx.compose.p002ui.graphics.vector;

import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9 */
/* compiled from: VectorCompose.kt */
final class VectorComposeKt$Group$2$9 extends C12777p implements C13088o<GroupComponent, List<? extends PathNode>, C11921v> {
    public static final VectorComposeKt$Group$2$9 INSTANCE = new VectorComposeKt$Group$2$9();

    VectorComposeKt$Group$2$9() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((GroupComponent) obj, (List<? extends PathNode>) (List) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(GroupComponent groupComponent, List<? extends PathNode> list) {
        C12775o.m28639i(groupComponent, "$this$set");
        C12775o.m28639i(list, "it");
        groupComponent.setClipPathData(list);
    }
}
