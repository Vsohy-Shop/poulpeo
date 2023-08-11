package androidx.compose.animation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: AnimatedVisibility.kt */
final class AnimatedVisibilityKt$AnimatedVisibility$16 extends C12777p implements C13089p<AnimatedVisibilityScope, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedVisibilityKt$AnimatedVisibility$16(C13088o<? super Composer, ? super Integer, C11921v> oVar, int i) {
        super(3);
        this.$content = oVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
        C12775o.m28639i(animatedVisibilityScope, "$this$AnimatedVisibility");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            this.$content.invoke(composer, Integer.valueOf((this.$$dirty >> 15) & 14));
        } else {
            composer.skipToGroupEnd();
        }
    }
}
