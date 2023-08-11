package androidx.compose.foundation.lazy.layout;

import androidx.compose.p002ui.semantics.CollectionInfo;
import p336ef.C11921v;
import p355hf.C12074d;

/* compiled from: LazyLayoutSemantics.kt */
public interface LazyLayoutSemanticState {
    Object animateScrollBy(float f, C12074d<? super C11921v> dVar);

    CollectionInfo collectionInfo();

    boolean getCanScrollForward();

    float getCurrentPosition();

    Object scrollToItem(int i, C12074d<? super C11921v> dVar);
}
