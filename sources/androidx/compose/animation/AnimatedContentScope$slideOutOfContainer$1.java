package androidx.compose.animation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentScope$slideOutOfContainer$1 extends C12777p implements Function1<Integer, Integer> {
    public static final AnimatedContentScope$slideOutOfContainer$1 INSTANCE = new AnimatedContentScope$slideOutOfContainer$1();

    AnimatedContentScope$slideOutOfContainer$1() {
        super(1);
    }

    public final Integer invoke(int i) {
        return Integer.valueOf(i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
