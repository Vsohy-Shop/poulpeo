package androidx.compose.material;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Badge.kt */
final class BadgeKt$BadgedBox$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13089p<BoxScope, Composer, Integer, C11921v> $badge;
    final /* synthetic */ C13089p<BoxScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BadgeKt$BadgedBox$3(C13089p<? super BoxScope, ? super Composer, ? super Integer, C11921v> pVar, Modifier modifier, C13089p<? super BoxScope, ? super Composer, ? super Integer, C11921v> pVar2, int i, int i2) {
        super(2);
        this.$badge = pVar;
        this.$modifier = modifier;
        this.$content = pVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        BadgeKt.BadgedBox(this.$badge, this.$modifier, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
