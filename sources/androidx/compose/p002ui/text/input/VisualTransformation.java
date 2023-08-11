package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;

@Immutable
/* renamed from: androidx.compose.ui.text.input.VisualTransformation */
/* compiled from: VisualTransformation.kt */
public interface VisualTransformation {
    public static final Companion Companion = Companion.$$INSTANCE;

    TransformedText filter(AnnotatedString annotatedString);

    /* renamed from: androidx.compose.ui.text.input.VisualTransformation$Companion */
    /* compiled from: VisualTransformation.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final VisualTransformation None = VisualTransformation$Companion$None$1.INSTANCE;

        private Companion() {
        }

        public final VisualTransformation getNone() {
            return None;
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }
    }
}
