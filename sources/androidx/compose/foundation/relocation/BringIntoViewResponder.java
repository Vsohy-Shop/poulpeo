package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p002ui.geometry.Rect;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;

@ExperimentalFoundationApi
/* compiled from: BringIntoViewResponder.kt */
public interface BringIntoViewResponder {
    @ExperimentalFoundationApi
    Object bringChildIntoView(C13074a<Rect> aVar, C12074d<? super C11921v> dVar);

    @ExperimentalFoundationApi
    Rect calculateRectForParent(Rect rect);
}
