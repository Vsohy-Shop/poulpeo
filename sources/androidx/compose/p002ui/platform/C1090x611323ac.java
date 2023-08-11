package androidx.compose.p002ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4 */
/* compiled from: AndroidCompositionLocals.android.kt */
final class C1090x611323ac extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ AndroidComposeView $owner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1090x611323ac(AndroidComposeView androidComposeView, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i) {
        super(2);
        this.$owner = androidComposeView;
        this.$content = oVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(this.$owner, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
