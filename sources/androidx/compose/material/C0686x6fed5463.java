package androidx.compose.material;

import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 */
/* compiled from: BackdropScaffold.kt */
final class C0686x6fed5463 extends C12777p implements Function1<Constraints, Constraints> {
    final /* synthetic */ float $headerHeightPx;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0686x6fed5463(float f) {
        super(1);
        this.$headerHeightPx = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Constraints.m38400boximpl(m33888invokeZezNO4M(((Constraints) obj).m38418unboximpl()));
    }

    /* renamed from: invoke-ZezNO4M  reason: not valid java name */
    public final long m33888invokeZezNO4M(long j) {
        return ConstraintsKt.m38429offsetNN6EwU$default(Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 10, (Object) null), 0, -C13265c.m30134c(this.$headerHeightPx), 1, (Object) null);
    }
}
