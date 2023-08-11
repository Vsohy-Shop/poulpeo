package androidx.compose.p002ui.text.android.animation;

import android.text.Layout;
import androidx.compose.p002ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.p002ui.text.android.InternalPlatformTextApi;
import androidx.compose.p002ui.text.android.LayoutCompatKt;
import androidx.compose.p002ui.text.android.LayoutHelper;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSegmentBreaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/android/TempListUtilsKt\n*L\n1#1,312:1\n34#2,6:313\n73#2,11:319\n73#2,11:330\n*S KotlinDebug\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n*L\n66#1:313,6\n226#1:319,11\n275#1:330,11\n*E\n"})
@InternalPlatformTextApi
/* renamed from: androidx.compose.ui.text.android.animation.SegmentBreaker */
/* compiled from: SegmentBreaker.kt */
public final class SegmentBreaker {
    public static final int $stable = 0;
    public static final SegmentBreaker INSTANCE = new SegmentBreaker();

    /* renamed from: androidx.compose.ui.text.android.animation.SegmentBreaker$WhenMappings */
    /* compiled from: SegmentBreaker.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.ui.text.android.animation.SegmentType[] r0 = androidx.compose.p002ui.text.android.animation.SegmentType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.text.android.animation.SegmentType r1 = androidx.compose.p002ui.text.android.animation.SegmentType.Document     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.text.android.animation.SegmentType r1 = androidx.compose.p002ui.text.android.animation.SegmentType.Paragraph     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.text.android.animation.SegmentType r1 = androidx.compose.p002ui.text.android.animation.SegmentType.Line     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.text.android.animation.SegmentType r1 = androidx.compose.p002ui.text.android.animation.SegmentType.Word     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.ui.text.android.animation.SegmentType r1 = androidx.compose.p002ui.text.android.animation.SegmentType.Character     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.android.animation.SegmentBreaker.WhenMappings.<clinit>():void");
        }
    }

    private SegmentBreaker() {
    }

    private final List<Integer> breakInWords(LayoutHelper layoutHelper) {
        CharSequence text = layoutHelper.getLayout().getText();
        C12775o.m28638h(text, "text");
        BreakIterator lineInstance = BreakIterator.getLineInstance(Locale.getDefault());
        C12775o.m28638h(lineInstance, "getLineInstance(Locale.getDefault())");
        List<Integer> breakWithBreakIterator = breakWithBreakIterator(text, lineInstance);
        TreeSet treeSet = new TreeSet();
        int size = breakWithBreakIterator.size();
        for (int i = 0; i < size; i++) {
            treeSet.add(Integer.valueOf(breakWithBreakIterator.get(i).intValue()));
        }
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i2 = 0; i2 < paragraphCount; i2++) {
            Bidi analyzeBidi = layoutHelper.analyzeBidi(i2);
            if (analyzeBidi != null) {
                int paragraphStart = layoutHelper.getParagraphStart(i2);
                int runCount = analyzeBidi.getRunCount();
                for (int i3 = 0; i3 < runCount; i3++) {
                    treeSet.add(Integer.valueOf(analyzeBidi.getRunStart(i3) + paragraphStart));
                }
            }
        }
        return C12686e0.m28205B0(treeSet);
    }

    private final List<Segment> breakSegmentWithChar(LayoutHelper layoutHelper, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        LayoutHelper layoutHelper2 = layoutHelper;
        ArrayList arrayList = new ArrayList();
        List<Integer> breakOffsets = breakOffsets(layoutHelper2, SegmentType.Character);
        if (breakOffsets.size() != 0) {
            boolean z4 = true;
            if (breakOffsets.size() != 1) {
                ArrayList arrayList2 = new ArrayList();
                boolean z5 = false;
                Integer num = breakOffsets.get(0);
                int m = C12726w.m28526m(breakOffsets);
                int i2 = 0;
                while (i2 < m) {
                    i2++;
                    Integer num2 = breakOffsets.get(i2);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    Layout layout = layoutHelper.getLayout();
                    if (!z || intValue != intValue2 + 1 || !layoutHelper2.isLineEndSpace(layout.getText().charAt(intValue2))) {
                        int lineForOffset = LayoutCompatKt.getLineForOffset(layout, intValue2, z5);
                        if (layout.getParagraphDirection(lineForOffset) == -1) {
                            z2 = z4;
                        } else {
                            z2 = z5;
                        }
                        boolean isRtlCharAt = layout.isRtlCharAt(intValue2);
                        if (isRtlCharAt != z2) {
                            z4 = z5;
                        }
                        Layout layout2 = layout;
                        int ceil = (int) ((float) Math.ceil((double) layoutHelper2.getHorizontalPosition(intValue2, z4, z5)));
                        if (isRtlCharAt == z2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        i = m;
                        int ceil2 = (int) ((float) Math.ceil((double) layoutHelper2.getHorizontalPosition(intValue, z3, true)));
                        Layout layout3 = layout2;
                        arrayList.add(new Segment(intValue2, intValue, Math.min(ceil, ceil2), layout3.getLineTop(lineForOffset), Math.max(ceil, ceil2), layout3.getLineBottom(lineForOffset)));
                    } else {
                        i = m;
                    }
                    arrayList2.add(C11921v.f18618a);
                    num = num2;
                    m = i;
                    z4 = true;
                    z5 = false;
                }
                return arrayList;
            }
        }
        List unused = C12726w.m28524k();
        return arrayList;
    }

    private final List<Segment> breakSegmentWithDocument(LayoutHelper layoutHelper) {
        return C12723v.m28509d(new Segment(0, layoutHelper.getLayout().getText().length(), 0, 0, layoutHelper.getLayout().getWidth(), layoutHelper.getLayout().getHeight()));
    }

    private final List<Segment> breakSegmentWithLine(LayoutHelper layoutHelper, boolean z) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int lineCount = layoutHelper.getLayout().getLineCount();
        for (int i3 = 0; i3 < lineCount; i3++) {
            int lineStart = layout.getLineStart(i3);
            int lineEnd = layout.getLineEnd(i3);
            if (z) {
                i = (int) ((float) Math.ceil((double) layout.getLineLeft(i3)));
            } else {
                i = 0;
            }
            int lineTop = layout.getLineTop(i3);
            if (z) {
                i2 = (int) ((float) Math.ceil((double) layout.getLineRight(i3)));
            } else {
                i2 = layout.getWidth();
            }
            arrayList.add(new Segment(lineStart, lineEnd, i, lineTop, i2, layout.getLineBottom(i3)));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithParagraph(LayoutHelper layoutHelper) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i = 0; i < paragraphCount; i++) {
            int paragraphStart = layoutHelper.getParagraphStart(i);
            int paragraphEnd = layoutHelper.getParagraphEnd(i);
            arrayList.add(new Segment(paragraphStart, paragraphEnd, 0, layout.getLineTop(LayoutCompatKt.getLineForOffset(layout, paragraphStart, false)), layout.getWidth(), layout.getLineBottom(LayoutCompatKt.getLineForOffset(layout, paragraphEnd, true))));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithWord(LayoutHelper layoutHelper, boolean z) {
        boolean z2;
        boolean z3;
        int i;
        LayoutHelper layoutHelper2 = layoutHelper;
        Layout layout = layoutHelper.getLayout();
        int ceil = (int) ((float) Math.ceil((double) layout.getPaint().measureText(" ")));
        List<Integer> breakOffsets = breakOffsets(layoutHelper2, SegmentType.Word);
        if (breakOffsets.size() != 0) {
            boolean z4 = true;
            if (breakOffsets.size() != 1) {
                ArrayList arrayList = new ArrayList();
                boolean z5 = false;
                Integer num = breakOffsets.get(0);
                int m = C12726w.m28526m(breakOffsets);
                int i2 = 0;
                while (i2 < m) {
                    i2++;
                    Integer num2 = breakOffsets.get(i2);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    int lineForOffset = LayoutCompatKt.getLineForOffset(layout, intValue2, z5);
                    if (layout.getParagraphDirection(lineForOffset) == -1) {
                        z2 = z4;
                    } else {
                        z2 = z5;
                    }
                    boolean isRtlCharAt = layout.isRtlCharAt(intValue2);
                    if (isRtlCharAt != z2) {
                        z4 = z5;
                    }
                    int i3 = lineForOffset;
                    int ceil2 = (int) ((float) Math.ceil((double) layoutHelper2.getHorizontalPosition(intValue2, z4, z5)));
                    if (isRtlCharAt == z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i4 = m;
                    int ceil3 = (int) ((float) Math.ceil((double) layoutHelper2.getHorizontalPosition(intValue, z3, true)));
                    int min = Math.min(ceil2, ceil3);
                    int max = Math.max(ceil2, ceil3);
                    if (!z || intValue == 0 || layout.getText().charAt(intValue - 1) != ' ') {
                        i = i3;
                    } else {
                        i = i3;
                        if (layout.getLineEnd(i) != intValue) {
                            if (isRtlCharAt) {
                                min += ceil;
                            } else {
                                max -= ceil;
                            }
                        }
                    }
                    arrayList.add(new Segment(intValue2, intValue, min, layout.getLineTop(i), max, layout.getLineBottom(i)));
                    num = num2;
                    m = i4;
                    z4 = true;
                    z5 = false;
                }
                return arrayList;
            }
        }
        return C12726w.m28524k();
    }

    private final List<Integer> breakWithBreakIterator(CharSequence charSequence, BreakIterator breakIterator) {
        CharSequenceCharacterIterator charSequenceCharacterIterator = new CharSequenceCharacterIterator(charSequence, 0, charSequence.length());
        List<Integer> q = C12726w.m28530q(0);
        breakIterator.setText(charSequenceCharacterIterator);
        while (breakIterator.next() != -1) {
            q.add(Integer.valueOf(breakIterator.current()));
        }
        return q;
    }

    public final List<Integer> breakOffsets(LayoutHelper layoutHelper, SegmentType segmentType) {
        C12775o.m28639i(layoutHelper, "layoutHelper");
        C12775o.m28639i(segmentType, "segmentType");
        Layout layout = layoutHelper.getLayout();
        CharSequence text = layout.getText();
        int i = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        int i2 = 0;
        if (i == 1) {
            return C12726w.m28527n(0, Integer.valueOf(text.length()));
        } else if (i == 2) {
            List<Integer> q = C12726w.m28530q(0);
            int paragraphCount = layoutHelper.getParagraphCount();
            while (i2 < paragraphCount) {
                q.add(Integer.valueOf(layoutHelper.getParagraphEnd(i2)));
                i2++;
            }
            return q;
        } else if (i == 3) {
            List<Integer> q2 = C12726w.m28530q(0);
            int lineCount = layout.getLineCount();
            while (i2 < lineCount) {
                q2.add(Integer.valueOf(layout.getLineEnd(i2)));
                i2++;
            }
            return q2;
        } else if (i == 4) {
            return breakInWords(layoutHelper);
        } else {
            if (i == 5) {
                C12775o.m28638h(text, "text");
                BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
                C12775o.m28638h(characterInstance, "getCharacterInstance(Locale.getDefault())");
                return breakWithBreakIterator(text, characterInstance);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final List<Segment> breakSegments(LayoutHelper layoutHelper, SegmentType segmentType, boolean z) {
        C12775o.m28639i(layoutHelper, "layoutHelper");
        C12775o.m28639i(segmentType, "segmentType");
        int i = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i == 1) {
            return breakSegmentWithDocument(layoutHelper);
        }
        if (i == 2) {
            return breakSegmentWithParagraph(layoutHelper);
        }
        if (i == 3) {
            return breakSegmentWithLine(layoutHelper, z);
        }
        if (i == 4) {
            return breakSegmentWithWord(layoutHelper, z);
        }
        if (i == 5) {
            return breakSegmentWithChar(layoutHelper, z);
        }
        throw new NoWhenBranchMatchedException();
    }
}
