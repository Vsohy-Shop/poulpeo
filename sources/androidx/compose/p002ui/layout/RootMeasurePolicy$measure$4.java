package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nRootMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy$measure$4\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,67:1\n33#2,6:68\n*S KotlinDebug\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy$measure$4\n*L\n60#1:68,6\n*E\n"})
/* renamed from: androidx.compose.ui.layout.RootMeasurePolicy$measure$4 */
/* compiled from: RootMeasurePolicy.kt */
final class RootMeasurePolicy$measure$4 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ List<Placeable> $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RootMeasurePolicy$measure$4(List<? extends Placeable> list) {
        super(1);
        this.$placeables = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        List<Placeable> list = this.$placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, list.get(i), 0, 0, 0.0f, (Function1) null, 12, (Object) null);
        }
    }
}
