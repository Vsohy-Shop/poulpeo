package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.LookaheadDelegate;
import androidx.compose.p002ui.node.NodeCoordinator;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nLookaheadLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutScopeImpl$onPlaced$2$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LookaheadLayoutScopeImpl$onPlaced$2$1$1 */
/* compiled from: LookaheadLayout.kt */
final class LookaheadLayoutScopeImpl$onPlaced$2$1$1 extends C12777p implements C13074a<LookaheadLayoutCoordinates> {
    final /* synthetic */ LookaheadLayoutScopeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LookaheadLayoutScopeImpl$onPlaced$2$1$1(LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl) {
        super(0);
        this.this$0 = lookaheadLayoutScopeImpl;
    }

    public final LookaheadLayoutCoordinates invoke() {
        NodeCoordinator root = this.this$0.getRoot();
        if (root != null) {
            LookaheadDelegate lookaheadDelegate$ui_release = root.getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate$ui_release);
            LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinates = lookaheadDelegate$ui_release.getLookaheadLayoutCoordinates();
            if (lookaheadLayoutCoordinates != null) {
                return lookaheadLayoutCoordinates;
            }
        }
        throw new IllegalStateException("Lookahead root has not been set up yet".toString());
    }
}
