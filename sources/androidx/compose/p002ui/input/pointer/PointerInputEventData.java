package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.geometry.Offset;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.input.pointer.PointerInputEventData */
/* compiled from: InternalPointerInput.kt */
public final class PointerInputEventData {
    private final boolean down;
    private final List<HistoricalChange> historical;

    /* renamed from: id */
    private final long f366id;
    private final boolean issuesEnterExit;
    private final long position;
    private final long positionOnScreen;
    private final float pressure;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    public /* synthetic */ PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, f, i, z2, list, j5);
    }

    /* renamed from: copy-gYeeOSc$default  reason: not valid java name */
    public static /* synthetic */ PointerInputEventData m37175copygYeeOSc$default(PointerInputEventData pointerInputEventData, long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, int i2, Object obj) {
        long j6;
        long j7;
        long j8;
        long j9;
        boolean z3;
        float f2;
        int i3;
        boolean z4;
        List list2;
        long j10;
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        int i4 = i2;
        if ((i4 & 1) != 0) {
            j6 = pointerInputEventData2.f366id;
        } else {
            j6 = j;
        }
        if ((i4 & 2) != 0) {
            j7 = pointerInputEventData2.uptime;
        } else {
            j7 = j2;
        }
        if ((i4 & 4) != 0) {
            j8 = pointerInputEventData2.positionOnScreen;
        } else {
            j8 = j3;
        }
        if ((i4 & 8) != 0) {
            j9 = pointerInputEventData2.position;
        } else {
            j9 = j4;
        }
        if ((i4 & 16) != 0) {
            z3 = pointerInputEventData2.down;
        } else {
            z3 = z;
        }
        if ((i4 & 32) != 0) {
            f2 = pointerInputEventData2.pressure;
        } else {
            f2 = f;
        }
        if ((i4 & 64) != 0) {
            i3 = pointerInputEventData2.type;
        } else {
            i3 = i;
        }
        if ((i4 & 128) != 0) {
            z4 = pointerInputEventData2.issuesEnterExit;
        } else {
            z4 = z2;
        }
        if ((i4 & 256) != 0) {
            list2 = pointerInputEventData2.historical;
        } else {
            list2 = list;
        }
        List list3 = list2;
        if ((i4 & 512) != 0) {
            j10 = pointerInputEventData2.scrollDelta;
        } else {
            j10 = j5;
        }
        return pointerInputEventData.m37181copygYeeOSc(j6, j7, j8, j9, z3, f2, i3, z4, list3, j10);
    }

    /* renamed from: component1-J3iCeTQ  reason: not valid java name */
    public final long m37176component1J3iCeTQ() {
        return this.f366id;
    }

    /* renamed from: component10-F1C5BW0  reason: not valid java name */
    public final long m37177component10F1C5BW0() {
        return this.scrollDelta;
    }

    public final long component2() {
        return this.uptime;
    }

    /* renamed from: component3-F1C5BW0  reason: not valid java name */
    public final long m37178component3F1C5BW0() {
        return this.positionOnScreen;
    }

    /* renamed from: component4-F1C5BW0  reason: not valid java name */
    public final long m37179component4F1C5BW0() {
        return this.position;
    }

    public final boolean component5() {
        return this.down;
    }

    public final float component6() {
        return this.pressure;
    }

    /* renamed from: component7-T8wyACA  reason: not valid java name */
    public final int m37180component7T8wyACA() {
        return this.type;
    }

    public final boolean component8() {
        return this.issuesEnterExit;
    }

    public final List<HistoricalChange> component9() {
        return this.historical;
    }

    /* renamed from: copy-gYeeOSc  reason: not valid java name */
    public final PointerInputEventData m37181copygYeeOSc(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List<HistoricalChange> list, long j5) {
        long j6 = j;
        C12775o.m28639i(list, "historical");
        return new PointerInputEventData(j, j2, j3, j4, z, f, i, z2, list, j5, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        if (PointerId.m37154equalsimpl0(this.f366id, pointerInputEventData.f366id) && this.uptime == pointerInputEventData.uptime && Offset.m35419equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m35419equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && PointerType.m37241equalsimpl0(this.type, pointerInputEventData.type) && this.issuesEnterExit == pointerInputEventData.issuesEnterExit && C12775o.m28634d(this.historical, pointerInputEventData.historical) && Offset.m35419equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta)) {
            return true;
        }
        return false;
    }

    public final boolean getDown() {
        return this.down;
    }

    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* renamed from: getId-J3iCeTQ  reason: not valid java name */
    public final long m37182getIdJ3iCeTQ() {
        return this.f366id;
    }

    public final boolean getIssuesEnterExit() {
        return this.issuesEnterExit;
    }

    /* renamed from: getPosition-F1C5BW0  reason: not valid java name */
    public final long m37183getPositionF1C5BW0() {
        return this.position;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0  reason: not valid java name */
    public final long m37184getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getScrollDelta-F1C5BW0  reason: not valid java name */
    public final long m37185getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA  reason: not valid java name */
    public final int m37186getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    public int hashCode() {
        int r0 = ((((((PointerId.m37155hashCodeimpl(this.f366id) * 31) + Long.hashCode(this.uptime)) * 31) + Offset.m35424hashCodeimpl(this.positionOnScreen)) * 31) + Offset.m35424hashCodeimpl(this.position)) * 31;
        boolean z = this.down;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((((r0 + (z ? 1 : 0)) * 31) + Float.hashCode(this.pressure)) * 31) + PointerType.m37242hashCodeimpl(this.type)) * 31;
        boolean z3 = this.issuesEnterExit;
        if (!z3) {
            z2 = z3;
        }
        return ((((hashCode + (z2 ? 1 : 0)) * 31) + this.historical.hashCode()) * 31) + Offset.m35424hashCodeimpl(this.scrollDelta);
    }

    public String toString() {
        return "PointerInputEventData(id=" + PointerId.m37156toStringimpl(this.f366id) + ", uptime=" + this.uptime + ", positionOnScreen=" + Offset.m35430toStringimpl(this.positionOnScreen) + ", position=" + Offset.m35430toStringimpl(this.position) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + PointerType.m37243toStringimpl(this.type) + ", issuesEnterExit=" + this.issuesEnterExit + ", historical=" + this.historical + ", scrollDelta=" + Offset.m35430toStringimpl(this.scrollDelta) + ')';
    }

    private PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List<HistoricalChange> list, long j5) {
        this.f366id = j;
        this.uptime = j2;
        this.positionOnScreen = j3;
        this.position = j4;
        this.down = z;
        this.pressure = f;
        this.type = i;
        this.issuesEnterExit = z2;
        this.historical = list;
        this.scrollDelta = j5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PointerInputEventData(long r20, long r22, long r24, long r26, boolean r28, float r29, int r30, boolean r31, java.util.List r32, long r33, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r14 = r1
            goto L_0x000b
        L_0x0009:
            r14 = r31
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0016
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r15 = r1
            goto L_0x0018
        L_0x0016:
            r15 = r32
        L_0x0018:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0025
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.p002ui.geometry.Offset.Companion
            long r0 = r0.m35438getZeroF1C5BW0()
            r16 = r0
            goto L_0x0027
        L_0x0025:
            r16 = r33
        L_0x0027:
            r18 = 0
            r2 = r19
            r3 = r20
            r5 = r22
            r7 = r24
            r9 = r26
            r11 = r28
            r12 = r29
            r13 = r30
            r2.<init>(r3, r5, r7, r9, r11, r12, r13, r14, r15, r16, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.pointer.PointerInputEventData.<init>(long, long, long, long, boolean, float, int, boolean, java.util.List, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
