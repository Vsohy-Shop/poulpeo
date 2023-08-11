package androidx.compose.foundation.shape;

import androidx.compose.p002ui.platform.InspectableValue;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCornerSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerSize.kt\nandroidx/compose/foundation/shape/DpCornerSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
/* compiled from: CornerSize.kt */
final class DpCornerSize implements CornerSize, InspectableValue {
    private final float size;

    public /* synthetic */ DpCornerSize(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: component1-D9Ej5fM  reason: not valid java name */
    private final float m33617component1D9Ej5fM() {
        return this.size;
    }

    /* renamed from: copy-0680j_4$default  reason: not valid java name */
    public static /* synthetic */ DpCornerSize m33618copy0680j_4$default(DpCornerSize dpCornerSize, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dpCornerSize.size;
        }
        return dpCornerSize.m33619copy0680j_4(f);
    }

    /* renamed from: copy-0680j_4  reason: not valid java name */
    public final DpCornerSize m33619copy0680j_4(float f) {
        return new DpCornerSize(f, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DpCornerSize) && C1232Dp.m38473equalsimpl0(this.size, ((DpCornerSize) obj).size)) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object getValueOverride() {
        return C1232Dp.m38466boximpl(m33620getValueOverrideD9Ej5fM());
    }

    /* renamed from: getValueOverride-D9Ej5fM  reason: not valid java name */
    public float m33620getValueOverrideD9Ej5fM() {
        return this.size;
    }

    public int hashCode() {
        return C1232Dp.m38474hashCodeimpl(this.size);
    }

    /* renamed from: toPx-TmRCtEA  reason: not valid java name */
    public float m33621toPxTmRCtEA(long j, Density density) {
        C12775o.m28639i(density, "density");
        return density.m38449toPx0680j_4(this.size);
    }

    public String toString() {
        return "CornerSize(size = " + this.size + ".dp)";
    }

    private DpCornerSize(float f) {
        this.size = f;
    }
}
