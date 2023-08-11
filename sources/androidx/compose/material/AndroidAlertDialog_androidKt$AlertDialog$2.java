package androidx.compose.material;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.window.DialogProperties;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: AndroidAlertDialog.android.kt */
final class AndroidAlertDialog_androidKt$AlertDialog$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $confirmButton;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $dismissButton;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13074a<C11921v> $onDismissRequest;
    final /* synthetic */ DialogProperties $properties;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $text;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidAlertDialog_androidKt$AlertDialog$2(C13074a<C11921v> aVar, C13088o<? super Composer, ? super Integer, C11921v> oVar, Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, Shape shape, long j, long j2, DialogProperties dialogProperties, int i, int i2) {
        super(2);
        this.$onDismissRequest = aVar;
        this.$confirmButton = oVar;
        this.$modifier = modifier;
        this.$dismissButton = oVar2;
        this.$title = oVar3;
        this.$text = oVar4;
        this.$shape = shape;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$properties = dialogProperties;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        AndroidAlertDialog_androidKt.m33870AlertDialog6oU6zVQ(this.$onDismissRequest, this.$confirmButton, this.$modifier, this.$dismissButton, this.$title, this.$text, this.$shape, this.$backgroundColor, this.$contentColor, this.$properties, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
