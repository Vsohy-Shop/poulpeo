package androidx.compose.material3;

import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Snackbar.kt */
final class SnackbarKt$OneRowSnackbar$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $action;
    final /* synthetic */ long $actionTextColor;
    final /* synthetic */ TextStyle $actionTextStyle;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $dismissAction;
    final /* synthetic */ long $dismissActionColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarKt$OneRowSnackbar$3(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, TextStyle textStyle, long j, long j2, int i) {
        super(2);
        this.$text = oVar;
        this.$action = oVar2;
        this.$dismissAction = oVar3;
        this.$actionTextStyle = textStyle;
        this.$actionTextColor = j;
        this.$dismissActionColor = j2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        SnackbarKt.m34571OneRowSnackbarkKq0p4A(this.$text, this.$action, this.$dismissAction, this.$actionTextStyle, this.$actionTextColor, this.$dismissActionColor, composer, this.$$changed | 1);
    }
}
