package androidx.compose.p002ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p308ag.C10894d;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2 */
/* compiled from: GlobalSnapshotManager.android.kt */
final class GlobalSnapshotManager$ensureStarted$2 extends C12777p implements Function1<Object, C11921v> {
    final /* synthetic */ C10894d<C11921v> $channel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GlobalSnapshotManager$ensureStarted$2(C10894d<C11921v> dVar) {
        super(1);
        this.$channel = dVar;
    }

    public final void invoke(Object obj) {
        C12775o.m28639i(obj, "it");
        this.$channel.mo45894m(C11921v.f18618a);
    }
}
