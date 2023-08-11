package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11915r;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nJvmAnnotatedString.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n*L\n1#1,81:1\n151#2,3:82\n33#2,4:85\n154#2,2:89\n38#2:91\n156#2:92\n151#2,3:93\n33#2,4:96\n154#2,2:100\n38#2:102\n156#2:103\n151#2,3:104\n33#2,4:107\n154#2,2:111\n38#2:113\n156#2:114\n33#2,4:118\n38#2:124\n108#3,3:115\n111#3,2:122\n113#3:125\n*S KotlinDebug\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n*L\n45#1:82,3\n45#1:85,4\n45#1:89,2\n45#1:91\n45#1:92\n49#1:93,3\n49#1:96,4\n49#1:100,2\n49#1:102\n49#1:103\n52#1:104,3\n52#1:107,4\n52#1:111,2\n52#1:113\n52#1:114\n74#1:118,4\n74#1:124\n74#1:115,3\n74#1:122,2\n74#1:125\n*E\n"})
/* renamed from: androidx.compose.ui.text.JvmAnnotatedString_jvmKt */
/* compiled from: JvmAnnotatedString.jvm.kt */
public final class JvmAnnotatedString_jvmKt {
    private static final void collectRangeTransitions(List<? extends AnnotatedString.Range<?>> list, SortedSet<Integer> sortedSet) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range range = (AnnotatedString.Range) list.get(i);
                sortedSet.add(Integer.valueOf(range.getStart()));
                sortedSet.add(Integer.valueOf(range.getEnd()));
            }
        }
    }

    public static final AnnotatedString transform(AnnotatedString annotatedString, C13089p<? super String, ? super Integer, ? super Integer, String> pVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C12775o.m28639i(annotatedString, "<this>");
        C12775o.m28639i(pVar, "transform");
        TreeSet d = C12729x0.m28550d(0, Integer.valueOf(annotatedString.getText().length()));
        collectRangeTransitions(annotatedString.getSpanStylesOrNull$ui_text_release(), d);
        collectRangeTransitions(annotatedString.getParagraphStylesOrNull$ui_text_release(), d);
        collectRangeTransitions(annotatedString.getAnnotations$ui_text_release(), d);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f20403b = "";
        Map k = C12716r0.m28420k(C11915r.m25707a(0, 0));
        List unused = C12686e0.m28211H0(d, 2, 0, false, new JvmAnnotatedString_jvmKt$transform$1(ref$ObjectRef, pVar, annotatedString, k), 6, (Object) null);
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        ArrayList arrayList3 = null;
        if (spanStylesOrNull$ui_text_release != null) {
            arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range range = spanStylesOrNull$ui_text_release.get(i);
                Object item = range.getItem();
                Object obj = k.get(Integer.valueOf(range.getStart()));
                C12775o.m28636f(obj);
                int intValue = ((Number) obj).intValue();
                Object obj2 = k.get(Integer.valueOf(range.getEnd()));
                C12775o.m28636f(obj2);
                arrayList.add(new AnnotatedString.Range(item, intValue, ((Number) obj2).intValue()));
            }
        } else {
            arrayList = null;
        }
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release != null) {
            arrayList2 = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
            int size2 = paragraphStylesOrNull$ui_text_release.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnnotatedString.Range range2 = paragraphStylesOrNull$ui_text_release.get(i2);
                Object item2 = range2.getItem();
                Object obj3 = k.get(Integer.valueOf(range2.getStart()));
                C12775o.m28636f(obj3);
                int intValue2 = ((Number) obj3).intValue();
                Object obj4 = k.get(Integer.valueOf(range2.getEnd()));
                C12775o.m28636f(obj4);
                arrayList2.add(new AnnotatedString.Range(item2, intValue2, ((Number) obj4).intValue()));
            }
        } else {
            arrayList2 = null;
        }
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
        if (annotations$ui_text_release != null) {
            arrayList3 = new ArrayList(annotations$ui_text_release.size());
            int size3 = annotations$ui_text_release.size();
            for (int i3 = 0; i3 < size3; i3++) {
                AnnotatedString.Range range3 = annotations$ui_text_release.get(i3);
                Object item3 = range3.getItem();
                Object obj5 = k.get(Integer.valueOf(range3.getStart()));
                C12775o.m28636f(obj5);
                int intValue3 = ((Number) obj5).intValue();
                Object obj6 = k.get(Integer.valueOf(range3.getEnd()));
                C12775o.m28636f(obj6);
                arrayList3.add(new AnnotatedString.Range(item3, intValue3, ((Number) obj6).intValue()));
            }
        }
        return new AnnotatedString((String) ref$ObjectRef.f20403b, arrayList, arrayList2, arrayList3);
    }
}
