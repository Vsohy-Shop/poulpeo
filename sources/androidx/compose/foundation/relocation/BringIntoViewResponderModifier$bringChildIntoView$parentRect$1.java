package androidx.compose.foundation.relocation;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderModifier$bringChildIntoView$parentRect$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
/* compiled from: BringIntoViewResponder.kt */
final class BringIntoViewResponderModifier$bringChildIntoView$parentRect$1 extends C12777p implements C13074a<Rect> {
    final /* synthetic */ C13074a<Rect> $boundsProvider;
    final /* synthetic */ LayoutCoordinates $childCoordinates;
    final /* synthetic */ BringIntoViewResponderModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BringIntoViewResponderModifier$bringChildIntoView$parentRect$1(BringIntoViewResponderModifier bringIntoViewResponderModifier, LayoutCoordinates layoutCoordinates, C13074a<Rect> aVar) {
        super(0);
        this.this$0 = bringIntoViewResponderModifier;
        this.$childCoordinates = layoutCoordinates;
        this.$boundsProvider = aVar;
    }

    public final Rect invoke() {
        Rect access$bringChildIntoView$localRect = BringIntoViewResponderModifier.bringChildIntoView$localRect(this.this$0, this.$childCoordinates, this.$boundsProvider);
        if (access$bringChildIntoView$localRect != null) {
            return this.this$0.getResponder().calculateRectForParent(access$bringChildIntoView$localRect);
        }
        return null;
    }
}
