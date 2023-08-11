package androidx.compose.p002ui;

import androidx.compose.p002ui.BiasAlignment;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;

@Stable
/* renamed from: androidx.compose.ui.Alignment */
/* compiled from: Alignment.kt */
public interface Alignment {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Stable
    /* renamed from: androidx.compose.ui.Alignment$Horizontal */
    /* compiled from: Alignment.kt */
    public interface Horizontal {
        int align(int i, int i2, LayoutDirection layoutDirection);
    }

    @Stable
    /* renamed from: androidx.compose.ui.Alignment$Vertical */
    /* compiled from: Alignment.kt */
    public interface Vertical {
        int align(int i, int i2);
    }

    /* renamed from: align-KFBX0sM  reason: not valid java name */
    long m35310alignKFBX0sM(long j, long j2, LayoutDirection layoutDirection);

    /* renamed from: androidx.compose.ui.Alignment$Companion */
    /* compiled from: Alignment.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Vertical Bottom = new BiasAlignment.Vertical(1.0f);
        private static final Alignment BottomCenter = new BiasAlignment(0.0f, 1.0f);
        private static final Alignment BottomEnd = new BiasAlignment(1.0f, 1.0f);
        private static final Alignment BottomStart = new BiasAlignment(-1.0f, 1.0f);
        private static final Alignment Center = new BiasAlignment(0.0f, 0.0f);
        private static final Alignment CenterEnd = new BiasAlignment(1.0f, 0.0f);
        private static final Horizontal CenterHorizontally = new BiasAlignment.Horizontal(0.0f);
        private static final Alignment CenterStart = new BiasAlignment(-1.0f, 0.0f);
        private static final Vertical CenterVertically = new BiasAlignment.Vertical(0.0f);
        private static final Horizontal End = new BiasAlignment.Horizontal(1.0f);
        private static final Horizontal Start = new BiasAlignment.Horizontal(-1.0f);
        private static final Vertical Top = new BiasAlignment.Vertical(-1.0f);
        private static final Alignment TopCenter = new BiasAlignment(0.0f, -1.0f);
        private static final Alignment TopEnd = new BiasAlignment(1.0f, -1.0f);
        private static final Alignment TopStart = new BiasAlignment(-1.0f, -1.0f);

        private Companion() {
        }

        public final Vertical getBottom() {
            return Bottom;
        }

        public final Alignment getBottomCenter() {
            return BottomCenter;
        }

        public final Alignment getBottomEnd() {
            return BottomEnd;
        }

        public final Alignment getBottomStart() {
            return BottomStart;
        }

        public final Alignment getCenter() {
            return Center;
        }

        public final Alignment getCenterEnd() {
            return CenterEnd;
        }

        public final Horizontal getCenterHorizontally() {
            return CenterHorizontally;
        }

        public final Alignment getCenterStart() {
            return CenterStart;
        }

        public final Vertical getCenterVertically() {
            return CenterVertically;
        }

        public final Horizontal getEnd() {
            return End;
        }

        public final Horizontal getStart() {
            return Start;
        }

        public final Vertical getTop() {
            return Top;
        }

        public final Alignment getTopCenter() {
            return TopCenter;
        }

        public final Alignment getTopEnd() {
            return TopEnd;
        }

        public final Alignment getTopStart() {
            return TopStart;
        }

        @Stable
        public static /* synthetic */ void getBottom$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBottomCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBottomEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBottomStart$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterHorizontally$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterStart$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterVertically$annotations() {
        }

        @Stable
        public static /* synthetic */ void getEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getStart$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTop$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTopCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTopEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTopStart$annotations() {
        }
    }
}
