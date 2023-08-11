package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$FontWeightSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$FontWeightSaver$1 extends C12777p implements C13088o<SaverScope, FontWeight, Object> {
    public static final SaversKt$FontWeightSaver$1 INSTANCE = new SaversKt$FontWeightSaver$1();

    SaversKt$FontWeightSaver$1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope, FontWeight fontWeight) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(fontWeight, "it");
        return Integer.valueOf(fontWeight.getWeight());
    }
}
