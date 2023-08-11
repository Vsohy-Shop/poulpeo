package androidx.compose.material3;

import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: NavigationBar.kt */
final class NavigationBarKt$NavigationBarItem$2$1 extends C12777p implements Function1<IntSize, C11921v> {
    final /* synthetic */ MutableState<Integer> $itemWidth$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationBarKt$NavigationBarItem$2$1(MutableState<Integer> mutableState) {
        super(1);
        this.$itemWidth$delegate = mutableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m34506invokeozmzZPI(((IntSize) obj).m38632unboximpl());
        return C11921v.f18618a;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m34506invokeozmzZPI(long j) {
        NavigationBarKt.m34498NavigationBarItem$lambda4(this.$itemWidth$delegate, IntSize.m38628getWidthimpl(j));
    }
}
