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
public final class HorizontalAlignModifier extends InspectorValueInfo implements ParentDataModifier {
    private final Alignment.Horizontal horizontal;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalAlignModifier(Alignment.Horizontal horizontal2, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        C12775o.m28639i(horizontal2, "horizontal");
        C12775o.m28639i(function1, "inspectorInfo");
        this.horizontal = horizontal2;
    }

    public boolean equals(Object obj) {
        HorizontalAlignModifier horizontalAlignModifier;
        if (this == obj) {
            return true;
        }
        if (obj instanceof HorizontalAlignModifier) {
            horizontalAlignModifier = (HorizontalAlignModifier) obj;
        } else {
            horizontalAlignModifier = null;
        }
        if (horizontalAlignModifier == null) {
            return false;
        }
        return C12775o.m28634d(this.horizontal, horizontalAlignModifier.horizontal);
    }

    public final Alignment.Horizontal getHorizontal() {
        return this.horizontal;
    }

    public int hashCode() {
        return this.horizontal.hashCode();
    }

    public String toString() {
        return "HorizontalAlignModifier(horizontal=" + this.horizontal + ')';
    }

    public RowColumnParentData modifyParentData(Density density, Object obj) {
        C12775o.m28639i(density, "<this>");
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, (CrossAxisAlignment) null, 7, (DefaultConstructorMarker) null);
        }
        rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.horizontal$foundation_layout_release(this.horizontal));
        return rowColumnParentData;
    }
}
