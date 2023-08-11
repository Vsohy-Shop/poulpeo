package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Stable;

@Stable
/* compiled from: PlatformMagnifier.kt */
public interface PlatformMagnifierFactory {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: PlatformMagnifier.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Stable
        public final PlatformMagnifierFactory getForCurrentPlatform() {
            if (!MagnifierKt.isPlatformMagnifierSupported$default(0, 1, (Object) null)) {
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            } else if (Build.VERSION.SDK_INT == 28) {
                return PlatformMagnifierFactoryApi28Impl.INSTANCE;
            } else {
                return PlatformMagnifierFactoryApi29Impl.INSTANCE;
            }
        }
    }

    PlatformMagnifier create(MagnifierStyle magnifierStyle, View view, Density density, float f);

    boolean getCanUpdateZoom();
}
