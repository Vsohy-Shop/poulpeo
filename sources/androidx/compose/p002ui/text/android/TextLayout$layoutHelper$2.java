package androidx.compose.p002ui.text.android;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.text.android.TextLayout$layoutHelper$2 */
/* compiled from: TextLayout.kt */
final class TextLayout$layoutHelper$2 extends C12777p implements C13074a<LayoutHelper> {
    final /* synthetic */ TextLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextLayout$layoutHelper$2(TextLayout textLayout) {
        super(0);
        this.this$0 = textLayout;
    }

    public final LayoutHelper invoke() {
        return new LayoutHelper(this.this$0.getLayout());
    }
}
