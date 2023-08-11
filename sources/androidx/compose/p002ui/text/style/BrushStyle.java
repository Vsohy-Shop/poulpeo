package androidx.compose.p002ui.text.style;

import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ShaderBrush;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.style.BrushStyle */
/* compiled from: TextForegroundStyle.kt */
final class BrushStyle implements TextForegroundStyle {
    private final float alpha;
    private final ShaderBrush value;

    public BrushStyle(ShaderBrush shaderBrush, float f) {
        C12775o.m28639i(shaderBrush, "value");
        this.value = shaderBrush;
        this.alpha = f;
    }

    public static /* synthetic */ BrushStyle copy$default(BrushStyle brushStyle, ShaderBrush shaderBrush, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            shaderBrush = brushStyle.value;
        }
        if ((i & 2) != 0) {
            f = brushStyle.getAlpha();
        }
        return brushStyle.copy(shaderBrush, f);
    }

    public final ShaderBrush component1() {
        return this.value;
    }

    public final float component2() {
        return getAlpha();
    }

    public final BrushStyle copy(ShaderBrush shaderBrush, float f) {
        C12775o.m28639i(shaderBrush, "value");
        return new BrushStyle(shaderBrush, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrushStyle)) {
            return false;
        }
        BrushStyle brushStyle = (BrushStyle) obj;
        if (C12775o.m28634d(this.value, brushStyle.value) && Float.compare(getAlpha(), brushStyle.getAlpha()) == 0) {
            return true;
        }
        return false;
    }

    public float getAlpha() {
        return this.alpha;
    }

    public Brush getBrush() {
        return this.value;
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public long m38250getColor0d7_KjU() {
        return Color.Companion.m35707getUnspecified0d7_KjU();
    }

    public final ShaderBrush getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + Float.hashCode(getAlpha());
    }

    public String toString() {
        return "BrushStyle(value=" + this.value + ", alpha=" + getAlpha() + ')';
    }
}
