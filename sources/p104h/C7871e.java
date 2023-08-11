package p104h;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.draw.DrawModifier;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.painter.Painter;
import androidx.compose.p002ui.layout.ContentScale;
import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.layout.ScaleFactorKt;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.IntOffset;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nContentPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentPainterModifier.kt\ncoil/compose/ContentPainterModifier\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 Utils.kt\ncoil/compose/UtilsKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,196:1\n135#2:197\n152#3:198\n152#3:199\n152#3:200\n152#3:201\n159#3:202\n159#3:205\n87#4:203\n87#4:204\n66#5:206\n70#5:207\n66#5,5:208\n120#6,4:213\n*S KotlinDebug\n*F\n+ 1 ContentPainterModifier.kt\ncoil/compose/ContentPainterModifier\n*L\n38#1:197\n62#1:198\n76#1:199\n90#1:200\n104#1:201\n118#1:202\n138#1:205\n121#1:203\n122#1:204\n156#1:206\n158#1:207\n170#1:208,5\n186#1:213,4\n*E\n"})
/* renamed from: h.e */
/* compiled from: ContentPainterModifier.kt */
public final class C7871e extends InspectorValueInfo implements LayoutModifier, DrawModifier {

    /* renamed from: b */
    private final Painter f10988b;

    /* renamed from: c */
    private final Alignment f10989c;

    /* renamed from: d */
    private final ContentScale f10990d;

    /* renamed from: e */
    private final float f10991e;

    /* renamed from: f */
    private final ColorFilter f10992f;

    /* renamed from: h.e$a */
    /* compiled from: ContentPainterModifier.kt */
    static final class C7872a extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {

        /* renamed from: g */
        final /* synthetic */ Placeable f10993g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7872a(Placeable placeable) {
            super(1);
            this.f10993g = placeable;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return C11921v.f18618a;
        }

        public final void invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.placeRelative$default(placementScope, this.f10993g, 0, 0, 0.0f, 4, (Object) null);
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 ContentPainterModifier.kt\ncoil/compose/ContentPainterModifier\n*L\n1#1,170:1\n39#2,7:171\n*E\n"})
    /* renamed from: h.e$b */
    /* compiled from: InspectableValue.kt */
    public static final class C7873b extends C12777p implements Function1<InspectorInfo, C11921v> {

        /* renamed from: g */
        final /* synthetic */ Painter f10994g;

        /* renamed from: h */
        final /* synthetic */ Alignment f10995h;

        /* renamed from: i */
        final /* synthetic */ ContentScale f10996i;

        /* renamed from: j */
        final /* synthetic */ float f10997j;

        /* renamed from: k */
        final /* synthetic */ ColorFilter f10998k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7873b(Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
            super(1);
            this.f10994g = painter;
            this.f10995h = alignment;
            this.f10996i = contentScale;
            this.f10997j = f;
            this.f10998k = colorFilter;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InspectorInfo) obj);
            return C11921v.f18618a;
        }

