package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.MeasureScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13090q;

/* compiled from: FlowLayout.kt */
final class FlowLayoutKt$crossAxisColumnArrangement$1 extends C12777p implements C13090q<Integer, int[], MeasureScope, int[], C11921v> {
    public static final FlowLayoutKt$crossAxisColumnArrangement$1 INSTANCE = new FlowLayoutKt$crossAxisColumnArrangement$1();

    FlowLayoutKt$crossAxisColumnArrangement$1() {
        super(4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke(((Number) obj).intValue(), (int[]) obj2, (MeasureScope) obj3, (int[]) obj4);
        return C11921v.f18618a;
    }

    public final void invoke(int i, int[] iArr, MeasureScope measureScope, int[] iArr2) {
        C12775o.m28639i(iArr, "size");
        C12775o.m28639i(measureScope, "measureScope");
        C12775o.m28639i(iArr2, "outPosition");
        Arrangement.INSTANCE.getStart().arrange(measureScope, i, iArr, measureScope.getLayoutDirection(), iArr2);
    }
}
