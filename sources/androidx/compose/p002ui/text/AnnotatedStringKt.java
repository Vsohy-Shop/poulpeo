package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.intl.LocaleList;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n33#2,6:1127\n33#2,4:1136\n38#2:1142\n151#2,3:1144\n33#2,4:1147\n154#2,2:1151\n38#2:1153\n156#2:1154\n33#2,4:1158\n38#2:1164\n151#2,3:1166\n33#2,4:1169\n154#2,2:1173\n38#2:1175\n156#2:1176\n33#2,4:1180\n38#2:1186\n151#2,3:1188\n33#2,4:1191\n154#2,2:1195\n38#2:1197\n156#2:1198\n151#2,3:1199\n33#2,4:1202\n154#2,2:1206\n38#2:1208\n156#2:1209\n33#2,4:1214\n38#2:1220\n151#2,5:1222\n38#2:1227\n156#2:1228\n35#3,3:1133\n38#3,2:1140\n40#3:1143\n35#3,3:1155\n38#3,2:1162\n40#3:1165\n35#3,3:1177\n38#3,2:1184\n40#3:1187\n35#3,3:1211\n38#3,2:1218\n40#3:1221\n1#4:1210\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n676#1:1127,6\n712#1:1136,4\n712#1:1142\n713#1:1144,3\n713#1:1147,4\n713#1:1151,2\n713#1:1153\n713#1:1154\n739#1:1158,4\n739#1:1164\n740#1:1166,3\n740#1:1169,4\n740#1:1173,2\n740#1:1175\n740#1:1176\n766#1:1180,4\n766#1:1186\n767#1:1188,3\n767#1:1191,4\n767#1:1195,2\n767#1:1197\n767#1:1198\n803#1:1199,3\n803#1:1202,4\n803#1:1206,2\n803#1:1208\n803#1:1209\n1049#1:1214,4\n1049#1:1220\n1049#1:1222,5\n1049#1:1227\n1049#1:1228\n712#1:1133,3\n712#1:1140,2\n712#1:1143\n739#1:1155,3\n739#1:1162,2\n739#1:1165\n766#1:1177,3\n766#1:1184,2\n766#1:1187\n1049#1:1211,3\n1049#1:1218,2\n1049#1:1221\n*E\n"})
/* renamed from: androidx.compose.ui.text.AnnotatedStringKt */
/* compiled from: AnnotatedString.kt */
public final class AnnotatedStringKt {
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", (List) null, (List) null, 6, (DefaultConstructorMarker) null);

