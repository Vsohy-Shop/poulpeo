package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi(29)
@SourceDebugExtension({"SMAP\nPlatformMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,184:1\n152#2:185\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n*L\n152#1:185\n*E\n"})
/* compiled from: PlatformMagnifier.kt */
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {
    public static final PlatformMagnifierFactoryApi29Impl INSTANCE = new PlatformMagnifierFactoryApi29Impl();
    private static final boolean canUpdateZoom = true;

    @RequiresApi(29)
    @StabilityInferred(parameters = 0)
    /* compiled from: PlatformMagnifier.kt */
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int $stable = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PlatformMagnifierImpl(Magnifier magnifier) {
            super(magnifier);
            C12775o.m28639i(magnifier, "magnifier");
        }

        /* renamed from: update-Wko1d7g  reason: not valid java name */
        public void m33032updateWko1d7g(long j, long j2, float f) {
            if (!Float.isNaN(f)) {
                getMagnifier().setZoom(f);
            }
            if (OffsetKt.m35441isSpecifiedk4lQ0M(j2)) {
                getMagnifier().show(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j), Offset.m35422getXimpl(j2), Offset.m35423getYimpl(j2));
            } else {
                getMagnifier().show(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j));
            }
        }
    }

    private PlatformMagnifierFactoryApi29Impl() {
    }

    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    public PlatformMagnifierImpl create(MagnifierStyle magnifierStyle, View view, Density density, float f) {
        C12775o.m28639i(magnifierStyle, "style");
        C12775o.m28639i(view, "view");
        C12775o.m28639i(density, "density");
        if (C12775o.m28634d(magnifierStyle, MagnifierStyle.Companion.getTextDefault())) {
            return new PlatformMagnifierImpl(new Magnifier(view));
        }
        long r0 = density.m38450toSizeXkaWNTQ(magnifierStyle.m33008getSizeMYxV2XQ$foundation_release());
        float r2 = density.m38449toPx0680j_4(magnifierStyle.m33006getCornerRadiusD9Ej5fM$foundation_release());
        float r9 = density.m38449toPx0680j_4(magnifierStyle.m33007getElevationD9Ej5fM$foundation_release());
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (r0 != Size.Companion.m35499getUnspecifiedNHjbRc()) {
            Magnifier.Builder unused = builder.setSize(C13265c.m30134c(Size.m35491getWidthimpl(r0)), C13265c.m30134c(Size.m35488getHeightimpl(r0)));
        }
        if (!Float.isNaN(r2)) {
            Magnifier.Builder unused2 = builder.setCornerRadius(r2);
        }
        if (!Float.isNaN(r9)) {
            Magnifier.Builder unused3 = builder.setElevation(r9);
        }
        if (!Float.isNaN(f)) {
            Magnifier.Builder unused4 = builder.setInitialZoom(f);
        }
        Magnifier.Builder unused5 = builder.setClippingEnabled(magnifierStyle.getClippingEnabled$foundation_release());
        Magnifier a = builder.build();
        C12775o.m28638h(a, "Builder(view).run {\n    …    build()\n            }");
        return new PlatformMagnifierImpl(a);
    }
}
