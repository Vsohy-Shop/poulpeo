package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.MotionDurationScale;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p002ui.modifier.ModifierLocalKt;
import androidx.compose.p002ui.modifier.ProvidableModifierLocal;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,579:1\n135#2:580\n25#3:581\n36#3:588\n25#3:595\n36#3:602\n50#3:609\n49#3:610\n1114#4,6:582\n1114#4,6:589\n1114#4,6:596\n1114#4,6:603\n1114#4,6:611\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt\n*L\n146#1:580\n252#1:581\n263#1:588\n266#1:595\n275#1:602\n276#1:609\n276#1:610\n252#1:582,6\n263#1:589,6\n266#1:596,6\n275#1:603,6\n276#1:611,6\n*E\n"})
/* compiled from: Scrollable.kt */
public final class ScrollableKt {
    private static final MotionDurationScale DefaultScrollMotionDurationScale = new ScrollableKt$DefaultScrollMotionDurationScale$1();
    private static final float DefaultScrollMotionDurationScaleFactor = 1.0f;
    private static final ProvidableModifierLocal<Boolean> ModifierLocalScrollableContainer = ModifierLocalKt.modifierLocalOf(ScrollableKt$ModifierLocalScrollableContainer$1.INSTANCE);
    /* access modifiers changed from: private */
    public static final ScrollScope NoOpScrollScope = new ScrollableKt$NoOpScrollScope$1();

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    public static final java.lang.Object awaitScrollEvent(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r5, p355hf.C12074d<? super androidx.compose.p002ui.input.pointer.PointerEvent> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r5
            p336ef.C11910n.m25701b(r6)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            p336ef.C11910n.m25701b(r6)
        L_0x0038:
            r0.L$0 = r5
            r0.label = r3
            r6 = 0
            java.lang.Object r6 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L_0x0044
            return r1
        L_0x0044:
            androidx.compose.ui.input.pointer.PointerEvent r6 = (androidx.compose.p002ui.input.pointer.PointerEvent) r6
            int r2 = r6.m37114getType7fucELk()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.p002ui.input.pointer.PointerEventType.Companion
            int r4 = r4.m37130getScroll7fucELk()
            boolean r2 = androidx.compose.p002ui.input.pointer.PointerEventType.m37121equalsimpl0(r2, r4)
            if (r2 == 0) goto L_0x0038
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.awaitScrollEvent(androidx.compose.ui.input.pointer.AwaitPointerEventScope, hf.d):java.lang.Object");
    }

    public static final MotionDurationScale getDefaultScrollMotionDurationScale() {
        return DefaultScrollMotionDurationScale;
    }

    public static final ProvidableModifierLocal<Boolean> getModifierLocalScrollableContainer() {
        return ModifierLocalScrollableContainer;
    }

