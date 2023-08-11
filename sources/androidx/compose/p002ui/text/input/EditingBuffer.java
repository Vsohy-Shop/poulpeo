package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n1#2:403\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.EditingBuffer */
/* compiled from: EditingBuffer.kt */
public final class EditingBuffer {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;

    /* renamed from: androidx.compose.ui.text.input.EditingBuffer$Companion */
    /* compiled from: EditingBuffer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j);
    }

    private final void setSelectionEnd(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.selectionEnd = i;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i).toString());
    }

    private final void setSelectionStart(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.selectionStart = i;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i).toString());
    }

    public final void cancelComposition$ui_text_release() {
        replace$ui_text_release(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text_release(int i, int i2) {
        long TextRange = TextRangeKt.TextRange(i, i2);
        this.gapBuffer.replace(i, i2, "");
        long r5 = EditingBufferKt.m38118updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), TextRange);
        setSelectionStart(TextRange.m37973getMinimpl(r5));
        setSelectionEnd(TextRange.m37972getMaximpl(r5));
        if (hasComposition$ui_text_release()) {
            long r52 = EditingBufferKt.m38118updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), TextRange);
            if (TextRange.m37969getCollapsedimpl(r52)) {
                commitComposition$ui_text_release();
                return;
            }
            this.compositionStart = TextRange.m37973getMinimpl(r52);
            this.compositionEnd = TextRange.m37972getMaximpl(r52);
        }
    }

    public final char get$ui_text_release(int i) {
        return this.gapBuffer.get(i);
    }

    /* renamed from: getComposition-MzsxiRA$ui_text_release  reason: not valid java name */
    public final TextRange m38116getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return TextRange.m37963boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    public final int getCompositionEnd$ui_text_release() {
        return this.compositionEnd;
    }

    public final int getCompositionStart$ui_text_release() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text_release() {
        int i = this.selectionStart;
        int i2 = this.selectionEnd;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final int getLength$ui_text_release() {
        return this.gapBuffer.getLength();
    }

    /* renamed from: getSelection-d9O1mEE$ui_text_release  reason: not valid java name */
    public final long m38117getSelectiond9O1mEE$ui_text_release() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getSelectionEnd$ui_text_release() {
        return this.selectionEnd;
    }

    public final int getSelectionStart$ui_text_release() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text_release() {
        if (this.compositionStart != -1) {
            return true;
        }
        return false;
    }

    public final void replace$ui_text_release(int i, int i2, AnnotatedString annotatedString) {
        C12775o.m28639i(annotatedString, "text");
        replace$ui_text_release(i, i2, annotatedString.getText());
    }

    public final void setComposition$ui_text_release(int i, int i2) {
        if (i < 0 || i > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i < i2) {
            this.compositionStart = i;
            this.compositionEnd = i2;
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i + " > " + i2);
        }
    }

    public final void setCursor$ui_text_release(int i) {
        setSelection$ui_text_release(i, i);
    }

    public final void setSelection$ui_text_release(int i, int i2) {
        if (i < 0 || i > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i <= i2) {
            setSelectionStart(i);
            setSelectionEnd(i2);
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
        }
    }

    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(toString(), (List) null, (List) null, 6, (DefaultConstructorMarker) null);
    }

    public String toString() {
        return this.gapBuffer.toString();
    }

    public /* synthetic */ EditingBuffer(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    public final void replace$ui_text_release(int i, int i2, String str) {
        C12775o.m28639i(str, "text");
        if (i < 0 || i > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i <= i2) {
            this.gapBuffer.replace(i, i2, str);
            setSelectionStart(str.length() + i);
            setSelectionEnd(i + str.length());
            this.compositionStart = -1;
            this.compositionEnd = -1;
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
        }
    }

    private EditingBuffer(AnnotatedString annotatedString, long j) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m37973getMinimpl(j);
        this.selectionEnd = TextRange.m37972getMaximpl(j);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int r0 = TextRange.m37973getMinimpl(j);
        int r5 = TextRange.m37972getMaximpl(j);
        if (r0 < 0 || r0 > annotatedString.length()) {
            throw new IndexOutOfBoundsException("start (" + r0 + ") offset is outside of text region " + annotatedString.length());
        } else if (r5 < 0 || r5 > annotatedString.length()) {
            throw new IndexOutOfBoundsException("end (" + r5 + ") offset is outside of text region " + annotatedString.length());
        } else if (r0 > r5) {
            throw new IllegalArgumentException("Do not set reversed range: " + r0 + " > " + r5);
        }
    }

    private EditingBuffer(String str, long j) {
        this(new AnnotatedString(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), j, (DefaultConstructorMarker) null);
    }
}
