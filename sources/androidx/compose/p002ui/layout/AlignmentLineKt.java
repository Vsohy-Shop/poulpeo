package androidx.compose.p002ui.layout;

import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.layout.AlignmentLineKt */
/* compiled from: AlignmentLine.kt */
public final class AlignmentLineKt {
    private static final HorizontalAlignmentLine FirstBaseline = new HorizontalAlignmentLine(AlignmentLineKt$FirstBaseline$1.INSTANCE);
    private static final HorizontalAlignmentLine LastBaseline = new HorizontalAlignmentLine(AlignmentLineKt$LastBaseline$1.INSTANCE);

    public static final HorizontalAlignmentLine getFirstBaseline() {
        return FirstBaseline;
    }

    public static final HorizontalAlignmentLine getLastBaseline() {
        return LastBaseline;
    }

    public static final int merge(AlignmentLine alignmentLine, int i, int i2) {
        C12775o.m28639i(alignmentLine, "<this>");
        return alignmentLine.getMerger$ui_release().invoke(Integer.valueOf(i), Integer.valueOf(i2)).intValue();
    }
}