        public final void invoke(InspectorInfo inspectorInfo) {
            C12775o.m28639i(inspectorInfo, "$this$null");
            inspectorInfo.setName("content");
            inspectorInfo.getProperties().set("painter", this.f10994g);
            inspectorInfo.getProperties().set("alignment", this.f10995h);
            inspectorInfo.getProperties().set("contentScale", this.f10996i);
            inspectorInfo.getProperties().set("alpha", Float.valueOf(this.f10997j));
            inspectorInfo.getProperties().set("colorFilter", this.f10998k);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: h.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: h.e$b} */
    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7871e(androidx.compose.p002ui.graphics.painter.Painter r8, androidx.compose.p002ui.Alignment r9, androidx.compose.p002ui.layout.ContentScale r10, float r11, androidx.compose.p002ui.graphics.ColorFilter r12) {
        /*
            r7 = this;
            boolean r0 = androidx.compose.p002ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r0 == 0) goto L_0x0012
            h.e$b r0 = new h.e$b
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0016
        L_0x0012:
            kotlin.jvm.functions.Function1 r0 = androidx.compose.p002ui.platform.InspectableValueKt.getNoInspectorInfo()
        L_0x0016:
            r7.<init>(r0)
            r7.f10988b = r8
            r7.f10989c = r9
            r7.f10990d = r10
            r7.f10991e = r11
            r7.f10992f = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p104h.C7871e.<init>(androidx.compose.ui.graphics.painter.Painter, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, float, androidx.compose.ui.graphics.ColorFilter):void");
    }

    /* renamed from: a */
    private final long m15395a(long j) {
        boolean z;
        boolean z2;
        if (Size.m35493isEmptyimpl(j)) {
            return Size.Companion.m35500getZeroNHjbRc();
        }
        long r0 = this.f10988b.m36369getIntrinsicSizeNHjbRc();
        boolean z3 = true;
        if (r0 == Size.Companion.m35499getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return j;
        }
        float r2 = Size.m35491getWidthimpl(r0);
        if (Float.isInfinite(r2) || Float.isNaN(r2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            r2 = Size.m35491getWidthimpl(j);
        }
        float r02 = Size.m35488getHeightimpl(r0);
        if (Float.isInfinite(r02) || Float.isNaN(r02)) {
            z3 = false;
        }
        if (!z3) {
            r02 = Size.m35488getHeightimpl(j);
        }
        long Size = SizeKt.Size(r2, r02);
        return ScaleFactorKt.m37440timesUQTWf7w(Size, this.f10990d.m37308computeScaleFactorH7hwNQA(Size, j));
    }

    /* renamed from: b */
    private final long m15396b(long j) {
        boolean z;
        boolean z2;
        float f;
        float f2;
        boolean z3;
        int r3;
        boolean r2 = Constraints.m38410getHasFixedWidthimpl(j);
        boolean r32 = Constraints.m38409getHasFixedHeightimpl(j);
        if (r2 && r32) {
            return j;
        }
        boolean z4 = true;
        if (!Constraints.m38408getHasBoundedWidthimpl(j) || !Constraints.m38407getHasBoundedHeightimpl(j)) {
            z = false;
        } else {
            z = true;
        }
        long r7 = this.f10988b.m36369getIntrinsicSizeNHjbRc();
        if (r7 == Size.Companion.m35499getUnspecifiedNHjbRc()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!z || (!r2 && !r32)) {
                float r22 = Size.m35491getWidthimpl(r7);
                float r33 = Size.m35488getHeightimpl(r7);
                if (Float.isInfinite(r22) || Float.isNaN(r22)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    f2 = C7879j.m15413b(j, r22);
                } else {
                    f2 = (float) Constraints.m38414getMinWidthimpl(j);
                }
                if (Float.isInfinite(r33) || Float.isNaN(r33)) {
                    z4 = false;
                }
                if (z4) {
                    f = C7879j.m15412a(j, r33);
                    long a = m15395a(SizeKt.Size(f2, f));
                    return Constraints.m38403copyZbe2FdA$default(j, ConstraintsKt.m38426constrainWidthK40F9xA(j, C13265c.m30134c(Size.m35491getWidthimpl(a))), 0, ConstraintsKt.m38425constrainHeightK40F9xA(j, C13265c.m30134c(Size.m35488getHeightimpl(a))), 0, 10, (Object) null);
                }
                r3 = Constraints.m38413getMinHeightimpl(j);
            } else {
                f2 = (float) Constraints.m38412getMaxWidthimpl(j);
                r3 = Constraints.m38411getMaxHeightimpl(j);
            }
            f = (float) r3;
            long a2 = m15395a(SizeKt.Size(f2, f));
            return Constraints.m38403copyZbe2FdA$default(j, ConstraintsKt.m38426constrainWidthK40F9xA(j, C13265c.m30134c(Size.m35491getWidthimpl(a2))), 0, ConstraintsKt.m38425constrainHeightK40F9xA(j, C13265c.m30134c(Size.m35488getHeightimpl(a2))), 0, 10, (Object) null);
        } else if (!z) {
            return j;
        } else {
            return Constraints.m38403copyZbe2FdA$default(j, Constraints.m38412getMaxWidthimpl(j), 0, Constraints.m38411getMaxHeightimpl(j), 0, 10, (Object) null);
        }
    }

    public void draw(ContentDrawScope contentDrawScope) {
        long a = m15395a(contentDrawScope.m36274getSizeNHjbRc());
        long r0 = this.f10989c.m35310alignKFBX0sM(C7879j.m15416e(a), C7879j.m15416e(contentDrawScope.m36274getSizeNHjbRc()), contentDrawScope.getLayoutDirection());
        float r1 = (float) IntOffset.m38578component1impl(r0);
        float r02 = (float) IntOffset.m38579component2impl(r0);
        contentDrawScope.getDrawContext().getTransform().translate(r1, r02);
        this.f10988b.m36368drawx_KDEd0(contentDrawScope, a, this.f10991e, this.f10992f);
        contentDrawScope.getDrawContext().getTransform().translate(-r1, -r02);
        contentDrawScope.drawContent();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7871e)) {
            return false;
        }
        C7871e eVar = (C7871e) obj;
        if (C12775o.m28634d(this.f10988b, eVar.f10988b) && C12775o.m28634d(this.f10989c, eVar.f10989c) && C12775o.m28634d(this.f10990d, eVar.f10990d) && Float.compare(this.f10991e, eVar.f10991e) == 0 && C12775o.m28634d(this.f10992f, eVar.f10992f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((((this.f10988b.hashCode() * 31) + this.f10989c.hashCode()) * 31) + this.f10990d.hashCode()) * 31) + Float.hashCode(this.f10991e)) * 31;
        ColorFilter colorFilter = this.f10992f;
        if (colorFilter == null) {
            i = 0;
        } else {
            i = colorFilter.hashCode();
        }
        return hashCode + i;
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        boolean z;
        if (this.f10988b.m36369getIntrinsicSizeNHjbRc() != Size.Companion.m35499getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(Constraints.m38412getMaxWidthimpl(m15396b(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, (Object) null))));
        return Math.max(C13265c.m30134c(Size.m35488getHeightimpl(m15395a(SizeKt.Size((float) i, (float) maxIntrinsicHeight)))), maxIntrinsicHeight);
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        boolean z;
        if (this.f10988b.m36369getIntrinsicSizeNHjbRc() != Size.Companion.m35499getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }
        int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(Constraints.m38411getMaxHeightimpl(m15396b(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, (Object) null))));
        return Math.max(C13265c.m30134c(Size.m35491getWidthimpl(m15395a(SizeKt.Size((float) maxIntrinsicWidth, (float) i)))), maxIntrinsicWidth);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m38739measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable r9 = measurable.m37365measureBRTryo0(m15396b(j));
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new C7872a(r9), 4, (Object) null);
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        boolean z;
        if (this.f10988b.m36369getIntrinsicSizeNHjbRc() != Size.Companion.m35499getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(Constraints.m38412getMaxWidthimpl(m15396b(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, (Object) null))));
        return Math.max(C13265c.m30134c(Size.m35488getHeightimpl(m15395a(SizeKt.Size((float) i, (float) minIntrinsicHeight)))), minIntrinsicHeight);
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        boolean z;
        if (this.f10988b.m36369getIntrinsicSizeNHjbRc() != Size.Companion.m35499getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(Constraints.m38411getMaxHeightimpl(m15396b(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, (Object) null))));
        return Math.max(C13265c.m30134c(Size.m35491getWidthimpl(m15395a(SizeKt.Size((float) minIntrinsicWidth, (float) i)))), minIntrinsicWidth);
    }

    public String toString() {
        return "ContentPainterModifier(painter=" + this.f10988b + ", alignment=" + this.f10989c + ", contentScale=" + this.f10990d + ", alpha=" + this.f10991e + ", colorFilter=" + this.f10992f + ')';
    }
}
