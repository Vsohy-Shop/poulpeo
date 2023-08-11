package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SwipeToDismiss.kt */
final class SwipeToDismissKt$SwipeToDismiss$1 extends C12777p implements Function1<DismissDirection, FixedThreshold> {
    public static final SwipeToDismissKt$SwipeToDismiss$1 INSTANCE = new SwipeToDismissKt$SwipeToDismiss$1();

    SwipeToDismissKt$SwipeToDismiss$1() {
        super(1);
    }

    public final FixedThreshold invoke(DismissDirection dismissDirection) {
        C12775o.m28639i(dismissDirection, "it");
        return new FixedThreshold(SwipeToDismissKt.DISMISS_THRESHOLD, (DefaultConstructorMarker) null);
    }
}
