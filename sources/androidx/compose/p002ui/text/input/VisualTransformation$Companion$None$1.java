package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.AnnotatedString;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.input.VisualTransformation$Companion$None$1 */
/* compiled from: VisualTransformation.kt */
final class VisualTransformation$Companion$None$1 implements VisualTransformation {
    public static final VisualTransformation$Companion$None$1 INSTANCE = new VisualTransformation$Companion$None$1();

    VisualTransformation$Companion$None$1() {
    }

    public final TransformedText filter(AnnotatedString annotatedString) {
        C12775o.m28639i(annotatedString, "text");
        return new TransformedText(annotatedString, OffsetMapping.Companion.getIdentity());
    }
}
