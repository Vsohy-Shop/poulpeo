package androidx.compose.p002ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.PlatformParagraphStyle */
/* compiled from: AndroidTextStyle.android.kt */
public final class PlatformParagraphStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final PlatformParagraphStyle Default = new PlatformParagraphStyle();
    private final int emojiSupportMatch;
    private final boolean includeFontPadding;

    /* renamed from: androidx.compose.ui.text.PlatformParagraphStyle$Companion */
    /* compiled from: AndroidTextStyle.android.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PlatformParagraphStyle getDefault() {
            return PlatformParagraphStyle.Default;
        }
    }

    public /* synthetic */ PlatformParagraphStyle(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformParagraphStyle)) {
            return false;
        }
        PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) obj;
        if (this.includeFontPadding == platformParagraphStyle.includeFontPadding && EmojiSupportMatch.m37851equalsimpl0(this.emojiSupportMatch, platformParagraphStyle.emojiSupportMatch)) {
            return true;
        }
        return false;
    }

    /* renamed from: getEmojiSupportMatch-_3YsG6Y  reason: not valid java name */
    public final int m37914getEmojiSupportMatch_3YsG6Y() {
        return this.emojiSupportMatch;
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.includeFontPadding) * 31) + EmojiSupportMatch.m37852hashCodeimpl(this.emojiSupportMatch);
    }

    public final PlatformParagraphStyle merge(PlatformParagraphStyle platformParagraphStyle) {
        if (platformParagraphStyle == null) {
            return this;
        }
        return platformParagraphStyle;
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + EmojiSupportMatch.m37853toStringimpl(this.emojiSupportMatch) + ')';
    }

    public /* synthetic */ PlatformParagraphStyle(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    public PlatformParagraphStyle(boolean z) {
        this.includeFontPadding = z;
        this.emojiSupportMatch = EmojiSupportMatch.Companion.m37855getDefault_3YsG6Y();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlatformParagraphStyle(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlatformParagraphStyle(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? EmojiSupportMatch.Companion.m37855getDefault_3YsG6Y() : i, (i2 & 2) != 0 ? true : z, (DefaultConstructorMarker) null);
    }

    private PlatformParagraphStyle(int i, boolean z) {
        this.includeFontPadding = z;
        this.emojiSupportMatch = i;
    }

    private PlatformParagraphStyle(int i) {
        this.includeFontPadding = true;
        this.emojiSupportMatch = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlatformParagraphStyle(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? EmojiSupportMatch.Companion.m37855getDefault_3YsG6Y() : i, (DefaultConstructorMarker) null);
    }

    public PlatformParagraphStyle() {
        this(EmojiSupportMatch.Companion.m37855getDefault_3YsG6Y(), true, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void getIncludeFontPadding$annotations() {
    }
}
