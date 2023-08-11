package androidx.compose.material3;

import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.layout.SubcomposeMeasureScope;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: TabRow.kt */
final class TabRowKt$TabRow$2$1$1 extends C12777p implements C13088o<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $divider;
    final /* synthetic */ C13089p<List<TabPosition>, Composer, Integer, C11921v> $indicator;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $tabs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TabRowKt$TabRow$2$1$1(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13089p<? super List<TabPosition>, ? super Composer, ? super Integer, C11921v> pVar, int i) {
        super(2);
        this.$tabs = oVar;
        this.$divider = oVar2;
        this.$indicator = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m34642invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m38418unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m34642invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        C12775o.m28639i(subcomposeMeasureScope2, "$this$SubcomposeLayout");
        int r14 = Constraints.m38412getMaxWidthimpl(j);
        List<Measurable> subcompose = subcomposeMeasureScope2.subcompose(TabSlots.Tabs, this.$tabs);
        int size = subcompose.size();
        int i = r14 / size;
        Iterable<Measurable> iterable = subcompose;
        int i2 = 0;
        for (Measurable maxIntrinsicHeight : iterable) {
            i2 = Math.max(maxIntrinsicHeight.maxIntrinsicHeight(i), i2);
        }
        ArrayList arrayList = new ArrayList(C12728x.m28544v(iterable, 10));
        for (Measurable r9 : iterable) {
            int i3 = r14;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(r9.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, i, i, i2, 0, 8, (Object) null)));
            arrayList = arrayList2;
            r14 = i3;
        }
        int i4 = r14;
        ArrayList arrayList3 = arrayList;
        final ArrayList arrayList4 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList4.add(new TabPosition(C1232Dp.m38468constructorimpl(subcomposeMeasureScope2.m38446toDpu2uoSUM(i) * ((float) i5)), subcomposeMeasureScope2.m38446toDpu2uoSUM(i), (DefaultConstructorMarker) null));
        }
        final C13088o<Composer, Integer, C11921v> oVar = this.$divider;
        final C13089p<List<TabPosition>, Composer, Integer, C11921v> pVar = this.$indicator;
        final ArrayList arrayList5 = arrayList3;
        final SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
        final int i6 = i;
        final long j2 = j;
        final int i7 = i2;
        final int i8 = this.$$dirty;
        final int i9 = i4;
        return MeasureScope.layout$default(subcomposeMeasureScope, i4, i2, (Map) null, new Function1<Placeable.PlacementScope, C11921v>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C11921v.f18618a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                C12775o.m28639i(placementScope, "$this$layout");
                int i = i6;
                int i2 = 0;
                for (Object next : arrayList5) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C12726w.m28534u();
                    }
                    int i4 = i2 * i;
                    Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) next, i4, 0, 0.0f, 4, (Object) null);
                    i2 = i3;
                }
                long j = j2;
                int i5 = i7;
                for (Measurable r2 : subcomposeMeasureScope3.subcompose(TabSlots.Divider, oVar)) {
                    Placeable r3 = r2.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 11, (Object) null));
                    Placeable.PlacementScope.placeRelative$default(placementScope, r3, 0, i5 - r3.getHeight(), 0.0f, 4, (Object) null);
                    i5 = i5;
                    j = j;
                }
                SubcomposeMeasureScope subcomposeMeasureScope = subcomposeMeasureScope3;
                TabSlots tabSlots = TabSlots.Indicator;
                final C13089p<List<TabPosition>, Composer, Integer, C11921v> pVar = pVar;
                final List<TabPosition> list = arrayList4;
                final int i6 = i8;
                int i7 = i9;
                int i8 = i7;
                for (Measurable r22 : subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-976887453, true, new C13088o<Composer, Integer, C11921v>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return C11921v.f18618a;
                    }

                    @Composable
                    public final void invoke(Composer composer, int i) {
                        if ((i & 11) != 2 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-976887453, i, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                            }
                            pVar.invoke(list, composer, Integer.valueOf(((i6 >> 9) & 112) | 8));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer.skipToGroupEnd();
                    }
                }))) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, r22.m37365measureBRTryo0(Constraints.Companion.m38420fixedJhjzzOo(i7, i8)), 0, 0, 0.0f, 4, (Object) null);
                }
            }
        }, 4, (Object) null);
    }
}
