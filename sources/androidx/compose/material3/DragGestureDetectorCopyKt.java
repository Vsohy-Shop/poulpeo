package androidx.compose.material3;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerEvent;
import androidx.compose.p002ui.input.pointer.PointerEventKt;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.input.pointer.PointerId;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import androidx.compose.p002ui.input.pointer.PointerType;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.C1232Dp;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

/* compiled from: DragGestureDetectorCopy.kt */
public final class DragGestureDetectorCopyKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    static {
        float r0 = C1232Dp.m38468constructorimpl((float) 0.125d);
        mouseSlop = r0;
        float r1 = C1232Dp.m38468constructorimpl((float) 18);
        defaultTouchSlop = r1;
        mouseToTouchSlopRatio = r0 / r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m34396awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r19, long r20, int r22, p404of.C13088o<? super androidx.compose.p002ui.input.pointer.PointerInputChange, ? super java.lang.Float, p336ef.C11921v> r23, p355hf.C12074d<? super androidx.compose.p002ui.input.pointer.PointerInputChange> r24) {
        /*
            r0 = r20
            r2 = r24
            boolean r3 = r2 instanceof androidx.compose.material3.C0846x2966ccbb
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.material3.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 r3 = (androidx.compose.material3.C0846x2966ccbb) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.material3.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 r3 = new androidx.compose.material3.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = p362if.C12150d.m26492c()
            int r5 = r3.label
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0073
            if (r5 == r8) goto L_0x0055
            if (r5 != r7) goto L_0x004d
            float r0 = r3.F$1
            float r1 = r3.F$0
            java.lang.Object r5 = r3.L$3
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r5
            java.lang.Object r10 = r3.L$2
            kotlin.jvm.internal.g0 r10 = (kotlin.jvm.internal.C12762g0) r10
            java.lang.Object r11 = r3.L$1
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r11
            java.lang.Object r12 = r3.L$0
            of.o r12 = (p404of.C13088o) r12
            p336ef.C11910n.m25701b(r2)
            r2 = r0
            r0 = r11
            r11 = r10
            r10 = r4
            r4 = r3
            r3 = r1
            r1 = r12
            goto L_0x015d
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0055:
            float r0 = r3.F$1
            float r1 = r3.F$0
            java.lang.Object r5 = r3.L$2
            kotlin.jvm.internal.g0 r5 = (kotlin.jvm.internal.C12762g0) r5
            java.lang.Object r10 = r3.L$1
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r10
            java.lang.Object r11 = r3.L$0
            of.o r11 = (p404of.C13088o) r11
            p336ef.C11910n.m25701b(r2)
            r18 = r3
            r3 = r0
            r0 = r10
            r10 = r4
            r4 = r1
            r1 = r11
            r11 = r5
            r5 = r18
            goto L_0x00ba
        L_0x0073:
            p336ef.C11910n.m25701b(r2)
            androidx.compose.ui.input.pointer.PointerEvent r2 = r19.getCurrentEvent()
            boolean r2 = m34398isPointerUpDmW0f2w(r2, r0)
            if (r2 == 0) goto L_0x0082
            goto L_0x0180
        L_0x0082:
            androidx.compose.ui.platform.ViewConfiguration r2 = r19.getViewConfiguration()
            r5 = r22
            float r2 = m34399pointerSlopE8SPZFQ(r2, r5)
            kotlin.jvm.internal.g0 r5 = new kotlin.jvm.internal.g0
            r5.<init>()
            r5.f20418b = r0
            r0 = r19
            r1 = r23
            r10 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = 0
        L_0x009c:
            r4.L$0 = r1
            r4.L$1 = r0
            r4.L$2 = r10
            r4.L$3 = r9
            r4.F$0 = r3
            r4.F$1 = r2
            r4.label = r8
            java.lang.Object r11 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r0, r9, r4, r8, r9)
            if (r11 != r5) goto L_0x00b1
            return r5
        L_0x00b1:
            r18 = r3
            r3 = r2
            r2 = r11
            r11 = r10
            r10 = r5
            r5 = r4
            r4 = r18
        L_0x00ba:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.p002ui.input.pointer.PointerEvent) r2
            java.util.List r12 = r2.getChanges()
            int r13 = r12.size()
            r14 = 0
            r15 = r14
        L_0x00c6:
            if (r15 >= r13) goto L_0x00e3
            java.lang.Object r16 = r12.get(r15)
            r17 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r17 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r17
            long r8 = r17.m37168getIdJ3iCeTQ()
            long r6 = r11.f20418b
            boolean r6 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r8, r6)
            if (r6 == 0) goto L_0x00dd
            goto L_0x00e5
        L_0x00dd:
            int r15 = r15 + 1
            r7 = 2
            r8 = 1
            r9 = 0
            goto L_0x00c6
        L_0x00e3:
            r16 = 0
        L_0x00e5:
            kotlin.jvm.internal.C12775o.m28636f(r16)
            r6 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r6
            boolean r7 = r6.isConsumed()
            if (r7 == 0) goto L_0x00f4
            goto L_0x0163
        L_0x00f4:
            boolean r7 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r6)
            if (r7 == 0) goto L_0x0128
            java.util.List r2 = r2.getChanges()
            int r6 = r2.size()
        L_0x0102:
            if (r14 >= r6) goto L_0x0115
            java.lang.Object r7 = r2.get(r14)
            r8 = r7
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r8
            boolean r8 = r8.getPressed()
            if (r8 == 0) goto L_0x0112
            goto L_0x0116
        L_0x0112:
            int r14 = r14 + 1
            goto L_0x0102
        L_0x0115:
            r7 = 0
        L_0x0116:
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r7
            if (r7 != 0) goto L_0x011b
            goto L_0x0163
        L_0x011b:
            long r6 = r7.m37168getIdJ3iCeTQ()
            r11.f20418b = r6
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r10
            r10 = r11
            r7 = 2
            goto L_0x0167
        L_0x0128:
            long r7 = r6.m37169getPositionF1C5BW0()
            long r12 = r6.m37170getPreviousPositionF1C5BW0()
            float r2 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r7)
            float r7 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r12)
            float r2 = r2 - r7
            float r2 = r2 + r3
            float r3 = java.lang.Math.abs(r2)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x016b
            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final
            r5.L$0 = r1
            r5.L$1 = r0
            r5.L$2 = r11
            r5.L$3 = r6
            r5.F$0 = r4
            r5.F$1 = r2
            r7 = 2
            r5.label = r7
            java.lang.Object r3 = r0.awaitPointerEvent(r3, r5)
            if (r3 != r10) goto L_0x015a
            return r10
        L_0x015a:
            r3 = r4
            r4 = r5
            r5 = r6
        L_0x015d:
            boolean r5 = r5.isConsumed()
            if (r5 == 0) goto L_0x0165
        L_0x0163:
            r9 = 0
            goto L_0x0180
        L_0x0165:
            r5 = r10
            r10 = r11
        L_0x0167:
            r8 = 1
            r9 = 0
            goto L_0x009c
        L_0x016b:
            r7 = 2
            float r3 = java.lang.Math.signum(r2)
            float r3 = r3 * r4
            float r2 = r2 - r3
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r2)
            r1.invoke(r6, r2)
            boolean r2 = r6.isConsumed()
            if (r2 == 0) goto L_0x0181
            r9 = r6
        L_0x0180:
            return r9
        L_0x0181:
            r3 = r4
            r4 = r5
            r5 = r10
            r10 = r11
            r2 = 0
            goto L_0x0167
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DragGestureDetectorCopyKt.m34396awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, of.o, hf.d):java.lang.Object");
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM  reason: not valid java name */
    private static final Object m34397awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j, int i, C13088o<? super PointerInputChange, ? super Float, C11921v> oVar, Function1<? super Offset, Float> function1, C12074d<? super PointerInputChange> dVar) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        AwaitPointerEventScope awaitPointerEventScope2 = awaitPointerEventScope;
        Function1<? super Offset, Float> function12 = function1;
        C12074d<? super PointerInputChange> dVar2 = dVar;
        long j2 = j;
        if (m34398isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        float r3 = m34399pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        do {
            float f = 0.0f;
            while (true) {
                C12773m.m28630c(0);
                Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, (PointerEventPass) null, dVar2, 1, (Object) null);
                C12773m.m28630c(1);
                PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i2);
                    if (PointerId.m37154equalsimpl0(pointerInputChange.m37168getIdJ3iCeTQ(), j2)) {
                        break;
                    }
                    i2++;
                }
                C12775o.m28636f(pointerInputChange);
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2.isConsumed()) {
                    return null;
                }
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(i3);
                        if (pointerInputChange3.getPressed()) {
                            break;
                        }
                        i3++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        return null;
                    }
                    j2 = pointerInputChange4.m37168getIdJ3iCeTQ();
                } else {
                    f += function12.invoke(Offset.m35411boximpl(pointerInputChange2.m37169getPositionF1C5BW0())).floatValue() - function12.invoke(Offset.m35411boximpl(pointerInputChange2.m37170getPreviousPositionF1C5BW0())).floatValue();
                    if (Math.abs(f) < r3) {
                        PointerEventPass pointerEventPass = PointerEventPass.Final;
                        C12773m.m28630c(0);
                        awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, dVar2);
                        C12773m.m28630c(1);
                        if (pointerInputChange2.isConsumed()) {
                            return null;
                        }
                    } else {
                        oVar.invoke(pointerInputChange2, Float.valueOf(f - (Math.signum(f) * r3)));
                    }
                }
            }
        } while (!pointerInputChange2.isConsumed());
        return pointerInputChange2;
    }

    /* renamed from: isPointerUp-DmW0f2w  reason: not valid java name */
    private static final boolean m34398isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i);
            if (PointerId.m37154equalsimpl0(pointerInputChange.m37168getIdJ3iCeTQ(), j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ  reason: not valid java name */
    public static final float m34399pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i) {
        C12775o.m28639i(viewConfiguration, "$this$pointerSlop");
        if (PointerType.m37241equalsimpl0(i, PointerType.Companion.m37246getMouseT8wyACA())) {
            return viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio;
        }
        return viewConfiguration.getTouchSlop();
    }
}
