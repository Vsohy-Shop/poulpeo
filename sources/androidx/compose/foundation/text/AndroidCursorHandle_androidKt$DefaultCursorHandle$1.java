package androidx.compose.foundation.text;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: AndroidCursorHandle.android.kt */
final class AndroidCursorHandle_androidKt$DefaultCursorHandle$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidCursorHandle_androidKt$DefaultCursorHandle$1(Modifier modifier, int i) {
        super(2);
        this.$modifier = modifier;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        AndroidCursorHandle_androidKt.DefaultCursorHandle(this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
