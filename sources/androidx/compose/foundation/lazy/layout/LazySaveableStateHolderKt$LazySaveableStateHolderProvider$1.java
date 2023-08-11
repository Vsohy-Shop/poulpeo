package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: LazySaveableStateHolder.kt */
final class LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13089p<SaveableStateHolder, Composer, Integer, C11921v> $content;
    final /* synthetic */ LazySaveableStateHolder $holder;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1(LazySaveableStateHolder lazySaveableStateHolder, C13089p<? super SaveableStateHolder, ? super Composer, ? super Integer, C11921v> pVar, int i) {
        super(2);
        this.$holder = lazySaveableStateHolder;
        this.$content = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1863926504, i, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:48)");
            }
            this.$holder.setWrappedHolder(SaveableStateHolderKt.rememberSaveableStateHolder(composer, 0));
            this.$content.invoke(this.$holder, composer, Integer.valueOf(((this.$$dirty << 3) & 112) | 8));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
