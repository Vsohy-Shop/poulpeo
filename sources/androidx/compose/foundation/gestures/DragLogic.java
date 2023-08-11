package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.unit.Velocity;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13089p;
import p466yf.C13995l0;

/* compiled from: Draggable.kt */
final class DragLogic {
    private final MutableState<DragInteraction.Start> dragStartInteraction;
    private final MutableInteractionSource interactionSource;
    private final C13089p<C13995l0, Offset, C12074d<? super C11921v>, Object> onDragStarted;
    private final C13089p<C13995l0, Velocity, C12074d<? super C11921v>, Object> onDragStopped;

    public DragLogic(C13089p<? super C13995l0, ? super Offset, ? super C12074d<? super C11921v>, ? extends Object> pVar, C13089p<? super C13995l0, ? super Velocity, ? super C12074d<? super C11921v>, ? extends Object> pVar2, MutableState<DragInteraction.Start> mutableState, MutableInteractionSource mutableInteractionSource) {
        C12775o.m28639i(pVar, "onDragStarted");
        C12775o.m28639i(pVar2, "onDragStopped");
        C12775o.m28639i(mutableState, "dragStartInteraction");
        this.onDragStarted = pVar;
        this.onDragStopped = pVar2;
        this.dragStartInteraction = mutableState;
        this.interactionSource = mutableInteractionSource;
    }

    public final MutableState<DragInteraction.Start> getDragStartInteraction() {
        return this.dragStartInteraction;
    }

    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final C13089p<C13995l0, Offset, C12074d<? super C11921v>, Object> getOnDragStarted() {
        return this.onDragStarted;
    }

