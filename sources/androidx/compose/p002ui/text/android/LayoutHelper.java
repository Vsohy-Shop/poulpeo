package androidx.compose.p002ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLayoutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,377:1\n1#2:378\n1627#3,6:379\n1627#3,6:385\n*S KotlinDebug\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n*L\n283#1:379,6\n322#1:385,6\n*E\n"})
@InternalPlatformTextApi
/* renamed from: androidx.compose.ui.text.android.LayoutHelper */
/* compiled from: LayoutHelper.kt */
public final class LayoutHelper {
    public static final int $stable = 8;
    private final boolean[] bidiProcessedParagraphs;
    private final Layout layout;
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;
    private final List<Integer> paragraphEnds;
    private char[] tmpBuffer;

    /* renamed from: androidx.compose.ui.text.android.LayoutHelper$BidiRun */
    /* compiled from: LayoutHelper.kt */
    private static final class BidiRun {
        private final int end;
        private final boolean isRtl;
        private final int start;

        public BidiRun(int i, int i2, boolean z) {
            this.start = i;
            this.end = i2;
            this.isRtl = z;
        }

        public static /* synthetic */ BidiRun copy$default(BidiRun bidiRun, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = bidiRun.start;
            }
            if ((i3 & 2) != 0) {
                i2 = bidiRun.end;
            }
            if ((i3 & 4) != 0) {
                z = bidiRun.isRtl;
            }
            return bidiRun.copy(i, i2, z);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final boolean component3() {
            return this.isRtl;
        }

        public final BidiRun copy(int i, int i2, boolean z) {
            return new BidiRun(i, i2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) obj;
            if (this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl) {
                return true;
            }
            return false;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31;
            boolean z = this.isRtl;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final boolean isRtl() {
            return this.isRtl;
        }

        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }
    }

