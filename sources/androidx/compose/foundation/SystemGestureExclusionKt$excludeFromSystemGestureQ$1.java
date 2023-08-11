package androidx.compose.foundation;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSystemGestureExclusion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt$excludeFromSystemGestureQ$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,162:1\n62#2,5:163\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt$excludeFromSystemGestureQ$1\n*L\n83#1:163,5\n*E\n"})
/* compiled from: SystemGestureExclusion.kt */
public final class SystemGestureExclusionKt$excludeFromSystemGestureQ$1 extends C12777p implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ ExcludeFromSystemGestureModifier $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SystemGestureExclusionKt$excludeFromSystemGestureQ$1(ExcludeFromSystemGestureModifier excludeFromSystemGestureModifier) {
        super(1);
        this.$modifier = excludeFromSystemGestureModifier;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
        return new C0388x2a50f3d9(this.$modifier);
    }
}
