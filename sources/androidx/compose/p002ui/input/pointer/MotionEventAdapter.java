package androidx.compose.p002ui.input.pointer;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.input.pointer.MotionEventAdapter */
/* compiled from: MotionEventAdapter.android.kt */
public final class MotionEventAdapter {
    private final SparseBooleanArray canHover = new SparseBooleanArray();
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();
    private long nextId;
    private final List<PointerInputEventData> pointers = new ArrayList();
    private int previousSource = -1;
    private int previousToolType = -1;

    private final void addFreshIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                long j = this.nextId;
                this.nextId = 1 + j;
                sparseLongArray.put(pointerId, j);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    this.canHover.put(pointerId, true);
                }
            }
        } else if (actionMasked == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
                SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
                long j2 = this.nextId;
                this.nextId = 1 + j2;
                sparseLongArray2.put(pointerId2, j2);
            }
        }
    }

    private final void clearOnDeviceChange(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType != this.previousToolType || source != this.previousSource) {
                this.previousToolType = toolType;
                this.previousSource = source;
                this.canHover.clear();
                this.motionEventToComposePointerIdMap.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.compose.p002ui.input.pointer.PointerInputEventData createPointerInputEventData(androidx.compose.p002ui.input.pointer.PositionCalculator r25, android.view.MotionEvent r26, int r27, boolean r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            int r4 = r26.getPointerId(r27)
            long r6 = r0.m37102getComposePointerId_I2yYro(r4)
            float r15 = r26.getPressure(r27)
            float r4 = r26.getX(r27)
            float r5 = r26.getY(r27)
            long r4 = androidx.compose.p002ui.geometry.OffsetKt.Offset(r4, r5)
            if (r3 != 0) goto L_0x0035
            float r4 = r26.getRawX()
            float r5 = r26.getRawY()
            long r4 = androidx.compose.p002ui.geometry.OffsetKt.Offset(r4, r5)
            long r8 = r1.m37251screenToLocalMKHz9U(r4)
        L_0x0032:
            r10 = r4
            r12 = r8
            goto L_0x004c
        L_0x0035:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r8 < r9) goto L_0x0046
            androidx.compose.ui.input.pointer.MotionEventHelper r4 = androidx.compose.p002ui.input.pointer.MotionEventHelper.INSTANCE
            long r4 = r4.m37103toRawOffsetdBAh8RU(r2, r3)
            long r8 = r1.m37251screenToLocalMKHz9U(r4)
            goto L_0x0032
        L_0x0046:
            long r8 = r1.m37250localToScreenMKHz9U(r4)
            r12 = r4
            r10 = r8
        L_0x004c:
            int r1 = r26.getToolType(r27)
            r4 = 1
            if (r1 == 0) goto L_0x0081
            if (r1 == r4) goto L_0x007a
            r5 = 2
            if (r1 == r5) goto L_0x0073
            r5 = 3
            if (r1 == r5) goto L_0x006c
            r5 = 4
            if (r1 == r5) goto L_0x0065
            androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.p002ui.input.pointer.PointerType.Companion
            int r1 = r1.m37249getUnknownT8wyACA()
            goto L_0x0087
        L_0x0065:
            androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.p002ui.input.pointer.PointerType.Companion
            int r1 = r1.m37245getEraserT8wyACA()
            goto L_0x0087
        L_0x006c:
            androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.p002ui.input.pointer.PointerType.Companion
            int r1 = r1.m37246getMouseT8wyACA()
            goto L_0x0087
        L_0x0073:
            androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.p002ui.input.pointer.PointerType.Companion
            int r1 = r1.m37247getStylusT8wyACA()
            goto L_0x0087
        L_0x007a:
            androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.p002ui.input.pointer.PointerType.Companion
            int r1 = r1.m37248getTouchT8wyACA()
            goto L_0x0087
        L_0x0081:
            androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.p002ui.input.pointer.PointerType.Companion
            int r1 = r1.m37249getUnknownT8wyACA()
        L_0x0087:
            r16 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r5 = r26.getHistorySize()
            r9 = 0
        L_0x0093:
            if (r9 >= r5) goto L_0x00db
            float r14 = r2.getHistoricalX(r3, r9)
            float r4 = r2.getHistoricalY(r3, r9)
            boolean r17 = java.lang.Float.isInfinite(r14)
            if (r17 != 0) goto L_0x00ac
            boolean r17 = java.lang.Float.isNaN(r14)
            if (r17 != 0) goto L_0x00ac
            r17 = 1
            goto L_0x00ae
        L_0x00ac:
            r17 = 0
        L_0x00ae:
            if (r17 == 0) goto L_0x00d7
            boolean r17 = java.lang.Float.isInfinite(r4)
            if (r17 != 0) goto L_0x00bf
            boolean r17 = java.lang.Float.isNaN(r4)
            if (r17 != 0) goto L_0x00bf
            r17 = 1
            goto L_0x00c1
        L_0x00bf:
            r17 = 0
        L_0x00c1:
            if (r17 == 0) goto L_0x00d7
            androidx.compose.ui.input.pointer.HistoricalChange r8 = new androidx.compose.ui.input.pointer.HistoricalChange
            long r19 = r2.getHistoricalEventTime(r9)
            long r21 = androidx.compose.p002ui.geometry.OffsetKt.Offset(r14, r4)
            r23 = 0
            r18 = r8
            r18.<init>(r19, r21, r23)
            r1.add(r8)
        L_0x00d7:
            int r9 = r9 + 1
            r4 = 1
            goto L_0x0093
        L_0x00db:
            int r4 = r26.getActionMasked()
            r5 = 8
            if (r4 != r5) goto L_0x00f7
            r4 = 10
            float r4 = r2.getAxisValue(r4)
            r5 = 9
            float r5 = r2.getAxisValue(r5)
            float r5 = -r5
            r8 = 0
            float r5 = r5 + r8
            long r4 = androidx.compose.p002ui.geometry.OffsetKt.Offset(r4, r5)
            goto L_0x00fd
        L_0x00f7:
            androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.p002ui.geometry.Offset.Companion
            long r4 = r4.m35438getZeroF1C5BW0()
        L_0x00fd:
            r19 = r4
            android.util.SparseBooleanArray r4 = r0.canHover
            int r3 = r26.getPointerId(r27)
            r5 = 0
            boolean r17 = r4.get(r3, r5)
            androidx.compose.ui.input.pointer.PointerInputEventData r3 = new androidx.compose.ui.input.pointer.PointerInputEventData
            r5 = r3
            long r8 = r26.getEventTime()
            r21 = 0
            r14 = r28
            r18 = r1
            r5.<init>(r6, r8, r10, r12, r14, r15, r16, r17, r18, r19, r21)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.pointer.MotionEventAdapter.createPointerInputEventData(androidx.compose.ui.input.pointer.PositionCalculator, android.view.MotionEvent, int, boolean):androidx.compose.ui.input.pointer.PointerInputEventData");
    }

    /* renamed from: getComposePointerId-_I2yYro  reason: not valid java name */
    private final long m37102getComposePointerId_I2yYro(int i) {
        long j;
        int indexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(i);
        if (indexOfKey >= 0) {
            j = this.motionEventToComposePointerIdMap.valueAt(indexOfKey);
        } else {
            j = this.nextId;
            this.nextId = 1 + j;
            this.motionEventToComposePointerIdMap.put(i, j);
        }
        return PointerId.m37152constructorimpl(j);
    }

    private final boolean hasPointerId(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    private final void removeStaleIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.canHover.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.canHover.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int keyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!hasPointerId(motionEvent, keyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.canHover.delete(keyAt);
                }
            }
        }
    }

    public final PointerInputEvent convertToPointerInputEvent$ui_release(MotionEvent motionEvent, PositionCalculator positionCalculator) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        C12775o.m28639i(motionEvent, "motionEvent");
        C12775o.m28639i(positionCalculator, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.motionEventToComposePointerIdMap.clear();
            this.canHover.clear();
            return null;
        }
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        if (actionMasked == 10 || actionMasked == 7 || actionMasked == 9) {
            z = true;
        } else {
            z = false;
        }
        if (actionMasked == 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            this.canHover.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked == 1) {
            i = 0;
        } else if (actionMasked != 6) {
            i = -1;
        } else {
            i = motionEvent.getActionIndex();
        }
        this.pointers.clear();
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            List<PointerInputEventData> list = this.pointers;
            if (z || i2 == i || (z2 && motionEvent.getButtonState() == 0)) {
                z3 = false;
            } else {
                z3 = true;
            }
            list.add(createPointerInputEventData(positionCalculator, motionEvent, i2, z3));
        }
        removeStaleIds(motionEvent);
        return new PointerInputEvent(motionEvent.getEventTime(), this.pointers, motionEvent);
    }

    public final void endStream(int i) {
        this.canHover.delete(i);
        this.motionEventToComposePointerIdMap.delete(i);
    }

    public final SparseLongArray getMotionEventToComposePointerIdMap$ui_release() {
        return this.motionEventToComposePointerIdMap;
    }

    @VisibleForTesting
    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }
}
