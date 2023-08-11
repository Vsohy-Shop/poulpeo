package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.TextRangeKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.text.input.TextFieldValue */
/* compiled from: TextFieldValue.kt */
public final class TextFieldValue {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(TextFieldValue$Companion$Saver$1.INSTANCE, TextFieldValue$Companion$Saver$2.INSTANCE);
    private final AnnotatedString annotatedString;
    private final TextRange composition;
    private final long selection;

    /* renamed from: androidx.compose.ui.text.input.TextFieldValue$Companion */
    /* compiled from: TextFieldValue.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.Saver;
        }
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString2, long j, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString2, j, textRange);
    }

    /* renamed from: copy-3r_uNRQ$default  reason: not valid java name */
    public static /* synthetic */ TextFieldValue m38189copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString2, long j, TextRange textRange, int i, Object obj) {
        if ((i & 1) != 0) {
            annotatedString2 = textFieldValue.annotatedString;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m38191copy3r_uNRQ(annotatedString2, j, textRange);
    }

    /* renamed from: copy-3r_uNRQ  reason: not valid java name */
    public final TextFieldValue m38191copy3r_uNRQ(AnnotatedString annotatedString2, long j, TextRange textRange) {
        C12775o.m28639i(annotatedString2, "annotatedString");
        return new TextFieldValue(annotatedString2, j, textRange, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        if (!TextRange.m37968equalsimpl0(this.selection, textFieldValue.selection) || !C12775o.m28634d(this.composition, textFieldValue.composition) || !C12775o.m28634d(this.annotatedString, textFieldValue.annotatedString)) {
            return false;
        }
        return true;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    /* renamed from: getComposition-MzsxiRA  reason: not valid java name */
    public final TextRange m38193getCompositionMzsxiRA() {
        return this.composition;
    }

    /* renamed from: getSelection-d9O1mEE  reason: not valid java name */
    public final long m38194getSelectiond9O1mEE() {
        return this.selection;
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.annotatedString.hashCode() * 31) + TextRange.m37976hashCodeimpl(this.selection)) * 31;
        TextRange textRange = this.composition;
        if (textRange != null) {
            i = TextRange.m37976hashCodeimpl(textRange.m37979unboximpl());
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "TextFieldValue(text='" + this.annotatedString + "', selection=" + TextRange.m37978toStringimpl(this.selection) + ", composition=" + this.composition + ')';
    }

    public /* synthetic */ TextFieldValue(String str, long j, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, textRange);
    }

    /* renamed from: copy-3r_uNRQ  reason: not valid java name */
    public final TextFieldValue m38192copy3r_uNRQ(String str, long j, TextRange textRange) {
        C12775o.m28639i(str, "text");
        return new TextFieldValue(new AnnotatedString(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), j, textRange, (DefaultConstructorMarker) null);
    }

    private TextFieldValue(AnnotatedString annotatedString2, long j, TextRange textRange) {
        this.annotatedString = annotatedString2;
        this.selection = TextRangeKt.m37981constrain8ffj60Q(j, 0, getText().length());
        this.composition = textRange != null ? TextRange.m37963boximpl(TextRangeKt.m37981constrain8ffj60Q(textRange.m37979unboximpl(), 0, getText().length())) : null;
    }

    /* renamed from: copy-3r_uNRQ$default  reason: not valid java name */
    public static /* synthetic */ TextFieldValue m38190copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j, TextRange textRange, int i, Object obj) {
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m38192copy3r_uNRQ(str, j, textRange);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString2, long j, TextRange textRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString2, (i & 2) != 0 ? TextRange.Companion.m37980getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldValue(String str, long j, TextRange textRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TextRange.Companion.m37980getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    private TextFieldValue(String str, long j, TextRange textRange) {
        this(new AnnotatedString(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), j, textRange, (DefaultConstructorMarker) null);
    }
}
