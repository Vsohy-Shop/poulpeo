package androidx.compose.p002ui.text.font;

import androidx.compose.p002ui.text.ExperimentalTextApi;
import androidx.compose.p002ui.text.font.FontVariation;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.font.ResourceFont */
/* compiled from: Font.kt */
public final class ResourceFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final int resId;
    private final int style;
    private final FontVariation.Settings variationSettings;
    private final FontWeight weight;

    public /* synthetic */ ResourceFont(int i, FontWeight fontWeight, int i2, @ExperimentalTextApi FontVariation.Settings settings, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, fontWeight, i2, settings, i3);
    }

    /* renamed from: copy-F3nL8kk$default  reason: not valid java name */
    public static /* synthetic */ ResourceFont m38103copyF3nL8kk$default(ResourceFont resourceFont, int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = resourceFont.resId;
        }
        if ((i4 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        FontWeight fontWeight2 = fontWeight;
        if ((i4 & 4) != 0) {
            i2 = resourceFont.m38109getStyle_LCdwA();
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = resourceFont.m38108getLoadingStrategyPKNRLFQ();
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            settings = resourceFont.variationSettings;
        }
        return resourceFont.m38106copyF3nL8kk(i, fontWeight2, i5, i6, settings);
    }

    /* renamed from: copy-RetOiIg$default  reason: not valid java name */
    public static /* synthetic */ ResourceFont m38104copyRetOiIg$default(ResourceFont resourceFont, int i, FontWeight fontWeight, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = resourceFont.resId;
        }
        if ((i3 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i3 & 4) != 0) {
            i2 = resourceFont.m38109getStyle_LCdwA();
        }
        return resourceFont.m38107copyRetOiIg(i, fontWeight, i2);
    }

    @ExperimentalTextApi
    /* renamed from: copy-F3nL8kk  reason: not valid java name */
    public final ResourceFont m38106copyF3nL8kk(int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings) {
        C12775o.m28639i(fontWeight, "weight");
        C12775o.m28639i(settings, "variationSettings");
        return new ResourceFont(i, fontWeight, i2, settings, i3, (DefaultConstructorMarker) null);
    }

    /* renamed from: copy-RetOiIg  reason: not valid java name */
    public final ResourceFont m38107copyRetOiIg(int i, FontWeight fontWeight, int i2) {
        C12775o.m28639i(fontWeight, "weight");
        return m38103copyF3nL8kk$default(this, i, fontWeight, i2, m38108getLoadingStrategyPKNRLFQ(), (FontVariation.Settings) null, 16, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        if (this.resId == resourceFont.resId && C12775o.m28634d(getWeight(), resourceFont.getWeight()) && FontStyle.m38063equalsimpl0(m38109getStyle_LCdwA(), resourceFont.m38109getStyle_LCdwA()) && C12775o.m28634d(this.variationSettings, resourceFont.variationSettings) && FontLoadingStrategy.m38050equalsimpl0(m38108getLoadingStrategyPKNRLFQ(), resourceFont.m38108getLoadingStrategyPKNRLFQ())) {
            return true;
        }
        return false;
    }

    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ  reason: not valid java name */
    public int m38108getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final int getResId() {
        return this.resId;
    }

    /* renamed from: getStyle-_-LCdwA  reason: not valid java name */
    public int m38109getStyle_LCdwA() {
        return this.style;
    }

    @ExperimentalTextApi
    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((this.resId * 31) + getWeight().hashCode()) * 31) + FontStyle.m38064hashCodeimpl(m38109getStyle_LCdwA())) * 31) + FontLoadingStrategy.m38051hashCodeimpl(m38108getLoadingStrategyPKNRLFQ())) * 31) + this.variationSettings.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + FontStyle.m38065toStringimpl(m38109getStyle_LCdwA()) + ", loadingStrategy=" + FontLoadingStrategy.m38052toStringimpl(m38108getLoadingStrategyPKNRLFQ()) + ')';
    }

    private ResourceFont(int i, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3) {
        this.resId = i;
        this.weight = fontWeight;
        this.style = i2;
        this.variationSettings = settings;
        this.loadingStrategy = i3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ResourceFont(int r8, androidx.compose.p002ui.text.font.FontWeight r9, int r10, androidx.compose.p002ui.text.font.FontVariation.Settings r11, int r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000a
            androidx.compose.ui.text.font.FontWeight$Companion r9 = androidx.compose.p002ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r9 = r9.getNormal()
        L_0x000a:
            r2 = r9
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0015
            androidx.compose.ui.text.font.FontStyle$Companion r9 = androidx.compose.p002ui.text.font.FontStyle.Companion
            int r10 = r9.m38068getNormal_LCdwA()
        L_0x0015:
            r3 = r10
            r9 = r13 & 8
            if (r9 == 0) goto L_0x0023
            androidx.compose.ui.text.font.FontVariation r9 = androidx.compose.p002ui.text.font.FontVariation.INSTANCE
            r10 = 0
            androidx.compose.ui.text.font.FontVariation$Setting[] r10 = new androidx.compose.p002ui.text.font.FontVariation.Setting[r10]
            androidx.compose.ui.text.font.FontVariation$Settings r11 = r9.m38083Settings6EWAqTQ(r2, r3, r10)
        L_0x0023:
            r4 = r11
            r9 = r13 & 16
            if (r9 == 0) goto L_0x002e
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r9 = androidx.compose.p002ui.text.font.FontLoadingStrategy.Companion
            int r12 = r9.m38054getAsyncPKNRLFQ()
        L_0x002e:
            r5 = r12
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.font.ResourceFont.<init>(int, androidx.compose.ui.text.font.FontWeight, int, androidx.compose.ui.text.font.FontVariation$Settings, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ$annotations  reason: not valid java name */
    public static /* synthetic */ void m38105getLoadingStrategyPKNRLFQ$annotations() {
    }
}
