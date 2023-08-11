package androidx.compose.p002ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleableRes;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.compose.ui.graphics.vector.compat.AndroidVectorParser */
/* compiled from: XmlVectorParser.android.kt */
public final class AndroidVectorParser {
    private int config;
    private final XmlPullParser xmlParser;

    public AndroidVectorParser(XmlPullParser xmlPullParser, int i) {
        C12775o.m28639i(xmlPullParser, "xmlParser");
        this.xmlParser = xmlPullParser;
        this.config = i;
    }

    public static /* synthetic */ AndroidVectorParser copy$default(AndroidVectorParser androidVectorParser, XmlPullParser xmlPullParser, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xmlPullParser = androidVectorParser.xmlParser;
        }
        if ((i2 & 2) != 0) {
            i = androidVectorParser.config;
        }
        return androidVectorParser.copy(xmlPullParser, i);
    }

    private final void updateConfig(int i) {
        this.config = i | this.config;
    }

    public final XmlPullParser component1() {
        return this.xmlParser;
    }

    public final int component2() {
        return this.config;
    }

    public final AndroidVectorParser copy(XmlPullParser xmlPullParser, int i) {
        C12775o.m28639i(xmlPullParser, "xmlParser");
        return new AndroidVectorParser(xmlPullParser, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
        if (C12775o.m28634d(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config) {
            return true;
        }
        return false;
    }

    public final int getConfig() {
        return this.config;
    }

    public final float getDimension(TypedArray typedArray, int i, float f) {
        C12775o.m28639i(typedArray, "typedArray");
        float dimension = typedArray.getDimension(i, f);
        updateConfig(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float getFloat(TypedArray typedArray, int i, float f) {
        C12775o.m28639i(typedArray, "typedArray");
        float f2 = typedArray.getFloat(i, f);
        updateConfig(typedArray.getChangingConfigurations());
        return f2;
    }

    public final int getInt(TypedArray typedArray, int i, int i2) {
        C12775o.m28639i(typedArray, "typedArray");
        int i3 = typedArray.getInt(i, i2);
        updateConfig(typedArray.getChangingConfigurations());
        return i3;
    }

    public final boolean getNamedBoolean(TypedArray typedArray, String str, @StyleableRes int i, boolean z) {
        C12775o.m28639i(typedArray, "typedArray");
        C12775o.m28639i(str, "attrName");
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(typedArray, this.xmlParser, str, i, z);
        updateConfig(typedArray.getChangingConfigurations());
        return namedBoolean;
    }

    public final ColorStateList getNamedColorStateList(TypedArray typedArray, Resources.Theme theme, String str, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "typedArray");
        C12775o.m28639i(str, "attrName");
        ColorStateList namedColorStateList = TypedArrayUtils.getNamedColorStateList(typedArray, this.xmlParser, theme, str, i);
        updateConfig(typedArray.getChangingConfigurations());
        return namedColorStateList;
    }

    public final ComplexColorCompat getNamedComplexColor(TypedArray typedArray, Resources.Theme theme, String str, @StyleableRes int i, @ColorInt int i2) {
        C12775o.m28639i(typedArray, "typedArray");
        C12775o.m28639i(str, "attrName");
        ComplexColorCompat namedComplexColor = TypedArrayUtils.getNamedComplexColor(typedArray, this.xmlParser, theme, str, i, i2);
        updateConfig(typedArray.getChangingConfigurations());
        C12775o.m28638h(namedComplexColor, "result");
        return namedComplexColor;
    }

    public final float getNamedFloat(TypedArray typedArray, String str, @StyleableRes int i, float f) {
        C12775o.m28639i(typedArray, "typedArray");
        C12775o.m28639i(str, "attrName");
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, this.xmlParser, str, i, f);
        updateConfig(typedArray.getChangingConfigurations());
        return namedFloat;
    }

    public final int getNamedInt(TypedArray typedArray, String str, @StyleableRes int i, int i2) {
        C12775o.m28639i(typedArray, "typedArray");
        C12775o.m28639i(str, "attrName");
        int namedInt = TypedArrayUtils.getNamedInt(typedArray, this.xmlParser, str, i, i2);
        updateConfig(typedArray.getChangingConfigurations());
        return namedInt;
    }

    public final String getString(TypedArray typedArray, int i) {
        C12775o.m28639i(typedArray, "typedArray");
        String string = typedArray.getString(i);
        updateConfig(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public int hashCode() {
        return (this.xmlParser.hashCode() * 31) + Integer.hashCode(this.config);
    }

    public final TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        C12775o.m28639i(resources, "res");
        C12775o.m28639i(attributeSet, "set");
        C12775o.m28639i(iArr, "attrs");
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, iArr);
        C12775o.m28638h(obtainAttributes, "obtainAttributes(\n      …          attrs\n        )");
        updateConfig(obtainAttributes.getChangingConfigurations());
        return obtainAttributes;
    }

    public final void setConfig(int i) {
        this.config = i;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.xmlParser + ", config=" + this.config + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }
}
