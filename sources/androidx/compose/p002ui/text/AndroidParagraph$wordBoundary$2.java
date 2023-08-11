package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.android.selection.WordBoundary;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.text.AndroidParagraph$wordBoundary$2 */
/* compiled from: AndroidParagraph.android.kt */
final class AndroidParagraph$wordBoundary$2 extends C12777p implements C13074a<WordBoundary> {
    final /* synthetic */ AndroidParagraph this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidParagraph$wordBoundary$2(AndroidParagraph androidParagraph) {
        super(0);
        this.this$0 = androidParagraph;
    }

    public final WordBoundary invoke() {
        return new WordBoundary(this.this$0.getTextLocale$ui_text_release(), this.this$0.layout.getText());
    }
}
