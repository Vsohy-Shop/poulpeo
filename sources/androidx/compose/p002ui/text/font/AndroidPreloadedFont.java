package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p002ui.text.font.FontVariation;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.font.AndroidPreloadedFont */
/* compiled from: AndroidPreloadedFont.kt */
public abstract class AndroidPreloadedFont extends AndroidFont {
    private boolean didInitWithContext;
    private final int style;
    private Typeface typeface;
    private final FontWeight weight;

    public /* synthetic */ AndroidPreloadedFont(FontWeight fontWeight, int i, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontWeight, i, settings);
    }

    public abstract Typeface doLoad$ui_text_release(Context context);

    public abstract String getCacheKey();

    /* renamed from: getStyle-_-LCdwA  reason: not valid java name */
    public final int m38014getStyle_LCdwA() {
        return this.style;
    }

    public final Typeface getTypeface$ui_text_release() {
        return this.typeface;
    }

    public final FontWeight getWeight() {
        return this.weight;
    }

    public final Typeface loadCached$ui_text_release(Context context) {
        C12775o.m28639i(context, "context");
        if (!this.didInitWithContext && this.typeface == null) {
            this.typeface = doLoad$ui_text_release(context);
        }
        this.didInitWithContext = true;
        return this.typeface;
    }

    public final void setTypeface$ui_text_release(Typeface typeface2) {
        this.typeface = typeface2;
    }

    private AndroidPreloadedFont(FontWeight fontWeight, int i, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m38055getBlockingPKNRLFQ(), AndroidPreloadedFontTypefaceLoader.INSTANCE, settings, (DefaultConstructorMarker) null);
        this.weight = fontWeight;
        this.style = i;
    }
}
