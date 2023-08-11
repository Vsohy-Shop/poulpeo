package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.jvm.functions.Function1;

@ExperimentalFoundationApi
/* compiled from: LazyLayoutItemProvider.kt */
public interface LazyLayoutIntervalContent {
    Function1<Integer, Object> getKey() {
        return null;
    }

    Function1<Integer, Object> getType() {
        return LazyLayoutIntervalContent$type$1.INSTANCE;
    }
}