    public LayoutHelper(Layout layout2) {
        int i;
        C12775o.m28639i(layout2, "layout");
        this.layout = layout2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            CharSequence text = this.layout.getText();
            C12775o.m28638h(text, "layout.text");
            int V = C13755w.m31570V(text, 10, i2, false, 4, (Object) null);
            if (V < 0) {
                i = this.layout.getText().length();
            } else {
                i = V + 1;
            }
            i2 = i;
            arrayList.add(Integer.valueOf(i2));
        } while (i2 < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add((Object) null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    private final float getDownstreamHorizontal(int i, boolean z) {
        if (z) {
            return this.layout.getPrimaryHorizontal(i);
        }
        return this.layout.getSecondaryHorizontal(i);
    }

    public static /* synthetic */ int getParagraphForOffset$default(LayoutHelper layoutHelper, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return layoutHelper.getParagraphForOffset(i, z);
    }

    private final int lineEndToVisibleEnd(int i) {
        while (i > 0 && isLineEndSpace(this.layout.getText().charAt(i - 1))) {
            i--;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        if (r3.getRunCount() == 1) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.text.Bidi analyzeBidi(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.bidiProcessedParagraphs
            boolean r0 = r0[r12]
            if (r0 == 0) goto L_0x000f
            java.util.List<java.text.Bidi> r0 = r11.paragraphBidi
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        L_0x000f:
            r0 = 0
            if (r12 != 0) goto L_0x0014
            r1 = r0
            goto L_0x0022
        L_0x0014:
            java.util.List<java.lang.Integer> r1 = r11.paragraphEnds
            int r2 = r12 + -1
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L_0x0022:
            java.util.List<java.lang.Integer> r2 = r11.paragraphEnds
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.tmpBuffer
            if (r3 == 0) goto L_0x0037
            int r4 = r3.length
            if (r4 >= r8) goto L_0x0039
        L_0x0037:
            char[] r3 = new char[r8]
        L_0x0039:
            r10 = r3
            android.text.Layout r3 = r11.layout
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005f
            boolean r9 = r11.isRtlParagraph(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L_0x0060
        L_0x005f:
            r0 = r1
        L_0x0060:
            java.util.List<java.text.Bidi> r3 = r11.paragraphBidi
            r3.set(r12, r0)
            boolean[] r3 = r11.bidiProcessedParagraphs
            r3[r12] = r2
            if (r0 == 0) goto L_0x0072
            char[] r12 = r11.tmpBuffer
            if (r10 != r12) goto L_0x0071
            r10 = r1
            goto L_0x0072
        L_0x0071:
            r10 = r12
        L_0x0072:
            r11.tmpBuffer = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.android.LayoutHelper.analyzeBidi(int):java.text.Bidi");
    }

    public final float getHorizontalPosition(int i, boolean z, boolean z2) {
        Bidi bidi;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2 = i;
        boolean z6 = z2;
        if (!z6) {
            return getDownstreamHorizontal(i, z);
        }
        int lineForOffset = LayoutCompatKt.getLineForOffset(this.layout, i2, z6);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (i2 != lineStart && i2 != lineEnd) {
            return getDownstreamHorizontal(i, z);
        }
        if (i2 == 0 || i2 == this.layout.getText().length()) {
            return getDownstreamHorizontal(i, z);
        }
        int paragraphForOffset = getParagraphForOffset(i2, z6);
        boolean isRtlParagraph = isRtlParagraph(paragraphForOffset);
        int lineEndToVisibleEnd = lineEndToVisibleEnd(lineEnd);
        int paragraphStart = getParagraphStart(paragraphForOffset);
        int i3 = lineStart - paragraphStart;
        int i4 = lineEndToVisibleEnd - paragraphStart;
        Bidi analyzeBidi = analyzeBidi(paragraphForOffset);
        if (analyzeBidi != null) {
            bidi = analyzeBidi.createLineBidi(i3, i4);
        } else {
            bidi = null;
        }
        boolean z7 = false;
        if (bidi == null || bidi.getRunCount() == 1) {
            boolean isRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (z || isRtlParagraph == isRtlCharAt) {
                if (!isRtlParagraph) {
                    isRtlParagraph = true;
                } else {
                    isRtlParagraph = false;
                }
            }
            if (i2 == lineStart) {
                z7 = isRtlParagraph;
            } else if (!isRtlParagraph) {
                z7 = true;
            }
            Layout layout2 = this.layout;
            if (z7) {
                return layout2.getLineLeft(lineForOffset);
            }
            return layout2.getLineRight(lineForOffset);
        }
        int runCount = bidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i5 = 0; i5 < runCount; i5++) {
            int runStart = bidi.getRunStart(i5) + lineStart;
            int runLimit = bidi.getRunLimit(i5) + lineStart;
            if (bidi.getRunLevel(i5) % 2 == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            bidiRunArr[i5] = new BidiRun(runStart, runLimit, z5);
        }
        int runCount2 = bidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i6 = 0; i6 < runCount2; i6++) {
            bArr[i6] = (byte) bidi.getRunLevel(i6);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i7 = -1;
        if (i2 == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    break;
                }
                if (bidiRunArr[i8].getStart() == i2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    i7 = i8;
                    break;
                }
                i8++;
            }
            BidiRun bidiRun = bidiRunArr[i7];
            if (z || isRtlParagraph == bidiRun.isRtl()) {
                if (!isRtlParagraph) {
                    isRtlParagraph = true;
                } else {
                    isRtlParagraph = false;
                }
            }
            if (i7 == 0 && isRtlParagraph) {
                return this.layout.getLineLeft(lineForOffset);
            }
            if (i7 == C12710p.m28385M(bidiRunArr) && !isRtlParagraph) {
                return this.layout.getLineRight(lineForOffset);
            }
            if (isRtlParagraph) {
                return this.layout.getPrimaryHorizontal(bidiRunArr[i7 - 1].getStart());
            }
            return this.layout.getPrimaryHorizontal(bidiRunArr[i7 + 1].getStart());
        }
        if (i2 > lineEndToVisibleEnd) {
            i2 = lineEndToVisibleEnd(i);
        }
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                break;
            }
            if (bidiRunArr[i9].getEnd() == i2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                i7 = i9;
                break;
            }
            i9++;
        }
        BidiRun bidiRun2 = bidiRunArr[i7];
        if (!z && isRtlParagraph != bidiRun2.isRtl()) {
            isRtlParagraph = !isRtlParagraph;
        }
        if (i7 == 0 && isRtlParagraph) {
            return this.layout.getLineLeft(lineForOffset);
        }
        if (i7 == C12710p.m28385M(bidiRunArr) && !isRtlParagraph) {
            return this.layout.getLineRight(lineForOffset);
        }
        if (isRtlParagraph) {
            return this.layout.getPrimaryHorizontal(bidiRunArr[i7 - 1].getEnd());
        }
        return this.layout.getPrimaryHorizontal(bidiRunArr[i7 + 1].getEnd());
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public final int getParagraphEnd(@IntRange(from = 0) int i) {
        return this.paragraphEnds.get(i).intValue();
    }

    public final int getParagraphForOffset(@IntRange(from = 0) int i, boolean z) {
        int i2;
        int j = C12726w.m28523j(this.paragraphEnds, Integer.valueOf(i), 0, 0, 6, (Object) null);
        if (j < 0) {
            i2 = -(j + 1);
        } else {
            i2 = j + 1;
        }
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == this.paragraphEnds.get(i3).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int getParagraphStart(@IntRange(from = 0) int i) {
        if (i == 0) {
            return 0;
        }
        return this.paragraphEnds.get(i - 1).intValue();
    }

    public final boolean isLineEndSpace(char c) {
        boolean z;
        if (c == ' ' || c == 10 || c == 5760) {
            return true;
        }
        if (8192 > c || c >= 8203) {
            z = false;
        } else {
            z = true;
        }
        if ((z && c != 8199) || c == 8287 || c == 12288) {
            return true;
        }
        return false;
    }

    public final boolean isRtlParagraph(@IntRange(from = 0) int i) {
        if (this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(i))) == -1) {
            return true;
        }
        return false;
    }
}
