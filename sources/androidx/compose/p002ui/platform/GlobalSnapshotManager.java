package androidx.compose.p002ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import p308ag.C10886a;
import p308ag.C10894d;
import p308ag.C10898g;
import p355hf.C12074d;
import p355hf.C12079g;
import p466yf.C13999m0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* renamed from: androidx.compose.ui.platform.GlobalSnapshotManager */
/* compiled from: GlobalSnapshotManager.android.kt */
public final class GlobalSnapshotManager {
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();
    private static final AtomicBoolean started = new AtomicBoolean(false);

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            C10894d b = C10898g.m23419b(-1, (C10886a) null, (Function1) null, 6, (Object) null);
            C14054y1 unused = C13985j.m32422d(C13999m0.m32447a(AndroidUiDispatcher.Companion.getMain()), (C12079g) null, (C14004n0) null, new GlobalSnapshotManager$ensureStarted$1(b, (C12074d<? super GlobalSnapshotManager$ensureStarted$1>) null), 3, (Object) null);
            Snapshot.Companion.registerGlobalWriteObserver(new GlobalSnapshotManager$ensureStarted$2(b));
        }
    }
}
