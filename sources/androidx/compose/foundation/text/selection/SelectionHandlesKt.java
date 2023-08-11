package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyKey;
import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSelectionHandles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,70:1\n154#2:71\n154#2:72\n*S KotlinDebug\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n*L\n27#1:71\n28#1:72\n*E\n"})
/* compiled from: SelectionHandles.kt */
public final class SelectionHandlesKt {
    private static final float HandleHeight;
    private static final float HandleWidth;
    private static final SemanticsPropertyKey<SelectionHandleInfo> SelectionHandleInfoKey = new SemanticsPropertyKey<>("SelectionHandleInfo", (C13088o) null, 2, (DefaultConstructorMarker) null);

    static {
        float f = (float) 25;
        HandleWidth = C1232Dp.m38468constructorimpl(f);
        HandleHeight = C1232Dp.m38468constructorimpl(f);
    }

    /* renamed from: getAdjustedCoordinates-k-4lQ0M  reason: not valid java name */
    public static final long m33786getAdjustedCoordinatesk4lQ0M(long j) {
        return OffsetKt.Offset(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j) - 1.0f);
    }

    public static final float getHandleHeight() {
        return HandleHeight;
    }

    public static final float getHandleWidth() {
        return HandleWidth;
    }

    public static final SemanticsPropertyKey<SelectionHandleInfo> getSelectionHandleInfoKey() {
        return SelectionHandleInfoKey;
    }
}
