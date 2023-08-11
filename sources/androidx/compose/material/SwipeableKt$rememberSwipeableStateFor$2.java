package androidx.compose.material;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$rememberSwipeableStateFor$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,890:1\n62#2,5:891\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$rememberSwipeableStateFor$2\n*L\n520#1:891,5\n*E\n"})
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
        return new C0796x48085bbe();
    }
}
