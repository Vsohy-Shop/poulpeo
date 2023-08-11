package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TextSelectionColors.kt */
public final class TextSelectionColorsKt {
    private static final long DefaultSelectionColor;
    /* access modifiers changed from: private */
    public static final TextSelectionColors DefaultTextSelectionColors;
    private static final ProvidableCompositionLocal<TextSelectionColors> LocalTextSelectionColors = CompositionLocalKt.compositionLocalOf$default((SnapshotMutationPolicy) null, TextSelectionColorsKt$LocalTextSelectionColors$1.INSTANCE, 1, (Object) null);

    static {
        long Color = ColorKt.Color(4282550004L);
        DefaultSelectionColor = Color;
        DefaultTextSelectionColors = new TextSelectionColors(Color, Color.m35670copywmQWz5c$default(Color, 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
    }

    public static final ProvidableCompositionLocal<TextSelectionColors> getLocalTextSelectionColors() {
        return LocalTextSelectionColors;
    }

    @Stable
    private static /* synthetic */ void getDefaultTextSelectionColors$annotations() {
    }
}
