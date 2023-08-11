package androidx.compose.p002ui.layout;

import androidx.compose.runtime.Stable;

@Stable
/* renamed from: androidx.compose.ui.layout.PinnableContainer */
/* compiled from: PinnableContainer.kt */
public interface PinnableContainer {

    /* renamed from: androidx.compose.ui.layout.PinnableContainer$PinnedHandle */
    /* compiled from: PinnableContainer.kt */
    public interface PinnedHandle {
        void release();
    }

    PinnedHandle pin();
}
