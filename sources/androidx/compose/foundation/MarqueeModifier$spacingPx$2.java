package androidx.compose.foundation;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: BasicMarquee.kt */
final class MarqueeModifier$spacingPx$2 extends C12777p implements C13074a<Integer> {
    final /* synthetic */ MarqueeModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MarqueeModifier$spacingPx$2(MarqueeModifier marqueeModifier) {
        super(0);
        this.this$0 = marqueeModifier;
    }

    public final Integer invoke() {
        MarqueeSpacing spacing = this.this$0.getSpacing();
        MarqueeModifier marqueeModifier = this.this$0;
        return Integer.valueOf(spacing.calculateSpacing(marqueeModifier.density, marqueeModifier.getContentWidth(), marqueeModifier.getContainerWidth()));
    }
}
