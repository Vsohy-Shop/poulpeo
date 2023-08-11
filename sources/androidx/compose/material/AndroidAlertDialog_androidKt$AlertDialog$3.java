package androidx.compose.material;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: AndroidAlertDialog.android.kt */
final class AndroidAlertDialog_androidKt$AlertDialog$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $buttons;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $text;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidAlertDialog_androidKt$AlertDialog$3(C13088o<? super Composer, ? super Integer, C11921v> oVar, Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, Shape shape, long j, long j2, int i) {
        super(2);
        this.$buttons = oVar;
        this.$modifier = modifier;
        this.$title = oVar2;
        this.$text = oVar3;
        this.$shape = shape;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        int i2 = i;
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1787418772, i2, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
            }
            C13088o<Composer, Integer, C11921v> oVar = this.$buttons;
            Modifier modifier = this.$modifier;
            C13088o<Composer, Integer, C11921v> oVar2 = this.$title;
            C13088o<Composer, Integer, C11921v> oVar3 = this.$text;
            Shape shape = this.$shape;
            long j = this.$backgroundColor;
            long j2 = this.$contentColor;
            int i3 = this.$$dirty;
            AlertDialogKt.m33866AlertDialogContentWMdw5o4(oVar, modifier, oVar2, oVar3, shape, j, j2, composer, ((i3 >> 3) & 14) | ((i3 >> 3) & 112) | ((i3 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i3 >> 3) & 7168) | ((i3 >> 3) & 57344) | ((i3 >> 3) & 458752) | ((i3 >> 3) & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
