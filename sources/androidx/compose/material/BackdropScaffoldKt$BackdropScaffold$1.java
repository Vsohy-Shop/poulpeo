package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12085h;
import p404of.C13088o;
import p404of.C13089p;
import p404of.C13090q;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,522:1\n474#2,4:523\n478#2,2:531\n482#2:537\n25#3:527\n1114#4,3:528\n1117#4,3:534\n474#5:533\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1\n*L\n298#1:523,4\n298#1:531,2\n298#1:537\n298#1:527\n298#1:528,3\n298#1:534,3\n298#1:533\n*E\n"})
/* compiled from: BackdropScaffold.kt */
final class BackdropScaffoldKt$BackdropScaffold$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $backLayer;
    final /* synthetic */ Function1<Constraints, Constraints> $calculateBackLayerConstraints;
    final /* synthetic */ long $frontLayerBackgroundColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $frontLayerContent;
    final /* synthetic */ long $frontLayerContentColor;
    final /* synthetic */ float $frontLayerElevation;
    final /* synthetic */ long $frontLayerScrimColor;
    final /* synthetic */ Shape $frontLayerShape;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ float $headerHeight;
    final /* synthetic */ float $headerHeightPx;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $peekHeight;
    final /* synthetic */ float $peekHeightPx;
    final /* synthetic */ BackdropScaffoldState $scaffoldState;
    final /* synthetic */ C13089p<SnackbarHostState, Composer, Integer, C11921v> $snackbarHost;
    final /* synthetic */ boolean $stickyFrontLayer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BackdropScaffoldKt$BackdropScaffold$1(Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, Function1<? super Constraints, Constraints> function1, float f, boolean z, boolean z2, BackdropScaffoldState backdropScaffoldState, float f2, int i, Shape shape, long j, long j2, float f3, int i2, float f4, float f5, C13088o<? super Composer, ? super Integer, C11921v> oVar2, long j3, C13089p<? super SnackbarHostState, ? super Composer, ? super Integer, C11921v> pVar) {
        super(2);
        this.$modifier = modifier;
        this.$backLayer = oVar;
        this.$calculateBackLayerConstraints = function1;
        this.$headerHeightPx = f;
        this.$stickyFrontLayer = z;
        this.$gesturesEnabled = z2;
        this.$scaffoldState = backdropScaffoldState;
        this.$peekHeightPx = f2;
        this.$$dirty = i;
        this.$frontLayerShape = shape;
        this.$frontLayerBackgroundColor = j;
        this.$frontLayerContentColor = j2;
        this.$frontLayerElevation = f3;
        this.$$dirty1 = i2;
        this.$headerHeight = f4;
        this.$peekHeight = f5;
        this.$frontLayerContent = oVar2;
        this.$frontLayerScrimColor = j3;
        this.$snackbarHost = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        int i2 = i;
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1049909631, i2, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:296)");
            }
            composer2.startReplaceableGroup(773894976);
            composer2.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(C12085h.f18916b, composer2));
                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final C13995l0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, (Object) null);
            C13088o<Composer, Integer, C11921v> oVar = this.$backLayer;
            Function1<Constraints, Constraints> function1 = this.$calculateBackLayerConstraints;
            final float f = this.$headerHeightPx;
            final boolean z = this.$stickyFrontLayer;
            final boolean z2 = this.$gesturesEnabled;
            final BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
            final float f2 = this.$peekHeightPx;
            final int i3 = this.$$dirty;
            final Shape shape = this.$frontLayerShape;
            Function1<Constraints, Constraints> function12 = function1;
            C06791 r3 = r6;
            final long j = this.$frontLayerBackgroundColor;
            final long j2 = this.$frontLayerContentColor;
            final float f3 = this.$frontLayerElevation;
            final int i4 = this.$$dirty1;
            final float f4 = this.$headerHeight;
            final float f5 = this.$peekHeight;
            final C13088o<Composer, Integer, C11921v> oVar2 = this.$frontLayerContent;
            final long j3 = this.$frontLayerScrimColor;
            final C13089p<SnackbarHostState, Composer, Integer, C11921v> pVar = this.$snackbarHost;
            C06791 r6 = new C13090q<Constraints, Float, Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    m33886invokejYbf7pk(((Constraints) obj).m38418unboximpl(), ((Number) obj2).floatValue(), (Composer) obj3, ((Number) obj4).intValue());
                    return C11921v.f18618a;
                }

                /* JADX WARNING: Removed duplicated region for block: B:46:0x01d2  */
                /* JADX WARNING: Removed duplicated region for block: B:49:0x01de  */
                /* JADX WARNING: Removed duplicated region for block: B:50:0x01e2  */
                /* JADX WARNING: Removed duplicated region for block: B:53:0x0243  */
                /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
                @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.Composable
                /* renamed from: invoke-jYbf7pk  reason: not valid java name */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void m33886invokejYbf7pk(long r32, float r34, androidx.compose.runtime.Composer r35, int r36) {
                    /*
                        r31 = this;
                        r0 = r31
                        r1 = r34
                        r13 = r35
                        r2 = r36
                        r3 = r2 & 14
                        r4 = 2
                        r5 = r32
                        if (r3 != 0) goto L_0x001a
                        boolean r3 = r13.changed((long) r5)
                        if (r3 == 0) goto L_0x0017
                        r3 = 4
                        goto L_0x0018
                    L_0x0017:
                        r3 = r4
                    L_0x0018:
                        r3 = r3 | r2
                        goto L_0x001b
                    L_0x001a:
                        r3 = r2
                    L_0x001b:
                        r7 = r2 & 112(0x70, float:1.57E-43)
                        if (r7 != 0) goto L_0x002b
                        boolean r7 = r13.changed((float) r1)
                        if (r7 == 0) goto L_0x0028
                        r7 = 32
                        goto L_0x002a
                    L_0x0028:
                        r7 = 16
                    L_0x002a:
                        r3 = r3 | r7
                    L_0x002b:
                        r3 = r3 & 731(0x2db, float:1.024E-42)
                        r7 = 146(0x92, float:2.05E-43)
                        if (r3 != r7) goto L_0x003d
                        boolean r3 = r35.getSkipping()
                        if (r3 != 0) goto L_0x0038
                        goto L_0x003d
                    L_0x0038:
                        r35.skipToGroupEnd()
                        goto L_0x0246
                    L_0x003d:
                        boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                        if (r3 == 0) goto L_0x004c
                        r3 = -1
                        java.lang.String r7 = "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:302)"
                        r8 = 1800047509(0x6b4a8b95, float:2.4486217E26)
                        androidx.compose.runtime.ComposerKt.traceEventStart(r8, r2, r3, r7)
                    L_0x004c:
                        int r2 = androidx.compose.p002ui.unit.Constraints.m38411getMaxHeightimpl(r32)
                        float r14 = (float) r2
                        float r2 = r7
                        float r2 = r14 - r2
                        boolean r3 = r8
                        if (r3 == 0) goto L_0x005d
                        float r2 = java.lang.Math.min(r2, r1)
                    L_0x005d:
                        r15 = r2
                        boolean r1 = r9
                        r2 = 0
                        if (r1 == 0) goto L_0x0070
                        androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
                        androidx.compose.material.BackdropScaffoldState r3 = r10
                        androidx.compose.ui.input.nestedscroll.NestedScrollConnection r3 = r3.getNestedScrollConnection$material_release()
                        androidx.compose.ui.Modifier r1 = androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(r1, r3, r2, r4, r2)
                        goto L_0x0072
                    L_0x0070:
                        androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
                    L_0x0072:
                        androidx.compose.ui.Modifier$Companion r12 = androidx.compose.p002ui.Modifier.Companion
                        androidx.compose.ui.Modifier r16 = r12.then(r1)
                        androidx.compose.material.BackdropScaffoldState r1 = r10
                        ef.l[] r3 = new p336ef.C11906l[r4]
                        float r4 = r11
                        java.lang.Float r4 = java.lang.Float.valueOf(r4)
                        androidx.compose.material.BackdropValue r5 = androidx.compose.material.BackdropValue.Concealed
                        ef.l r4 = p336ef.C11915r.m25707a(r4, r5)
                        r11 = 0
                        r3[r11] = r4
                        java.lang.Float r4 = java.lang.Float.valueOf(r15)
                        androidx.compose.material.BackdropValue r5 = androidx.compose.material.BackdropValue.Revealed
                        ef.l r4 = p336ef.C11915r.m25707a(r4, r5)
                        r10 = 1
                        r3[r10] = r4
                        java.util.Map r18 = kotlin.collections.C12716r0.m28419j(r3)
                        androidx.compose.foundation.gestures.Orientation r19 = androidx.compose.foundation.gestures.Orientation.Vertical
                        boolean r3 = r9
                        r21 = 0
                        r22 = 0
                        r23 = 0
                        r24 = 0
                        r25 = 0
                        r26 = 496(0x1f0, float:6.95E-43)
                        r27 = 0
                        r17 = r1
                        r20 = r3
                        androidx.compose.ui.Modifier r1 = androidx.compose.material.SwipeableKt.m34140swipeablepPrIpRY$default(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                        androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1 r3 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
                        androidx.compose.material.BackdropScaffoldState r4 = r10
                        yf.l0 r5 = r21
                        r3.<init>(r4, r5)
                        androidx.compose.ui.Modifier r1 = androidx.compose.p002ui.semantics.SemanticsModifierKt.semantics$default(r1, r11, r3, r10, r2)
                        androidx.compose.material.BackdropScaffoldState r2 = r10
                        r3 = 1157296644(0x44faf204, float:2007.563)
                        r13.startReplaceableGroup(r3)
                        boolean r3 = r13.changed((java.lang.Object) r2)
                        java.lang.Object r4 = r35.rememberedValue()
                        if (r3 != 0) goto L_0x00dd
                        androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
                        java.lang.Object r3 = r3.getEmpty()
                        if (r4 != r3) goto L_0x00e5
                    L_0x00dd:
                        androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1 r4 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                        r4.<init>(r2)
                        r13.updateRememberedValue(r4)
                    L_0x00e5:
                        r35.endReplaceableGroup()
                        kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
                        androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.OffsetKt.offset(r12, r4)
                        androidx.compose.ui.Modifier r1 = r2.then(r1)
                        androidx.compose.ui.graphics.Shape r2 = r13
                        long r3 = r14
                        long r5 = r16
                        float r8 = r18
                        androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2 r9 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2
                        float r11 = r22
                        of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r7 = r23
                        int r10 = r12
                        r26 = r14
                        r36 = r15
                        long r14 = r24
                        r27 = r12
                        androidx.compose.material.BackdropScaffoldState r12 = r10
                        r28 = r8
                        int r8 = r19
                        r29 = r5
                        boolean r5 = r9
                        yf.l0 r6 = r21
                        r16 = r9
                        r17 = r11
                        r18 = r7
                        r19 = r10
                        r20 = r14
                        r22 = r12
                        r23 = r8
                        r24 = r5
                        r25 = r6
                        r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25)
                        r5 = -1065299503(0xffffffffc080d1d1, float:-4.0256124)
                        r10 = 1
                        androidx.compose.runtime.internal.ComposableLambda r9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r5, r10, r9)
                        int r5 = r19
                        int r6 = r5 >> 3
                        r6 = r6 & 112(0x70, float:1.57E-43)
                        r7 = 1572864(0x180000, float:2.204052E-39)
                        r6 = r6 | r7
                        int r7 = r5 >> 6
                        r7 = r7 & 896(0x380, float:1.256E-42)
                        r6 = r6 | r7
                        int r7 = r5 >> 6
                        r7 = r7 & 7168(0x1c00, float:1.0045E-41)
                        r6 = r6 | r7
                        r7 = 458752(0x70000, float:6.42848E-40)
                        r14 = 6
                        int r5 = r5 << r14
                        r5 = r5 & r7
                        r11 = r6 | r5
                        r12 = 16
                        r5 = r29
                        r7 = 0
                        r8 = r28
                        r15 = r10
                        r10 = r35
                        r15 = 0
                        r16 = r27
                        androidx.compose.material.SurfaceKt.m34127SurfaceFjzlyU(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        androidx.compose.material.BackdropScaffoldState r1 = r10
                        boolean r1 = r1.isRevealed()
                        if (r1 == 0) goto L_0x0178
                        float r1 = r7
                        float r1 = r26 - r1
                        int r1 = (r36 > r1 ? 1 : (r36 == r1 ? 0 : -1))
                        if (r1 != 0) goto L_0x0172
                        r11 = 1
                        goto L_0x0173
                    L_0x0172:
                        r11 = r15
                    L_0x0173:
                        if (r11 == 0) goto L_0x0178
                        float r1 = r20
                        goto L_0x017d
                    L_0x0178:
                        float r1 = (float) r15
                        float r1 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r1)
                    L_0x017d:
                        r9 = r1
                        r10 = 7
                        r11 = 0
                        r5 = r16
                        androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.m33272paddingqDBjuR0$default(r5, r6, r7, r8, r9, r10, r11)
                        androidx.compose.ui.Alignment$Companion r2 = androidx.compose.p002ui.Alignment.Companion
                        androidx.compose.ui.Alignment r2 = r2.getBottomCenter()
                        of.p<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r3 = r26
                        androidx.compose.material.BackdropScaffoldState r4 = r10
                        int r5 = r19
                        r6 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
                        r13.startReplaceableGroup(r6)
                        androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r2, r15, r13, r14)
                        r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
                        r13.startReplaceableGroup(r6)
                        androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
                        java.lang.Object r6 = r13.consume(r6)
                        androidx.compose.ui.unit.Density r6 = (androidx.compose.p002ui.unit.Density) r6
                        androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
                        java.lang.Object r7 = r13.consume(r7)
                        androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p002ui.unit.LayoutDirection) r7
                        androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
                        java.lang.Object r8 = r13.consume(r8)
                        androidx.compose.ui.platform.ViewConfiguration r8 = (androidx.compose.p002ui.platform.ViewConfiguration) r8
                        androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.p002ui.node.ComposeUiNode.Companion
                        of.a r10 = r9.getConstructor()
                        of.p r1 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r1)
                        androidx.compose.runtime.Applier r11 = r35.getApplier()
                        boolean r11 = r11 instanceof androidx.compose.runtime.Applier
                        if (r11 != 0) goto L_0x01d5
                        androidx.compose.runtime.ComposablesKt.invalidApplier()
                    L_0x01d5:
                        r35.startReusableNode()
                        boolean r11 = r35.getInserting()
                        if (r11 == 0) goto L_0x01e2
                        r13.createNode(r10)
                        goto L_0x01e5
                    L_0x01e2:
                        r35.useNode()
                    L_0x01e5:
                        r35.disableReusing()
                        androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.m35292constructorimpl(r35)
                        of.o r11 = r9.getSetMeasurePolicy()
                        androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r2, r11)
                        of.o r2 = r9.getSetDensity()
                        androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r6, r2)
                        of.o r2 = r9.getSetLayoutDirection()
                        androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r7, r2)
                        of.o r2 = r9.getSetViewConfiguration()
                        androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r8, r2)
                        r35.enableReusing()
                        androidx.compose.runtime.Composer r2 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r35)
                        androidx.compose.runtime.SkippableUpdater r2 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r2)
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
                        r1.invoke(r2, r13, r6)
                        r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
                        r13.startReplaceableGroup(r1)
                        androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
                        androidx.compose.material.SnackbarHostState r1 = r4.getSnackbarHostState()
                        int r2 = r5 >> 18
                        r2 = r2 & 112(0x70, float:1.57E-43)
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                        r3.invoke(r1, r13, r2)
                        r35.endReplaceableGroup()
                        r35.endNode()
                        r35.endReplaceableGroup()
                        r35.endReplaceableGroup()
                        boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                        if (r1 == 0) goto L_0x0246
                        androidx.compose.runtime.ComposerKt.traceEventEnd()
                    L_0x0246:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.C06791.m33886invokejYbf7pk(long, float, androidx.compose.runtime.Composer, int):void");
                }
            };
            Composer composer3 = composer;
            BackdropScaffoldKt.BackdropStack(fillMaxSize$default, oVar, function12, ComposableLambdaKt.composableLambda(composer3, 1800047509, true, r3), composer3, 3120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
