package androidx.compose.p002ui.text.platform;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.ParagraphIntrinsics;
import androidx.compose.p002ui.text.Placeholder;
import androidx.compose.p002ui.text.SpanStyle;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.android.LayoutIntrinsics;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.p002ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics */
/* compiled from: AndroidParagraphIntrinsics.android.kt */
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {
    private final CharSequence charSequence;
    private final Density density;
    private final boolean emojiCompatProcessed;
    private final FontFamily.Resolver fontFamilyResolver;
    private final LayoutIntrinsics layoutIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    /* access modifiers changed from: private */
    public TypefaceDirtyTrackerLinkedList resolvedTypefaces;
    private final List<AnnotatedString.Range<SpanStyle>> spanStyles;
    private final TextStyle style;
    private final String text;
    private final int textDirectionHeuristic;
    private final AndroidTextPaint textPaint;

    public AndroidParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, FontFamily.Resolver resolver, Density density2) {
        boolean z;
        AnnotatedString.Range range;
        C12775o.m28639i(str, "text");
        C12775o.m28639i(textStyle, "style");
        C12775o.m28639i(list, "spanStyles");
        C12775o.m28639i(list2, "placeholders");
        C12775o.m28639i(resolver, "fontFamilyResolver");
        C12775o.m28639i(density2, "density");
        this.text = str;
        this.style = textStyle;
        this.spanStyles = list;
        this.placeholders = list2;
        this.fontFamilyResolver = resolver;
        this.density = density2;
        AndroidTextPaint androidTextPaint = new AndroidTextPaint(1, density2.getDensity());
        this.textPaint = androidTextPaint;
        if (!AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(textStyle)) {
            z = false;
        } else {
            z = EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue();
        }
        this.emojiCompatProcessed = z;
        this.textDirectionHeuristic = AndroidParagraphIntrinsics_androidKt.m38206resolveTextDirectionHeuristics9GRLPo0(textStyle.m38004getTextDirectionmmuk1to(), textStyle.getLocaleList());
        AndroidParagraphIntrinsics$resolveTypeface$1 androidParagraphIntrinsics$resolveTypeface$1 = new AndroidParagraphIntrinsics$resolveTypeface$1(this);
        TextPaintExtensions_androidKt.setTextMotion(androidTextPaint, textStyle.getTextMotion());
        SpanStyle applySpanStyle = TextPaintExtensions_androidKt.applySpanStyle(androidTextPaint, textStyle.toSpanStyle(), androidParagraphIntrinsics$resolveTypeface$1, density2, !list.isEmpty());
        ArrayList arrayList = list;
        if (applySpanStyle != null) {
            int size = list.size() + 1;
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    range = new AnnotatedString.Range(applySpanStyle, 0, this.text.length());
                } else {
                    range = this.spanStyles.get(i - 1);
                }
                arrayList2.add(range);
            }
            arrayList = arrayList2;
        }
        CharSequence createCharSequence = AndroidParagraphHelper_androidKt.createCharSequence(this.text, this.textPaint.getTextSize(), this.style, arrayList, this.placeholders, this.density, androidParagraphIntrinsics$resolveTypeface$1, this.emojiCompatProcessed);
        this.charSequence = createCharSequence;
        this.layoutIntrinsics = new LayoutIntrinsics(createCharSequence, this.textPaint, this.textDirectionHeuristic);
    }

    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public boolean getHasStaleResolvedFonts() {
        boolean z;
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.resolvedTypefaces;
        if (typefaceDirtyTrackerLinkedList != null) {
            z = typefaceDirtyTrackerLinkedList.isStaleResolvedFont();
        } else {
            z = false;
        }
        if (z || (!this.emojiCompatProcessed && AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(this.style) && EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue())) {
            return true;
        }
        return false;
    }

    public final LayoutIntrinsics getLayoutIntrinsics$ui_text_release() {
        return this.layoutIntrinsics;
    }

    public float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final List<AnnotatedString.Range<SpanStyle>> getSpanStyles() {
        return this.spanStyles;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextDirectionHeuristic$ui_text_release() {
        return this.textDirectionHeuristic;
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.textPaint;
    }
}
