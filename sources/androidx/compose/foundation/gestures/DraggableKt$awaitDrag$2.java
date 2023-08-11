package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerEventKt;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import androidx.compose.p002ui.input.pointer.util.VelocityTracker;
import androidx.compose.p002ui.input.pointer.util.VelocityTrackerKt;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p308ag.C10915s;
import p336ef.C11921v;

/* compiled from: Draggable.kt */
final class DraggableKt$awaitDrag$2 extends C12777p implements Function1<PointerInputChange, C11921v> {
    final /* synthetic */ C10915s<DragEvent> $channel;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ VelocityTracker $velocityTracker;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DraggableKt$awaitDrag$2(VelocityTracker velocityTracker, C10915s<? super DragEvent> sVar, boolean z) {
        super(1);
        this.$velocityTracker = velocityTracker;
        this.$channel = sVar;
        this.$reverseDirection = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PointerInputChange) obj);
        return C11921v.f18618a;
    }

    public final void invoke(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, NotificationCompat.CATEGORY_EVENT);
        VelocityTrackerKt.addPointerInputChange(this.$velocityTracker, pointerInputChange);
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            long positionChange = PointerEventKt.positionChange(pointerInputChange);
            pointerInputChange.consume();
            C10915s<DragEvent> sVar = this.$channel;
            if (this.$reverseDirection) {
                positionChange = Offset.m35429timestuRUvjQ(positionChange, -1.0f);
            }
            sVar.mo45894m(new DragEvent.DragDelta(positionChange, (DefaultConstructorMarker) null));
        }
    }
}
