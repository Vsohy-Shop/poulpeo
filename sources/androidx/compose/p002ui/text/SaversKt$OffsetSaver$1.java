package androidx.compose.p002ui.text;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$OffsetSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$OffsetSaver$1 extends C12777p implements C13088o<SaverScope, Offset, Object> {
    public static final SaversKt$OffsetSaver$1 INSTANCE = new SaversKt$OffsetSaver$1();

    SaversKt$OffsetSaver$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m37919invokeUv8p0NA((SaverScope) obj, ((Offset) obj2).m35432unboximpl());
    }

    /* renamed from: invoke-Uv8p0NA  reason: not valid java name */
    public final Object m37919invokeUv8p0NA(SaverScope saverScope, long j) {
        C12775o.m28639i(saverScope, "$this$Saver");
        if (Offset.m35419equalsimpl0(j, Offset.Companion.m35437getUnspecifiedF1C5BW0())) {
            return Boolean.FALSE;
        }
        return C12726w.m28518e((Float) SaversKt.save(Float.valueOf(Offset.m35422getXimpl(j))), (Float) SaversKt.save(Float.valueOf(Offset.m35423getYimpl(j))));
    }
}
