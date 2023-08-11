package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;
import p404of.C13090q;

/* compiled from: LazyStaggeredGridScope.kt */
final class LazyStaggeredGridScopeImpl$item$4 extends C12777p implements C13090q<LazyStaggeredGridItemScope, Integer, Composer, Integer, C11921v> {
    final /* synthetic */ C13089p<LazyStaggeredGridItemScope, Composer, Integer, C11921v> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridScopeImpl$item$4(C13089p<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, C11921v> pVar) {
        super(4);
        this.$content = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i, Composer composer, int i2) {
        C12775o.m28639i(lazyStaggeredGridItemScope, "$this$items");
        if ((i2 & 14) == 0) {
            i2 |= composer.changed((Object) lazyStaggeredGridItemScope) ? 4 : 2;
        }
        if ((i2 & 651) != 130 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1700162468, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScopeImpl.item.<anonymous> (LazyStaggeredGridScope.kt:38)");
            }
            this.$content.invoke(lazyStaggeredGridItemScope, composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
