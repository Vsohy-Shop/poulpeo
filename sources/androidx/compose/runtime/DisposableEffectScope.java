package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;

@StabilityInferred(parameters = 0)
/* compiled from: Effects.kt */
public final class DisposableEffectScope {
    public static final int $stable = 0;

    public final DisposableEffectResult onDispose(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "onDisposeEffect");
        return new DisposableEffectScope$onDispose$1(aVar);
    }
}
