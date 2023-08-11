package androidx.compose.material3;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Swipeable.kt */
final class SwipeableKt$rememberSwipeableStateFor$2 extends C12777p implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ MutableState<Boolean> $forceAnimationCheck;
    final /* synthetic */ Function1<T, C11921v> $onValueChange;
    final /* synthetic */ SwipeableState<T> $swipeableState;
    final /* synthetic */ T $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableKt$rememberSwipeableStateFor$2(T t, SwipeableState<T> swipeableState, Function1<? super T, C11921v> function1, MutableState<Boolean> mutableState) {
        super(1);
        this.$value = t;
        this.$swipeableState = swipeableState;
        this.$onValueChange = function1;
        this.$forceAnimationCheck = mutableState;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
        if (!C12775o.m28634d(this.$value, this.$swipeableState.getCurrentValue())) {
            this.$onValueChange.invoke(this.$swipeableState.getCurrentValue());
            MutableState<Boolean> mutableState = this.$forceAnimationCheck;
            mutableState.setValue(Boolean.valueOf(!mutableState.getValue().booleanValue()));
        }
        return new C0914x48085bbe();
    }
}
