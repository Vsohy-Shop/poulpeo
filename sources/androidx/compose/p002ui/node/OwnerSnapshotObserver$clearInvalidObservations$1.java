package androidx.compose.p002ui.node;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1 */
/* compiled from: OwnerSnapshotObserver.kt */
final class OwnerSnapshotObserver$clearInvalidObservations$1 extends C12777p implements Function1<Object, Boolean> {
    public static final OwnerSnapshotObserver$clearInvalidObservations$1 INSTANCE = new OwnerSnapshotObserver$clearInvalidObservations$1();

    OwnerSnapshotObserver$clearInvalidObservations$1() {
        super(1);
    }

    public final Boolean invoke(Object obj) {
        C12775o.m28639i(obj, "it");
        return Boolean.valueOf(!((OwnerScope) obj).isValidOwnerScope());
    }
}
