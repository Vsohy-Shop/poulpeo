package androidx.compose.p002ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(28)
/* renamed from: androidx.compose.ui.text.android.StaticLayoutFactory28 */
/* compiled from: StaticLayoutFactory.kt */
final class StaticLayoutFactory28 {
    public static final StaticLayoutFactory28 INSTANCE = new StaticLayoutFactory28();

    private StaticLayoutFactory28() {
    }

    @DoNotInline
    public static final void setUseLineSpacingFromFallbacks(StaticLayout.Builder builder, boolean z) {
        C12775o.m28639i(builder, "builder");
        StaticLayout.Builder unused = builder.setUseLineSpacingFromFallbacks(z);
    }
}
