package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.PasswordVisualTransformation */
/* compiled from: VisualTransformation.kt */
public final class PasswordVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private final char mask;

    public PasswordVisualTransformation() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PasswordVisualTransformation) && this.mask == ((PasswordVisualTransformation) obj).mask) {
            return true;
        }
        return false;
    }

    public TransformedText filter(AnnotatedString annotatedString) {
        C12775o.m28639i(annotatedString, "text");
        return new TransformedText(new AnnotatedString(C13754v.m31535w(String.valueOf(this.mask), annotatedString.getText().length()), (List) null, (List) null, 6, (DefaultConstructorMarker) null), OffsetMapping.Companion.getIdentity());
    }

    public final char getMask() {
        return this.mask;
    }

    public int hashCode() {
        return Character.hashCode(this.mask);
    }

    public PasswordVisualTransformation(char c) {
        this.mask = c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PasswordVisualTransformation(char c, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 8226 : c);
    }
}
