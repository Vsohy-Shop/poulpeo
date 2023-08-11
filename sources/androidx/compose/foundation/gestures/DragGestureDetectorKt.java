package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerEvent;
import androidx.compose.p002ui.input.pointer.PointerEventKt;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.input.pointer.PointerId;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.PointerType;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.C1232Dp;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12762g0;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,873:1\n665#1,11:874\n676#1,4:894\n680#1,58:905\n615#1,4:963\n619#1,2:976\n621#1,8:985\n658#1,18:993\n676#1,4:1020\n680#1,58:1031\n658#1,18:1089\n676#1,4:1116\n680#1,58:1127\n581#1,6:1185\n615#1,4:1191\n619#1,2:1204\n621#1,8:1213\n588#1,10:1221\n615#1,4:1231\n619#1,2:1244\n621#1,8:1253\n658#1,18:1261\n676#1,4:1288\n680#1,58:1299\n658#1,18:1357\n676#1,4:1384\n680#1,58:1395\n581#1,6:1453\n615#1,4:1459\n619#1,2:1472\n621#1,8:1481\n588#1,10:1489\n615#1,4:1499\n619#1,2:1512\n621#1,8:1521\n615#1,4:1529\n619#1,2:1542\n621#1,8:1551\n615#1,4:1559\n619#1,2:1572\n621#1,8:1581\n116#2,2:885\n33#2,6:887\n118#2:893\n33#2,6:898\n118#2:904\n116#2,2:967\n33#2,6:969\n118#2:975\n33#2,6:978\n118#2:984\n116#2,2:1011\n33#2,6:1013\n118#2:1019\n33#2,6:1024\n118#2:1030\n116#2,2:1107\n33#2,6:1109\n118#2:1115\n33#2,6:1120\n118#2:1126\n116#2,2:1195\n33#2,6:1197\n118#2:1203\n33#2,6:1206\n118#2:1212\n116#2,2:1235\n33#2,6:1237\n118#2:1243\n33#2,6:1246\n118#2:1252\n116#2,2:1279\n33#2,6:1281\n118#2:1287\n33#2,6:1292\n118#2:1298\n116#2,2:1375\n33#2,6:1377\n118#2:1383\n33#2,6:1388\n118#2:1394\n116#2,2:1463\n33#2,6:1465\n118#2:1471\n33#2,6:1474\n118#2:1480\n116#2,2:1503\n33#2,6:1505\n118#2:1511\n33#2,6:1514\n118#2:1520\n116#2,2:1533\n33#2,6:1535\n118#2:1541\n33#2,6:1544\n118#2:1550\n116#2,2:1563\n33#2,6:1565\n118#2:1571\n33#2,6:1574\n118#2:1580\n116#2,2:1589\n33#2,6:1591\n118#2:1597\n116#2,2:1598\n33#2,6:1600\n118#2:1606\n116#2,2:1607\n33#2,6:1609\n118#2:1615\n116#2,2:1616\n33#2,6:1618\n118#2:1624\n116#2,2:1625\n33#2,6:1627\n118#2:1633\n116#2,2:1634\n33#2,6:1636\n118#2:1642\n116#2,2:1643\n33#2,6:1645\n118#2:1651\n116#2,2:1652\n33#2,6:1654\n118#2:1660\n116#2,2:1661\n33#2,6:1663\n118#2:1669\n116#2,2:1670\n33#2,6:1672\n118#2:1678\n164#3:1679\n154#3:1680\n81#4:1681\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n*L\n78#1:874,11\n78#1:894,4\n78#1:905,58\n143#1:963,4\n143#1:976,2\n143#1:985,8\n288#1:993,18\n288#1:1020,4\n288#1:1031,58\n299#1:1089,18\n299#1:1116,4\n299#1:1127,58\n325#1:1185,6\n325#1:1191,4\n325#1:1204,2\n325#1:1213,8\n325#1:1221,10\n355#1:1231,4\n355#1:1244,2\n355#1:1253,8\n439#1:1261,18\n439#1:1288,4\n439#1:1299,58\n450#1:1357,18\n450#1:1384,4\n450#1:1395,58\n473#1:1453,6\n473#1:1459,4\n473#1:1472,2\n473#1:1481,8\n473#1:1489,10\n503#1:1499,4\n503#1:1512,2\n503#1:1521,8\n586#1:1529,4\n586#1:1542,2\n586#1:1551,8\n586#1:1559,4\n586#1:1572,2\n586#1:1581,8\n78#1:885,2\n78#1:887,6\n78#1:893\n78#1:898,6\n78#1:904\n143#1:967,2\n143#1:969,6\n143#1:975\n143#1:978,6\n143#1:984\n288#1:1011,2\n288#1:1013,6\n288#1:1019\n288#1:1024,6\n288#1:1030\n299#1:1107,2\n299#1:1109,6\n299#1:1115\n299#1:1120,6\n299#1:1126\n325#1:1195,2\n325#1:1197,6\n325#1:1203\n325#1:1206,6\n325#1:1212\n355#1:1235,2\n355#1:1237,6\n355#1:1243\n355#1:1246,6\n355#1:1252\n439#1:1279,2\n439#1:1281,6\n439#1:1287\n439#1:1292,6\n439#1:1298\n450#1:1375,2\n450#1:1377,6\n450#1:1383\n450#1:1388,6\n450#1:1394\n473#1:1463,2\n473#1:1465,6\n473#1:1471\n473#1:1474,6\n473#1:1480\n503#1:1503,2\n503#1:1505,6\n503#1:1511\n503#1:1514,6\n503#1:1520\n586#1:1533,2\n586#1:1535,6\n586#1:1541\n586#1:1544,6\n586#1:1550\n586#1:1563,2\n586#1:1565,6\n586#1:1571\n586#1:1574,6\n586#1:1580\n618#1:1589,2\n618#1:1591,6\n618#1:1597\n620#1:1598,2\n620#1:1600,6\n620#1:1606\n675#1:1607,2\n675#1:1609,6\n675#1:1615\n679#1:1616,2\n679#1:1618,6\n679#1:1624\n675#1:1625,2\n675#1:1627,6\n675#1:1633\n679#1:1634,2\n679#1:1636,6\n679#1:1642\n675#1:1643,2\n675#1:1645,6\n675#1:1651\n679#1:1652,2\n679#1:1654,6\n679#1:1660\n801#1:1661,2\n801#1:1663,6\n801#1:1669\n854#1:1670,2\n854#1:1672,6\n854#1:1678\n860#1:1679\n861#1:1680\n862#1:1681\n*E\n"})
/* compiled from: DragGestureDetector.kt */
public final class DragGestureDetectorKt {
    private static final PointerDirectionConfig HorizontalPointerDirectionConfig = new DragGestureDetectorKt$HorizontalPointerDirectionConfig$1();
    private static final PointerDirectionConfig VerticalPointerDirectionConfig = new DragGestureDetectorKt$VerticalPointerDirectionConfig$1();
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    static {
        float r0 = C1232Dp.m38468constructorimpl((float) 0.125d);
        mouseSlop = r0;
        float r1 = C1232Dp.m38468constructorimpl((float) 18);
        defaultTouchSlop = r1;
        mouseToTouchSlopRatio = r0 / r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        if (androidx.compose.p002ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0091 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: awaitDragOrCancellation-rnUCldI  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33047awaitDragOrCancellationrnUCldI(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r17, long r18, p355hf.C12074d<? super androidx.compose.p002ui.input.pointer.PointerInputChange> r20) {
        /*
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = p362if.C12150d.m26492c()
            int r5 = r3.label
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0043
            if (r5 != r6) goto L_0x003b
            java.lang.Object r0 = r3.L$1
            kotlin.jvm.internal.g0 r0 = (kotlin.jvm.internal.C12762g0) r0
            java.lang.Object r1 = r3.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
            p336ef.C11910n.m25701b(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto L_0x006c
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            p336ef.C11910n.m25701b(r2)
            androidx.compose.ui.input.pointer.PointerEvent r2 = r17.getCurrentEvent()
            boolean r2 = m33064isPointerUpDmW0f2w(r2, r0)
            if (r2 == 0) goto L_0x0051
            return r7
        L_0x0051:
            kotlin.jvm.internal.g0 r2 = new kotlin.jvm.internal.g0
            r2.<init>()
            r2.f20418b = r0
            r0 = r17
        L_0x005a:
            r3.L$0 = r0
            r3.L$1 = r2
            r3.label = r6
            java.lang.Object r1 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r0, r7, r3, r6, r7)
            if (r1 != r4) goto L_0x0067
            return r4
        L_0x0067:
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x006c:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.p002ui.input.pointer.PointerEvent) r2
            java.util.List r5 = r2.getChanges()
            int r8 = r5.size()
            r9 = 0
            r10 = r9
        L_0x0078:
            if (r10 >= r8) goto L_0x0091
            java.lang.Object r11 = r5.get(r10)
            r12 = r11
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r12
            long r12 = r12.m37168getIdJ3iCeTQ()
            long r14 = r1.f20418b
            boolean r12 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r12, r14)
            if (r12 == 0) goto L_0x008e
            goto L_0x0092
        L_0x008e:
            int r10 = r10 + 1
            goto L_0x0078
        L_0x0091:
            r11 = r7
        L_0x0092:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            if (r11 != 0) goto L_0x0098
            r11 = r7
            goto L_0x00cd
        L_0x0098:
            boolean r5 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r11)
            if (r5 == 0) goto L_0x00c7
            java.util.List r2 = r2.getChanges()
            int r5 = r2.size()
            r8 = r9
        L_0x00a7:
            if (r8 >= r5) goto L_0x00ba
            java.lang.Object r10 = r2.get(r8)
            r12 = r10
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r12
            boolean r12 = r12.getPressed()
            if (r12 == 0) goto L_0x00b7
            goto L_0x00bb
        L_0x00b7:
            int r8 = r8 + 1
            goto L_0x00a7
        L_0x00ba:
            r10 = r7
        L_0x00bb:
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r10
            if (r10 != 0) goto L_0x00c0
            goto L_0x00cd
        L_0x00c0:
            long r8 = r10.m37168getIdJ3iCeTQ()
            r1.f20418b = r8
            goto L_0x00db
        L_0x00c7:
            boolean r2 = androidx.compose.p002ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11)
            if (r2 == 0) goto L_0x00db
        L_0x00cd:
            if (r11 == 0) goto L_0x00d6
            boolean r0 = r11.isConsumed()
            if (r0 != 0) goto L_0x00d6
            goto L_0x00d7
        L_0x00d6:
            r6 = r9
        L_0x00d7:
            if (r6 == 0) goto L_0x00da
            r7 = r11
        L_0x00da:
            return r7
        L_0x00db:
            r2 = r1
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m33047awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, hf.d):java.lang.Object");
    }

    /* renamed from: awaitDragOrUp-jO51t88  reason: not valid java name */
    private static final Object m33048awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Boolean> function1, C12074d<? super PointerInputChange> dVar) {
        PointerInputChange pointerInputChange;
        C12762g0 g0Var = new C12762g0();
        g0Var.f20418b = j;
        while (true) {
            int i = 0;
            C12773m.m28630c(0);
            PointerInputChange pointerInputChange2 = null;
            Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, (PointerEventPass) null, dVar, 1, (Object) null);
            C12773m.m28630c(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                if (Boolean.valueOf(PointerId.m37154equalsimpl0(pointerInputChange.m37168getIdJ3iCeTQ(), g0Var.f20418b)).booleanValue()) {
                    break;
                }
                i2++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i);
                    if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange2 = pointerInputChange4;
                        break;
                    }
                    i++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange2;
                if (pointerInputChange5 == null) {
                    return pointerInputChange3;
                }
                g0Var.f20418b = pointerInputChange5.m37168getIdJ3iCeTQ();
            } else if (function1.invoke(pointerInputChange3).booleanValue()) {
                return pointerInputChange3;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        if ((!r2) != false) goto L_0x00da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0091 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33049awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r17, long r18, p355hf.C12074d<? super androidx.compose.p002ui.input.pointer.PointerInputChange> r20) {
        /*
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = p362if.C12150d.m26492c()
            int r5 = r3.label
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0043
            if (r5 != r7) goto L_0x003b
            java.lang.Object r0 = r3.L$1
            kotlin.jvm.internal.g0 r0 = (kotlin.jvm.internal.C12762g0) r0
            java.lang.Object r1 = r3.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
            p336ef.C11910n.m25701b(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto L_0x006c
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            p336ef.C11910n.m25701b(r2)
            androidx.compose.ui.input.pointer.PointerEvent r2 = r17.getCurrentEvent()
            boolean r2 = m33064isPointerUpDmW0f2w(r2, r0)
            if (r2 == 0) goto L_0x0051
            return r6
        L_0x0051:
            kotlin.jvm.internal.g0 r2 = new kotlin.jvm.internal.g0
            r2.<init>()
            r2.f20418b = r0
            r0 = r17
        L_0x005a:
            r3.L$0 = r0
            r3.L$1 = r2
            r3.label = r7
            java.lang.Object r1 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r0, r6, r3, r7, r6)
            if (r1 != r4) goto L_0x0067
            return r4
        L_0x0067:
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x006c:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.p002ui.input.pointer.PointerEvent) r2
            java.util.List r5 = r2.getChanges()
            int r8 = r5.size()
            r9 = 0
            r10 = r9
        L_0x0078:
            if (r10 >= r8) goto L_0x0091
            java.lang.Object r11 = r5.get(r10)
            r12 = r11
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r12
            long r12 = r12.m37168getIdJ3iCeTQ()
            long r14 = r1.f20418b
            boolean r12 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r12, r14)
            if (r12 == 0) goto L_0x008e
            goto L_0x0092
        L_0x008e:
            int r10 = r10 + 1
            goto L_0x0078
        L_0x0091:
            r11 = r6
        L_0x0092:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            if (r11 != 0) goto L_0x0098
            r11 = r6
            goto L_0x00da
        L_0x0098:
            boolean r5 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r11)
            if (r5 == 0) goto L_0x00c7
            java.util.List r2 = r2.getChanges()
            int r5 = r2.size()
            r8 = r9
        L_0x00a7:
            if (r8 >= r5) goto L_0x00ba
            java.lang.Object r10 = r2.get(r8)
            r12 = r10
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r12
            boolean r12 = r12.getPressed()
            if (r12 == 0) goto L_0x00b7
            goto L_0x00bb
        L_0x00b7:
            int r8 = r8 + 1
            goto L_0x00a7
        L_0x00ba:
            r10 = r6
        L_0x00bb:
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r10
            if (r10 != 0) goto L_0x00c0
            goto L_0x00da
        L_0x00c0:
            long r8 = r10.m37168getIdJ3iCeTQ()
            r1.f20418b = r8
            goto L_0x00e8
        L_0x00c7:
            long r12 = androidx.compose.p002ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)
            float r2 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r12)
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00d6
            r2 = r7
            goto L_0x00d7
        L_0x00d6:
            r2 = r9
        L_0x00d7:
            r2 = r2 ^ r7
            if (r2 == 0) goto L_0x00e8
        L_0x00da:
            if (r11 == 0) goto L_0x00e3
            boolean r0 = r11.isConsumed()
            if (r0 != 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r7 = r9
        L_0x00e4:
            if (r7 == 0) goto L_0x00e7
            r6 = r11
        L_0x00e7:
            return r6
        L_0x00e8:
            r2 = r1
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m33049awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, hf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33050awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, p404of.C13088o<? super androidx.compose.p002ui.input.pointer.PointerInputChange, ? super java.lang.Float, p336ef.C11921v> r25, p355hf.C12074d<? super androidx.compose.p002ui.input.pointer.PointerInputChange> r26) {
        /*
            r0 = r22
            r2 = r26
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = p362if.C12150d.m26492c()
            int r5 = r3.label
            r6 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x008b
            if (r5 == r8) goto L_0x0060
            if (r5 != r6) goto L_0x0058
            float r0 = r3.F$2
            float r1 = r3.F$1
            float r5 = r3.F$0
            int r10 = r3.I$0
            java.lang.Object r11 = r3.L$4
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            java.lang.Object r12 = r3.L$3
            kotlin.jvm.internal.g0 r12 = (kotlin.jvm.internal.C12762g0) r12
            java.lang.Object r13 = r3.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r13
            java.lang.Object r14 = r3.L$1
            androidx.compose.foundation.gestures.PointerDirectionConfig r14 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r14
            java.lang.Object r15 = r3.L$0
            of.o r15 = (p404of.C13088o) r15
            p336ef.C11910n.m25701b(r2)
            r2 = r0
            r7 = r6
            r0 = r13
            r6 = r5
            r13 = r10
            r5 = r3
            r10 = r4
            r4 = r14
            r3 = r1
            r1 = r15
            goto L_0x01b6
        L_0x0058:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0060:
            float r0 = r3.F$2
            float r1 = r3.F$1
            float r5 = r3.F$0
            int r10 = r3.I$0
            java.lang.Object r11 = r3.L$3
            kotlin.jvm.internal.g0 r11 = (kotlin.jvm.internal.C12762g0) r11
            java.lang.Object r12 = r3.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r12
            java.lang.Object r13 = r3.L$1
            androidx.compose.foundation.gestures.PointerDirectionConfig r13 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r13
            java.lang.Object r14 = r3.L$0
            of.o r14 = (p404of.C13088o) r14
            p336ef.C11910n.m25701b(r2)
            r19 = r3
            r3 = r0
            r0 = r12
            r12 = r11
            r11 = r5
            r5 = r19
            r20 = r4
            r4 = r1
            r1 = r14
            r14 = r10
            r10 = r20
            goto L_0x00dc
        L_0x008b:
            p336ef.C11910n.m25701b(r2)
            androidx.compose.foundation.gestures.PointerDirectionConfig r2 = HorizontalPointerDirectionConfig
            androidx.compose.ui.input.pointer.PointerEvent r5 = r21.getCurrentEvent()
            boolean r5 = m33064isPointerUpDmW0f2w(r5, r0)
            if (r5 == 0) goto L_0x009c
            goto L_0x01f6
        L_0x009c:
            androidx.compose.ui.platform.ViewConfiguration r5 = r21.getViewConfiguration()
            r10 = r24
            float r5 = m33065pointerSlopE8SPZFQ(r5, r10)
            kotlin.jvm.internal.g0 r10 = new kotlin.jvm.internal.g0
            r10.<init>()
            r10.f20418b = r0
            r0 = r21
            r1 = r25
            r11 = r5
            r13 = r8
            r12 = r10
            r5 = r3
            r10 = r4
            r3 = 0
            r4 = r2
            r2 = 0
        L_0x00b9:
            r5.L$0 = r1
            r5.L$1 = r4
            r5.L$2 = r0
            r5.L$3 = r12
            r5.L$4 = r9
            r5.I$0 = r13
            r5.F$0 = r11
            r5.F$1 = r3
            r5.F$2 = r2
            r5.label = r8
            java.lang.Object r14 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r0, r9, r5, r8, r9)
            if (r14 != r10) goto L_0x00d4
            return r10
        L_0x00d4:
            r19 = r3
            r3 = r2
            r2 = r14
            r14 = r13
            r13 = r4
            r4 = r19
        L_0x00dc:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.p002ui.input.pointer.PointerEvent) r2
            java.util.List r15 = r2.getChanges()
            int r7 = r15.size()
            r16 = 0
            r8 = r16
        L_0x00ea:
            if (r8 >= r7) goto L_0x010e
            java.lang.Object r17 = r15.get(r8)
            r18 = r17
            androidx.compose.ui.input.pointer.PointerInputChange r18 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r18
            r21 = r10
            long r9 = r18.m37168getIdJ3iCeTQ()
            r22 = r7
            long r6 = r12.f20418b
            boolean r6 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r9, r6)
            if (r6 == 0) goto L_0x0105
            goto L_0x0112
        L_0x0105:
            int r8 = r8 + 1
            r7 = r22
            r6 = 2
            r9 = 0
            r10 = r21
            goto L_0x00ea
        L_0x010e:
            r21 = r10
            r17 = 0
        L_0x0112:
            r6 = r17
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r6
            if (r6 != 0) goto L_0x011a
            goto L_0x01bc
        L_0x011a:
            boolean r7 = r6.isConsumed()
            if (r7 == 0) goto L_0x0122
            goto L_0x01bc
        L_0x0122:
            boolean r7 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r6)
            if (r7 == 0) goto L_0x015b
            java.util.List r2 = r2.getChanges()
            int r6 = r2.size()
            r7 = r16
        L_0x0132:
            if (r7 >= r6) goto L_0x0145
            java.lang.Object r8 = r2.get(r7)
            r9 = r8
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r9
            boolean r9 = r9.getPressed()
            if (r9 == 0) goto L_0x0142
            goto L_0x0146
        L_0x0142:
            int r7 = r7 + 1
            goto L_0x0132
        L_0x0145:
            r8 = 0
        L_0x0146:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L_0x014c
            goto L_0x01bc
        L_0x014c:
            long r6 = r8.m37168getIdJ3iCeTQ()
            r12.f20418b = r6
            r10 = r21
            r2 = r3
            r3 = r4
            r4 = r13
            r13 = r14
            r6 = 2
            goto L_0x01c0
        L_0x015b:
            long r7 = r6.m37169getPositionF1C5BW0()
            long r9 = r6.m37170getPreviousPositionF1C5BW0()
            float r2 = r13.m33091mainAxisDeltak4lQ0M(r7)
            float r15 = r13.m33091mainAxisDeltak4lQ0M(r9)
            float r2 = r2 - r15
            float r7 = r13.m33090crossAxisDeltak4lQ0M(r7)
            float r8 = r13.m33090crossAxisDeltak4lQ0M(r9)
            float r7 = r7 - r8
            float r2 = r2 + r4
            float r3 = r3 + r7
            if (r14 == 0) goto L_0x017e
            float r4 = java.lang.Math.abs(r2)
            goto L_0x0186
        L_0x017e:
            long r7 = r13.m33092offsetFromChangesdBAh8RU(r2, r3)
            float r4 = androidx.compose.p002ui.geometry.Offset.m35420getDistanceimpl(r7)
        L_0x0186:
            int r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x01c4
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final
            r5.L$0 = r1
            r5.L$1 = r13
            r5.L$2 = r0
            r5.L$3 = r12
            r5.L$4 = r6
            r5.I$0 = r14
            r5.F$0 = r11
            r5.F$1 = r2
            r5.F$2 = r3
            r7 = 2
            r5.label = r7
            java.lang.Object r4 = r0.awaitPointerEvent(r4, r5)
            r10 = r21
            if (r4 != r10) goto L_0x01aa
            return r10
        L_0x01aa:
            r4 = r13
            r13 = r14
            r19 = r3
            r3 = r2
            r2 = r19
            r20 = r11
            r11 = r6
            r6 = r20
        L_0x01b6:
            boolean r8 = r11.isConsumed()
            if (r8 == 0) goto L_0x01be
        L_0x01bc:
            r9 = 0
            goto L_0x01f6
        L_0x01be:
            r11 = r6
            r6 = r7
        L_0x01c0:
            r8 = 1
            r9 = 0
            goto L_0x00b9
        L_0x01c4:
            r10 = r21
            r7 = 2
            if (r14 == 0) goto L_0x01d4
            float r4 = java.lang.Math.signum(r2)
            float r4 = r4 * r11
            float r2 = r2 - r4
            long r2 = r13.m33092offsetFromChangesdBAh8RU(r2, r3)
            goto L_0x01e4
        L_0x01d4:
            long r2 = r13.m33092offsetFromChangesdBAh8RU(r2, r3)
            long r8 = androidx.compose.p002ui.geometry.Offset.m35417divtuRUvjQ(r2, r4)
            long r8 = androidx.compose.p002ui.geometry.Offset.m35429timestuRUvjQ(r8, r11)
            long r2 = androidx.compose.p002ui.geometry.Offset.m35426minusMKHz9U(r2, r8)
        L_0x01e4:
            float r2 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r2)
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r2)
            r1.invoke(r6, r2)
            boolean r2 = r6.isConsumed()
            if (r2 == 0) goto L_0x01f7
            r9 = r6
        L_0x01f6:
            return r9
        L_0x01f7:
            r6 = r7
            r4 = r13
            r13 = r14
            r2 = 0
            r3 = 0
            goto L_0x01c0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m33050awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, of.o, hf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0111 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0148 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33051awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r20, long r21, p404of.C13088o<? super androidx.compose.p002ui.input.pointer.PointerInputChange, ? super java.lang.Float, p336ef.C11921v> r23, p355hf.C12074d<? super androidx.compose.p002ui.input.pointer.PointerInputChange> r24) {
        /*
            r0 = r21
            r2 = r24
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = p362if.C12150d.m26492c()
            int r5 = r3.label
            r6 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0087
            if (r5 == r8) goto L_0x0060
            if (r5 != r6) goto L_0x0058
            float r0 = r3.F$2
            float r1 = r3.F$1
            float r5 = r3.F$0
            int r10 = r3.I$0
            java.lang.Object r11 = r3.L$4
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            java.lang.Object r12 = r3.L$3
            kotlin.jvm.internal.g0 r12 = (kotlin.jvm.internal.C12762g0) r12
            java.lang.Object r13 = r3.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r13
            java.lang.Object r14 = r3.L$1
            androidx.compose.foundation.gestures.PointerDirectionConfig r14 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r14
            java.lang.Object r15 = r3.L$0
            of.o r15 = (p404of.C13088o) r15
            p336ef.C11910n.m25701b(r2)
            r2 = r0
            r8 = r6
            r0 = r13
            r13 = r14
            r14 = r10
            r10 = r4
            r4 = r5
            r5 = r3
            r3 = r1
            r1 = r15
            goto L_0x01ba
        L_0x0058:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0060:
            float r0 = r3.F$2
            float r1 = r3.F$1
            float r5 = r3.F$0
            int r10 = r3.I$0
            java.lang.Object r11 = r3.L$3
            kotlin.jvm.internal.g0 r11 = (kotlin.jvm.internal.C12762g0) r11
            java.lang.Object r12 = r3.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r12
            java.lang.Object r13 = r3.L$1
            androidx.compose.foundation.gestures.PointerDirectionConfig r13 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r13
            java.lang.Object r14 = r3.L$0
            of.o r14 = (p404of.C13088o) r14
            p336ef.C11910n.m25701b(r2)
            r19 = r3
            r3 = r0
            r0 = r12
            r12 = r11
            r11 = r4
            r4 = r1
            r1 = r14
            r14 = r10
            r10 = r19
            goto L_0x00df
        L_0x0087:
            p336ef.C11910n.m25701b(r2)
            androidx.compose.ui.input.pointer.PointerType$Companion r2 = androidx.compose.p002ui.input.pointer.PointerType.Companion
            int r2 = r2.m37248getTouchT8wyACA()
            androidx.compose.foundation.gestures.PointerDirectionConfig r5 = HorizontalPointerDirectionConfig
            androidx.compose.ui.input.pointer.PointerEvent r10 = r20.getCurrentEvent()
            boolean r10 = m33064isPointerUpDmW0f2w(r10, r0)
            if (r10 == 0) goto L_0x009e
            goto L_0x01fb
        L_0x009e:
            androidx.compose.ui.platform.ViewConfiguration r10 = r20.getViewConfiguration()
            float r2 = m33065pointerSlopE8SPZFQ(r10, r2)
            kotlin.jvm.internal.g0 r10 = new kotlin.jvm.internal.g0
            r10.<init>()
            r10.f20418b = r0
            r0 = r20
            r1 = r23
            r11 = r5
            r13 = r8
            r12 = r10
            r5 = r3
            r10 = r4
            r3 = 0
            r4 = r2
            r2 = 0
        L_0x00b9:
            r5.L$0 = r1
            r5.L$1 = r11
            r5.L$2 = r0
            r5.L$3 = r12
            r5.L$4 = r9
            r5.I$0 = r13
            r5.F$0 = r4
            r5.F$1 = r3
            r5.F$2 = r2
            r5.label = r8
            java.lang.Object r14 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r0, r9, r5, r8, r9)
            if (r14 != r10) goto L_0x00d4
            return r10
        L_0x00d4:
            r19 = r3
            r3 = r2
            r2 = r14
            r14 = r13
            r13 = r11
            r11 = r10
            r10 = r5
            r5 = r4
            r4 = r19
        L_0x00df:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.p002ui.input.pointer.PointerEvent) r2
            java.util.List r15 = r2.getChanges()
            int r7 = r15.size()
            r16 = 0
            r8 = r16
        L_0x00ed:
            if (r8 >= r7) goto L_0x0111
            java.lang.Object r17 = r15.get(r8)
            r18 = r17
            androidx.compose.ui.input.pointer.PointerInputChange r18 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r18
            r20 = r7
            long r6 = r18.m37168getIdJ3iCeTQ()
            r21 = r10
            long r9 = r12.f20418b
            boolean r6 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r6, r9)
            if (r6 == 0) goto L_0x0108
            goto L_0x0115
        L_0x0108:
            int r8 = r8 + 1
            r7 = r20
            r10 = r21
            r6 = 2
            r9 = 0
            goto L_0x00ed
        L_0x0111:
            r21 = r10
            r17 = 0
        L_0x0115:
            r6 = r17
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r6
            if (r6 != 0) goto L_0x011d
            goto L_0x01c0
        L_0x011d:
            boolean r7 = r6.isConsumed()
            if (r7 == 0) goto L_0x0125
            goto L_0x01c0
        L_0x0125:
            boolean r7 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r6)
            if (r7 == 0) goto L_0x0162
            java.util.List r2 = r2.getChanges()
            int r6 = r2.size()
            r7 = r16
        L_0x0135:
            if (r7 >= r6) goto L_0x0148
            java.lang.Object r8 = r2.get(r7)
            r9 = r8
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r9
            boolean r9 = r9.getPressed()
            if (r9 == 0) goto L_0x0145
            goto L_0x0149
        L_0x0145:
            int r7 = r7 + 1
            goto L_0x0135
        L_0x0148:
            r8 = 0
        L_0x0149:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L_0x014f
            goto L_0x01c0
        L_0x014f:
            long r6 = r8.m37168getIdJ3iCeTQ()
            r12.f20418b = r6
            r2 = r3
            r3 = r4
            r4 = r5
            r10 = r11
            r11 = r13
            r13 = r14
            r6 = 2
            r8 = 1
            r9 = 0
            r5 = r21
            goto L_0x00b9
        L_0x0162:
            long r7 = r6.m37169getPositionF1C5BW0()
            long r9 = r6.m37170getPreviousPositionF1C5BW0()
            float r2 = r13.m33091mainAxisDeltak4lQ0M(r7)
            float r15 = r13.m33091mainAxisDeltak4lQ0M(r9)
            float r2 = r2 - r15
            float r7 = r13.m33090crossAxisDeltak4lQ0M(r7)
            float r8 = r13.m33090crossAxisDeltak4lQ0M(r9)
            float r7 = r7 - r8
            float r2 = r2 + r4
            float r3 = r3 + r7
            if (r14 == 0) goto L_0x0185
            float r4 = java.lang.Math.abs(r2)
            goto L_0x018d
        L_0x0185:
            long r7 = r13.m33092offsetFromChangesdBAh8RU(r2, r3)
            float r4 = androidx.compose.p002ui.geometry.Offset.m35420getDistanceimpl(r7)
        L_0x018d:
            int r7 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x01c9
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final
            r7 = r21
            r7.L$0 = r1
            r7.L$1 = r13
            r7.L$2 = r0
            r7.L$3 = r12
            r7.L$4 = r6
            r7.I$0 = r14
            r7.F$0 = r5
            r7.F$1 = r2
            r7.F$2 = r3
            r8 = 2
            r7.label = r8
            java.lang.Object r4 = r0.awaitPointerEvent(r4, r7)
            if (r4 != r11) goto L_0x01b1
            return r11
        L_0x01b1:
            r4 = r5
            r5 = r7
            r10 = r11
            r11 = r6
            r19 = r3
            r3 = r2
            r2 = r19
        L_0x01ba:
            boolean r6 = r11.isConsumed()
            if (r6 == 0) goto L_0x01c2
        L_0x01c0:
            r9 = 0
            goto L_0x01fb
        L_0x01c2:
            r6 = r8
            r11 = r13
            r13 = r14
        L_0x01c5:
            r8 = 1
            r9 = 0
            goto L_0x00b9
        L_0x01c9:
            r7 = r21
            r8 = 2
            if (r14 == 0) goto L_0x01d9
            float r4 = java.lang.Math.signum(r2)
            float r4 = r4 * r5
            float r2 = r2 - r4
            long r2 = r13.m33092offsetFromChangesdBAh8RU(r2, r3)
            goto L_0x01e9
        L_0x01d9:
            long r2 = r13.m33092offsetFromChangesdBAh8RU(r2, r3)
            long r9 = androidx.compose.p002ui.geometry.Offset.m35417divtuRUvjQ(r2, r4)
            long r9 = androidx.compose.p002ui.geometry.Offset.m35429timestuRUvjQ(r9, r5)
            long r2 = androidx.compose.p002ui.geometry.Offset.m35426minusMKHz9U(r2, r9)
        L_0x01e9:
            float r2 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r2)
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r2)
            r1.invoke(r6, r2)
            boolean r2 = r6.isConsumed()
            if (r2 == 0) goto L_0x01fc
            r9 = r6
        L_0x01fb:
            return r9
        L_0x01fc:
            r4 = r5
            r5 = r7
            r6 = r8
            r10 = r11
            r11 = r13
            r13 = r14
            r2 = 0
            r3 = 0
            goto L_0x01c5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m33051awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, of.o, hf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: awaitLongPressOrCancellation-rnUCldI  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33052awaitLongPressOrCancellationrnUCldI(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r9, long r10, p355hf.C12074d<? super androidx.compose.p002ui.input.pointer.PointerInputChange> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r9 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref$ObjectRef) r9
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r10
            p336ef.C11910n.m25701b(r12)     // Catch:{ PointerEventTimeoutCancellationException -> 0x009b }
            goto L_0x00a4
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003b:
            p336ef.C11910n.m25701b(r12)
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            boolean r12 = m33064isPointerUpDmW0f2w(r12, r10)
            if (r12 == 0) goto L_0x0049
            return r4
        L_0x0049:
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            java.util.List r12 = r12.getChanges()
            int r2 = r12.size()
            r5 = 0
        L_0x0056:
            if (r5 >= r2) goto L_0x006d
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r7
            long r7 = r7.m37168getIdJ3iCeTQ()
            boolean r7 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r7, r10)
            if (r7 == 0) goto L_0x006a
            goto L_0x006e
        L_0x006a:
            int r5 = r5 + 1
            goto L_0x0056
        L_0x006d:
            r6 = r4
        L_0x006e:
            r10 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r10
            if (r10 != 0) goto L_0x0074
            return r4
        L_0x0074:
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            r12.f20403b = r10
            androidx.compose.ui.platform.ViewConfiguration r2 = r9.getViewConfiguration()
            long r5 = r2.getLongPressTimeoutMillis()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r2 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch:{ PointerEventTimeoutCancellationException -> 0x009a }
            r2.<init>(r12, r11, r4)     // Catch:{ PointerEventTimeoutCancellationException -> 0x009a }
            r0.L$0 = r10     // Catch:{ PointerEventTimeoutCancellationException -> 0x009a }
            r0.L$1 = r11     // Catch:{ PointerEventTimeoutCancellationException -> 0x009a }
            r0.label = r3     // Catch:{ PointerEventTimeoutCancellationException -> 0x009a }
            java.lang.Object r9 = r9.withTimeout(r5, r2, r0)     // Catch:{ PointerEventTimeoutCancellationException -> 0x009a }
            if (r9 != r1) goto L_0x00a4
            return r1
        L_0x009a:
            r9 = r11
        L_0x009b:
            T r9 = r9.f20403b
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r9
            if (r9 != 0) goto L_0x00a3
            r4 = r10
            goto L_0x00a4
        L_0x00a3:
            r4 = r9
        L_0x00a4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m33052awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, hf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0122 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: awaitPointerSlopOrCancellation-wtdNQyU  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33053awaitPointerSlopOrCancellationwtdNQyU(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, androidx.compose.foundation.gestures.PointerDirectionConfig r25, boolean r26, p404of.C13088o<? super androidx.compose.p002ui.input.pointer.PointerInputChange, ? super androidx.compose.p002ui.geometry.Offset, p336ef.C11921v> r27, p355hf.C12074d<? super androidx.compose.p002ui.input.pointer.PointerInputChange> r28) {
        /*
            r0 = r22
            r2 = r28
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = p362if.C12150d.m26492c()
            int r5 = r3.label
            r6 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x008c
            if (r5 == r8) goto L_0x0061
            if (r5 != r6) goto L_0x0059
            float r0 = r3.F$2
            float r1 = r3.F$1
            float r5 = r3.F$0
            boolean r10 = r3.Z$0
            java.lang.Object r11 = r3.L$4
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            java.lang.Object r12 = r3.L$3
            kotlin.jvm.internal.g0 r12 = (kotlin.jvm.internal.C12762g0) r12
            java.lang.Object r13 = r3.L$2
            of.o r13 = (p404of.C13088o) r13
            java.lang.Object r14 = r3.L$1
            androidx.compose.foundation.gestures.PointerDirectionConfig r14 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r14
            java.lang.Object r15 = r3.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r15 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r15
            p336ef.C11910n.m25701b(r2)
            r7 = r6
            r2 = r10
            r10 = r5
            r5 = r1
            r1 = r14
            r14 = r12
            r12 = r3
            r3 = r13
            r13 = r4
            r4 = r0
            r0 = r15
            goto L_0x01ae
        L_0x0059:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0061:
            float r0 = r3.F$2
            float r1 = r3.F$1
            float r5 = r3.F$0
            boolean r10 = r3.Z$0
            java.lang.Object r11 = r3.L$3
            kotlin.jvm.internal.g0 r11 = (kotlin.jvm.internal.C12762g0) r11
            java.lang.Object r12 = r3.L$2
            of.o r12 = (p404of.C13088o) r12
            java.lang.Object r13 = r3.L$1
            androidx.compose.foundation.gestures.PointerDirectionConfig r13 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r13
            java.lang.Object r14 = r3.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r14
            p336ef.C11910n.m25701b(r2)
            r19 = r4
            r4 = r0
            r0 = r14
            r14 = r11
            r11 = r5
            r5 = r1
            r1 = r13
            r13 = r19
            r20 = r12
            r12 = r3
            r3 = r20
            goto L_0x00dd
        L_0x008c:
            p336ef.C11910n.m25701b(r2)
            androidx.compose.ui.input.pointer.PointerEvent r2 = r21.getCurrentEvent()
            boolean r2 = m33064isPointerUpDmW0f2w(r2, r0)
            if (r2 == 0) goto L_0x009a
            return r9
        L_0x009a:
            androidx.compose.ui.platform.ViewConfiguration r2 = r21.getViewConfiguration()
            r5 = r24
            float r2 = m33065pointerSlopE8SPZFQ(r2, r5)
            kotlin.jvm.internal.g0 r5 = new kotlin.jvm.internal.g0
            r5.<init>()
            r5.f20418b = r0
            r0 = r21
            r1 = r25
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r4 = 0
            r5 = 0
            r2 = r26
            r3 = r27
        L_0x00b9:
            r11.L$0 = r0
            r11.L$1 = r1
            r11.L$2 = r3
            r11.L$3 = r13
            r11.L$4 = r9
            r11.Z$0 = r2
            r11.F$0 = r10
            r11.F$1 = r5
            r11.F$2 = r4
            r11.label = r8
            java.lang.Object r14 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r0, r9, r11, r8, r9)
            if (r14 != r12) goto L_0x00d4
            return r12
        L_0x00d4:
            r19 = r10
            r10 = r2
            r2 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r19
        L_0x00dd:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.p002ui.input.pointer.PointerEvent) r2
            java.util.List r15 = r2.getChanges()
            int r7 = r15.size()
            r16 = 0
            r8 = r16
        L_0x00eb:
            if (r8 >= r7) goto L_0x010f
            java.lang.Object r17 = r15.get(r8)
            r18 = r17
            androidx.compose.ui.input.pointer.PointerInputChange r18 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r18
            r21 = r7
            long r6 = r18.m37168getIdJ3iCeTQ()
            r22 = r10
            long r9 = r14.f20418b
            boolean r6 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r6, r9)
            if (r6 == 0) goto L_0x0106
            goto L_0x0113
        L_0x0106:
            int r8 = r8 + 1
            r7 = r21
            r10 = r22
            r6 = 2
            r9 = 0
            goto L_0x00eb
        L_0x010f:
            r22 = r10
            r17 = 0
        L_0x0113:
            r6 = r17
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r6
            if (r6 != 0) goto L_0x011b
            r7 = 0
            return r7
        L_0x011b:
            r7 = 0
            boolean r8 = r6.isConsumed()
            if (r8 == 0) goto L_0x0123
            return r7
        L_0x0123:
            boolean r7 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r6)
            if (r7 == 0) goto L_0x015b
            java.util.List r2 = r2.getChanges()
            int r6 = r2.size()
            r7 = r16
        L_0x0133:
            if (r7 >= r6) goto L_0x0146
            java.lang.Object r8 = r2.get(r7)
            r9 = r8
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r9
            boolean r9 = r9.getPressed()
            if (r9 == 0) goto L_0x0143
            goto L_0x0147
        L_0x0143:
            int r7 = r7 + 1
            goto L_0x0133
        L_0x0146:
            r8 = 0
        L_0x0147:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L_0x014d
            r2 = 0
            return r2
        L_0x014d:
            long r6 = r8.m37168getIdJ3iCeTQ()
            r14.f20418b = r6
            r2 = r22
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
        L_0x0159:
            r6 = 2
            goto L_0x01ba
        L_0x015b:
            long r7 = r6.m37169getPositionF1C5BW0()
            long r9 = r6.m37170getPreviousPositionF1C5BW0()
            float r2 = r1.m33091mainAxisDeltak4lQ0M(r7)
            float r15 = r1.m33091mainAxisDeltak4lQ0M(r9)
            float r2 = r2 - r15
            float r7 = r1.m33090crossAxisDeltak4lQ0M(r7)
            float r8 = r1.m33090crossAxisDeltak4lQ0M(r9)
            float r7 = r7 - r8
            float r2 = r2 + r5
            float r4 = r4 + r7
            if (r22 == 0) goto L_0x017e
            float r5 = java.lang.Math.abs(r2)
            goto L_0x0186
        L_0x017e:
            long r7 = r1.m33092offsetFromChangesdBAh8RU(r2, r4)
            float r5 = androidx.compose.p002ui.geometry.Offset.m35420getDistanceimpl(r7)
        L_0x0186:
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x01be
            androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final
            r12.L$0 = r0
            r12.L$1 = r1
            r12.L$2 = r3
            r12.L$3 = r14
            r12.L$4 = r6
            r10 = r22
            r12.Z$0 = r10
            r12.F$0 = r11
            r12.F$1 = r2
            r12.F$2 = r4
            r7 = 2
            r12.label = r7
            java.lang.Object r5 = r0.awaitPointerEvent(r5, r12)
            if (r5 != r13) goto L_0x01aa
            return r13
        L_0x01aa:
            r5 = r2
            r2 = r10
            r10 = r11
            r11 = r6
        L_0x01ae:
            boolean r6 = r11.isConsumed()
            if (r6 == 0) goto L_0x01b6
            r8 = 0
            return r8
        L_0x01b6:
            r6 = r7
            r11 = r12
            r12 = r13
            r13 = r14
        L_0x01ba:
            r8 = 1
            r9 = 0
            goto L_0x00b9
        L_0x01be:
            r10 = r22
            r7 = 2
            r8 = 0
            if (r10 == 0) goto L_0x01cf
            float r5 = java.lang.Math.signum(r2)
            float r5 = r5 * r11
            float r2 = r2 - r5
            long r4 = r1.m33092offsetFromChangesdBAh8RU(r2, r4)
            goto L_0x01df
        L_0x01cf:
            long r7 = r1.m33092offsetFromChangesdBAh8RU(r2, r4)
            long r4 = androidx.compose.p002ui.geometry.Offset.m35417divtuRUvjQ(r7, r5)
            long r4 = androidx.compose.p002ui.geometry.Offset.m35429timestuRUvjQ(r4, r11)
            long r4 = androidx.compose.p002ui.geometry.Offset.m35426minusMKHz9U(r7, r4)
        L_0x01df:
            androidx.compose.ui.geometry.Offset r2 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r4)
            r3.invoke(r6, r2)
            boolean r2 = r6.isConsumed()
            if (r2 == 0) goto L_0x01ed
            return r6
        L_0x01ed:
            r2 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r4 = 0
            r5 = 0
            goto L_0x0159
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m33053awaitPointerSlopOrCancellationwtdNQyU(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.foundation.gestures.PointerDirectionConfig, boolean, of.o, hf.d):java.lang.Object");
    }

    /* renamed from: awaitPointerSlopOrCancellation-wtdNQyU$$forInline  reason: not valid java name */
    private static final Object m33054awaitPointerSlopOrCancellationwtdNQyU$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j, int i, PointerDirectionConfig pointerDirectionConfig, boolean z, C13088o<? super PointerInputChange, ? super Offset, C11921v> oVar, C12074d<? super PointerInputChange> dVar) {
        float f;
        PointerInputChange pointerInputChange;
        float f2;
        long j2;
        PointerInputChange pointerInputChange2;
        AwaitPointerEventScope awaitPointerEventScope2 = awaitPointerEventScope;
        long j3 = j;
        PointerDirectionConfig pointerDirectionConfig2 = pointerDirectionConfig;
        C12074d<? super PointerInputChange> dVar2 = dVar;
        if (m33064isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j3)) {
            return null;
        }
        float r5 = m33065pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        C12762g0 g0Var = new C12762g0();
        g0Var.f20418b = j3;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (true) {
            C12773m.m28630c(0);
            Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, (PointerEventPass) null, dVar2, 1, (Object) null);
            C12773m.m28630c(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    f = f3;
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                f = f3;
                if (Boolean.valueOf(PointerId.m37154equalsimpl0(pointerInputChange.m37168getIdJ3iCeTQ(), g0Var.f20418b)).booleanValue()) {
                    break;
                }
                i2++;
                f3 = f;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i3);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i3++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                g0Var.f20418b = pointerInputChange4.m37168getIdJ3iCeTQ();
            } else {
                long r1 = pointerInputChange3.m37169getPositionF1C5BW0();
                long r9 = pointerInputChange3.m37170getPreviousPositionF1C5BW0();
                float r12 = pointerDirectionConfig2.m33090crossAxisDeltak4lQ0M(r1) - pointerDirectionConfig2.m33090crossAxisDeltak4lQ0M(r9);
                float r2 = f + (pointerDirectionConfig2.m33091mainAxisDeltak4lQ0M(r1) - pointerDirectionConfig2.m33091mainAxisDeltak4lQ0M(r9));
                f4 += r12;
                if (z) {
                    f2 = Math.abs(r2);
                } else {
                    f2 = Offset.m35420getDistanceimpl(pointerDirectionConfig2.m33092offsetFromChangesdBAh8RU(r2, f4));
                }
                if (f2 < r5) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    C12773m.m28630c(0);
                    awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, dVar2);
                    C12773m.m28630c(1);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                    f = r2;
                } else {
                    if (z) {
                        j2 = pointerDirectionConfig2.m33092offsetFromChangesdBAh8RU(r2 - (Math.signum(r2) * r5), f4);
                    } else {
                        long r8 = pointerDirectionConfig2.m33092offsetFromChangesdBAh8RU(r2, f4);
                        j2 = Offset.m35426minusMKHz9U(r8, Offset.m35429timestuRUvjQ(Offset.m35417divtuRUvjQ(r8, f2), r5));
                    }
                    oVar.invoke(pointerInputChange3, Offset.m35411boximpl(j2));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    f4 = 0.0f;
                    f = 0.0f;
                    f3 = f;
                }
            }
            C13088o<? super PointerInputChange, ? super Offset, C11921v> oVar2 = oVar;
            f3 = f;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ef, code lost:
        if (r3 == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f1, code lost:
        r9 = r2.m33092offsetFromChangesdBAh8RU(r10 - (java.lang.Math.signum(r10) * r23), r11);
        r5 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ff, code lost:
        r9 = r2.m33092offsetFromChangesdBAh8RU(r10, r11);
        r11 = androidx.compose.p002ui.geometry.Offset.m35417divtuRUvjQ(r9, r5);
        r5 = r23;
        r9 = androidx.compose.p002ui.geometry.Offset.m35426minusMKHz9U(r9, androidx.compose.p002ui.geometry.Offset.m35429timestuRUvjQ(r11, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0111, code lost:
        r24.invoke(r4, androidx.compose.p002ui.geometry.Offset.m35411boximpl(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011e, code lost:
        if (r4.isConsumed() == false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0120, code lost:
        return r4;
     */
    /* renamed from: awaitPointerSlopOrCancellation-wtdNQyU$default  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m33055awaitPointerSlopOrCancellationwtdNQyU$default(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r18, long r19, int r21, androidx.compose.foundation.gestures.PointerDirectionConfig r22, boolean r23, p404of.C13088o r24, p355hf.C12074d r25, int r26, java.lang.Object r27) {
        /*
            r0 = r18
            r1 = r25
            r2 = r26 & 4
            if (r2 == 0) goto L_0x000d
            androidx.compose.foundation.gestures.PointerDirectionConfig r2 = getHorizontalPointerDirectionConfig()
            goto L_0x000f
        L_0x000d:
            r2 = r22
        L_0x000f:
            r3 = r26 & 8
            r4 = 1
            if (r3 == 0) goto L_0x0016
            r3 = r4
            goto L_0x0018
        L_0x0016:
            r3 = r23
        L_0x0018:
            androidx.compose.ui.input.pointer.PointerEvent r5 = r18.getCurrentEvent()
            r6 = r19
            boolean r5 = m33064isPointerUpDmW0f2w(r5, r6)
            r8 = 0
            if (r5 == 0) goto L_0x0026
            return r8
        L_0x0026:
            androidx.compose.ui.platform.ViewConfiguration r5 = r18.getViewConfiguration()
            r9 = r21
            float r5 = m33065pointerSlopE8SPZFQ(r5, r9)
        L_0x0030:
            r10 = 0
            r11 = 0
        L_0x0032:
            r12 = 0
            kotlin.jvm.internal.C12773m.m28630c(r12)
            java.lang.Object r13 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r0, r8, r1, r4, r8)
            kotlin.jvm.internal.C12773m.m28630c(r4)
            androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.p002ui.input.pointer.PointerEvent) r13
            java.util.List r14 = r13.getChanges()
            int r15 = r14.size()
            r9 = r12
        L_0x0048:
            if (r9 >= r15) goto L_0x0065
            java.lang.Object r16 = r14.get(r9)
            r17 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r17 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r17
            r23 = r5
            long r4 = r17.m37168getIdJ3iCeTQ()
            boolean r4 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r4, r6)
            if (r4 == 0) goto L_0x005f
            goto L_0x0069
        L_0x005f:
            int r9 = r9 + 1
            r5 = r23
            r4 = 1
            goto L_0x0048
        L_0x0065:
            r23 = r5
            r16 = r8
        L_0x0069:
            r4 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r4
            if (r4 == 0) goto L_0x0125
            boolean r5 = r4.isConsumed()
            if (r5 == 0) goto L_0x0076
            return r8
        L_0x0076:
            boolean r5 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r4)
            if (r5 == 0) goto L_0x00a5
            java.util.List r4 = r13.getChanges()
            int r5 = r4.size()
        L_0x0084:
            if (r12 >= r5) goto L_0x0097
            java.lang.Object r6 = r4.get(r12)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r7
            boolean r7 = r7.getPressed()
            if (r7 == 0) goto L_0x0094
            goto L_0x0098
        L_0x0094:
            int r12 = r12 + 1
            goto L_0x0084
        L_0x0097:
            r6 = r8
        L_0x0098:
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r6
            if (r6 != 0) goto L_0x009d
            return r8
        L_0x009d:
            long r6 = r6.m37168getIdJ3iCeTQ()
            r5 = r23
            r4 = 1
            goto L_0x0032
        L_0x00a5:
            long r13 = r4.m37169getPositionF1C5BW0()
            long r8 = r4.m37170getPreviousPositionF1C5BW0()
            float r5 = r2.m33091mainAxisDeltak4lQ0M(r13)
            float r15 = r2.m33091mainAxisDeltak4lQ0M(r8)
            float r5 = r5 - r15
            float r13 = r2.m33090crossAxisDeltak4lQ0M(r13)
            float r8 = r2.m33090crossAxisDeltak4lQ0M(r8)
            float r13 = r13 - r8
            float r10 = r10 + r5
            float r11 = r11 + r13
            if (r3 == 0) goto L_0x00c8
            float r5 = java.lang.Math.abs(r10)
            goto L_0x00d0
        L_0x00c8:
            long r8 = r2.m33092offsetFromChangesdBAh8RU(r10, r11)
            float r5 = androidx.compose.p002ui.geometry.Offset.m35420getDistanceimpl(r8)
        L_0x00d0:
            int r8 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r8 >= 0) goto L_0x00ee
            androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final
            kotlin.jvm.internal.C12773m.m28630c(r12)
            r0.awaitPointerEvent(r5, r1)
            r8 = 1
            kotlin.jvm.internal.C12773m.m28630c(r8)
            boolean r4 = r4.isConsumed()
            if (r4 == 0) goto L_0x00e8
            r4 = 0
            return r4
        L_0x00e8:
            r5 = r23
            r4 = r8
            r8 = 0
            goto L_0x0032
        L_0x00ee:
            r8 = 1
            if (r3 == 0) goto L_0x00ff
            float r5 = java.lang.Math.signum(r10)
            float r5 = r5 * r23
            float r10 = r10 - r5
            long r9 = r2.m33092offsetFromChangesdBAh8RU(r10, r11)
            r5 = r23
            goto L_0x0111
        L_0x00ff:
            long r9 = r2.m33092offsetFromChangesdBAh8RU(r10, r11)
            long r11 = androidx.compose.p002ui.geometry.Offset.m35417divtuRUvjQ(r9, r5)
            r5 = r23
            long r11 = androidx.compose.p002ui.geometry.Offset.m35429timestuRUvjQ(r11, r5)
            long r9 = androidx.compose.p002ui.geometry.Offset.m35426minusMKHz9U(r9, r11)
        L_0x0111:
            androidx.compose.ui.geometry.Offset r9 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r9)
            r10 = r24
            r10.invoke(r4, r9)
            boolean r9 = r4.isConsumed()
            if (r9 == 0) goto L_0x0121
            return r4
        L_0x0121:
            r4 = r8
            r8 = 0
            goto L_0x0030
        L_0x0125:
            r4 = r8
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m33055awaitPointerSlopOrCancellationwtdNQyU$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.foundation.gestures.PointerDirectionConfig, boolean, of.o, hf.d, int, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0111 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0149 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33056awaitTouchSlopOrCancellationjO51t88(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r19, long r20, p404of.C13088o<? super androidx.compose.p002ui.input.pointer.PointerInputChange, ? super androidx.compose.p002ui.geometry.Offset, p336ef.C11921v> r22, p355hf.C12074d<? super androidx.compose.p002ui.input.pointer.PointerInputChange> r23) {
        /*
            r0 = r20
            r2 = r23
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = p362if.C12150d.m26492c()
            int r5 = r3.label
            r6 = 2
            r9 = 1
            r10 = 0
            if (r5 == 0) goto L_0x008a
            if (r5 == r9) goto L_0x0063
            if (r5 != r6) goto L_0x005b
            float r0 = r3.F$2
            float r1 = r3.F$1
            float r5 = r3.F$0
            int r11 = r3.I$0
            java.lang.Object r12 = r3.L$4
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r12
            java.lang.Object r13 = r3.L$3
            kotlin.jvm.internal.g0 r13 = (kotlin.jvm.internal.C12762g0) r13
            java.lang.Object r14 = r3.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r14
            java.lang.Object r15 = r3.L$1
            androidx.compose.foundation.gestures.PointerDirectionConfig r15 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r15
            java.lang.Object r7 = r3.L$0
            of.o r7 = (p404of.C13088o) r7
            p336ef.C11910n.m25701b(r2)
            r2 = r0
            r8 = r6
            r0 = r14
            r14 = r11
            r11 = r15
            r18 = r3
            r3 = r1
            r1 = r7
            r7 = r4
            r4 = r5
            r5 = r18
            goto L_0x01c0
        L_0x005b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0063:
            float r0 = r3.F$2
            float r1 = r3.F$1
            float r5 = r3.F$0
            int r7 = r3.I$0
            java.lang.Object r11 = r3.L$3
            kotlin.jvm.internal.g0 r11 = (kotlin.jvm.internal.C12762g0) r11
            java.lang.Object r12 = r3.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r12
            java.lang.Object r13 = r3.L$1
            androidx.compose.foundation.gestures.PointerDirectionConfig r13 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r13
            java.lang.Object r14 = r3.L$0
            of.o r14 = (p404of.C13088o) r14
            p336ef.C11910n.m25701b(r2)
            r18 = r3
            r3 = r0
            r0 = r12
            r12 = r11
            r11 = r4
            r4 = r1
            r1 = r14
            r14 = r7
            r7 = r18
            goto L_0x00e2
        L_0x008a:
            p336ef.C11910n.m25701b(r2)
            androidx.compose.ui.input.pointer.PointerType$Companion r2 = androidx.compose.p002ui.input.pointer.PointerType.Companion
            int r2 = r2.m37248getTouchT8wyACA()
            androidx.compose.foundation.gestures.PointerDirectionConfig r5 = HorizontalPointerDirectionConfig
            androidx.compose.ui.input.pointer.PointerEvent r7 = r19.getCurrentEvent()
            boolean r7 = m33064isPointerUpDmW0f2w(r7, r0)
            if (r7 == 0) goto L_0x00a1
            goto L_0x01ff
        L_0x00a1:
            androidx.compose.ui.platform.ViewConfiguration r7 = r19.getViewConfiguration()
            float r2 = m33065pointerSlopE8SPZFQ(r7, r2)
            kotlin.jvm.internal.g0 r7 = new kotlin.jvm.internal.g0
            r7.<init>()
            r7.f20418b = r0
            r0 = r19
            r1 = r22
            r11 = r5
            r12 = r7
            r13 = 0
            r5 = r3
            r7 = r4
            r3 = 0
            r4 = r2
            r2 = 0
        L_0x00bc:
            r5.L$0 = r1
            r5.L$1 = r11
            r5.L$2 = r0
            r5.L$3 = r12
            r5.L$4 = r10
            r5.I$0 = r13
            r5.F$0 = r4
            r5.F$1 = r3
            r5.F$2 = r2
            r5.label = r9
            java.lang.Object r14 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r0, r10, r5, r9, r10)
            if (r14 != r7) goto L_0x00d7
            return r7
        L_0x00d7:
            r18 = r3
            r3 = r2
            r2 = r14
            r14 = r13
            r13 = r11
            r11 = r7
            r7 = r5
            r5 = r4
            r4 = r18
        L_0x00e2:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.p002ui.input.pointer.PointerEvent) r2
            java.util.List r15 = r2.getChanges()
            int r8 = r15.size()
            r9 = 0
        L_0x00ed:
            if (r9 >= r8) goto L_0x0111
            java.lang.Object r16 = r15.get(r9)
            r17 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r17 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r17
            r19 = r11
            long r10 = r17.m37168getIdJ3iCeTQ()
            r20 = r7
            long r6 = r12.f20418b
            boolean r6 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r10, r6)
            if (r6 == 0) goto L_0x0108
            goto L_0x0117
        L_0x0108:
            int r9 = r9 + 1
            r11 = r19
            r7 = r20
            r6 = 2
            r10 = 0
            goto L_0x00ed
        L_0x0111:
            r20 = r7
            r19 = r11
            r16 = 0
        L_0x0117:
            r6 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r6
            if (r6 != 0) goto L_0x011f
            goto L_0x01c6
        L_0x011f:
            boolean r7 = r6.isConsumed()
            if (r7 == 0) goto L_0x0127
            goto L_0x01c6
        L_0x0127:
            boolean r7 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r6)
            if (r7 == 0) goto L_0x0164
            java.util.List r2 = r2.getChanges()
            int r6 = r2.size()
            r7 = 0
        L_0x0136:
            if (r7 >= r6) goto L_0x0149
            java.lang.Object r8 = r2.get(r7)
            r9 = r8
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r9
            boolean r9 = r9.getPressed()
            if (r9 == 0) goto L_0x0146
            goto L_0x014a
        L_0x0146:
            int r7 = r7 + 1
            goto L_0x0136
        L_0x0149:
            r8 = 0
        L_0x014a:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L_0x0150
            goto L_0x01c6
        L_0x0150:
            long r6 = r8.m37168getIdJ3iCeTQ()
            r12.f20418b = r6
            r7 = r19
            r2 = r3
            r3 = r4
            r4 = r5
            r11 = r13
            r13 = r14
            r6 = 2
            r9 = 1
            r10 = 0
            r5 = r20
            goto L_0x00bc
        L_0x0164:
            long r7 = r6.m37169getPositionF1C5BW0()
            long r9 = r6.m37170getPreviousPositionF1C5BW0()
            float r2 = r13.m33091mainAxisDeltak4lQ0M(r7)
            float r11 = r13.m33091mainAxisDeltak4lQ0M(r9)
            float r2 = r2 - r11
            float r7 = r13.m33090crossAxisDeltak4lQ0M(r7)
            float r8 = r13.m33090crossAxisDeltak4lQ0M(r9)
            float r7 = r7 - r8
            float r2 = r2 + r4
            float r3 = r3 + r7
            if (r14 == 0) goto L_0x0187
            float r4 = java.lang.Math.abs(r2)
            goto L_0x018f
        L_0x0187:
            long r7 = r13.m33092offsetFromChangesdBAh8RU(r2, r3)
            float r4 = androidx.compose.p002ui.geometry.Offset.m35420getDistanceimpl(r7)
        L_0x018f:
            int r7 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x01cf
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final
            r7 = r20
            r7.L$0 = r1
            r7.L$1 = r13
            r7.L$2 = r0
            r7.L$3 = r12
            r7.L$4 = r6
            r7.I$0 = r14
            r7.F$0 = r5
            r7.F$1 = r2
            r7.F$2 = r3
            r8 = 2
            r7.label = r8
            java.lang.Object r4 = r0.awaitPointerEvent(r4, r7)
            r9 = r19
            if (r4 != r9) goto L_0x01b5
            return r9
        L_0x01b5:
            r4 = r5
            r5 = r7
            r7 = r9
            r11 = r13
            r13 = r12
            r12 = r6
            r18 = r3
            r3 = r2
            r2 = r18
        L_0x01c0:
            boolean r6 = r12.isConsumed()
            if (r6 == 0) goto L_0x01c8
        L_0x01c6:
            r10 = 0
            goto L_0x01ff
        L_0x01c8:
            r6 = r8
            r12 = r13
            r13 = r14
        L_0x01cb:
            r9 = 1
            r10 = 0
            goto L_0x00bc
        L_0x01cf:
            r9 = r19
            r7 = r20
            r8 = 2
            if (r14 == 0) goto L_0x01e1
            float r4 = java.lang.Math.signum(r2)
            float r4 = r4 * r5
            float r2 = r2 - r4
            long r2 = r13.m33092offsetFromChangesdBAh8RU(r2, r3)
            goto L_0x01f1
        L_0x01e1:
            long r2 = r13.m33092offsetFromChangesdBAh8RU(r2, r3)
            long r10 = androidx.compose.p002ui.geometry.Offset.m35417divtuRUvjQ(r2, r4)
            long r10 = androidx.compose.p002ui.geometry.Offset.m35429timestuRUvjQ(r10, r5)
            long r2 = androidx.compose.p002ui.geometry.Offset.m35426minusMKHz9U(r2, r10)
        L_0x01f1:
            androidx.compose.ui.geometry.Offset r2 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r2)
            r1.invoke(r6, r2)
            boolean r2 = r6.isConsumed()
            if (r2 == 0) goto L_0x0200
            r10 = r6
        L_0x01ff:
            return r10
        L_0x0200:
            r4 = r5
            r5 = r7
            r6 = r8
            r7 = r9
            r11 = r13
            r13 = r14
            r2 = 0
            r3 = 0
            goto L_0x01cb
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m33056awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, of.o, hf.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        if ((!r2) != false) goto L_0x00da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0091 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33057awaitVerticalDragOrCancellationrnUCldI(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r17, long r18, p355hf.C12074d<? super androidx.compose.p002ui.input.pointer.PointerInputChange> r20) {
        /*
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = p362if.C12150d.m26492c()
            int r5 = r3.label
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0043
            if (r5 != r7) goto L_0x003b
            java.lang.Object r0 = r3.L$1
            kotlin.jvm.internal.g0 r0 = (kotlin.jvm.internal.C12762g0) r0
            java.lang.Object r1 = r3.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
            p336ef.C11910n.m25701b(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto L_0x006c
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            p336ef.C11910n.m25701b(r2)
            androidx.compose.ui.input.pointer.PointerEvent r2 = r17.getCurrentEvent()
            boolean r2 = m33064isPointerUpDmW0f2w(r2, r0)
            if (r2 == 0) goto L_0x0051
            return r6
        L_0x0051:
            kotlin.jvm.internal.g0 r2 = new kotlin.jvm.internal.g0
            r2.<init>()
            r2.f20418b = r0
            r0 = r17
        L_0x005a:
            r3.L$0 = r0
            r3.L$1 = r2
            r3.label = r7
            java.lang.Object r1 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r0, r6, r3, r7, r6)
            if (r1 != r4) goto L_0x0067
            return r4
        L_0x0067:
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x006c:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.p002ui.input.pointer.PointerEvent) r2
            java.util.List r5 = r2.getChanges()
            int r8 = r5.size()
            r9 = 0
            r10 = r9
        L_0x0078:
            if (r10 >= r8) goto L_0x0091
            java.lang.Object r11 = r5.get(r10)
            r12 = r11
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r12
            long r12 = r12.m37168getIdJ3iCeTQ()
            long r14 = r1.f20418b
            boolean r12 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r12, r14)
            if (r12 == 0) goto L_0x008e
            goto L_0x0092
        L_0x008e:
            int r10 = r10 + 1
            goto L_0x0078
        L_0x0091:
            r11 = r6
        L_0x0092:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            if (r11 != 0) goto L_0x0098
            r11 = r6
            goto L_0x00da
        L_0x0098:
            boolean r5 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r11)
            if (r5 == 0) goto L_0x00c7
            java.util.List r2 = r2.getChanges()
            int r5 = r2.size()
            r8 = r9
        L_0x00a7:
            if (r8 >= r5) goto L_0x00ba
            java.lang.Object r10 = r2.get(r8)
            r12 = r10
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r12
            boolean r12 = r12.getPressed()
            if (r12 == 0) goto L_0x00b7
            goto L_0x00bb
        L_0x00b7:
            int r8 = r8 + 1
            goto L_0x00a7
        L_0x00ba:
            r10 = r6
        L_0x00bb:
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r10
            if (r10 != 0) goto L_0x00c0
            goto L_0x00da
        L_0x00c0:
            long r8 = r10.m37168getIdJ3iCeTQ()
            r1.f20418b = r8
            goto L_0x00e8
        L_0x00c7:
            long r12 = androidx.compose.p002ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)
            float r2 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r12)
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00d6
            r2 = r7
            goto L_0x00d7
        L_0x00d6:
            r2 = r9
        L_0x00d7:
            r2 = r2 ^ r7
            if (r2 == 0) goto L_0x00e8
        L_0x00da:
            if (r11 == 0) goto L_0x00e3
            boolean r0 = r11.isConsumed()
            if (r0 != 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r7 = r9
        L_0x00e4:
            if (r7 == 0) goto L_0x00e7
            r6 = r11
        L_0x00e7:
            return r6
        L_0x00e8:
            r2 = r1
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m33057awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, hf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33058awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, p404of.C13088o<? super androidx.compose.p002ui.input.pointer.PointerInputChange, ? super java.lang.Float, p336ef.C11921v> r25, p355hf.C12074d<? super androidx.compose.p002ui.input.pointer.PointerInputChange> r26) {
        /*
            r0 = r22
            r2 = r26
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = p362if.C12150d.m26492c()
            int r5 = r3.label
            r6 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x008b
            if (r5 == r8) goto L_0x0060
            if (r5 != r6) goto L_0x0058
            float r0 = r3.F$2
            float r1 = r3.F$1
            float r5 = r3.F$0
            int r10 = r3.I$0
            java.lang.Object r11 = r3.L$4
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            java.lang.Object r12 = r3.L$3
            kotlin.jvm.internal.g0 r12 = (kotlin.jvm.internal.C12762g0) r12
            java.lang.Object r13 = r3.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r13
            java.lang.Object r14 = r3.L$1
            androidx.compose.foundation.gestures.PointerDirectionConfig r14 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r14
            java.lang.Object r15 = r3.L$0
            of.o r15 = (p404of.C13088o) r15
            p336ef.C11910n.m25701b(r2)
            r2 = r0
            r7 = r6
            r0 = r13
            r6 = r5
            r13 = r10
            r5 = r3
            r10 = r4
            r4 = r14
            r3 = r1
            r1 = r15
            goto L_0x01b6
        L_0x0058:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0060:
            float r0 = r3.F$2
            float r1 = r3.F$1
            float r5 = r3.F$0
            int r10 = r3.I$0
            java.lang.Object r11 = r3.L$3
            kotlin.jvm.internal.g0 r11 = (kotlin.jvm.internal.C12762g0) r11
            java.lang.Object r12 = r3.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r12
            java.lang.Object r13 = r3.L$1
            androidx.compose.foundation.gestures.PointerDirectionConfig r13 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r13
            java.lang.Object r14 = r3.L$0
            of.o r14 = (p404of.C13088o) r14
            p336ef.C11910n.m25701b(r2)
            r19 = r3
            r3 = r0
            r0 = r12
            r12 = r11
            r11 = r5
            r5 = r19
            r20 = r4
            r4 = r1
            r1 = r14
            r14 = r10
            r10 = r20
            goto L_0x00dc
        L_0x008b:
            p336ef.C11910n.m25701b(r2)
            androidx.compose.foundation.gestures.PointerDirectionConfig r2 = VerticalPointerDirectionConfig
            androidx.compose.ui.input.pointer.PointerEvent r5 = r21.getCurrentEvent()
            boolean r5 = m33064isPointerUpDmW0f2w(r5, r0)
            if (r5 == 0) goto L_0x009c
            goto L_0x01f6
        L_0x009c:
            androidx.compose.ui.platform.ViewConfiguration r5 = r21.getViewConfiguration()
            r10 = r24
            float r5 = m33065pointerSlopE8SPZFQ(r5, r10)
            kotlin.jvm.internal.g0 r10 = new kotlin.jvm.internal.g0
            r10.<init>()
            r10.f20418b = r0
            r0 = r21
            r1 = r25
            r11 = r5
            r13 = r8
            r12 = r10
            r5 = r3
            r10 = r4
            r3 = 0
            r4 = r2
            r2 = 0
        L_0x00b9:
            r5.L$0 = r1
            r5.L$1 = r4
            r5.L$2 = r0
            r5.L$3 = r12
            r5.L$4 = r9
            r5.I$0 = r13
            r5.F$0 = r11
            r5.F$1 = r3
            r5.F$2 = r2
            r5.label = r8
            java.lang.Object r14 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r0, r9, r5, r8, r9)
            if (r14 != r10) goto L_0x00d4
            return r10
        L_0x00d4:
            r19 = r3
            r3 = r2
            r2 = r14
            r14 = r13
            r13 = r4
            r4 = r19
        L_0x00dc:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.p002ui.input.pointer.PointerEvent) r2
            java.util.List r15 = r2.getChanges()
            int r7 = r15.size()
            r16 = 0
            r8 = r16
        L_0x00ea:
            if (r8 >= r7) goto L_0x010e
            java.lang.Object r17 = r15.get(r8)
            r18 = r17
            androidx.compose.ui.input.pointer.PointerInputChange r18 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r18
            r21 = r10
            long r9 = r18.m37168getIdJ3iCeTQ()
            r22 = r7
            long r6 = r12.f20418b
            boolean r6 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r9, r6)
            if (r6 == 0) goto L_0x0105
            goto L_0x0112
        L_0x0105:
            int r8 = r8 + 1
            r7 = r22
            r6 = 2
            r9 = 0
            r10 = r21
            goto L_0x00ea
        L_0x010e:
            r21 = r10
            r17 = 0
        L_0x0112:
            r6 = r17
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r6
            if (r6 != 0) goto L_0x011a
            goto L_0x01bc
        L_0x011a:
            boolean r7 = r6.isConsumed()
            if (r7 == 0) goto L_0x0122
            goto L_0x01bc
        L_0x0122:
            boolean r7 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r6)
            if (r7 == 0) goto L_0x015b
            java.util.List r2 = r2.getChanges()
            int r6 = r2.size()
            r7 = r16
        L_0x0132:
            if (r7 >= r6) goto L_0x0145
            java.lang.Object r8 = r2.get(r7)
            r9 = r8
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r9
            boolean r9 = r9.getPressed()
            if (r9 == 0) goto L_0x0142
            goto L_0x0146
        L_0x0142:
            int r7 = r7 + 1
            goto L_0x0132
        L_0x0145:
            r8 = 0
        L_0x0146:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L_0x014c
            goto L_0x01bc
        L_0x014c:
            long r6 = r8.m37168getIdJ3iCeTQ()
            r12.f20418b = r6
            r10 = r21
            r2 = r3
            r3 = r4
            r4 = r13
            r13 = r14
            r6 = 2
            goto L_0x01c0
        L_0x015b:
            long r7 = r6.m37169getPositionF1C5BW0()
            long r9 = r6.m37170getPreviousPositionF1C5BW0()
            float r2 = r13.m33091mainAxisDeltak4lQ0M(r7)
            float r15 = r13.m33091mainAxisDeltak4lQ0M(r9)
            float r2 = r2 - r15
            float r7 = r13.m33090crossAxisDeltak4lQ0M(r7)
            float r8 = r13.m33090crossAxisDeltak4lQ0M(r9)
            float r7 = r7 - r8
            float r2 = r2 + r4
            float r3 = r3 + r7
            if (r14 == 0) goto L_0x017e
            float r4 = java.lang.Math.abs(r2)
            goto L_0x0186
        L_0x017e:
            long r7 = r13.m33092offsetFromChangesdBAh8RU(r2, r3)
            float r4 = androidx.compose.p002ui.geometry.Offset.m35420getDistanceimpl(r7)
        L_0x0186:
            int r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x01c4
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final
            r5.L$0 = r1
            r5.L$1 = r13
            r5.L$2 = r0
            r5.L$3 = r12
            r5.L$4 = r6
            r5.I$0 = r14
            r5.F$0 = r11
            r5.F$1 = r2
            r5.F$2 = r3
            r7 = 2
            r5.label = r7
            java.lang.Object r4 = r0.awaitPointerEvent(r4, r5)
            r10 = r21
            if (r4 != r10) goto L_0x01aa
            return r10
        L_0x01aa:
            r4 = r13
            r13 = r14
            r19 = r3
            r3 = r2
            r2 = r19
            r20 = r11
            r11 = r6
            r6 = r20
        L_0x01b6:
            boolean r8 = r11.isConsumed()
            if (r8 == 0) goto L_0x01be
        L_0x01bc:
            r9 = 0
            goto L_0x01f6
        L_0x01be:
            r11 = r6
            r6 = r7
        L_0x01c0:
            r8 = 1
            r9 = 0
            goto L_0x00b9
        L_0x01c4:
            r10 = r21
            r7 = 2
            if (r14 == 0) goto L_0x01d4
            float r4 = java.lang.Math.signum(r2)
            float r4 = r4 * r11
            float r2 = r2 - r4
            long r2 = r13.m33092offsetFromChangesdBAh8RU(r2, r3)
            goto L_0x01e4
        L_0x01d4:
            long r2 = r13.m33092offsetFromChangesdBAh8RU(r2, r3)
            long r8 = androidx.compose.p002ui.geometry.Offset.m35417divtuRUvjQ(r2, r4)
            long r8 = androidx.compose.p002ui.geometry.Offset.m35429timestuRUvjQ(r8, r11)
            long r2 = androidx.compose.p002ui.geometry.Offset.m35426minusMKHz9U(r2, r8)
        L_0x01e4:
            float r2 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r2)
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r2)
            r1.invoke(r6, r2)
            boolean r2 = r6.isConsumed()
            if (r2 == 0) goto L_0x01f7
            r9 = r6
        L_0x01f6:
            return r9
        L_0x01f7:
            r6 = r7
            r4 = r13
            r13 = r14
            r2 = 0
            r3 = 0
            goto L_0x01c0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m33058awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, of.o, hf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0111 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0148 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33059awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r20, long r21, p404of.C13088o<? super androidx.compose.p002ui.input.pointer.PointerInputChange, ? super java.lang.Float, p336ef.C11921v> r23, p355hf.C12074d<? super androidx.compose.p002ui.input.pointer.PointerInputChange> r24) {
        /*
            r0 = r21
            r2 = r24
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = p362if.C12150d.m26492c()
            int r5 = r3.label
            r6 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0087
            if (r5 == r8) goto L_0x0060
            if (r5 != r6) goto L_0x0058
            float r0 = r3.F$2
            float r1 = r3.F$1
            float r5 = r3.F$0
            int r10 = r3.I$0
            java.lang.Object r11 = r3.L$4
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            java.lang.Object r12 = r3.L$3
            kotlin.jvm.internal.g0 r12 = (kotlin.jvm.internal.C12762g0) r12
            java.lang.Object r13 = r3.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r13
            java.lang.Object r14 = r3.L$1
            androidx.compose.foundation.gestures.PointerDirectionConfig r14 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r14
            java.lang.Object r15 = r3.L$0
            of.o r15 = (p404of.C13088o) r15
            p336ef.C11910n.m25701b(r2)
            r2 = r0
            r8 = r6
            r0 = r13
            r13 = r14
            r14 = r10
            r10 = r4
            r4 = r5
            r5 = r3
            r3 = r1
            r1 = r15
            goto L_0x01ba
        L_0x0058:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0060:
            float r0 = r3.F$2
            float r1 = r3.F$1
            float r5 = r3.F$0
            int r10 = r3.I$0
            java.lang.Object r11 = r3.L$3
            kotlin.jvm.internal.g0 r11 = (kotlin.jvm.internal.C12762g0) r11
            java.lang.Object r12 = r3.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r12
            java.lang.Object r13 = r3.L$1
            androidx.compose.foundation.gestures.PointerDirectionConfig r13 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r13
            java.lang.Object r14 = r3.L$0
            of.o r14 = (p404of.C13088o) r14
            p336ef.C11910n.m25701b(r2)
            r19 = r3
            r3 = r0
            r0 = r12
            r12 = r11
            r11 = r4
            r4 = r1
            r1 = r14
            r14 = r10
            r10 = r19
            goto L_0x00df
        L_0x0087:
            p336ef.C11910n.m25701b(r2)
            androidx.compose.ui.input.pointer.PointerType$Companion r2 = androidx.compose.p002ui.input.pointer.PointerType.Companion
            int r2 = r2.m37248getTouchT8wyACA()
            androidx.compose.foundation.gestures.PointerDirectionConfig r5 = VerticalPointerDirectionConfig
            androidx.compose.ui.input.pointer.PointerEvent r10 = r20.getCurrentEvent()
            boolean r10 = m33064isPointerUpDmW0f2w(r10, r0)
            if (r10 == 0) goto L_0x009e
            goto L_0x01fb
        L_0x009e:
            androidx.compose.ui.platform.ViewConfiguration r10 = r20.getViewConfiguration()
            float r2 = m33065pointerSlopE8SPZFQ(r10, r2)
            kotlin.jvm.internal.g0 r10 = new kotlin.jvm.internal.g0
            r10.<init>()
            r10.f20418b = r0
            r0 = r20
            r1 = r23
            r11 = r5
            r13 = r8
            r12 = r10
            r5 = r3
            r10 = r4
            r3 = 0
            r4 = r2
            r2 = 0
        L_0x00b9:
            r5.L$0 = r1
            r5.L$1 = r11
            r5.L$2 = r0
            r5.L$3 = r12
            r5.L$4 = r9
            r5.I$0 = r13
            r5.F$0 = r4
            r5.F$1 = r3
            r5.F$2 = r2
            r5.label = r8
            java.lang.Object r14 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r0, r9, r5, r8, r9)
            if (r14 != r10) goto L_0x00d4
            return r10
        L_0x00d4:
            r19 = r3
            r3 = r2
            r2 = r14
            r14 = r13
            r13 = r11
            r11 = r10
            r10 = r5
            r5 = r4
            r4 = r19
        L_0x00df:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.p002ui.input.pointer.PointerEvent) r2
            java.util.List r15 = r2.getChanges()
            int r7 = r15.size()
            r16 = 0
            r8 = r16
        L_0x00ed:
            if (r8 >= r7) goto L_0x0111
            java.lang.Object r17 = r15.get(r8)
            r18 = r17
            androidx.compose.ui.input.pointer.PointerInputChange r18 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r18
            r20 = r7
            long r6 = r18.m37168getIdJ3iCeTQ()
            r21 = r10
            long r9 = r12.f20418b
            boolean r6 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r6, r9)
            if (r6 == 0) goto L_0x0108
            goto L_0x0115
        L_0x0108:
            int r8 = r8 + 1
            r7 = r20
            r10 = r21
            r6 = 2
            r9 = 0
            goto L_0x00ed
        L_0x0111:
            r21 = r10
            r17 = 0
        L_0x0115:
            r6 = r17
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r6
            if (r6 != 0) goto L_0x011d
            goto L_0x01c0
        L_0x011d:
            boolean r7 = r6.isConsumed()
            if (r7 == 0) goto L_0x0125
            goto L_0x01c0
        L_0x0125:
            boolean r7 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r6)
            if (r7 == 0) goto L_0x0162
            java.util.List r2 = r2.getChanges()
            int r6 = r2.size()
            r7 = r16
        L_0x0135:
            if (r7 >= r6) goto L_0x0148
            java.lang.Object r8 = r2.get(r7)
            r9 = r8
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r9
            boolean r9 = r9.getPressed()
            if (r9 == 0) goto L_0x0145
            goto L_0x0149
        L_0x0145:
            int r7 = r7 + 1
            goto L_0x0135
        L_0x0148:
            r8 = 0
        L_0x0149:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L_0x014f
            goto L_0x01c0
        L_0x014f:
            long r6 = r8.m37168getIdJ3iCeTQ()
            r12.f20418b = r6
            r2 = r3
            r3 = r4
            r4 = r5
            r10 = r11
            r11 = r13
            r13 = r14
            r6 = 2
            r8 = 1
            r9 = 0
            r5 = r21
            goto L_0x00b9
        L_0x0162:
            long r7 = r6.m37169getPositionF1C5BW0()
            long r9 = r6.m37170getPreviousPositionF1C5BW0()
            float r2 = r13.m33091mainAxisDeltak4lQ0M(r7)
            float r15 = r13.m33091mainAxisDeltak4lQ0M(r9)
            float r2 = r2 - r15
            float r7 = r13.m33090crossAxisDeltak4lQ0M(r7)
            float r8 = r13.m33090crossAxisDeltak4lQ0M(r9)
            float r7 = r7 - r8
            float r2 = r2 + r4
            float r3 = r3 + r7
            if (r14 == 0) goto L_0x0185
            float r4 = java.lang.Math.abs(r2)
            goto L_0x018d
        L_0x0185:
            long r7 = r13.m33092offsetFromChangesdBAh8RU(r2, r3)
            float r4 = androidx.compose.p002ui.geometry.Offset.m35420getDistanceimpl(r7)
        L_0x018d:
            int r7 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x01c9
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final
            r7 = r21
            r7.L$0 = r1
            r7.L$1 = r13
            r7.L$2 = r0
            r7.L$3 = r12
            r7.L$4 = r6
            r7.I$0 = r14
            r7.F$0 = r5
            r7.F$1 = r2
            r7.F$2 = r3
            r8 = 2
            r7.label = r8
            java.lang.Object r4 = r0.awaitPointerEvent(r4, r7)
            if (r4 != r11) goto L_0x01b1
            return r11
        L_0x01b1:
            r4 = r5
            r5 = r7
            r10 = r11
            r11 = r6
            r19 = r3
            r3 = r2
            r2 = r19
        L_0x01ba:
            boolean r6 = r11.isConsumed()
            if (r6 == 0) goto L_0x01c2
        L_0x01c0:
            r9 = 0
            goto L_0x01fb
        L_0x01c2:
            r6 = r8
            r11 = r13
            r13 = r14
        L_0x01c5:
            r8 = 1
            r9 = 0
            goto L_0x00b9
        L_0x01c9:
            r7 = r21
            r8 = 2
            if (r14 == 0) goto L_0x01d9
            float r4 = java.lang.Math.signum(r2)
            float r4 = r4 * r5
            float r2 = r2 - r4
            long r2 = r13.m33092offsetFromChangesdBAh8RU(r2, r3)
            goto L_0x01e9
        L_0x01d9:
            long r2 = r13.m33092offsetFromChangesdBAh8RU(r2, r3)
            long r9 = androidx.compose.p002ui.geometry.Offset.m35417divtuRUvjQ(r2, r4)
            long r9 = androidx.compose.p002ui.geometry.Offset.m35429timestuRUvjQ(r9, r5)
            long r2 = androidx.compose.p002ui.geometry.Offset.m35426minusMKHz9U(r2, r9)
        L_0x01e9:
            float r2 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r2)
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r2)
            r1.invoke(r6, r2)
            boolean r2 = r6.isConsumed()
            if (r2 == 0) goto L_0x01fc
            r9 = r6
        L_0x01fb:
            return r9
        L_0x01fc:
            r4 = r5
            r5 = r7
            r6 = r8
            r10 = r11
            r11 = r13
            r13 = r14
            r2 = 0
            r3 = 0
            goto L_0x01c5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m33059awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, of.o, hf.d):java.lang.Object");
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, C11921v> function1, C13074a<C11921v> aVar, C13074a<C11921v> aVar2, C13088o<? super PointerInputChange, ? super Offset, C11921v> oVar, C12074d<? super C11921v> dVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$5(function1, oVar, aVar2, aVar, (C12074d<? super DragGestureDetectorKt$detectDragGestures$5>) null), dVar);
        if (awaitEachGesture == C12150d.m26492c()) {
            return awaitEachGesture;
        }
        return C11921v.f18618a;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, C13074a aVar, C13074a aVar2, C13088o oVar, C12074d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = DragGestureDetectorKt$detectDragGestures$2.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            aVar = DragGestureDetectorKt$detectDragGestures$3.INSTANCE;
        }
        C13074a aVar3 = aVar;
        if ((i & 4) != 0) {
            aVar2 = DragGestureDetectorKt$detectDragGestures$4.INSTANCE;
        }
        return detectDragGestures(pointerInputScope, function12, aVar3, aVar2, oVar, dVar);
    }

    public static final Object detectDragGesturesAfterLongPress(PointerInputScope pointerInputScope, Function1<? super Offset, C11921v> function1, C13074a<C11921v> aVar, C13074a<C11921v> aVar2, C13088o<? super PointerInputChange, ? super Offset, C11921v> oVar, C12074d<? super C11921v> dVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(function1, aVar, aVar2, oVar, (C12074d<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5>) null), dVar);
        if (awaitEachGesture == C12150d.m26492c()) {
            return awaitEachGesture;
        }
        return C11921v.f18618a;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, Function1 function1, C13074a aVar, C13074a aVar2, C13088o oVar, C12074d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = DragGestureDetectorKt$detectDragGesturesAfterLongPress$2.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            aVar = DragGestureDetectorKt$detectDragGesturesAfterLongPress$3.INSTANCE;
        }
        C13074a aVar3 = aVar;
        if ((i & 4) != 0) {
            aVar2 = DragGestureDetectorKt$detectDragGesturesAfterLongPress$4.INSTANCE;
        }
        return detectDragGesturesAfterLongPress(pointerInputScope, function12, aVar3, aVar2, oVar, dVar);
    }

    public static final Object detectHorizontalDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, C11921v> function1, C13074a<C11921v> aVar, C13074a<C11921v> aVar2, C13088o<? super PointerInputChange, ? super Float, C11921v> oVar, C12074d<? super C11921v> dVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectHorizontalDragGestures$5(function1, oVar, aVar, aVar2, (C12074d<? super DragGestureDetectorKt$detectHorizontalDragGestures$5>) null), dVar);
        if (awaitEachGesture == C12150d.m26492c()) {
            return awaitEachGesture;
        }
        return C11921v.f18618a;
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, C13074a aVar, C13074a aVar2, C13088o oVar, C12074d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = DragGestureDetectorKt$detectHorizontalDragGestures$2.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            aVar = DragGestureDetectorKt$detectHorizontalDragGestures$3.INSTANCE;
        }
        C13074a aVar3 = aVar;
        if ((i & 4) != 0) {
            aVar2 = DragGestureDetectorKt$detectHorizontalDragGestures$4.INSTANCE;
        }
        return detectHorizontalDragGestures(pointerInputScope, function12, aVar3, aVar2, oVar, dVar);
    }

    public static final Object detectVerticalDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, C11921v> function1, C13074a<C11921v> aVar, C13074a<C11921v> aVar2, C13088o<? super PointerInputChange, ? super Float, C11921v> oVar, C12074d<? super C11921v> dVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectVerticalDragGestures$5(function1, oVar, aVar, aVar2, (C12074d<? super DragGestureDetectorKt$detectVerticalDragGestures$5>) null), dVar);
        if (awaitEachGesture == C12150d.m26492c()) {
            return awaitEachGesture;
        }
        return C11921v.f18618a;
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, C13074a aVar, C13074a aVar2, C13088o oVar, C12074d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = DragGestureDetectorKt$detectVerticalDragGestures$2.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            aVar = DragGestureDetectorKt$detectVerticalDragGestures$3.INSTANCE;
        }
        C13074a aVar3 = aVar;
        if ((i & 4) != 0) {
            aVar2 = DragGestureDetectorKt$detectVerticalDragGestures$4.INSTANCE;
        }
        return detectVerticalDragGestures(pointerInputScope, function12, aVar3, aVar2, oVar, dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010d, code lost:
        if ((!r13) != false) goto L_0x010f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: drag-VnAYq1g  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33060dragVnAYq1g(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r19, long r20, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.input.pointer.PointerInputChange, p336ef.C11921v> r22, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.input.pointer.PointerInputChange, java.lang.Float> r23, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.input.pointer.PointerInputChange, java.lang.Boolean> r24, p355hf.C12074d<? super androidx.compose.p002ui.input.pointer.PointerInputChange> r25) {
        /*
            r0 = r25
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2 r1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = p362if.C12150d.m26492c()
            int r3 = r1.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0058
            if (r3 != r4) goto L_0x0050
            java.lang.Object r3 = r1.L$5
            kotlin.jvm.internal.g0 r3 = (kotlin.jvm.internal.C12762g0) r3
            java.lang.Object r6 = r1.L$4
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r6
            java.lang.Object r7 = r1.L$3
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r8 = r1.L$2
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r9 = r1.L$1
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r1.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r10
            p336ef.C11910n.m25701b(r0)
            r17 = r8
            r8 = r1
            r1 = r9
            r9 = r2
            r2 = r17
            r18 = r7
            r7 = r3
            r3 = r18
            goto L_0x0095
        L_0x0050:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0058:
            p336ef.C11910n.m25701b(r0)
            androidx.compose.ui.input.pointer.PointerEvent r0 = r19.getCurrentEvent()
            r6 = r20
            boolean r0 = m33064isPointerUpDmW0f2w(r0, r6)
            if (r0 == 0) goto L_0x0068
            return r5
        L_0x0068:
            r0 = r19
            r3 = r24
            r8 = r1
            r9 = r2
            r1 = r22
            r2 = r23
        L_0x0072:
            kotlin.jvm.internal.g0 r10 = new kotlin.jvm.internal.g0
            r10.<init>()
            r10.f20418b = r6
            r6 = r0
        L_0x007a:
            r8.L$0 = r0
            r8.L$1 = r1
            r8.L$2 = r2
            r8.L$3 = r3
            r8.L$4 = r6
            r8.L$5 = r10
            r8.label = r4
            java.lang.Object r7 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r6, r5, r8, r4, r5)
            if (r7 != r9) goto L_0x008f
            return r9
        L_0x008f:
            r17 = r10
            r10 = r0
            r0 = r7
            r7 = r17
        L_0x0095:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.p002ui.input.pointer.PointerEvent) r0
            java.util.List r11 = r0.getChanges()
            int r12 = r11.size()
            r14 = 0
        L_0x00a0:
            if (r14 >= r12) goto L_0x00c1
            java.lang.Object r15 = r11.get(r14)
            r16 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r16 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r16
            r19 = r6
            long r5 = r16.m37168getIdJ3iCeTQ()
            r16 = r14
            long r13 = r7.f20418b
            boolean r5 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r5, r13)
            if (r5 == 0) goto L_0x00bb
            goto L_0x00c4
        L_0x00bb:
            int r14 = r16 + 1
            r5 = 0
            r6 = r19
            goto L_0x00a0
        L_0x00c1:
            r19 = r6
            r15 = 0
        L_0x00c4:
            androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r15
            if (r15 != 0) goto L_0x00ca
            r15 = 0
            goto L_0x010f
        L_0x00ca:
            boolean r5 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r15)
            if (r5 == 0) goto L_0x00f9
            java.util.List r0 = r0.getChanges()
            int r5 = r0.size()
            r13 = 0
        L_0x00d9:
            if (r13 >= r5) goto L_0x00ec
            java.lang.Object r6 = r0.get(r13)
            r11 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.getPressed()
            if (r11 == 0) goto L_0x00e9
            goto L_0x00ed
        L_0x00e9:
            int r13 = r13 + 1
            goto L_0x00d9
        L_0x00ec:
            r6 = 0
        L_0x00ed:
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r6
            if (r6 != 0) goto L_0x00f2
            goto L_0x010f
        L_0x00f2:
            long r5 = r6.m37168getIdJ3iCeTQ()
            r7.f20418b = r5
            goto L_0x0133
        L_0x00f9:
            java.lang.Object r0 = r2.invoke(r15)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x010a
            r13 = r4
            goto L_0x010b
        L_0x010a:
            r13 = 0
        L_0x010b:
            r0 = r13 ^ 1
            if (r0 == 0) goto L_0x0133
        L_0x010f:
            if (r15 != 0) goto L_0x0113
            r0 = 0
            return r0
        L_0x0113:
            r0 = 0
            java.lang.Object r5 = r3.invoke(r15)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0121
            return r0
        L_0x0121:
            boolean r5 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r15)
            if (r5 == 0) goto L_0x0128
            return r15
        L_0x0128:
            r1.invoke(r15)
            long r6 = r15.m37168getIdJ3iCeTQ()
            r5 = r0
            r0 = r10
            goto L_0x0072
        L_0x0133:
            r0 = 0
            r6 = r19
            r5 = r0
            r0 = r10
            r10 = r7
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m33060dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, hf.d):java.lang.Object");
    }

    /* renamed from: drag-VnAYq1g$$forInline  reason: not valid java name */
    private static final Object m33061dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, C11921v> function1, Function1<? super PointerInputChange, Float> function12, Function1<? super PointerInputChange, Boolean> function13, C12074d<? super PointerInputChange> dVar) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long j2 = j;
        if (m33064isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        while (true) {
            C12762g0 g0Var = new C12762g0();
            g0Var.f20418b = j2;
            while (true) {
                int i = 0;
                C12773m.m28630c(0);
                AwaitPointerEventScope awaitPointerEventScope2 = awaitPointerEventScope;
                Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, (PointerEventPass) null, dVar, 1, (Object) null);
                C12773m.m28630c(1);
                PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i2);
                    if (Boolean.valueOf(PointerId.m37154equalsimpl0(pointerInputChange.m37168getIdJ3iCeTQ(), g0Var.f20418b)).booleanValue()) {
                        break;
                    }
                    i2++;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 == null) {
                    Function1<? super PointerInputChange, Float> function14 = function12;
                    pointerInputChange2 = null;
                    break;
                } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(i);
                        if (Boolean.valueOf(pointerInputChange3.getPressed()).booleanValue()) {
                            break;
                        }
                        i++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        Function1<? super PointerInputChange, Float> function15 = function12;
                        break;
                    }
                    g0Var.f20418b = pointerInputChange4.m37168getIdJ3iCeTQ();
                    Function1<? super PointerInputChange, Float> function16 = function12;
                } else {
                    if (function12.invoke(pointerInputChange2).floatValue() == 0.0f) {
                        i = 1;
                    }
                    if (Boolean.valueOf(i ^ true).booleanValue()) {
                        break;
                    }
                }
            }
            if (pointerInputChange2 == null || function13.invoke(pointerInputChange2).booleanValue()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                return pointerInputChange2;
            }
            function1.invoke(pointerInputChange2);
            j2 = pointerInputChange2.m37168getIdJ3iCeTQ();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: drag-jO51t88  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33062dragjO51t88(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r4, long r5, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.input.pointer.PointerInputChange, p336ef.C11921v> r7, p355hf.C12074d<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r5
            p336ef.C11910n.m25701b(r8)
            r7 = r4
            r4 = r5
            goto L_0x004b
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            p336ef.C11910n.m25701b(r8)
        L_0x003e:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = m33047awaitDragOrCancellationrnUCldI(r4, r5, r0)
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x004b:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L_0x0055
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.C12735b.m28558a(r4)
            return r4
        L_0x0055:
            boolean r5 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r8)
            if (r5 == 0) goto L_0x0060
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.C12735b.m28558a(r3)
            return r4
        L_0x0060:
            r7.invoke(r8)
            long r5 = r8.m37168getIdJ3iCeTQ()
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m33062dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, hf.d):java.lang.Object");
    }

    public static final PointerDirectionConfig getHorizontalPointerDirectionConfig() {
        return HorizontalPointerDirectionConfig;
    }

    public static final PointerDirectionConfig getVerticalPointerDirectionConfig() {
        return VerticalPointerDirectionConfig;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ef, code lost:
        if ((!r0) != false) goto L_0x00f1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: horizontalDrag-jO51t88  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33063horizontalDragjO51t88(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r18, long r19, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.input.pointer.PointerInputChange, p336ef.C11921v> r21, p355hf.C12074d<? super java.lang.Boolean> r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1 r1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = p362if.C12150d.m26492c()
            int r3 = r1.label
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x004b
            if (r3 != r6) goto L_0x0043
            java.lang.Object r3 = r1.L$3
            kotlin.jvm.internal.g0 r3 = (kotlin.jvm.internal.C12762g0) r3
            java.lang.Object r7 = r1.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r7
            java.lang.Object r8 = r1.L$1
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r8
            java.lang.Object r9 = r1.L$0
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            p336ef.C11910n.m25701b(r0)
            r16 = r2
            r2 = r1
            r1 = r9
            r9 = r7
            r7 = r16
            goto L_0x0083
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004b:
            p336ef.C11910n.m25701b(r0)
            androidx.compose.ui.input.pointer.PointerEvent r0 = r18.getCurrentEvent()
            r7 = r19
            boolean r0 = m33064isPointerUpDmW0f2w(r0, r7)
            if (r0 == 0) goto L_0x005c
            goto L_0x0103
        L_0x005c:
            r0 = r18
            r3 = r2
            r2 = r1
            r1 = r21
        L_0x0062:
            kotlin.jvm.internal.g0 r9 = new kotlin.jvm.internal.g0
            r9.<init>()
            r9.f20418b = r7
            r8 = r0
            r7 = r3
            r3 = r9
        L_0x006c:
            r2.L$0 = r1
            r2.L$1 = r0
            r2.L$2 = r8
            r2.L$3 = r3
            r2.label = r6
            java.lang.Object r9 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r8, r5, r2, r6, r5)
            if (r9 != r7) goto L_0x007d
            return r7
        L_0x007d:
            r16 = r8
            r8 = r0
            r0 = r9
            r9 = r16
        L_0x0083:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.p002ui.input.pointer.PointerEvent) r0
            java.util.List r10 = r0.getChanges()
            int r11 = r10.size()
            r12 = 0
        L_0x008e:
            if (r12 >= r11) goto L_0x00a8
            java.lang.Object r13 = r10.get(r12)
            r14 = r13
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r14
            long r14 = r14.m37168getIdJ3iCeTQ()
            long r4 = r3.f20418b
            boolean r4 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r14, r4)
            if (r4 == 0) goto L_0x00a4
            goto L_0x00a9
        L_0x00a4:
            int r12 = r12 + 1
            r5 = 0
            goto L_0x008e
        L_0x00a8:
            r13 = 0
        L_0x00a9:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r13
            if (r13 != 0) goto L_0x00af
            r13 = 0
            goto L_0x00f1
        L_0x00af:
            boolean r4 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r13)
            if (r4 == 0) goto L_0x00de
            java.util.List r0 = r0.getChanges()
            int r4 = r0.size()
            r5 = 0
        L_0x00be:
            if (r5 >= r4) goto L_0x00d1
            java.lang.Object r10 = r0.get(r5)
            r11 = r10
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.getPressed()
            if (r11 == 0) goto L_0x00ce
            goto L_0x00d2
        L_0x00ce:
            int r5 = r5 + 1
            goto L_0x00be
        L_0x00d1:
            r10 = 0
        L_0x00d2:
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r10
            if (r10 != 0) goto L_0x00d7
            goto L_0x00f1
        L_0x00d7:
            long r4 = r10.m37168getIdJ3iCeTQ()
            r3.f20418b = r4
            goto L_0x011d
        L_0x00de:
            long r4 = androidx.compose.p002ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r13)
            float r0 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r4)
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00ed
            r0 = r6
            goto L_0x00ee
        L_0x00ed:
            r0 = 0
        L_0x00ee:
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x011d
        L_0x00f1:
            if (r13 != 0) goto L_0x00f5
        L_0x00f3:
            r5 = 0
            goto L_0x0103
        L_0x00f5:
            boolean r0 = r13.isConsumed()
            if (r0 == 0) goto L_0x00fc
            goto L_0x00f3
        L_0x00fc:
            boolean r0 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r13)
            if (r0 == 0) goto L_0x010d
            r5 = r13
        L_0x0103:
            if (r5 == 0) goto L_0x0107
            r4 = r6
            goto L_0x0108
        L_0x0107:
            r4 = 0
        L_0x0108:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.C12735b.m28558a(r4)
            return r0
        L_0x010d:
            r1.invoke(r13)
            long r3 = r13.m37168getIdJ3iCeTQ()
            r0 = r8
            r5 = 0
            r16 = r3
            r3 = r7
            r7 = r16
            goto L_0x0062
        L_0x011d:
            r0 = r8
            r8 = r9
            r5 = 0
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m33063horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, hf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* renamed from: isPointerUp-DmW0f2w  reason: not valid java name */
    public static final boolean m33064isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i);
            if (PointerId.m37154equalsimpl0(pointerInputChange.m37168getIdJ3iCeTQ(), j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ  reason: not valid java name */
    public static final float m33065pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i) {
        C12775o.m28639i(viewConfiguration, "$this$pointerSlop");
        if (PointerType.m37241equalsimpl0(i, PointerType.Companion.m37246getMouseT8wyACA())) {
            return viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio;
        }
        return viewConfiguration.getTouchSlop();
    }

    public static final PointerDirectionConfig toPointerDirectionConfig(Orientation orientation) {
        C12775o.m28639i(orientation, "<this>");
        if (orientation == Orientation.Vertical) {
            return VerticalPointerDirectionConfig;
        }
        return HorizontalPointerDirectionConfig;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ef, code lost:
        if ((!r0) != false) goto L_0x00f1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: verticalDrag-jO51t88  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33066verticalDragjO51t88(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r18, long r19, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.input.pointer.PointerInputChange, p336ef.C11921v> r21, p355hf.C12074d<? super java.lang.Boolean> r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1 r1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = p362if.C12150d.m26492c()
            int r3 = r1.label
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x004b
            if (r3 != r6) goto L_0x0043
            java.lang.Object r3 = r1.L$3
            kotlin.jvm.internal.g0 r3 = (kotlin.jvm.internal.C12762g0) r3
            java.lang.Object r7 = r1.L$2
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r7
            java.lang.Object r8 = r1.L$1
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r8
            java.lang.Object r9 = r1.L$0
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            p336ef.C11910n.m25701b(r0)
            r16 = r2
            r2 = r1
            r1 = r9
            r9 = r7
            r7 = r16
            goto L_0x0083
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004b:
            p336ef.C11910n.m25701b(r0)
            androidx.compose.ui.input.pointer.PointerEvent r0 = r18.getCurrentEvent()
            r7 = r19
            boolean r0 = m33064isPointerUpDmW0f2w(r0, r7)
            if (r0 == 0) goto L_0x005c
            goto L_0x0103
        L_0x005c:
            r0 = r18
            r3 = r2
            r2 = r1
            r1 = r21
        L_0x0062:
            kotlin.jvm.internal.g0 r9 = new kotlin.jvm.internal.g0
            r9.<init>()
            r9.f20418b = r7
            r8 = r0
            r7 = r3
            r3 = r9
        L_0x006c:
            r2.L$0 = r1
            r2.L$1 = r0
            r2.L$2 = r8
            r2.L$3 = r3
            r2.label = r6
            java.lang.Object r9 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r8, r5, r2, r6, r5)
            if (r9 != r7) goto L_0x007d
            return r7
        L_0x007d:
            r16 = r8
            r8 = r0
            r0 = r9
            r9 = r16
        L_0x0083:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.p002ui.input.pointer.PointerEvent) r0
            java.util.List r10 = r0.getChanges()
            int r11 = r10.size()
            r12 = 0
        L_0x008e:
            if (r12 >= r11) goto L_0x00a8
            java.lang.Object r13 = r10.get(r12)
            r14 = r13
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r14
            long r14 = r14.m37168getIdJ3iCeTQ()
            long r4 = r3.f20418b
            boolean r4 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r14, r4)
            if (r4 == 0) goto L_0x00a4
            goto L_0x00a9
        L_0x00a4:
            int r12 = r12 + 1
            r5 = 0
            goto L_0x008e
        L_0x00a8:
            r13 = 0
        L_0x00a9:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r13
            if (r13 != 0) goto L_0x00af
            r13 = 0
            goto L_0x00f1
        L_0x00af:
            boolean r4 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r13)
            if (r4 == 0) goto L_0x00de
            java.util.List r0 = r0.getChanges()
            int r4 = r0.size()
            r5 = 0
        L_0x00be:
            if (r5 >= r4) goto L_0x00d1
            java.lang.Object r10 = r0.get(r5)
            r11 = r10
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.getPressed()
            if (r11 == 0) goto L_0x00ce
            goto L_0x00d2
        L_0x00ce:
            int r5 = r5 + 1
            goto L_0x00be
        L_0x00d1:
            r10 = 0
        L_0x00d2:
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r10
            if (r10 != 0) goto L_0x00d7
            goto L_0x00f1
        L_0x00d7:
            long r4 = r10.m37168getIdJ3iCeTQ()
            r3.f20418b = r4
            goto L_0x011d
        L_0x00de:
            long r4 = androidx.compose.p002ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r13)
            float r0 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r4)
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00ed
            r0 = r6
            goto L_0x00ee
        L_0x00ed:
            r0 = 0
        L_0x00ee:
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x011d
        L_0x00f1:
            if (r13 != 0) goto L_0x00f5
        L_0x00f3:
            r5 = 0
            goto L_0x0103
        L_0x00f5:
            boolean r0 = r13.isConsumed()
            if (r0 == 0) goto L_0x00fc
            goto L_0x00f3
        L_0x00fc:
            boolean r0 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r13)
            if (r0 == 0) goto L_0x010d
            r5 = r13
        L_0x0103:
            if (r5 == 0) goto L_0x0107
            r4 = r6
            goto L_0x0108
        L_0x0107:
            r4 = 0
        L_0x0108:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.C12735b.m28558a(r4)
            return r0
        L_0x010d:
            r1.invoke(r13)
            long r3 = r13.m37168getIdJ3iCeTQ()
            r0 = r8
            r5 = 0
            r16 = r3
            r3 = r7
            r7 = r16
            goto L_0x0062
        L_0x011d:
            r0 = r8
            r8 = r9
            r5 = 0
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m33066verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, hf.d):java.lang.Object");
    }
}
