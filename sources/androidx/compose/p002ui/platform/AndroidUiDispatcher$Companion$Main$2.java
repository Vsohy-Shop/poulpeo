package androidx.compose.p002ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.core.p004os.HandlerCompat;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p466yf.C13933b1;
import p466yf.C13970h;

/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2 */
/* compiled from: AndroidUiDispatcher.android.kt */
final class AndroidUiDispatcher$Companion$Main$2 extends C12777p implements C13074a<C12079g> {
    public static final AndroidUiDispatcher$Companion$Main$2 INSTANCE = new AndroidUiDispatcher$Companion$Main$2();

    AndroidUiDispatcher$Companion$Main$2() {
        super(0);
    }

    public final C12079g invoke() {
        Choreographer choreographer;
        if (AndroidUiDispatcher_androidKt.isMainThread()) {
            choreographer = Choreographer.getInstance();
        } else {
            choreographer = (Choreographer) C13970h.m32376e(C13933b1.m32212c(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1((C12074d<? super AndroidUiDispatcher$Companion$Main$2$dispatcher$1>) null));
        }
        C12775o.m28638h(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
        Handler createAsync = HandlerCompat.createAsync(Looper.getMainLooper());
        C12775o.m28638h(createAsync, "createAsync(Looper.getMainLooper())");
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, createAsync, (DefaultConstructorMarker) null);
        return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
    }
}
