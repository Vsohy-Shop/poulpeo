package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p002ui.platform.AccessibilityManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.core.location.LocationRequestCompat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;

/* compiled from: SnackbarHost.kt */
public final class SnackbarHostKt {
    private static final int SnackbarFadeInMillis = 150;
    private static final int SnackbarFadeOutMillis = 75;
    private static final int SnackbarInBetweenDelayMillis = 0;

    /* compiled from: SnackbarHost.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            iArr[SnackbarDuration.Long.ordinal()] = 2;
            iArr[SnackbarDuration.Short.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void FadeInFadeOutWithScale(androidx.compose.material3.SnackbarData r18, androidx.compose.p002ui.Modifier r19, p404of.C13089p<? super androidx.compose.material3.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r1 = r18
            r3 = r20
            r4 = r22
            r0 = -1316639904(0xffffffffb185ab60, float:-3.8902925E-9)
            r2 = r21
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            r5 = r23 & 1
            if (r5 == 0) goto L_0x0016
            r5 = r4 | 6
            goto L_0x0026
        L_0x0016:
            r5 = r4 & 14
            if (r5 != 0) goto L_0x0025
            boolean r5 = r2.changed((java.lang.Object) r1)
            if (r5 == 0) goto L_0x0022
            r5 = 4
            goto L_0x0023
        L_0x0022:
            r5 = 2
        L_0x0023:
            r5 = r5 | r4
            goto L_0x0026
        L_0x0025:
            r5 = r4
        L_0x0026:
            r7 = r23 & 2
            if (r7 == 0) goto L_0x002d
            r5 = r5 | 48
            goto L_0x0040
        L_0x002d:
            r9 = r4 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0040
            r9 = r19
            boolean r10 = r2.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x003c
            r10 = 32
            goto L_0x003e
        L_0x003c:
            r10 = 16
        L_0x003e:
            r5 = r5 | r10
            goto L_0x0042
        L_0x0040:
            r9 = r19
        L_0x0042:
            r10 = r23 & 4
            if (r10 == 0) goto L_0x0049
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0059
        L_0x0049:
            r10 = r4 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0059
            boolean r10 = r2.changed((java.lang.Object) r3)
            if (r10 == 0) goto L_0x0056
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r5 = r5 | r10
        L_0x0059:
            r10 = r5 & 731(0x2db, float:1.024E-42)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x006c
            boolean r10 = r2.getSkipping()
            if (r10 != 0) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            r2.skipToGroupEnd()
            r7 = r9
            goto L_0x0268
        L_0x006c:
            if (r7 == 0) goto L_0x0071
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x0072
        L_0x0071:
            r7 = r9
        L_0x0072:
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r9 == 0) goto L_0x007e
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:340)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r5, r9, r10)
        L_0x007e:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.startReplaceableGroup(r0)
            java.lang.Object r0 = r2.rememberedValue()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r0 != r9) goto L_0x0098
            androidx.compose.material3.FadeInFadeOutState r0 = new androidx.compose.material3.FadeInFadeOutState
            r0.<init>()
            r2.updateRememberedValue(r0)
        L_0x0098:
            r2.endReplaceableGroup()
            androidx.compose.material3.FadeInFadeOutState r0 = (androidx.compose.material3.FadeInFadeOutState) r0
            java.lang.Object r9 = r0.getCurrent()
            boolean r9 = kotlin.jvm.internal.C12775o.m28634d(r1, r9)
            r10 = 1
            if (r9 != 0) goto L_0x011e
            r0.setCurrent(r1)
            java.util.List r9 = r0.getItems()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.collections.C12728x.m28544v(r9, r12)
            r11.<init>(r12)
            java.util.Iterator r9 = r9.iterator()
        L_0x00c0:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00d6
            java.lang.Object r12 = r9.next()
            androidx.compose.material3.FadeInFadeOutAnimationItem r12 = (androidx.compose.material3.FadeInFadeOutAnimationItem) r12
            java.lang.Object r12 = r12.getKey()
            androidx.compose.material3.SnackbarData r12 = (androidx.compose.material3.SnackbarData) r12
            r11.add(r12)
            goto L_0x00c0
        L_0x00d6:
            java.util.List r9 = kotlin.collections.C12686e0.m28207D0(r11)
            boolean r11 = r9.contains(r1)
            if (r11 != 0) goto L_0x00e3
            r9.add(r1)
        L_0x00e3:
            java.util.List r11 = r0.getItems()
            r11.clear()
            r11 = r9
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.List r11 = kotlin.collections.C12686e0.m28218W(r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.List r12 = r0.getItems()
            java.util.Collection r12 = (java.util.Collection) r12
            java.util.Iterator r11 = r11.iterator()
        L_0x00fd:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x011e
            java.lang.Object r13 = r11.next()
            androidx.compose.material3.SnackbarData r13 = (androidx.compose.material3.SnackbarData) r13
            androidx.compose.material3.FadeInFadeOutAnimationItem r14 = new androidx.compose.material3.FadeInFadeOutAnimationItem
            androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1 r15 = new androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1
            r15.<init>(r13, r1, r9, r0)
            r8 = 1365430839(0x5162d237, float:6.0886839E10)
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r8, r10, r15)
            r14.<init>(r13, r8)
            r12.add(r14)
            goto L_0x00fd
        L_0x011e:
            int r8 = r5 >> 3
            r8 = r8 & 14
            r9 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r9)
            androidx.compose.ui.Alignment$Companion r9 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r9 = r9.getTopStart()
            int r11 = r8 >> 3
            r12 = r11 & 14
            r11 = r11 & 112(0x70, float:1.57E-43)
            r11 = r11 | r12
            r12 = 0
            androidx.compose.ui.layout.MeasurePolicy r9 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r9, r12, r2, r11)
            int r11 = r8 << 3
            r11 = r11 & 112(0x70, float:1.57E-43)
            r13 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r13)
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r13 = r2.consume(r13)
            androidx.compose.ui.unit.Density r13 = (androidx.compose.p002ui.unit.Density) r13
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r14 = r2.consume(r14)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.p002ui.unit.LayoutDirection) r14
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r15 = r2.consume(r15)
            androidx.compose.ui.platform.ViewConfiguration r15 = (androidx.compose.p002ui.platform.ViewConfiguration) r15
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r10 = r16.getConstructor()
            of.p r12 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r7)
            int r11 = r11 << 9
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r17 = 6
            r11 = r11 | 6
            androidx.compose.runtime.Applier r6 = r2.getApplier()
            boolean r6 = r6 instanceof androidx.compose.runtime.Applier
            if (r6 != 0) goto L_0x017f
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x017f:
            r2.startReusableNode()
            boolean r6 = r2.getInserting()
            if (r6 == 0) goto L_0x018c
            r2.createNode(r10)
            goto L_0x018f
        L_0x018c:
            r2.useNode()
        L_0x018f:
            r2.disableReusing()
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.m35292constructorimpl(r2)
            of.o r10 = r16.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r9, r10)
            of.o r9 = r16.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r13, r9)
            of.o r9 = r16.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r14, r9)
            of.o r9 = r16.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r15, r9)
            r2.enableReusing()
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r6 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r6)
            int r9 = r11 >> 3
            r9 = r9 & 112(0x70, float:1.57E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.invoke(r6, r2, r9)
            r6 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r6)
            int r6 = r11 >> 9
            r6 = r6 & 14
            r9 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r2.startReplaceableGroup(r9)
            r6 = r6 & 11
            r9 = 2
            if (r6 != r9) goto L_0x01e8
            boolean r6 = r2.getSkipping()
            if (r6 != 0) goto L_0x01e4
            goto L_0x01e8
        L_0x01e4:
            r2.skipToGroupEnd()
            goto L_0x0250
        L_0x01e8:
            androidx.compose.foundation.layout.BoxScopeInstance r6 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            int r6 = r8 >> 6
            r6 = r6 & 112(0x70, float:1.57E-43)
            r6 = r6 | 6
            r8 = 393759974(0x17784ce6, float:8.023018E-25)
            r2.startReplaceableGroup(r8)
            r6 = r6 & 81
            r8 = 16
            if (r6 != r8) goto L_0x0207
            boolean r6 = r2.getSkipping()
            if (r6 != 0) goto L_0x0203
            goto L_0x0207
        L_0x0203:
            r2.skipToGroupEnd()
            goto L_0x024d
        L_0x0207:
            r6 = 0
            androidx.compose.runtime.RecomposeScope r6 = androidx.compose.runtime.ComposablesKt.getCurrentRecomposeScope(r2, r6)
            r0.setScope(r6)
            java.util.List r0 = r0.getItems()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0219:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x024d
            java.lang.Object r6 = r0.next()
            androidx.compose.material3.FadeInFadeOutAnimationItem r6 = (androidx.compose.material3.FadeInFadeOutAnimationItem) r6
            java.lang.Object r8 = r6.component1()
            androidx.compose.material3.SnackbarData r8 = (androidx.compose.material3.SnackbarData) r8
            of.p r6 = r6.component2()
            r9 = 870027402(0x33db908a, float:1.0224274E-7)
            r2.startMovableGroup(r9, r8)
            androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1 r9 = new androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
            r9.<init>(r3, r8, r5)
            r8 = -1462081411(0xffffffffa8da687d, float:-2.4248177E-14)
            r10 = 1
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r8, r10, r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r17)
            r6.invoke(r8, r2, r9)
            r2.endMovableGroup()
            goto L_0x0219
        L_0x024d:
            r2.endReplaceableGroup()
        L_0x0250:
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0268
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0268:
            androidx.compose.runtime.ScopeUpdateScope r6 = r2.endRestartGroup()
            if (r6 != 0) goto L_0x026f
            goto L_0x0281
        L_0x026f:
            androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$3 r8 = new androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$3
            r0 = r8
            r1 = r18
            r2 = r7
            r3 = r20
            r4 = r22
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r6.updateScope(r8)
        L_0x0281:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostKt.FadeInFadeOutWithScale(androidx.compose.material3.SnackbarData, androidx.compose.ui.Modifier, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SnackbarHost(androidx.compose.material3.SnackbarHostState r7, androidx.compose.p002ui.Modifier r8, p404of.C13089p<? super androidx.compose.material3.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r9, androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            java.lang.String r0 = "hostState"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            r0 = 464178177(0x1baacc01, float:2.8255975E-22)
            androidx.compose.runtime.Composer r10 = r10.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0013
            r1 = r11 | 6
            goto L_0x0023
        L_0x0013:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0022
            boolean r1 = r10.changed((java.lang.Object) r7)
            if (r1 == 0) goto L_0x001f
            r1 = 4
            goto L_0x0020
        L_0x001f:
            r1 = 2
        L_0x0020:
            r1 = r1 | r11
            goto L_0x0023
        L_0x0022:
            r1 = r11
        L_0x0023:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x002a
            r1 = r1 | 48
            goto L_0x003a
        L_0x002a:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x003a
            boolean r3 = r10.changed((java.lang.Object) r8)
            if (r3 == 0) goto L_0x0037
            r3 = 32
            goto L_0x0039
        L_0x0037:
            r3 = 16
        L_0x0039:
            r1 = r1 | r3
        L_0x003a:
            r3 = r12 & 4
            if (r3 == 0) goto L_0x0041
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0051
        L_0x0041:
            r4 = r11 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0051
            boolean r4 = r10.changed((java.lang.Object) r9)
            if (r4 == 0) goto L_0x004e
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0050
        L_0x004e:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0050:
            r1 = r1 | r4
        L_0x0051:
            r4 = r1 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0064
            boolean r4 = r10.getSkipping()
            if (r4 != 0) goto L_0x005e
            goto L_0x0064
        L_0x005e:
            r10.skipToGroupEnd()
        L_0x0061:
            r3 = r8
            r4 = r9
            goto L_0x00b1
        L_0x0064:
            if (r2 == 0) goto L_0x0068
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.p002ui.Modifier.Companion
        L_0x0068:
            if (r3 == 0) goto L_0x0070
            androidx.compose.material3.ComposableSingletons$SnackbarHostKt r9 = androidx.compose.material3.ComposableSingletons$SnackbarHostKt.INSTANCE
            of.p r9 = r9.m34381getLambda1$material3_release()
        L_0x0070:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x007c
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:218)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x007c:
            androidx.compose.material3.SnackbarData r0 = r7.getCurrentSnackbarData()
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalAccessibilityManager()
            java.lang.Object r2 = r10.consume(r2)
            androidx.compose.ui.platform.AccessibilityManager r2 = (androidx.compose.p002ui.platform.AccessibilityManager) r2
            androidx.compose.material3.SnackbarHostKt$SnackbarHost$1 r3 = new androidx.compose.material3.SnackbarHostKt$SnackbarHost$1
            r4 = 0
            r3.<init>(r0, r2, r4)
            r2 = 64
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (p404of.C13088o<? super p466yf.C13995l0, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r3, (androidx.compose.runtime.Composer) r10, (int) r2)
            androidx.compose.material3.SnackbarData r0 = r7.getCurrentSnackbarData()
            r2 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = r2 | r1
            r6 = 0
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            FadeInFadeOutWithScale(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0061
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L_0x0061
        L_0x00b1:
            androidx.compose.runtime.ScopeUpdateScope r8 = r10.endRestartGroup()
            if (r8 != 0) goto L_0x00b8
            goto L_0x00c4
        L_0x00b8:
            androidx.compose.material3.SnackbarHostKt$SnackbarHost$2 r9 = new androidx.compose.material3.SnackbarHostKt$SnackbarHost$2
            r1 = r9
            r2 = r7
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r8.updateScope(r9)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostKt.SnackbarHost(androidx.compose.material3.SnackbarHostState, androidx.compose.ui.Modifier, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedOpacity(AnimationSpec<Float> animationSpec, boolean z, C13074a<C11921v> aVar, Composer composer, int i, int i2) {
        float f;
        composer.startReplaceableGroup(1431889134);
        if ((i2 & 4) != 0) {
            aVar = SnackbarHostKt$animatedOpacity$1.INSTANCE;
        }
        C13074a<C11921v> aVar2 = aVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1431889134, i, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:426)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            if (!z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            rememberedValue = AnimatableKt.Animatable$default(f, 0.0f, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue;
        EffectsKt.LaunchedEffect((Object) Boolean.valueOf(z), (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) new SnackbarHostKt$animatedOpacity$2(animatable, z, animationSpec, aVar2, (C12074d<? super SnackbarHostKt$animatedOpacity$2>) null), composer, ((i >> 3) & 14) | 64);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    /* access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedScale(AnimationSpec<Float> animationSpec, boolean z, Composer composer, int i) {
        float f;
        composer.startReplaceableGroup(1966809761);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1966809761, i, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:443)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            if (!z) {
                f = 1.0f;
            } else {
                f = 0.8f;
            }
            rememberedValue = AnimatableKt.Animatable$default(f, 0.0f, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue;
        EffectsKt.LaunchedEffect((Object) Boolean.valueOf(z), (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) new SnackbarHostKt$animatedScale$1(animatable, z, animationSpec, (C12074d<? super SnackbarHostKt$animatedScale$1>) null), composer, ((i >> 3) & 14) | 64);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    public static final long toMillis(SnackbarDuration snackbarDuration, boolean z, AccessibilityManager accessibilityManager) {
        long j;
        C12775o.m28639i(snackbarDuration, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i == 1) {
            j = LocationRequestCompat.PASSIVE_INTERVAL;
        } else if (i == 2) {
            j = 10000;
        } else if (i == 3) {
            j = 4000;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        long j2 = j;
        if (accessibilityManager == null) {
            return j2;
        }
        return accessibilityManager.calculateRecommendedTimeoutMillis(j2, true, true, z);
    }
}
