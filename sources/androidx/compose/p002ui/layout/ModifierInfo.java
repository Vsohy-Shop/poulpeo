package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.layout.ModifierInfo */
/* compiled from: LayoutInfo.kt */
public final class ModifierInfo {
    public static final int $stable = 8;
    private final LayoutCoordinates coordinates;
    private final Object extra;
    private final Modifier modifier;

    public ModifierInfo(Modifier modifier2, LayoutCoordinates layoutCoordinates, Object obj) {
        C12775o.m28639i(modifier2, "modifier");
        C12775o.m28639i(layoutCoordinates, "coordinates");
        this.modifier = modifier2;
        this.coordinates = layoutCoordinates;
        this.extra = obj;
    }

    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    public final Object getExtra() {
        return this.extra;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModifierInfo(Modifier modifier2, LayoutCoordinates layoutCoordinates, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modifier2, layoutCoordinates, (i & 4) != 0 ? null : obj);
    }
}
