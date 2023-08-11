package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13090q;
import p404of.C13091r;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$10\n*L\n1#1,434:1\n*E\n"})
/* compiled from: LazyStaggeredGridDsl.kt */
public final class LazyStaggeredGridDslKt$itemsIndexed$10 extends C12777p implements C13090q<LazyStaggeredGridItemScope, Integer, Composer, Integer, C11921v> {
    final /* synthetic */ C13091r<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, C11921v> $itemContent;
    final /* synthetic */ T[] $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$itemsIndexed$10(C13091r<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, C11921v> rVar, T[] tArr) {
        super(4);
        this.$itemContent = rVar;
        this.$items = tArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i, Composer composer, int i2) {
        int i3;
        C12775o.m28639i(lazyStaggeredGridItemScope, "$this$items");
        if ((i2 & 14) == 0) {
            i3 = (composer.changed((Object) lazyStaggeredGridItemScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composer.changed(i) ? 32 : 16;
        }
        if ((i3 & 731) != 146 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-804487775, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:431)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, Integer.valueOf(i), this.$items[i], composer, Integer.valueOf((i3 & 14) | (i3 & 112)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
