package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.input.OffsetMapping;
import kotlin.jvm.internal.C12775o;

/* compiled from: ValidatingOffsetMapping.kt */
final class ValidatingOffsetMapping implements OffsetMapping {
    private final OffsetMapping delegate;
    private final int originalLength;
    private final int transformedLength;

    public ValidatingOffsetMapping(OffsetMapping offsetMapping, int i, int i2) {
        C12775o.m28639i(offsetMapping, "delegate");
        this.delegate = offsetMapping;
        this.originalLength = i;
        this.transformedLength = i2;
    }

    public int originalToTransformed(int i) {
        int originalToTransformed = this.delegate.originalToTransformed(i);
        boolean z = false;
        if (originalToTransformed >= 0 && originalToTransformed <= this.transformedLength) {
            z = true;
        }
        if (z) {
            return originalToTransformed;
        }
        throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i + " -> " + originalToTransformed + " is not in range of transformed text [0, " + this.transformedLength + ']').toString());
    }

    public int transformedToOriginal(int i) {
        int transformedToOriginal = this.delegate.transformedToOriginal(i);
        boolean z = false;
        if (transformedToOriginal >= 0 && transformedToOriginal <= this.originalLength) {
            z = true;
        }
        if (z) {
            return transformedToOriginal;
        }
        throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i + " -> " + transformedToOriginal + " is not in range of original text [0, " + this.originalLength + ']').toString());
    }
}
