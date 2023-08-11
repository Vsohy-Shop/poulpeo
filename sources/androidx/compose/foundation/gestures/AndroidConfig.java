package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerEvent;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidScrollable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,35:1\n59#2,3:36\n62#2,2:43\n64#2:46\n33#3,4:39\n38#3:45\n154#4:47\n*S KotlinDebug\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n*L\n33#1:36,3\n33#1:43,2\n33#1:46\n33#1:39,4\n33#1:45\n33#1:47\n*E\n"})
/* compiled from: AndroidScrollable.android.kt */
final class AndroidConfig implements ScrollConfig {
    public static final AndroidConfig INSTANCE = new AndroidConfig();

    private AndroidConfig() {
    }

    /* renamed from: calculateMouseWheelScroll-8xgXZGE  reason: not valid java name */
    public long m33034calculateMouseWheelScroll8xgXZGE(Density density, PointerEvent pointerEvent, long j) {
        C12775o.m28639i(density, "$this$calculateMouseWheelScroll");
        C12775o.m28639i(pointerEvent, NotificationCompat.CATEGORY_EVENT);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        Offset r9 = Offset.m35411boximpl(Offset.Companion.m35438getZeroF1C5BW0());
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            r9 = Offset.m35411boximpl(Offset.m35427plusMKHz9U(r9.m35432unboximpl(), changes.get(i).m37171getScrollDeltaF1C5BW0()));
        }
        return Offset.m35429timestuRUvjQ(r9.m35432unboximpl(), -density.m38449toPx0680j_4(C1232Dp.m38468constructorimpl((float) 64)));
    }
}
