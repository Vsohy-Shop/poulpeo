package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1 */
/* compiled from: DrawModifier.kt */
final class CacheDrawScope$onDrawBehind$1 extends C12777p implements Function1<ContentDrawScope, C11921v> {
    final /* synthetic */ Function1<DrawScope, C11921v> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CacheDrawScope$onDrawBehind$1(Function1<? super DrawScope, C11921v> function1) {
        super(1);
        this.$block = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(ContentDrawScope contentDrawScope) {
        C12775o.m28639i(contentDrawScope, "$this$onDrawWithContent");
        this.$block.invoke(contentDrawScope);
        contentDrawScope.drawContent();
    }
}
