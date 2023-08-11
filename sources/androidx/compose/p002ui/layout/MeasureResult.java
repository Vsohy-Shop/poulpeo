package androidx.compose.p002ui.layout;

import java.util.Map;

/* renamed from: androidx.compose.ui.layout.MeasureResult */
/* compiled from: MeasureResult.kt */
public interface MeasureResult {
    Map<AlignmentLine, Integer> getAlignmentLines();

    int getHeight();

    int getWidth();

    void placeChildren();
}
