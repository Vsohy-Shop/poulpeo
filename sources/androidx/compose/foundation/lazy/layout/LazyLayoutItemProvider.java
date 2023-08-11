package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import java.util.Map;

@ExperimentalFoundationApi
@Stable
/* compiled from: LazyLayoutItemProvider.kt */
public interface LazyLayoutItemProvider {
    @Composable
    void Item(int i, Composer composer, int i2);

    Object getContentType(int i) {
        return null;
    }

    int getItemCount();

    Object getKey(int i) {
        return Lazy_androidKt.getDefaultLazyLayoutKey(i);
    }

    Map<Object, Integer> getKeyToIndexMap() {
        return C12716r0.m28416g();
    }
}
