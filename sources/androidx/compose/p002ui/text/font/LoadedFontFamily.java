package androidx.compose.p002ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.font.LoadedFontFamily */
/* compiled from: FontFamily.kt */
public final class LoadedFontFamily extends FontFamily {
    public static final int $stable = 0;
    private final Typeface typeface;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadedFontFamily(Typeface typeface2) {
        super(true, (DefaultConstructorMarker) null);
        C12775o.m28639i(typeface2, "typeface");
        this.typeface = typeface2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LoadedFontFamily) && C12775o.m28634d(this.typeface, ((LoadedFontFamily) obj).typeface)) {
            return true;
        }
        return false;
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }

    public int hashCode() {
        return this.typeface.hashCode();
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.typeface + ')';
    }
}
