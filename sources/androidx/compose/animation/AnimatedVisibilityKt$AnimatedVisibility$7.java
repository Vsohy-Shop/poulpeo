package androidx.compose.animation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: AnimatedVisibility.kt */
final class AnimatedVisibilityKt$AnimatedVisibility$7 extends C12777p implements Function1<Boolean, Boolean> {
    public static final AnimatedVisibilityKt$AnimatedVisibility$7 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibility$7();

    AnimatedVisibilityKt$AnimatedVisibility$7() {
        super(1);
    }

    public final Boolean invoke(boolean z) {
        return Boolean.valueOf(z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Boolean) obj).booleanValue());
    }
}
