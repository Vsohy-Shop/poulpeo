package androidx.compose.p002ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(26)
/* renamed from: androidx.compose.ui.text.android.StaticLayoutFactory26 */
/* compiled from: StaticLayoutFactory.kt */
final class StaticLayoutFactory26 {
    public static final StaticLayoutFactory26 INSTANCE = new StaticLayoutFactory26();

    private StaticLayoutFactory26() {
    }

    @DoNotInline
    public static final void setJustificationMode(StaticLayout.Builder builder, int i) {
        C12775o.m28639i(builder, "builder");
        StaticLayout.Builder unused = builder.setJustificationMode(i);
    }
}
