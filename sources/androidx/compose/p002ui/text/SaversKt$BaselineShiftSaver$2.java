package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.style.BaselineShift;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2 */
/* compiled from: Savers.kt */
final class SaversKt$BaselineShiftSaver$2 extends C12777p implements Function1<Object, BaselineShift> {
    public static final SaversKt$BaselineShiftSaver$2 INSTANCE = new SaversKt$BaselineShiftSaver$2();

    SaversKt$BaselineShiftSaver$2() {
        super(1);
    }

    /* renamed from: invoke-jTk7eUs  reason: not valid java name */
    public final BaselineShift invoke(Object obj) {
        C12775o.m28639i(obj, "it");
        return BaselineShift.m38236boximpl(BaselineShift.m38237constructorimpl(((Float) obj).floatValue()));
    }
}
