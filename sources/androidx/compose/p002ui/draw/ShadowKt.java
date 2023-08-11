package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.p002ui.graphics.RectangleShapeKt;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,123:1\n154#2:124\n154#2:125\n154#2:128\n135#3:126\n146#3:127\n*S KotlinDebug\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n64#1:124\n101#1:125\n98#1:128\n103#1:126\n102#1:127\n*E\n"})
/* renamed from: androidx.compose.ui.draw.ShadowKt */
/* compiled from: Shadow.kt */
public final class ShadowKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v7, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Stable
    /* renamed from: shadow-s4CzXII  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.Modifier m35336shadows4CzXII(androidx.compose.p002ui.Modifier r14, float r15, androidx.compose.p002ui.graphics.Shape r16, boolean r17, long r18, long r20) {
        /*
            r0 = r14
            java.lang.String r1 = "$this$shadow"
            kotlin.jvm.internal.C12775o.m28639i(r14, r1)
            java.lang.String r1 = "shape"
            r10 = r16
            kotlin.jvm.internal.C12775o.m28639i(r10, r1)
            r1 = 0
            float r1 = (float) r1
            float r1 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r1)
            r11 = r15
            int r1 = androidx.compose.p002ui.unit.C1232Dp.m38467compareTo0680j_4(r15, r1)
            if (r1 > 0) goto L_0x001c
            if (r17 == 0) goto L_0x004f
        L_0x001c:
            boolean r1 = androidx.compose.p002ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r1 == 0) goto L_0x0032
            androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r8 = r20
            r2.<init>(r3, r4, r5, r6, r8)
            goto L_0x0036
        L_0x0032:
            kotlin.jvm.functions.Function1 r1 = androidx.compose.p002ui.platform.InspectableValueKt.getNoInspectorInfo()
        L_0x0036:
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.ui.draw.ShadowKt$shadow$2$1 r13 = new androidx.compose.ui.draw.ShadowKt$shadow$2$1
            r2 = r13
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r8 = r20
            r2.<init>(r3, r4, r5, r6, r8)
            androidx.compose.ui.Modifier r2 = androidx.compose.p002ui.graphics.GraphicsLayerModifierKt.graphicsLayer(r12, r13)
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.platform.InspectableValueKt.inspectableWrapper(r14, r1, r2)
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.draw.ShadowKt.m35336shadows4CzXII(androidx.compose.ui.Modifier, float, androidx.compose.ui.graphics.Shape, boolean, long, long):androidx.compose.ui.Modifier");
    }

    /* renamed from: shadow-s4CzXII$default  reason: not valid java name */
    public static /* synthetic */ Modifier m35337shadows4CzXII$default(Modifier modifier, float f, Shape shape, boolean z, long j, long j2, int i, Object obj) {
        Shape shape2;
        boolean z2;
        long j3;
        long j4;
        if ((i & 2) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i & 4) != 0) {
            z2 = false;
            float f2 = f;
            if (C1232Dp.m38467compareTo0680j_4(f, C1232Dp.m38468constructorimpl((float) 0)) > 0) {
                z2 = true;
            }
        } else {
            float f3 = f;
            z2 = z;
        }
        if ((i & 8) != 0) {
            j3 = GraphicsLayerScopeKt.getDefaultShadowColor();
        } else {
            j3 = j;
        }
        if ((i & 16) != 0) {
            j4 = GraphicsLayerScopeKt.getDefaultShadowColor();
        } else {
            j4 = j2;
        }
        return m35336shadows4CzXII(modifier, f, shape2, z2, j3, j4);
    }

    @Stable
    /* renamed from: shadow-ziNgDLE  reason: not valid java name */
    public static final /* synthetic */ Modifier m35338shadowziNgDLE(Modifier modifier, float f, Shape shape, boolean z) {
        C12775o.m28639i(modifier, "$this$shadow");
        C12775o.m28639i(shape, "shape");
        return m35336shadows4CzXII(modifier, f, shape, z, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* renamed from: shadow-ziNgDLE$default  reason: not valid java name */
    public static /* synthetic */ Modifier m35339shadowziNgDLE$default(Modifier modifier, float f, Shape shape, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i & 4) != 0) {
            z = false;
            if (C1232Dp.m38467compareTo0680j_4(f, C1232Dp.m38468constructorimpl((float) 0)) > 0) {
                z = true;
            }
        }
        return m35338shadowziNgDLE(modifier, f, shape, z);
    }
}
