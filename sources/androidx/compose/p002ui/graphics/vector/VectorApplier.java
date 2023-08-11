package androidx.compose.p002ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorApplier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.VectorApplier */
/* compiled from: VectorCompose.kt */
public final class VectorApplier extends AbstractApplier<VNode> {
    public static final int $stable = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorApplier(VNode vNode) {
        super(vNode);
        C12775o.m28639i(vNode, "root");
    }

    private final GroupComponent asGroup(VNode vNode) {
        if (vNode instanceof GroupComponent) {
            return (GroupComponent) vNode;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    public void insertBottomUp(int i, VNode vNode) {
        C12775o.m28639i(vNode, "instance");
    }

    public void move(int i, int i2, int i3) {
        asGroup((VNode) getCurrent()).move(i, i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onClear() {
        GroupComponent asGroup = asGroup((VNode) getRoot());
        asGroup.remove(0, asGroup.getNumChildren());
    }

    public void remove(int i, int i2) {
        asGroup((VNode) getCurrent()).remove(i, i2);
    }

    public void insertTopDown(int i, VNode vNode) {
        C12775o.m28639i(vNode, "instance");
        asGroup((VNode) getCurrent()).insertAt(i, vNode);
    }
}
