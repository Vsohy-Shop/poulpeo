package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import androidx.compose.p002ui.input.pointer.util.VelocityTracker;
import androidx.compose.p002ui.unit.Velocity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10915s;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13089p;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 5 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,461:1\n25#2:462\n1114#3,6:463\n135#4:469\n658#5,18:470\n676#5,4:497\n680#5,58:508\n581#5,6:566\n615#5,4:572\n619#5,2:585\n621#5,8:594\n588#5,10:602\n116#6,2:488\n33#6,6:490\n118#6:496\n33#6,6:501\n118#6:507\n116#6,2:576\n33#6,6:578\n118#6:584\n33#6,6:587\n118#6:593\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n141#1:462\n141#1:463,6\n209#1:469\n334#1:470,18\n334#1:497,4\n334#1:508,58\n387#1:566,6\n387#1:572,4\n387#1:585,2\n387#1:594,8\n387#1:602,10\n334#1:488,2\n334#1:490,6\n334#1:496\n334#1:501,6\n334#1:507\n387#1:576,2\n387#1:578,6\n387#1:584\n387#1:587,6\n387#1:593\n*E\n"})
/* compiled from: Draggable.kt */
public final class DraggableKt {
    public static final DraggableState DraggableState(Function1<? super Float, C11921v> function1) {
        C12775o.m28639i(function1, "onDelta");
        return new DefaultDraggableState(function1);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02ed A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01f3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object awaitDownAndSlop(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r20, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.input.pointer.PointerInputChange, java.lang.Boolean>> r21, androidx.compose.runtime.State<? extends p404of.C13074a<java.lang.Boolean>> r22, androidx.compose.p002ui.input.pointer.util.VelocityTracker r23, androidx.compose.foundation.gestures.Orientation r24, p355hf.C12074d<? super p336ef.C11906l<androidx.compose.p002ui.input.pointer.PointerInputChange, androidx.compose.p002ui.geometry.Offset>> r25) {
        /*
            r0 = r20
            r1 = r25
            boolean r2 = r1 instanceof androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1 r2 = (androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1 r2 = new androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1
            r2.<init>(r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p362if.C12150d.m26492c()
            int r4 = r2.label
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 0
            r10 = 1
            r11 = 0
            if (r4 == 0) goto L_0x00cc
            if (r4 == r10) goto L_0x00aa
            if (r4 == r7) goto L_0x0099
            if (r4 == r6) goto L_0x0070
            if (r4 != r5) goto L_0x0068
            float r0 = r2.F$2
            float r4 = r2.F$1
            float r7 = r2.F$0
            int r12 = r2.I$0
            java.lang.Object r13 = r2.L$5
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r13
            java.lang.Object r14 = r2.L$4
            kotlin.jvm.internal.g0 r14 = (kotlin.jvm.internal.C12762g0) r14
            java.lang.Object r15 = r2.L$3
            androidx.compose.foundation.gestures.PointerDirectionConfig r15 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r15
            java.lang.Object r9 = r2.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r9
            java.lang.Object r5 = r2.L$1
            of.o r5 = (p404of.C13088o) r5
            java.lang.Object r6 = r2.L$0
            kotlin.jvm.internal.g0 r6 = (kotlin.jvm.internal.C12762g0) r6
            p336ef.C11910n.m25701b(r1)
            r1 = r0
            r10 = r12
            r0 = r15
            r11 = 4
            r12 = r5
            r5 = r14
            r18 = r3
            r3 = r2
            r2 = r7
            r7 = r9
            r9 = r6
            r6 = r4
            r4 = r18
            goto L_0x029f
        L_0x0068:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0070:
            float r0 = r2.F$2
            float r4 = r2.F$1
            float r5 = r2.F$0
            int r6 = r2.I$0
            java.lang.Object r7 = r2.L$4
            kotlin.jvm.internal.g0 r7 = (kotlin.jvm.internal.C12762g0) r7
            java.lang.Object r9 = r2.L$3
            androidx.compose.foundation.gestures.PointerDirectionConfig r9 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r9
            java.lang.Object r12 = r2.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r12
            java.lang.Object r13 = r2.L$1
            of.o r13 = (p404of.C13088o) r13
            java.lang.Object r14 = r2.L$0
            kotlin.jvm.internal.g0 r14 = (kotlin.jvm.internal.C12762g0) r14
            p336ef.C11910n.m25701b(r1)
            r15 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r14
            r14 = 3
            goto L_0x01c1
        L_0x0099:
            java.lang.Object r0 = r2.L$2
            androidx.compose.foundation.gestures.Orientation r0 = (androidx.compose.foundation.gestures.Orientation) r0
            java.lang.Object r4 = r2.L$1
            androidx.compose.ui.input.pointer.util.VelocityTracker r4 = (androidx.compose.p002ui.input.pointer.util.VelocityTracker) r4
            java.lang.Object r5 = r2.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r5
            p336ef.C11910n.m25701b(r1)
            goto L_0x0150
        L_0x00aa:
            java.lang.Object r0 = r2.L$4
            androidx.compose.foundation.gestures.Orientation r0 = (androidx.compose.foundation.gestures.Orientation) r0
            java.lang.Object r4 = r2.L$3
            androidx.compose.ui.input.pointer.util.VelocityTracker r4 = (androidx.compose.p002ui.input.pointer.util.VelocityTracker) r4
            java.lang.Object r5 = r2.L$2
            androidx.compose.runtime.State r5 = (androidx.compose.runtime.State) r5
            java.lang.Object r6 = r2.L$1
            androidx.compose.runtime.State r6 = (androidx.compose.runtime.State) r6
            java.lang.Object r9 = r2.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r9
            p336ef.C11910n.m25701b(r1)
            r18 = r9
            r9 = r0
            r0 = r18
            r19 = r6
            r6 = r4
            r4 = r19
            goto L_0x00ec
        L_0x00cc:
            p336ef.C11910n.m25701b(r1)
            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p002ui.input.pointer.PointerEventPass.Initial
            r2.L$0 = r0
            r4 = r21
            r2.L$1 = r4
            r5 = r22
            r2.L$2 = r5
            r6 = r23
            r2.L$3 = r6
            r9 = r24
            r2.L$4 = r9
            r2.label = r10
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(r0, r8, r1, r2)
            if (r1 != r3) goto L_0x00ec
            return r3
        L_0x00ec:
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r1
            java.lang.Object r4 = r4.getValue()
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r4 = r4.invoke(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x0102
            goto L_0x02ee
        L_0x0102:
            java.lang.Object r4 = r5.getValue()
            of.a r4 = (p404of.C13074a) r4
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x012a
            r1.consume()
            androidx.compose.p002ui.input.pointer.util.VelocityTrackerKt.addPointerInputChange(r6, r1)
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.p002ui.geometry.Offset.Companion
            long r2 = r0.m35438getZeroF1C5BW0()
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r2)
            ef.l r11 = p336ef.C11915r.m25707a(r1, r0)
            goto L_0x02ee
        L_0x012a:
            r1 = 0
            r4 = 0
            r5 = 2
            r12 = 0
            r2.L$0 = r0
            r2.L$1 = r6
            r2.L$2 = r9
            r2.L$3 = r11
            r2.L$4 = r11
            r2.label = r7
            r20 = r0
            r21 = r1
            r22 = r4
            r23 = r2
            r24 = r5
            r25 = r12
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r20, r21, r22, r23, r24, r25)
            if (r1 != r3) goto L_0x014d
            return r3
        L_0x014d:
            r5 = r0
            r4 = r6
            r0 = r9
        L_0x0150:
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r1
            androidx.compose.p002ui.input.pointer.util.VelocityTrackerKt.addPointerInputChange(r4, r1)
            kotlin.jvm.internal.g0 r6 = new kotlin.jvm.internal.g0
            r6.<init>()
            androidx.compose.ui.geometry.Offset$Companion r7 = androidx.compose.p002ui.geometry.Offset.Companion
            long r12 = r7.m35438getZeroF1C5BW0()
            r6.f20418b = r12
            androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1 r7 = new androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1
            r7.<init>(r4, r6)
            long r12 = r1.m37168getIdJ3iCeTQ()
            int r1 = r1.m37172getTypeT8wyACA()
            androidx.compose.foundation.gestures.PointerDirectionConfig r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.toPointerDirectionConfig(r0)
            androidx.compose.ui.input.pointer.PointerEvent r4 = r5.getCurrentEvent()
            boolean r4 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m33064isPointerUpDmW0f2w(r4, r12)
            if (r4 == 0) goto L_0x0180
            r13 = r11
            goto L_0x02e0
        L_0x0180:
            androidx.compose.ui.platform.ViewConfiguration r4 = r5.getViewConfiguration()
            float r1 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m33065pointerSlopE8SPZFQ(r4, r1)
            kotlin.jvm.internal.g0 r4 = new kotlin.jvm.internal.g0
            r4.<init>()
            r4.f20418b = r12
            r9 = r6
            r12 = r7
            r13 = r10
            r6 = 0
            r7 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = 0
        L_0x0199:
            r3.L$0 = r9
            r3.L$1 = r12
            r3.L$2 = r7
            r3.L$3 = r0
            r3.L$4 = r5
            r3.L$5 = r11
            r3.I$0 = r13
            r3.F$0 = r2
            r3.F$1 = r6
            r3.F$2 = r1
            r14 = 3
            r3.label = r14
            java.lang.Object r15 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r7, r11, r3, r10, r11)
            if (r15 != r4) goto L_0x01b7
            return r4
        L_0x01b7:
            r18 = r2
            r2 = r1
            r1 = r15
            r15 = r13
            r13 = r12
            r12 = r7
            r7 = r5
            r5 = r18
        L_0x01c1:
            androidx.compose.ui.input.pointer.PointerEvent r1 = (androidx.compose.p002ui.input.pointer.PointerEvent) r1
            java.util.List r8 = r1.getChanges()
            int r10 = r8.size()
            r11 = 0
        L_0x01cc:
            if (r11 >= r10) goto L_0x01f3
            java.lang.Object r16 = r8.get(r11)
            r17 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r17 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r17
            r21 = r15
            long r14 = r17.m37168getIdJ3iCeTQ()
            r17 = r12
            r22 = r13
            long r12 = r7.f20418b
            boolean r12 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r14, r12)
            if (r12 == 0) goto L_0x01e9
            goto L_0x01fb
        L_0x01e9:
            int r11 = r11 + 1
            r15 = r21
            r13 = r22
            r12 = r17
            r14 = 3
            goto L_0x01cc
        L_0x01f3:
            r17 = r12
            r22 = r13
            r21 = r15
            r16 = 0
        L_0x01fb:
            r13 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r13
            if (r13 != 0) goto L_0x0203
            goto L_0x02a5
        L_0x0203:
            boolean r8 = r13.isConsumed()
            if (r8 == 0) goto L_0x020b
            goto L_0x02a5
        L_0x020b:
            boolean r8 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r13)
            if (r8 == 0) goto L_0x0245
            java.util.List r1 = r1.getChanges()
            int r8 = r1.size()
            r10 = 0
        L_0x021a:
            if (r10 >= r8) goto L_0x022d
            java.lang.Object r11 = r1.get(r10)
            r12 = r11
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r12
            boolean r12 = r12.getPressed()
            if (r12 == 0) goto L_0x022a
            goto L_0x022e
        L_0x022a:
            int r10 = r10 + 1
            goto L_0x021a
        L_0x022d:
            r11 = 0
        L_0x022e:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            if (r11 != 0) goto L_0x0234
            goto L_0x02a5
        L_0x0234:
            long r10 = r11.m37168getIdJ3iCeTQ()
            r7.f20418b = r10
            r13 = r21
            r12 = r22
            r1 = r2
            r2 = r5
            r5 = r7
            r7 = r17
            goto L_0x02a9
        L_0x0245:
            long r10 = r13.m37169getPositionF1C5BW0()
            long r14 = r13.m37170getPreviousPositionF1C5BW0()
            float r1 = r0.m33091mainAxisDeltak4lQ0M(r10)
            float r8 = r0.m33091mainAxisDeltak4lQ0M(r14)
            float r1 = r1 - r8
            float r8 = r0.m33090crossAxisDeltak4lQ0M(r10)
            float r10 = r0.m33090crossAxisDeltak4lQ0M(r14)
            float r8 = r8 - r10
            float r1 = r1 + r6
            float r2 = r2 + r8
            if (r21 == 0) goto L_0x0268
            float r6 = java.lang.Math.abs(r1)
            goto L_0x0270
        L_0x0268:
            long r10 = r0.m33092offsetFromChangesdBAh8RU(r1, r2)
            float r6 = androidx.compose.p002ui.geometry.Offset.m35420getDistanceimpl(r10)
        L_0x0270:
            int r8 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x02ae
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final
            r3.L$0 = r9
            r12 = r22
            r3.L$1 = r12
            r8 = r17
            r3.L$2 = r8
            r3.L$3 = r0
            r3.L$4 = r7
            r3.L$5 = r13
            r10 = r21
            r3.I$0 = r10
            r3.F$0 = r5
            r3.F$1 = r1
            r3.F$2 = r2
            r11 = 4
            r3.label = r11
            java.lang.Object r6 = r8.awaitPointerEvent(r6, r3)
            if (r6 != r4) goto L_0x029a
            return r4
        L_0x029a:
            r6 = r1
            r1 = r2
            r2 = r5
            r5 = r7
            r7 = r8
        L_0x029f:
            boolean r8 = r13.isConsumed()
            if (r8 == 0) goto L_0x02a8
        L_0x02a5:
            r6 = r9
            r13 = 0
            goto L_0x02e0
        L_0x02a8:
            r13 = r10
        L_0x02a9:
            r8 = 0
            r10 = 1
            r11 = 0
            goto L_0x0199
        L_0x02ae:
            r10 = r21
            r12 = r22
            r8 = r17
            r11 = 4
            if (r10 == 0) goto L_0x02c2
            float r6 = java.lang.Math.signum(r1)
            float r6 = r6 * r5
            float r1 = r1 - r6
            long r1 = r0.m33092offsetFromChangesdBAh8RU(r1, r2)
            goto L_0x02d2
        L_0x02c2:
            long r1 = r0.m33092offsetFromChangesdBAh8RU(r1, r2)
            long r14 = androidx.compose.p002ui.geometry.Offset.m35417divtuRUvjQ(r1, r6)
            long r14 = androidx.compose.p002ui.geometry.Offset.m35429timestuRUvjQ(r14, r5)
            long r1 = androidx.compose.p002ui.geometry.Offset.m35426minusMKHz9U(r1, r14)
        L_0x02d2:
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r1)
            r12.invoke(r13, r1)
            boolean r1 = r13.isConsumed()
            if (r1 == 0) goto L_0x02ef
            r6 = r9
        L_0x02e0:
            if (r13 == 0) goto L_0x02ed
            long r0 = r6.f20418b
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r0)
            ef.l r11 = p336ef.C11915r.m25707a(r13, r0)
            goto L_0x02ee
        L_0x02ed:
            r11 = 0
        L_0x02ee:
            return r11
        L_0x02ef:
            r2 = r5
            r5 = r7
            r7 = r8
            r13 = r10
            r1 = 0
            r6 = 0
            goto L_0x02a9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.ui.input.pointer.util.VelocityTracker, androidx.compose.foundation.gestures.Orientation, hf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* renamed from: awaitDrag-Su4bsnU  reason: not valid java name */
    public static final Object m33081awaitDragSu4bsnU(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, long j, VelocityTracker velocityTracker, C10915s<? super DragEvent> sVar, boolean z, Orientation orientation, C12074d<? super Boolean> dVar) {
        long j2;
        C10915s<? super DragEvent> sVar2 = sVar;
        boolean z2 = z;
        sVar.mo45894m(new DragEvent.DragStarted(Offset.m35426minusMKHz9U(pointerInputChange.m37169getPositionF1C5BW0(), OffsetKt.Offset(Offset.m35422getXimpl(j) * Math.signum(Offset.m35422getXimpl(pointerInputChange.m37169getPositionF1C5BW0())), Offset.m35423getYimpl(j) * Math.signum(Offset.m35423getYimpl(pointerInputChange.m37169getPositionF1C5BW0())))), (DefaultConstructorMarker) null));
        if (z2) {
            long j3 = j;
            j2 = Offset.m35429timestuRUvjQ(j, -1.0f);
        } else {
            j2 = j;
        }
        sVar.mo45894m(new DragEvent.DragDelta(j2, (DefaultConstructorMarker) null));
        VelocityTracker velocityTracker2 = velocityTracker;
        return m33082onDragOrUpAxegvzg(awaitPointerEventScope, orientation, pointerInputChange.m37168getIdJ3iCeTQ(), new DraggableKt$awaitDrag$2(velocityTracker, sVar, z), dVar);
    }

    public static final Modifier draggable(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, C13089p<? super C13995l0, ? super Offset, ? super C12074d<? super C11921v>, ? extends Object> pVar, C13089p<? super C13995l0, ? super Float, ? super C12074d<? super C11921v>, ? extends Object> pVar2, boolean z3) {
        C13089p<? super C13995l0, ? super Float, ? super C12074d<? super C11921v>, ? extends Object> pVar3 = pVar2;
        Modifier modifier2 = modifier;
        C12775o.m28639i(modifier, "<this>");
        DraggableState draggableState2 = draggableState;
        C12775o.m28639i(draggableState, "state");
        C12775o.m28639i(orientation, "orientation");
        C13089p<? super C13995l0, ? super Offset, ? super C12074d<? super C11921v>, ? extends Object> pVar4 = pVar;
        C12775o.m28639i(pVar4, "onDragStarted");
        C12775o.m28639i(pVar3, "onDragStopped");
        DraggableKt$draggable$3 draggableKt$draggable$3 = DraggableKt$draggable$3.INSTANCE;
        boolean z4 = z2;
        DraggableKt$draggable$4 draggableKt$draggable$4 = new DraggableKt$draggable$4(z2);
        DraggableKt$draggable$5 draggableKt$draggable$5 = new DraggableKt$draggable$5(pVar3, orientation, (C12074d<? super DraggableKt$draggable$5>) null);
        return draggable(modifier, draggableState, draggableKt$draggable$3, orientation, z, mutableInteractionSource, draggableKt$draggable$4, pVar4, draggableKt$draggable$5, z3);
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, C13089p pVar, C13089p pVar2, boolean z3, int i, Object obj) {
        int i2 = i;
        return draggable(modifier, draggableState, orientation, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? null : mutableInteractionSource, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? new DraggableKt$draggable$1((C12074d<? super DraggableKt$draggable$1>) null) : pVar, (i2 & 64) != 0 ? new DraggableKt$draggable$2((C12074d<? super DraggableKt$draggable$2>) null) : pVar2, (i2 & 128) != 0 ? false : z3);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0113, code lost:
        if ((!r0) != false) goto L_0x0115;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: onDragOrUp-Axegvzg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33082onDragOrUpAxegvzg(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r17, androidx.compose.foundation.gestures.Orientation r18, long r19, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.input.pointer.PointerInputChange, p336ef.C11921v> r21, p355hf.C12074d<? super java.lang.Boolean> r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1 r1 = (androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1 r1 = new androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = p362if.C12150d.m26492c()
            int r3 = r1.label
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x004e
            if (r3 != r5) goto L_0x0046
            java.lang.Object r3 = r1.L$4
            kotlin.jvm.internal.g0 r3 = (kotlin.jvm.internal.C12762g0) r3
            java.lang.Object r7 = r1.L$3
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r7
            java.lang.Object r8 = r1.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r8
            java.lang.Object r9 = r1.L$1
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r1.L$0
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            p336ef.C11910n.m25701b(r0)
            r16 = r3
            r3 = r1
            r1 = r10
            r10 = r16
            goto L_0x009a
        L_0x0046:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004e:
            p336ef.C11910n.m25701b(r0)
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            r3 = r18
            if (r3 != r0) goto L_0x005a
            androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$motionFromChange$1 r0 = androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$motionFromChange$1.INSTANCE
            goto L_0x005c
        L_0x005a:
            androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$motionFromChange$2 r0 = androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$motionFromChange$2.INSTANCE
        L_0x005c:
            androidx.compose.ui.input.pointer.PointerEvent r3 = r17.getCurrentEvent()
            r7 = r19
            boolean r3 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m33064isPointerUpDmW0f2w(r3, r7)
            if (r3 == 0) goto L_0x006e
            r1 = r21
            r4 = r5
            r14 = r6
            goto L_0x0126
        L_0x006e:
            r3 = r1
            r9 = r2
            r1 = r21
            r2 = r0
            r0 = r17
        L_0x0075:
            kotlin.jvm.internal.g0 r10 = new kotlin.jvm.internal.g0
            r10.<init>()
            r10.f20418b = r7
            r7 = r0
            r16 = r9
            r9 = r2
            r2 = r16
        L_0x0082:
            r3.L$0 = r1
            r3.L$1 = r9
            r3.L$2 = r0
            r3.L$3 = r7
            r3.L$4 = r10
            r3.label = r5
            java.lang.Object r8 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r7, r6, r3, r5, r6)
            if (r8 != r2) goto L_0x0095
            return r2
        L_0x0095:
            r16 = r8
            r8 = r0
            r0 = r16
        L_0x009a:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.p002ui.input.pointer.PointerEvent) r0
            java.util.List r11 = r0.getChanges()
            int r12 = r11.size()
            r13 = 0
        L_0x00a5:
            if (r13 >= r12) goto L_0x00c4
            java.lang.Object r14 = r11.get(r13)
            r15 = r14
            androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r15
            r17 = r7
            long r6 = r15.m37168getIdJ3iCeTQ()
            long r4 = r10.f20418b
            boolean r4 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r6, r4)
            if (r4 == 0) goto L_0x00bd
            goto L_0x00c7
        L_0x00bd:
            int r13 = r13 + 1
            r5 = 1
            r6 = 0
            r7 = r17
            goto L_0x00a5
        L_0x00c4:
            r17 = r7
            r14 = 0
        L_0x00c7:
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r14
            if (r14 != 0) goto L_0x00ce
            r4 = 1
            r14 = 0
            goto L_0x0115
        L_0x00ce:
            boolean r4 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r14)
            if (r4 == 0) goto L_0x00ff
            java.util.List r0 = r0.getChanges()
            int r4 = r0.size()
            r5 = 0
        L_0x00dd:
            if (r5 >= r4) goto L_0x00f0
            java.lang.Object r6 = r0.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r7
            boolean r7 = r7.getPressed()
            if (r7 == 0) goto L_0x00ed
            goto L_0x00f1
        L_0x00ed:
            int r5 = r5 + 1
            goto L_0x00dd
        L_0x00f0:
            r6 = 0
        L_0x00f1:
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r6
            if (r6 != 0) goto L_0x00f7
            r4 = 1
            goto L_0x0115
        L_0x00f7:
            long r4 = r6.m37168getIdJ3iCeTQ()
            r10.f20418b = r4
            r4 = 1
            goto L_0x014a
        L_0x00ff:
            java.lang.Object r0 = r9.invoke(r14)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0110
            r0 = 1
            goto L_0x0111
        L_0x0110:
            r0 = 0
        L_0x0111:
            r4 = 1
            r0 = r0 ^ r4
            if (r0 == 0) goto L_0x014a
        L_0x0115:
            if (r14 != 0) goto L_0x0119
        L_0x0117:
            r14 = 0
            goto L_0x0126
        L_0x0119:
            boolean r0 = r14.isConsumed()
            if (r0 == 0) goto L_0x0120
            goto L_0x0117
        L_0x0120:
            boolean r0 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r14)
            if (r0 == 0) goto L_0x0138
        L_0x0126:
            if (r14 == 0) goto L_0x012e
            r1.invoke(r14)
            ef.v r6 = p336ef.C11921v.f18618a
            goto L_0x012f
        L_0x012e:
            r6 = 0
        L_0x012f:
            if (r6 == 0) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r4 = 0
        L_0x0133:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.C12735b.m28558a(r4)
            return r0
        L_0x0138:
            r1.invoke(r14)
            long r5 = r14.m37168getIdJ3iCeTQ()
            r0 = r8
            r7 = r5
            r6 = 0
            r5 = r4
            r16 = r9
            r9 = r2
            r2 = r16
            goto L_0x0075
        L_0x014a:
            r7 = r17
            r5 = r4
            r0 = r8
            r6 = 0
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m33082onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.Orientation, long, kotlin.jvm.functions.Function1, hf.d):java.lang.Object");
    }

    @Composable
    public static final DraggableState rememberDraggableState(Function1<? super Float, C11921v> function1, Composer composer, int i) {
        C12775o.m28639i(function1, "onDelta");
        composer.startReplaceableGroup(-183245213);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:138)");
        }
        State<T> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, i & 14);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = DraggableState(new DraggableKt$rememberDraggableState$1$1(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState = (DraggableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return draggableState;
    }

    /* access modifiers changed from: private */
    /* renamed from: toFloat-3MmeM6k  reason: not valid java name */
    public static final float m33083toFloat3MmeM6k(long j, Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            return Offset.m35423getYimpl(j);
        }
        return Offset.m35422getXimpl(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: toFloat-sF-c-tU  reason: not valid java name */
    public static final float m33084toFloatsFctU(long j, Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            return Velocity.m38694getYimpl(j);
        }
        return Velocity.m38693getXimpl(j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v8, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.Modifier draggable(androidx.compose.p002ui.Modifier r16, androidx.compose.foundation.gestures.DraggableState r17, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.input.pointer.PointerInputChange, java.lang.Boolean> r18, androidx.compose.foundation.gestures.Orientation r19, boolean r20, androidx.compose.foundation.interaction.MutableInteractionSource r21, p404of.C13074a<java.lang.Boolean> r22, p404of.C13089p<? super p466yf.C13995l0, ? super androidx.compose.p002ui.geometry.Offset, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object> r23, p404of.C13089p<? super p466yf.C13995l0, ? super androidx.compose.p002ui.unit.Velocity, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object> r24, boolean r25) {
        /*
            r0 = r16
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r0, r1)
            java.lang.String r1 = "state"
            r12 = r17
            kotlin.jvm.internal.C12775o.m28639i(r12, r1)
            java.lang.String r1 = "canDrag"
            r13 = r18
            kotlin.jvm.internal.C12775o.m28639i(r13, r1)
            java.lang.String r1 = "orientation"
            r14 = r19
            kotlin.jvm.internal.C12775o.m28639i(r14, r1)
            java.lang.String r1 = "startDragImmediately"
            r15 = r22
            kotlin.jvm.internal.C12775o.m28639i(r15, r1)
            java.lang.String r1 = "onDragStarted"
            r11 = r23
            kotlin.jvm.internal.C12775o.m28639i(r11, r1)
            java.lang.String r1 = "onDragStopped"
            r10 = r24
            kotlin.jvm.internal.C12775o.m28639i(r10, r1)
            boolean r1 = androidx.compose.p002ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r1 == 0) goto L_0x0050
            androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r25
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0054
        L_0x0050:
            kotlin.jvm.functions.Function1 r1 = androidx.compose.p002ui.platform.InspectableValueKt.getNoInspectorInfo()
        L_0x0054:
            androidx.compose.foundation.gestures.DraggableKt$draggable$9 r11 = new androidx.compose.foundation.gestures.DraggableKt$draggable$9
            r2 = r11
            r3 = r21
            r4 = r22
            r5 = r18
            r6 = r23
            r7 = r24
            r8 = r17
            r9 = r19
            r10 = r20
            r12 = r11
            r11 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.ComposedModifierKt.composed(r0, r1, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.draggable(androidx.compose.ui.Modifier, androidx.compose.foundation.gestures.DraggableState, kotlin.jvm.functions.Function1, androidx.compose.foundation.gestures.Orientation, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, of.a, of.p, of.p, boolean):androidx.compose.ui.Modifier");
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Function1 function1, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, C13074a aVar, C13089p pVar, C13089p pVar2, boolean z2, int i, Object obj) {
        int i2 = i;
        return draggable(modifier, draggableState, function1, orientation, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? null : mutableInteractionSource, aVar, (i2 & 64) != 0 ? new DraggableKt$draggable$6((C12074d<? super DraggableKt$draggable$6>) null) : pVar, (i2 & 128) != 0 ? new DraggableKt$draggable$7((C12074d<? super DraggableKt$draggable$7>) null) : pVar2, (i2 & 256) != 0 ? false : z2);
    }
}
