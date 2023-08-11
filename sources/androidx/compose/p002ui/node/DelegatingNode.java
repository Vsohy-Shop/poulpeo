package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@SourceDebugExtension({"SMAP\nDelegatingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,101:1\n76#1,6:102\n76#1,6:108\n76#1,6:114\n76#1,6:120\n*S KotlinDebug\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n35#1:102,6\n85#1:108,6\n92#1:114,6\n98#1:120,6\n*E\n"})
/* renamed from: androidx.compose.ui.node.DelegatingNode */
/* compiled from: DelegatingNode.kt */
public abstract class DelegatingNode extends Modifier.Node {
    public static final int $stable = 8;
    private Modifier.Node delegate;

    private final void addDelegate(Modifier.Node node) {
        Modifier.Node node2 = this.delegate;
        if (node2 != null) {
            node.setParent$ui_release(node2);
        }
        this.delegate = node;
    }

    private final void forEachDelegate(Function1<? super Modifier.Node, C11921v> function1) {
        for (Modifier.Node node = this.delegate; node != null; node = node.getParent$ui_release()) {
            function1.invoke(node);
        }
    }

    public void attach$ui_release() {
        super.attach$ui_release();
        for (Modifier.Node node = this.delegate; node != null; node = node.getParent$ui_release()) {
            node.updateCoordinator$ui_release(getCoordinator$ui_release());
            node.attach$ui_release();
        }
    }

    public final <T extends Modifier.Node> T delegated(C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "fn");
        Modifier.Node node = getNode();
        T t = (Modifier.Node) aVar.invoke();
        t.setAsDelegateTo$ui_release(node);
        if (isAttached()) {
            updateCoordinator$ui_release(node.getCoordinator$ui_release());
            t.attach$ui_release();
        }
        addDelegate(t);
        return t;
    }

    public void detach$ui_release() {
        for (Modifier.Node node = this.delegate; node != null; node = node.getParent$ui_release()) {
            node.detach$ui_release();
        }
        super.detach$ui_release();
    }

    public void reset$ui_release() {
        super.reset$ui_release();
        for (Modifier.Node node = this.delegate; node != null; node = node.getParent$ui_release()) {
            node.reset$ui_release();
        }
    }

    public void updateCoordinator$ui_release(NodeCoordinator nodeCoordinator) {
        super.updateCoordinator$ui_release(nodeCoordinator);
        for (Modifier.Node node = this.delegate; node != null; node = node.getParent$ui_release()) {
            node.updateCoordinator$ui_release(nodeCoordinator);
        }
    }
}
