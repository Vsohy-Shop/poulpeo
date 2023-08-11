package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.geometry.Offset;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.graphics.Vertices$outOfBounds$1 */
/* compiled from: Vertices.kt */
final class Vertices$outOfBounds$1 extends C12777p implements Function1<Integer, Boolean> {
    final /* synthetic */ List<Offset> $positions;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Vertices$outOfBounds$1(List<Offset> list) {
        super(1);
        this.$positions = list;
    }

    public final Boolean invoke(int i) {
        return Boolean.valueOf(i < 0 || i >= this.$positions.size());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
