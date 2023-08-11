package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,199:1\n135#2:200\n*S KotlinDebug\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderKt\n*L\n102#1:200\n*E\n"})
/* compiled from: BringIntoViewResponder.kt */
public final class BringIntoViewResponderKt {
    @ExperimentalFoundationApi
    public static final Modifier bringIntoViewResponder(Modifier modifier, BringIntoViewResponder bringIntoViewResponder) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(bringIntoViewResponder, "responder");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0594x692369d3(bringIntoViewResponder);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new BringIntoViewResponderKt$bringIntoViewResponder$2(bringIntoViewResponder));
    }

    private static final boolean completelyOverlaps(Rect rect, Rect rect2) {
        if (rect.getLeft() > rect2.getLeft() || rect.getTop() > rect2.getTop() || rect.getRight() < rect2.getRight() || rect.getBottom() < rect2.getBottom()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final Rect localRectOf(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, Rect rect) {
        return rect.m35459translatek4lQ0M(layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, false).m35457getTopLeftF1C5BW0());
    }
}
