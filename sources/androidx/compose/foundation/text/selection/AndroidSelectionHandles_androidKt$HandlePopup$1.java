package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: AndroidSelectionHandles.android.kt */
final class AndroidSelectionHandles_androidKt$HandlePopup$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ HandleReferencePoint $handleReferencePoint;
    final /* synthetic */ long $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidSelectionHandles_androidKt$HandlePopup$1(long j, HandleReferencePoint handleReferencePoint, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i) {
        super(2);
        this.$position = j;
        this.$handleReferencePoint = handleReferencePoint;
        this.$content = oVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        AndroidSelectionHandles_androidKt.m33749HandlePopupULxng0E(this.$position, this.$handleReferencePoint, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
