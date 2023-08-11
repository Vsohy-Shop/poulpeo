package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;

/* compiled from: ContentAlpha.kt */
public final class ContentAlphaKt {
    private static final ProvidableCompositionLocal<Float> LocalContentAlpha = CompositionLocalKt.compositionLocalOf$default((SnapshotMutationPolicy) null, ContentAlphaKt$LocalContentAlpha$1.INSTANCE, 1, (Object) null);

    public static final ProvidableCompositionLocal<Float> getLocalContentAlpha() {
        return LocalContentAlpha;
    }
}
