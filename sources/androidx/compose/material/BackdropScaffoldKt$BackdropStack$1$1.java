package androidx.compose.material;

import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.layout.SubcomposeMeasureScope;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;

@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropStack$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,522:1\n151#2,3:523\n33#2,4:526\n154#2,2:530\n38#2:532\n156#2:533\n33#2,6:534\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropStack$1$1\n*L\n468#1:523,3\n468#1:526,4\n468#1:530,2\n468#1:532\n468#1:533\n472#1:534,6\n*E\n"})
/* compiled from: BackdropScaffold.kt */
final class BackdropScaffoldKt$BackdropStack$1$1 extends C12777p implements C13088o<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $backLayer;
    final /* synthetic */ Function1<Constraints, Constraints> $calculateBackLayerConstraints;
    final /* synthetic */ C13090q<Constraints, Float, Composer, Integer, C11921v> $frontLayer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BackdropScaffoldKt$BackdropStack$1$1(C13088o<? super Composer, ? super Integer, C11921v> oVar, Function1<? super Constraints, Constraints> function1, C13090q<? super Constraints, ? super Float, ? super Composer, ? super Integer, C11921v> qVar, int i) {
        super(2);
        this.$backLayer = oVar;
        this.$calculateBackLayerConstraints = function1;
        this.$frontLayer = qVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m33889invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m38418unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m33889invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
        C12775o.m28639i(subcomposeMeasureScope, "$this$SubcomposeLayout");
        final Placeable r0 = ((Measurable) C12686e0.m28221Z(subcomposeMeasureScope.subcompose(BackdropLayers.Back, this.$backLayer))).m37365measureBRTryo0(this.$calculateBackLayerConstraints.invoke(Constraints.m38400boximpl(j)).m38418unboximpl());
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(BackdropLayers.Front, ComposableLambdaKt.composableLambdaInstance(-1222642649, true, new BackdropScaffoldKt$BackdropStack$1$1$placeables$1(this.$frontLayer, j, (float) r0.getHeight(), this.$$dirty)));
        final ArrayList arrayList = new ArrayList(subcompose.size());
        int size = subcompose.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(subcompose.get(i).m37365measureBRTryo0(j));
        }
        int max = Math.max(Constraints.m38414getMinWidthimpl(j), r0.getWidth());
        int max2 = Math.max(Constraints.m38413getMinHeightimpl(j), r0.getHeight());
        int size2 = arrayList.size();
        int i2 = max2;
        int i3 = max;
        for (int i4 = 0; i4 < size2; i4++) {
            Placeable placeable = (Placeable) arrayList.get(i4);
            i3 = Math.max(i3, placeable.getWidth());
            i2 = Math.max(i2, placeable.getHeight());
        }
        return MeasureScope.layout$default(subcomposeMeasureScope, i3, i2, (Map) null, new Function1<Placeable.PlacementScope, C11921v>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C11921v.f18618a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                C12775o.m28639i(placementScope, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(placementScope, r0, 0, 0, 0.0f, 4, (Object) null);
                List<Placeable> list = arrayList;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i), 0, 0, 0.0f, 4, (Object) null);
                }
            }
        }, 4, (Object) null);
    }
}
