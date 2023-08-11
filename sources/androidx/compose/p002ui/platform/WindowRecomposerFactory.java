package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.compose.p002ui.InternalComposeUiApi;
import androidx.compose.runtime.Recomposer;

@InternalComposeUiApi
/* renamed from: androidx.compose.ui.platform.WindowRecomposerFactory */
/* compiled from: WindowRecomposer.android.kt */
public interface WindowRecomposerFactory {
    public static final Companion Companion = Companion.$$INSTANCE;

    Recomposer createRecomposer(View view);

    /* renamed from: androidx.compose.ui.platform.WindowRecomposerFactory$Companion */
    /* compiled from: WindowRecomposer.android.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final WindowRecomposerFactory LifecycleAware = WindowRecomposerFactory$Companion$LifecycleAware$1.INSTANCE;

        private Companion() {
        }

        public final WindowRecomposerFactory getLifecycleAware() {
            return LifecycleAware;
        }

        public static /* synthetic */ void getLifecycleAware$annotations() {
        }
    }
}
