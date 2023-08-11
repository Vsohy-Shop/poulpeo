package androidx.compose.p002ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$VerbatimTtsAnnotationSaver$1 extends C12777p implements C13088o<SaverScope, VerbatimTtsAnnotation, Object> {
    public static final SaversKt$VerbatimTtsAnnotationSaver$1 INSTANCE = new SaversKt$VerbatimTtsAnnotationSaver$1();

    SaversKt$VerbatimTtsAnnotationSaver$1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope, VerbatimTtsAnnotation verbatimTtsAnnotation) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(verbatimTtsAnnotation, "it");
        return SaversKt.save(verbatimTtsAnnotation.getVerbatim());
    }
}
