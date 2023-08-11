package androidx.compose.p002ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.p002ui.graphics.BlendMode;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.vector.ImageVector */
/* compiled from: ImageVector.kt */
public final class ImageVector {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final boolean autoMirror;
    private final float defaultHeight;
    private final float defaultWidth;
    private final String name;
    private final VectorGroup root;
    private final int tintBlendMode;
    private final long tintColor;
    private final float viewportHeight;
    private final float viewportWidth;

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.ImageVector$Builder */
    /* compiled from: ImageVector.kt */
    public static final class Builder {
        public static final int $stable = 8;
        private final boolean autoMirror;
        private final float defaultHeight;
        private final float defaultWidth;
        private boolean isConsumed;
        private final String name;
        private final ArrayList<GroupParams> nodes;
        private GroupParams root;
        private final int tintBlendMode;
        private final long tintColor;
        private final float viewportHeight;
        private final float viewportWidth;

        /* renamed from: androidx.compose.ui.graphics.vector.ImageVector$Builder$GroupParams */
        /* compiled from: ImageVector.kt */
        private static final class GroupParams {
            private List<VectorNode> children;
            private List<? extends PathNode> clipPathData;
            private String name;
            private float pivotX;
            private float pivotY;
            private float rotate;
            private float scaleX;
            private float scaleY;
            private float translationX;
            private float translationY;

            public GroupParams() {
                this((String) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (List) null, (List) null, 1023, (DefaultConstructorMarker) null);
            }

