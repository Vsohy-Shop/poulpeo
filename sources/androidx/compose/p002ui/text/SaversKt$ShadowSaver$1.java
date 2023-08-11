package androidx.compose.p002ui.text;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$ShadowSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$ShadowSaver$1 extends C12777p implements C13088o<SaverScope, Shadow, Object> {
    public static final SaversKt$ShadowSaver$1 INSTANCE = new SaversKt$ShadowSaver$1();

    SaversKt$ShadowSaver$1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope, Shadow shadow) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(shadow, "it");
        return C12726w.m28518e(SaversKt.save(Color.m35661boximpl(shadow.m36023getColor0d7_KjU()), SaversKt.getSaver(Color.Companion), saverScope), SaversKt.save(Offset.m35411boximpl(shadow.m36024getOffsetF1C5BW0()), SaversKt.getSaver(Offset.Companion), saverScope), SaversKt.save(Float.valueOf(shadow.getBlurRadius())));
    }
}
