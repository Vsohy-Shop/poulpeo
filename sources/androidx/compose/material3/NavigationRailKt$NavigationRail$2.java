package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: NavigationRail.kt */
final class NavigationRailKt$NavigationRail$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ C13089p<ColumnScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C13089p<ColumnScope, Composer, Integer, C11921v> $header;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationRailKt$NavigationRail$2(Modifier modifier, long j, long j2, C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar, WindowInsets windowInsets, C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar2, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$header = pVar;
        this.$windowInsets = windowInsets;
        this.$content = pVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        NavigationRailKt.m34523NavigationRailqi6gXK8(this.$modifier, this.$containerColor, this.$contentColor, this.$header, this.$windowInsets, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
