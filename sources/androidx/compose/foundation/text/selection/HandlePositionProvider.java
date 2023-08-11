package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntRect;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.p002ui.window.PopupPositionProvider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AndroidSelectionHandles.android.kt */
public final class HandlePositionProvider implements PopupPositionProvider {
    private final HandleReferencePoint handleReferencePoint;
    private final long offset;

    /* compiled from: AndroidSelectionHandles.android.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.foundation.text.selection.HandleReferencePoint[] r0 = androidx.compose.foundation.text.selection.HandleReferencePoint.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.selection.HandleReferencePoint r1 = androidx.compose.foundation.text.selection.HandleReferencePoint.TopLeft     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.selection.HandleReferencePoint r1 = androidx.compose.foundation.text.selection.HandleReferencePoint.TopRight     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.selection.HandleReferencePoint r1 = androidx.compose.foundation.text.selection.HandleReferencePoint.TopMiddle     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.HandlePositionProvider.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ HandlePositionProvider(HandleReferencePoint handleReferencePoint2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(handleReferencePoint2, j);
    }

    /* renamed from: calculatePosition-llwVHH4  reason: not valid java name */
    public long m33754calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        C12775o.m28639i(intRect, "anchorBounds");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        int i = WhenMappings.$EnumSwitchMapping$0[this.handleReferencePoint.ordinal()];
        if (i == 1) {
            return IntOffsetKt.IntOffset(intRect.getLeft() + IntOffset.m38586getXimpl(this.offset), intRect.getTop() + IntOffset.m38587getYimpl(this.offset));
        }
        if (i == 2) {
            return IntOffsetKt.IntOffset((intRect.getLeft() + IntOffset.m38586getXimpl(this.offset)) - IntSize.m38628getWidthimpl(j2), intRect.getTop() + IntOffset.m38587getYimpl(this.offset));
        }
        if (i == 3) {
            return IntOffsetKt.IntOffset((intRect.getLeft() + IntOffset.m38586getXimpl(this.offset)) - (IntSize.m38628getWidthimpl(j2) / 2), intRect.getTop() + IntOffset.m38587getYimpl(this.offset));
        }
        throw new NoWhenBranchMatchedException();
    }

    private HandlePositionProvider(HandleReferencePoint handleReferencePoint2, long j) {
        this.handleReferencePoint = handleReferencePoint2;
        this.offset = j;
    }
}
