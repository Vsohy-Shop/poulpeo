package androidx.compose.foundation;

import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.modifier.ModifierLocalConsumer;
import androidx.compose.p002ui.modifier.ModifierLocalProvider;
import androidx.compose.p002ui.modifier.ModifierLocalReadScope;
import androidx.compose.p002ui.modifier.ProvidableModifierLocal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nFocusedBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsObserverModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
/* compiled from: FocusedBounds.kt */
final class FocusedBoundsObserverModifier implements ModifierLocalConsumer, ModifierLocalProvider<Function1<? super LayoutCoordinates, ? extends C11921v>>, Function1<LayoutCoordinates, C11921v> {
    private final Function1<LayoutCoordinates, C11921v> handler;
    private LayoutCoordinates lastBounds;
    private Function1<? super LayoutCoordinates, C11921v> parent;

    public FocusedBoundsObserverModifier(Function1<? super LayoutCoordinates, C11921v> function1) {
        C12775o.m28639i(function1, "handler");
        this.handler = function1;
    }

    public ProvidableModifierLocal<Function1<LayoutCoordinates, C11921v>> getKey() {
        return FocusedBoundsKt.getModifierLocalFocusedBoundsObserver();
    }

    public Function1<LayoutCoordinates, C11921v> getValue() {
        return this;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return C11921v.f18618a;
    }

    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        C12775o.m28639i(modifierLocalReadScope, "scope");
        Function1<? super LayoutCoordinates, C11921v> function1 = (Function1) modifierLocalReadScope.getCurrent(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        if (!C12775o.m28634d(function1, this.parent)) {
            this.parent = function1;
        }
    }

    public void invoke(LayoutCoordinates layoutCoordinates) {
        this.lastBounds = layoutCoordinates;
        this.handler.invoke(layoutCoordinates);
        Function1<? super LayoutCoordinates, C11921v> function1 = this.parent;
        if (function1 != null) {
            function1.invoke(layoutCoordinates);
        }
    }
}
