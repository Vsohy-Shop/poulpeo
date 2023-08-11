package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: SaveableStateHolder.kt */
final class SaveableStateHolderImpl$SaveableStateProvider$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ Object $key;
    final /* synthetic */ SaveableStateHolderImpl $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SaveableStateHolderImpl$SaveableStateProvider$2(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i) {
        super(2);
        this.$tmp0_rcvr = saveableStateHolderImpl;
        this.$key = obj;
        this.$content = oVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.SaveableStateProvider(this.$key, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
