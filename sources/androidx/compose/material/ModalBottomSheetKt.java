package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,684:1\n474#2,4:685\n478#2,2:693\n482#2:699\n25#3:689\n50#3:700\n49#3:701\n36#3:709\n50#3:716\n49#3:717\n50#3:724\n49#3:725\n1114#4,3:690\n1117#4,3:696\n1114#4,6:702\n1114#4,6:710\n1114#4,6:718\n1114#4,6:726\n474#5:695\n646#6:708\n76#7:732\n154#8:733\n154#8:734\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n*L\n443#1:685,4\n443#1:693,2\n443#1:699\n443#1:689\n445#1:700\n445#1:701\n561#1:709\n562#1:716\n562#1:717\n574#1:724\n574#1:725\n443#1:690,3\n443#1:696,3\n445#1:702,6\n561#1:710,6\n562#1:718,6\n574#1:726,6\n443#1:695\n553#1:708\n554#1:732\n682#1:733\n683#1:734\n*E\n"})
/* compiled from: ModalBottomSheet.kt */
public final class ModalBottomSheetKt {
    /* access modifiers changed from: private */
    public static final float MaxModalBottomSheetWidth = C1232Dp.m38468constructorimpl((float) 640);
    /* access modifiers changed from: private */
    public static final C13088o<Density, Float, Float> PositionalThreshold = ModalBottomSheetKt$PositionalThreshold$1.INSTANCE;
    /* access modifiers changed from: private */
    public static final float VelocityThreshold = C1232Dp.m38468constructorimpl((float) 125);

