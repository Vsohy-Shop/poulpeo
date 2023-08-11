package androidx.compose.material3;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.window.DialogProperties;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: AndroidAlertDialog.android.kt */
final class AndroidAlertDialog_androidKt$AlertDialog$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $confirmButton;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $dismissButton;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $icon;
    final /* synthetic */ long $iconContentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13074a<C11921v> $onDismissRequest;
    final /* synthetic */ DialogProperties $properties;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $text;
    final /* synthetic */ long $textContentColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $title;
    final /* synthetic */ long $titleContentColor;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidAlertDialog_androidKt$AlertDialog$2(C13074a<C11921v> aVar, C13088o<? super Composer, ? super Integer, C11921v> oVar, Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, C13088o<? super Composer, ? super Integer, C11921v> oVar5, Shape shape, long j, long j2, long j3, long j4, float f, DialogProperties dialogProperties, int i, int i2, int i3) {
        super(2);
        this.$onDismissRequest = aVar;
        this.$confirmButton = oVar;
        this.$modifier = modifier;
        this.$dismissButton = oVar2;
        this.$icon = oVar3;
        this.$title = oVar4;
        this.$text = oVar5;
        this.$shape = shape;
        this.$containerColor = j;
        this.$iconContentColor = j2;
        this.$titleContentColor = j3;
        this.$textContentColor = j4;
        this.$tonalElevation = f;
        this.$properties = dialogProperties;
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
        C13074a<C11921v> aVar = this.$onDismissRequest;
        C13074a<C11921v> aVar2 = aVar;
        AndroidAlertDialog_androidKt.m34246AlertDialogOix01E0(aVar2, this.$confirmButton, this.$modifier, this.$dismissButton, this.$icon, this.$title, this.$text, this.$shape, this.$containerColor, this.$iconContentColor, this.$titleContentColor, this.$textContentColor, this.$tonalElevation, this.$properties, composer2, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
