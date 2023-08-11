package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: SavedStateHandleSupport.kt */
final class SavedStateHandleSupport$savedStateHandlesVM$1$1 extends C12777p implements Function1<CreationExtras, SavedStateHandlesVM> {
    public static final SavedStateHandleSupport$savedStateHandlesVM$1$1 INSTANCE = new SavedStateHandleSupport$savedStateHandlesVM$1$1();

    SavedStateHandleSupport$savedStateHandlesVM$1$1() {
        super(1);
    }

    public final SavedStateHandlesVM invoke(CreationExtras creationExtras) {
        C12775o.m28639i(creationExtras, "$this$initializer");
        return new SavedStateHandlesVM();
    }
}
