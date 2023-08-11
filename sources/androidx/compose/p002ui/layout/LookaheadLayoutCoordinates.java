package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.geometry.Offset;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.layout.LookaheadLayoutCoordinates */
/* compiled from: LookaheadLayoutCoordinates.kt */
public interface LookaheadLayoutCoordinates extends LayoutCoordinates {
    /* renamed from: localLookaheadPositionOf-R5De75A$default  reason: not valid java name */
    static /* synthetic */ long m37356localLookaheadPositionOfR5De75A$default(LookaheadLayoutCoordinates lookaheadLayoutCoordinates, LookaheadLayoutCoordinates lookaheadLayoutCoordinates2, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m35438getZeroF1C5BW0();
            }
            return lookaheadLayoutCoordinates.m37357localLookaheadPositionOfR5De75A(lookaheadLayoutCoordinates2, j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-R5De75A");
    }

    /* renamed from: localLookaheadPositionOf-R5De75A  reason: not valid java name */
    long m37357localLookaheadPositionOfR5De75A(LookaheadLayoutCoordinates lookaheadLayoutCoordinates, long j);
}
