package androidx.compose.foundation.text;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: AndroidCursorHandle.android.kt */
final class AndroidCursorHandle_androidKt$CursorHandle$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ long $handlePosition;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidCursorHandle_androidKt$CursorHandle$2(long j, Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i) {
        super(2);
        this.$handlePosition = j;
        this.$modifier = modifier;
        this.$content = oVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        AndroidCursorHandle_androidKt.m33629CursorHandleULxng0E(this.$handlePosition, this.$modifier, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
