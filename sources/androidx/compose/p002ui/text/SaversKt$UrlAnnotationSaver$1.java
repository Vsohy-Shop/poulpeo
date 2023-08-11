package androidx.compose.p002ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$UrlAnnotationSaver$1 extends C12777p implements C13088o<SaverScope, UrlAnnotation, Object> {
    public static final SaversKt$UrlAnnotationSaver$1 INSTANCE = new SaversKt$UrlAnnotationSaver$1();

    SaversKt$UrlAnnotationSaver$1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope, UrlAnnotation urlAnnotation) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(urlAnnotation, "it");
        return SaversKt.save(urlAnnotation.getUrl());
    }
}
