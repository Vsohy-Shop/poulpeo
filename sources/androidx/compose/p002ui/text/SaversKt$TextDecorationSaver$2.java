package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.style.TextDecoration;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2 */
/* compiled from: Savers.kt */
final class SaversKt$TextDecorationSaver$2 extends C12777p implements Function1<Object, TextDecoration> {
    public static final SaversKt$TextDecorationSaver$2 INSTANCE = new SaversKt$TextDecorationSaver$2();

    SaversKt$TextDecorationSaver$2() {
        super(1);
    }

    public final TextDecoration invoke(Object obj) {
        C12775o.m28639i(obj, "it");
        return new TextDecoration(((Integer) obj).intValue());
    }
}
