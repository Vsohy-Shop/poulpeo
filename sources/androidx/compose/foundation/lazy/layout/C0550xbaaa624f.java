package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1 */
/* compiled from: LazyLayoutItemContentFactory.kt */
final class C0550xbaaa624f extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ LazyLayoutItemContentFactory this$0;
    final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0550xbaaa624f(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
        super(2);
        this.this$0 = lazyLayoutItemContentFactory;
        this.this$1 = cachedItemContent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(Composer composer, int i) {
        final int i2;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1403994769, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:89)");
            }
            final LazyLayoutItemProvider invoke = this.this$0.getItemProvider().invoke();
            Integer num = invoke.getKeyToIndexMap().get(this.this$1.getKey());
            if (num != null) {
                this.this$1.setLastKnownIndex(num.intValue());
                i2 = num.intValue();
            } else {
                i2 = this.this$1.getLastKnownIndex();
            }
            composer.startReplaceableGroup(-715770513);
            if (i2 < invoke.getItemCount()) {
                Object key = invoke.getKey(i2);
                if (C12775o.m28634d(key, this.this$1.getKey())) {
                    this.this$0.saveableStateHolder.SaveableStateProvider(key, ComposableLambdaKt.composableLambda(composer, -1238863364, true, new C13088o<Composer, Integer, C11921v>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return C11921v.f18618a;
                        }

                        @Composable
                        public final void invoke(Composer composer, int i) {
                            if ((i & 11) != 2 || !composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1238863364, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous>.<anonymous> (LazyLayoutItemContentFactory.kt:97)");
                                }
                                invoke.Item(i2, composer, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer.skipToGroupEnd();
                        }
                    }), composer, 568);
                }
            }
            composer.endReplaceableGroup();
            Object key2 = this.this$1.getKey();
            final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.this$1;
            EffectsKt.DisposableEffect(key2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new Function1<DisposableEffectScope, DisposableEffectResult>() {
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
                    return new C0549x1f642295(cachedItemContent);
                }
            }, composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
