package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,157:1\n83#2,3:158\n1114#3,6:161\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n*L\n47#1:158,3\n47#1:161,6\n*E\n"})
/* compiled from: LazyStaggeredGridMeasurePolicy.kt */
public final class LazyStaggeredGridMeasurePolicyKt {

    /* compiled from: LazyStaggeredGridMeasurePolicy.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.foundation.gestures.Orientation[] r0 = androidx.compose.foundation.gestures.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.WhenMappings.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final float afterPadding(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            } else if (z) {
                return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            } else {
                return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            }
        } else if (z) {
            return paddingValues.m33281calculateTopPaddingD9Ej5fM();
        } else {
            return paddingValues.m33278calculateBottomPaddingD9Ej5fM();
        }
    }

    /* access modifiers changed from: private */
    public static final float beforePadding(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            } else if (z) {
                return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            } else {
                return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            }
        } else if (z) {
            return paddingValues.m33278calculateBottomPaddingD9Ej5fM();
        } else {
            return paddingValues.m33281calculateTopPaddingD9Ej5fM();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007c, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x007e;
     */
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.Composable
    /* renamed from: rememberStaggeredGridMeasurePolicy-nbWgWpA  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p404of.C13088o<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p002ui.unit.Constraints, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult> m33560rememberStaggeredGridMeasurePolicynbWgWpA(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r11, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r12, androidx.compose.foundation.layout.PaddingValues r13, boolean r14, androidx.compose.foundation.gestures.Orientation r15, float r16, float r17, p404of.C13088o<? super androidx.compose.p002ui.unit.Density, ? super androidx.compose.p002ui.unit.Constraints, int[]> r18, androidx.compose.runtime.Composer r19, int r20) {
        /*
            r3 = r11
            r4 = r12
            r5 = r13
            r1 = r15
            r2 = r18
            r9 = r19
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.String r0 = "itemProvider"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "contentPadding"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "slotSizesSums"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            r0 = 1305398815(0x4dcece1f, float:4.33701856E8)
            r9.startReplaceableGroup(r0)
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L_0x0035
            r6 = -1
            java.lang.String r7 = "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:37)"
            r8 = r20
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r8, r6, r7)
        L_0x0035:
            r0 = 8
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r7 = 0
            r6[r7] = r3
            r8 = 1
            r6[r8] = r4
            r8 = 2
            r6[r8] = r5
            r8 = 3
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r14)
            r6[r8] = r10
            r8 = 4
            r6[r8] = r1
            r8 = 5
            androidx.compose.ui.unit.Dp r10 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r16)
            r6[r8] = r10
            r8 = 6
            androidx.compose.ui.unit.Dp r10 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r17)
            r6[r8] = r10
            r8 = 7
            r6[r8] = r2
            r8 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r9.startReplaceableGroup(r8)
            r8 = r7
        L_0x0064:
            if (r7 >= r0) goto L_0x0070
            r10 = r6[r7]
            boolean r10 = r9.changed((java.lang.Object) r10)
            r8 = r8 | r10
            int r7 = r7 + 1
            goto L_0x0064
        L_0x0070:
            java.lang.Object r0 = r19.rememberedValue()
            if (r8 != 0) goto L_0x007e
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r0 != r6) goto L_0x0092
        L_0x007e:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1 r10 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
            r0 = r10
            r1 = r15
            r2 = r18
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r16
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.updateRememberedValue(r10)
        L_0x0092:
            r19.endReplaceableGroup()
            of.o r0 = (p404of.C13088o) r0
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00a0
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00a0:
            r19.endReplaceableGroup()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.m33560rememberStaggeredGridMeasurePolicynbWgWpA(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.gestures.Orientation, float, float, of.o, androidx.compose.runtime.Composer, int):of.o");
    }

    /* access modifiers changed from: private */
    public static final float startPadding(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        if (i == 2) {
            return paddingValues.m33281calculateTopPaddingD9Ej5fM();
        }
        throw new NoWhenBranchMatchedException();
    }
}
