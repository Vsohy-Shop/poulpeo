package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@ExperimentalFoundationApi
/* compiled from: LazyLayoutItemContentFactory.kt */
public final class LazyLayoutItemContentFactory {
    private final C13074a<LazyLayoutItemProvider> itemProvider;
    private final Map<Object, CachedItemContent> lambdasCache = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final SaveableStateHolder saveableStateHolder;

    @SourceDebugExtension({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n76#2:113\n102#2,2:114\n1#3:116\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n*L\n83#1:113\n83#1:114,2\n*E\n"})
    /* compiled from: LazyLayoutItemContentFactory.kt */
    private final class CachedItemContent {
        /* access modifiers changed from: private */
        public C13088o<? super Composer, ? super Integer, C11921v> _content;
        private final Object key;
        private final MutableState lastKnownIndex$delegate;
        final /* synthetic */ LazyLayoutItemContentFactory this$0;
        private final Object type;

        public CachedItemContent(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, int i, Object obj, Object obj2) {
            C12775o.m28639i(obj, "key");
            this.this$0 = lazyLayoutItemContentFactory;
            this.key = obj;
            this.type = obj2;
            this.lastKnownIndex$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), (SnapshotMutationPolicy) null, 2, (Object) null);
        }

        private final C13088o<Composer, Integer, C11921v> createContentLambda() {
            return ComposableLambdaKt.composableLambdaInstance(1403994769, true, new C0550xbaaa624f(this.this$0, this));
        }

        /* access modifiers changed from: private */
        public final void setLastKnownIndex(int i) {
            this.lastKnownIndex$delegate.setValue(Integer.valueOf(i));
        }

        public final C13088o<Composer, Integer, C11921v> getContent() {
            C13088o<? super Composer, ? super Integer, C11921v> oVar = this._content;
            if (oVar != null) {
                return oVar;
            }
            C13088o<Composer, Integer, C11921v> createContentLambda = createContentLambda();
            this._content = createContentLambda;
            return createContentLambda;
        }

        public final Object getKey() {
            return this.key;
        }

        public final int getLastKnownIndex() {
            return ((Number) this.lastKnownIndex$delegate.getValue()).intValue();
        }

        public final Object getType() {
            return this.type;
        }
    }

    public LazyLayoutItemContentFactory(SaveableStateHolder saveableStateHolder2, C13074a<? extends LazyLayoutItemProvider> aVar) {
        C12775o.m28639i(saveableStateHolder2, "saveableStateHolder");
        C12775o.m28639i(aVar, "itemProvider");
        this.saveableStateHolder = saveableStateHolder2;
        this.itemProvider = aVar;
    }

    public final C13088o<Composer, Integer, C11921v> getContent(int i, Object obj) {
        C12775o.m28639i(obj, "key");
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        Object contentType = this.itemProvider.invoke().getContentType(i);
        if (cachedItemContent != null && cachedItemContent.getLastKnownIndex() == i && C12775o.m28634d(cachedItemContent.getType(), contentType)) {
            return cachedItemContent.getContent();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(this, i, obj, contentType);
        this.lambdasCache.put(obj, cachedItemContent2);
        return cachedItemContent2.getContent();
    }

    public final Object getContentType(Object obj) {
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.getType();
        }
        LazyLayoutItemProvider invoke = this.itemProvider.invoke();
        Integer num = invoke.getKeyToIndexMap().get(obj);
        if (num != null) {
            return invoke.getContentType(num.intValue());
        }
        return null;
    }

    public final C13074a<LazyLayoutItemProvider> getItemProvider() {
        return this.itemProvider;
    }
}
