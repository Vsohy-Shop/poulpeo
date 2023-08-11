package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,455:1\n50#2:456\n49#2:457\n1114#3,6:458\n154#4:464\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n71#1:456\n71#1:457\n71#1:458,6\n408#1:464\n*E\n"})
/* compiled from: PagerState.kt */
public final class PagerStateKt {
    private static final boolean DEBUG = false;
    private static final float DefaultPositionThreshold = C1232Dp.m38468constructorimpl((float) 56);
    /* access modifiers changed from: private */
    public static final PagerStateKt$EmptyInteractionSources$1 EmptyInteractionSources = new PagerStateKt$EmptyInteractionSources$1();
    /* access modifiers changed from: private */
    public static final PagerStateKt$EmptyLayoutInfo$1 EmptyLayoutInfo = new PagerStateKt$EmptyLayoutInfo$1();
    private static final float MaxPageOffset = 0.5f;
    private static final int MaxPagesForAnimateScroll = 3;
    private static final float MinPageOffset = -0.5f;
    private static final C13089p<Density, Float, Float, Float> SnapAlignmentStartToStart = PagerStateKt$SnapAlignmentStartToStart$1.INSTANCE;
    /* access modifiers changed from: private */
    public static final PagerStateKt$UnitDensity$1 UnitDensity = new PagerStateKt$UnitDensity$1();

    public static final Object animateToNextPage(PagerState pagerState, C12074d<? super C11921v> dVar) {
        if (pagerState.getCurrentPage() + 1 >= pagerState.getPageCount$foundation_release()) {
            return C11921v.f18618a;
        }
        Object animateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, (AnimationSpec) null, dVar, 6, (Object) null);
        if (animateScrollToPage$default == C12150d.m26492c()) {
            return animateScrollToPage$default;
        }
        return C11921v.f18618a;
    }

    public static final Object animateToPreviousPage(PagerState pagerState, C12074d<? super C11921v> dVar) {
        if (pagerState.getCurrentPage() - 1 < 0) {
            return C11921v.f18618a;
        }
        Object animateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() - 1, 0.0f, (AnimationSpec) null, dVar, 6, (Object) null);
        if (animateScrollToPage$default == C12150d.m26492c()) {
            return animateScrollToPage$default;
        }
        return C11921v.f18618a;
    }

    public static final float getDefaultPositionThreshold() {
        return DefaultPositionThreshold;
    }

    public static final C13089p<Density, Float, Float, Float> getSnapAlignmentStartToStart() {
        return SnapAlignmentStartToStart;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: of.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.pager.PagerState rememberPagerState(int r10, float r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            r0 = 144687223(0x89fc077, float:9.614713E-34)
            r12.startReplaceableGroup(r0)
            r1 = r14 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000c
            r10 = r2
        L_0x000c:
            r14 = r14 & 2
            if (r14 == 0) goto L_0x0011
            r11 = 0
        L_0x0011:
            boolean r14 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r14 == 0) goto L_0x001d
            r14 = -1
            java.lang.String r1 = "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:66)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r13, r14, r1)
        L_0x001d:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            androidx.compose.foundation.pager.PagerState$Companion r13 = androidx.compose.foundation.pager.PagerState.Companion
            androidx.compose.runtime.saveable.Saver r4 = r13.getSaver()
            r5 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            java.lang.Float r14 = java.lang.Float.valueOf(r11)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.startReplaceableGroup(r0)
            boolean r13 = r12.changed((java.lang.Object) r13)
            boolean r14 = r12.changed((java.lang.Object) r14)
            r13 = r13 | r14
            java.lang.Object r14 = r12.rememberedValue()
            if (r13 != 0) goto L_0x004b
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r13 = r13.getEmpty()
            if (r14 != r13) goto L_0x0053
        L_0x004b:
            androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1 r14 = new androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1
            r14.<init>(r10, r11)
            r12.updateRememberedValue(r14)
        L_0x0053:
            r12.endReplaceableGroup()
            r6 = r14
            of.a r6 = (p404of.C13074a) r6
            r8 = 72
            r9 = 4
            r7 = r12
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r3, r4, (java.lang.String) r5, r6, (androidx.compose.runtime.Composer) r7, (int) r8, (int) r9)
            androidx.compose.foundation.pager.PagerState r10 = (androidx.compose.foundation.pager.PagerState) r10
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x006c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x006c:
            r12.endReplaceableGroup()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerStateKt.rememberPagerState(int, float, androidx.compose.runtime.Composer, int, int):androidx.compose.foundation.pager.PagerState");
    }

    private static final void debugLog(C13074a<String> aVar) {
    }
}
