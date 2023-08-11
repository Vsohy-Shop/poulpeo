package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.TextRangeKt;

/* renamed from: androidx.compose.ui.text.input.EditingBufferKt */
/* compiled from: EditingBuffer.kt */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M  reason: not valid java name */
    public static final long m38118updateRangeAfterDeletepWDy79M(long j, long j2) {
        int i;
        int r0 = TextRange.m37973getMinimpl(j);
        int r1 = TextRange.m37972getMaximpl(j);
        if (TextRange.m37977intersects5zctL8(j2, j)) {
            if (TextRange.m37965contains5zctL8(j2, j)) {
                r0 = TextRange.m37973getMinimpl(j2);
                r1 = r0;
            } else if (TextRange.m37965contains5zctL8(j, j2)) {
                i = TextRange.m37971getLengthimpl(j2);
            } else if (TextRange.m37966containsimpl(j2, r0)) {
                r0 = TextRange.m37973getMinimpl(j2);
                i = TextRange.m37971getLengthimpl(j2);
            } else {
                r1 = TextRange.m37973getMinimpl(j2);
            }
            return TextRangeKt.TextRange(r0, r1);
        }
        if (r1 > TextRange.m37973getMinimpl(j2)) {
            r0 -= TextRange.m37971getLengthimpl(j2);
            i = TextRange.m37971getLengthimpl(j2);
        }
        return TextRangeKt.TextRange(r0, r1);
        r1 -= i;
        return TextRangeKt.TextRange(r0, r1);
    }
}
