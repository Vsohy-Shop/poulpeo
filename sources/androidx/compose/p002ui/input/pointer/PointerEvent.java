package androidx.compose.p002ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,202:1\n33#2,6:203\n33#2,6:209\n151#2,3:215\n33#2,4:218\n154#2,2:222\n38#2:224\n156#2:225\n*S KotlinDebug\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n*L\n72#1:203,6\n96#1:209,6\n99#1:215,3\n99#1:218,4\n99#1:222,2\n99#1:224\n99#1:225\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerEvent */
/* compiled from: PointerEvent.android.kt */
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;
    private final List<PointerInputChange> changes;
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    public PointerEvent(List<PointerInputChange> list, InternalPointerEvent internalPointerEvent2) {
        C12775o.m28639i(list, "changes");
        this.changes = list;
        this.internalPointerEvent = internalPointerEvent2;
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        int i = 0;
        this.buttons = PointerButtons.m37105constructorimpl(motionEvent$ui_release != null ? motionEvent$ui_release.getButtonState() : 0);
        MotionEvent motionEvent$ui_release2 = getMotionEvent$ui_release();
        this.keyboardModifiers = PointerKeyboardModifiers.m37232constructorimpl(motionEvent$ui_release2 != null ? motionEvent$ui_release2.getMetaState() : i);
        this.type = m37111calculatePointerEventType7fucELk();
    }

    /* renamed from: calculatePointerEventType-7fucELk  reason: not valid java name */
    private final int m37111calculatePointerEventType7fucELk() {
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        if (motionEvent$ui_release != null) {
            int actionMasked = motionEvent$ui_release.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return PointerEventType.Companion.m37130getScroll7fucELk();
                            case 9:
                                return PointerEventType.Companion.m37125getEnter7fucELk();
                            case 10:
                                return PointerEventType.Companion.m37126getExit7fucELk();
                            default:
                                return PointerEventType.Companion.m37131getUnknown7fucELk();
                        }
                    }
                    return PointerEventType.Companion.m37127getMove7fucELk();
                }
                return PointerEventType.Companion.m37129getRelease7fucELk();
            }
            return PointerEventType.Companion.m37128getPress7fucELk();
        }
        List<PointerInputChange> list = this.changes;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = list.get(i);
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                return PointerEventType.Companion.m37129getRelease7fucELk();
            }
            if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                return PointerEventType.Companion.m37128getPress7fucELk();
            }
        }
        return PointerEventType.Companion.m37127getMove7fucELk();
    }

    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    public final PointerEvent copy(List<PointerInputChange> list, MotionEvent motionEvent) {
        boolean z;
        List<PointerInputChange> list2 = list;
        MotionEvent motionEvent2 = motionEvent;
        C12775o.m28639i(list2, "changes");
        if (motionEvent2 == null) {
            return new PointerEvent(list2, (InternalPointerEvent) null);
        }
        if (C12775o.m28634d(motionEvent2, getMotionEvent$ui_release())) {
            return new PointerEvent(list2, this.internalPointerEvent);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = list2.get(i);
            linkedHashMap.put(PointerId.m37151boximpl(pointerInputChange.m37168getIdJ3iCeTQ()), pointerInputChange);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i2 = 0;
        while (i2 < size2) {
            PointerInputChange pointerInputChange2 = list2.get(i2);
            long r10 = pointerInputChange2.m37168getIdJ3iCeTQ();
            long uptimeMillis = pointerInputChange2.getUptimeMillis();
            long r15 = pointerInputChange2.m37169getPositionF1C5BW0();
            long r17 = pointerInputChange2.m37169getPositionF1C5BW0();
            boolean pressed = pointerInputChange2.getPressed();
            float pressure = pointerInputChange2.getPressure();
            int r21 = pointerInputChange2.m37172getTypeT8wyACA();
            InternalPointerEvent internalPointerEvent2 = this.internalPointerEvent;
            int i3 = size2;
            if (internalPointerEvent2 != null) {
                z = true;
                if (internalPointerEvent2.m37101issuesEnterExitEvent0FcD4WY(pointerInputChange2.m37168getIdJ3iCeTQ())) {
                    PointerInputEventData pointerInputEventData = r9;
                    PointerInputEventData pointerInputEventData2 = new PointerInputEventData(r10, uptimeMillis, r15, r17, pressed, pressure, r21, z, (List) null, 0, 768, (DefaultConstructorMarker) null);
                    arrayList.add(pointerInputEventData);
                    i2++;
                    size2 = i3;
                }
            }
            z = false;
            PointerInputEventData pointerInputEventData3 = pointerInputEventData2;
            PointerInputEventData pointerInputEventData22 = new PointerInputEventData(r10, uptimeMillis, r15, r17, pressed, pressure, r21, z, (List) null, 0, 768, (DefaultConstructorMarker) null);
            arrayList.add(pointerInputEventData3);
            i2++;
            size2 = i3;
        }
        return new PointerEvent(list2, new InternalPointerEvent(linkedHashMap, new PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent2)));
    }

    /* renamed from: getButtons-ry648PA  reason: not valid java name */
    public final int m37112getButtonsry648PA() {
        return this.buttons;
    }

    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    public final InternalPointerEvent getInternalPointerEvent$ui_release() {
        return this.internalPointerEvent;
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A  reason: not valid java name */
    public final int m37113getKeyboardModifiersk7X9c1A() {
        return this.keyboardModifiers;
    }

    public final MotionEvent getMotionEvent$ui_release() {
        InternalPointerEvent internalPointerEvent2 = this.internalPointerEvent;
        if (internalPointerEvent2 != null) {
            return internalPointerEvent2.getMotionEvent();
        }
        return null;
    }

    /* renamed from: getType-7fucELk  reason: not valid java name */
    public final int m37114getType7fucELk() {
        return this.type;
    }

    /* renamed from: setType-EhbLWgg$ui_release  reason: not valid java name */
    public final void m37115setTypeEhbLWgg$ui_release(int i) {
        this.type = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PointerEvent(List<PointerInputChange> list) {
        this(list, (InternalPointerEvent) null);
        C12775o.m28639i(list, "changes");
    }
}
