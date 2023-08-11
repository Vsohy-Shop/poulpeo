package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.C12775o;
import p355hf.C12079g;

/* renamed from: androidx.compose.ui.platform.WindowRecomposerFactory$Companion$LifecycleAware$1 */
/* compiled from: WindowRecomposer.android.kt */
final class WindowRecomposerFactory$Companion$LifecycleAware$1 implements WindowRecomposerFactory {
    public static final WindowRecomposerFactory$Companion$LifecycleAware$1 INSTANCE = new WindowRecomposerFactory$Companion$LifecycleAware$1();

    WindowRecomposerFactory$Companion$LifecycleAware$1() {
    }

    public final Recomposer createRecomposer(View view) {
        C12775o.m28639i(view, "rootView");
        return WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer$default(view, (C12079g) null, (Lifecycle) null, 3, (Object) null);
    }
}
