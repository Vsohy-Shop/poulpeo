package androidx.compose.animation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentScope$slideIntoContainer$1 extends C12777p implements Function1<Integer, Integer> {
    public static final AnimatedContentScope$slideIntoContainer$1 INSTANCE = new AnimatedContentScope$slideIntoContainer$1();

    AnimatedContentScope$slideIntoContainer$1() {
        super(1);
    }

    public final Integer invoke(int i) {
        return Integer.valueOf(i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
