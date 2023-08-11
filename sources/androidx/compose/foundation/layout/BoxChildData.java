package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.layout.ParentDataModifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* compiled from: Box.kt */
final class BoxChildData extends InspectorValueInfo implements ParentDataModifier {
    private Alignment alignment;
    private boolean matchParentSize;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BoxChildData(Alignment alignment2, boolean z, Function1<InspectorInfo, C11921v> function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment2, (i & 2) != 0 ? false : z, (i & 4) != 0 ? InspectableValueKt.getNoInspectorInfo() : function1);
    }

    public boolean equals(Object obj) {
        BoxChildData boxChildData;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BoxChildData) {
            boxChildData = (BoxChildData) obj;
        } else {
            boxChildData = null;
        }
        if (boxChildData == null) {
            return false;
        }
        if (!C12775o.m28634d(this.alignment, boxChildData.alignment) || this.matchParentSize != boxChildData.matchParentSize) {
            return false;
        }
        return true;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.matchParentSize);
    }

    public BoxChildData modifyParentData(Density density, Object obj) {
        C12775o.m28639i(density, "<this>");
        return this;
    }

    public final void setAlignment(Alignment alignment2) {
        C12775o.m28639i(alignment2, "<set-?>");
        this.alignment = alignment2;
    }

    public final void setMatchParentSize(boolean z) {
        this.matchParentSize = z;
    }

    public String toString() {
        return "BoxChildData(alignment=" + this.alignment + ", matchParentSize=" + this.matchParentSize + ')';
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxChildData(Alignment alignment2, boolean z, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        C12775o.m28639i(alignment2, "alignment");
        C12775o.m28639i(function1, "inspectorInfo");
        this.alignment = alignment2;
        this.matchParentSize = z;
    }
}
