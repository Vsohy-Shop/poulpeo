package androidx.compose.material3;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: AlertDialog.kt */
final class AlertDialogKt$AlertDialogContent$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $buttonContentColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $buttons;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $icon;
    final /* synthetic */ long $iconContentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $text;
    final /* synthetic */ long $textContentColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $title;
    final /* synthetic */ long $titleContentColor;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlertDialogKt$AlertDialogContent$2(C13088o<? super Composer, ? super Integer, C11921v> oVar, Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, Shape shape, long j, float f, long j2, long j3, long j4, long j5, int i, int i2, int i3) {
        super(2);
        this.$buttons = oVar;
        this.$modifier = modifier;
        this.$icon = oVar2;
        this.$title = oVar3;
        this.$text = oVar4;
        this.$shape = shape;
        this.$containerColor = j;
        this.$tonalElevation = f;
        this.$buttonContentColor = j2;
        this.$iconContentColor = j3;
        this.$titleContentColor = j4;
        this.$textContentColor = j5;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        C13088o<Composer, Integer, C11921v> oVar = this.$buttons;
        C13088o<Composer, Integer, C11921v> oVar2 = oVar;
        AlertDialogKt.m34243AlertDialogContent4hvqGtA(oVar2, this.$modifier, this.$icon, this.$title, this.$text, this.$shape, this.$containerColor, this.$tonalElevation, this.$buttonContentColor, this.$iconContentColor, this.$titleContentColor, this.$textContentColor, composer2, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
