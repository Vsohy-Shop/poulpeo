package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.text.TextRangeKt;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: Selection.kt */
public final class Selection {
    private final AnchorInfo end;
    private final boolean handlesCrossed;
    private final AnchorInfo start;

    @Immutable
    /* compiled from: Selection.kt */
    public static final class AnchorInfo {
        private final ResolvedTextDirection direction;
        private final int offset;
        private final long selectableId;

        public AnchorInfo(ResolvedTextDirection resolvedTextDirection, int i, long j) {
            C12775o.m28639i(resolvedTextDirection, "direction");
            this.direction = resolvedTextDirection;
            this.offset = i;
            this.selectableId = j;
        }

        public static /* synthetic */ AnchorInfo copy$default(AnchorInfo anchorInfo, ResolvedTextDirection resolvedTextDirection, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                resolvedTextDirection = anchorInfo.direction;
            }
            if ((i2 & 2) != 0) {
                i = anchorInfo.offset;
            }
            if ((i2 & 4) != 0) {
                j = anchorInfo.selectableId;
            }
            return anchorInfo.copy(resolvedTextDirection, i, j);
        }

        public final ResolvedTextDirection component1() {
            return this.direction;
        }

        public final int component2() {
            return this.offset;
        }

        public final long component3() {
            return this.selectableId;
        }

        public final AnchorInfo copy(ResolvedTextDirection resolvedTextDirection, int i, long j) {
            C12775o.m28639i(resolvedTextDirection, "direction");
            return new AnchorInfo(resolvedTextDirection, i, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnchorInfo)) {
                return false;
            }
            AnchorInfo anchorInfo = (AnchorInfo) obj;
            if (this.direction == anchorInfo.direction && this.offset == anchorInfo.offset && this.selectableId == anchorInfo.selectableId) {
                return true;
            }
            return false;
        }

        public final ResolvedTextDirection getDirection() {
            return this.direction;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final long getSelectableId() {
            return this.selectableId;
        }

        public int hashCode() {
            return (((this.direction.hashCode() * 31) + Integer.hashCode(this.offset)) * 31) + Long.hashCode(this.selectableId);
        }

        public String toString() {
            return "AnchorInfo(direction=" + this.direction + ", offset=" + this.offset + ", selectableId=" + this.selectableId + ')';
        }
    }

    public Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z) {
        C12775o.m28639i(anchorInfo, "start");
        C12775o.m28639i(anchorInfo2, "end");
        this.start = anchorInfo;
        this.end = anchorInfo2;
        this.handlesCrossed = z;
    }

    public static /* synthetic */ Selection copy$default(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            anchorInfo = selection.start;
        }
        if ((i & 2) != 0) {
            anchorInfo2 = selection.end;
        }
        if ((i & 4) != 0) {
            z = selection.handlesCrossed;
        }
        return selection.copy(anchorInfo, anchorInfo2, z);
    }

    public final AnchorInfo component1() {
        return this.start;
    }

    public final AnchorInfo component2() {
        return this.end;
    }

    public final boolean component3() {
        return this.handlesCrossed;
    }

    public final Selection copy(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z) {
        C12775o.m28639i(anchorInfo, "start");
        C12775o.m28639i(anchorInfo2, "end");
        return new Selection(anchorInfo, anchorInfo2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) obj;
        if (C12775o.m28634d(this.start, selection.start) && C12775o.m28634d(this.end, selection.end) && this.handlesCrossed == selection.handlesCrossed) {
            return true;
        }
        return false;
    }

    public final AnchorInfo getEnd() {
        return this.end;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    public final AnchorInfo getStart() {
        return this.start;
    }

    public int hashCode() {
        int hashCode = ((this.start.hashCode() * 31) + this.end.hashCode()) * 31;
        boolean z = this.handlesCrossed;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final Selection merge(Selection selection) {
        if (selection == null) {
            return this;
        }
        if (this.handlesCrossed) {
            return copy$default(this, selection.start, (AnchorInfo) null, false, 6, (Object) null);
        }
        return copy$default(this, (AnchorInfo) null, selection.end, false, 5, (Object) null);
    }

    public String toString() {
        return "Selection(start=" + this.start + ", end=" + this.end + ", handlesCrossed=" + this.handlesCrossed + ')';
    }

    /* renamed from: toTextRange-d9O1mEE  reason: not valid java name */
    public final long m33771toTextRanged9O1mEE() {
        return TextRangeKt.TextRange(this.start.getOffset(), this.end.getOffset());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(anchorInfo, anchorInfo2, (i & 4) != 0 ? false : z);
    }
}
