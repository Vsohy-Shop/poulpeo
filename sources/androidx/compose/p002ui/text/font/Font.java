package androidx.compose.p002ui.text.font;

import androidx.compose.runtime.Immutable;

@Immutable
/* renamed from: androidx.compose.ui.text.font.Font */
/* compiled from: Font.kt */
public interface Font {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long MaximumAsyncTimeoutMillis = 15000;

    /* renamed from: androidx.compose.ui.text.font.Font$Companion */
    /* compiled from: Font.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long MaximumAsyncTimeoutMillis = 15000;

        private Companion() {
        }
    }

    /* renamed from: androidx.compose.ui.text.font.Font$ResourceLoader */
    /* compiled from: Font.kt */
    public interface ResourceLoader {
        Object load(Font font);
    }

    /* renamed from: getLoadingStrategy-PKNRLFQ  reason: not valid java name */
    int m38034getLoadingStrategyPKNRLFQ() {
        return FontLoadingStrategy.Companion.m38055getBlockingPKNRLFQ();
    }

    /* renamed from: getStyle-_-LCdwA  reason: not valid java name */
    int m38035getStyle_LCdwA();

    FontWeight getWeight();
}
