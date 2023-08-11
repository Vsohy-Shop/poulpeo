package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineProvider;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: RowColumnImpl.kt */
public abstract class CrossAxisAlignment {
    /* access modifiers changed from: private */
    public static final CrossAxisAlignment Center = CenterCrossAxisAlignment.INSTANCE;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final CrossAxisAlignment End = EndCrossAxisAlignment.INSTANCE;
    /* access modifiers changed from: private */
    public static final CrossAxisAlignment Start = StartCrossAxisAlignment.INSTANCE;

    /* compiled from: RowColumnImpl.kt */
    private static final class AlignmentLineCrossAxisAlignment extends CrossAxisAlignment {
        private final AlignmentLineProvider alignmentLineProvider;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AlignmentLineCrossAxisAlignment(AlignmentLineProvider alignmentLineProvider2) {
            super((DefaultConstructorMarker) null);
            C12775o.m28639i(alignmentLineProvider2, "alignmentLineProvider");
            this.alignmentLineProvider = alignmentLineProvider2;
        }

        public int align$foundation_layout_release(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            C12775o.m28639i(layoutDirection, "layoutDirection");
            C12775o.m28639i(placeable, "placeable");
            int calculateAlignmentLinePosition = this.alignmentLineProvider.calculateAlignmentLinePosition(placeable);
            if (calculateAlignmentLinePosition == Integer.MIN_VALUE) {
                return 0;
            }
            int i3 = i2 - calculateAlignmentLinePosition;
            if (layoutDirection == LayoutDirection.Rtl) {
                return i - i3;
            }
            return i3;
        }

        public Integer calculateAlignmentLinePosition$foundation_layout_release(Placeable placeable) {
            C12775o.m28639i(placeable, "placeable");
            return Integer.valueOf(this.alignmentLineProvider.calculateAlignmentLinePosition(placeable));
        }

        public final AlignmentLineProvider getAlignmentLineProvider() {
            return this.alignmentLineProvider;
        }

        public boolean isRelative$foundation_layout_release() {
            return true;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    private static final class CenterCrossAxisAlignment extends CrossAxisAlignment {
        public static final CenterCrossAxisAlignment INSTANCE = new CenterCrossAxisAlignment();

        private CenterCrossAxisAlignment() {
            super((DefaultConstructorMarker) null);
        }

        public int align$foundation_layout_release(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            C12775o.m28639i(layoutDirection, "layoutDirection");
            C12775o.m28639i(placeable, "placeable");
            return i / 2;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    private static final class EndCrossAxisAlignment extends CrossAxisAlignment {
        public static final EndCrossAxisAlignment INSTANCE = new EndCrossAxisAlignment();

        private EndCrossAxisAlignment() {
            super((DefaultConstructorMarker) null);
        }

        public int align$foundation_layout_release(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            C12775o.m28639i(layoutDirection, "layoutDirection");
            C12775o.m28639i(placeable, "placeable");
            if (layoutDirection == LayoutDirection.Ltr) {
                return i;
            }
            return 0;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    private static final class HorizontalCrossAxisAlignment extends CrossAxisAlignment {
        private final Alignment.Horizontal horizontal;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HorizontalCrossAxisAlignment(Alignment.Horizontal horizontal2) {
            super((DefaultConstructorMarker) null);
            C12775o.m28639i(horizontal2, "horizontal");
            this.horizontal = horizontal2;
        }

        public int align$foundation_layout_release(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            C12775o.m28639i(layoutDirection, "layoutDirection");
            C12775o.m28639i(placeable, "placeable");
            return this.horizontal.align(0, i, layoutDirection);
        }

        public final Alignment.Horizontal getHorizontal() {
            return this.horizontal;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    private static final class StartCrossAxisAlignment extends CrossAxisAlignment {
        public static final StartCrossAxisAlignment INSTANCE = new StartCrossAxisAlignment();

        private StartCrossAxisAlignment() {
            super((DefaultConstructorMarker) null);
        }

        public int align$foundation_layout_release(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            C12775o.m28639i(layoutDirection, "layoutDirection");
            C12775o.m28639i(placeable, "placeable");
            if (layoutDirection == LayoutDirection.Ltr) {
                return 0;
            }
            return i;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    private static final class VerticalCrossAxisAlignment extends CrossAxisAlignment {
        private final Alignment.Vertical vertical;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public VerticalCrossAxisAlignment(Alignment.Vertical vertical2) {
            super((DefaultConstructorMarker) null);
            C12775o.m28639i(vertical2, "vertical");
            this.vertical = vertical2;
        }

        public int align$foundation_layout_release(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            C12775o.m28639i(layoutDirection, "layoutDirection");
            C12775o.m28639i(placeable, "placeable");
            return this.vertical.align(0, i);
        }

        public final Alignment.Vertical getVertical() {
            return this.vertical;
        }
    }

    public /* synthetic */ CrossAxisAlignment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int align$foundation_layout_release(int i, LayoutDirection layoutDirection, Placeable placeable, int i2);

    public Integer calculateAlignmentLinePosition$foundation_layout_release(Placeable placeable) {
        C12775o.m28639i(placeable, "placeable");
        return null;
    }

    public boolean isRelative$foundation_layout_release() {
        return false;
    }

    private CrossAxisAlignment() {
    }

    /* compiled from: RowColumnImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CrossAxisAlignment AlignmentLine(AlignmentLine alignmentLine) {
            C12775o.m28639i(alignmentLine, "alignmentLine");
            return new AlignmentLineCrossAxisAlignment(new AlignmentLineProvider.Value(alignmentLine));
        }

        public final CrossAxisAlignment Relative$foundation_layout_release(AlignmentLineProvider alignmentLineProvider) {
            C12775o.m28639i(alignmentLineProvider, "alignmentLineProvider");
            return new AlignmentLineCrossAxisAlignment(alignmentLineProvider);
        }

        public final CrossAxisAlignment getCenter() {
            return CrossAxisAlignment.Center;
        }

        public final CrossAxisAlignment getEnd() {
            return CrossAxisAlignment.End;
        }

        public final CrossAxisAlignment getStart() {
            return CrossAxisAlignment.Start;
        }

        public final CrossAxisAlignment horizontal$foundation_layout_release(Alignment.Horizontal horizontal) {
            C12775o.m28639i(horizontal, "horizontal");
            return new HorizontalCrossAxisAlignment(horizontal);
        }

        public final CrossAxisAlignment vertical$foundation_layout_release(Alignment.Vertical vertical) {
            C12775o.m28639i(vertical, "vertical");
            return new VerticalCrossAxisAlignment(vertical);
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getStart$annotations() {
        }
    }
}
