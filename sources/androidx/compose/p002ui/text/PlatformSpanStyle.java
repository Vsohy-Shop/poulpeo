package androidx.compose.p002ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.PlatformSpanStyle */
/* compiled from: AndroidTextStyle.android.kt */
public final class PlatformSpanStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final PlatformSpanStyle Default = new PlatformSpanStyle();

    /* renamed from: androidx.compose.ui.text.PlatformSpanStyle$Companion */
    /* compiled from: AndroidTextStyle.android.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PlatformSpanStyle getDefault() {
            return PlatformSpanStyle.Default;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj && !(obj instanceof PlatformSpanStyle)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "PlatformSpanStyle()";
    }

    public final PlatformSpanStyle merge(PlatformSpanStyle platformSpanStyle) {
        return this;
    }
}
