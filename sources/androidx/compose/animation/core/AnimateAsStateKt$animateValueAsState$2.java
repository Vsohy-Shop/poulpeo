package androidx.compose.animation.core;

import kotlin.jvm.internal.C12777p;
import p308ag.C10894d;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: AnimateAsState.kt */
final class AnimateAsStateKt$animateValueAsState$2 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ C10894d<T> $channel;
    final /* synthetic */ T $targetValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimateAsStateKt$animateValueAsState$2(C10894d<T> dVar, T t) {
        super(0);
        this.$channel = dVar;
        this.$targetValue = t;
    }

    public final void invoke() {
        this.$channel.mo45894m(this.$targetValue);
    }
}
