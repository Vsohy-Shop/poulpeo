package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;
import p404of.C13090q;

/* compiled from: LazyGridScopeImpl.kt */
final class LazyGridScopeImpl$item$4 extends C12777p implements C13090q<LazyGridItemScope, Integer, Composer, Integer, C11921v> {
    final /* synthetic */ C13089p<LazyGridItemScope, Composer, Integer, C11921v> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyGridScopeImpl$item$4(C13089p<? super LazyGridItemScope, ? super Composer, ? super Integer, C11921v> pVar) {
        super(4);
        this.$content = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i2) {
        C12775o.m28639i(lazyGridItemScope, "$this$$receiver");
        if ((i2 & 14) == 0) {
            i2 |= composer.changed((Object) lazyGridItemScope) ? 4 : 2;
        }
        if ((i2 & 651) != 130 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1504808184, i2, -1, "androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.item.<anonymous> (LazyGridScopeImpl.kt:42)");
            }
            this.$content.invoke(lazyGridItemScope, composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
