package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.layout.ParentDataModifier;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* compiled from: RowColumnImpl.kt */
public final class VerticalAlignModifier extends InspectorValueInfo implements ParentDataModifier {
    private final Alignment.Vertical vertical;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerticalAlignModifier(Alignment.Vertical vertical2, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        C12775o.m28639i(vertical2, "vertical");
        C12775o.m28639i(function1, "inspectorInfo");
        this.vertical = vertical2;
    }

    public boolean equals(Object obj) {
        VerticalAlignModifier verticalAlignModifier;
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerticalAlignModifier) {
            verticalAlignModifier = (VerticalAlignModifier) obj;
        } else {
            verticalAlignModifier = null;
        }
        if (verticalAlignModifier == null) {
            return false;
        }
        return C12775o.m28634d(this.vertical, verticalAlignModifier.vertical);
    }

    public final Alignment.Vertical getVertical() {
        return this.vertical;
    }

    public int hashCode() {
        return this.vertical.hashCode();
    }

    public String toString() {
        return "VerticalAlignModifier(vertical=" + this.vertical + ')';
    }

    public RowColumnParentData modifyParentData(Density density, Object obj) {
        C12775o.m28639i(density, "<this>");
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, (CrossAxisAlignment) null, 7, (DefaultConstructorMarker) null);
        }
        rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.vertical$foundation_layout_release(this.vertical));
        return rowColumnParentData;
    }
}
