package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.font.FontWeight;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.text.SaversKt$FontWeightSaver$2 */
/* compiled from: Savers.kt */
final class SaversKt$FontWeightSaver$2 extends C12777p implements Function1<Object, FontWeight> {
    public static final SaversKt$FontWeightSaver$2 INSTANCE = new SaversKt$FontWeightSaver$2();

    SaversKt$FontWeightSaver$2() {
        super(1);
    }

    public final FontWeight invoke(Object obj) {
        C12775o.m28639i(obj, "it");
        return new FontWeight(((Integer) obj).intValue());
    }
}
