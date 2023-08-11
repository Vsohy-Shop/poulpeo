package androidx.compose.material;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: ListItem.kt */
final class TwoLine$ListItem$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $icon;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $overlineText;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $secondaryText;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $text;
    final /* synthetic */ TwoLine $tmp0_rcvr;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailing;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TwoLine$ListItem$2(TwoLine twoLine, Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, C13088o<? super Composer, ? super Integer, C11921v> oVar5, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = twoLine;
        this.$modifier = modifier;
        this.$icon = oVar;
        this.$text = oVar2;
        this.$secondaryText = oVar3;
        this.$overlineText = oVar4;
        this.$trailing = oVar5;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.ListItem(this.$modifier, this.$icon, this.$text, this.$secondaryText, this.$overlineText, this.$trailing, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