    /* access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(SwipeableV2State<?> swipeableV2State, Orientation orientation) {
        return new C0743x58e3e91b(swipeableV2State, orientation);
    }

    /* access modifiers changed from: private */
    public static final AnchorChangeHandler<ModalBottomSheetValue> ModalBottomSheetAnchorChangeHandler(ModalBottomSheetState modalBottomSheetState, C13088o<? super ModalBottomSheetValue, ? super Float, C11921v> oVar, Function1<? super ModalBottomSheetValue, C11921v> function1) {
        return new ModalBottomSheetKt$ModalBottomSheetAnchorChangeHandler$1(modalBottomSheetState, oVar, function1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x011b  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.Composable
    /* renamed from: ModalBottomSheetLayout-BzaUkTc  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34049ModalBottomSheetLayoutBzaUkTc(p404of.C13089p<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r33, androidx.compose.p002ui.Modifier r34, androidx.compose.material.ModalBottomSheetState r35, androidx.compose.p002ui.graphics.Shape r36, float r37, long r38, long r40, long r42, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r44, androidx.compose.runtime.Composer r45, int r46, int r47) {
        /*
            r15 = r33
            r14 = r44
            r12 = r46
            r13 = r47
            java.lang.String r0 = "sheetContent"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r0 = -1633763156(0xffffffff9e9ec0ac, float:-1.6808588E-20)
            r1 = r45
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r1 = r13 & 1
            r2 = 4
            if (r1 == 0) goto L_0x0023
            r1 = r12 | 6
            goto L_0x0033
        L_0x0023:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x0032
            boolean r1 = r11.changedInstance(r15)
            if (r1 == 0) goto L_0x002f
            r1 = r2
            goto L_0x0030
        L_0x002f:
            r1 = 2
        L_0x0030:
            r1 = r1 | r12
            goto L_0x0033
        L_0x0032:
            r1 = r12
        L_0x0033:
            r3 = r13 & 2
            if (r3 == 0) goto L_0x003a
            r1 = r1 | 48
            goto L_0x004d
        L_0x003a:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004d
            r4 = r34
            boolean r5 = r11.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0049
            r5 = 32
            goto L_0x004b
        L_0x0049:
            r5 = 16
        L_0x004b:
            r1 = r1 | r5
            goto L_0x004f
        L_0x004d:
            r4 = r34
        L_0x004f:
            r5 = r13 & 4
            if (r5 == 0) goto L_0x0055
            r1 = r1 | 128(0x80, float:1.794E-43)
        L_0x0055:
            r6 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x006c
            r6 = r13 & 8
            r8 = r36
            if (r6 != 0) goto L_0x0068
            boolean r6 = r11.changed((java.lang.Object) r8)
            if (r6 == 0) goto L_0x0068
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x006a
        L_0x0068:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x006a:
            r1 = r1 | r6
            goto L_0x006e
        L_0x006c:
            r8 = r36
        L_0x006e:
            r9 = r13 & 16
            if (r9 == 0) goto L_0x0077
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r10 = r37
            goto L_0x008b
        L_0x0077:
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r12
            r10 = r37
            if (r6 != 0) goto L_0x008b
            boolean r6 = r11.changed((float) r10)
            if (r6 == 0) goto L_0x0088
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008a
        L_0x0088:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x008a:
            r1 = r1 | r6
        L_0x008b:
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r12
            if (r6 != 0) goto L_0x00a6
            r6 = r13 & 32
            if (r6 != 0) goto L_0x009f
            r6 = r38
            boolean r16 = r11.changed((long) r6)
            if (r16 == 0) goto L_0x00a1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a3
        L_0x009f:
            r6 = r38
        L_0x00a1:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00a3:
            r1 = r1 | r16
            goto L_0x00a8
        L_0x00a6:
            r6 = r38
        L_0x00a8:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r12 & r16
            if (r16 != 0) goto L_0x00c1
            r16 = r13 & 64
            r7 = r40
            if (r16 != 0) goto L_0x00bd
            boolean r6 = r11.changed((long) r7)
            if (r6 == 0) goto L_0x00bd
            r6 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00bf
        L_0x00bd:
            r6 = 524288(0x80000, float:7.34684E-40)
        L_0x00bf:
            r1 = r1 | r6
            goto L_0x00c3
        L_0x00c1:
            r7 = r40
        L_0x00c3:
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r12
            if (r6 != 0) goto L_0x00db
            r6 = r13 & 128(0x80, float:1.794E-43)
            r7 = r42
            if (r6 != 0) goto L_0x00d7
            boolean r6 = r11.changed((long) r7)
            if (r6 == 0) goto L_0x00d7
            r6 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00d9
        L_0x00d7:
            r6 = 4194304(0x400000, float:5.877472E-39)
        L_0x00d9:
            r1 = r1 | r6
            goto L_0x00dd
        L_0x00db:
            r7 = r42
        L_0x00dd:
            r6 = r13 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x00e5
            r6 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x00e3:
            r1 = r1 | r6
            goto L_0x00f6
        L_0x00e5:
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r6 = r6 & r12
            if (r6 != 0) goto L_0x00f6
            boolean r6 = r11.changedInstance(r14)
            if (r6 == 0) goto L_0x00f3
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00e3
        L_0x00f3:
            r6 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x00e3
        L_0x00f6:
            r6 = r1
            if (r5 != r2) goto L_0x011b
            r1 = 191739611(0xb6db6db, float:4.5782105E-32)
            r1 = r1 & r6
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r2) goto L_0x011b
            boolean r1 = r11.getSkipping()
            if (r1 != 0) goto L_0x0109
            goto L_0x011b
        L_0x0109:
            r11.skipToGroupEnd()
            r3 = r35
            r19 = r4
            r5 = r10
            r2 = r11
            r4 = r36
            r10 = r7
            r6 = r38
            r8 = r40
            goto L_0x02c5
        L_0x011b:
            r11.startDefaults()
            r1 = r12 & 1
            r16 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r1 == 0) goto L_0x0162
            boolean r1 = r11.getDefaultsInvalid()
            if (r1 == 0) goto L_0x0132
            goto L_0x0162
        L_0x0132:
            r11.skipToGroupEnd()
            if (r5 == 0) goto L_0x0139
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0139:
            r1 = r13 & 8
            if (r1 == 0) goto L_0x013f
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x013f:
            r1 = r13 & 32
            if (r1 == 0) goto L_0x0145
            r6 = r6 & r18
        L_0x0145:
            r1 = r13 & 64
            if (r1 == 0) goto L_0x014b
            r6 = r6 & r17
        L_0x014b:
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0151
            r6 = r6 & r16
        L_0x0151:
            r16 = r36
            r20 = r38
            r23 = r40
            r19 = r4
            r9 = r6
            r25 = r7
            r17 = r10
            r10 = r35
            goto L_0x01ed
        L_0x0162:
            if (r3 == 0) goto L_0x0169
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            r19 = r1
            goto L_0x016b
        L_0x0169:
            r19 = r4
        L_0x016b:
            if (r5 == 0) goto L_0x0183
            androidx.compose.material.ModalBottomSheetValue r1 = androidx.compose.material.ModalBottomSheetValue.Hidden
            r2 = 0
            r3 = 0
            r4 = 0
            r20 = 6
            r21 = 14
            r5 = r11
            r0 = r6
            r6 = r20
            r7 = r21
            androidx.compose.material.ModalBottomSheetState r1 = rememberModalBottomSheetState((androidx.compose.material.ModalBottomSheetValue) r1, (androidx.compose.animation.core.AnimationSpec<java.lang.Float>) r2, (kotlin.jvm.functions.Function1<? super androidx.compose.material.ModalBottomSheetValue, java.lang.Boolean>) r3, (boolean) r4, (androidx.compose.runtime.Composer) r5, (int) r6, (int) r7)
            r6 = r0 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0186
        L_0x0183:
            r0 = r6
            r1 = r35
        L_0x0186:
            r0 = r13 & 8
            r2 = 6
            if (r0 == 0) goto L_0x0198
            androidx.compose.material.MaterialTheme r0 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Shapes r0 = r0.getShapes(r11, r2)
            androidx.compose.foundation.shape.CornerBasedShape r0 = r0.getLarge()
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x019a
        L_0x0198:
            r0 = r36
        L_0x019a:
            if (r9 == 0) goto L_0x01a3
            androidx.compose.material.ModalBottomSheetDefaults r3 = androidx.compose.material.ModalBottomSheetDefaults.INSTANCE
            float r3 = r3.m34048getElevationD9Ej5fM()
            goto L_0x01a4
        L_0x01a3:
            r3 = r10
        L_0x01a4:
            r4 = r13 & 32
            if (r4 == 0) goto L_0x01b5
            androidx.compose.material.MaterialTheme r4 = androidx.compose.material.MaterialTheme.INSTANCE
            androidx.compose.material.Colors r4 = r4.getColors(r11, r2)
            long r4 = r4.m33956getSurface0d7_KjU()
            r6 = r6 & r18
            goto L_0x01b7
        L_0x01b5:
            r4 = r38
        L_0x01b7:
            r7 = r13 & 64
            if (r7 == 0) goto L_0x01c6
            int r7 = r6 >> 15
            r7 = r7 & 14
            long r7 = androidx.compose.material.ColorsKt.m33970contentColorForek8zF_U(r4, r11, r7)
            r6 = r6 & r17
            goto L_0x01c8
        L_0x01c6:
            r7 = r40
        L_0x01c8:
            r9 = r13 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01e1
            androidx.compose.material.ModalBottomSheetDefaults r9 = androidx.compose.material.ModalBottomSheetDefaults.INSTANCE
            long r9 = r9.getScrimColor(r11, r2)
            r6 = r6 & r16
            r16 = r0
            r17 = r3
            r20 = r4
            r23 = r7
            r25 = r9
            r10 = r1
            r9 = r6
            goto L_0x01ed
        L_0x01e1:
            r25 = r42
            r16 = r0
            r10 = r1
            r17 = r3
            r20 = r4
            r9 = r6
            r23 = r7
        L_0x01ed:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01ff
            r0 = -1
            java.lang.String r1 = "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:430)"
            r2 = -1633763156(0xffffffff9e9ec0ac, float:-1.6808588E-20)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r9, r0, r1)
        L_0x01ff:
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            r11.startReplaceableGroup(r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r0)
            java.lang.Object r0 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r1.getEmpty()
            if (r0 != r2) goto L_0x0226
            hf.h r0 = p355hf.C12085h.f18916b
            yf.l0 r0 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r0, r11)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r2 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r2.<init>(r0)
            r11.updateRememberedValue(r2)
            r0 = r2
        L_0x0226:
            r11.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r0 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r0
            yf.l0 r7 = r0.getCoroutineScope()
            r11.endReplaceableGroup()
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.startReplaceableGroup(r0)
            boolean r0 = r11.changed((java.lang.Object) r10)
            boolean r3 = r11.changed((java.lang.Object) r7)
            r0 = r0 | r3
            java.lang.Object r3 = r11.rememberedValue()
            if (r0 != 0) goto L_0x024f
            java.lang.Object r0 = r1.getEmpty()
            if (r3 != r0) goto L_0x0260
        L_0x024f:
            androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1 r0 = new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1
            r0.<init>(r7, r10)
            androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2 r1 = new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2
            r1.<init>(r7, r10)
            androidx.compose.material.AnchorChangeHandler r3 = ModalBottomSheetAnchorChangeHandler(r10, r0, r1)
            r11.updateRememberedValue(r3)
        L_0x0260:
            r11.endReplaceableGroup()
            androidx.compose.material.AnchorChangeHandler r3 = (androidx.compose.material.AnchorChangeHandler) r3
            r18 = 0
            r22 = 0
            androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1 r8 = new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
            r0 = r8
            r1 = r10
            r4 = r16
            r5 = r20
            r27 = r7
            r28 = r8
            r7 = r23
            r29 = r9
            r9 = r17
            r30 = r10
            r10 = r29
            r31 = r11
            r11 = r44
            r12 = r25
            r14 = r27
            r15 = r33
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r14, r15)
            r0 = 1607356310(0x5fce4f96, float:2.9732532E19)
            r1 = 1
            r3 = r28
            r2 = r31
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r0, r1, r3)
            int r1 = r29 >> 3
            r1 = r1 & 14
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r3 = 6
            r34 = r19
            r35 = r18
            r36 = r22
            r37 = r0
            r38 = r2
            r39 = r1
            r40 = r3
            androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(r34, r35, r36, r37, r38, r39, r40)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02b9
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02b9:
            r4 = r16
            r5 = r17
            r6 = r20
            r8 = r23
            r10 = r25
            r3 = r30
        L_0x02c5:
            androidx.compose.runtime.ScopeUpdateScope r15 = r2.endRestartGroup()
            if (r15 != 0) goto L_0x02cc
            goto L_0x02e3
        L_0x02cc:
            androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2 r14 = new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
            r0 = r14
            r1 = r33
            r2 = r19
            r12 = r44
            r13 = r46
            r32 = r14
            r14 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r12, r13, r14)
            r0 = r32
            r15.updateScope(r0)
        L_0x02e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.m34049ModalBottomSheetLayoutBzaUkTc(of.p, androidx.compose.ui.Modifier, androidx.compose.material.ModalBottomSheetState, androidx.compose.ui.graphics.Shape, float, long, long, long, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalMaterialApi
    public static final ModalBottomSheetState ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> function1, boolean z) {
        C12775o.m28639i(modalBottomSheetValue, "initialValue");
        C12775o.m28639i(animationSpec, "animationSpec");
        C12775o.m28639i(function1, "confirmValueChange");
        return new ModalBottomSheetState(modalBottomSheetValue, animationSpec, z, function1);
    }

    public static /* synthetic */ ModalBottomSheetState ModalBottomSheetState$default(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i & 4) != 0) {
            function1 = ModalBottomSheetKt$ModalBottomSheetState$1.INSTANCE;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return ModalBottomSheetState(modalBottomSheetValue, animationSpec, function1, z);
    }

    /* access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-3J-VO9M  reason: not valid java name */
    public static final void m34050Scrim3JVO9M(long j, C13074a<C11921v> aVar, boolean z, Composer composer, int i) {
        int i2;
        boolean z2;
        float f;
        Modifier modifier;
        int i3;
        int i4;
        int i5;
        long j2 = j;
        C13074a<C11921v> aVar2 = aVar;
        boolean z3 = z;
        int i6 = i;
        Composer startRestartGroup = composer.startRestartGroup(-526532668);
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changed(j2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (startRestartGroup.changedInstance(aVar2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed(z3)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-526532668, i2, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:547)");
            }
            if (j2 != Color.Companion.m35707getUnspecified0d7_KjU()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, new TweenSpec(0, 0, (Easing) null, 7, (DefaultConstructorMarker) null), 0.0f, (Function1<? super Float, C11921v>) null, startRestartGroup, 48, 12);
                String r7 = Strings_androidKt.m34125getString4foXLRw(Strings.Companion.m34119getCloseSheetUdPEhr4(), startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(1010553415);
                if (z3) {
                    Modifier.Companion companion = Modifier.Companion;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    boolean changed = startRestartGroup.changed((Object) aVar2);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(aVar2, (C12074d<? super ModalBottomSheetKt$Scrim$dismissModifier$1$1>) null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion, (Object) aVar2, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) (C13088o) rememberedValue);
                    startRestartGroup.startReplaceableGroup(511388516);
                    boolean changed2 = startRestartGroup.changed((Object) r7) | startRestartGroup.changed((Object) aVar2);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new ModalBottomSheetKt$Scrim$dismissModifier$2$1(r7, aVar2);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    modifier = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
                } else {
                    modifier = Modifier.Companion;
                }
                startRestartGroup.endReplaceableGroup();
                Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null).then(modifier);
                Color r72 = Color.m35661boximpl(j);
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed3 = startRestartGroup.changed((Object) r72) | startRestartGroup.changed((Object) animateFloatAsState);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new ModalBottomSheetKt$Scrim$1$1(j2, animateFloatAsState);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ModalBottomSheetKt$Scrim$2(j, aVar, z, i));
        }
    }

    /* access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    @ExperimentalMaterialApi
    @Composable
    public static final ModalBottomSheetState rememberModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> function1, boolean z, Composer composer, int i, int i2) {
        C12775o.m28639i(modalBottomSheetValue, "initialValue");
        composer.startReplaceableGroup(-126412120);
        SpringSpec<Float> springSpec = animationSpec;
        if ((i2 & 2) != 0) {
            springSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        ModalBottomSheetKt$rememberModalBottomSheetState$1 modalBottomSheetKt$rememberModalBottomSheetState$1 = function1;
        if ((i2 & 4) != 0) {
            modalBottomSheetKt$rememberModalBottomSheetState$1 = ModalBottomSheetKt$rememberModalBottomSheetState$1.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-126412120, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:313)");
        }
        composer.startMovableGroup(170046719, modalBottomSheetValue);
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.rememberSaveable(new Object[]{modalBottomSheetValue, springSpec, Boolean.valueOf(z), modalBottomSheetKt$rememberModalBottomSheetState$1}, ModalBottomSheetState.Companion.Saver(springSpec, modalBottomSheetKt$rememberModalBottomSheetState$1, z), (String) null, new ModalBottomSheetKt$rememberModalBottomSheetState$2(modalBottomSheetValue, springSpec, modalBottomSheetKt$rememberModalBottomSheetState$1, z), composer, 72, 4);
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modalBottomSheetState;
    }

    @ExperimentalMaterialApi
    @Composable
    public static final ModalBottomSheetState rememberModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec<Float> animationSpec, boolean z, Function1<? super ModalBottomSheetValue, Boolean> function1, Composer composer, int i, int i2) {
        C12775o.m28639i(modalBottomSheetValue, "initialValue");
        C12775o.m28639i(function1, "confirmStateChange");
        composer.startReplaceableGroup(-409288536);
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-409288536, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:362)");
        }
        ModalBottomSheetState rememberModalBottomSheetState = rememberModalBottomSheetState(modalBottomSheetValue, animationSpec2, function1, z, composer, (i & 14) | 64 | ((i >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberModalBottomSheetState;
    }

    @ExperimentalMaterialApi
    @Composable
    public static final ModalBottomSheetState rememberModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> function1, Composer composer, int i, int i2) {
        C12775o.m28639i(modalBottomSheetValue, "initialValue");
        C12775o.m28639i(function1, "confirmStateChange");
        composer.startReplaceableGroup(-1928569212);
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928569212, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:389)");
        }
        ModalBottomSheetState rememberModalBottomSheetState = rememberModalBottomSheetState(modalBottomSheetValue, animationSpec2, function1, false, composer, (i & 14) | 3136 | (i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberModalBottomSheetState;
    }
}
