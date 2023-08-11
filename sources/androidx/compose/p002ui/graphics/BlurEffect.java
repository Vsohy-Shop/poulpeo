package androidx.compose.p002ui.graphics;

import android.graphics.RenderEffect;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.BlurEffect */
/* compiled from: AndroidRenderEffect.android.kt */
public final class BlurEffect extends RenderEffect {
    private final int edgeTreatment;
    private final float radiusX;
    private final float radiusY;
    private final RenderEffect renderEffect;

    public /* synthetic */ BlurEffect(RenderEffect renderEffect2, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(renderEffect2, f, f2, i);
    }

    /* access modifiers changed from: protected */
    @RequiresApi(31)
    public RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m35997createBlurEffect8A3gB4(this.renderEffect, this.radiusX, this.radiusY, this.edgeTreatment);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) obj;
        if (this.radiusX == blurEffect.radiusX) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.radiusY == blurEffect.radiusY) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && TileMode.m36071equalsimpl0(this.edgeTreatment, blurEffect.edgeTreatment) && C12775o.m28634d(this.renderEffect, blurEffect.renderEffect)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        RenderEffect renderEffect2 = this.renderEffect;
        if (renderEffect2 != null) {
            i = renderEffect2.hashCode();
        } else {
            i = 0;
        }
        return (((((i * 31) + Float.hashCode(this.radiusX)) * 31) + Float.hashCode(this.radiusY)) * 31) + TileMode.m36072hashCodeimpl(this.edgeTreatment);
    }

    public String toString() {
        return "BlurEffect(renderEffect=" + this.renderEffect + ", radiusX=" + this.radiusX + ", radiusY=" + this.radiusY + ", edgeTreatment=" + TileMode.m36073toStringimpl(this.edgeTreatment) + ')';
    }

    private BlurEffect(RenderEffect renderEffect2, float f, float f2, int i) {
        super((DefaultConstructorMarker) null);
        this.renderEffect = renderEffect2;
        this.radiusX = f;
        this.radiusY = f2;
        this.edgeTreatment = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BlurEffect(RenderEffect renderEffect2, float f, float f2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(renderEffect2, f, (i2 & 4) != 0 ? f : f2, (i2 & 8) != 0 ? TileMode.Companion.m36075getClamp3opZhB0() : i, (DefaultConstructorMarker) null);
    }
}
