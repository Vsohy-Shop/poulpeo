package androidx.compose.foundation.lazy.grid;

import androidx.compose.p002ui.unit.Constraints;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11906l;

/* compiled from: LazyGridState.kt */
final class LazyGridState$prefetchInfoRetriever$2 extends C12777p implements Function1<LineIndex, List<? extends C11906l<? extends Integer, ? extends Constraints>>> {
    public static final LazyGridState$prefetchInfoRetriever$2 INSTANCE = new LazyGridState$prefetchInfoRetriever$2();

    LazyGridState$prefetchInfoRetriever$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m33488invokebKFJvoY(((LineIndex) obj).m33506unboximpl());
    }

    /* renamed from: invoke-bKFJvoY  reason: not valid java name */
    public final List<C11906l<Integer, Constraints>> m33488invokebKFJvoY(int i) {
        return C12726w.m28524k();
    }
}
