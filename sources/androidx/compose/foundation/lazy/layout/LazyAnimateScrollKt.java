package androidx.compose.foundation.lazy.layout;

import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,264:1\n154#2:265\n154#2:266\n154#2:267\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n34#1:265\n35#1:266\n36#1:267\n*E\n"})
/* compiled from: LazyAnimateScroll.kt */
public final class LazyAnimateScrollKt {
    /* access modifiers changed from: private */
    public static final float BoundDistance = C1232Dp.m38468constructorimpl((float) 1500);
    private static final boolean DEBUG = false;
    /* access modifiers changed from: private */
    public static final float MinimumDistance = C1232Dp.m38468constructorimpl((float) 50);
    /* access modifiers changed from: private */
    public static final float TargetDistance = C1232Dp.m38468constructorimpl((float) 2500);

    public static final Object animateScrollToItem(LazyAnimateScrollScope lazyAnimateScrollScope, int i, int i2, C12074d<? super C11921v> dVar) {
        Object scroll = lazyAnimateScrollScope.scroll(new LazyAnimateScrollKt$animateScrollToItem$2(i, lazyAnimateScrollScope, i2, (C12074d<? super LazyAnimateScrollKt$animateScrollToItem$2>) null), dVar);
        if (scroll == C12150d.m26492c()) {
            return scroll;
        }
        return C11921v.f18618a;
    }

    private static final void debugLog(C13074a<String> aVar) {
    }
}
