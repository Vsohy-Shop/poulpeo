package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import androidx.compose.p002ui.input.pointer.util.VelocityTracker;
import androidx.compose.p002ui.input.pointer.util.VelocityTrackerKt;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.C12762g0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Draggable.kt */
final class DraggableKt$awaitDownAndSlop$postPointerSlop$1 extends C12777p implements C13088o<PointerInputChange, Offset, C11921v> {
    final /* synthetic */ C12762g0 $initialDelta;
    final /* synthetic */ VelocityTracker $velocityTracker;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DraggableKt$awaitDownAndSlop$postPointerSlop$1(VelocityTracker velocityTracker, C12762g0 g0Var) {
        super(2);
        this.$velocityTracker = velocityTracker;
        this.$initialDelta = g0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m33085invokeUv8p0NA((PointerInputChange) obj, ((Offset) obj2).m35432unboximpl());
        return C11921v.f18618a;
    }

    /* renamed from: invoke-Uv8p0NA  reason: not valid java name */
    public final void m33085invokeUv8p0NA(PointerInputChange pointerInputChange, long j) {
        C12775o.m28639i(pointerInputChange, NotificationCompat.CATEGORY_EVENT);
        VelocityTrackerKt.addPointerInputChange(this.$velocityTracker, pointerInputChange);
        pointerInputChange.consume();
        this.$initialDelta.f20418b = j;
    }
}
