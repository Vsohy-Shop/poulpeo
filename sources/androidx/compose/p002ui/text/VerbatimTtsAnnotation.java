package androidx.compose.p002ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.VerbatimTtsAnnotation */
/* compiled from: TtsAnnotation.kt */
public final class VerbatimTtsAnnotation extends TtsAnnotation {
    public static final int $stable = 0;
    private final String verbatim;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerbatimTtsAnnotation(String str) {
        super((DefaultConstructorMarker) null);
        C12775o.m28639i(str, "verbatim");
        this.verbatim = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof VerbatimTtsAnnotation) && C12775o.m28634d(this.verbatim, ((VerbatimTtsAnnotation) obj).verbatim)) {
            return true;
        }
        return false;
    }

    public final String getVerbatim() {
        return this.verbatim;
    }

    public int hashCode() {
        return this.verbatim.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.verbatim + ')';
    }
}
