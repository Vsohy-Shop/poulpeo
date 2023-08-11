package androidx.compose.p002ui.input.pointer;

import androidx.compose.runtime.Stable;

@Stable
/* renamed from: androidx.compose.ui.input.pointer.PointerIcon */
/* compiled from: PointerIcon.kt */
public interface PointerIcon {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: androidx.compose.ui.input.pointer.PointerIcon$Companion */
    /* compiled from: PointerIcon.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final PointerIcon Crosshair = PointerIcon_androidKt.getPointerIconCrosshair();
        private static final PointerIcon Default = PointerIcon_androidKt.getPointerIconDefault();
        private static final PointerIcon Hand = PointerIcon_androidKt.getPointerIconHand();
        private static final PointerIcon Text = PointerIcon_androidKt.getPointerIconText();

        private Companion() {
        }

        public final PointerIcon getCrosshair() {
            return Crosshair;
        }

        public final PointerIcon getDefault() {
            return Default;
        }

        public final PointerIcon getHand() {
            return Hand;
        }

        public final PointerIcon getText() {
            return Text;
        }
    }
}
