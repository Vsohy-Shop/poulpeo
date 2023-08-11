package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.MeasureScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13090q;

@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$crossAxisRowArrangement$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,724:1\n1#2:725\n*E\n"})
/* compiled from: FlowLayout.kt */
final class FlowLayoutKt$crossAxisRowArrangement$1 extends C12777p implements C13090q<Integer, int[], MeasureScope, int[], C11921v> {
    public static final FlowLayoutKt$crossAxisRowArrangement$1 INSTANCE = new FlowLayoutKt$crossAxisRowArrangement$1();

    FlowLayoutKt$crossAxisRowArrangement$1() {
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
        Arrangement.INSTANCE.getTop().arrange(measureScope, i, iArr, iArr2);
    }
}
