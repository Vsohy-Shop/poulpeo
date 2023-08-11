package androidx.compose.p002ui.layout;

import androidx.compose.runtime.Stable;

@Stable
/* renamed from: androidx.compose.ui.layout.ContentScale */
/* compiled from: ContentScale.kt */
public interface ContentScale {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: computeScaleFactor-H7hwNQA  reason: not valid java name */
    long m37308computeScaleFactorH7hwNQA(long j, long j2);

    /* renamed from: androidx.compose.ui.layout.ContentScale$Companion */
    /* compiled from: ContentScale.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ContentScale Crop = new ContentScale$Companion$Crop$1();
        private static final ContentScale FillBounds = new ContentScale$Companion$FillBounds$1();
        private static final ContentScale FillHeight = new ContentScale$Companion$FillHeight$1();
        private static final ContentScale FillWidth = new ContentScale$Companion$FillWidth$1();
        private static final ContentScale Fit = new ContentScale$Companion$Fit$1();
        private static final ContentScale Inside = new ContentScale$Companion$Inside$1();
        private static final FixedScale None = new FixedScale(1.0f);

        private Companion() {
        }

        public final ContentScale getCrop() {
            return Crop;
        }

        public final ContentScale getFillBounds() {
            return FillBounds;
        }

        public final ContentScale getFillHeight() {
            return FillHeight;
        }

        public final ContentScale getFillWidth() {
            return FillWidth;
        }

        public final ContentScale getFit() {
            return Fit;
        }

        public final ContentScale getInside() {
            return Inside;
        }

        public final FixedScale getNone() {
            return None;
        }

        @Stable
        public static /* synthetic */ void getCrop$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillBounds$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillHeight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillWidth$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFit$annotations() {
        }

        @Stable
        public static /* synthetic */ void getInside$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }
    }
}
