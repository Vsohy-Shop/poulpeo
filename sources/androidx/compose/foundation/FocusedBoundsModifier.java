package androidx.compose.foundation;

import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.OnGloballyPositionedModifier;
import androidx.compose.p002ui.modifier.ModifierLocalConsumer;
import androidx.compose.p002ui.modifier.ModifierLocalReadScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nFocusedBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
/* compiled from: FocusedBounds.kt */
public final class FocusedBoundsModifier implements ModifierLocalConsumer, OnGloballyPositionedModifier {
    private LayoutCoordinates layoutCoordinates;
    private Function1<? super LayoutCoordinates, C11921v> observer;

    private final void notifyObserverWhenAttached() {
        Function1<? super LayoutCoordinates, C11921v> function1;
        LayoutCoordinates layoutCoordinates2 = this.layoutCoordinates;
        if (layoutCoordinates2 != null) {
            C12775o.m28636f(layoutCoordinates2);
            if (layoutCoordinates2.isAttached() && (function1 = this.observer) != null) {
                function1.invoke(this.layoutCoordinates);
            }
        }
    }

    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates2) {
        C12775o.m28639i(layoutCoordinates2, "coordinates");
        this.layoutCoordinates = layoutCoordinates2;
        if (layoutCoordinates2.isAttached()) {
            notifyObserverWhenAttached();
            return;
        }
        Function1<? super LayoutCoordinates, C11921v> function1 = this.observer;
        if (function1 != null) {
            function1.invoke(null);
        }
    }

    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        Function1<? super LayoutCoordinates, C11921v> function1;
        C12775o.m28639i(modifierLocalReadScope, "scope");
        Function1<? super LayoutCoordinates, C11921v> function12 = (Function1) modifierLocalReadScope.getCurrent(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        if (function12 == null && (function1 = this.observer) != null) {
            function1.invoke(null);
        }
        this.observer = function12;
    }
}
