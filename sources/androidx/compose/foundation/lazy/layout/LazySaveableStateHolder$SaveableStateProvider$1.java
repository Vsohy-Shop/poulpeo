package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,106:1\n62#2,5:107\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$1\n*L\n87#1:107,5\n*E\n"})
/* compiled from: LazySaveableStateHolder.kt */
final class LazySaveableStateHolder$SaveableStateProvider$1 extends C12777p implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Object $key;
    final /* synthetic */ LazySaveableStateHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazySaveableStateHolder$SaveableStateProvider$1(LazySaveableStateHolder lazySaveableStateHolder, Object obj) {
        super(1);
        this.this$0 = lazySaveableStateHolder;
        this.$key = obj;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
        this.this$0.previouslyComposedKeys.remove(this.$key);
        return new C0562xbe225e1e(this.this$0, this.$key);
    }
}
