package androidx.compose.p002ui.text;

import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.ParagraphIntrinsicInfo */
/* compiled from: MultiParagraphIntrinsics.kt */
public final class ParagraphIntrinsicInfo {
    private final int endIndex;
    private final ParagraphIntrinsics intrinsics;
    private final int startIndex;

    public ParagraphIntrinsicInfo(ParagraphIntrinsics paragraphIntrinsics, int i, int i2) {
        C12775o.m28639i(paragraphIntrinsics, "intrinsics");
        this.intrinsics = paragraphIntrinsics;
        this.startIndex = i;
        this.endIndex = i2;
    }

    public static /* synthetic */ ParagraphIntrinsicInfo copy$default(ParagraphIntrinsicInfo paragraphIntrinsicInfo, ParagraphIntrinsics paragraphIntrinsics, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            paragraphIntrinsics = paragraphIntrinsicInfo.intrinsics;
        }
        if ((i3 & 2) != 0) {
            i = paragraphIntrinsicInfo.startIndex;
        }
        if ((i3 & 4) != 0) {
            i2 = paragraphIntrinsicInfo.endIndex;
        }
        return paragraphIntrinsicInfo.copy(paragraphIntrinsics, i, i2);
    }

    public final ParagraphIntrinsics component1() {
        return this.intrinsics;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final ParagraphIntrinsicInfo copy(ParagraphIntrinsics paragraphIntrinsics, int i, int i2) {
        C12775o.m28639i(paragraphIntrinsics, "intrinsics");
        return new ParagraphIntrinsicInfo(paragraphIntrinsics, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphIntrinsicInfo)) {
            return false;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
        if (C12775o.m28634d(this.intrinsics, paragraphIntrinsicInfo.intrinsics) && this.startIndex == paragraphIntrinsicInfo.startIndex && this.endIndex == paragraphIntrinsicInfo.endIndex) {
            return true;
        }
        return false;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final ParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public int hashCode() {
        return (((this.intrinsics.hashCode() * 31) + Integer.hashCode(this.startIndex)) * 31) + Integer.hashCode(this.endIndex);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.intrinsics + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ')';
    }
}
