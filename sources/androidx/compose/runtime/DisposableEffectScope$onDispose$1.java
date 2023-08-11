package androidx.compose.runtime;

import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n*L\n1#1,484:1\n*E\n"})
/* compiled from: Effects.kt */
public final class DisposableEffectScope$onDispose$1 implements DisposableEffectResult {
    final /* synthetic */ C13074a<C11921v> $onDisposeEffect;

    public DisposableEffectScope$onDispose$1(C13074a<C11921v> aVar) {
        this.$onDisposeEffect = aVar;
    }

    public void dispose() {
        this.$onDisposeEffect.invoke();
    }
}
