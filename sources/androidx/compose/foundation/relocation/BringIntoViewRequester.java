package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p002ui.geometry.Rect;
import p336ef.C11921v;
import p355hf.C12074d;

@ExperimentalFoundationApi
/* compiled from: BringIntoViewRequester.kt */
public interface BringIntoViewRequester {
    static /* synthetic */ Object bringIntoView$default(BringIntoViewRequester bringIntoViewRequester, Rect rect, C12074d dVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                rect = null;
            }
            return bringIntoViewRequester.bringIntoView(rect, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
    }

    Object bringIntoView(Rect rect, C12074d<? super C11921v> dVar);
}
