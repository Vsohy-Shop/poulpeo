package androidx.compose.p002ui.node;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.DrawCacheModifier;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.node.BackwardsCompatNode$updateDrawCache$1 */
/* compiled from: BackwardsCompatNode.kt */
final class BackwardsCompatNode$updateDrawCache$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ Modifier.Element $element;
    final /* synthetic */ BackwardsCompatNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BackwardsCompatNode$updateDrawCache$1(Modifier.Element element, BackwardsCompatNode backwardsCompatNode) {
        super(0);
        this.$element = element;
        this.this$0 = backwardsCompatNode;
    }

    public final void invoke() {
        ((DrawCacheModifier) this.$element).onBuildCache(this.this$0);
    }
}
