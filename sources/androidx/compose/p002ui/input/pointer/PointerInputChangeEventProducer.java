package androidx.compose.p002ui.input.pointer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,237:1\n33#2,6:238\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n*L\n147#1:238,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerInputChangeEventProducer */
/* compiled from: PointerInputEventProcessor.kt */
final class PointerInputChangeEventProducer {
    private final Map<PointerId, PointerInputData> previousPointerInputData = new LinkedHashMap();

    /* renamed from: androidx.compose.ui.input.pointer.PointerInputChangeEventProducer$PointerInputData */
    /* compiled from: PointerInputEventProcessor.kt */
    private static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final int type;
        private final long uptime;

        public /* synthetic */ PointerInputData(long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z, i);
        }

        public final boolean getDown() {
            return this.down;
        }

        /* renamed from: getPositionOnScreen-F1C5BW0  reason: not valid java name */
        public final long m37173getPositionOnScreenF1C5BW0() {
            return this.positionOnScreen;
        }

        /* renamed from: getType-T8wyACA  reason: not valid java name */
        public final int m37174getTypeT8wyACA() {
            return this.type;
        }

        public final long getUptime() {
            return this.uptime;
        }

        private PointerInputData(long j, long j2, boolean z, int i) {
            this.uptime = j;
            this.positionOnScreen = j2;
            this.down = z;
            this.type = i;
        }
    }

    public final void clear() {
        this.previousPointerInputData.clear();
    }

    public final InternalPointerEvent produce(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator) {
        boolean z;
        long j;
        long j2;
        PointerInputEvent pointerInputEvent2 = pointerInputEvent;
        PositionCalculator positionCalculator2 = positionCalculator;
        C12775o.m28639i(pointerInputEvent2, "pointerInputEvent");
        C12775o.m28639i(positionCalculator2, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i = 0; i < size; i++) {
            PointerInputEventData pointerInputEventData = pointers.get(i);
            PointerInputData pointerInputData = this.previousPointerInputData.get(PointerId.m37151boximpl(pointerInputEventData.m37182getIdJ3iCeTQ()));
            if (pointerInputData == null) {
                j2 = pointerInputEventData.getUptime();
                j = pointerInputEventData.m37183getPositionF1C5BW0();
                z = false;
            } else {
                long uptime = pointerInputData.getUptime();
                j2 = uptime;
                z = pointerInputData.getDown();
                j = positionCalculator2.m37251screenToLocalMKHz9U(pointerInputData.m37173getPositionOnScreenF1C5BW0());
            }
            linkedHashMap.put(PointerId.m37151boximpl(pointerInputEventData.m37182getIdJ3iCeTQ()), new PointerInputChange(pointerInputEventData.m37182getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m37183getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), j2, j, z, false, pointerInputEventData.m37186getTypeT8wyACA(), (List) pointerInputEventData.getHistorical(), pointerInputEventData.m37185getScrollDeltaF1C5BW0(), (DefaultConstructorMarker) null));
            if (pointerInputEventData.getDown()) {
                Map<PointerId, PointerInputData> map = this.previousPointerInputData;
                PointerId r10 = PointerId.m37151boximpl(pointerInputEventData.m37182getIdJ3iCeTQ());
                PointerInputData pointerInputData2 = r11;
                PointerInputData pointerInputData3 = new PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.m37184getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.m37186getTypeT8wyACA(), (DefaultConstructorMarker) null);
                map.put(r10, pointerInputData2);
            } else {
                this.previousPointerInputData.remove(PointerId.m37151boximpl(pointerInputEventData.m37182getIdJ3iCeTQ()));
            }
        }
        return new InternalPointerEvent(linkedHashMap, pointerInputEvent2);
    }
}
