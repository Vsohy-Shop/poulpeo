package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p002ui.text.font.Font;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.platform.AndroidParagraphIntrinsics_androidKt;
import androidx.compose.p002ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.ParagraphIntrinsicsKt */
/* compiled from: ParagraphIntrinsics.kt */
public final class ParagraphIntrinsicsKt {
    public static final ParagraphIntrinsics ParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, Font.ResourceLoader resourceLoader) {
        C12775o.m28639i(str, "text");
        C12775o.m28639i(textStyle, "style");
        C12775o.m28639i(list, "spanStyles");
        C12775o.m28639i(list2, "placeholders");
        C12775o.m28639i(density, "density");
        C12775o.m28639i(resourceLoader, "resourceLoader");
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }

    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String str, TextStyle textStyle, List list, List list2, Density density, Font.ResourceLoader resourceLoader, int i, Object obj) {
        if ((i & 4) != 0) {
            list = C12726w.m28524k();
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = C12726w.m28524k();
        }
        return ParagraphIntrinsics(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list3, (List<AnnotatedString.Range<Placeholder>>) list2, density, resourceLoader);
    }

    public static final ParagraphIntrinsics ParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, FontFamily.Resolver resolver) {
        C12775o.m28639i(str, "text");
        C12775o.m28639i(textStyle, "style");
        C12775o.m28639i(list, "spanStyles");
        C12775o.m28639i(list2, "placeholders");
        C12775o.m28639i(density, "density");
        C12775o.m28639i(resolver, "fontFamilyResolver");
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, resolver);
    }

    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String str, TextStyle textStyle, List list, List list2, Density density, FontFamily.Resolver resolver, int i, Object obj) {
        if ((i & 4) != 0) {
            list = C12726w.m28524k();
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = C12726w.m28524k();
        }
        return ParagraphIntrinsics(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list3, (List<AnnotatedString.Range<Placeholder>>) list2, density, resolver);
    }
}
