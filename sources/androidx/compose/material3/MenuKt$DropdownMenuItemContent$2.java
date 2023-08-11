package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: Menu.kt */
final class MenuKt$DropdownMenuItemContent$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ MenuItemColors $colors;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingIcon;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13074a<C11921v> $onClick;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $text;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MenuKt$DropdownMenuItemContent$2(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13074a<C11921v> aVar, Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i) {
        super(2);
        this.$text = oVar;
        this.$onClick = aVar;
        this.$modifier = modifier;
        this.$leadingIcon = oVar2;
        this.$trailingIcon = oVar3;
        this.$enabled = z;
        this.$colors = menuItemColors;
        this.$contentPadding = paddingValues;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        MenuKt.DropdownMenuItemContent(this.$text, this.$onClick, this.$modifier, this.$leadingIcon, this.$trailingIcon, this.$enabled, this.$colors, this.$contentPadding, this.$interactionSource, composer, this.$$changed | 1);
    }
}
