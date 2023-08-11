package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.ParentDataModifier;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* compiled from: RowColumnImpl.kt */
public final class LayoutWeightImpl extends InspectorValueInfo implements ParentDataModifier {
    private final boolean fill;
    private final float weight;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutWeightImpl(float f, boolean z, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        C12775o.m28639i(function1, "inspectorInfo");
        this.weight = f;
        this.fill = z;
    }

    public boolean equals(Object obj) {
        LayoutWeightImpl layoutWeightImpl;
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutWeightImpl) {
            layoutWeightImpl = (LayoutWeightImpl) obj;
        } else {
            layoutWeightImpl = null;
        }
        if (layoutWeightImpl == null) {
            return false;
        }
        if (this.weight == layoutWeightImpl.weight) {
            z = true;
        } else {
            z = false;
        }
        if (!z || this.fill != layoutWeightImpl.fill) {
            return false;
        }
        return true;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (Float.hashCode(this.weight) * 31) + Boolean.hashCode(this.fill);
    }

    public String toString() {
        return "LayoutWeightImpl(weight=" + this.weight + ", fill=" + this.fill + ')';
    }

    public RowColumnParentData modifyParentData(Density density, Object obj) {
        C12775o.m28639i(density, "<this>");
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, (CrossAxisAlignment) null, 7, (DefaultConstructorMarker) null);
        }
        rowColumnParentData.setWeight(this.weight);
        rowColumnParentData.setFill(this.fill);
        return rowColumnParentData;
    }
}
