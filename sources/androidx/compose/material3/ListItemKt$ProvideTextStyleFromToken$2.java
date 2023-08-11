package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: ListItem.kt */
final class ListItemKt$ProvideTextStyleFromToken$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ TypographyKeyTokens $textToken;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListItemKt$ProvideTextStyleFromToken$2(long j, TypographyKeyTokens typographyKeyTokens, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i) {
        super(2);
        this.$color = j;
        this.$textToken = typographyKeyTokens;
        this.$content = oVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        ListItemKt.m34478ProvideTextStyleFromToken3JVO9M(this.$color, this.$textToken, this.$content, composer, this.$$changed | 1);
    }
}
