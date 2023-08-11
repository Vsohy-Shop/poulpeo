package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12760f0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt$boxMeasurePolicy$1$measure$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,287:1\n13644#2,3:288\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt$boxMeasurePolicy$1$measure$5\n*L\n164#1:288,3\n*E\n"})
/* compiled from: Box.kt */
final class BoxKt$boxMeasurePolicy$1$measure$5 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ C12760f0 $boxHeight;
    final /* synthetic */ C12760f0 $boxWidth;
    final /* synthetic */ List<Measurable> $measurables;
    final /* synthetic */ Placeable[] $placeables;
    final /* synthetic */ MeasureScope $this_MeasurePolicy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BoxKt$boxMeasurePolicy$1$measure$5(Placeable[] placeableArr, List<? extends Measurable> list, MeasureScope measureScope, C12760f0 f0Var, C12760f0 f0Var2, Alignment alignment) {
        super(1);
        this.$placeables = placeableArr;
        this.$measurables = list;
        this.$this_MeasurePolicy = measureScope;
        this.$boxWidth = f0Var;
        this.$boxHeight = f0Var2;
        this.$alignment = alignment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable[] placeableArr = this.$placeables;
        List<Measurable> list = this.$measurables;
        MeasureScope measureScope = this.$this_MeasurePolicy;
        C12760f0 f0Var = this.$boxWidth;
        C12760f0 f0Var2 = this.$boxHeight;
        Alignment alignment = this.$alignment;
        int length = placeableArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            Placeable placeable = placeableArr[i2];
            C12775o.m28637g(placeable, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            BoxKt.placeInBox(placementScope, placeable, list.get(i), measureScope.getLayoutDirection(), f0Var.f20416b, f0Var2.f20416b, alignment);
            i2++;
            i++;
        }
    }
}
