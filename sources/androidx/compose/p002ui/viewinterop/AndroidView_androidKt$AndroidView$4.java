package androidx.compose.p002ui.viewinterop;

import android.content.Context;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4 */
/* compiled from: AndroidView.android.kt */
final class AndroidView_androidKt$AndroidView$4 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<Context, T> $factory;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<T, C11921v> $onRelease;
    final /* synthetic */ Function1<T, C11921v> $onReset;
    final /* synthetic */ Function1<T, C11921v> $update;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidView_androidKt$AndroidView$4(Function1<? super Context, ? extends T> function1, Function1<? super T, C11921v> function12, Modifier modifier, Function1<? super T, C11921v> function13, Function1<? super T, C11921v> function14, int i, int i2) {
        super(2);
        this.$factory = function1;
        this.$onReset = function12;
        this.$modifier = modifier;
        this.$update = function13;
        this.$onRelease = function14;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        AndroidView_androidKt.AndroidView(this.$factory, this.$onReset, this.$modifier, this.$update, this.$onRelease, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
