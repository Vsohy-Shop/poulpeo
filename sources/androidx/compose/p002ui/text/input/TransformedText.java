package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.TransformedText */
/* compiled from: VisualTransformation.kt */
public final class TransformedText {
    public static final int $stable = 8;
    private final OffsetMapping offsetMapping;
    private final AnnotatedString text;

    public TransformedText(AnnotatedString annotatedString, OffsetMapping offsetMapping2) {
        C12775o.m28639i(annotatedString, "text");
        C12775o.m28639i(offsetMapping2, "offsetMapping");
        this.text = annotatedString;
        this.offsetMapping = offsetMapping2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedText)) {
            return false;
        }
        TransformedText transformedText = (TransformedText) obj;
        if (C12775o.m28634d(this.text, transformedText.text) && C12775o.m28634d(this.offsetMapping, transformedText.offsetMapping)) {
            return true;
        }
        return false;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + this.text + ", offsetMapping=" + this.offsetMapping + ')';
    }
}
