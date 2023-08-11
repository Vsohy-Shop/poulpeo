package androidx.compose.p002ui.node;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.node.ModifierNodeOwnerScope */
/* compiled from: ObserverNode.kt */
public final class ModifierNodeOwnerScope implements OwnerScope {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Function1<ModifierNodeOwnerScope, C11921v> OnObserveReadsChanged = ModifierNodeOwnerScope$Companion$OnObserveReadsChanged$1.INSTANCE;
    private final ObserverNode observerNode;

    /* renamed from: androidx.compose.ui.node.ModifierNodeOwnerScope$Companion */
    /* compiled from: ObserverNode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function1<ModifierNodeOwnerScope, C11921v> getOnObserveReadsChanged$ui_release() {
            return ModifierNodeOwnerScope.OnObserveReadsChanged;
        }
    }

    public ModifierNodeOwnerScope(ObserverNode observerNode2) {
        C12775o.m28639i(observerNode2, "observerNode");
        this.observerNode = observerNode2;
    }

    public final ObserverNode getObserverNode$ui_release() {
        return this.observerNode;
    }

    public boolean isValidOwnerScope() {
        return this.observerNode.getNode().isAttached();
    }
}
