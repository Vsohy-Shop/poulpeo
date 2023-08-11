package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.input.OffsetMapping;
import androidx.compose.p002ui.text.input.TransformedText;
import androidx.compose.p002ui.text.input.VisualTransformation;
import kotlin.jvm.internal.C12775o;

/* compiled from: ValidatingOffsetMapping.kt */
public final class ValidatingOffsetMappingKt {
    private static final OffsetMapping ValidatingEmptyOffsetMappingIdentity = new ValidatingOffsetMapping(OffsetMapping.Companion.getIdentity(), 0, 0);

    public static final TransformedText filterWithValidation(VisualTransformation visualTransformation, AnnotatedString annotatedString) {
        C12775o.m28639i(visualTransformation, "<this>");
        C12775o.m28639i(annotatedString, "text");
        TransformedText filter = visualTransformation.filter(annotatedString);
        return new TransformedText(filter.getText(), new ValidatingOffsetMapping(filter.getOffsetMapping(), annotatedString.length(), filter.getText().length()));
    }

    public static final OffsetMapping getValidatingEmptyOffsetMappingIdentity() {
        return ValidatingEmptyOffsetMappingIdentity;
    }
}