    private static final Modifier mouseWheelScroll(Modifier modifier, State<ScrollingLogic> state, ScrollConfig scrollConfig) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, state, scrollConfig, new ScrollableKt$mouseWheelScroll$1(scrollConfig, state, (C12074d<? super ScrollableKt$mouseWheelScroll$1>) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: of.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: of.p} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.Modifier pointerScrollable(androidx.compose.p002ui.Modifier r24, androidx.compose.foundation.interaction.MutableInteractionSource r25, androidx.compose.foundation.gestures.Orientation r26, boolean r27, androidx.compose.foundation.gestures.ScrollableState r28, androidx.compose.foundation.gestures.FlingBehavior r29, androidx.compose.foundation.OverscrollEffect r30, boolean r31, androidx.compose.runtime.Composer r32, int r33) {
        /*
            r0 = r32
            r1 = -2012025036(0xffffffff8812ef34, float:-4.421646E-34)
            r0.startReplaceableGroup(r1)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0016
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.gestures.pointerScrollable (Scrollable.kt:241)"
            r4 = r33
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r4, r2, r3)
        L_0x0016:
            r1 = -1730186281(0xffffffff98df73d7, float:-5.7761117E-24)
            r0.startReplaceableGroup(r1)
            if (r29 != 0) goto L_0x0027
            androidx.compose.foundation.gestures.ScrollableDefaults r1 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            r2 = 6
            androidx.compose.foundation.gestures.FlingBehavior r1 = r1.flingBehavior(r0, r2)
            r7 = r1
            goto L_0x0029
        L_0x0027:
            r7 = r29
        L_0x0029:
            r32.endReplaceableGroup()
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.startReplaceableGroup(r1)
            java.lang.Object r2 = r32.rememberedValue()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r9.getEmpty()
            r10 = 0
            if (r2 != r3) goto L_0x004c
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r2.<init>()
            r3 = 2
            androidx.compose.runtime.MutableState r2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r10, r3, r10)
            r0.updateRememberedValue(r2)
        L_0x004c:
            r32.endReplaceableGroup()
            r11 = r2
            androidx.compose.runtime.MutableState r11 = (androidx.compose.runtime.MutableState) r11
            androidx.compose.foundation.gestures.ScrollingLogic r12 = new androidx.compose.foundation.gestures.ScrollingLogic
            r2 = r12
            r3 = r26
            r4 = r27
            r5 = r11
            r6 = r28
            r8 = r30
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r2 = 0
            androidx.compose.runtime.State r3 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r12, r0, r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r31)
            r5 = 1157296644(0x44faf204, float:2007.563)
            r0.startReplaceableGroup(r5)
            boolean r4 = r0.changed((java.lang.Object) r4)
            java.lang.Object r6 = r32.rememberedValue()
            if (r4 != 0) goto L_0x0084
            java.lang.Object r4 = r9.getEmpty()
            if (r6 != r4) goto L_0x0081
            goto L_0x0084
        L_0x0081:
            r4 = r31
            goto L_0x008d
        L_0x0084:
            r4 = r31
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r6 = scrollableNestedScrollConnection(r3, r4)
            r0.updateRememberedValue(r6)
        L_0x008d:
            r32.endReplaceableGroup()
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r6 = (androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection) r6
            r0.startReplaceableGroup(r1)
            java.lang.Object r1 = r32.rememberedValue()
            java.lang.Object r7 = r9.getEmpty()
            if (r1 != r7) goto L_0x00a7
            androidx.compose.foundation.gestures.ScrollDraggableState r1 = new androidx.compose.foundation.gestures.ScrollDraggableState
            r1.<init>(r3)
            r0.updateRememberedValue(r1)
        L_0x00a7:
            r32.endReplaceableGroup()
            r13 = r1
            androidx.compose.foundation.gestures.ScrollDraggableState r13 = (androidx.compose.foundation.gestures.ScrollDraggableState) r13
            androidx.compose.foundation.gestures.ScrollConfig r1 = androidx.compose.foundation.gestures.AndroidScrollable_androidKt.platformScrollConfig(r0, r2)
            androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$1 r14 = androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$1.INSTANCE
            r0.startReplaceableGroup(r5)
            boolean r2 = r0.changed((java.lang.Object) r3)
            java.lang.Object r5 = r32.rememberedValue()
            if (r2 != 0) goto L_0x00c6
            java.lang.Object r2 = r9.getEmpty()
            if (r5 != r2) goto L_0x00ce
        L_0x00c6:
            androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$2$1 r5 = new androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$2$1
            r5.<init>(r3)
            r0.updateRememberedValue(r5)
        L_0x00ce:
            r32.endReplaceableGroup()
            r18 = r5
            of.a r18 = (p404of.C13074a) r18
            r19 = 0
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r0.startReplaceableGroup(r2)
            boolean r2 = r0.changed((java.lang.Object) r11)
            boolean r5 = r0.changed((java.lang.Object) r3)
            r2 = r2 | r5
            java.lang.Object r5 = r32.rememberedValue()
            if (r2 != 0) goto L_0x00f2
            java.lang.Object r2 = r9.getEmpty()
            if (r5 != r2) goto L_0x00fa
        L_0x00f2:
            androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1 r5 = new androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1
            r5.<init>(r11, r3, r10)
            r0.updateRememberedValue(r5)
        L_0x00fa:
            r32.endReplaceableGroup()
            r20 = r5
            of.p r20 = (p404of.C13089p) r20
            r21 = 0
            r22 = 64
            r23 = 0
            r12 = r24
            r15 = r26
            r16 = r31
            r17 = r25
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.gestures.DraggableKt.draggable$default(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.Modifier r1 = mouseWheelScroll(r2, r3, r1)
            java.lang.Object r2 = r11.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = (androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher) r2
            androidx.compose.ui.Modifier r1 = androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll(r1, r6, r2)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x012a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x012a:
            r32.endReplaceableGroup()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable(androidx.compose.ui.Modifier, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.gestures.Orientation, boolean, androidx.compose.foundation.gestures.ScrollableState, androidx.compose.foundation.gestures.FlingBehavior, androidx.compose.foundation.OverscrollEffect, boolean, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    public static final Modifier scrollable(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(scrollableState, "state");
        C12775o.m28639i(orientation, "orientation");
        return scrollable(modifier, scrollableState, orientation, (OverscrollEffect) null, z, z2, flingBehavior, mutableInteractionSource);
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        return scrollable(modifier, scrollableState, orientation, z3, z2, (i & 16) != 0 ? null : flingBehavior, (i & 32) != 0 ? null : mutableInteractionSource);
    }

    /* access modifiers changed from: private */
    public static final NestedScrollConnection scrollableNestedScrollConnection(State<ScrollingLogic> state, boolean z) {
        return new ScrollableKt$scrollableNestedScrollConnection$1(state, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.foundation.ExperimentalFoundationApi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.Modifier scrollable(androidx.compose.p002ui.Modifier r13, androidx.compose.foundation.gestures.ScrollableState r14, androidx.compose.foundation.gestures.Orientation r15, androidx.compose.foundation.OverscrollEffect r16, boolean r17, boolean r18, androidx.compose.foundation.gestures.FlingBehavior r19, androidx.compose.foundation.interaction.MutableInteractionSource r20) {
        /*
            r0 = r13
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r13, r1)
            java.lang.String r1 = "state"
            r10 = r14
            kotlin.jvm.internal.C12775o.m28639i(r14, r1)
            java.lang.String r1 = "orientation"
            r11 = r15
            kotlin.jvm.internal.C12775o.m28639i(r15, r1)
            boolean r1 = androidx.compose.p002ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r1 == 0) goto L_0x002b
            androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r15
            r4 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x002f
        L_0x002b:
            kotlin.jvm.functions.Function1 r1 = androidx.compose.p002ui.platform.InspectableValueKt.getNoInspectorInfo()
        L_0x002f:
            androidx.compose.foundation.gestures.ScrollableKt$scrollable$2 r12 = new androidx.compose.foundation.gestures.ScrollableKt$scrollable$2
            r2 = r12
            r3 = r15
            r4 = r14
            r5 = r18
            r6 = r20
            r7 = r19
            r8 = r16
            r9 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.ComposedModifierKt.composed(r13, r1, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.scrollable(androidx.compose.ui.Modifier, androidx.compose.foundation.gestures.ScrollableState, androidx.compose.foundation.gestures.Orientation, androidx.compose.foundation.OverscrollEffect, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, androidx.compose.foundation.interaction.MutableInteractionSource):androidx.compose.ui.Modifier");
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        return scrollable(modifier, scrollableState, orientation, overscrollEffect, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : flingBehavior, (i & 64) != 0 ? null : mutableInteractionSource);
    }
}
