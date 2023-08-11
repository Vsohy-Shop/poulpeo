package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.layout.LookaheadOnPlacedModifier */
/* compiled from: LookaheadLayout.kt */
public final class LookaheadOnPlacedModifier implements Modifier.Element {
    private final C13088o<LookaheadLayoutCoordinates, LookaheadLayoutCoordinates, C11921v> callback;
    private final C13074a<LookaheadLayoutCoordinates> rootCoordinates;

    public LookaheadOnPlacedModifier(C13088o<? super LookaheadLayoutCoordinates, ? super LookaheadLayoutCoordinates, C11921v> oVar, C13074a<? extends LookaheadLayoutCoordinates> aVar) {
        C12775o.m28639i(oVar, "callback");
        C12775o.m28639i(aVar, "rootCoordinates");
        this.callback = oVar;
        this.rootCoordinates = aVar;
    }

    public final C13088o<LookaheadLayoutCoordinates, LookaheadLayoutCoordinates, C11921v> getCallback() {
        return this.callback;
    }

    public final C13074a<LookaheadLayoutCoordinates> getRootCoordinates() {
        return this.rootCoordinates;
    }

    public final void onPlaced(LookaheadLayoutCoordinates lookaheadLayoutCoordinates) {
        C12775o.m28639i(lookaheadLayoutCoordinates, "coordinates");
        this.callback.invoke(this.rootCoordinates.invoke(), lookaheadLayoutCoordinates);
    }
}
