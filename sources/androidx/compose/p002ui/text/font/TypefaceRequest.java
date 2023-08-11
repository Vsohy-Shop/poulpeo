package androidx.compose.p002ui.text.font;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.font.TypefaceRequest */
/* compiled from: FontFamilyResolver.kt */
public final class TypefaceRequest {
    private final FontFamily fontFamily;
    private final int fontStyle;
    private final int fontSynthesis;
    private final FontWeight fontWeight;
    private final Object resourceLoaderCacheKey;

    public /* synthetic */ TypefaceRequest(FontFamily fontFamily2, FontWeight fontWeight2, int i, int i2, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontFamily2, fontWeight2, i, i2, obj);
    }

    /* renamed from: copy-e1PVR60$default  reason: not valid java name */
    public static /* synthetic */ TypefaceRequest m38110copye1PVR60$default(TypefaceRequest typefaceRequest, FontFamily fontFamily2, FontWeight fontWeight2, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            fontFamily2 = typefaceRequest.fontFamily;
        }
        if ((i3 & 2) != 0) {
            fontWeight2 = typefaceRequest.fontWeight;
        }
        FontWeight fontWeight3 = fontWeight2;
        if ((i3 & 4) != 0) {
            i = typefaceRequest.fontStyle;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = typefaceRequest.fontSynthesis;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        return typefaceRequest.m38113copye1PVR60(fontFamily2, fontWeight3, i4, i5, obj);
    }

    public final FontFamily component1() {
        return this.fontFamily;
    }

    public final FontWeight component2() {
        return this.fontWeight;
    }

    /* renamed from: component3-_-LCdwA  reason: not valid java name */
    public final int m38111component3_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: component4-GVVA2EU  reason: not valid java name */
    public final int m38112component4GVVA2EU() {
        return this.fontSynthesis;
    }

    public final Object component5() {
        return this.resourceLoaderCacheKey;
    }

    /* renamed from: copy-e1PVR60  reason: not valid java name */
    public final TypefaceRequest m38113copye1PVR60(FontFamily fontFamily2, FontWeight fontWeight2, int i, int i2, Object obj) {
        C12775o.m28639i(fontWeight2, "fontWeight");
        return new TypefaceRequest(fontFamily2, fontWeight2, i, i2, obj, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        if (C12775o.m28634d(this.fontFamily, typefaceRequest.fontFamily) && C12775o.m28634d(this.fontWeight, typefaceRequest.fontWeight) && FontStyle.m38063equalsimpl0(this.fontStyle, typefaceRequest.fontStyle) && FontSynthesis.m38072equalsimpl0(this.fontSynthesis, typefaceRequest.fontSynthesis) && C12775o.m28634d(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey)) {
            return true;
        }
        return false;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getFontStyle-_-LCdwA  reason: not valid java name */
    public final int m38114getFontStyle_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-GVVA2EU  reason: not valid java name */
    public final int m38115getFontSynthesisGVVA2EU() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final Object getResourceLoaderCacheKey() {
        return this.resourceLoaderCacheKey;
    }

    public int hashCode() {
        int i;
        FontFamily fontFamily2 = this.fontFamily;
        int i2 = 0;
        if (fontFamily2 == null) {
            i = 0;
        } else {
            i = fontFamily2.hashCode();
        }
        int hashCode = ((((((i * 31) + this.fontWeight.hashCode()) * 31) + FontStyle.m38064hashCodeimpl(this.fontStyle)) * 31) + FontSynthesis.m38073hashCodeimpl(this.fontSynthesis)) * 31;
        Object obj = this.resourceLoaderCacheKey;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + FontStyle.m38065toStringimpl(this.fontStyle) + ", fontSynthesis=" + FontSynthesis.m38076toStringimpl(this.fontSynthesis) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + ')';
    }

    private TypefaceRequest(FontFamily fontFamily2, FontWeight fontWeight2, int i, int i2, Object obj) {
        this.fontFamily = fontFamily2;
        this.fontWeight = fontWeight2;
        this.fontStyle = i;
        this.fontSynthesis = i2;
        this.resourceLoaderCacheKey = obj;
    }
}
