package androidx.compose.animation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$slideInHorizontally$1 extends C12777p implements Function1<Integer, Integer> {
    public static final EnterExitTransitionKt$slideInHorizontally$1 INSTANCE = new EnterExitTransitionKt$slideInHorizontally$1();

    EnterExitTransitionKt$slideInHorizontally$1() {
        super(1);
    }

    public final Integer invoke(int i) {
        return Integer.valueOf((-i) / 2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
