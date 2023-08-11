package androidx.compose.p002ui.layout;

import kotlin.jvm.internal.C12771l;
import p404of.C13088o;
import p418qf.C13263a;

/* renamed from: androidx.compose.ui.layout.AlignmentLineKt$LastBaseline$1 */
/* compiled from: AlignmentLine.kt */
/* synthetic */ class AlignmentLineKt$LastBaseline$1 extends C12771l implements C13088o<Integer, Integer, Integer> {
    public static final AlignmentLineKt$LastBaseline$1 INSTANCE = new AlignmentLineKt$LastBaseline$1();

    AlignmentLineKt$LastBaseline$1() {
        super(2, C13263a.class, "max", "max(II)I", 1);
    }

    public final Integer invoke(int i, int i2) {
        return Integer.valueOf(Math.max(i, i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
