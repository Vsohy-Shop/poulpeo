package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$BaselineShiftSaver$1 extends C12777p implements C13088o<SaverScope, BaselineShift, Object> {
    public static final SaversKt$BaselineShiftSaver$1 INSTANCE = new SaversKt$BaselineShiftSaver$1();

    SaversKt$BaselineShiftSaver$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m37915invoke8a2Sb4w((SaverScope) obj, ((BaselineShift) obj2).m38242unboximpl());
    }

    /* renamed from: invoke-8a2Sb4w  reason: not valid java name */
    public final Object m37915invoke8a2Sb4w(SaverScope saverScope, float f) {
        C12775o.m28639i(saverScope, "$this$Saver");
        return Float.valueOf(f);
    }
}
