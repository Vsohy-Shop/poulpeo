package androidx.compose.p002ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(33)
/* renamed from: androidx.compose.ui.text.android.StaticLayoutFactory33 */
/* compiled from: StaticLayoutFactory.kt */
final class StaticLayoutFactory33 {
    public static final StaticLayoutFactory33 INSTANCE = new StaticLayoutFactory33();

    private StaticLayoutFactory33() {
    }

    @DoNotInline
    public static final boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout) {
        C12775o.m28639i(staticLayout, "layout");
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    @DoNotInline
    public static final void setLineBreakConfig(StaticLayout.Builder builder, int i, int i2) {
        C12775o.m28639i(builder, "builder");
        LineBreakConfig build = new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build();
        C12775o.m28638h(build, "Builder()\n              …\n                .build()");
        builder.setLineBreakConfig(build);
    }
}
