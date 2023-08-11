package androidx.compose.p002ui.viewinterop;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1 */
/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$runUpdate$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$runUpdate$1(AndroidViewHolder androidViewHolder) {
        super(0);
        this.this$0 = androidViewHolder;
    }

    public final void invoke() {
        if (this.this$0.hasUpdateBlock) {
            SnapshotStateObserver access$getSnapshotObserver$p = this.this$0.snapshotObserver;
            AndroidViewHolder androidViewHolder = this.this$0;
            access$getSnapshotObserver$p.observeReads(androidViewHolder, androidViewHolder.onCommitAffectingUpdate, this.this$0.getUpdate());
        }
    }
}
