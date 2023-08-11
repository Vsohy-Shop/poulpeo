package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nObserverNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserverNode.kt\nandroidx/compose/ui/node/ObserverNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* renamed from: androidx.compose.ui.node.ObserverNodeKt */
/* compiled from: ObserverNode.kt */
public final class ObserverNodeKt {
    @ExperimentalComposeUiApi
    public static final <T extends Modifier.Node & ObserverNode> void observeReads(T t, C13074a<C11921v> aVar) {
        C12775o.m28639i(t, "<this>");
        C12775o.m28639i(aVar, "block");
        ModifierNodeOwnerScope ownerScope$ui_release = t.getOwnerScope$ui_release();
        if (ownerScope$ui_release == null) {
            ownerScope$ui_release = new ModifierNodeOwnerScope((ObserverNode) t);
            t.setOwnerScope$ui_release(ownerScope$ui_release);
        }
        DelegatableNodeKt.requireOwner(t).getSnapshotObserver().observeReads$ui_release(ownerScope$ui_release, ModifierNodeOwnerScope.Companion.getOnObserveReadsChanged$ui_release(), aVar);
    }
}
