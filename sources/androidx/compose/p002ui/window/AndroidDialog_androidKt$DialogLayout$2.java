package androidx.compose.p002ui.window;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$2 */
/* compiled from: AndroidDialog.android.kt */
final class AndroidDialog_androidKt$DialogLayout$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidDialog_androidKt$DialogLayout$2(Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$content = oVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        AndroidDialog_androidKt.DialogLayout(this.$modifier, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
