package androidx.compose.foundation.layout;

import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,674:1\n76#2:675\n155#3:676\n155#3:677\n155#3:678\n155#3:679\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n*L\n243#1:675\n276#1:676\n277#1:677\n278#1:678\n279#1:679\n*E\n"})
/* compiled from: WindowInsets.kt */
public final class WindowInsetsKt {
    public static final WindowInsets WindowInsets(int i, int i2, int i3, int i4) {
        return new FixedIntInsets(i, i2, i3, i4);
    }

    public static /* synthetic */ WindowInsets WindowInsets$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return WindowInsets(i, i2, i3, i4);
    }

    /* renamed from: WindowInsets-a9UjIt4  reason: not valid java name */
    public static final WindowInsets m33356WindowInsetsa9UjIt4(float f, float f2, float f3, float f4) {
        return new FixedDpInsets(f, f2, f3, f4, (DefaultConstructorMarker) null);
    }

    /* renamed from: WindowInsets-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ WindowInsets m33357WindowInsetsa9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return m33356WindowInsetsa9UjIt4(f, f2, f3, f4);
    }

    public static final WindowInsets add(WindowInsets windowInsets, WindowInsets windowInsets2) {
        C12775o.m28639i(windowInsets, "<this>");
        C12775o.m28639i(windowInsets2, "insets");
        return new AddedInsets(windowInsets, windowInsets2);
    }

    public static final WindowInsets asInsets(PaddingValues paddingValues) {
        C12775o.m28639i(paddingValues, "<this>");
        return new PaddingValuesInsets(paddingValues);
    }

    @ReadOnlyComposable
    @Composable
    public static final PaddingValues asPaddingValues(WindowInsets windowInsets, Composer composer, int i) {
        C12775o.m28639i(windowInsets, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485016250, i, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:242)");
        }
        InsetsPaddingValues insetsPaddingValues = new InsetsPaddingValues(windowInsets, (Density) composer.consume(CompositionLocalsKt.getLocalDensity()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return insetsPaddingValues;
    }

    public static final WindowInsets exclude(WindowInsets windowInsets, WindowInsets windowInsets2) {
        C12775o.m28639i(windowInsets, "<this>");
        C12775o.m28639i(windowInsets2, "insets");
        return new ExcludeInsets(windowInsets, windowInsets2);
    }

    /* renamed from: only-bOOhFvg  reason: not valid java name */
    public static final WindowInsets m33358onlybOOhFvg(WindowInsets windowInsets, int i) {
        C12775o.m28639i(windowInsets, "$this$only");
        return new LimitInsets(windowInsets, i, (DefaultConstructorMarker) null);
    }

    public static final WindowInsets union(WindowInsets windowInsets, WindowInsets windowInsets2) {
        C12775o.m28639i(windowInsets, "<this>");
        C12775o.m28639i(windowInsets2, "insets");
        return new UnionInsets(windowInsets, windowInsets2);
    }

    public static final PaddingValues asPaddingValues(WindowInsets windowInsets, Density density) {
        C12775o.m28639i(windowInsets, "<this>");
        C12775o.m28639i(density, "density");
        return new InsetsPaddingValues(windowInsets, density);
    }
}
