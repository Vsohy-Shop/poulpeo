package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: AndroidSelectionHandles.android.kt */
final class AndroidSelectionHandles_androidKt$SelectionHandle$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ boolean $handlesCrossed;
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ long $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidSelectionHandles_androidKt$SelectionHandle$2(long j, boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2, Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i) {
        super(2);
        this.$position = j;
        this.$isStartHandle = z;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z2;
        this.$modifier = modifier;
        this.$content = oVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        AndroidSelectionHandles_androidKt.m33750SelectionHandle8fL75g(this.$position, this.$isStartHandle, this.$direction, this.$handlesCrossed, this.$modifier, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
