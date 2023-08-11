package androidx.compose.foundation.relocation;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.modifier.ModifierLocalProvider;
import androidx.compose.p002ui.modifier.ProvidableModifierLocal;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p466yf.C13999m0;

@SourceDebugExtension({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
/* compiled from: BringIntoViewResponder.kt */
final class BringIntoViewResponderModifier extends BringIntoViewChildModifier implements ModifierLocalProvider<BringIntoViewParent>, BringIntoViewParent {
    public BringIntoViewResponder responder;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderModifier(BringIntoViewParent bringIntoViewParent) {
        super(bringIntoViewParent);
        C12775o.m28639i(bringIntoViewParent, "defaultParent");
    }

    /* access modifiers changed from: private */
    public static final Rect bringChildIntoView$localRect(BringIntoViewResponderModifier bringIntoViewResponderModifier, LayoutCoordinates layoutCoordinates, C13074a<Rect> aVar) {
        Rect invoke;
        LayoutCoordinates layoutCoordinates2 = bringIntoViewResponderModifier.getLayoutCoordinates();
        if (layoutCoordinates2 == null) {
            return null;
        }
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates == null || (invoke = aVar.invoke()) == null) {
            return null;
        }
        return BringIntoViewResponderKt.localRectOf(layoutCoordinates2, layoutCoordinates, invoke);
    }

    public Object bringChildIntoView(LayoutCoordinates layoutCoordinates, C13074a<Rect> aVar, C12074d<? super C11921v> dVar) {
        Object e = C13999m0.m32451e(new BringIntoViewResponderModifier$bringChildIntoView$2(this, layoutCoordinates, aVar, new BringIntoViewResponderModifier$bringChildIntoView$parentRect$1(this, layoutCoordinates, aVar), (C12074d<? super BringIntoViewResponderModifier$bringChildIntoView$2>) null), dVar);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }

    public ProvidableModifierLocal<BringIntoViewParent> getKey() {
        return BringIntoViewKt.getModifierLocalBringIntoViewParent();
    }

    public final BringIntoViewResponder getResponder() {
        BringIntoViewResponder bringIntoViewResponder = this.responder;
        if (bringIntoViewResponder != null) {
            return bringIntoViewResponder;
        }
        C12775o.m28656z("responder");
        return null;
    }

    public BringIntoViewParent getValue() {
        return this;
    }

    public final void setResponder(BringIntoViewResponder bringIntoViewResponder) {
        C12775o.m28639i(bringIntoViewResponder, "<set-?>");
        this.responder = bringIntoViewResponder;
    }
}
