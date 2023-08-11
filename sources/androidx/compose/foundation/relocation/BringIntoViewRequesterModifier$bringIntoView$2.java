package androidx.compose.foundation.relocation;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.unit.IntSizeKt;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: BringIntoViewRequester.kt */
final class BringIntoViewRequesterModifier$bringIntoView$2 extends C12777p implements C13074a<Rect> {
    final /* synthetic */ Rect $rect;
    final /* synthetic */ BringIntoViewRequesterModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BringIntoViewRequesterModifier$bringIntoView$2(Rect rect, BringIntoViewRequesterModifier bringIntoViewRequesterModifier) {
        super(0);
        this.$rect = rect;
        this.this$0 = bringIntoViewRequesterModifier;
    }

    public final Rect invoke() {
        Rect rect = this.$rect;
        if (rect != null) {
            return rect;
        }
        LayoutCoordinates layoutCoordinates = this.this$0.getLayoutCoordinates();
        if (layoutCoordinates != null) {
            return SizeKt.m35512toRectuvyYCjk(IntSizeKt.m38638toSizeozmzZPI(layoutCoordinates.m37341getSizeYbymL2g()));
        }
        return null;
    }
}
