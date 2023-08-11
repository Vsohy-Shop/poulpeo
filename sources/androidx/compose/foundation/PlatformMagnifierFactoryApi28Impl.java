package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@RequiresApi(28)
/* compiled from: PlatformMagnifier.kt */
public final class PlatformMagnifierFactoryApi28Impl implements PlatformMagnifierFactory {
    public static final PlatformMagnifierFactoryApi28Impl INSTANCE = new PlatformMagnifierFactoryApi28Impl();
    private static final boolean canUpdateZoom = false;

    @RequiresApi(28)
    @StabilityInferred(parameters = 0)
    /* compiled from: PlatformMagnifier.kt */
    public static class PlatformMagnifierImpl implements PlatformMagnifier {
        public static final int $stable = 8;
        private final Magnifier magnifier;

        public PlatformMagnifierImpl(Magnifier magnifier2) {
            C12775o.m28639i(magnifier2, "magnifier");
            this.magnifier = magnifier2;
        }

        public void dismiss() {
            this.magnifier.dismiss();
        }

        public final Magnifier getMagnifier() {
            return this.magnifier;
        }

        /* renamed from: getSize-YbymL2g  reason: not valid java name */
        public long m33030getSizeYbymL2g() {
            return IntSizeKt.IntSize(this.magnifier.getWidth(), this.magnifier.getHeight());
        }

        /* renamed from: update-Wko1d7g  reason: not valid java name */
        public void m33031updateWko1d7g(long j, long j2, float f) {
            this.magnifier.show(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j));
        }

        public void updateContent() {
            this.magnifier.update();
        }
    }

    private PlatformMagnifierFactoryApi28Impl() {
    }

    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    public PlatformMagnifierImpl create(MagnifierStyle magnifierStyle, View view, Density density, float f) {
        C12775o.m28639i(magnifierStyle, "style");
        C12775o.m28639i(view, "view");
        C12775o.m28639i(density, "density");
        return new PlatformMagnifierImpl(new Magnifier(view));
    }
}
