package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.layout.SubcomposeMeasureScope;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Scaffold.kt */
final class ScaffoldKt$ScaffoldLayout$1$1 extends C12777p implements C13088o<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $bottomBar;
    final /* synthetic */ C13089p<PaddingValues, Composer, Integer, C11921v> $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $snackbar;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScaffoldKt$ScaffoldLayout$1$1(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, int i, WindowInsets windowInsets, C13088o<? super Composer, ? super Integer, C11921v> oVar4, int i2, C13089p<? super PaddingValues, ? super Composer, ? super Integer, C11921v> pVar) {
        super(2);
        this.$topBar = oVar;
        this.$snackbar = oVar2;
        this.$fab = oVar3;
        this.$fabPosition = i;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = oVar4;
        this.$$dirty = i2;
        this.$content = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m34558invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m38418unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m34558invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
        C12775o.m28639i(subcomposeMeasureScope, "$this$SubcomposeLayout");
        int r1 = Constraints.m38412getMaxWidthimpl(j);
        int r16 = Constraints.m38411getMaxHeightimpl(j);
        final long r10 = Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 10, (Object) null);
        final C13088o<Composer, Integer, C11921v> oVar = this.$topBar;
        final C13088o<Composer, Integer, C11921v> oVar2 = this.$snackbar;
        final C13088o<Composer, Integer, C11921v> oVar3 = this.$fab;
        final int i = this.$fabPosition;
        final WindowInsets windowInsets = this.$contentWindowInsets;
        final C13088o<Composer, Integer, C11921v> oVar4 = this.$bottomBar;
        final int i2 = this.$$dirty;
        final C13089p<PaddingValues, Composer, Integer, C11921v> pVar = this.$content;
        final SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        final int i3 = r1;
        final int i4 = r16;
        return MeasureScope.layout$default(subcomposeMeasureScope, r1, r16, (Map) null, new Function1<Placeable.PlacementScope, C11921v>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C11921v.f18618a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Object obj;
                Object obj2;
                Object obj3;
                FabPlacement fabPlacement;
                Object obj4;
                Integer num;
                int i;
                int i2;
                Object obj5;
                Object obj6;
                int i3;
                C12775o.m28639i(placementScope, "$this$layout");
                Iterable<Measurable> subcompose = subcomposeMeasureScope2.subcompose(ScaffoldLayoutContent.TopBar, oVar);
                long j = r10;
                ArrayList<Placeable> arrayList = new ArrayList<>(C12728x.m28544v(subcompose, 10));
                for (Measurable r5 : subcompose) {
                    arrayList.add(r5.m37365measureBRTryo0(j));
                }
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    obj = null;
                } else {
                    obj = it.next();
                    if (it.hasNext()) {
                        int height = ((Placeable) obj).getHeight();
                        do {
                            Object next = it.next();
                            int height2 = ((Placeable) next).getHeight();
                            if (height < height2) {
                                obj = next;
                                height = height2;
                            }
                        } while (it.hasNext());
                    }
                }
                Placeable placeable = (Placeable) obj;
                int height3 = placeable != null ? placeable.getHeight() : 0;
                Iterable<Measurable> subcompose2 = subcomposeMeasureScope2.subcompose(ScaffoldLayoutContent.Snackbar, oVar2);
                WindowInsets windowInsets = windowInsets;
                SubcomposeMeasureScope subcomposeMeasureScope = subcomposeMeasureScope2;
                long j2 = r10;
                ArrayList arrayList2 = new ArrayList(C12728x.m28544v(subcompose2, 10));
                for (Measurable r10 : subcompose2) {
                    arrayList2.add(r10.m37365measureBRTryo0(ConstraintsKt.m38428offsetNN6EwU(j2, (-windowInsets.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.getBottom(subcomposeMeasureScope))));
                }
                Iterator it2 = arrayList2.iterator();
                if (!it2.hasNext()) {
                    obj2 = null;
                } else {
                    obj2 = it2.next();
                    if (it2.hasNext()) {
                        int height4 = ((Placeable) obj2).getHeight();
                        do {
                            Object next2 = it2.next();
                            int height5 = ((Placeable) next2).getHeight();
                            if (height4 < height5) {
                                obj2 = next2;
                                height4 = height5;
                            }
                        } while (it2.hasNext());
                    }
                }
                Placeable placeable2 = (Placeable) obj2;
                int height6 = placeable2 != null ? placeable2.getHeight() : 0;
                Iterator it3 = arrayList2.iterator();
                if (!it3.hasNext()) {
                    obj3 = null;
                } else {
                    obj3 = it3.next();
                    if (it3.hasNext()) {
                        int width = ((Placeable) obj3).getWidth();
                        while (true) {
                            Object next3 = it3.next();
                            int width2 = ((Placeable) next3).getWidth();
                            if (width < width2) {
                                obj3 = next3;
                                width = width2;
                            }
                            if (!it3.hasNext()) {
                                break;
                            }
                        }
                    }
                }
                Placeable placeable3 = (Placeable) obj3;
                int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                WindowInsets windowInsets2 = windowInsets;
                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope2;
                long j3 = r10;
                ArrayList arrayList3 = new ArrayList();
                for (Measurable r12 : subcomposeMeasureScope2.subcompose(ScaffoldLayoutContent.Fab, oVar3)) {
                    Placeable r3 = r12.m37365measureBRTryo0(ConstraintsKt.m38428offsetNN6EwU(j3, (-windowInsets2.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection())) - windowInsets2.getRight(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection()), -windowInsets2.getBottom(subcomposeMeasureScope2)));
                    if (!((r3.getHeight() == 0 || r3.getWidth() == 0) ? false : true)) {
                        r3 = null;
                    }
                    if (r3 != null) {
                        arrayList3.add(r3);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    Iterator it4 = arrayList3.iterator();
                    if (!it4.hasNext()) {
                        obj5 = null;
                    } else {
                        obj5 = it4.next();
                        if (it4.hasNext()) {
                            int width4 = ((Placeable) obj5).getWidth();
                            do {
                                Object next4 = it4.next();
                                int width5 = ((Placeable) next4).getWidth();
                                if (width4 < width5) {
                                    obj5 = next4;
                                    width4 = width5;
                                }
                            } while (it4.hasNext());
                        }
                    }
                    C12775o.m28636f(obj5);
                    int width6 = ((Placeable) obj5).getWidth();
                    Iterator it5 = arrayList3.iterator();
                    if (!it5.hasNext()) {
                        obj6 = null;
                    } else {
                        obj6 = it5.next();
                        if (it5.hasNext()) {
                            int height7 = ((Placeable) obj6).getHeight();
                            do {
                                Object next5 = it5.next();
                                int height8 = ((Placeable) next5).getHeight();
                                if (height7 < height8) {
                                    obj6 = next5;
                                    height7 = height8;
                                }
                            } while (it5.hasNext());
                        }
                    }
                    C12775o.m28636f(obj6);
                    int height9 = ((Placeable) obj6).getHeight();
                    if (!FabPosition.m34430equalsimpl0(i, FabPosition.Companion.m34435getEndERTFSPs())) {
                        i3 = (i3 - width6) / 2;
                    } else if (subcomposeMeasureScope2.getLayoutDirection() == LayoutDirection.Ltr) {
                        i3 = (i3 - subcomposeMeasureScope2.m38443roundToPx0680j_4(ScaffoldKt.FabSpacing)) - width6;
                    } else {
                        i3 = subcomposeMeasureScope2.m38443roundToPx0680j_4(ScaffoldKt.FabSpacing);
                    }
                    fabPlacement = new FabPlacement(i3, width6, height9);
                } else {
                    fabPlacement = null;
                }
                Iterable<Measurable> subcompose3 = subcomposeMeasureScope2.subcompose(ScaffoldLayoutContent.BottomBar, ComposableLambdaKt.composableLambdaInstance(-1455477816, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1(fabPlacement, oVar4, i2)));
                long j4 = r10;
                ArrayList arrayList4 = new ArrayList(C12728x.m28544v(subcompose3, 10));
                for (Measurable r102 : subcompose3) {
                    arrayList4.add(r102.m37365measureBRTryo0(j4));
                }
                Iterator it6 = arrayList4.iterator();
                if (!it6.hasNext()) {
                    obj4 = null;
                } else {
                    obj4 = it6.next();
                    if (it6.hasNext()) {
                        int height10 = ((Placeable) obj4).getHeight();
                        while (true) {
                            Object next6 = it6.next();
                            int height11 = ((Placeable) next6).getHeight();
                            if (height10 < height11) {
                                obj4 = next6;
                                height10 = height11;
                            }
                            if (!it6.hasNext()) {
                                break;
                            }
                            ArrayList arrayList5 = arrayList2;
                            ArrayList arrayList6 = arrayList3;
                            arrayList2 = arrayList5;
                        }
                    }
                }
                Placeable placeable4 = (Placeable) obj4;
                Integer valueOf = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
                if (fabPlacement != null) {
                    SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope2;
                    WindowInsets windowInsets3 = windowInsets;
                    if (valueOf == null) {
                        i2 = fabPlacement.getHeight() + subcomposeMeasureScope3.m38443roundToPx0680j_4(ScaffoldKt.FabSpacing) + windowInsets3.getBottom(subcomposeMeasureScope3);
                    } else {
                        i2 = valueOf.intValue() + fabPlacement.getHeight() + subcomposeMeasureScope3.m38443roundToPx0680j_4(ScaffoldKt.FabSpacing);
                    }
                    num = Integer.valueOf(i2);
                } else {
                    num = null;
                }
                if (height6 != 0) {
                    i = height6 + (num != null ? num.intValue() : valueOf != null ? valueOf.intValue() : windowInsets.getBottom(subcomposeMeasureScope2));
                } else {
                    i = 0;
                }
                SubcomposeMeasureScope subcomposeMeasureScope4 = subcomposeMeasureScope2;
                ArrayList arrayList7 = arrayList3;
                ArrayList<Placeable> arrayList8 = arrayList2;
                Iterable<Measurable> subcompose4 = subcomposeMeasureScope4.subcompose(ScaffoldLayoutContent.MainContent, ComposableLambdaKt.composableLambdaInstance(1643221465, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(windowInsets, subcomposeMeasureScope4, arrayList, height3, arrayList4, valueOf, pVar, i2)));
                long j5 = r10;
                ArrayList<Placeable> arrayList9 = new ArrayList<>(C12728x.m28544v(subcompose4, 10));
                for (Measurable r7 : subcompose4) {
                    arrayList9.add(r7.m37365measureBRTryo0(j5));
                }
                for (Placeable place$default : arrayList9) {
                    ArrayList arrayList10 = arrayList7;
                    Placeable.PlacementScope.place$default(placementScope, place$default, 0, 0, 0.0f, 4, (Object) null);
                    arrayList = arrayList;
                    arrayList4 = arrayList4;
                }
                ArrayList<Placeable> arrayList11 = arrayList4;
                ArrayList<Placeable> arrayList12 = arrayList7;
                for (Placeable place$default2 : arrayList) {
                    Placeable.PlacementScope.place$default(placementScope, place$default2, 0, 0, 0.0f, 4, (Object) null);
                }
                int i4 = i3;
                WindowInsets windowInsets4 = windowInsets;
                SubcomposeMeasureScope subcomposeMeasureScope5 = subcomposeMeasureScope2;
                int i5 = i4;
                for (Placeable place$default3 : arrayList8) {
                    Placeable.PlacementScope.place$default(placementScope, place$default3, windowInsets4.getLeft(subcomposeMeasureScope5, subcomposeMeasureScope5.getLayoutDirection()) + ((i4 - width3) / 2), i5 - i, 0.0f, 4, (Object) null);
                }
                int i6 = i4;
                for (Placeable place$default4 : arrayList11) {
                    Placeable.PlacementScope.place$default(placementScope, place$default4, 0, i6 - (valueOf != null ? valueOf.intValue() : 0), 0.0f, 4, (Object) null);
                }
                if (fabPlacement != null) {
                    int i7 = i4;
                    for (Placeable place$default5 : arrayList12) {
                        int left = fabPlacement.getLeft();
                        C12775o.m28636f(num);
                        Placeable.PlacementScope.place$default(placementScope, place$default5, left, i7 - num.intValue(), 0.0f, 4, (Object) null);
                    }
                    C11921v vVar = C11921v.f18618a;
                }
            }
        }, 4, (Object) null);
    }
}
