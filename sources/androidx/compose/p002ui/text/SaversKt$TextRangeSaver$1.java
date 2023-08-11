package androidx.compose.p002ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$TextRangeSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$TextRangeSaver$1 extends C12777p implements C13088o<SaverScope, TextRange, Object> {
    public static final SaversKt$TextRangeSaver$1 INSTANCE = new SaversKt$TextRangeSaver$1();

    SaversKt$TextRangeSaver$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m37921invokeFDrldGo((SaverScope) obj, ((TextRange) obj2).m37979unboximpl());
    }

    /* renamed from: invoke-FDrldGo  reason: not valid java name */
    public final Object m37921invokeFDrldGo(SaverScope saverScope, long j) {
        C12775o.m28639i(saverScope, "$this$Saver");
        return C12726w.m28518e((Integer) SaversKt.save(Integer.valueOf(TextRange.m37975getStartimpl(j))), (Integer) SaversKt.save(Integer.valueOf(TextRange.m37970getEndimpl(j))));
    }
}
