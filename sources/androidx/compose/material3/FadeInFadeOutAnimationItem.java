package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: SnackbarHost.kt */
final class FadeInFadeOutAnimationItem<T> {
    private final T key;
    private final C13089p<C13088o<? super Composer, ? super Integer, C11921v>, Composer, Integer, C11921v> transition;

    public FadeInFadeOutAnimationItem(T t, C13089p<? super C13088o<? super Composer, ? super Integer, C11921v>, ? super Composer, ? super Integer, C11921v> pVar) {
        C12775o.m28639i(pVar, "transition");
        this.key = t;
        this.transition = pVar;
    }

    public static /* synthetic */ FadeInFadeOutAnimationItem copy$default(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem, T t, C13089p<C13088o<? super Composer, ? super Integer, C11921v>, Composer, Integer, C11921v> pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            t = fadeInFadeOutAnimationItem.key;
        }
        if ((i & 2) != 0) {
            pVar = fadeInFadeOutAnimationItem.transition;
        }
        return fadeInFadeOutAnimationItem.copy(t, pVar);
    }

    public final T component1() {
        return this.key;
    }

    public final C13089p<C13088o<? super Composer, ? super Integer, C11921v>, Composer, Integer, C11921v> component2() {
        return this.transition;
    }

    public final FadeInFadeOutAnimationItem<T> copy(T t, C13089p<? super C13088o<? super Composer, ? super Integer, C11921v>, ? super Composer, ? super Integer, C11921v> pVar) {
        C12775o.m28639i(pVar, "transition");
        return new FadeInFadeOutAnimationItem<>(t, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        if (C12775o.m28634d(this.key, fadeInFadeOutAnimationItem.key) && C12775o.m28634d(this.transition, fadeInFadeOutAnimationItem.transition)) {
            return true;
        }
        return false;
    }

    public final T getKey() {
        return this.key;
    }

    public final C13089p<C13088o<? super Composer, ? super Integer, C11921v>, Composer, Integer, C11921v> getTransition() {
        return this.transition;
    }

    public int hashCode() {
        int i;
        T t = this.key;
        if (t == null) {
            i = 0;
        } else {
            i = t.hashCode();
        }
        return (i * 31) + this.transition.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
