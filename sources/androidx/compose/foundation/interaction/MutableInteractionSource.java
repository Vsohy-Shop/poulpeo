package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import p336ef.C11921v;
import p355hf.C12074d;

@Stable
/* compiled from: InteractionSource.kt */
public interface MutableInteractionSource extends InteractionSource {
    Object emit(Interaction interaction, C12074d<? super C11921v> dVar);

    boolean tryEmit(Interaction interaction);
}
