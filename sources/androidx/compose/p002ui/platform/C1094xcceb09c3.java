package androidx.compose.p002ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 */
/* compiled from: DisposableSaveableStateRegistry.android.kt */
final class C1094xcceb09c3 extends C12777p implements Function1<Object, Boolean> {
    public static final C1094xcceb09c3 INSTANCE = new C1094xcceb09c3();

    C1094xcceb09c3() {
        super(1);
    }

    public final Boolean invoke(Object obj) {
        C12775o.m28639i(obj, "it");
        return Boolean.valueOf(DisposableSaveableStateRegistry_androidKt.canBeSavedToBundle(obj));
    }
}
