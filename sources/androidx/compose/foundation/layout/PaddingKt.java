package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n135#2:437\n135#2:442\n135#2:445\n135#2:446\n135#2:447\n155#3:438\n155#3:439\n155#3:440\n155#3:441\n155#3:443\n155#3:444\n155#3:448\n155#3:449\n155#3:450\n155#3:451\n155#3:452\n155#3:453\n155#3:454\n155#3:455\n155#3:456\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n62#1:437\n95#1:442\n123#1:445\n146#1:446\n178#1:447\n51#1:438\n52#1:439\n53#1:440\n54#1:441\n86#1:443\n87#1:444\n167#1:448\n168#1:449\n169#1:450\n170#1:451\n286#1:452\n296#1:453\n297#1:454\n298#1:455\n299#1:456\n*E\n"})
/* compiled from: Padding.kt */
public final class PaddingKt {
    @Stable
    /* renamed from: PaddingValues-0680j_4  reason: not valid java name */
    public static final PaddingValues m33261PaddingValues0680j_4(float f) {
        return new PaddingValuesImpl(f, f, f, f, (DefaultConstructorMarker) null);
    }

    @Stable
    /* renamed from: PaddingValues-YgX7TsA  reason: not valid java name */
    public static final PaddingValues m33262PaddingValuesYgX7TsA(float f, float f2) {
        return new PaddingValuesImpl(f, f2, f, f2, (DefaultConstructorMarker) null);
    }

    /* renamed from: PaddingValues-YgX7TsA$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m33263PaddingValuesYgX7TsA$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.m38468constructorimpl((float) 0);
        }
        return m33262PaddingValuesYgX7TsA(f, f2);
    }

    @Stable
    /* renamed from: PaddingValues-a9UjIt4  reason: not valid java name */
    public static final PaddingValues m33264PaddingValuesa9UjIt4(float f, float f2, float f3, float f4) {
        return new PaddingValuesImpl(f, f2, f3, f4, (DefaultConstructorMarker) null);
    }

    /* renamed from: PaddingValues-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m33265PaddingValuesa9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 4) != 0) {
            f3 = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 8) != 0) {
            f4 = C1232Dp.m38468constructorimpl((float) 0);
        }
        return m33264PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    @Stable
    /* renamed from: absolutePadding-qDBjuR0  reason: not valid java name */
    public static final Modifier m33266absolutePaddingqDBjuR0(Modifier modifier, float f, float f2, float f3, float f4) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$absolutePadding");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new PaddingKt$absolutePaddingqDBjuR0$$inlined$debugInspectorInfo$1(f, f2, f3, f4);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new PaddingModifier(f, f2, f3, f4, false, function1, (DefaultConstructorMarker) null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33267absolutePaddingqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 4) != 0) {
            f3 = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 8) != 0) {
            f4 = C1232Dp.m38468constructorimpl((float) 0);
        }
        return m33266absolutePaddingqDBjuR0(modifier, f, f2, f3, f4);
    }

    @Stable
    public static final float calculateEndPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        C12775o.m28639i(paddingValues, "<this>");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.m33280calculateRightPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.m33279calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final float calculateStartPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        C12775o.m28639i(paddingValues, "<this>");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.m33279calculateLeftPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.m33280calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final Modifier padding(Modifier modifier, PaddingValues paddingValues) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(paddingValues, "paddingValues");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new PaddingKt$padding$$inlined$debugInspectorInfo$1(paddingValues);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new PaddingValuesModifier(paddingValues, function1));
    }

    @Stable
    /* renamed from: padding-3ABfNKs  reason: not valid java name */
    public static final Modifier m33268padding3ABfNKs(Modifier modifier, float f) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$padding");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new PaddingKt$padding3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new PaddingModifier(f, f, f, f, true, function1, (DefaultConstructorMarker) null));
    }

    @Stable
    /* renamed from: padding-VpY3zN4  reason: not valid java name */
    public static final Modifier m33269paddingVpY3zN4(Modifier modifier, float f, float f2) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$padding");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new PaddingKt$paddingVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new PaddingModifier(f, f2, f, f2, true, function1, (DefaultConstructorMarker) null));
    }

    /* renamed from: padding-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33270paddingVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.m38468constructorimpl((float) 0);
        }
        return m33269paddingVpY3zN4(modifier, f, f2);
    }

    @Stable
    /* renamed from: padding-qDBjuR0  reason: not valid java name */
    public static final Modifier m33271paddingqDBjuR0(Modifier modifier, float f, float f2, float f3, float f4) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$padding");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new PaddingKt$paddingqDBjuR0$$inlined$debugInspectorInfo$1(f, f2, f3, f4);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new PaddingModifier(f, f2, f3, f4, true, function1, (DefaultConstructorMarker) null));
    }

    /* renamed from: padding-qDBjuR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33272paddingqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 4) != 0) {
            f3 = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 8) != 0) {
            f4 = C1232Dp.m38468constructorimpl((float) 0);
        }
        return m33271paddingqDBjuR0(modifier, f, f2, f3, f4);
    }
}
