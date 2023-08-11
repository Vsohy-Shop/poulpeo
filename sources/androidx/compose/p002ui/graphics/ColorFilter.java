package androidx.compose.p002ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.ColorFilter */
/* compiled from: ColorFilter.kt */
public final class ColorFilter {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final android.graphics.ColorFilter nativeColorFilter;

    /* renamed from: androidx.compose.ui.graphics.ColorFilter$Companion */
    /* compiled from: ColorFilter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: tint-xETnrds$default  reason: not valid java name */
        public static /* synthetic */ ColorFilter m35712tintxETnrds$default(Companion companion, long j, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = BlendMode.Companion.m35602getSrcIn0nO6VwU();
            }
            return companion.m35715tintxETnrds(j, i);
        }

        @Stable
        /* renamed from: colorMatrix-jHG-Opc  reason: not valid java name */
        public final ColorFilter m35713colorMatrixjHGOpc(float[] fArr) {
            C12775o.m28639i(fArr, "colorMatrix");
            return AndroidColorFilter_androidKt.m35527actualColorMatrixColorFilterjHGOpc(fArr);
        }

        @Stable
        /* renamed from: lighting--OWjLjI  reason: not valid java name */
        public final ColorFilter m35714lightingOWjLjI(long j, long j2) {
            return AndroidColorFilter_androidKt.m35528actualLightingColorFilterOWjLjI(j, j2);
        }

        @Stable
        /* renamed from: tint-xETnrds  reason: not valid java name */
        public final ColorFilter m35715tintxETnrds(long j, int i) {
            return AndroidColorFilter_androidKt.m35529actualTintColorFilterxETnrds(j, i);
        }
    }

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        C12775o.m28639i(colorFilter, "nativeColorFilter");
        this.nativeColorFilter = colorFilter;
    }

    public final android.graphics.ColorFilter getNativeColorFilter$ui_graphics_release() {
        return this.nativeColorFilter;
    }
}
