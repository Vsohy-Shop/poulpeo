package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

/* compiled from: TransformableState.kt */
public interface TransformableState {

    /* compiled from: TransformableState.kt */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object transform$default(TransformableState transformableState, MutatePriority mutatePriority, C13088o oVar, C12074d dVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return transformableState.transform(mutatePriority, oVar, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transform");
    }

    boolean isTransformInProgress();

    Object transform(MutatePriority mutatePriority, C13088o<? super TransformScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar);
}
