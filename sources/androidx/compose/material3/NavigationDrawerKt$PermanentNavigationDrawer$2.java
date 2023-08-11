package androidx.compose.material3;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: NavigationDrawer.kt */
final class NavigationDrawerKt$PermanentNavigationDrawer$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $drawerContent;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationDrawerKt$PermanentNavigationDrawer$2(C13088o<? super Composer, ? super Integer, C11921v> oVar, Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar2, int i, int i2) {
        super(2);
        this.$drawerContent = oVar;
        this.$modifier = modifier;
        this.$content = oVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        NavigationDrawerKt.PermanentNavigationDrawer(this.$drawerContent, this.$modifier, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
