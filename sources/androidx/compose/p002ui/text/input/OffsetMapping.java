package androidx.compose.p002ui.text.input;

/* renamed from: androidx.compose.ui.text.input.OffsetMapping */
/* compiled from: OffsetMapping.kt */
public interface OffsetMapping {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: androidx.compose.ui.text.input.OffsetMapping$Companion */
    /* compiled from: OffsetMapping.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final OffsetMapping Identity = new OffsetMapping$Companion$Identity$1();

        private Companion() {
        }

        public final OffsetMapping getIdentity() {
            return Identity;
        }
    }

    int originalToTransformed(int i);

    int transformedToOriginal(int i);
}
