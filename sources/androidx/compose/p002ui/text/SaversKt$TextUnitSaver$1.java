package androidx.compose.p002ui.text;

import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitType;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$TextUnitSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$TextUnitSaver$1 extends C12777p implements C13088o<SaverScope, TextUnit, Object> {
    public static final SaversKt$TextUnitSaver$1 INSTANCE = new SaversKt$TextUnitSaver$1();

    SaversKt$TextUnitSaver$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m37923invokempE4wyQ((SaverScope) obj, ((TextUnit) obj2).m38658unboximpl());
    }

    /* renamed from: invoke-mpE4wyQ  reason: not valid java name */
    public final Object m37923invokempE4wyQ(SaverScope saverScope, long j) {
        C12775o.m28639i(saverScope, "$this$Saver");
        return C12726w.m28518e(SaversKt.save(Float.valueOf(TextUnit.m38649getValueimpl(j))), SaversKt.save(TextUnitType.m38674boximpl(TextUnit.m38648getTypeUIouoOA(j))));
    }
}
