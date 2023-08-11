package androidx.compose.foundation.relocation;

import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.OnPlacedModifier;
import androidx.compose.p002ui.modifier.ModifierLocalConsumer;
import androidx.compose.p002ui.modifier.ModifierLocalReadScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBringIntoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoView.kt\nandroidx/compose/foundation/relocation/BringIntoViewChildModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/* compiled from: BringIntoView.kt */
public abstract class BringIntoViewChildModifier implements ModifierLocalConsumer, OnPlacedModifier {
    private final BringIntoViewParent defaultParent;
    private LayoutCoordinates layoutCoordinates;
    private BringIntoViewParent localParent;

    public BringIntoViewChildModifier(BringIntoViewParent bringIntoViewParent) {
        C12775o.m28639i(bringIntoViewParent, "defaultParent");
        this.defaultParent = bringIntoViewParent;
    }

    /* access modifiers changed from: protected */
    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates2 = this.layoutCoordinates;
        if (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) {
            return null;
        }
        return layoutCoordinates2;
    }

    /* access modifiers changed from: protected */
    public final BringIntoViewParent getParent() {
        BringIntoViewParent bringIntoViewParent = this.localParent;
        if (bringIntoViewParent == null) {
            return this.defaultParent;
        }
        return bringIntoViewParent;
    }

    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        C12775o.m28639i(modifierLocalReadScope, "scope");
        this.localParent = (BringIntoViewParent) modifierLocalReadScope.getCurrent(BringIntoViewKt.getModifierLocalBringIntoViewParent());
    }

    public void onPlaced(LayoutCoordinates layoutCoordinates2) {
        C12775o.m28639i(layoutCoordinates2, "coordinates");
        this.layoutCoordinates = layoutCoordinates2;
    }
}
