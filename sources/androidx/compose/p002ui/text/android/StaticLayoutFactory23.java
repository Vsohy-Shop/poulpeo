package androidx.compose.p002ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.core.p004os.BuildCompat;
import kotlin.jvm.internal.C12775o;

@RequiresApi(23)
/* renamed from: androidx.compose.ui.text.android.StaticLayoutFactory23 */
/* compiled from: StaticLayoutFactory.kt */
final class StaticLayoutFactory23 implements StaticLayoutFactoryImpl {
    @DoNotInline
    public StaticLayout create(StaticLayoutParams staticLayoutParams) {
        C12775o.m28639i(staticLayoutParams, "params");
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(staticLayoutParams.getText(), staticLayoutParams.getStart(), staticLayoutParams.getEnd(), staticLayoutParams.getPaint(), staticLayoutParams.getWidth());
        obtain.setTextDirection(staticLayoutParams.getTextDir());
        obtain.setAlignment(staticLayoutParams.getAlignment());
        obtain.setMaxLines(staticLayoutParams.getMaxLines());
        obtain.setEllipsize(staticLayoutParams.getEllipsize());
        obtain.setEllipsizedWidth(staticLayoutParams.getEllipsizedWidth());
        obtain.setLineSpacing(staticLayoutParams.getLineSpacingExtra(), staticLayoutParams.getLineSpacingMultiplier());
        obtain.setIncludePad(staticLayoutParams.getIncludePadding());
        obtain.setBreakStrategy(staticLayoutParams.getBreakStrategy());
        obtain.setHyphenationFrequency(staticLayoutParams.getHyphenationFrequency());
        obtain.setIndents(staticLayoutParams.getLeftIndents(), staticLayoutParams.getRightIndents());
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            C12775o.m28638h(obtain, "this");
            StaticLayoutFactory26.setJustificationMode(obtain, staticLayoutParams.getJustificationMode());
        }
        if (i >= 28) {
            C12775o.m28638h(obtain, "this");
            StaticLayoutFactory28.setUseLineSpacingFromFallbacks(obtain, staticLayoutParams.getUseFallbackLineSpacing());
        }
        if (i >= 33) {
            C12775o.m28638h(obtain, "this");
            StaticLayoutFactory33.setLineBreakConfig(obtain, staticLayoutParams.getLineBreakStyle(), staticLayoutParams.getLineBreakWordStyle());
        }
        StaticLayout build = obtain.build();
        C12775o.m28638h(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }

    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout, boolean z) {
        C12775o.m28639i(staticLayout, "layout");
        if (BuildCompat.isAtLeastT()) {
            return StaticLayoutFactory33.isFallbackLineSpacingEnabled(staticLayout);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return z;
        }
        return false;
    }
}
