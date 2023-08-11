package androidx.compose.foundation;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: AndroidOverscroll.kt */
final class AndroidEdgeEffectOverscrollEffect$onNewSize$1 extends C12777p implements Function1<IntSize, C11921v> {
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidEdgeEffectOverscrollEffect$onNewSize$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        super(1);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m32953invokeozmzZPI(((IntSize) obj).m38632unboximpl());
        return C11921v.f18618a;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m32953invokeozmzZPI(long j) {
        boolean z = !Size.m35487equalsimpl0(IntSizeKt.m38638toSizeozmzZPI(j), this.this$0.containerSize);
        this.this$0.containerSize = IntSizeKt.m38638toSizeozmzZPI(j);
        if (z) {
            this.this$0.topEffect.setSize(IntSize.m38628getWidthimpl(j), IntSize.m38627getHeightimpl(j));
            this.this$0.bottomEffect.setSize(IntSize.m38628getWidthimpl(j), IntSize.m38627getHeightimpl(j));
            this.this$0.leftEffect.setSize(IntSize.m38627getHeightimpl(j), IntSize.m38628getWidthimpl(j));
            this.this$0.rightEffect.setSize(IntSize.m38627getHeightimpl(j), IntSize.m38628getWidthimpl(j));
            this.this$0.topEffectNegation.setSize(IntSize.m38628getWidthimpl(j), IntSize.m38627getHeightimpl(j));
            this.this$0.bottomEffectNegation.setSize(IntSize.m38628getWidthimpl(j), IntSize.m38627getHeightimpl(j));
            this.this$0.leftEffectNegation.setSize(IntSize.m38627getHeightimpl(j), IntSize.m38628getWidthimpl(j));
            this.this$0.rightEffectNegation.setSize(IntSize.m38627getHeightimpl(j), IntSize.m38628getWidthimpl(j));
        }
        if (z) {
            this.this$0.invalidateOverscroll();
            this.this$0.animateToRelease();
        }
    }
}
