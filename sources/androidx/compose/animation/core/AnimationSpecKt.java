package androidx.compose.animation.core;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* compiled from: AnimationSpec.kt */
public final class AnimationSpecKt {
    /* access modifiers changed from: private */
    public static final <T, V extends AnimationVector> V convert(TwoWayConverter<T, V> twoWayConverter, T t) {
        if (t == null) {
            return null;
        }
        return (AnimationVector) twoWayConverter.getConvertToVector().invoke(t);
    }

    @Stable
    public static final /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        C12775o.m28639i(durationBasedAnimationSpec, "animation");
        C12775o.m28639i(repeatMode, "repeatMode");
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec, repeatMode, StartOffset.m32917constructorimpl$default(0, 0, 2, (DefaultConstructorMarker) null), (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i, Object obj) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return infiniteRepeatable(durationBasedAnimationSpec, repeatMode);
    }

    @Stable
    /* renamed from: infiniteRepeatable-9IiC70o  reason: not valid java name */
    public static final <T> InfiniteRepeatableSpec<T> m32895infiniteRepeatable9IiC70o(DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        C12775o.m28639i(durationBasedAnimationSpec, "animation");
        C12775o.m28639i(repeatMode, "repeatMode");
        return new InfiniteRepeatableSpec((DurationBasedAnimationSpec) durationBasedAnimationSpec, repeatMode, j, (DefaultConstructorMarker) null);
    }

    /* renamed from: infiniteRepeatable-9IiC70o$default  reason: not valid java name */
    public static /* synthetic */ InfiniteRepeatableSpec m32896infiniteRepeatable9IiC70o$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i & 4) != 0) {
            j = StartOffset.m32917constructorimpl$default(0, 0, 2, (DefaultConstructorMarker) null);
        }
        return m32895infiniteRepeatable9IiC70o(durationBasedAnimationSpec, repeatMode, j);
    }

    @Stable
    public static final <T> KeyframesSpec<T> keyframes(Function1<? super KeyframesSpec.KeyframesSpecConfig<T>, C11921v> function1) {
        C12775o.m28639i(function1, "init");
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
        function1.invoke(keyframesSpecConfig);
        return new KeyframesSpec<>(keyframesSpecConfig);
    }

    @Stable
    public static final /* synthetic */ RepeatableSpec repeatable(int i, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        C12775o.m28639i(durationBasedAnimationSpec, "animation");
        C12775o.m28639i(repeatMode, "repeatMode");
        return new RepeatableSpec(i, durationBasedAnimationSpec, repeatMode, StartOffset.m32917constructorimpl$default(0, 0, 2, (DefaultConstructorMarker) null), (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RepeatableSpec repeatable$default(int i, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return repeatable(i, durationBasedAnimationSpec, repeatMode);
    }

    @Stable
    /* renamed from: repeatable-91I0pcU  reason: not valid java name */
    public static final <T> RepeatableSpec<T> m32897repeatable91I0pcU(int i, DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        C12775o.m28639i(durationBasedAnimationSpec, "animation");
        C12775o.m28639i(repeatMode, "repeatMode");
        return new RepeatableSpec(i, (DurationBasedAnimationSpec) durationBasedAnimationSpec, repeatMode, j, (DefaultConstructorMarker) null);
    }

    /* renamed from: repeatable-91I0pcU$default  reason: not valid java name */
    public static /* synthetic */ RepeatableSpec m32898repeatable91I0pcU$default(int i, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i2 & 8) != 0) {
            j = StartOffset.m32917constructorimpl$default(0, 0, 2, (DefaultConstructorMarker) null);
        }
        return m32897repeatable91I0pcU(i, durationBasedAnimationSpec, repeatMode, j);
    }

    @Stable
    public static final <T> SnapSpec<T> snap(int i) {
        return new SnapSpec<>(i);
    }

    public static /* synthetic */ SnapSpec snap$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return snap(i);
    }

    @Stable
    public static final <T> SpringSpec<T> spring(float f, float f2, T t) {
        return new SpringSpec<>(f, f2, t);
    }

    public static /* synthetic */ SpringSpec spring$default(float f, float f2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return spring(f, f2, obj);
    }

    @Stable
    public static final <T> TweenSpec<T> tween(int i, int i2, Easing easing) {
        C12775o.m28639i(easing, "easing");
        return new TweenSpec<>(i, i2, easing);
    }

    public static /* synthetic */ TweenSpec tween$default(int i, int i2, Easing easing, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = AnimationConstants.DefaultDurationMillis;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            easing = EasingKt.getFastOutSlowInEasing();
        }
        return tween(i, i2, easing);
    }
}
