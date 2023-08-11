package androidx.compose.foundation.relocation;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt$bringIntoViewRequester$2$1\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,484:1\n114#2:485\n735#3,2:486\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt$bringIntoViewRequester$2$1\n*L\n114#1:486,2\n*E\n"})
/* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0592x63edd90e implements DisposableEffectResult {
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester$inlined;
    final /* synthetic */ BringIntoViewRequesterModifier $modifier$inlined;

    public C0592x63edd90e(BringIntoViewRequester bringIntoViewRequester, BringIntoViewRequesterModifier bringIntoViewRequesterModifier) {
        this.$bringIntoViewRequester$inlined = bringIntoViewRequester;
        this.$modifier$inlined = bringIntoViewRequesterModifier;
    }

    public void dispose() {
        ((BringIntoViewRequesterImpl) this.$bringIntoViewRequester$inlined).getModifiers().remove(this.$modifier$inlined);
    }
}
