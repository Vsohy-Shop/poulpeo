package androidx.compose.p002ui.text.platform;

import androidx.compose.p002ui.text.AndroidParagraph;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.Paragraph;
import androidx.compose.p002ui.text.ParagraphIntrinsics;
import androidx.compose.p002ui.text.ParagraphKt;
import androidx.compose.p002ui.text.Placeholder;
import androidx.compose.p002ui.text.SpanStyle;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p002ui.text.font.Font;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.platform.AndroidParagraph_androidKt */
/* compiled from: ActualParagraph.android.kt.kt */
public final class AndroidParagraph_androidKt {
    public static final Paragraph ActualParagraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader) {
        C12775o.m28639i(str, "text");
        TextStyle textStyle2 = textStyle;
        C12775o.m28639i(textStyle2, "style");
        List<AnnotatedString.Range<SpanStyle>> list3 = list;
        C12775o.m28639i(list3, "spanStyles");
        List<AnnotatedString.Range<Placeholder>> list4 = list2;
        C12775o.m28639i(list4, "placeholders");
        Density density2 = density;
        C12775o.m28639i(density2, "density");
        C12775o.m28639i(resourceLoader, "resourceLoader");
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, textStyle2, list3, list4, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), density2), i, z, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, (Object) null), (DefaultConstructorMarker) null);
    }

    /* renamed from: ActualParagraph--hBUhpc  reason: not valid java name */
    public static final Paragraph m38208ActualParagraphhBUhpc(ParagraphIntrinsics paragraphIntrinsics, int i, boolean z, long j) {
        C12775o.m28639i(paragraphIntrinsics, "paragraphIntrinsics");
        return new AndroidParagraph((AndroidParagraphIntrinsics) paragraphIntrinsics, i, z, j, (DefaultConstructorMarker) null);
    }

    /* renamed from: ActualParagraph-O3s9Psw  reason: not valid java name */
    public static final Paragraph m38209ActualParagraphO3s9Psw(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z, long j, Density density, FontFamily.Resolver resolver) {
        C12775o.m28639i(str, "text");
        C12775o.m28639i(textStyle, "style");
        C12775o.m28639i(list, "spanStyles");
        C12775o.m28639i(list2, "placeholders");
        Density density2 = density;
        C12775o.m28639i(density2, "density");
        FontFamily.Resolver resolver2 = resolver;
        C12775o.m28639i(resolver2, "fontFamilyResolver");
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver2, density2), i, z, j, (DefaultConstructorMarker) null);
    }
}
