package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n70#2:424\n70#2:426\n70#2:428\n55#2,2:430\n55#2,2:433\n55#2,2:436\n55#2,2:439\n70#2:442\n1#3:423\n1#3:425\n1#3:427\n1#3:429\n1#3:432\n1#3:435\n1#3:438\n1#3:441\n1#3:443\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n*L\n160#1:422\n161#1:424\n162#1:426\n163#1:428\n167#1:430,2\n171#1:433,2\n175#1:436,2\n179#1:439,2\n183#1:442\n160#1:423\n161#1:425\n162#1:427\n163#1:429\n167#1:432\n171#1:435\n175#1:438\n179#1:441\n183#1:443\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2 */
/* compiled from: Savers.kt */
final class SaversKt$AnnotationRangeSaver$2 extends C12777p implements Function1<Object, AnnotatedString.Range<? extends Object>> {
    public static final SaversKt$AnnotationRangeSaver$2 INSTANCE = new SaversKt$AnnotationRangeSaver$2();

    /* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2$WhenMappings */
    /* compiled from: Savers.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.ui.text.AnnotationType[] r0 = androidx.compose.p002ui.text.AnnotationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.p002ui.text.AnnotationType.Paragraph     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.p002ui.text.AnnotationType.Span     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.p002ui.text.AnnotationType.VerbatimTts     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.p002ui.text.AnnotationType.Url     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.p002ui.text.AnnotationType.String     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.SaversKt$AnnotationRangeSaver$2.WhenMappings.<clinit>():void");
        }
    }

    SaversKt$AnnotationRangeSaver$2() {
        super(1);
    }

    public final AnnotatedString.Range<? extends Object> invoke(Object obj) {
        C12775o.m28639i(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = null;
        AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
        C12775o.m28636f(annotationType);
        Object obj4 = list.get(2);
        Integer num = obj4 != null ? (Integer) obj4 : null;
        C12775o.m28636f(num);
        int intValue = num.intValue();
        Object obj5 = list.get(3);
        Integer num2 = obj5 != null ? (Integer) obj5 : null;
        C12775o.m28636f(num2);
        int intValue2 = num2.intValue();
        Object obj6 = list.get(4);
        String str = obj6 != null ? (String) obj6 : null;
        C12775o.m28636f(str);
        int i = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
        if (i == 1) {
            Object obj7 = list.get(1);
            Saver<ParagraphStyle, Object> paragraphStyleSaver = SaversKt.getParagraphStyleSaver();
            if (!C12775o.m28634d(obj7, Boolean.FALSE) && obj7 != null) {
                obj3 = paragraphStyleSaver.restore(obj7);
            }
            C12775o.m28636f(obj3);
            return new AnnotatedString.Range<>(obj3, intValue, intValue2, str);
        } else if (i == 2) {
            Object obj8 = list.get(1);
            Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
            if (!C12775o.m28634d(obj8, Boolean.FALSE) && obj8 != null) {
                obj3 = spanStyleSaver.restore(obj8);
            }
            C12775o.m28636f(obj3);
            return new AnnotatedString.Range<>(obj3, intValue, intValue2, str);
        } else if (i == 3) {
            Object obj9 = list.get(1);
            Saver access$getVerbatimTtsAnnotationSaver$p = SaversKt.VerbatimTtsAnnotationSaver;
            if (!C12775o.m28634d(obj9, Boolean.FALSE) && obj9 != null) {
                obj3 = (VerbatimTtsAnnotation) access$getVerbatimTtsAnnotationSaver$p.restore(obj9);
            }
            C12775o.m28636f(obj3);
            return new AnnotatedString.Range<>(obj3, intValue, intValue2, str);
        } else if (i == 4) {
            Object obj10 = list.get(1);
            Saver access$getUrlAnnotationSaver$p = SaversKt.UrlAnnotationSaver;
            if (!C12775o.m28634d(obj10, Boolean.FALSE) && obj10 != null) {
                obj3 = (UrlAnnotation) access$getUrlAnnotationSaver$p.restore(obj10);
            }
            C12775o.m28636f(obj3);
            return new AnnotatedString.Range<>(obj3, intValue, intValue2, str);
        } else if (i == 5) {
            Object obj11 = list.get(1);
            if (obj11 != null) {
                obj3 = (String) obj11;
            }
            C12775o.m28636f(obj3);
            return new AnnotatedString.Range<>(obj3, intValue, intValue2, str);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
