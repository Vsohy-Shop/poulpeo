package androidx.compose.p002ui.text.font;

import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.font.AndroidFontResolveInterceptor */
/* compiled from: AndroidFontResolveInterceptor.android.kt */
public final class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {
    private final int fontWeightAdjustment;

    public AndroidFontResolveInterceptor(int i) {
        this.fontWeightAdjustment = i;
    }

    private final int component1() {
        return this.fontWeightAdjustment;
    }

    public static /* synthetic */ AndroidFontResolveInterceptor copy$default(AndroidFontResolveInterceptor androidFontResolveInterceptor, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = androidFontResolveInterceptor.fontWeightAdjustment;
        }
        return androidFontResolveInterceptor.copy(i);
    }

    public final AndroidFontResolveInterceptor copy(int i) {
        return new AndroidFontResolveInterceptor(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AndroidFontResolveInterceptor) && this.fontWeightAdjustment == ((AndroidFontResolveInterceptor) obj).fontWeightAdjustment) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.fontWeightAdjustment);
    }

    public FontWeight interceptFontWeight(FontWeight fontWeight) {
        C12775o.m28639i(fontWeight, "fontWeight");
        int i = this.fontWeightAdjustment;
        if (i == 0 || i == Integer.MAX_VALUE) {
            return fontWeight;
        }
        return new FontWeight(C13537l.m30886m(fontWeight.getWeight() + this.fontWeightAdjustment, 1, 1000));
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.fontWeightAdjustment + ')';
    }
}