    public final C13089p<C13995l0, Velocity, C12074d<? super C11921v>, Object> getOnDragStopped() {
        return this.onDragStopped;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object processDragCancel(p466yf.C13995l0 r9, p355hf.C12074d<? super p336ef.C11921v> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.DragLogic$processDragCancel$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.foundation.gestures.DragLogic$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragCancel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragLogic$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragCancel$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            p336ef.C11910n.m25701b(r10)
            goto L_0x0085
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0035:
            java.lang.Object r9 = r0.L$1
            yf.l0 r9 = (p466yf.C13995l0) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            p336ef.C11910n.m25701b(r10)
            goto L_0x0065
        L_0x0041:
            p336ef.C11910n.m25701b(r10)
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r10 = r8.dragStartInteraction
            java.lang.Object r10 = r10.getValue()
            androidx.compose.foundation.interaction.DragInteraction$Start r10 = (androidx.compose.foundation.interaction.DragInteraction.Start) r10
            if (r10 == 0) goto L_0x006b
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r8.interactionSource
            if (r2 == 0) goto L_0x0064
            androidx.compose.foundation.interaction.DragInteraction$Cancel r6 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r6.<init>(r10)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r2.emit(r6, r0)
            if (r10 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r2 = r8
        L_0x0065:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r10 = r2.dragStartInteraction
            r10.setValue(r5)
            goto L_0x006c
        L_0x006b:
            r2 = r8
        L_0x006c:
            of.p<yf.l0, androidx.compose.ui.unit.Velocity, hf.d<? super ef.v>, java.lang.Object> r10 = r2.onDragStopped
            androidx.compose.ui.unit.Velocity$Companion r2 = androidx.compose.p002ui.unit.Velocity.Companion
            long r6 = r2.m38704getZero9UxMQ8M()
            androidx.compose.ui.unit.Velocity r2 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r6)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r10.invoke(r9, r2, r0)
            if (r9 != r1) goto L_0x0085
            return r1
        L_0x0085:
            ef.v r9 = p336ef.C11921v.f18618a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.processDragCancel(yf.l0, hf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object processDragStart(p466yf.C13995l0 r9, androidx.compose.foundation.gestures.DragEvent.DragStarted r10, p355hf.C12074d<? super p336ef.C11921v> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.DragLogic$processDragStart$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.foundation.gestures.DragLogic$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragStart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragLogic$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragStart$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005f
            if (r2 == r5) goto L_0x004c
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            p336ef.C11910n.m25701b(r11)
            goto L_0x00c6
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            java.lang.Object r9 = r0.L$3
            androidx.compose.foundation.interaction.DragInteraction$Start r9 = (androidx.compose.foundation.interaction.DragInteraction.Start) r9
            java.lang.Object r10 = r0.L$2
            androidx.compose.foundation.gestures.DragEvent$DragStarted r10 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r10
            java.lang.Object r2 = r0.L$1
            yf.l0 r2 = (p466yf.C13995l0) r2
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r4 = (androidx.compose.foundation.gestures.DragLogic) r4
            p336ef.C11910n.m25701b(r11)
            goto L_0x00a2
        L_0x004c:
            java.lang.Object r9 = r0.L$2
            androidx.compose.foundation.gestures.DragEvent$DragStarted r9 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r9
            java.lang.Object r10 = r0.L$1
            yf.l0 r10 = (p466yf.C13995l0) r10
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            p336ef.C11910n.m25701b(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x0085
        L_0x005f:
            p336ef.C11910n.m25701b(r11)
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r11 = r8.dragStartInteraction
            java.lang.Object r11 = r11.getValue()
            androidx.compose.foundation.interaction.DragInteraction$Start r11 = (androidx.compose.foundation.interaction.DragInteraction.Start) r11
            if (r11 == 0) goto L_0x0084
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r8.interactionSource
            if (r2 == 0) goto L_0x0084
            androidx.compose.foundation.interaction.DragInteraction$Cancel r6 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r6.<init>(r11)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r5
            java.lang.Object r11 = r2.emit(r6, r0)
            if (r11 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r2 = r8
        L_0x0085:
            androidx.compose.foundation.interaction.DragInteraction$Start r11 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r11.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = r2.interactionSource
            if (r5 == 0) goto L_0x00a5
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r11
            r0.label = r4
            java.lang.Object r4 = r5.emit(r11, r0)
            if (r4 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r4 = r2
            r2 = r9
            r9 = r11
        L_0x00a2:
            r11 = r9
            r9 = r2
            r2 = r4
        L_0x00a5:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r4 = r2.dragStartInteraction
            r4.setValue(r11)
            of.p<yf.l0, androidx.compose.ui.geometry.Offset, hf.d<? super ef.v>, java.lang.Object> r11 = r2.onDragStarted
            long r4 = r10.m33044getStartPointF1C5BW0()
            androidx.compose.ui.geometry.Offset r10 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r4)
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r3
            java.lang.Object r9 = r11.invoke(r9, r10, r0)
            if (r9 != r1) goto L_0x00c6
            return r1
        L_0x00c6:
            ef.v r9 = p336ef.C11921v.f18618a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.processDragStart(yf.l0, androidx.compose.foundation.gestures.DragEvent$DragStarted, hf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object processDragStop(p466yf.C13995l0 r10, androidx.compose.foundation.gestures.DragEvent.DragStopped r11, p355hf.C12074d<? super p336ef.C11921v> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragLogic$processDragStop$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.foundation.gestures.DragLogic$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragStop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragLogic$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragStop$1
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0048
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            p336ef.C11910n.m25701b(r12)
            goto L_0x008e
        L_0x002d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0035:
            java.lang.Object r10 = r0.L$2
            androidx.compose.foundation.gestures.DragEvent$DragStopped r10 = (androidx.compose.foundation.gestures.DragEvent.DragStopped) r10
            java.lang.Object r11 = r0.L$1
            yf.l0 r11 = (p466yf.C13995l0) r11
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            p336ef.C11910n.m25701b(r12)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x006e
        L_0x0048:
            p336ef.C11910n.m25701b(r12)
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r12 = r9.dragStartInteraction
            java.lang.Object r12 = r12.getValue()
            androidx.compose.foundation.interaction.DragInteraction$Start r12 = (androidx.compose.foundation.interaction.DragInteraction.Start) r12
            if (r12 == 0) goto L_0x0074
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r9.interactionSource
            if (r2 == 0) goto L_0x006d
            androidx.compose.foundation.interaction.DragInteraction$Stop r6 = new androidx.compose.foundation.interaction.DragInteraction$Stop
            r6.<init>(r12)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r4
            java.lang.Object r12 = r2.emit(r6, r0)
            if (r12 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r2 = r9
        L_0x006e:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r12 = r2.dragStartInteraction
            r12.setValue(r5)
            goto L_0x0075
        L_0x0074:
            r2 = r9
        L_0x0075:
            of.p<yf.l0, androidx.compose.ui.unit.Velocity, hf.d<? super ef.v>, java.lang.Object> r12 = r2.onDragStopped
            long r6 = r11.m33045getVelocity9UxMQ8M()
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r6)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r10 = r12.invoke(r10, r11, r0)
            if (r10 != r1) goto L_0x008e
            return r1
        L_0x008e:
            ef.v r10 = p336ef.C11921v.f18618a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.processDragStop(yf.l0, androidx.compose.foundation.gestures.DragEvent$DragStopped, hf.d):java.lang.Object");
    }
}
