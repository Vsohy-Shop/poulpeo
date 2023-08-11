package androidx.compose.p002ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$AnnotatedStringSaver$1 extends C12777p implements C13088o<SaverScope, AnnotatedString, Object> {
    public static final SaversKt$AnnotatedStringSaver$1 INSTANCE = new SaversKt$AnnotatedStringSaver$1();

    SaversKt$AnnotatedStringSaver$1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope, AnnotatedString annotatedString) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(annotatedString, "it");
        return C12726w.m28518e(SaversKt.save(annotatedString.getText()), SaversKt.save(annotatedString.getSpanStyles(), SaversKt.AnnotationRangeListSaver, saverScope), SaversKt.save(annotatedString.getParagraphStyles(), SaversKt.AnnotationRangeListSaver, saverScope), SaversKt.save(annotatedString.getAnnotations$ui_text_release(), SaversKt.AnnotationRangeListSaver, saverScope));
    }
}
