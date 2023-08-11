package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$AnnotationRangeSaver$1 extends C12777p implements C13088o<SaverScope, AnnotatedString.Range<? extends Object>, Object> {
    public static final SaversKt$AnnotationRangeSaver$1 INSTANCE = new SaversKt$AnnotationRangeSaver$1();

    /* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1$WhenMappings */
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.SaversKt$AnnotationRangeSaver$1.WhenMappings.<clinit>():void");
        }
    }

    SaversKt$AnnotationRangeSaver$1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope, AnnotatedString.Range<? extends Object> range) {
        AnnotationType annotationType;
        Object obj;
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(range, "it");
        Object item = range.getItem();
        if (item instanceof ParagraphStyle) {
            annotationType = AnnotationType.Paragraph;
        } else if (item instanceof SpanStyle) {
            annotationType = AnnotationType.Span;
        } else if (item instanceof VerbatimTtsAnnotation) {
            annotationType = AnnotationType.VerbatimTts;
        } else if (item instanceof UrlAnnotation) {
            annotationType = AnnotationType.Url;
        } else {
            annotationType = AnnotationType.String;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
        if (i == 1) {
            Object item2 = range.getItem();
            C12775o.m28637g(item2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
            obj = SaversKt.save((ParagraphStyle) item2, SaversKt.getParagraphStyleSaver(), saverScope);
        } else if (i == 2) {
            Object item3 = range.getItem();
            C12775o.m28637g(item3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
            obj = SaversKt.save((SpanStyle) item3, SaversKt.getSpanStyleSaver(), saverScope);
        } else if (i == 3) {
            Object item4 = range.getItem();
            C12775o.m28637g(item4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
            obj = SaversKt.save((VerbatimTtsAnnotation) item4, SaversKt.VerbatimTtsAnnotationSaver, saverScope);
        } else if (i == 4) {
            Object item5 = range.getItem();
            C12775o.m28637g(item5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
            obj = SaversKt.save((UrlAnnotation) item5, SaversKt.UrlAnnotationSaver, saverScope);
        } else if (i == 5) {
            obj = SaversKt.save(range.getItem());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return C12726w.m28518e(SaversKt.save(annotationType), obj, SaversKt.save(Integer.valueOf(range.getStart())), SaversKt.save(Integer.valueOf(range.getEnd())), SaversKt.save(range.getTag()));
    }
}
