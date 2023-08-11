package androidx.compose.material;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Immutable;
import com.adjust.sdk.Constants;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nShapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shapes.kt\nandroidx/compose/material/Shapes\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,101:1\n154#2:102\n154#2:103\n154#2:104\n*S KotlinDebug\n*F\n+ 1 Shapes.kt\nandroidx/compose/material/Shapes\n*L\n50#1:102\n54#1:103\n58#1:104\n*E\n"})
/* compiled from: Shapes.kt */
public final class Shapes {
    public static final int $stable = 0;
    private final CornerBasedShape large;
    private final CornerBasedShape medium;
    private final CornerBasedShape small;

    public Shapes() {
        this((CornerBasedShape) null, (CornerBasedShape) null, (CornerBasedShape) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Shapes copy$default(Shapes shapes, CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, int i, Object obj) {
        if ((i & 1) != 0) {
            cornerBasedShape = shapes.small;
        }
        if ((i & 2) != 0) {
            cornerBasedShape2 = shapes.medium;
        }
        if ((i & 4) != 0) {
            cornerBasedShape3 = shapes.large;
        }
        return shapes.copy(cornerBasedShape, cornerBasedShape2, cornerBasedShape3);
    }

    public final Shapes copy(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3) {
        C12775o.m28639i(cornerBasedShape, Constants.SMALL);
        C12775o.m28639i(cornerBasedShape2, Constants.MEDIUM);
        C12775o.m28639i(cornerBasedShape3, Constants.LARGE);
        return new Shapes(cornerBasedShape, cornerBasedShape2, cornerBasedShape3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        if (C12775o.m28634d(this.small, shapes.small) && C12775o.m28634d(this.medium, shapes.medium) && C12775o.m28634d(this.large, shapes.large)) {
            return true;
        }
        return false;
    }

    public final CornerBasedShape getLarge() {
        return this.large;
    }

    public final CornerBasedShape getMedium() {
        return this.medium;
    }

    public final CornerBasedShape getSmall() {
        return this.small;
    }

    public int hashCode() {
        return (((this.small.hashCode() * 31) + this.medium.hashCode()) * 31) + this.large.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ')';
    }

    public Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3) {
        C12775o.m28639i(cornerBasedShape, Constants.SMALL);
        C12775o.m28639i(cornerBasedShape2, Constants.MEDIUM);
        C12775o.m28639i(cornerBasedShape3, Constants.LARGE);
        this.small = cornerBasedShape;
        this.medium = cornerBasedShape2;
        this.large = cornerBasedShape3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RoundedCornerShapeKt.m33626RoundedCornerShape0680j_4(C1232Dp.m38468constructorimpl((float) 4)) : cornerBasedShape, (i & 2) != 0 ? RoundedCornerShapeKt.m33626RoundedCornerShape0680j_4(C1232Dp.m38468constructorimpl((float) 4)) : cornerBasedShape2, (i & 4) != 0 ? RoundedCornerShapeKt.m33626RoundedCornerShape0680j_4(C1232Dp.m38468constructorimpl((float) 0)) : cornerBasedShape3);
    }
}
