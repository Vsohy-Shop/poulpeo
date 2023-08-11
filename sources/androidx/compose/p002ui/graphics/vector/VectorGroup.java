package androidx.compose.p002ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Immutable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p412pf.C13212a;

@Immutable
/* renamed from: androidx.compose.ui.graphics.vector.VectorGroup */
/* compiled from: ImageVector.kt */
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, C13212a {
    public static final int $stable = 0;
    /* access modifiers changed from: private */
    public final List<VectorNode> children;
    private final List<PathNode> clipPathData;
    private final String name;
    private final float pivotX;
    private final float pivotY;
    private final float rotation;
    private final float scaleX;
    private final float scaleY;
    private final float translationX;
    private final float translationY;

    public VectorGroup() {
        this((String) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (List) null, (List) null, 1023, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof VectorGroup)) {
            return false;
        }
        VectorGroup vectorGroup = (VectorGroup) obj;
        if (!C12775o.m28634d(this.name, vectorGroup.name)) {
            return false;
        }
        if (this.rotation == vectorGroup.rotation) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.pivotX == vectorGroup.pivotX) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.pivotY == vectorGroup.pivotY) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (this.scaleX == vectorGroup.scaleX) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.scaleY == vectorGroup.scaleY) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        if (this.translationX == vectorGroup.translationX) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        if (this.translationY == vectorGroup.translationY) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7 && C12775o.m28634d(this.clipPathData, vectorGroup.clipPathData) && C12775o.m28634d(this.children, vectorGroup.children)) {
            return true;
        }
        return false;
    }

    public final VectorNode get(int i) {
        return this.children.get(i);
    }

    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    public final String getName() {
        return this.name;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSize() {
        return this.children.size();
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + Float.hashCode(this.rotation)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + this.clipPathData.hashCode()) * 31) + this.children.hashCode();
    }

    public Iterator<VectorNode> iterator() {
        return new VectorGroup$iterator$1(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VectorGroup(java.lang.String r11, float r12, float r13, float r14, float r15, float r16, float r17, float r18, java.util.List r19, java.util.List r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r10 = this;
            r0 = r21
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = ""
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0012
        L_0x0011:
            r2 = r12
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r3
            goto L_0x0019
        L_0x0018:
            r4 = r13
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r3
            goto L_0x0020
        L_0x001f:
            r5 = r14
        L_0x0020:
            r6 = r0 & 16
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x0028
            r6 = r7
            goto L_0x0029
        L_0x0028:
            r6 = r15
        L_0x0029:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r7 = r16
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r3
            goto L_0x0038
        L_0x0036:
            r8 = r17
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r3 = r18
        L_0x003f:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0048
            java.util.List r9 = androidx.compose.p002ui.graphics.vector.VectorKt.getEmptyPath()
            goto L_0x004a
        L_0x0048:
            r9 = r19
        L_0x004a:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0053
            java.util.List r0 = kotlin.collections.C12726w.m28524k()
            goto L_0x0055
        L_0x0053:
            r0 = r20
        L_0x0055:
            r11 = r10
            r12 = r1
            r13 = r2
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r3
            r20 = r9
            r21 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.vector.VectorGroup.<init>(java.lang.String, float, float, float, float, float, float, float, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorGroup(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends PathNode> list, List<? extends VectorNode> list2) {
        super((DefaultConstructorMarker) null);
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(list, "clipPathData");
        C12775o.m28639i(list2, "children");
        this.name = str;
        this.rotation = f;
        this.pivotX = f2;
        this.pivotY = f3;
        this.scaleX = f4;
        this.scaleY = f5;
        this.translationX = f6;
        this.translationY = f7;
        this.clipPathData = list;
        this.children = list2;
    }
}
