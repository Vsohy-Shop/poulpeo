package androidx.compose.p002ui.text.style;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.text.style.TextForegroundStyle$merge$1 */
/* compiled from: TextForegroundStyle.kt */
final class TextForegroundStyle$merge$1 extends C12777p implements C13074a<Float> {
    final /* synthetic */ TextForegroundStyle this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextForegroundStyle$merge$1(TextForegroundStyle textForegroundStyle) {
        super(0);
        this.this$0 = textForegroundStyle;
    }

    public final Float invoke() {
        return Float.valueOf(this.this$0.getAlpha());
    }
}
