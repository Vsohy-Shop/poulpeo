package androidx.compose.material3;

import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Text.kt */
final class TextKt$ProvideTextStyle$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ TextStyle $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextKt$ProvideTextStyle$1(TextStyle textStyle, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i) {
        super(2);
        this.$value = textStyle;
        this.$content = oVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        TextKt.ProvideTextStyle(this.$value, this.$content, composer, this.$$changed | 1);
    }
}
