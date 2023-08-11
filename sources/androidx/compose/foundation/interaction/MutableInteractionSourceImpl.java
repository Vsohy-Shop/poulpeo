package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import p308ag.C10886a;
import p314bg.C11024t;
import p314bg.C11033z;
import p336ef.C11921v;
import p355hf.C12074d;

@Stable
/* compiled from: InteractionSource.kt */
final class MutableInteractionSourceImpl implements MutableInteractionSource {
    private final C11024t<Interaction> interactions = C11033z.m23722b(0, 16, C10886a.DROP_OLDEST, 1, (Object) null);

    public Object emit(Interaction interaction, C12074d<? super C11921v> dVar) {
        Object emit = getInteractions().emit(interaction, dVar);
        if (emit == C12150d.m26492c()) {
            return emit;
        }
        return C11921v.f18618a;
    }

    public boolean tryEmit(Interaction interaction) {
        C12775o.m28639i(interaction, "interaction");
        return getInteractions().mo46041e(interaction);
    }

    public C11024t<Interaction> getInteractions() {
        return this.interactions;
    }
}
