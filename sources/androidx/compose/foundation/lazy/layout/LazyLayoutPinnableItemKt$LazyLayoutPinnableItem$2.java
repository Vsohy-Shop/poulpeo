package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: LazyLayoutPinnableItem.kt */
final class LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ int $index;
    final /* synthetic */ Object $key;
    final /* synthetic */ LazyLayoutPinnedItemList $pinnedItemList;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2(Object obj, int i, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i2) {
        super(2);
        this.$key = obj;
        this.$index = i;
        this.$pinnedItemList = lazyLayoutPinnedItemList;
        this.$content = oVar;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(this.$key, this.$index, this.$pinnedItemList, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
