package androidx.compose.animation;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$4$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0318x51a198c4 implements DisposableEffectResult {
    final /* synthetic */ SnapshotStateList $currentlyVisible$inlined;
    final /* synthetic */ AnimatedContentScope $rootScope$inlined;
    final /* synthetic */ Object $stateForContent$inlined;

    public C0318x51a198c4(SnapshotStateList snapshotStateList, Object obj, AnimatedContentScope animatedContentScope) {
        this.$currentlyVisible$inlined = snapshotStateList;
        this.$stateForContent$inlined = obj;
        this.$rootScope$inlined = animatedContentScope;
    }

    public void dispose() {
        this.$currentlyVisible$inlined.remove(this.$stateForContent$inlined);
        this.$rootScope$inlined.getTargetSizeMap$animation_release().remove(this.$stateForContent$inlined);
    }
}
