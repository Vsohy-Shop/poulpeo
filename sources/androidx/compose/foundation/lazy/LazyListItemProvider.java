package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import java.util.List;

@ExperimentalFoundationApi
/* compiled from: LazyListItemProvider.kt */
public interface LazyListItemProvider extends LazyLayoutItemProvider {
    List<Integer> getHeaderIndexes();

    LazyItemScopeImpl getItemScope();
}
