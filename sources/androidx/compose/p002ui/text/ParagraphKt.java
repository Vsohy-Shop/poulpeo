package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.font.Font;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.platform.AndroidParagraph_androidKt;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.ParagraphKt */
/* compiled from: Paragraph.kt */
public final class ParagraphKt {
    public static final int DefaultMaxLines = Integer.MAX_VALUE;

    public static final Paragraph Paragraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader) {
        C12775o.m28639i(str, "text");
        C12775o.m28639i(textStyle, "style");
        C12775o.m28639i(list, "spanStyles");
        C12775o.m28639i(list2, "placeholders");
        C12775o.m28639i(density, "density");
        C12775o.m28639i(resourceLoader, "resourceLoader");
        return AndroidParagraph_androidKt.ActualParagraph(str, textStyle, list, list2, i, z, f, density, resourceLoader);
    }

    public static /* synthetic */ Paragraph Paragraph$default(String str, TextStyle textStyle, List list, List list2, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader, int i2, Object obj) {
        return Paragraph(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) (i2 & 4) != 0 ? C12726w.m28524k() : list, (List<AnnotatedString.Range<Placeholder>>) (i2 & 8) != 0 ? C12726w.m28524k() : list2, (i2 & 16) != 0 ? Integer.MAX_VALUE : i, (i2 & 32) != 0 ? false : z, f, density, resourceLoader);
    }

    /* renamed from: Paragraph-UdtVg6A  reason: not valid java name */
    public static final Paragraph m37875ParagraphUdtVg6A(String str, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z) {
        C12775o.m28639i(str, "text");
        C12775o.m28639i(textStyle, "style");
        C12775o.m28639i(density, "density");
        FontFamily.Resolver resolver2 = resolver;
        C12775o.m28639i(resolver2, "fontFamilyResolver");
        List<AnnotatedString.Range<SpanStyle>> list3 = list;
        C12775o.m28639i(list3, "spanStyles");
        List<AnnotatedString.Range<Placeholder>> list4 = list2;
        C12775o.m28639i(list4, "placeholders");
        return AndroidParagraph_androidKt.m38209ActualParagraphO3s9Psw(str, textStyle, list3, list4, i, z, j, density, resolver2);
    }

    /* renamed from: Paragraph-UdtVg6A$default  reason: not valid java name */
    public static /* synthetic */ Paragraph m37876ParagraphUdtVg6A$default(String str, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, List list2, int i, boolean z, int i2, Object obj) {
        List list3;
        List list4;
        int i3;
        boolean z2;
        int i4 = i2;
        if ((i4 & 32) != 0) {
            list3 = C12726w.m28524k();
        } else {
            list3 = list;
        }
        if ((i4 & 64) != 0) {
            list4 = C12726w.m28524k();
        } else {
            list4 = list2;
        }
        if ((i4 & 128) != 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = i;
        }
        if ((i4 & 256) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        return m37875ParagraphUdtVg6A(str, textStyle, j, density, resolver, list3, list4, i3, z2);
    }

    /* renamed from: Paragraph-_EkL_-Y  reason: not valid java name */
    public static final Paragraph m37877Paragraph_EkL_Y(ParagraphIntrinsics paragraphIntrinsics, long j, int i, boolean z) {
        C12775o.m28639i(paragraphIntrinsics, "paragraphIntrinsics");
        return AndroidParagraph_androidKt.m38208ActualParagraphhBUhpc(paragraphIntrinsics, i, z, j);
    }

    /* renamed from: Paragraph-_EkL_-Y$default  reason: not valid java name */
    public static /* synthetic */ Paragraph m37878Paragraph_EkL_Y$default(ParagraphIntrinsics paragraphIntrinsics, long j, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        return m37877Paragraph_EkL_Y(paragraphIntrinsics, j, i, z);
    }

    public static final int ceilToInt(float f) {
        return (int) ((float) Math.ceil((double) f));
    }

    public static final Paragraph Paragraph(String str, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z) {
        String str2 = str;
        C12775o.m28639i(str2, "text");
        TextStyle textStyle2 = textStyle;
        C12775o.m28639i(textStyle2, "style");
        Density density2 = density;
        C12775o.m28639i(density2, "density");
        FontFamily.Resolver resolver2 = resolver;
        C12775o.m28639i(resolver2, "fontFamilyResolver");
        List<AnnotatedString.Range<SpanStyle>> list3 = list;
        C12775o.m28639i(list3, "spanStyles");
        List<AnnotatedString.Range<Placeholder>> list4 = list2;
        C12775o.m28639i(list4, "placeholders");
        return AndroidParagraph_androidKt.m38209ActualParagraphO3s9Psw(str2, textStyle2, list3, list4, i, z, ConstraintsKt.Constraints$default(0, ceilToInt(f), 0, 0, 13, (Object) null), density2, resolver2);
    }

    public static final Paragraph Paragraph(ParagraphIntrinsics paragraphIntrinsics, int i, boolean z, float f) {
        C12775o.m28639i(paragraphIntrinsics, "paragraphIntrinsics");
        return AndroidParagraph_androidKt.m38208ActualParagraphhBUhpc(paragraphIntrinsics, i, z, ConstraintsKt.Constraints$default(0, ceilToInt(f), 0, 0, 13, (Object) null));
    }

    public static /* synthetic */ Paragraph Paragraph$default(String str, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List list, List list2, int i, boolean z, int i2, Object obj) {
        int i3 = i2;
        return Paragraph(str, textStyle, f, density, resolver, (List<AnnotatedString.Range<SpanStyle>>) (i3 & 32) != 0 ? C12726w.m28524k() : list, (List<AnnotatedString.Range<Placeholder>>) (i3 & 64) != 0 ? C12726w.m28524k() : list2, (i3 & 128) != 0 ? Integer.MAX_VALUE : i, (i3 & 256) != 0 ? false : z);
    }

    public static /* synthetic */ Paragraph Paragraph$default(ParagraphIntrinsics paragraphIntrinsics, int i, boolean z, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return Paragraph(paragraphIntrinsics, i, z, f);
    }
}
