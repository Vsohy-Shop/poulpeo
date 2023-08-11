package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;
import p404of.C13090q;

/* compiled from: LazyListScopeImpl.kt */
final class LazyListScopeImpl$item$3 extends C12777p implements C13090q<LazyItemScope, Integer, Composer, Integer, C11921v> {
    final /* synthetic */ C13089p<LazyItemScope, Composer, Integer, C11921v> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListScopeImpl$item$3(C13089p<? super LazyItemScope, ? super Composer, ? super Integer, C11921v> pVar) {
        super(4);
        this.$content = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
        C12775o.m28639i(lazyItemScope, "$this$$receiver");
        if ((i2 & 14) == 0) {
            i2 |= composer.changed((Object) lazyItemScope) ? 4 : 2;
        }
        if ((i2 & 651) != 130 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-735119482, i2, -1, "androidx.compose.foundation.lazy.LazyListScopeImpl.item.<anonymous> (LazyListScopeImpl.kt:55)");
            }
            this.$content.invoke(lazyItemScope, composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
