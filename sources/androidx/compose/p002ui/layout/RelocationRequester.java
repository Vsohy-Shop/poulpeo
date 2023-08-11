package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import p336ef.C11921v;
import p355hf.C12074d;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.layout.RelocationRequester */
/* compiled from: RelocationRequester.kt */
public final class RelocationRequester {
    public static final int $stable = 0;

    public static /* synthetic */ Object bringIntoView$default(RelocationRequester relocationRequester, Rect rect, C12074d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = null;
        }
        return relocationRequester.bringIntoView(rect, dVar);
    }

    public final Object bringIntoView(Rect rect, C12074d<? super C11921v> dVar) {
        return C11921v.f18618a;
    }
}
