package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: FloatingActionButton.kt */
final class FloatingActionButtonKt$ExtendedFloatingActionButton$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ C13089p<RowScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ FloatingActionButtonElevation $elevation;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13074a<C11921v> $onClick;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FloatingActionButtonKt$ExtendedFloatingActionButton$3(C13074a<C11921v> aVar, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar, int i, int i2) {
        super(2);
        this.$onClick = aVar;
        this.$modifier = modifier;
        this.$shape = shape;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$elevation = floatingActionButtonElevation;
        this.$interactionSource = mutableInteractionSource;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        FloatingActionButtonKt.m34452ExtendedFloatingActionButtonXz6DiA(this.$onClick, this.$modifier, this.$shape, this.$containerColor, this.$contentColor, this.$elevation, this.$interactionSource, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
