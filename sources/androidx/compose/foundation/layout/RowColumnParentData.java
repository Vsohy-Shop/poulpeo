package androidx.compose.foundation.layout;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: RowColumnImpl.kt */
public final class RowColumnParentData {
    private CrossAxisAlignment crossAxisAlignment;
    private boolean fill;
    private float weight;

    public RowColumnParentData() {
        this(0.0f, false, (CrossAxisAlignment) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RowColumnParentData copy$default(RowColumnParentData rowColumnParentData, float f, boolean z, CrossAxisAlignment crossAxisAlignment2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = rowColumnParentData.weight;
        }
        if ((i & 2) != 0) {
            z = rowColumnParentData.fill;
        }
        if ((i & 4) != 0) {
            crossAxisAlignment2 = rowColumnParentData.crossAxisAlignment;
        }
        return rowColumnParentData.copy(f, z, crossAxisAlignment2);
    }

    public final float component1() {
        return this.weight;
    }

    public final boolean component2() {
        return this.fill;
    }

    public final CrossAxisAlignment component3() {
        return this.crossAxisAlignment;
    }

    public final RowColumnParentData copy(float f, boolean z, CrossAxisAlignment crossAxisAlignment2) {
        return new RowColumnParentData(f, z, crossAxisAlignment2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) obj;
        if (Float.compare(this.weight, rowColumnParentData.weight) == 0 && this.fill == rowColumnParentData.fill && C12775o.m28634d(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment)) {
            return true;
        }
        return false;
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int i;
        int hashCode = Float.hashCode(this.weight) * 31;
        boolean z = this.fill;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        CrossAxisAlignment crossAxisAlignment2 = this.crossAxisAlignment;
        if (crossAxisAlignment2 == null) {
            i = 0;
        } else {
            i = crossAxisAlignment2.hashCode();
        }
        return i2 + i;
    }

    public final void setCrossAxisAlignment(CrossAxisAlignment crossAxisAlignment2) {
        this.crossAxisAlignment = crossAxisAlignment2;
    }

    public final void setFill(boolean z) {
        this.fill = z;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ')';
    }

    public RowColumnParentData(float f, boolean z, CrossAxisAlignment crossAxisAlignment2) {
        this.weight = f;
        this.fill = z;
        this.crossAxisAlignment = crossAxisAlignment2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RowColumnParentData(float f, boolean z, CrossAxisAlignment crossAxisAlignment2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : crossAxisAlignment2);
    }
}
