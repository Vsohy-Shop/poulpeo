package androidx.compose.p002ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$2 */
/* compiled from: WindowInfo.kt */
final class WindowInfoKt$WindowFocusObserver$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<Boolean, C11921v> $onWindowFocusChanged;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowInfoKt$WindowFocusObserver$2(Function1<? super Boolean, C11921v> function1, int i) {
        super(2);
        this.$onWindowFocusChanged = function1;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        WindowInfoKt.WindowFocusObserver(this.$onWindowFocusChanged, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
