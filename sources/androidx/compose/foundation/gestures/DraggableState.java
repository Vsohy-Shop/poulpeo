package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

/* compiled from: Draggable.kt */
public interface DraggableState {

    /* compiled from: Draggable.kt */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object drag$default(DraggableState draggableState, MutatePriority mutatePriority, C13088o oVar, C12074d dVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return draggableState.drag(mutatePriority, oVar, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
    }

    void dispatchRawDelta(float f);

    Object drag(MutatePriority mutatePriority, C13088o<? super DragScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar);
}