    public static final AnnotatedString AnnotatedString(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        C12775o.m28639i(str, "text");
        C12775o.m28639i(spanStyle, "spanStyle");
        return new AnnotatedString(str, C12723v.m28509d(new AnnotatedString.Range(spanStyle, 0, str.length())), paragraphStyle == null ? C12726w.m28524k() : C12723v.m28509d(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i, Object obj) {
        if ((i & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    public static final AnnotatedString buildAnnotatedString(Function1<? super AnnotatedString.Builder, C11921v> function1) {
        C12775o.m28639i(function1, "builder");
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, (DefaultConstructorMarker) null);
        function1.invoke(builder);
        return builder.toAnnotatedString();
    }

    public static final AnnotatedString capitalize(AnnotatedString annotatedString, LocaleList localeList) {
        C12775o.m28639i(annotatedString, "<this>");
        C12775o.m28639i(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new AnnotatedStringKt$capitalize$1(localeList));
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    public static final boolean contains(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        if (i > i3 || i4 > i2) {
            return false;
        }
        if (i2 == i4) {
            if (i3 == i4) {
                z = true;
            } else {
                z = false;
            }
            if (i == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                return false;
            }
        }
        return true;
    }

    public static final AnnotatedString decapitalize(AnnotatedString annotatedString, LocaleList localeList) {
        C12775o.m28639i(annotatedString, "<this>");
        C12775o.m28639i(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new AnnotatedStringKt$decapitalize$1(localeList));
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    /* access modifiers changed from: private */
    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i, int i2) {
        boolean z;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
        } else if (list == null) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                AnnotatedString.Range range = (AnnotatedString.Range) obj;
                if (intersect(i, i2, range.getStart(), range.getEnd())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AnnotatedString.Range range2 = (AnnotatedString.Range) arrayList.get(i4);
                arrayList2.add(new AnnotatedString.Range(range2.getItem(), Math.max(i, range2.getStart()) - i, Math.min(i2, range2.getEnd()) - i, range2.getTag()));
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return arrayList2;
        }
    }

    /* access modifiers changed from: private */
    public static final List<AnnotatedString.Range<? extends Object>> getLocalAnnotations(AnnotatedString annotatedString, int i, int i2) {
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release;
        if (i == i2 || (annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release()) == null) {
            return null;
        }
        if (i == 0 && i2 >= annotatedString.getText().length()) {
            return annotations$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(annotations$ui_text_release.size());
        int size = annotations$ui_text_release.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<? extends Object> range = annotations$ui_text_release.get(i3);
            AnnotatedString.Range range2 = range;
            if (intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i4);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), C13537l.m30886m(range3.getStart(), i, i2) - i, C13537l.m30886m(range3.getEnd(), i, i2) - i, range3.getTag()));
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    public static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString annotatedString, int i, int i2) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release;
        if (i == i2 || (paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i == 0 && i2 >= annotatedString.getText().length()) {
            return paragraphStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
        int size = paragraphStylesOrNull$ui_text_release.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i3);
            AnnotatedString.Range range2 = range;
            if (intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i4);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), C13537l.m30886m(range3.getStart(), i, i2) - i, C13537l.m30886m(range3.getEnd(), i, i2) - i));
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    public static final List<AnnotatedString.Range<SpanStyle>> getLocalSpanStyles(AnnotatedString annotatedString, int i, int i2) {
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release;
        if (i == i2 || (spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i == 0 && i2 >= annotatedString.getText().length()) {
            return spanStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
        int size = spanStylesOrNull$ui_text_release.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i3);
            AnnotatedString.Range range2 = range;
            if (intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i4);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), C13537l.m30886m(range3.getStart(), i, i2) - i, C13537l.m30886m(range3.getEnd(), i, i2) - i));
        }
        return arrayList2;
    }

    public static final boolean intersect(int i, int i2, int i3, int i4) {
        if (Math.max(i, i3) < Math.min(i2, i4) || contains(i, i2, i3, i4) || contains(i3, i4, i, i2)) {
            return true;
        }
        return false;
    }

    public static final <T> List<T> mapEachParagraphStyle(AnnotatedString annotatedString, ParagraphStyle paragraphStyle, C13088o<? super AnnotatedString, ? super AnnotatedString.Range<ParagraphStyle>, ? extends T> oVar) {
        C12775o.m28639i(annotatedString, "<this>");
        C12775o.m28639i(paragraphStyle, "defaultParagraphStyle");
        C12775o.m28639i(oVar, "block");
        List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles = normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(normalizedParagraphStyles.size());
        int size = normalizedParagraphStyles.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range range = normalizedParagraphStyles.get(i);
            arrayList.add(oVar.invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(AnnotatedString annotatedString, ParagraphStyle paragraphStyle) {
        C12775o.m28639i(annotatedString, "<this>");
        C12775o.m28639i(paragraphStyle, "defaultParagraphStyle");
        int length = annotatedString.getText().length();
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release == null) {
            paragraphStylesOrNull$ui_text_release = C12726w.m28524k();
        }
        ArrayList arrayList = new ArrayList();
        int size = paragraphStylesOrNull$ui_text_release.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            AnnotatedString.Range range = paragraphStylesOrNull$ui_text_release.get(i);
            ParagraphStyle paragraphStyle2 = (ParagraphStyle) range.component1();
            int component2 = range.component2();
            int component3 = range.component3();
            if (component2 != i2) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, i2, component2));
            }
            arrayList.add(new AnnotatedString.Range(paragraphStyle.merge(paragraphStyle2), component2, component3));
            i++;
            i2 = component3;
        }
        if (i2 != length) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, i2, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i, int i2) {
        String str;
        if (i != i2) {
            str = annotatedString.getText().substring(i, i2);
            C12775o.m28638h(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        return new AnnotatedString(str, getLocalSpanStyles(annotatedString, i, i2), (List) null, (List) null, 12, (DefaultConstructorMarker) null);
    }

    public static final AnnotatedString toLowerCase(AnnotatedString annotatedString, LocaleList localeList) {
        C12775o.m28639i(annotatedString, "<this>");
        C12775o.m28639i(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new AnnotatedStringKt$toLowerCase$1(localeList));
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    public static final AnnotatedString toUpperCase(AnnotatedString annotatedString, LocaleList localeList) {
        C12775o.m28639i(annotatedString, "<this>");
        C12775o.m28639i(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new AnnotatedStringKt$toUpperCase$1(localeList));
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    @ExperimentalTextApi
    public static final <R> R withAnnotation(AnnotatedString.Builder builder, String str, String str2, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        C12775o.m28639i(builder, "<this>");
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        C12775o.m28639i(str2, "annotation");
        C12775o.m28639i(function1, "block");
        int pushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return function1.invoke(builder);
        } finally {
            C12773m.m28629b(1);
            builder.pop(pushStringAnnotation);
            C12773m.m28628a(1);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, SpanStyle spanStyle, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        C12775o.m28639i(builder, "<this>");
        C12775o.m28639i(spanStyle, "style");
        C12775o.m28639i(function1, "block");
        int pushStyle = builder.pushStyle(spanStyle);
        try {
            return function1.invoke(builder);
        } finally {
            C12773m.m28629b(1);
            builder.pop(pushStyle);
            C12773m.m28628a(1);
        }
    }

    @ExperimentalTextApi
    public static final <R> R withAnnotation(AnnotatedString.Builder builder, TtsAnnotation ttsAnnotation, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        C12775o.m28639i(builder, "<this>");
        C12775o.m28639i(ttsAnnotation, "ttsAnnotation");
        C12775o.m28639i(function1, "block");
        int pushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            C12773m.m28629b(1);
            builder.pop(pushTtsAnnotation);
            C12773m.m28628a(1);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, ParagraphStyle paragraphStyle, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        C12775o.m28639i(builder, "<this>");
        C12775o.m28639i(paragraphStyle, "style");
        C12775o.m28639i(function1, "block");
        int pushStyle = builder.pushStyle(paragraphStyle);
        try {
            return function1.invoke(builder);
        } finally {
            C12773m.m28629b(1);
            builder.pop(pushStyle);
            C12773m.m28628a(1);
        }
    }

    public static final AnnotatedString AnnotatedString(String str, ParagraphStyle paragraphStyle) {
        C12775o.m28639i(str, "text");
        C12775o.m28639i(paragraphStyle, "paragraphStyle");
        return new AnnotatedString(str, C12726w.m28524k(), C12723v.m28509d(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    @ExperimentalTextApi
    public static final <R> R withAnnotation(AnnotatedString.Builder builder, UrlAnnotation urlAnnotation, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        C12775o.m28639i(builder, "<this>");
        C12775o.m28639i(urlAnnotation, "urlAnnotation");
        C12775o.m28639i(function1, "block");
        int pushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            C12773m.m28629b(1);
            builder.pop(pushUrlAnnotation);
            C12773m.m28628a(1);
        }
    }
}
