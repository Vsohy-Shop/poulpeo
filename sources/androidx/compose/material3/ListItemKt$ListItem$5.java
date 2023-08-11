package androidx.compose.material3;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: ListItem.kt */
final class ListItemKt$ListItem$5 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ListItemColors $colors;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $headlineText;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingContent;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $overlineText;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $supportingText;
    final /* synthetic */ float $tonalElevation;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailingContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListItemKt$ListItem$5(C13088o<? super Composer, ? super Integer, C11921v> oVar, Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, C13088o<? super Composer, ? super Integer, C11921v> oVar5, ListItemColors listItemColors, float f, float f2, int i, int i2) {
        super(2);
        this.$headlineText = oVar;
        this.$modifier = modifier;
        this.$overlineText = oVar2;
        this.$supportingText = oVar3;
        this.$leadingContent = oVar4;
        this.$trailingContent = oVar5;
        this.$colors = listItemColors;
        this.$tonalElevation = f;
        this.$shadowElevation = f2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        ListItemKt.m34476ListItemHXNGIdc(this.$headlineText, this.$modifier, this.$overlineText, this.$supportingText, this.$leadingContent, this.$trailingContent, this.$colors, this.$tonalElevation, this.$shadowElevation, composer, this.$$changed | 1, this.$$default);
    }
}
