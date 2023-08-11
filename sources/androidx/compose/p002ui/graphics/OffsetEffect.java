package androidx.compose.p002ui.graphics;

import android.graphics.RenderEffect;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.OffsetEffect */
/* compiled from: AndroidRenderEffect.android.kt */
public final class OffsetEffect extends RenderEffect {
    private final long offset;
    private final RenderEffect renderEffect;

    public /* synthetic */ OffsetEffect(RenderEffect renderEffect2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(renderEffect2, j);
    }

    /* access modifiers changed from: protected */
    @RequiresApi(31)
    public RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m35998createOffsetEffectUv8p0NA(this.renderEffect, this.offset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetEffect)) {
            return false;
        }
        OffsetEffect offsetEffect = (OffsetEffect) obj;
        if (C12775o.m28634d(this.renderEffect, offsetEffect.renderEffect) && Offset.m35419equalsimpl0(this.offset, offsetEffect.offset)) {
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
        return (i * 31) + Offset.m35424hashCodeimpl(this.offset);
    }

    public String toString() {
        return "OffsetEffect(renderEffect=" + this.renderEffect + ", offset=" + Offset.m35430toStringimpl(this.offset) + ')';
    }

    private OffsetEffect(RenderEffect renderEffect2, long j) {
        super((DefaultConstructorMarker) null);
        this.renderEffect = renderEffect2;
        this.offset = j;
    }
}
