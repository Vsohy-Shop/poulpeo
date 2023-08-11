package androidx.compose.p002ui;

import androidx.compose.p002ui.node.DelegatableNode;
import androidx.compose.p002ui.node.DelegatableNodeKt;
import androidx.compose.p002ui.node.ModifierNodeOwnerScope;
import androidx.compose.p002ui.node.NodeCoordinator;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@Stable
/* renamed from: androidx.compose.ui.Modifier */
/* compiled from: Modifier.kt */
public interface Modifier {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: androidx.compose.ui.Modifier$Companion */
    /* compiled from: Modifier.kt */
    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public boolean all(Function1<? super Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return true;
        }

        public boolean any(Function1<? super Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return false;
        }

        public <R> R foldIn(R r, C13088o<? super R, ? super Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return r;
        }

        public <R> R foldOut(R r, C13088o<? super Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return r;
        }

        public Modifier then(Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return modifier;
        }

        public String toString() {
            return "Modifier";
        }
    }

    /* renamed from: androidx.compose.ui.Modifier$DefaultImpls */
    /* compiled from: Modifier.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static Modifier then(Modifier modifier, Modifier modifier2) {
            C12775o.m28639i(modifier2, "other");
            return Modifier.super.then(modifier2);
        }
    }

    /* renamed from: androidx.compose.ui.Modifier$Element */
    /* compiled from: Modifier.kt */
    public interface Element extends Modifier {

        /* renamed from: androidx.compose.ui.Modifier$Element$DefaultImpls */
        /* compiled from: Modifier.kt */
        public static final class DefaultImpls {
            @Deprecated
            public static boolean all(Element element, Function1<? super Element, Boolean> function1) {
                C12775o.m28639i(function1, "predicate");
                return Element.super.all(function1);
            }

            @Deprecated
            public static boolean any(Element element, Function1<? super Element, Boolean> function1) {
                C12775o.m28639i(function1, "predicate");
                return Element.super.any(function1);
            }

            @Deprecated
            public static <R> R foldIn(Element element, R r, C13088o<? super R, ? super Element, ? extends R> oVar) {
                C12775o.m28639i(oVar, "operation");
                return Element.super.foldIn(r, oVar);
            }

            @Deprecated
            public static <R> R foldOut(Element element, R r, C13088o<? super Element, ? super R, ? extends R> oVar) {
                C12775o.m28639i(oVar, "operation");
                return Element.super.foldOut(r, oVar);
            }

            @Deprecated
            public static Modifier then(Element element, Modifier modifier) {
                C12775o.m28639i(modifier, "other");
                return Modifier.super.then(modifier);
            }
        }

        boolean all(Function1<? super Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return function1.invoke(this).booleanValue();
        }

        boolean any(Function1<? super Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return function1.invoke(this).booleanValue();
        }

        <R> R foldIn(R r, C13088o<? super R, ? super Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return oVar.invoke(r, this);
        }

        <R> R foldOut(R r, C13088o<? super Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return oVar.invoke(this, r);
        }
    }

    boolean all(Function1<? super Element, Boolean> function1);

    boolean any(Function1<? super Element, Boolean> function1);

    <R> R foldIn(R r, C13088o<? super R, ? super Element, ? extends R> oVar);

    <R> R foldOut(R r, C13088o<? super Element, ? super R, ? extends R> oVar);

    Modifier then(Modifier modifier) {
        C12775o.m28639i(modifier, "other");
        if (modifier == Companion) {
            return this;
        }
        return new CombinedModifier(this, modifier);
    }

    @StabilityInferred(parameters = 0)
    @ExperimentalComposeUiApi
    /* renamed from: androidx.compose.ui.Modifier$Node */
    /* compiled from: Modifier.kt */
    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 8;
        private int aggregateChildKindSet;
        private Node child;
        private NodeCoordinator coordinator;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private Node node = this;
        private ModifierNodeOwnerScope ownerScope;
        private Node parent;
        private boolean updatedNodeAwaitingAttachForInvalidation;

        public void attach$ui_release() {
            boolean z;
            if (!this.isAttached) {
                if (this.coordinator != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.isAttached = true;
                    onAttach();
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        public void detach$ui_release() {
            boolean z;
            if (this.isAttached) {
                if (this.coordinator != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    onDetach();
                    this.isAttached = false;
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        public final int getAggregateChildKindSet$ui_release() {
            return this.aggregateChildKindSet;
        }

        public final Node getChild$ui_release() {
            return this.child;
        }

        public final NodeCoordinator getCoordinator$ui_release() {
            return this.coordinator;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final int getKindSet$ui_release() {
            return this.kindSet;
        }

        public final Node getNode() {
            return this.node;
        }

        public final ModifierNodeOwnerScope getOwnerScope$ui_release() {
            return this.ownerScope;
        }

        public final Node getParent$ui_release() {
            return this.parent;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        /* renamed from: isKind-H91voCI$ui_release  reason: not valid java name */
        public final boolean m35313isKindH91voCI$ui_release(int i) {
            if ((i & getKindSet$ui_release()) != 0) {
                return true;
            }
            return false;
        }

        public void reset$ui_release() {
            if (this.isAttached) {
                onReset();
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        public final void setAggregateChildKindSet$ui_release(int i) {
            this.aggregateChildKindSet = i;
        }

        public final void setAsDelegateTo$ui_release(Node node2) {
            C12775o.m28639i(node2, "owner");
            this.node = node2;
        }

        public final void setChild$ui_release(Node node2) {
            this.child = node2;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
            this.insertedNodeAwaitingAttachForInvalidation = z;
        }

        public final void setKindSet$ui_release(int i) {
            this.kindSet = i;
        }

        public final void setOwnerScope$ui_release(ModifierNodeOwnerScope modifierNodeOwnerScope) {
            this.ownerScope = modifierNodeOwnerScope;
        }

        public final void setParent$ui_release(Node node2) {
            this.parent = node2;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
            this.updatedNodeAwaitingAttachForInvalidation = z;
        }

        public final void sideEffect(C13074a<C11921v> aVar) {
            C12775o.m28639i(aVar, "effect");
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(aVar);
        }

        public void updateCoordinator$ui_release(NodeCoordinator nodeCoordinator) {
            this.coordinator = nodeCoordinator;
        }

        public static /* synthetic */ void getNode$annotations() {
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }
    }
}
