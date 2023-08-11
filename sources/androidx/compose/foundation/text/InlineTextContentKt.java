package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.AnnotatedString;
import kotlin.jvm.internal.C12775o;

/* compiled from: InlineTextContent.kt */
public final class InlineTextContentKt {
    public static final String INLINE_CONTENT_TAG = "androidx.compose.foundation.text.inlineContent";
    private static final String REPLACEMENT_CHAR = "�";

    public static final void appendInlineContent(AnnotatedString.Builder builder, String str, String str2) {
        boolean z;
        C12775o.m28639i(builder, "<this>");
        C12775o.m28639i(str, "id");
        C12775o.m28639i(str2, "alternateText");
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            builder.pushStringAnnotation(INLINE_CONTENT_TAG, str);
            builder.append(str2);
            builder.pop();
            return;
        }
        throw new IllegalArgumentException("alternateText can't be an empty string.".toString());
    }

    public static /* synthetic */ void appendInlineContent$default(AnnotatedString.Builder builder, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = REPLACEMENT_CHAR;
        }
        appendInlineContent(builder, str, str2);
    }
}
