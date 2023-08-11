package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p355hf.C12074d;

/* compiled from: SnapFlingBehavior.kt */
interface ApproachAnimation<T, V extends AnimationVector> {
    Object approachAnimation(ScrollScope scrollScope, T t, T t2, Function1<? super T, C11921v> function1, C12074d<? super AnimationResult<T, V>> dVar);
}
