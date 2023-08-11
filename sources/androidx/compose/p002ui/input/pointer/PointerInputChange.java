package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.input.pointer.PointerInputChange */
/* compiled from: PointerEvent.kt */
public final class PointerInputChange {
    public static final int $stable = 0;
    private List<HistoricalChange> _historical;
    private Float _pressure;
    private ConsumedData consumed;

    /* renamed from: id */
    private final long f365id;
    private final long position;
    private final boolean pressed;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long scrollDelta;
    private final int type;
    private final long uptimeMillis;

    @ExperimentalComposeUiApi
    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6);
    }

    /* renamed from: copy-0GkPj7c$default  reason: not valid java name */
    public static /* synthetic */ PointerInputChange m37158copy0GkPj7c$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9;
        boolean z3;
        long j10;
        long j11;
        boolean z4;
        int i3;
        long j12;
        PointerInputChange pointerInputChange2 = pointerInputChange;
        int i4 = i2;
        if ((i4 & 1) != 0) {
            j7 = pointerInputChange2.f365id;
        } else {
            j7 = j;
        }
        if ((i4 & 2) != 0) {
            j8 = pointerInputChange2.uptimeMillis;
        } else {
            j8 = j2;
        }
        if ((i4 & 4) != 0) {
            j9 = pointerInputChange2.position;
        } else {
            j9 = j3;
        }
        if ((i4 & 8) != 0) {
            z3 = pointerInputChange2.pressed;
        } else {
            z3 = z;
        }
        if ((i4 & 16) != 0) {
            j10 = pointerInputChange2.previousUptimeMillis;
        } else {
            j10 = j4;
        }
        if ((i4 & 32) != 0) {
            j11 = pointerInputChange2.previousPosition;
        } else {
            j11 = j5;
        }
        if ((i4 & 64) != 0) {
            z4 = pointerInputChange2.previousPressed;
        } else {
            z4 = z2;
        }
        if ((i4 & 256) != 0) {
            i3 = pointerInputChange2.type;
        } else {
            i3 = i;
        }
        int i5 = i3;
        if ((i4 & 512) != 0) {
            j12 = pointerInputChange2.scrollDelta;
        } else {
            j12 = j6;
        }
        return pointerInputChange.m37163copy0GkPj7c(j7, j8, j9, z3, j10, j11, z4, consumedData, i5, j12);
    }

    /* renamed from: copy-Ezr-O64$default  reason: not valid java name */
    public static /* synthetic */ PointerInputChange m37159copyEzrO64$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, int i2, Object obj) {
        long j6;
        long j7;
        long j8;
        boolean z3;
        long j9;
        long j10;
        boolean z4;
        ConsumedData consumedData2;
        int i3;
        PointerInputChange pointerInputChange2 = pointerInputChange;
        int i4 = i2;
        if ((i4 & 1) != 0) {
            j6 = pointerInputChange2.f365id;
        } else {
            j6 = j;
        }
        if ((i4 & 2) != 0) {
            j7 = pointerInputChange2.uptimeMillis;
        } else {
            j7 = j2;
        }
        if ((i4 & 4) != 0) {
            j8 = pointerInputChange2.position;
        } else {
            j8 = j3;
        }
        if ((i4 & 8) != 0) {
            z3 = pointerInputChange2.pressed;
        } else {
            z3 = z;
        }
        if ((i4 & 16) != 0) {
            j9 = pointerInputChange2.previousUptimeMillis;
        } else {
            j9 = j4;
        }
        if ((i4 & 32) != 0) {
            j10 = pointerInputChange2.previousPosition;
        } else {
            j10 = j5;
        }
        if ((i4 & 64) != 0) {
            z4 = pointerInputChange2.previousPressed;
        } else {
            z4 = z2;
        }
        if ((i4 & 128) != 0) {
            consumedData2 = pointerInputChange2.consumed;
        } else {
            consumedData2 = consumedData;
        }
        if ((i4 & 256) != 0) {
            i3 = pointerInputChange2.type;
        } else {
            i3 = i;
        }
        return pointerInputChange.m37164copyEzrO64(j6, j7, j8, z3, j9, j10, z4, consumedData2, i3);
    }

    /* renamed from: copy-JKmWfYY$default  reason: not valid java name */
    public static /* synthetic */ PointerInputChange m37160copyJKmWfYY$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9;
        boolean z3;
        long j10;
        long j11;
        boolean z4;
        int i3;
        long j12;
        PointerInputChange pointerInputChange2 = pointerInputChange;
        int i4 = i2;
        if ((i4 & 1) != 0) {
            j7 = pointerInputChange2.f365id;
        } else {
            j7 = j;
        }
        if ((i4 & 2) != 0) {
            j8 = pointerInputChange2.uptimeMillis;
        } else {
            j8 = j2;
        }
        if ((i4 & 4) != 0) {
            j9 = pointerInputChange2.position;
        } else {
            j9 = j3;
        }
        if ((i4 & 8) != 0) {
            z3 = pointerInputChange2.pressed;
        } else {
            z3 = z;
        }
        if ((i4 & 16) != 0) {
            j10 = pointerInputChange2.previousUptimeMillis;
        } else {
            j10 = j4;
        }
        if ((i4 & 32) != 0) {
            j11 = pointerInputChange2.previousPosition;
        } else {
            j11 = j5;
        }
        if ((i4 & 64) != 0) {
            z4 = pointerInputChange2.previousPressed;
        } else {
            z4 = z2;
        }
        if ((i4 & 128) != 0) {
            i3 = pointerInputChange2.type;
        } else {
            i3 = i;
        }
        int i5 = i3;
        if ((i4 & 256) != 0) {
            j12 = pointerInputChange2.scrollDelta;
        } else {
            j12 = j6;
        }
        return pointerInputChange.m37165copyJKmWfYY(j7, j8, j9, z3, j10, j11, z4, i5, j12);
    }

    /* renamed from: copy-OHpmEuE$default  reason: not valid java name */
    public static /* synthetic */ PointerInputChange m37161copyOHpmEuE$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List list, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9;
        boolean z3;
        long j10;
        long j11;
        boolean z4;
        int i3;
        long j12;
        PointerInputChange pointerInputChange2 = pointerInputChange;
        int i4 = i2;
        if ((i4 & 1) != 0) {
            j7 = pointerInputChange2.f365id;
        } else {
            j7 = j;
        }
        if ((i4 & 2) != 0) {
            j8 = pointerInputChange2.uptimeMillis;
        } else {
            j8 = j2;
        }
        if ((i4 & 4) != 0) {
            j9 = pointerInputChange2.position;
        } else {
            j9 = j3;
        }
        if ((i4 & 8) != 0) {
            z3 = pointerInputChange2.pressed;
        } else {
            z3 = z;
        }
        if ((i4 & 16) != 0) {
            j10 = pointerInputChange2.previousUptimeMillis;
        } else {
            j10 = j4;
        }
        if ((i4 & 32) != 0) {
            j11 = pointerInputChange2.previousPosition;
        } else {
            j11 = j5;
        }
        if ((i4 & 64) != 0) {
            z4 = pointerInputChange2.previousPressed;
        } else {
            z4 = z2;
        }
        if ((i4 & 128) != 0) {
            i3 = pointerInputChange2.type;
        } else {
            i3 = i;
        }
        int i5 = i3;
        if ((i4 & 512) != 0) {
            j12 = pointerInputChange2.scrollDelta;
        } else {
            j12 = j6;
        }
        return pointerInputChange.m37166copyOHpmEuE(j7, j8, j9, z3, j10, j11, z4, i5, list, j12);
    }

    /* renamed from: copy-wbzehF4$default  reason: not valid java name */
    public static /* synthetic */ PointerInputChange m37162copywbzehF4$default(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9;
        boolean z3;
        float f2;
        long j10;
        long j11;
        boolean z4;
        int i3;
        long j12;
        PointerInputChange pointerInputChange2 = pointerInputChange;
        int i4 = i2;
        if ((i4 & 1) != 0) {
            j7 = pointerInputChange2.f365id;
        } else {
            j7 = j;
        }
        if ((i4 & 2) != 0) {
            j8 = pointerInputChange2.uptimeMillis;
        } else {
            j8 = j2;
        }
        if ((i4 & 4) != 0) {
            j9 = pointerInputChange2.position;
        } else {
            j9 = j3;
        }
        if ((i4 & 8) != 0) {
            z3 = pointerInputChange2.pressed;
        } else {
            z3 = z;
        }
        if ((i4 & 16) != 0) {
            f2 = pointerInputChange.getPressure();
        } else {
            f2 = f;
        }
        if ((i4 & 32) != 0) {
            j10 = pointerInputChange2.previousUptimeMillis;
        } else {
            j10 = j4;
        }
        if ((i4 & 64) != 0) {
            j11 = pointerInputChange2.previousPosition;
        } else {
            j11 = j5;
        }
        if ((i4 & 128) != 0) {
            z4 = pointerInputChange2.previousPressed;
        } else {
            z4 = z2;
        }
        if ((i4 & 256) != 0) {
            i3 = pointerInputChange2.type;
        } else {
            i3 = i;
        }
        boolean z5 = z4;
        int i5 = i3;
        if ((i4 & 1024) != 0) {
            j12 = pointerInputChange2.scrollDelta;
        } else {
            j12 = j6;
        }
        return pointerInputChange.m37167copywbzehF4(j7, j8, j9, z3, f2, j10, j11, z5, i5, list, j12);
    }

    public final void consume() {
        this.consumed.setDownChange(true);
        this.consumed.setPositionChange(true);
    }

    /* renamed from: copy-0GkPj7c  reason: not valid java name */
    public final PointerInputChange m37163copy0GkPj7c(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, long j6) {
        boolean z3;
        ConsumedData consumedData2 = consumedData;
        C12775o.m28639i(consumedData2, "consumed");
        float pressure = getPressure();
        if (consumedData.getDownChange() || consumedData.getPositionChange()) {
            z3 = true;
        } else {
            z3 = false;
        }
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, pressure, j4, j5, z2, z3, i, (List) getHistorical(), j6, (DefaultConstructorMarker) null);
        this.consumed = consumedData2;
        return pointerInputChange;
    }

    /* renamed from: copy-Ezr-O64  reason: not valid java name */
    public final /* synthetic */ PointerInputChange m37164copyEzrO64(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i) {
        boolean z3;
        ConsumedData consumedData2 = consumedData;
        C12775o.m28639i(consumedData2, "consumed");
        float pressure = getPressure();
        if (consumedData.getDownChange() || consumedData.getPositionChange()) {
            z3 = true;
        } else {
            z3 = false;
        }
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, pressure, j4, j5, z2, z3, i, (List) getHistorical(), this.scrollDelta, (DefaultConstructorMarker) null);
        this.consumed = consumedData2;
        return pointerInputChange;
    }

    /* renamed from: copy-JKmWfYY  reason: not valid java name */
    public final PointerInputChange m37165copyJKmWfYY(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, long j6) {
        PointerInputChange pointerInputChange = r0;
        PointerInputChange pointerInputChange2 = new PointerInputChange(j, j2, j3, z, getPressure(), j4, j5, z2, false, i, (List) getHistorical(), j6, (DefaultConstructorMarker) null);
        PointerInputChange pointerInputChange3 = pointerInputChange;
        pointerInputChange3.consumed = this.consumed;
        return pointerInputChange3;
    }

    @ExperimentalComposeUiApi
    /* renamed from: copy-OHpmEuE  reason: not valid java name */
    public final PointerInputChange m37166copyOHpmEuE(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List<HistoricalChange> list, long j6) {
        C12775o.m28639i(list, "historical");
        PointerInputChange pointerInputChange = r0;
        PointerInputChange pointerInputChange2 = new PointerInputChange(j, j2, j3, z, getPressure(), j4, j5, z2, false, i, (List) list, j6, (DefaultConstructorMarker) null);
        PointerInputChange pointerInputChange3 = pointerInputChange;
        pointerInputChange3.consumed = this.consumed;
        return pointerInputChange3;
    }

    @ExperimentalComposeUiApi
    /* renamed from: copy-wbzehF4  reason: not valid java name */
    public final PointerInputChange m37167copywbzehF4(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List<HistoricalChange> list, long j6) {
        C12775o.m28639i(list, "historical");
        PointerInputChange pointerInputChange = r0;
        PointerInputChange pointerInputChange2 = new PointerInputChange(j, j2, j3, z, f, j4, j5, z2, false, i, (List) list, j6, (DefaultConstructorMarker) null);
        PointerInputChange pointerInputChange3 = pointerInputChange;
        pointerInputChange3.consumed = this.consumed;
        return pointerInputChange3;
    }

    public final ConsumedData getConsumed() {
        return this.consumed;
    }

    @ExperimentalComposeUiApi
    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> list = this._historical;
        if (list == null) {
            return C12726w.m28524k();
        }
        return list;
    }

    /* renamed from: getId-J3iCeTQ  reason: not valid java name */
    public final long m37168getIdJ3iCeTQ() {
        return this.f365id;
    }

    /* renamed from: getPosition-F1C5BW0  reason: not valid java name */
    public final long m37169getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    @ExperimentalComposeUiApi
    public final float getPressure() {
        Float f = this._pressure;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    /* renamed from: getPreviousPosition-F1C5BW0  reason: not valid java name */
    public final long m37170getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    /* renamed from: getScrollDelta-F1C5BW0  reason: not valid java name */
    public final long m37171getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA  reason: not valid java name */
    public final int m37172getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        if (this.consumed.getDownChange() || this.consumed.getPositionChange()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "PointerInputChange(id=" + PointerId.m37156toStringimpl(this.f365id) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + Offset.m35430toStringimpl(this.position) + ", pressed=" + this.pressed + ", pressure=" + getPressure() + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + Offset.m35430toStringimpl(this.previousPosition) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + PointerType.m37243toStringimpl(this.type) + ", historical=" + getHistorical() + ",scrollDelta=" + Offset.m35430toStringimpl(this.scrollDelta) + ')';
    }

    @ExperimentalComposeUiApi
    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, (List<HistoricalChange>) list, j6);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, consumedData, i);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, (List<HistoricalChange>) list, j6);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.f365id = j;
        this.uptimeMillis = j2;
        this.position = j3;
        this.pressed = z;
        this.previousUptimeMillis = j4;
        this.previousPosition = j5;
        this.previousPressed = z2;
        this.type = i;
        this.scrollDelta = j6;
        boolean z4 = z3;
        this.consumed = new ConsumedData(z4, z4);
    }

    public static /* synthetic */ void getConsumed$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getHistorical$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getPressure$annotations() {
    }

    public static /* synthetic */ void isConsumed$annotations() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PointerInputChange(long r21, long r23, long r25, boolean r27, long r28, long r30, boolean r32, boolean r33, int r34, long r35, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x000f
            androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.p002ui.input.pointer.PointerType.Companion
            int r1 = r1.m37248getTouchT8wyACA()
            r16 = r1
            goto L_0x0011
        L_0x000f:
            r16 = r34
        L_0x0011:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x001e
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.p002ui.geometry.Offset.Companion
            long r0 = r0.m35438getZeroF1C5BW0()
            r17 = r0
            goto L_0x0020
        L_0x001e:
            r17 = r35
        L_0x0020:
            r19 = 0
            r2 = r20
            r3 = r21
            r5 = r23
            r7 = r25
            r9 = r27
            r10 = r28
            r12 = r30
            r14 = r32
            r15 = r33
            r2.<init>((long) r3, (long) r5, (long) r7, (boolean) r9, (long) r10, (long) r12, (boolean) r14, (boolean) r15, (int) r16, (long) r17, (kotlin.jvm.internal.DefaultConstructorMarker) r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.pointer.PointerInputChange.<init>(long, long, long, boolean, long, long, boolean, boolean, int, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, consumedData, (i2 & 256) != 0 ? PointerType.Companion.m37248getTouchT8wyACA() : i, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i) {
        this(j, j2, j3, z, 1.0f, j4, j5, z2, consumedData.getDownChange() || consumedData.getPositionChange(), i, Offset.Companion.m35438getZeroF1C5BW0(), (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, List<HistoricalChange> list, long j6) {
        this(j, j2, j3, z, 1.0f, j4, j5, z2, z3, i, (List) list, j6, (DefaultConstructorMarker) null);
        this._historical = list;
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List<HistoricalChange> list, long j6) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, (DefaultConstructorMarker) null);
        this._historical = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PointerInputChange(long r22, long r24, long r26, boolean r28, float r29, long r30, long r32, boolean r34, boolean r35, int r36, long r37, int r39, kotlin.jvm.internal.DefaultConstructorMarker r40) {
        /*
            r21 = this;
            r0 = r39
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x000f
            androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.p002ui.input.pointer.PointerType.Companion
            int r1 = r1.m37248getTouchT8wyACA()
            r17 = r1
            goto L_0x0011
        L_0x000f:
            r17 = r36
        L_0x0011:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x001e
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.p002ui.geometry.Offset.Companion
            long r0 = r0.m35438getZeroF1C5BW0()
            r18 = r0
            goto L_0x0020
        L_0x001e:
            r18 = r37
        L_0x0020:
            r20 = 0
            r2 = r21
            r3 = r22
            r5 = r24
            r7 = r26
            r9 = r28
            r10 = r29
            r11 = r30
            r13 = r32
            r15 = r34
            r16 = r35
            r2.<init>((long) r3, (long) r5, (long) r7, (boolean) r9, (float) r10, (long) r11, (long) r13, (boolean) r15, (boolean) r16, (int) r17, (long) r18, (kotlin.jvm.internal.DefaultConstructorMarker) r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.pointer.PointerInputChange.<init>(long, long, long, boolean, float, long, long, boolean, boolean, int, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6, (DefaultConstructorMarker) null);
        this._pressure = Float.valueOf(f);
    }
}
