package androidx.compose.material;

import java.util.Map;

@ExperimentalMaterialApi
/* compiled from: SwipeableV2.kt */
public interface AnchorChangeHandler<T> {
    void onAnchorsChanged(T t, Map<T, Float> map, Map<T, Float> map2);
}
