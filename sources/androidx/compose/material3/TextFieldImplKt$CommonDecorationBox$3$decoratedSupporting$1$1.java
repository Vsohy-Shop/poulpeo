package androidx.compose.material3;

import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: TextFieldImpl.kt */
final class TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ TextStyle $bodySmall;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $it;
    final /* synthetic */ long $supportingTextColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1(long j, TextStyle textStyle, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        super(2);
        this.$supportingTextColor = j;
        this.$bodySmall = textStyle;
        this.$it = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1269483524, i, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:163)");
            }
            TextFieldImplKt.m34668DecorationKTwxG1Y(this.$supportingTextColor, this.$bodySmall, this.$it, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
