package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,161:1\n62#2,5:162\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1\n*L\n52#1:162,5\n*E\n"})
/* compiled from: LazyLayoutPinnableItem.kt */
final class LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1 extends C12777p implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ LazyLayoutPinnableItem $pinnableItem;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1(LazyLayoutPinnableItem lazyLayoutPinnableItem) {
        super(1);
        this.$pinnableItem = lazyLayoutPinnableItem;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
        return new C0553x1d4839cd(this.$pinnableItem);
    }
}
