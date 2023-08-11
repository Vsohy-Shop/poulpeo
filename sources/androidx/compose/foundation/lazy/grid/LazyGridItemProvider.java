package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;

@ExperimentalFoundationApi
/* compiled from: LazyGridItemProvider.kt */
public interface LazyGridItemProvider extends LazyLayoutItemProvider {
    boolean getHasCustomSpans();

    /* renamed from: getSpan-_-orMbw  reason: not valid java name */
    long m33466getSpan_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i);

    LazyGridSpanLayoutProvider getSpanLayoutProvider();
}