            public final List<VectorNode> getChildren() {
                return this.children;
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

            public final float getRotate() {
                return this.rotate;
            }

            public final float getScaleX() {
                return this.scaleX;
            }

            public final float getScaleY() {
                return this.scaleY;
            }

            public final float getTranslationX() {
                return this.translationX;
            }

            public final float getTranslationY() {
                return this.translationY;
            }

            public final void setChildren(List<VectorNode> list) {
                C12775o.m28639i(list, "<set-?>");
                this.children = list;
            }

            public final void setClipPathData(List<? extends PathNode> list) {
                C12775o.m28639i(list, "<set-?>");
                this.clipPathData = list;
            }

            public final void setName(String str) {
                C12775o.m28639i(str, "<set-?>");
                this.name = str;
            }

            public final void setPivotX(float f) {
                this.pivotX = f;
            }

            public final void setPivotY(float f) {
                this.pivotY = f;
            }

            public final void setRotate(float f) {
                this.rotate = f;
            }

            public final void setScaleX(float f) {
                this.scaleX = f;
            }

            public final void setScaleY(float f) {
                this.scaleY = f;
            }

            public final void setTranslationX(float f) {
                this.translationX = f;
            }

            public final void setTranslationY(float f) {
                this.translationY = f;
            }

            public GroupParams(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends PathNode> list, List<VectorNode> list2) {
                C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
                C12775o.m28639i(list, "clipPathData");
                C12775o.m28639i(list2, "children");
                this.name = str;
                this.rotate = f;
                this.pivotX = f2;
                this.pivotY = f3;
                this.scaleX = f4;
                this.scaleY = f5;
                this.translationX = f6;
                this.translationY = f7;
                this.clipPathData = list;
                this.children = list2;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ GroupParams(java.lang.String r11, float r12, float r13, float r14, float r15, float r16, float r17, float r18, java.util.List r19, java.util.List r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
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
                    if (r0 == 0) goto L_0x0054
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    goto L_0x0056
                L_0x0054:
                    r0 = r20
                L_0x0056:
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
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.vector.ImageVector.Builder.GroupParams.<init>(java.lang.String, float, float, float, float, float, float, float, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, f2, f3, f4, j, i);
        }

        public static /* synthetic */ Builder addGroup$default(Builder builder, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i, Object obj) {
            String str2;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            List list2;
            int i2 = i;
            if ((i2 & 1) != 0) {
                str2 = "";
            } else {
                str2 = str;
            }
            float f13 = 0.0f;
            if ((i2 & 2) != 0) {
                f8 = 0.0f;
            } else {
                f8 = f;
            }
            if ((i2 & 4) != 0) {
                f9 = 0.0f;
            } else {
                f9 = f2;
            }
            if ((i2 & 8) != 0) {
                f10 = 0.0f;
            } else {
                f10 = f3;
            }
            float f14 = 1.0f;
            if ((i2 & 16) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f4;
            }
            if ((i2 & 32) == 0) {
                f14 = f5;
            }
            if ((i2 & 64) != 0) {
                f12 = 0.0f;
            } else {
                f12 = f6;
            }
            if ((i2 & 128) == 0) {
                f13 = f7;
            }
            if ((i2 & 256) != 0) {
                list2 = VectorKt.getEmptyPath();
            } else {
                list2 = list;
            }
            return builder.addGroup(str2, f8, f9, f10, f11, f14, f12, f13, list2);
        }

        /* renamed from: addPath-oIyEayM$default  reason: not valid java name */
        public static /* synthetic */ Builder m36375addPathoIyEayM$default(Builder builder, List list, int i, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4, Object obj) {
            int i5;
            String str2;
            Brush brush3;
            float f8;
            float f9;
            float f10;
            int i6;
            int i7;
            float f11;
            float f12;
            int i8 = i4;
            if ((i8 & 2) != 0) {
                i5 = VectorKt.getDefaultFillType();
            } else {
                i5 = i;
            }
            if ((i8 & 4) != 0) {
                str2 = "";
            } else {
                str2 = str;
            }
            Brush brush4 = null;
            if ((i8 & 8) != 0) {
                brush3 = null;
            } else {
                brush3 = brush;
            }
            float f13 = 1.0f;
            if ((i8 & 16) != 0) {
                f8 = 1.0f;
            } else {
                f8 = f;
            }
            if ((i8 & 32) == 0) {
                brush4 = brush2;
            }
            if ((i8 & 64) != 0) {
                f9 = 1.0f;
            } else {
                f9 = f2;
            }
            float f14 = 0.0f;
            if ((i8 & 128) != 0) {
                f10 = 0.0f;
            } else {
                f10 = f3;
            }
            if ((i8 & 256) != 0) {
                i6 = VectorKt.getDefaultStrokeLineCap();
            } else {
                i6 = i2;
            }
            if ((i8 & 512) != 0) {
                i7 = VectorKt.getDefaultStrokeLineJoin();
            } else {
                i7 = i3;
            }
            if ((i8 & 1024) != 0) {
                f11 = 4.0f;
            } else {
                f11 = f4;
            }
            if ((i8 & 2048) != 0) {
                f12 = 0.0f;
            } else {
                f12 = f5;
            }
            if ((i8 & 4096) == 0) {
                f13 = f6;
            }
            if ((i8 & 8192) == 0) {
                f14 = f7;
            }
            return builder.m36376addPathoIyEayM(list, i5, str2, brush3, f8, brush4, f9, f10, i6, i7, f11, f12, f13, f14);
        }

        private final VectorGroup asVectorGroup(GroupParams groupParams) {
            return new VectorGroup(groupParams.getName(), groupParams.getRotate(), groupParams.getPivotX(), groupParams.getPivotY(), groupParams.getScaleX(), groupParams.getScaleY(), groupParams.getTranslationX(), groupParams.getTranslationY(), groupParams.getClipPathData(), groupParams.getChildren());
        }

        private final void ensureNotConsumed() {
            if (!(!this.isConsumed)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }

        private final GroupParams getCurrentGroup() {
            return (GroupParams) ImageVectorKt.peek(this.nodes);
        }

        public final Builder addGroup(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends PathNode> list) {
            String str2 = str;
            C12775o.m28639i(str2, HintConstants.AUTOFILL_HINT_NAME);
            List<? extends PathNode> list2 = list;
            C12775o.m28639i(list2, "clipPathData");
            ensureNotConsumed();
            boolean unused = ImageVectorKt.push(this.nodes, new GroupParams(str2, f, f2, f3, f4, f5, f6, f7, list2, (List) null, 512, (DefaultConstructorMarker) null));
            return this;
        }

        /* renamed from: addPath-oIyEayM  reason: not valid java name */
        public final Builder m36376addPathoIyEayM(List<? extends PathNode> list, int i, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
            List<? extends PathNode> list2 = list;
            C12775o.m28639i(list2, "pathData");
            String str2 = str;
            C12775o.m28639i(str2, HintConstants.AUTOFILL_HINT_NAME);
            ensureNotConsumed();
            List<VectorNode> children = getCurrentGroup().getChildren();
            VectorPath vectorPath = r1;
            VectorPath vectorPath2 = new VectorPath(str2, list2, i, brush, f, brush2, f2, f3, i2, i3, f4, f5, f6, f7, (DefaultConstructorMarker) null);
            children.add(vectorPath);
            return this;
        }

        public final ImageVector build() {
            ensureNotConsumed();
            while (this.nodes.size() > 1) {
                clearGroup();
            }
            ImageVector imageVector = new ImageVector(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, asVectorGroup(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, (DefaultConstructorMarker) null);
            this.isConsumed = true;
            return imageVector;
        }

        public final Builder clearGroup() {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(asVectorGroup((GroupParams) ImageVectorKt.pop(this.nodes)));
            return this;
        }

        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, f2, f3, f4, j, i, z);
        }

        private Builder(String str, float f, float f2, float f3, float f4, long j, int i, boolean z) {
            this.name = str;
            this.defaultWidth = f;
            this.defaultHeight = f2;
            this.viewportWidth = f3;
            this.viewportHeight = f4;
            this.tintColor = j;
            this.tintBlendMode = i;
            this.autoMirror = z;
            ArrayList<GroupParams> arrayList = new ArrayList<>();
            this.nodes = arrayList;
            GroupParams groupParams = new GroupParams((String) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (List) null, (List) null, 1023, (DefaultConstructorMarker) null);
            this.root = groupParams;
            boolean unused = ImageVectorKt.push(arrayList, groupParams);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Builder(java.lang.String r14, float r15, float r16, float r17, float r18, long r19, int r21, boolean r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
            /*
                r13 = this;
                r0 = r23
                r1 = r0 & 1
                if (r1 == 0) goto L_0x000a
                java.lang.String r1 = ""
                r3 = r1
                goto L_0x000b
            L_0x000a:
                r3 = r14
            L_0x000b:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0017
                androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.p002ui.graphics.Color.Companion
                long r1 = r1.m35707getUnspecified0d7_KjU()
                r8 = r1
                goto L_0x0019
            L_0x0017:
                r8 = r19
            L_0x0019:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0025
                androidx.compose.ui.graphics.BlendMode$Companion r1 = androidx.compose.p002ui.graphics.BlendMode.Companion
                int r1 = r1.m35602getSrcIn0nO6VwU()
                r10 = r1
                goto L_0x0027
            L_0x0025:
                r10 = r21
            L_0x0027:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x002e
                r0 = 0
                r11 = r0
                goto L_0x0030
            L_0x002e:
                r11 = r22
            L_0x0030:
                r12 = 0
                r2 = r13
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r18
                r2.<init>((java.lang.String) r3, (float) r4, (float) r5, (float) r6, (float) r7, (long) r8, (int) r10, (boolean) r11, (kotlin.jvm.internal.DefaultConstructorMarker) r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.vector.ImageVector.Builder.<init>(java.lang.String, float, float, float, float, long, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? Color.Companion.m35707getUnspecified0d7_KjU() : j, (i2 & 64) != 0 ? BlendMode.Companion.m35602getSrcIn0nO6VwU() : i, (DefaultConstructorMarker) null);
        }

        private Builder(String str, float f, float f2, float f3, float f4, long j, int i) {
            this(str, f, f2, f3, f4, j, i, false, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.ImageVector$Companion */
    /* compiled from: ImageVector.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ImageVector(String str, float f, float f2, float f3, float f4, VectorGroup vectorGroup, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, f2, f3, f4, vectorGroup, j, i, z);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        if (!C12775o.m28634d(this.name, imageVector.name) || !C1232Dp.m38473equalsimpl0(this.defaultWidth, imageVector.defaultWidth) || !C1232Dp.m38473equalsimpl0(this.defaultHeight, imageVector.defaultHeight)) {
            return false;
        }
        if (this.viewportWidth == imageVector.viewportWidth) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.viewportHeight == imageVector.viewportHeight) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && C12775o.m28634d(this.root, imageVector.root) && Color.m35672equalsimpl0(this.tintColor, imageVector.tintColor) && BlendMode.m35573equalsimpl0(this.tintBlendMode, imageVector.tintBlendMode) && this.autoMirror == imageVector.autoMirror) {
            return true;
        }
        return false;
    }

    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    /* renamed from: getDefaultHeight-D9Ej5fM  reason: not valid java name */
    public final float m36371getDefaultHeightD9Ej5fM() {
        return this.defaultHeight;
    }

    /* renamed from: getDefaultWidth-D9Ej5fM  reason: not valid java name */
    public final float m36372getDefaultWidthD9Ej5fM() {
        return this.defaultWidth;
    }

    public final String getName() {
        return this.name;
    }

    public final VectorGroup getRoot() {
        return this.root;
    }

    /* renamed from: getTintBlendMode-0nO6VwU  reason: not valid java name */
    public final int m36373getTintBlendMode0nO6VwU() {
        return this.tintBlendMode;
    }

    /* renamed from: getTintColor-0d7_KjU  reason: not valid java name */
    public final long m36374getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + C1232Dp.m38474hashCodeimpl(this.defaultWidth)) * 31) + C1232Dp.m38474hashCodeimpl(this.defaultHeight)) * 31) + Float.hashCode(this.viewportWidth)) * 31) + Float.hashCode(this.viewportHeight)) * 31) + this.root.hashCode()) * 31) + Color.m35678hashCodeimpl(this.tintColor)) * 31) + BlendMode.m35574hashCodeimpl(this.tintBlendMode)) * 31) + Boolean.hashCode(this.autoMirror);
    }

    private ImageVector(String str, float f, float f2, float f3, float f4, VectorGroup vectorGroup, long j, int i, boolean z) {
        this.name = str;
        this.defaultWidth = f;
        this.defaultHeight = f2;
        this.viewportWidth = f3;
        this.viewportHeight = f4;
        this.root = vectorGroup;
        this.tintColor = j;
        this.tintBlendMode = i;
        this.autoMirror = z;
    }
}
