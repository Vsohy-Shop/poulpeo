package androidx.compose.p002ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
/* renamed from: androidx.compose.ui.text.android.LayoutCompat */
/* compiled from: LayoutCompat.kt */
public final class LayoutCompat {
    public static final int $stable = 8;
    public static final int ALIGN_CENTER = 2;
    public static final int ALIGN_LEFT = 3;
    public static final int ALIGN_NORMAL = 0;
    public static final int ALIGN_OPPOSITE = 1;
    public static final int ALIGN_RIGHT = 4;
    public static final int BREAK_STRATEGY_BALANCED = 2;
    public static final int BREAK_STRATEGY_HIGH_QUALITY = 1;
    public static final int BREAK_STRATEGY_SIMPLE = 0;
    public static final int DEFAULT_ALIGNMENT = 0;
    public static final int DEFAULT_BREAK_STRATEGY = 0;
    public static final boolean DEFAULT_FALLBACK_LINE_SPACING = true;
    public static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    public static final boolean DEFAULT_INCLUDE_PADDING = false;
    public static final int DEFAULT_JUSTIFICATION_MODE = 0;
    private static final Layout.Alignment DEFAULT_LAYOUT_ALIGNMENT = Layout.Alignment.ALIGN_NORMAL;
    public static final float DEFAULT_LINESPACING_EXTRA = 0.0f;
    public static final float DEFAULT_LINESPACING_MULTIPLIER = 1.0f;
    public static final int DEFAULT_LINE_BREAK_STYLE = 0;
    public static final int DEFAULT_LINE_BREAK_WORD_STYLE = 0;
    public static final int DEFAULT_MAX_LINES = Integer.MAX_VALUE;
    public static final int DEFAULT_TEXT_DIRECTION = 2;
    private static final TextDirectionHeuristic DEFAULT_TEXT_DIRECTION_HEURISTIC;
    public static final int HYPHENATION_FREQUENCY_NONE = 0;
    public static final int HYPHENATION_FREQUENCY_NORMAL = 1;
    public static final int HYPHENATION_FREQUENCY_NORMAL_FAST = 3;
    public static final LayoutCompat INSTANCE = new LayoutCompat();
    public static final int JUSTIFICATION_MODE_INTER_WORD = 1;
    public static final int JUSTIFICATION_MODE_NONE = 0;
    public static final int LINE_BREAK_STYLE_LOOSE = 1;
    public static final int LINE_BREAK_STYLE_NONE = 0;
    public static final int LINE_BREAK_STYLE_NORMAL = 2;
    public static final int LINE_BREAK_STYLE_STRICT = 3;
    public static final int LINE_BREAK_WORD_STYLE_NONE = 0;
    public static final int LINE_BREAK_WORD_STYLE_PHRASE = 1;
    public static final int TEXT_DIRECTION_ANY_RTL_LTR = 4;
    public static final int TEXT_DIRECTION_FIRST_STRONG_LTR = 2;
    public static final int TEXT_DIRECTION_FIRST_STRONG_RTL = 3;
    public static final int TEXT_DIRECTION_LOCALE = 5;
    public static final int TEXT_DIRECTION_LTR = 0;
    public static final int TEXT_DIRECTION_RTL = 1;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.compose.ui.text.android.LayoutCompat$BreakStrategy */
    /* compiled from: LayoutCompat.kt */
    public @interface BreakStrategy {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.compose.ui.text.android.LayoutCompat$HyphenationFrequency */
    /* compiled from: LayoutCompat.kt */
    public @interface HyphenationFrequency {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.compose.ui.text.android.LayoutCompat$JustificationMode */
    /* compiled from: LayoutCompat.kt */
    public @interface JustificationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.compose.ui.text.android.LayoutCompat$LineBreakStyle */
    /* compiled from: LayoutCompat.kt */
    public @interface LineBreakStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.compose.ui.text.android.LayoutCompat$LineBreakWordStyle */
    /* compiled from: LayoutCompat.kt */
    public @interface LineBreakWordStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.compose.ui.text.android.LayoutCompat$TextDirection */
    /* compiled from: LayoutCompat.kt */
    public @interface TextDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.compose.ui.text.android.LayoutCompat$TextLayoutAlignment */
    /* compiled from: LayoutCompat.kt */
    public @interface TextLayoutAlignment {
    }

    static {
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        C12775o.m28638h(textDirectionHeuristic, "FIRSTSTRONG_LTR");
        DEFAULT_TEXT_DIRECTION_HEURISTIC = textDirectionHeuristic;
    }

    private LayoutCompat() {
    }

    public final Layout.Alignment getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release() {
        return DEFAULT_LAYOUT_ALIGNMENT;
    }

    public final TextDirectionHeuristic getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release() {
        return DEFAULT_TEXT_DIRECTION_HEURISTIC;
    }
}
