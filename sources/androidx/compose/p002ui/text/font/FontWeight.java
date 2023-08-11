package androidx.compose.p002ui.text.font;

import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.text.font.FontWeight */
/* compiled from: FontWeight.kt */
public final class FontWeight implements Comparable<FontWeight> {
    public static final int $stable = 0;
    /* access modifiers changed from: private */
    public static final FontWeight Black;
    /* access modifiers changed from: private */
    public static final FontWeight Bold;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final FontWeight ExtraBold;
    /* access modifiers changed from: private */
    public static final FontWeight ExtraLight;
    /* access modifiers changed from: private */
    public static final FontWeight Light;
    /* access modifiers changed from: private */
    public static final FontWeight Medium;
    /* access modifiers changed from: private */
    public static final FontWeight Normal;
    /* access modifiers changed from: private */
    public static final FontWeight SemiBold;
    /* access modifiers changed from: private */
    public static final FontWeight Thin;
    /* access modifiers changed from: private */
    public static final FontWeight W100;
    /* access modifiers changed from: private */
    public static final FontWeight W200;
    /* access modifiers changed from: private */
    public static final FontWeight W300;
    /* access modifiers changed from: private */
    public static final FontWeight W400;
    /* access modifiers changed from: private */
    public static final FontWeight W500;
    /* access modifiers changed from: private */
    public static final FontWeight W600;
    /* access modifiers changed from: private */
    public static final FontWeight W700;
    /* access modifiers changed from: private */
    public static final FontWeight W800;
    /* access modifiers changed from: private */
    public static final FontWeight W900;
    /* access modifiers changed from: private */
    public static final List<FontWeight> values;
    private final int weight;

    static {
        FontWeight fontWeight = new FontWeight(100);
        W100 = fontWeight;
        FontWeight fontWeight2 = new FontWeight(200);
        W200 = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(AnimationConstants.DefaultDurationMillis);
        W300 = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(Constants.MINIMAL_ERROR_STATUS_CODE);
        W400 = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        W500 = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        W600 = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(TypedValues.TransitionType.TYPE_DURATION);
        W700 = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        W800 = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(TypedValues.Custom.TYPE_INT);
        W900 = fontWeight9;
        Thin = fontWeight;
        ExtraLight = fontWeight2;
        Light = fontWeight3;
        Normal = fontWeight4;
        Medium = fontWeight5;
        SemiBold = fontWeight6;
        Bold = fontWeight7;
        ExtraBold = fontWeight8;
        Black = fontWeight9;
        values = C12726w.m28527n(fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9);
    }

    public FontWeight(int i) {
        this.weight = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i).toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FontWeight) && this.weight == ((FontWeight) obj).weight) {
            return true;
        }
        return false;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.weight;
    }

    public String toString() {
        return "FontWeight(weight=" + this.weight + ')';
    }

    public int compareTo(FontWeight fontWeight) {
        C12775o.m28639i(fontWeight, "other");
        return C12775o.m28641k(this.weight, fontWeight.weight);
    }

    /* renamed from: androidx.compose.ui.text.font.FontWeight$Companion */
    /* compiled from: FontWeight.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FontWeight getBlack() {
            return FontWeight.Black;
        }

        public final FontWeight getBold() {
            return FontWeight.Bold;
        }

        public final FontWeight getExtraBold() {
            return FontWeight.ExtraBold;
        }

        public final FontWeight getExtraLight() {
            return FontWeight.ExtraLight;
        }

        public final FontWeight getLight() {
            return FontWeight.Light;
        }

        public final FontWeight getMedium() {
            return FontWeight.Medium;
        }

        public final FontWeight getNormal() {
            return FontWeight.Normal;
        }

        public final FontWeight getSemiBold() {
            return FontWeight.SemiBold;
        }

        public final FontWeight getThin() {
            return FontWeight.Thin;
        }

        public final List<FontWeight> getValues$ui_text_release() {
            return FontWeight.values;
        }

        public final FontWeight getW100() {
            return FontWeight.W100;
        }

        public final FontWeight getW200() {
            return FontWeight.W200;
        }

        public final FontWeight getW300() {
            return FontWeight.W300;
        }

        public final FontWeight getW400() {
            return FontWeight.W400;
        }

        public final FontWeight getW500() {
            return FontWeight.W500;
        }

        public final FontWeight getW600() {
            return FontWeight.W600;
        }

        public final FontWeight getW700() {
            return FontWeight.W700;
        }

        public final FontWeight getW800() {
            return FontWeight.W800;
        }

        public final FontWeight getW900() {
            return FontWeight.W900;
        }

        @Stable
        public static /* synthetic */ void getBlack$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getExtraBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getExtraLight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getLight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getMedium$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNormal$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSemiBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getThin$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW100$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW200$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW300$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW400$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW500$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW600$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW700$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW800$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW900$annotations() {
        }
    }
}
