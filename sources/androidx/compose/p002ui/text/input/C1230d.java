package androidx.compose.p002ui.text.input;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* renamed from: androidx.compose.ui.text.input.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1230d implements Executor {

    /* renamed from: b */
    public final /* synthetic */ Choreographer f385b;

    public /* synthetic */ C1230d(Choreographer choreographer) {
        this.f385b = choreographer;
    }

    public final void execute(Runnable runnable) {
        TextInputServiceAndroid_androidKt.asExecutor$lambda$1(this.f385b, runnable);
    }
}
