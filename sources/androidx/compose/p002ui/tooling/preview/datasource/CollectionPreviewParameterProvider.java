package androidx.compose.p002ui.tooling.preview.datasource;

import androidx.compose.p002ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import kotlin.jvm.internal.C12775o;
import p448vf.C13650g;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.tooling.preview.datasource.CollectionPreviewParameterProvider */
/* compiled from: CollectionPreviewParameterProvider.kt */
public class CollectionPreviewParameterProvider<T> implements PreviewParameterProvider<T> {
    public static final int $stable = 8;
    private final Collection<T> collection;

    public CollectionPreviewParameterProvider(Collection<? extends T> collection2) {
        C12775o.m28639i(collection2, "collection");
        this.collection = collection2;
    }

    public C13650g<T> getValues() {
        return C12686e0.m28213R(this.collection);
    }
}
