package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C12703l0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p436tf.C13525d;
import p436tf.C13528f;

@SourceDebugExtension({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,333:1\n283#1:334\n284#1,9:338\n283#1:348\n284#1,9:352\n283#1:362\n284#1,9:366\n283#1:376\n284#1,9:380\n283#1:390\n284#1,9:394\n283#1:404\n284#1,9:408\n283#1:418\n284#1,9:422\n283#1:432\n284#1,9:436\n283#1:446\n284#1,9:450\n283#1:460\n284#1,9:464\n283#1:474\n284#1,9:478\n283#1:488\n284#1,9:492\n283#1:502\n284#1,9:506\n283#1:516\n284#1,9:520\n283#1:530\n284#1,9:534\n283#1:544\n284#1,9:548\n283#1:558\n284#1,9:562\n283#1:572\n284#1,9:576\n1549#2:335\n1620#2,2:336\n1622#2:347\n1549#2:349\n1620#2,2:350\n1622#2:361\n1549#2:363\n1620#2,2:364\n1622#2:375\n1549#2:377\n1620#2,2:378\n1622#2:389\n1549#2:391\n1620#2,2:392\n1622#2:403\n1549#2:405\n1620#2,2:406\n1622#2:417\n1549#2:419\n1620#2,2:420\n1622#2:431\n1549#2:433\n1620#2,2:434\n1622#2:445\n1549#2:447\n1620#2,2:448\n1622#2:459\n1549#2:461\n1620#2,2:462\n1622#2:473\n1549#2:475\n1620#2,2:476\n1622#2:487\n1549#2:489\n1620#2,2:490\n1622#2:501\n1549#2:503\n1620#2,2:504\n1622#2:515\n1549#2:517\n1620#2,2:518\n1622#2:529\n1549#2:531\n1620#2,2:532\n1622#2:543\n1549#2:545\n1620#2,2:546\n1622#2:557\n1549#2:559\n1620#2,2:560\n1622#2:571\n1549#2:573\n1620#2,2:574\n1622#2:585\n1549#2:586\n1620#2,3:587\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n153#1:334\n153#1:338,9\n157#1:348\n157#1:352,9\n161#1:362\n161#1:366,9\n165#1:376\n165#1:380,9\n169#1:390\n169#1:394,9\n173#1:404\n173#1:408,9\n177#1:418\n177#1:422,9\n181#1:432\n181#1:436,9\n185#1:446\n185#1:450,9\n196#1:460\n196#1:464,9\n207#1:474\n207#1:478,9\n216#1:488\n216#1:492,9\n225#1:502\n225#1:506,9\n234#1:516\n234#1:520,9\n243#1:530\n243#1:534,9\n247#1:544\n247#1:548,9\n251#1:558\n251#1:562,9\n263#1:572\n263#1:576,9\n153#1:335\n153#1:336,2\n153#1:347\n157#1:349\n157#1:350,2\n157#1:361\n161#1:363\n161#1:364,2\n161#1:375\n165#1:377\n165#1:378,2\n165#1:389\n169#1:391\n169#1:392,2\n169#1:403\n173#1:405\n173#1:406,2\n173#1:417\n177#1:419\n177#1:420,2\n177#1:431\n181#1:433\n181#1:434,2\n181#1:445\n185#1:447\n185#1:448,2\n185#1:459\n196#1:461\n196#1:462,2\n196#1:473\n207#1:475\n207#1:476,2\n207#1:487\n216#1:489\n216#1:490,2\n216#1:501\n225#1:503\n225#1:504,2\n225#1:515\n234#1:517\n234#1:518,2\n234#1:529\n243#1:531\n243#1:532,2\n243#1:543\n247#1:545\n247#1:546,2\n247#1:557\n251#1:559\n251#1:560,2\n251#1:571\n263#1:573\n263#1:574,2\n263#1:585\n283#1:586\n283#1:587,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.PathNodeKt */
/* compiled from: PathNode.kt */
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    private static final List<PathNode> pathNodesFromArgs(float[] fArr, int i, Function1<? super float[], ? extends PathNode> function1) {
        C13525d s = C13537l.m30892s(new C13528f(0, fArr.length - i), i);
        ArrayList arrayList = new ArrayList(C12728x.m28544v(s, 10));
        Iterator it = s.iterator();
        while (it.hasNext()) {
            int nextInt = ((C12703l0) it).nextInt();
            float[] o = C12708o.m28348o(fArr, nextInt, nextInt + i);
            Object obj = (PathNode) function1.invoke(o);
            if ((obj instanceof PathNode.MoveTo) && nextInt > 0) {
                obj = new PathNode.LineTo(o[0], o[1]);
            } else if ((obj instanceof PathNode.RelativeMoveTo) && nextInt > 0) {
                obj = new PathNode.RelativeLineTo(o[0], o[1]);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARNING: type inference failed for: r12v3, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARNING: type inference failed for: r12v6, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARNING: type inference failed for: r12v7, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARNING: type inference failed for: r8v25, types: [androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo] */
    /* JADX WARNING: type inference failed for: r8v26, types: [androidx.compose.ui.graphics.vector.PathNode$LineTo] */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x03c2, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0674, code lost:
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x06f2, code lost:
        r19 = r19;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<androidx.compose.p002ui.graphics.vector.PathNode> toPathNodes(char r27, float[] r28) {
        /*
            r0 = r27
            r1 = r28
            java.lang.String r2 = "args"
            kotlin.jvm.internal.C12775o.m28639i(r1, r2)
            r2 = 122(0x7a, float:1.71E-43)
            r3 = 1
            r4 = 0
            if (r0 != r2) goto L_0x0011
        L_0x000f:
            r2 = r3
            goto L_0x0017
        L_0x0011:
            r2 = 90
            if (r0 != r2) goto L_0x0016
            goto L_0x000f
        L_0x0016:
            r2 = r4
        L_0x0017:
            if (r2 == 0) goto L_0x0021
            androidx.compose.ui.graphics.vector.PathNode$Close r0 = androidx.compose.p002ui.graphics.vector.PathNode.Close.INSTANCE
            java.util.List r0 = kotlin.collections.C12723v.m28509d(r0)
            goto L_0x06f6
        L_0x0021:
            r2 = 109(0x6d, float:1.53E-43)
            r5 = 2
            r6 = 10
            if (r0 != r2) goto L_0x007e
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r5
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r5)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0040:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            kotlin.collections.l0 r5 = (kotlin.collections.C12703l0) r5
            int r5 = r5.nextInt()
            int r6 = r5 + 2
            float[] r6 = kotlin.collections.C12708o.m28348o(r1, r5, r6)
            androidx.compose.ui.graphics.vector.PathNode$RelativeMoveTo r7 = new androidx.compose.ui.graphics.vector.PathNode$RelativeMoveTo
            r8 = r6[r4]
            r9 = r6[r3]
            r7.<init>(r8, r9)
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r8 == 0) goto L_0x006c
            if (r5 <= 0) goto L_0x006c
            androidx.compose.ui.graphics.vector.PathNode$LineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
            goto L_0x0077
        L_0x006c:
            if (r5 <= 0) goto L_0x0077
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
        L_0x0077:
            r2.add(r7)
            goto L_0x0040
        L_0x007b:
            r0 = r2
            goto L_0x06f6
        L_0x007e:
            r2 = 77
            if (r0 != r2) goto L_0x00d5
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r5
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r5)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x009a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            kotlin.collections.l0 r5 = (kotlin.collections.C12703l0) r5
            int r5 = r5.nextInt()
            int r6 = r5 + 2
            float[] r6 = kotlin.collections.C12708o.m28348o(r1, r5, r6)
            androidx.compose.ui.graphics.vector.PathNode$MoveTo r7 = new androidx.compose.ui.graphics.vector.PathNode$MoveTo
            r8 = r6[r4]
            r9 = r6[r3]
            r7.<init>(r8, r9)
            if (r5 <= 0) goto L_0x00c2
            androidx.compose.ui.graphics.vector.PathNode$LineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
            goto L_0x00d1
        L_0x00c2:
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r8 == 0) goto L_0x00d1
            if (r5 <= 0) goto L_0x00d1
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
        L_0x00d1:
            r2.add(r7)
            goto L_0x009a
        L_0x00d5:
            r2 = 108(0x6c, float:1.51E-43)
            if (r0 != r2) goto L_0x0130
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r5
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r5)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x00f1:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            kotlin.collections.l0 r5 = (kotlin.collections.C12703l0) r5
            int r5 = r5.nextInt()
            int r6 = r5 + 2
            float[] r6 = kotlin.collections.C12708o.m28348o(r1, r5, r6)
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r8 = r6[r4]
            r9 = r6[r3]
            r7.<init>(r8, r9)
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r8 == 0) goto L_0x011d
            if (r5 <= 0) goto L_0x011d
            androidx.compose.ui.graphics.vector.PathNode$LineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
            goto L_0x012c
        L_0x011d:
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r8 == 0) goto L_0x012c
            if (r5 <= 0) goto L_0x012c
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
        L_0x012c:
            r2.add(r7)
            goto L_0x00f1
        L_0x0130:
            r2 = 76
            if (r0 != r2) goto L_0x018b
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r5
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r5)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x014c:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            kotlin.collections.l0 r5 = (kotlin.collections.C12703l0) r5
            int r5 = r5.nextInt()
            int r6 = r5 + 2
            float[] r6 = kotlin.collections.C12708o.m28348o(r1, r5, r6)
            androidx.compose.ui.graphics.vector.PathNode$LineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r8 = r6[r4]
            r9 = r6[r3]
            r7.<init>(r8, r9)
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r8 == 0) goto L_0x0178
            if (r5 <= 0) goto L_0x0178
            androidx.compose.ui.graphics.vector.PathNode$LineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
            goto L_0x0187
        L_0x0178:
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r8 == 0) goto L_0x0187
            if (r5 <= 0) goto L_0x0187
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
        L_0x0187:
            r2.add(r7)
            goto L_0x014c
        L_0x018b:
            r2 = 104(0x68, float:1.46E-43)
            if (r0 != r2) goto L_0x01e4
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r3
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x01a7:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            kotlin.collections.l0 r5 = (kotlin.collections.C12703l0) r5
            int r5 = r5.nextInt()
            int r6 = r5 + 1
            float[] r6 = kotlin.collections.C12708o.m28348o(r1, r5, r6)
            androidx.compose.ui.graphics.vector.PathNode$RelativeHorizontalTo r7 = new androidx.compose.ui.graphics.vector.PathNode$RelativeHorizontalTo
            r8 = r6[r4]
            r7.<init>(r8)
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r8 == 0) goto L_0x01d1
            if (r5 <= 0) goto L_0x01d1
            androidx.compose.ui.graphics.vector.PathNode$LineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
            goto L_0x01e0
        L_0x01d1:
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r8 == 0) goto L_0x01e0
            if (r5 <= 0) goto L_0x01e0
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
        L_0x01e0:
            r2.add(r7)
            goto L_0x01a7
        L_0x01e4:
            r2 = 72
            if (r0 != r2) goto L_0x023d
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r3
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0200:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            kotlin.collections.l0 r5 = (kotlin.collections.C12703l0) r5
            int r5 = r5.nextInt()
            int r6 = r5 + 1
            float[] r6 = kotlin.collections.C12708o.m28348o(r1, r5, r6)
            androidx.compose.ui.graphics.vector.PathNode$HorizontalTo r7 = new androidx.compose.ui.graphics.vector.PathNode$HorizontalTo
            r8 = r6[r4]
            r7.<init>(r8)
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r8 == 0) goto L_0x022a
            if (r5 <= 0) goto L_0x022a
            androidx.compose.ui.graphics.vector.PathNode$LineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
            goto L_0x0239
        L_0x022a:
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r8 == 0) goto L_0x0239
            if (r5 <= 0) goto L_0x0239
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
        L_0x0239:
            r2.add(r7)
            goto L_0x0200
        L_0x023d:
            r2 = 118(0x76, float:1.65E-43)
            if (r0 != r2) goto L_0x0296
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r3
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0259:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            kotlin.collections.l0 r5 = (kotlin.collections.C12703l0) r5
            int r5 = r5.nextInt()
            int r6 = r5 + 1
            float[] r6 = kotlin.collections.C12708o.m28348o(r1, r5, r6)
            androidx.compose.ui.graphics.vector.PathNode$RelativeVerticalTo r7 = new androidx.compose.ui.graphics.vector.PathNode$RelativeVerticalTo
            r8 = r6[r4]
            r7.<init>(r8)
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r8 == 0) goto L_0x0283
            if (r5 <= 0) goto L_0x0283
            androidx.compose.ui.graphics.vector.PathNode$LineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
            goto L_0x0292
        L_0x0283:
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r8 == 0) goto L_0x0292
            if (r5 <= 0) goto L_0x0292
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
        L_0x0292:
            r2.add(r7)
            goto L_0x0259
        L_0x0296:
            r2 = 86
            if (r0 != r2) goto L_0x02ef
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r3
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x02b2:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            kotlin.collections.l0 r5 = (kotlin.collections.C12703l0) r5
            int r5 = r5.nextInt()
            int r6 = r5 + 1
            float[] r6 = kotlin.collections.C12708o.m28348o(r1, r5, r6)
            androidx.compose.ui.graphics.vector.PathNode$VerticalTo r7 = new androidx.compose.ui.graphics.vector.PathNode$VerticalTo
            r8 = r6[r4]
            r7.<init>(r8)
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r8 == 0) goto L_0x02dc
            if (r5 <= 0) goto L_0x02dc
            androidx.compose.ui.graphics.vector.PathNode$LineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
            goto L_0x02eb
        L_0x02dc:
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r8 == 0) goto L_0x02eb
            if (r5 <= 0) goto L_0x02eb
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
        L_0x02eb:
            r2.add(r7)
            goto L_0x02b2
        L_0x02ef:
            r2 = 99
            r7 = 5
            r8 = 6
            r9 = 3
            r10 = 4
            if (r0 != r2) goto L_0x0361
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r8
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r8)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x030f:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x007b
            r6 = r0
            kotlin.collections.l0 r6 = (kotlin.collections.C12703l0) r6
            int r6 = r6.nextInt()
            int r8 = r6 + 6
            float[] r8 = kotlin.collections.C12708o.m28348o(r1, r6, r8)
            androidx.compose.ui.graphics.vector.PathNode$RelativeCurveTo r15 = new androidx.compose.ui.graphics.vector.PathNode$RelativeCurveTo
            r12 = r8[r4]
            r13 = r8[r3]
            r14 = r8[r5]
            r16 = r8[r9]
            r17 = r8[r10]
            r18 = r8[r7]
            r11 = r15
            r7 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17)
            boolean r11 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r11 == 0) goto L_0x034b
            if (r6 <= 0) goto L_0x034b
            androidx.compose.ui.graphics.vector.PathNode$LineTo r15 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r6 = r8[r4]
            r7 = r8[r3]
            r15.<init>(r6, r7)
            goto L_0x035c
        L_0x034b:
            boolean r11 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r11 == 0) goto L_0x035b
            if (r6 <= 0) goto L_0x035b
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r15 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r6 = r8[r4]
            r7 = r8[r3]
            r15.<init>(r6, r7)
            goto L_0x035c
        L_0x035b:
            r15 = r7
        L_0x035c:
            r2.add(r15)
            r7 = 5
            goto L_0x030f
        L_0x0361:
            r2 = 67
            if (r0 != r2) goto L_0x03c6
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r8
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r8)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x037d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x007b
            r6 = r0
            kotlin.collections.l0 r6 = (kotlin.collections.C12703l0) r6
            int r6 = r6.nextInt()
            int r7 = r6 + 6
            float[] r7 = kotlin.collections.C12708o.m28348o(r1, r6, r7)
            androidx.compose.ui.graphics.vector.PathNode$CurveTo r8 = new androidx.compose.ui.graphics.vector.PathNode$CurveTo
            r12 = r7[r4]
            r13 = r7[r3]
            r14 = r7[r5]
            r15 = r7[r9]
            r16 = r7[r10]
            r11 = 5
            r17 = r7[r11]
            r11 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)
            boolean r11 = r8 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r11 == 0) goto L_0x03b3
            if (r6 <= 0) goto L_0x03b3
            androidx.compose.ui.graphics.vector.PathNode$LineTo r8 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r6 = r7[r4]
            r7 = r7[r3]
            r8.<init>(r6, r7)
            goto L_0x03c2
        L_0x03b3:
            boolean r11 = r8 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r11 == 0) goto L_0x03c2
            if (r6 <= 0) goto L_0x03c2
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r8 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r6 = r7[r4]
            r7 = r7[r3]
            r8.<init>(r6, r7)
        L_0x03c2:
            r2.add(r8)
            goto L_0x037d
        L_0x03c6:
            r2 = 115(0x73, float:1.61E-43)
            if (r0 != r2) goto L_0x0425
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r10
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x03e2:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x007b
            r6 = r0
            kotlin.collections.l0 r6 = (kotlin.collections.C12703l0) r6
            int r6 = r6.nextInt()
            int r7 = r6 + 4
            float[] r7 = kotlin.collections.C12708o.m28348o(r1, r6, r7)
            androidx.compose.ui.graphics.vector.PathNode$RelativeReflectiveCurveTo r8 = new androidx.compose.ui.graphics.vector.PathNode$RelativeReflectiveCurveTo
            r10 = r7[r4]
            r11 = r7[r3]
            r12 = r7[r5]
            r13 = r7[r9]
            r8.<init>(r10, r11, r12, r13)
            boolean r10 = r8 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r10 == 0) goto L_0x0412
            if (r6 <= 0) goto L_0x0412
            androidx.compose.ui.graphics.vector.PathNode$LineTo r8 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r6 = r7[r4]
            r7 = r7[r3]
            r8.<init>(r6, r7)
            goto L_0x0421
        L_0x0412:
            boolean r10 = r8 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r10 == 0) goto L_0x0421
            if (r6 <= 0) goto L_0x0421
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r8 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r6 = r7[r4]
            r7 = r7[r3]
            r8.<init>(r6, r7)
        L_0x0421:
            r2.add(r8)
            goto L_0x03e2
        L_0x0425:
            r2 = 83
            if (r0 != r2) goto L_0x0484
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r10
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x0441:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x007b
            r6 = r0
            kotlin.collections.l0 r6 = (kotlin.collections.C12703l0) r6
            int r6 = r6.nextInt()
            int r7 = r6 + 4
            float[] r7 = kotlin.collections.C12708o.m28348o(r1, r6, r7)
            androidx.compose.ui.graphics.vector.PathNode$ReflectiveCurveTo r8 = new androidx.compose.ui.graphics.vector.PathNode$ReflectiveCurveTo
            r10 = r7[r4]
            r11 = r7[r3]
            r12 = r7[r5]
            r13 = r7[r9]
            r8.<init>(r10, r11, r12, r13)
            boolean r10 = r8 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r10 == 0) goto L_0x0471
            if (r6 <= 0) goto L_0x0471
            androidx.compose.ui.graphics.vector.PathNode$LineTo r8 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r6 = r7[r4]
            r7 = r7[r3]
            r8.<init>(r6, r7)
            goto L_0x0480
        L_0x0471:
            boolean r10 = r8 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r10 == 0) goto L_0x0480
            if (r6 <= 0) goto L_0x0480
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r8 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r6 = r7[r4]
            r7 = r7[r3]
            r8.<init>(r6, r7)
        L_0x0480:
            r2.add(r8)
            goto L_0x0441
        L_0x0484:
            r2 = 113(0x71, float:1.58E-43)
            if (r0 != r2) goto L_0x04e3
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r10
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x04a0:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x007b
            r6 = r0
            kotlin.collections.l0 r6 = (kotlin.collections.C12703l0) r6
            int r6 = r6.nextInt()
            int r7 = r6 + 4
            float[] r7 = kotlin.collections.C12708o.m28348o(r1, r6, r7)
            androidx.compose.ui.graphics.vector.PathNode$RelativeQuadTo r8 = new androidx.compose.ui.graphics.vector.PathNode$RelativeQuadTo
            r10 = r7[r4]
            r11 = r7[r3]
            r12 = r7[r5]
            r13 = r7[r9]
            r8.<init>(r10, r11, r12, r13)
            boolean r10 = r8 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r10 == 0) goto L_0x04d0
            if (r6 <= 0) goto L_0x04d0
            androidx.compose.ui.graphics.vector.PathNode$LineTo r8 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r6 = r7[r4]
            r7 = r7[r3]
            r8.<init>(r6, r7)
            goto L_0x04df
        L_0x04d0:
            boolean r10 = r8 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r10 == 0) goto L_0x04df
            if (r6 <= 0) goto L_0x04df
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r8 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r6 = r7[r4]
            r7 = r7[r3]
            r8.<init>(r6, r7)
        L_0x04df:
            r2.add(r8)
            goto L_0x04a0
        L_0x04e3:
            r2 = 81
            if (r0 != r2) goto L_0x0542
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r10
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x04ff:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x007b
            r6 = r0
            kotlin.collections.l0 r6 = (kotlin.collections.C12703l0) r6
            int r6 = r6.nextInt()
            int r7 = r6 + 4
            float[] r7 = kotlin.collections.C12708o.m28348o(r1, r6, r7)
            androidx.compose.ui.graphics.vector.PathNode$QuadTo r8 = new androidx.compose.ui.graphics.vector.PathNode$QuadTo
            r10 = r7[r4]
            r11 = r7[r3]
            r12 = r7[r5]
            r13 = r7[r9]
            r8.<init>(r10, r11, r12, r13)
            boolean r10 = r8 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r10 == 0) goto L_0x052f
            if (r6 <= 0) goto L_0x052f
            androidx.compose.ui.graphics.vector.PathNode$LineTo r8 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r6 = r7[r4]
            r7 = r7[r3]
            r8.<init>(r6, r7)
            goto L_0x053e
        L_0x052f:
            boolean r10 = r8 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r10 == 0) goto L_0x053e
            if (r6 <= 0) goto L_0x053e
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r8 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r6 = r7[r4]
            r7 = r7[r3]
            r8.<init>(r6, r7)
        L_0x053e:
            r2.add(r8)
            goto L_0x04ff
        L_0x0542:
            r2 = 116(0x74, float:1.63E-43)
            if (r0 != r2) goto L_0x059d
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r5
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r5)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x055e:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            kotlin.collections.l0 r5 = (kotlin.collections.C12703l0) r5
            int r5 = r5.nextInt()
            int r6 = r5 + 2
            float[] r6 = kotlin.collections.C12708o.m28348o(r1, r5, r6)
            androidx.compose.ui.graphics.vector.PathNode$RelativeReflectiveQuadTo r7 = new androidx.compose.ui.graphics.vector.PathNode$RelativeReflectiveQuadTo
            r8 = r6[r4]
            r9 = r6[r3]
            r7.<init>(r8, r9)
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r8 == 0) goto L_0x058a
            if (r5 <= 0) goto L_0x058a
            androidx.compose.ui.graphics.vector.PathNode$LineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
            goto L_0x0599
        L_0x058a:
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r8 == 0) goto L_0x0599
            if (r5 <= 0) goto L_0x0599
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
        L_0x0599:
            r2.add(r7)
            goto L_0x055e
        L_0x059d:
            r2 = 84
            if (r0 != r2) goto L_0x05f8
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r5
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r5)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x05b9:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            kotlin.collections.l0 r5 = (kotlin.collections.C12703l0) r5
            int r5 = r5.nextInt()
            int r6 = r5 + 2
            float[] r6 = kotlin.collections.C12708o.m28348o(r1, r5, r6)
            androidx.compose.ui.graphics.vector.PathNode$ReflectiveQuadTo r7 = new androidx.compose.ui.graphics.vector.PathNode$ReflectiveQuadTo
            r8 = r6[r4]
            r9 = r6[r3]
            r7.<init>(r8, r9)
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r8 == 0) goto L_0x05e5
            if (r5 <= 0) goto L_0x05e5
            androidx.compose.ui.graphics.vector.PathNode$LineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
            goto L_0x05f4
        L_0x05e5:
            boolean r8 = r7 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r8 == 0) goto L_0x05f4
            if (r5 <= 0) goto L_0x05f4
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r7 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r5 = r6[r4]
            r6 = r6[r3]
            r7.<init>(r5, r6)
        L_0x05f4:
            r2.add(r7)
            goto L_0x05b9
        L_0x05f8:
            r2 = 97
            r7 = 7
            r11 = 0
            if (r0 != r2) goto L_0x0678
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r7
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x0616:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x007b
            r6 = r0
            kotlin.collections.l0 r6 = (kotlin.collections.C12703l0) r6
            int r6 = r6.nextInt()
            int r7 = r6 + 7
            float[] r7 = kotlin.collections.C12708o.m28348o(r1, r6, r7)
            androidx.compose.ui.graphics.vector.PathNode$RelativeArcTo r12 = new androidx.compose.ui.graphics.vector.PathNode$RelativeArcTo
            r20 = r7[r4]
            r21 = r7[r3]
            r22 = r7[r5]
            r13 = r7[r9]
            int r13 = java.lang.Float.compare(r13, r11)
            if (r13 == 0) goto L_0x063c
            r23 = r3
            goto L_0x063e
        L_0x063c:
            r23 = r4
        L_0x063e:
            r13 = r7[r10]
            int r13 = java.lang.Float.compare(r13, r11)
            if (r13 == 0) goto L_0x0649
            r24 = r3
            goto L_0x064b
        L_0x0649:
            r24 = r4
        L_0x064b:
            r13 = 5
            r25 = r7[r13]
            r26 = r7[r8]
            r19 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            boolean r13 = r12 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r13 == 0) goto L_0x0665
            if (r6 <= 0) goto L_0x0665
            androidx.compose.ui.graphics.vector.PathNode$LineTo r12 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r6 = r7[r4]
            r7 = r7[r3]
            r12.<init>(r6, r7)
            goto L_0x0674
        L_0x0665:
            boolean r13 = r12 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r13 == 0) goto L_0x0674
            if (r6 <= 0) goto L_0x0674
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r12 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r6 = r7[r4]
            r7 = r7[r3]
            r12.<init>(r6, r7)
        L_0x0674:
            r2.add(r12)
            goto L_0x0616
        L_0x0678:
            r2 = 65
            if (r0 != r2) goto L_0x06f7
            tf.f r0 = new tf.f
            int r2 = r1.length
            int r2 = r2 - r7
            r0.<init>(r4, r2)
            tf.d r0 = p436tf.C13537l.m30892s(r0, r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = kotlin.collections.C12728x.m28544v(r0, r6)
            r2.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x0694:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x007b
            r6 = r0
            kotlin.collections.l0 r6 = (kotlin.collections.C12703l0) r6
            int r6 = r6.nextInt()
            int r7 = r6 + 7
            float[] r7 = kotlin.collections.C12708o.m28348o(r1, r6, r7)
            androidx.compose.ui.graphics.vector.PathNode$ArcTo r12 = new androidx.compose.ui.graphics.vector.PathNode$ArcTo
            r20 = r7[r4]
            r21 = r7[r3]
            r22 = r7[r5]
            r13 = r7[r9]
            int r13 = java.lang.Float.compare(r13, r11)
            if (r13 == 0) goto L_0x06ba
            r23 = r3
            goto L_0x06bc
        L_0x06ba:
            r23 = r4
        L_0x06bc:
            r13 = r7[r10]
            int r13 = java.lang.Float.compare(r13, r11)
            if (r13 == 0) goto L_0x06c7
            r24 = r3
            goto L_0x06c9
        L_0x06c7:
            r24 = r4
        L_0x06c9:
            r13 = 5
            r25 = r7[r13]
            r26 = r7[r8]
            r19 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            boolean r14 = r12 instanceof androidx.compose.p002ui.graphics.vector.PathNode.MoveTo
            if (r14 == 0) goto L_0x06e3
            if (r6 <= 0) goto L_0x06e3
            androidx.compose.ui.graphics.vector.PathNode$LineTo r12 = new androidx.compose.ui.graphics.vector.PathNode$LineTo
            r6 = r7[r4]
            r7 = r7[r3]
            r12.<init>(r6, r7)
            goto L_0x06f2
        L_0x06e3:
            boolean r14 = r12 instanceof androidx.compose.p002ui.graphics.vector.PathNode.RelativeMoveTo
            if (r14 == 0) goto L_0x06f2
            if (r6 <= 0) goto L_0x06f2
            androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo r12 = new androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo
            r6 = r7[r4]
            r7 = r7[r3]
            r12.<init>(r6, r7)
        L_0x06f2:
            r2.add(r12)
            goto L_0x0694
        L_0x06f6:
            return r0
        L_0x06f7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown command for: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.vector.PathNodeKt.toPathNodes(char, float[]):java.util.List");
    }
}
