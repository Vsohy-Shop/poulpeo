package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p002ui.text.font.Font;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.style.Hyphens;
import androidx.compose.p002ui.text.style.LineBreak;
import androidx.compose.p002ui.text.style.LineHeightStyle;
import androidx.compose.p002ui.text.style.TextAlign;
import androidx.compose.p002ui.text.style.TextDirection;
import androidx.compose.p002ui.text.style.TextIndent;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11904j;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n803#2:153\n804#2,5:162\n151#3,3:154\n33#3,4:157\n154#3:161\n155#3:167\n38#3:168\n156#3:169\n101#3,2:170\n33#3,6:172\n103#3:178\n1#4:179\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n*L\n95#1:153\n95#1:162,5\n95#1:154,3\n95#1:157,4\n95#1:161\n95#1:167\n95#1:168\n95#1:169\n120#1:170,2\n120#1:172,6\n120#1:178\n*E\n"})
/* renamed from: androidx.compose.ui.text.MultiParagraphIntrinsics */
/* compiled from: MultiParagraphIntrinsics.kt */
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 8;
    private final AnnotatedString annotatedString;
    private final List<ParagraphIntrinsicInfo> infoList;
    private final Lazy maxIntrinsicWidth$delegate;
    private final Lazy minIntrinsicWidth$delegate;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    public MultiParagraphIntrinsics(AnnotatedString annotatedString2, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, Density density, FontFamily.Resolver resolver) {
        AnnotatedString annotatedString3 = annotatedString2;
        TextStyle textStyle2 = textStyle;
        List<AnnotatedString.Range<Placeholder>> list2 = list;
        C12775o.m28639i(annotatedString3, "annotatedString");
        C12775o.m28639i(textStyle2, "style");
        C12775o.m28639i(list2, "placeholders");
        C12775o.m28639i(density, "density");
        C12775o.m28639i(resolver, "fontFamilyResolver");
        this.annotatedString = annotatedString3;
        this.placeholders = list2;
        C11904j jVar = C11904j.NONE;
        this.minIntrinsicWidth$delegate = C11901h.m25689a(jVar, new MultiParagraphIntrinsics$minIntrinsicWidth$2(this));
        this.maxIntrinsicWidth$delegate = C11901h.m25689a(jVar, new MultiParagraphIntrinsics$maxIntrinsicWidth$2(this));
        ParagraphStyle paragraphStyle = textStyle.toParagraphStyle();
        List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles = AnnotatedStringKt.normalizedParagraphStyles(annotatedString3, paragraphStyle);
        ArrayList arrayList = new ArrayList(normalizedParagraphStyles.size());
        int size = normalizedParagraphStyles.size();
        int i = 0;
        while (i < size) {
            AnnotatedString.Range range = normalizedParagraphStyles.get(i);
            AnnotatedString access$substringWithoutParagraphStyles = AnnotatedStringKt.substringWithoutParagraphStyles(annotatedString3, range.getStart(), range.getEnd());
            arrayList.add(new ParagraphIntrinsicInfo(ParagraphIntrinsicsKt.ParagraphIntrinsics(access$substringWithoutParagraphStyles.getText(), textStyle2.merge(resolveTextDirection((ParagraphStyle) range.getItem(), paragraphStyle)), access$substringWithoutParagraphStyles.getSpanStyles(), (List<AnnotatedString.Range<Placeholder>>) MultiParagraphIntrinsicsKt.getLocalPlaceholders(getPlaceholders(), range.getStart(), range.getEnd()), density, resolver), range.getStart(), range.getEnd()));
            i++;
            annotatedString3 = annotatedString2;
        }
        this.infoList = arrayList;
    }

    /* access modifiers changed from: private */
    public final ParagraphStyle resolveTextDirection(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2) {
        TextDirection r0 = paragraphStyle.m37894getTextDirectionmmuk1to();
        if (r0 != null) {
            r0.m38360unboximpl();
            return paragraphStyle;
        }
        return ParagraphStyle.m37881copyciSxzs0$default(paragraphStyle, (TextAlign) null, paragraphStyle2.m37894getTextDirectionmmuk1to(), 0, (TextIndent) null, (PlatformParagraphStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 253, (Object) null);
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public boolean getHasStaleResolvedFonts() {
        List<ParagraphIntrinsicInfo> list = this.infoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getIntrinsics().getHasStaleResolvedFonts()) {
                return true;
            }
        }
        return false;
    }

    public final List<ParagraphIntrinsicInfo> getInfoList$ui_text_release() {
        return this.infoList;
    }

    public float getMaxIntrinsicWidth() {
        return ((Number) this.maxIntrinsicWidth$delegate.getValue()).floatValue();
    }

    public float getMinIntrinsicWidth() {
        return ((Number) this.minIntrinsicWidth$delegate.getValue()).floatValue();
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MultiParagraphIntrinsics(AnnotatedString annotatedString2, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, Density density, Font.ResourceLoader resourceLoader) {
        this(annotatedString2, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
        C12775o.m28639i(annotatedString2, "annotatedString");
        C12775o.m28639i(textStyle, "style");
        C12775o.m28639i(list, "placeholders");
        C12775o.m28639i(density, "density");
        C12775o.m28639i(resourceLoader, "resourceLoader");
    }
}
