package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: AndroidSelectionHandles.android.kt */
final class AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ boolean $handlesCrossed;
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1(Modifier modifier, boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2, int i) {
        super(2);
        this.$modifier = modifier;
        this.$isStartHandle = z;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        AndroidSelectionHandles_androidKt.DefaultSelectionHandle(this.$modifier, this.$isStartHandle, this.$direction, this.$handlesCrossed, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
