package androidx.compose.p002ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
/* renamed from: androidx.compose.ui.text.android.LayoutIntrinsics */
/* compiled from: LayoutIntrinsics.kt */
public final class LayoutIntrinsics {
    public static final int $stable = 8;
    private BoringLayout.Metrics _boringMetrics;
    private float _maxIntrinsicWidth = Float.NaN;
    private float _minIntrinsicWidth = Float.NaN;
    private boolean boringMetricsIsInit;
    private final CharSequence charSequence;
    private final int textDirectionHeuristic;
    private final TextPaint textPaint;

    public LayoutIntrinsics(CharSequence charSequence2, TextPaint textPaint2, int i) {
        C12775o.m28639i(charSequence2, "charSequence");
        C12775o.m28639i(textPaint2, "textPaint");
        this.charSequence = charSequence2;
        this.textPaint = textPaint2;
        this.textDirectionHeuristic = i;
    }

    public final BoringLayout.Metrics getBoringMetrics() {
        if (!this.boringMetricsIsInit) {
            this._boringMetrics = BoringLayoutFactory.INSTANCE.measure(this.charSequence, this.textPaint, TextLayoutKt.getTextDirectionHeuristic(this.textDirectionHeuristic));
            this.boringMetricsIsInit = true;
        }
        return this._boringMetrics;
    }

    public final float getMaxIntrinsicWidth() {
        Float f;
        if (!Float.isNaN(this._maxIntrinsicWidth)) {
            return this._maxIntrinsicWidth;
        }
        BoringLayout.Metrics boringMetrics = getBoringMetrics();
        if (boringMetrics != null) {
            f = Float.valueOf((float) boringMetrics.width);
        } else {
            f = null;
        }
        if (f == null) {
            CharSequence charSequence2 = this.charSequence;
            f = Float.valueOf((float) Math.ceil((double) Layout.getDesiredWidth(charSequence2, 0, charSequence2.length(), this.textPaint)));
        }
        if (LayoutIntrinsicsKt.shouldIncreaseMaxIntrinsic(f.floatValue(), this.charSequence, this.textPaint)) {
            f = Float.valueOf(f.floatValue() + 0.5f);
        }
        float floatValue = f.floatValue();
        this._maxIntrinsicWidth = floatValue;
        return floatValue;
    }

    public final float getMinIntrinsicWidth() {
        if (!Float.isNaN(this._minIntrinsicWidth)) {
            return this._minIntrinsicWidth;
        }
        float minIntrinsicWidth = LayoutIntrinsicsKt.minIntrinsicWidth(this.charSequence, this.textPaint);
        this._minIntrinsicWidth = minIntrinsicWidth;
        return minIntrinsicWidth;
    }
}
