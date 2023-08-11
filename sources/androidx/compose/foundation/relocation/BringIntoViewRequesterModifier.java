package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;

@ExperimentalFoundationApi
/* compiled from: BringIntoViewRequester.kt */
final class BringIntoViewRequesterModifier extends BringIntoViewChildModifier {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterModifier(BringIntoViewParent bringIntoViewParent) {
        super(bringIntoViewParent);
        C12775o.m28639i(bringIntoViewParent, "defaultParent");
    }

    public final Object bringIntoView(Rect rect, C12074d<? super C11921v> dVar) {
        BringIntoViewParent parent = getParent();
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return C11921v.f18618a;
        }
        Object bringChildIntoView = parent.bringChildIntoView(layoutCoordinates, new BringIntoViewRequesterModifier$bringIntoView$2(rect, this), dVar);
        if (bringChildIntoView == C12150d.m26492c()) {
            return bringChildIntoView;
        }
        return C11921v.f18618a;
    }
}
