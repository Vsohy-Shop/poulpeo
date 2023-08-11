package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$child$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,614:1\n36#2:615\n1114#3,6:616\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$child$1\n*L\n369#1:615\n369#1:616,6\n*E\n"})
/* compiled from: BottomSheetScaffold.kt */
final class BottomSheetScaffoldKt$BottomSheetScaffold$child$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ int $$dirty2;
    final /* synthetic */ C13089p<PaddingValues, Composer, Integer, C11921v> $content;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ float $peekHeightPx;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
    final /* synthetic */ long $sheetBackgroundColor;
    final /* synthetic */ C13089p<ColumnScope, Composer, Integer, C11921v> $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ float $sheetElevation;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ C13089p<SnackbarHostState, Composer, Integer, C11921v> $snackbarHost;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BottomSheetScaffoldKt$BottomSheetScaffold$child$1(BottomSheetScaffoldState bottomSheetScaffoldState, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13089p<? super PaddingValues, ? super Composer, ? super Integer, C11921v> pVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, float f, int i, int i2, int i3, int i4, boolean z, float f2, Shape shape, float f3, long j, long j2, C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar2, C13089p<? super SnackbarHostState, ? super Composer, ? super Integer, C11921v> pVar3) {
        super(2);
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$topBar = oVar;
        this.$content = pVar;
        this.$floatingActionButton = oVar2;
        this.$sheetPeekHeight = f;
        this.$floatingActionButtonPosition = i;
        this.$$dirty = i2;
        this.$$dirty2 = i3;
        this.$$dirty1 = i4;
        this.$sheetGesturesEnabled = z;
        this.$peekHeightPx = f2;
        this.$sheetShape = shape;
        this.$sheetElevation = f3;
        this.$sheetBackgroundColor = j;
        this.$sheetContentColor = j2;
        this.$sheetContent = pVar2;
        this.$snackbarHost = pVar3;
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
                ComposerKt.traceEventStart(893101063, i2, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:328)");
            }
            BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
            C13088o<Composer, Integer, C11921v> oVar = this.$topBar;
            C13089p<PaddingValues, Composer, Integer, C11921v> pVar = this.$content;
            final BottomSheetScaffoldState bottomSheetScaffoldState = this.$scaffoldState;
            final float f = this.$sheetPeekHeight;
            final boolean z = this.$sheetGesturesEnabled;
            final float f2 = this.$peekHeightPx;
            Shape shape = this.$sheetShape;
            float f3 = this.$sheetElevation;
            long j = this.$sheetBackgroundColor;
            BottomSheetState bottomSheetState2 = bottomSheetState;
            long j2 = this.$sheetContentColor;
            C13089p<ColumnScope, Composer, Integer, C11921v> pVar2 = this.$sheetContent;
            C13089p<PaddingValues, Composer, Integer, C11921v> pVar3 = pVar;
            C13088o<Composer, Integer, C11921v> oVar2 = oVar;
            final C13089p<ColumnScope, Composer, Integer, C11921v> pVar4 = pVar2;
            final Shape shape2 = shape;
            final float f4 = f3;
            final long j3 = j;
            final long j4 = j2;
            final int i3 = this.$$dirty;
            final int i4 = this.$$dirty1;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -1378534681, true, new C13089p<Integer, Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke(((Number) obj).intValue(), (Composer) obj2, ((Number) obj3).intValue());
                    return C11921v.f18618a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: of.o} */
                /* JADX WARNING: Multi-variable type inference failed */
                @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.Composable
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void invoke(int r19, androidx.compose.runtime.Composer r20, int r21) {
                    /*
                        r18 = this;
                        r0 = r18
                        r1 = r19
                        r12 = r20
                        r2 = r21 & 14
                        r3 = 2
                        if (r2 != 0) goto L_0x0017
                        boolean r2 = r12.changed((int) r1)
                        if (r2 == 0) goto L_0x0013
                        r2 = 4
                        goto L_0x0014
                    L_0x0013:
                        r2 = r3
                    L_0x0014:
                        r2 = r21 | r2
                        goto L_0x0019
                    L_0x0017:
                        r2 = r21
                    L_0x0019:
                        r4 = r2 & 91
                        r5 = 18
                        if (r4 != r5) goto L_0x002b
                        boolean r4 = r20.getSkipping()
                        if (r4 != 0) goto L_0x0026
                        goto L_0x002b
                    L_0x0026:
                        r20.skipToGroupEnd()
                        goto L_0x0115
                    L_0x002b:
                        boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                        if (r4 == 0) goto L_0x003a
                        r4 = -1
                        java.lang.String r5 = "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:332)"
                        r6 = -1378534681(0xffffffffadd53ae7, float:-2.4241454E-11)
                        androidx.compose.runtime.ComposerKt.traceEventStart(r6, r2, r4, r5)
                    L_0x003a:
                        androidx.compose.material.BottomSheetScaffoldState r2 = r12
                        androidx.compose.material.BottomSheetState r2 = r2.getBottomSheetState()
                        androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p002ui.Modifier.Companion
                        androidx.compose.material.BottomSheetScaffoldState r5 = r12
                        androidx.compose.material.BottomSheetState r5 = r5.getBottomSheetState()
                        androidx.compose.material.SwipeableV2State r5 = r5.getSwipeableState$material_release()
                        androidx.compose.material.BottomSheetScaffoldState r6 = r12
                        r7 = 1157296644(0x44faf204, float:2007.563)
                        r12.startReplaceableGroup(r7)
                        boolean r5 = r12.changed((java.lang.Object) r5)
                        java.lang.Object r7 = r20.rememberedValue()
                        if (r5 != 0) goto L_0x0066
                        androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
                        java.lang.Object r5 = r5.getEmpty()
                        if (r7 != r5) goto L_0x0077
                    L_0x0066:
                        androidx.compose.material.BottomSheetState r5 = r6.getBottomSheetState()
                        androidx.compose.material.SwipeableV2State r5 = r5.getSwipeableState$material_release()
                        androidx.compose.foundation.gestures.Orientation r6 = androidx.compose.foundation.gestures.Orientation.Vertical
                        androidx.compose.ui.input.nestedscroll.NestedScrollConnection r7 = androidx.compose.material.BottomSheetScaffoldKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(r5, r6)
                        r12.updateRememberedValue(r7)
                    L_0x0077:
                        r20.endReplaceableGroup()
                        androidx.compose.ui.input.nestedscroll.NestedScrollConnection r7 = (androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection) r7
                        r5 = 0
                        androidx.compose.ui.Modifier r4 = androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(r4, r7, r5, r3, r5)
                        r6 = 1
                        r7 = 0
                        androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r4, r7, r6, r5)
                        float r6 = r13
                        androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.SizeKt.m33329requiredHeightInVpY3zN4$default(r4, r6, r7, r3, r5)
                        boolean r3 = r14
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
                        float r5 = r15
                        java.lang.Float r5 = java.lang.Float.valueOf(r5)
                        float r6 = r15
                        r7 = 511388516(0x1e7b2b64, float:1.3296802E-20)
                        r12.startReplaceableGroup(r7)
                        boolean r4 = r12.changed((java.lang.Object) r4)
                        boolean r5 = r12.changed((java.lang.Object) r5)
                        r4 = r4 | r5
                        java.lang.Object r5 = r20.rememberedValue()
                        if (r4 != 0) goto L_0x00b8
                        androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
                        java.lang.Object r4 = r4.getEmpty()
                        if (r5 != r4) goto L_0x00c0
                    L_0x00b8:
                        androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$2$1 r5 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$2$1
                        r5.<init>(r1, r6)
                        r12.updateRememberedValue(r5)
                    L_0x00c0:
                        r20.endReplaceableGroup()
                        r4 = r5
                        of.o r4 = (p404of.C13088o) r4
                        androidx.compose.ui.graphics.Shape r5 = r16
                        float r6 = r17
                        long r7 = r18
                        long r13 = r20
                        of.p<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r11 = r22
                        int r1 = r23
                        int r9 = r1 >> 18
                        r9 = r9 & 112(0x70, float:1.57E-43)
                        int r15 = r1 >> 15
                        r15 = r15 & 7168(0x1c00, float:1.0045E-41)
                        r9 = r9 | r15
                        int r15 = r1 >> 15
                        r16 = 57344(0xe000, float:8.0356E-41)
                        r15 = r15 & r16
                        r9 = r9 | r15
                        int r15 = r24
                        int r16 = r15 << 15
                        r17 = 458752(0x70000, float:6.42848E-40)
                        r16 = r16 & r17
                        r9 = r9 | r16
                        r16 = 3670016(0x380000, float:5.142788E-39)
                        int r15 = r15 << 15
                        r15 = r15 & r16
                        r9 = r9 | r15
                        int r1 = r1 << 24
                        r15 = 234881024(0xe000000, float:1.5777218E-30)
                        r1 = r1 & r15
                        r15 = r9 | r1
                        r16 = 0
                        r1 = r2
                        r2 = r3
                        r3 = r4
                        r4 = r5
                        r5 = r6
                        r6 = r7
                        r8 = r13
                        r12 = r20
                        r13 = r15
                        r14 = r16
                        androidx.compose.material.BottomSheetScaffoldKt.m33906BottomSheet0cLKjW4(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14)
                        boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                        if (r1 == 0) goto L_0x0115
                        androidx.compose.runtime.ComposerKt.traceEventEnd()
                    L_0x0115:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.C06981.invoke(int, androidx.compose.runtime.Composer, int):void");
                }
            });
            C13088o<Composer, Integer, C11921v> oVar3 = this.$floatingActionButton;
            final C13089p<SnackbarHostState, Composer, Integer, C11921v> pVar5 = this.$snackbarHost;
            final BottomSheetScaffoldState bottomSheetScaffoldState2 = this.$scaffoldState;
            final int i5 = this.$$dirty;
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -486138068, true, new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-486138068, i, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:365)");
                        }
                        pVar5.invoke(bottomSheetScaffoldState2.getSnackbarHostState(), composer, Integer.valueOf((i5 >> 9) & 112));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            });
            float f5 = this.$sheetPeekHeight;
            int i6 = this.$floatingActionButtonPosition;
            BottomSheetScaffoldState bottomSheetScaffoldState3 = this.$scaffoldState;
            composer2.startReplaceableGroup(1157296644);
            boolean changed = composer2.changed((Object) bottomSheetScaffoldState3);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffold$child$1$3$1(bottomSheetScaffoldState3);
                composer2.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            int i7 = this.$$dirty;
            int i8 = ((i7 >> 9) & 14) | 24960 | ((this.$$dirty2 >> 3) & 112) | ((i7 >> 6) & 7168) | ((this.$$dirty1 << 9) & 458752) | (i7 & 3670016);
            BottomSheetScaffoldKt.m33908BottomSheetScaffoldLayoutKCBPh4w(oVar2, pVar3, composableLambda, oVar3, composableLambda2, f5, i6, (C13074a) rememberedValue, bottomSheetState2, composer, i8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
