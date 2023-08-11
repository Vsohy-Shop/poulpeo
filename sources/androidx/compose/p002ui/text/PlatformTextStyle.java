package androidx.compose.p002ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.PlatformTextStyle */
/* compiled from: AndroidTextStyle.android.kt */
public final class PlatformTextStyle {
    public static final int $stable = 0;
    private final PlatformParagraphStyle paragraphStyle;
    private final PlatformSpanStyle spanStyle;

    public /* synthetic */ PlatformTextStyle(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) obj;
        if (C12775o.m28634d(this.paragraphStyle, platformTextStyle.paragraphStyle) && C12775o.m28634d(this.spanStyle, platformTextStyle.spanStyle)) {
            return true;
        }
        return false;
    }

    public final PlatformParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    public final PlatformSpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    public int hashCode() {
        int i;
        PlatformSpanStyle platformSpanStyle = this.spanStyle;
        int i2 = 0;
        if (platformSpanStyle != null) {
            i = platformSpanStyle.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        PlatformParagraphStyle platformParagraphStyle = this.paragraphStyle;
        if (platformParagraphStyle != null) {
            i2 = platformParagraphStyle.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.spanStyle + ", paragraphSyle=" + this.paragraphStyle + ')';
    }

    public PlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        this.spanStyle = platformSpanStyle;
        this.paragraphStyle = platformParagraphStyle;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlatformTextStyle(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public PlatformTextStyle(boolean z) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(z));
    }

    private PlatformTextStyle(int i) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(i, (DefaultConstructorMarker) null));
    }
}
