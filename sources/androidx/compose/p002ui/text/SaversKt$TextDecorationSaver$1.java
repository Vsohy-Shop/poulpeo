package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$TextDecorationSaver$1 extends C12777p implements C13088o<SaverScope, TextDecoration, Object> {
    public static final SaversKt$TextDecorationSaver$1 INSTANCE = new SaversKt$TextDecorationSaver$1();

    SaversKt$TextDecorationSaver$1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope, TextDecoration textDecoration) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(textDecoration, "it");
        return Integer.valueOf(textDecoration.getMask());
    }
}
