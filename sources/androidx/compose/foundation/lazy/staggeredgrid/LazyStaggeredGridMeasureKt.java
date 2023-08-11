package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C12699k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 5 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1097:1\n50#1,9:1108\n72#1,4:1117\n884#1:1134\n885#1,3:1139\n72#1,4:1142\n72#1,4:1146\n72#1,4:1150\n884#1:1161\n885#1,3:1166\n72#1,4:1177\n72#1,4:1181\n884#1:1202\n885#1,3:1207\n72#1,4:1212\n72#1,4:1218\n72#1,4:1222\n884#1:1243\n885#1,3:1248\n72#1,4:1251\n72#1,4:1255\n944#1,4:1259\n72#1,4:1263\n72#1,4:1267\n855#1,4:1271\n859#1,3:1279\n862#1,8:1284\n871#1:1293\n855#1,4:1294\n859#1,3:1302\n862#1,8:1307\n871#1:1316\n72#1,4:1317\n60#1:1325\n917#1,11:1329\n884#1:1340\n885#1,3:1345\n884#1:1358\n885#1,3:1363\n480#2,4:1098\n485#2:1107\n122#3,5:1102\n220#4:1121\n217#4:1122\n217#4:1128\n220#4:1154\n217#4:1155\n217#4:1171\n220#4:1189\n217#4:1190\n217#4:1196\n220#4:1230\n217#4:1231\n217#4:1237\n880#5:1123\n879#5:1124\n878#5:1126\n880#5:1129\n879#5:1130\n878#5:1132\n878#5:1135\n879#5:1137\n880#5:1156\n879#5:1157\n878#5:1159\n878#5:1162\n879#5:1164\n878#5:1169\n880#5:1172\n879#5:1173\n878#5:1175\n880#5:1191\n879#5:1192\n878#5:1194\n880#5:1197\n879#5:1198\n878#5:1200\n878#5:1203\n879#5:1205\n878#5:1210\n880#5:1232\n879#5:1233\n878#5:1235\n880#5:1238\n879#5:1239\n878#5:1241\n878#5:1244\n879#5:1246\n878#5:1341\n879#5:1343\n878#5:1354\n879#5:1356\n878#5:1359\n879#5:1361\n62#6:1125\n55#6:1127\n62#6:1131\n55#6:1133\n55#6:1136\n62#6:1138\n62#6:1158\n55#6:1160\n55#6:1163\n62#6:1165\n55#6:1170\n62#6:1174\n55#6:1176\n62#6:1193\n55#6:1195\n62#6:1199\n55#6:1201\n55#6:1204\n62#6:1206\n55#6:1211\n62#6:1234\n55#6:1236\n62#6:1240\n55#6:1242\n55#6:1245\n62#6:1247\n55#6:1342\n62#6:1344\n55#6:1355\n62#6:1357\n55#6:1360\n62#6:1362\n12774#7,2:1185\n12541#7,2:1187\n12774#7,2:1216\n12583#7,2:1226\n12774#7,2:1228\n12583#7,2:1282\n12583#7,2:1305\n12774#7,2:1321\n12583#7,2:1323\n12744#7,2:1327\n33#8,4:1275\n38#8:1292\n33#8,4:1298\n38#8:1315\n33#8,6:1348\n1#9:1326\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n230#1:1108,9\n288#1:1117,4\n333#1:1134\n333#1:1139,3\n339#1:1142,4\n381#1:1146,4\n419#1:1150,4\n447#1:1161\n447#1:1166,3\n464#1:1177,4\n467#1:1181,4\n500#1:1202\n500#1:1207,3\n518#1:1212,4\n540#1:1218,4\n543#1:1222,4\n607#1:1243\n607#1:1248,3\n645#1:1251,4\n648#1:1255,4\n665#1:1259,4\n669#1:1263,4\n692#1:1267,4\n716#1:1271,4\n716#1:1279,3\n716#1:1284,8\n716#1:1293\n741#1:1294,4\n741#1:1302,3\n741#1:1307,8\n741#1:1316\n763#1:1317,4\n230#1:1325\n818#1:1329,11\n843#1:1340\n843#1:1345,3\n897#1:1358\n897#1:1363,3\n111#1:1098,4\n111#1:1107\n111#1:1102,5\n325#1:1121\n325#1:1122\n332#1:1128\n445#1:1154\n445#1:1155\n457#1:1171\n491#1:1189\n491#1:1190\n495#1:1196\n599#1:1230\n599#1:1231\n606#1:1237\n325#1:1123\n325#1:1124\n325#1:1126\n332#1:1129\n332#1:1130\n332#1:1132\n333#1:1135\n333#1:1137\n445#1:1156\n445#1:1157\n445#1:1159\n447#1:1162\n447#1:1164\n453#1:1169\n457#1:1172\n457#1:1173\n457#1:1175\n491#1:1191\n491#1:1192\n491#1:1194\n495#1:1197\n495#1:1198\n495#1:1200\n500#1:1203\n500#1:1205\n510#1:1210\n599#1:1232\n599#1:1233\n599#1:1235\n606#1:1238\n606#1:1239\n606#1:1241\n607#1:1244\n607#1:1246\n843#1:1341\n843#1:1343\n884#1:1354\n884#1:1356\n897#1:1359\n897#1:1361\n325#1:1125\n325#1:1127\n332#1:1131\n332#1:1133\n333#1:1136\n333#1:1138\n445#1:1158\n445#1:1160\n447#1:1163\n447#1:1165\n453#1:1170\n457#1:1174\n457#1:1176\n491#1:1193\n491#1:1195\n495#1:1199\n495#1:1201\n500#1:1204\n500#1:1206\n510#1:1211\n599#1:1234\n599#1:1236\n606#1:1240\n606#1:1242\n607#1:1245\n607#1:1247\n843#1:1342\n843#1:1344\n884#1:1355\n884#1:1357\n897#1:1360\n897#1:1362\n476#1:1185,2\n479#1:1187,2\n536#1:1216,2\n550#1:1226,2\n558#1:1228,2\n725#1:1282,2\n754#1:1305,2\n772#1:1321,2\n773#1:1323,2\n816#1:1327,2\n716#1:1275,4\n716#1:1292\n741#1:1298,4\n741#1:1315\n858#1:1348,6\n*E\n"})
/* compiled from: LazyStaggeredGridMeasure.kt */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;

    @ExperimentalFoundationApi
    private static final List<LazyStaggeredGridPositionedItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, Function1<? super LazyStaggeredGridMeasuredItem, LazyStaggeredGridPositionedItem> function1, Function1<? super Integer, Boolean> function12) {
        LazyLayoutPinnedItemList pinnedItems$foundation_release = lazyStaggeredGridMeasureContext.getState().getPinnedItems$foundation_release();
        int size = pinnedItems$foundation_release.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = (LazyLayoutPinnedItemList.PinnedItem) pinnedItems$foundation_release.get(i);
            int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyStaggeredGridMeasureContext.getItemProvider(), pinnedItem.getKey(), pinnedItem.getIndex());
            if (function12.invoke(Integer.valueOf(findIndexByKey)).booleanValue()) {
                long r6 = lazyStaggeredGridMeasureContext.m33555getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), findIndexByKey, 0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m33563getAndMeasurejy6DScQ(findIndexByKey, r6)));
            }
        }
        if (arrayList == null) {
            return C12726w.m28524k();
        }
        return arrayList;
    }

    private static final List<LazyStaggeredGridPositionedItem> calculatePositionedItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, C12699k<LazyStaggeredGridMeasuredItem>[] kVarArr, int[] iArr, int i) {
        boolean z;
        int i2;
        int i3;
        int i4 = 0;
        for (C12699k<LazyStaggeredGridMeasuredItem> size : kVarArr) {
            i4 += size.size();
        }
        ArrayList arrayList = new ArrayList(i4);
        while (true) {
            int length = kVarArr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    z = false;
                    break;
                }
                z = true;
                if (!kVarArr[i5].isEmpty()) {
                    break;
                }
                i5++;
            }
            if (!z) {
                return arrayList;
            }
            int length2 = kVarArr.length;
            int i6 = -1;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < length2; i8++) {
                LazyStaggeredGridMeasuredItem r = kVarArr[i8].mo50579r();
                if (r != null) {
                    i3 = r.getIndex();
                } else {
                    i3 = Integer.MAX_VALUE;
                }
                if (i7 > i3) {
                    i6 = i8;
                    i7 = i3;
                }
            }
            LazyStaggeredGridMeasuredItem removeFirst = kVarArr[i6].removeFirst();
            if (removeFirst.getLane() == i6) {
                long r5 = SpanRange.m33569constructorimpl(removeFirst.getLane(), removeFirst.getSpan());
                int r3 = m33558maxInRangejy6DScQ(iArr, r5);
                if (i6 == 0) {
                    i2 = 0;
                } else {
                    i2 = lazyStaggeredGridMeasureContext.getResolvedSlotSums()[i6 - 1] + (lazyStaggeredGridMeasureContext.getCrossAxisSpacing() * i6);
                }
                if (!removeFirst.getPlaceables().isEmpty()) {
                    arrayList.add(removeFirst.position(i6, r3, i2, i));
                    int i9 = (int) (r5 & 4294967295L);
                    for (int i10 = (int) (r5 >> 32); i10 < i9; i10++) {
                        iArr[i10] = removeFirst.getSizeWithSpacings() + r3;
                    }
                }
            }
        }
    }

    private static final String debugRender(C12699k<LazyStaggeredGridMeasuredItem>[] kVarArr) {
        return "";
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i) {
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                while (true) {
                    if (iArr[length] < i && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                        break;
                    }
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
                if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                    lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
                }
                if (i2 >= 0) {
                    length = i2;
                } else {
                    return;
                }
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int i2) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i, i2);
    }

    /* renamed from: forEach-nIS5qE8  reason: not valid java name */
    private static final void m33557forEachnIS5qE8(long j, Function1<? super Integer, C11921v> function1) {
        int i = (int) (j & 4294967295L);
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            function1.invoke(Integer.valueOf(i2));
        }
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    private static final <T> int indexOfMinBy(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int intValue = function1.invoke(tArr[i3]).intValue();
            if (i2 > intValue) {
                i = i3;
                i2 = intValue;
            }
        }
        return i;
    }

    public static final int indexOfMinValue(int[] iArr, int i) {
        C12775o.m28639i(iArr, "<this>");
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            boolean z = true;
            int i5 = i + 1;
            int i6 = iArr[i4];
            if (i5 > i6 || i6 >= i3) {
                z = false;
            }
            if (z) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i);
    }

    /* renamed from: maxInRange-jy6DScQ  reason: not valid java name */
    private static final int m33558maxInRangejy6DScQ(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int i2 = Integer.MIN_VALUE;
        for (int i3 = (int) (j >> 32); i3 < i; i3++) {
            i2 = Math.max(i2, iArr[i3]);
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0568, code lost:
        if (r12[r10] > r4) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x060f, code lost:
        if (r3[r11] < r10) goto L_0x0611;
     */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0585  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x05ae  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x061a  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x062d  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0655  */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0611 A[EDGE_INSN: B:450:0x0611->B:309:0x0611 ?: BREAK  , SYNTHETIC] */
    @androidx.compose.foundation.ExperimentalFoundationApi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r30, int r31, int[] r32, int[] r33, boolean r34) {
        /*
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope r4 = r30.getMeasureScope()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r5 = r30.getItemProvider()
            int r15 = r5.getItemCount()
            if (r15 <= 0) goto L_0x0791
            int r5 = r30.getLaneCount()
            if (r5 != 0) goto L_0x001e
            goto L_0x0791
        L_0x001e:
            int r5 = r2.length
            int[] r8 = java.util.Arrays.copyOf(r2, r5)
            java.lang.String r5 = "copyOf(this, size)"
            kotlin.jvm.internal.C12775o.m28638h(r8, r5)
            int r2 = r3.length
            int[] r9 = java.util.Arrays.copyOf(r3, r2)
            kotlin.jvm.internal.C12775o.m28638h(r9, r5)
            ensureIndicesInRange(r0, r8, r15)
            int r2 = -r1
            offsetBy(r9, r2)
            int r6 = r30.getLaneCount()
            kotlin.collections.k[] r7 = new kotlin.collections.C12699k[r6]
            r2 = 0
        L_0x003e:
            if (r2 >= r6) goto L_0x004c
            kotlin.collections.k r3 = new kotlin.collections.k
            r11 = 16
            r3.<init>(r11)
            r7[r2] = r3
            int r2 = r2 + 1
            goto L_0x003e
        L_0x004c:
            int r2 = r30.getBeforeContentPadding()
            int r2 = -r2
            offsetBy(r9, r2)
        L_0x0054:
            boolean r2 = measure$lambda$37$hasSpaceBeforeFirst(r8, r9, r0)
            if (r2 == 0) goto L_0x00e3
            int r2 = indexOfMaxValue(r8)
            r14 = r8[r2]
            int r10 = r9.length
            r3 = 0
        L_0x0062:
            if (r3 >= r10) goto L_0x0075
            r11 = r8[r3]
            r12 = r8[r2]
            if (r11 == r12) goto L_0x0072
            r11 = r9[r3]
            r12 = r9[r2]
            if (r11 >= r12) goto L_0x0072
            r9[r3] = r12
        L_0x0072:
            int r3 = r3 + 1
            goto L_0x0062
        L_0x0075:
            int r3 = findPreviousItemIndex(r0, r14, r2)
            if (r3 >= 0) goto L_0x007d
            goto L_0x00e4
        L_0x007d:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r10 = r30.getItemProvider()
            long r10 = r0.m33555getSpanRangelOCCd4c(r10, r3, r2)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r2 = r30.getLaneInfo()
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r10
            int r12 = (int) r12
            r13 = 32
            long r13 = r10 >> r13
            int r13 = (int) r13
            int r14 = r12 - r13
            r17 = r13
            r13 = 1
            if (r14 == r13) goto L_0x009f
            r19 = r13
            goto L_0x00a1
        L_0x009f:
            r19 = 0
        L_0x00a1:
            if (r19 == 0) goto L_0x00a5
            r13 = -2
            goto L_0x00a7
        L_0x00a5:
            r13 = r17
        L_0x00a7:
            r2.setLane(r3, r13)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r2 = r30.getMeasuredItemProvider()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r2 = r2.m33563getAndMeasurejy6DScQ(r3, r10)
            int r10 = m33558maxInRangejy6DScQ(r9, r10)
            r11 = 1
            if (r14 == r11) goto L_0x00bc
            r19 = 1
            goto L_0x00be
        L_0x00bc:
            r19 = 0
        L_0x00be:
            if (r19 == 0) goto L_0x00c9
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r11 = r30.getLaneInfo()
            int[] r11 = r11.getGaps(r3)
            goto L_0x00ca
        L_0x00c9:
            r11 = 0
        L_0x00ca:
            r13 = r17
        L_0x00cc:
            if (r13 >= r12) goto L_0x0054
            r8[r13] = r3
            if (r11 != 0) goto L_0x00d4
            r14 = 0
            goto L_0x00d6
        L_0x00d4:
            r14 = r11[r13]
        L_0x00d6:
            int r16 = r2.getSizeWithSpacings()
            int r16 = r10 + r16
            int r16 = r16 + r14
            r9[r13] = r16
            int r13 = r13 + 1
            goto L_0x00cc
        L_0x00e3:
            r2 = -1
        L_0x00e4:
            int r3 = r30.getBeforeContentPadding()
            int r14 = -r3
            r3 = 0
            r10 = r9[r3]
            if (r10 >= r14) goto L_0x00f4
            int r1 = r1 + r10
            int r10 = r14 - r10
            offsetBy(r9, r10)
        L_0x00f4:
            int r10 = r30.getBeforeContentPadding()
            offsetBy(r9, r10)
            r10 = -1
            if (r2 != r10) goto L_0x0102
            int r2 = kotlin.collections.C12710p.m28388P(r8, r3)
        L_0x0102:
            if (r2 == r10) goto L_0x0132
            boolean r3 = measure$lambda$37$misalignedStart(r8, r0, r9, r2)
            if (r3 == 0) goto L_0x0132
            if (r34 == 0) goto L_0x0132
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r3 = r30.getLaneInfo()
            r3.reset()
            int r3 = r8.length
            int[] r4 = new int[r3]
            r5 = 0
        L_0x0117:
            if (r5 >= r3) goto L_0x011f
            r4[r5] = r10
            int r5 = r5 + 1
            r10 = -1
            goto L_0x0117
        L_0x011f:
            int r3 = r9.length
            int[] r5 = new int[r3]
            r6 = 0
        L_0x0123:
            if (r6 >= r3) goto L_0x012c
            r7 = r9[r2]
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x0123
        L_0x012c:
            r6 = 0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r0 = measure(r0, r1, r4, r5, r6)
            return r0
        L_0x0132:
            int r2 = r8.length
            int[] r3 = java.util.Arrays.copyOf(r8, r2)
            kotlin.jvm.internal.C12775o.m28638h(r3, r5)
            int r10 = r9.length
            int[] r11 = new int[r10]
            r2 = 0
        L_0x013e:
            if (r2 >= r10) goto L_0x0148
            r12 = r9[r2]
            int r12 = -r12
            r11[r2] = r12
            int r2 = r2 + 1
            goto L_0x013e
        L_0x0148:
            int r2 = r30.getMainAxisAvailableSize()
            int r12 = r30.getAfterContentPadding()
            int r2 = r2 + r12
            r12 = 0
            int r13 = p436tf.C13537l.m30877d(r2, r12)
            r23 = r4
            r2 = 0
            r4 = 1
            int r24 = indexOfMinValue$default(r3, r12, r4, r2)
            r4 = r24
            r2 = 0
        L_0x0161:
            r12 = -1
            if (r4 == r12) goto L_0x0206
            int r12 = r30.getLaneCount()
            if (r2 >= r12) goto L_0x0206
            r12 = r3[r4]
            int r24 = indexOfMinValue(r3, r12)
            int r2 = r2 + 1
            if (r12 < 0) goto L_0x01e6
            r31 = r2
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r2 = r30.getItemProvider()
            r25 = r5
            long r4 = r0.m33555getSpanRangelOCCd4c(r2, r12, r4)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r2 = r30.getMeasuredItemProvider()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r2 = r2.m33563getAndMeasurejy6DScQ(r12, r4)
            r26 = r1
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r1 = r30.getLaneInfo()
            r27 = r8
            r28 = r9
            r21 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r4 & r21
            int r8 = (int) r8
            r29 = r13
            r33 = r14
            r9 = 32
            long r13 = r4 >> r9
            int r9 = (int) r13
            int r13 = r8 - r9
            r14 = 1
            if (r13 == r14) goto L_0x01aa
            r14 = 1
            goto L_0x01ab
        L_0x01aa:
            r14 = 0
        L_0x01ab:
            if (r14 == 0) goto L_0x01af
            r14 = -2
            goto L_0x01b0
        L_0x01af:
            r14 = r9
        L_0x01b0:
            r1.setLane(r12, r14)
            int r1 = m33558maxInRangejy6DScQ(r11, r4)
            int r4 = r2.getSizeWithSpacings()
            int r1 = r1 + r4
            r4 = r9
        L_0x01bd:
            if (r4 >= r8) goto L_0x01cb
            r11[r4] = r1
            r3[r4] = r12
            r5 = r7[r4]
            r5.addLast(r2)
            int r4 = r4 + 1
            goto L_0x01bd
        L_0x01cb:
            r1 = r11[r9]
            int r4 = r30.getMainAxisSpacing()
            int r14 = r33 + r4
            if (r1 > r14) goto L_0x01d9
            r1 = 0
            r2.setVisible(r1)
        L_0x01d9:
            r1 = 1
            if (r13 == r1) goto L_0x01de
            r1 = 1
            goto L_0x01df
        L_0x01de:
            r1 = 0
        L_0x01df:
            if (r1 == 0) goto L_0x01f4
            int r2 = r30.getLaneCount()
            goto L_0x01f6
        L_0x01e6:
            r26 = r1
            r31 = r2
            r25 = r5
            r27 = r8
            r28 = r9
            r29 = r13
            r33 = r14
        L_0x01f4:
            r2 = r31
        L_0x01f6:
            r14 = r33
            r4 = r24
            r5 = r25
            r1 = r26
            r8 = r27
            r9 = r28
            r13 = r29
            goto L_0x0161
        L_0x0206:
            r26 = r1
            r25 = r5
            r27 = r8
            r28 = r9
            r29 = r13
            r33 = r14
        L_0x0212:
            r1 = 0
        L_0x0213:
            if (r1 >= r10) goto L_0x022a
            r2 = r11[r1]
            r8 = r29
            if (r2 < r8) goto L_0x0220
            if (r2 > 0) goto L_0x021e
            goto L_0x0220
        L_0x021e:
            r2 = 0
            goto L_0x0221
        L_0x0220:
            r2 = 1
        L_0x0221:
            if (r2 == 0) goto L_0x0225
            r1 = 1
            goto L_0x022d
        L_0x0225:
            int r1 = r1 + 1
            r29 = r8
            goto L_0x0213
        L_0x022a:
            r8 = r29
            r1 = 0
        L_0x022d:
            if (r1 != 0) goto L_0x0245
            r1 = 0
        L_0x0230:
            if (r1 >= r6) goto L_0x023f
            r2 = r7[r1]
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x023c
            r1 = 0
            goto L_0x0240
        L_0x023c:
            int r1 = r1 + 1
            goto L_0x0230
        L_0x023f:
            r1 = 1
        L_0x0240:
            if (r1 == 0) goto L_0x0243
            goto L_0x0245
        L_0x0243:
            r2 = 1
            goto L_0x0253
        L_0x0245:
            r1 = 0
            r2 = 1
            r4 = 0
            int r5 = indexOfMinValue$default(r11, r4, r2, r1)
            int r1 = kotlin.collections.C12710p.m28396X(r3)
            int r1 = r1 + r2
            if (r1 < r15) goto L_0x06ef
        L_0x0253:
            r1 = 0
        L_0x0254:
            if (r1 >= r6) goto L_0x02aa
            r4 = r7[r1]
        L_0x0258:
            int r5 = r4.size()
            if (r5 <= r2) goto L_0x0296
            java.lang.Object r5 = r4.first()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r5 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r5
            boolean r5 = r5.isVisible()
            if (r5 != 0) goto L_0x0296
            java.lang.Object r5 = r4.removeFirst()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r5 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r5
            int r9 = r5.getSpan()
            if (r9 == r2) goto L_0x0283
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r2 = r30.getLaneInfo()
            int r9 = r5.getIndex()
            int[] r2 = r2.getGaps(r9)
            goto L_0x0284
        L_0x0283:
            r2 = 0
        L_0x0284:
            r9 = r28[r1]
            int r5 = r5.getSizeWithSpacings()
            if (r2 != 0) goto L_0x028e
            r2 = 0
            goto L_0x0290
        L_0x028e:
            r2 = r2[r1]
        L_0x0290:
            int r5 = r5 + r2
            int r9 = r9 - r5
            r28[r1] = r9
            r2 = 1
            goto L_0x0258
        L_0x0296:
            java.lang.Object r2 = r4.mo50579r()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r2
            if (r2 == 0) goto L_0x02a3
            int r2 = r2.getIndex()
            goto L_0x02a4
        L_0x02a3:
            r2 = -1
        L_0x02a4:
            r27[r1] = r2
            int r1 = r1 + 1
            r2 = 1
            goto L_0x0254
        L_0x02aa:
            int r1 = r3.length
            r2 = 0
        L_0x02ac:
            if (r2 >= r1) goto L_0x02be
            r4 = r3[r2]
            int r5 = r15 + -1
            if (r4 != r5) goto L_0x02b6
            r4 = 1
            goto L_0x02b7
        L_0x02b6:
            r4 = 0
        L_0x02b7:
            if (r4 == 0) goto L_0x02bb
            r1 = 1
            goto L_0x02bf
        L_0x02bb:
            int r2 = r2 + 1
            goto L_0x02ac
        L_0x02be:
            r1 = 0
        L_0x02bf:
            if (r1 == 0) goto L_0x02c9
            int r1 = r30.getMainAxisSpacing()
            int r1 = -r1
            offsetBy(r11, r1)
        L_0x02c9:
            r1 = 0
        L_0x02ca:
            if (r1 >= r10) goto L_0x02de
            r2 = r11[r1]
            int r4 = r30.getMainAxisAvailableSize()
            if (r2 >= r4) goto L_0x02d6
            r2 = 1
            goto L_0x02d7
        L_0x02d6:
            r2 = 0
        L_0x02d7:
            if (r2 != 0) goto L_0x02db
            r1 = 0
            goto L_0x02df
        L_0x02db:
            int r1 = r1 + 1
            goto L_0x02ca
        L_0x02de:
            r1 = 1
        L_0x02df:
            if (r1 == 0) goto L_0x0425
            int r1 = indexOfMaxValue(r11)
            int r2 = r30.getMainAxisAvailableSize()
            r1 = r11[r1]
            int r2 = r2 - r1
            int r1 = -r2
            r9 = r28
            offsetBy(r9, r1)
            offsetBy(r11, r2)
            r1 = 0
        L_0x02f6:
            int r4 = r9.length
            r5 = 0
        L_0x02f8:
            if (r5 >= r4) goto L_0x030c
            r12 = r9[r5]
            int r13 = r30.getBeforeContentPadding()
            if (r12 >= r13) goto L_0x0304
            r12 = 1
            goto L_0x0305
        L_0x0304:
            r12 = 0
        L_0x0305:
            if (r12 == 0) goto L_0x0309
            r4 = 1
            goto L_0x030d
        L_0x0309:
            int r5 = r5 + 1
            goto L_0x02f8
        L_0x030c:
            r4 = 0
        L_0x030d:
            if (r4 == 0) goto L_0x03ec
            r4 = 0
            r5 = 1
            r12 = 0
            int r13 = indexOfMinValue$default(r9, r12, r5, r4)
            int r4 = indexOfMaxValue(r27)
            if (r13 == r4) goto L_0x031d
            r1 = 1
        L_0x031d:
            r4 = r27[r13]
            r5 = -1
            if (r4 != r5) goto L_0x0323
            r4 = r15
        L_0x0323:
            int r4 = findPreviousItemIndex(r0, r4, r13)
            if (r4 >= 0) goto L_0x0365
            r12 = r27
            if (r1 != 0) goto L_0x0333
            boolean r4 = measure$lambda$37$misalignedStart(r12, r0, r9, r13)
            if (r4 == 0) goto L_0x035d
        L_0x0333:
            if (r34 == 0) goto L_0x035d
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r1 = r30.getLaneInfo()
            r1.reset()
            int r1 = r12.length
            int[] r2 = new int[r1]
            r3 = 0
        L_0x0340:
            if (r3 >= r1) goto L_0x0348
            r4 = -1
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x0340
        L_0x0348:
            int r1 = r9.length
            int[] r3 = new int[r1]
            r4 = 0
        L_0x034c:
            if (r4 >= r1) goto L_0x0355
            r5 = r9[r13]
            r3[r4] = r5
            int r4 = r4 + 1
            goto L_0x034c
        L_0x0355:
            r14 = r26
            r4 = 0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r0 = measure(r0, r14, r2, r3, r4)
            return r0
        L_0x035d:
            r14 = r26
            r31 = r2
            r24 = r6
            goto L_0x03f4
        L_0x0365:
            r14 = r26
            r12 = r27
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r5 = r30.getItemProvider()
            r24 = r6
            long r5 = r0.m33555getSpanRangelOCCd4c(r5, r4, r13)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r13 = r30.getLaneInfo()
            r26 = r10
            r27 = r11
            r21 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r5 & r21
            int r10 = (int) r10
            r28 = r1
            r31 = r2
            r11 = 32
            long r1 = r5 >> r11
            int r1 = (int) r1
            int r2 = r10 - r1
            r11 = 1
            if (r2 == r11) goto L_0x0394
            r19 = r11
            goto L_0x0396
        L_0x0394:
            r19 = 0
        L_0x0396:
            if (r19 == 0) goto L_0x039a
            r11 = -2
            goto L_0x039b
        L_0x039a:
            r11 = r1
        L_0x039b:
            r13.setLane(r4, r11)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r11 = r30.getMeasuredItemProvider()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r11 = r11.m33563getAndMeasurejy6DScQ(r4, r5)
            int r5 = m33558maxInRangejy6DScQ(r9, r5)
            r6 = 1
            if (r2 == r6) goto L_0x03af
            r2 = 1
            goto L_0x03b0
        L_0x03af:
            r2 = 0
        L_0x03b0:
            if (r2 == 0) goto L_0x03bb
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r2 = r30.getLaneInfo()
            int[] r2 = r2.getGaps(r4)
            goto L_0x03bc
        L_0x03bb:
            r2 = 0
        L_0x03bc:
            if (r1 >= r10) goto L_0x03dc
            r6 = r9[r1]
            if (r6 == r5) goto L_0x03c4
            r28 = 1
        L_0x03c4:
            r6 = r7[r1]
            r6.addFirst(r11)
            r12[r1] = r4
            if (r2 != 0) goto L_0x03cf
            r6 = 0
            goto L_0x03d1
        L_0x03cf:
            r6 = r2[r1]
        L_0x03d1:
            int r13 = r11.getSizeWithSpacings()
            int r13 = r13 + r5
            int r13 = r13 + r6
            r9[r1] = r13
            int r1 = r1 + 1
            goto L_0x03bc
        L_0x03dc:
            r2 = r31
            r6 = r24
            r10 = r26
            r11 = r27
            r1 = r28
            r27 = r12
            r26 = r14
            goto L_0x02f6
        L_0x03ec:
            r31 = r2
            r24 = r6
            r14 = r26
            r12 = r27
        L_0x03f4:
            r26 = r10
            r27 = r11
            if (r1 == 0) goto L_0x0409
            if (r34 == 0) goto L_0x0409
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r1 = r30.getLaneInfo()
            r1.reset()
            r1 = 0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r0 = measure(r0, r14, r12, r9, r1)
            return r0
        L_0x0409:
            r1 = 0
            int r2 = r14 + r31
            r4 = 0
            r5 = 1
            int r6 = indexOfMinValue$default(r9, r1, r5, r4)
            r1 = r9[r6]
            if (r1 >= 0) goto L_0x0421
            int r2 = r2 + r1
            r6 = r27
            offsetBy(r6, r1)
            int r1 = -r1
            offsetBy(r9, r1)
            goto L_0x0423
        L_0x0421:
            r6 = r27
        L_0x0423:
            r1 = r2
            goto L_0x0432
        L_0x0425:
            r24 = r6
            r6 = r11
            r14 = r26
            r12 = r27
            r9 = r28
            r4 = 0
            r26 = r10
            r1 = r14
        L_0x0432:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r2 = r30.getState()
            float r2 = r2.getScrollToBeConsumed$foundation_release()
            int r2 = p418qf.C13265c.m30134c(r2)
            int r2 = p418qf.C13265c.m30132a(r2)
            int r5 = p418qf.C13265c.m30132a(r1)
            if (r2 != r5) goto L_0x0460
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r2 = r30.getState()
            float r2 = r2.getScrollToBeConsumed$foundation_release()
            int r2 = p418qf.C13265c.m30134c(r2)
            int r2 = java.lang.Math.abs(r2)
            int r5 = java.lang.Math.abs(r1)
            if (r2 < r5) goto L_0x0460
            float r1 = (float) r1
            goto L_0x0468
        L_0x0460:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r1 = r30.getState()
            float r1 = r1.getScrollToBeConsumed$foundation_release()
        L_0x0468:
            r11 = r1
            int r1 = r9.length
            int[] r1 = java.util.Arrays.copyOf(r9, r1)
            r10 = r25
            kotlin.jvm.internal.C12775o.m28638h(r1, r10)
            int r2 = r1.length
            r5 = 0
        L_0x0475:
            if (r5 >= r2) goto L_0x047f
            r10 = r1[r5]
            int r10 = -r10
            r1[r5] = r10
            int r5 = r5 + 1
            goto L_0x0475
        L_0x047f:
            int r2 = r30.getBeforeContentPadding()
            if (r2 <= 0) goto L_0x04db
            r13 = r24
            r2 = 0
        L_0x0488:
            if (r2 >= r13) goto L_0x04db
            r5 = r7[r2]
            int r10 = r5.size()
            r14 = 0
        L_0x0491:
            if (r14 >= r10) goto L_0x04d3
            java.lang.Object r20 = r5.get(r14)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r20 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r20
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r4 = r30.getLaneInfo()
            r29 = r8
            int r8 = r20.getIndex()
            int[] r4 = r4.getGaps(r8)
            int r8 = r20.getSizeWithSpacings()
            if (r4 != 0) goto L_0x04af
            r4 = 0
            goto L_0x04b1
        L_0x04af:
            r4 = r4[r2]
        L_0x04b1:
            int r8 = r8 + r4
            int r4 = kotlin.collections.C12726w.m28526m(r5)
            if (r14 == r4) goto L_0x04d5
            r4 = r9[r2]
            if (r4 == 0) goto L_0x04d5
            if (r4 < r8) goto L_0x04d5
            int r4 = r4 - r8
            r9[r2] = r4
            int r14 = r14 + 1
            java.lang.Object r4 = r5.get(r14)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r4 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r4
            int r4 = r4.getIndex()
            r12[r2] = r4
            r8 = r29
            r4 = 0
            goto L_0x0491
        L_0x04d3:
            r29 = r8
        L_0x04d5:
            int r2 = r2 + 1
            r8 = r29
            r4 = 0
            goto L_0x0488
        L_0x04db:
            r29 = r8
            boolean r2 = r30.isVertical()
            if (r2 == 0) goto L_0x04ec
            long r4 = r30.m33552getConstraintsmsEJaDk()
            int r2 = androidx.compose.p002ui.unit.Constraints.m38412getMaxWidthimpl(r4)
            goto L_0x04f8
        L_0x04ec:
            long r4 = r30.m33552getConstraintsmsEJaDk()
            int r2 = kotlin.collections.C12710p.m28396X(r6)
            int r2 = androidx.compose.p002ui.unit.ConstraintsKt.m38426constrainWidthK40F9xA(r4, r2)
        L_0x04f8:
            r8 = r2
            boolean r2 = r30.isVertical()
            if (r2 == 0) goto L_0x050c
            long r4 = r30.m33552getConstraintsmsEJaDk()
            int r2 = kotlin.collections.C12710p.m28396X(r6)
            int r2 = androidx.compose.p002ui.unit.ConstraintsKt.m38425constrainHeightK40F9xA(r4, r2)
            goto L_0x0514
        L_0x050c:
            long r4 = r30.m33552getConstraintsmsEJaDk()
            int r2 = androidx.compose.p002ui.unit.Constraints.m38411getMaxHeightimpl(r4)
        L_0x0514:
            r14 = r2
            boolean r2 = r30.isVertical()
            if (r2 == 0) goto L_0x051d
            r2 = r14
            goto L_0x051e
        L_0x051d:
            r2 = r8
        L_0x051e:
            int r4 = r30.getMainAxisAvailableSize()
            int r2 = java.lang.Math.min(r2, r4)
            r4 = 0
            r5 = r1[r4]
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r4 = r30.getState()
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList r4 = r4.getPinnedItems$foundation_release()
            int r10 = r4.size()
            r13 = r5
            r31 = r11
            r5 = 0
            r11 = 0
        L_0x053a:
            if (r11 >= r10) goto L_0x05c0
            java.lang.Object r20 = r4.get(r11)
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList$PinnedItem r20 = (androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem) r20
            r34 = r4
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r4 = r30.getItemProvider()
            r21 = r10
            java.lang.Object r10 = r20.getKey()
            r22 = r14
            int r14 = r20.getIndex()
            int r4 = androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt.findIndexByKey(r4, r10, r14)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r10 = r30.getLaneInfo()
            int r10 = r10.getLane(r4)
            r14 = -2
            if (r10 == r14) goto L_0x056e
            r14 = -1
            if (r10 == r14) goto L_0x056e
            r10 = r12[r10]
            if (r10 <= r4) goto L_0x056c
        L_0x056a:
            r10 = 1
            goto L_0x0583
        L_0x056c:
            r10 = 0
            goto L_0x0583
        L_0x056e:
            int r10 = r12.length
            r14 = 0
        L_0x0570:
            if (r14 >= r10) goto L_0x056a
            r20 = r10
            r10 = r12[r14]
            if (r10 <= r4) goto L_0x057a
            r10 = 1
            goto L_0x057b
        L_0x057a:
            r10 = 0
        L_0x057b:
            if (r10 != 0) goto L_0x057e
            goto L_0x056c
        L_0x057e:
            int r14 = r14 + 1
            r10 = r20
            goto L_0x0570
        L_0x0583:
            if (r10 == 0) goto L_0x05ae
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r10 = r30.getItemProvider()
            r20 = r8
            r28 = r9
            r14 = 0
            long r8 = r0.m33555getSpanRangelOCCd4c(r10, r4, r14)
            if (r5 != 0) goto L_0x0599
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0599:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r10 = r30.getMeasuredItemProvider()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r4 = r10.m33563getAndMeasurejy6DScQ(r4, r8)
            int r8 = r4.getSizeWithSpacings()
            int r13 = r13 - r8
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridPositionedItem r4 = r4.position(r14, r13, r14, r2)
            r5.add(r4)
            goto L_0x05b2
        L_0x05ae:
            r20 = r8
            r28 = r9
        L_0x05b2:
            int r11 = r11 + 1
            r4 = r34
            r8 = r20
            r10 = r21
            r14 = r22
            r9 = r28
            goto L_0x053a
        L_0x05c0:
            r20 = r8
            r28 = r9
            r22 = r14
            if (r5 != 0) goto L_0x05cc
            java.util.List r5 = kotlin.collections.C12726w.m28524k()
        L_0x05cc:
            java.util.List r14 = calculatePositionedItems(r0, r7, r1, r2)
            r4 = 0
            r1 = r1[r4]
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r4 = r30.getState()
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList r4 = r4.getPinnedItems$foundation_release()
            int r7 = r4.size()
            r8 = 0
            r9 = 0
        L_0x05e1:
            if (r9 >= r7) goto L_0x0660
            java.lang.Object r10 = r4.get(r9)
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList$PinnedItem r10 = (androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem) r10
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r11 = r30.getItemProvider()
            java.lang.Object r13 = r10.getKey()
            int r10 = r10.getIndex()
            int r10 = androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt.findIndexByKey(r11, r13, r10)
            if (r10 < r15) goto L_0x05ff
        L_0x05fb:
            r34 = r4
        L_0x05fd:
            r4 = 0
            goto L_0x062b
        L_0x05ff:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r11 = r30.getLaneInfo()
            int r11 = r11.getLane(r10)
            r13 = -2
            if (r11 == r13) goto L_0x0615
            r13 = -1
            if (r11 == r13) goto L_0x0616
            r11 = r3[r11]
            if (r11 >= r10) goto L_0x05fb
        L_0x0611:
            r34 = r4
            r4 = 1
            goto L_0x062b
        L_0x0615:
            r13 = -1
        L_0x0616:
            int r11 = r3.length
            r13 = 0
        L_0x0618:
            if (r13 >= r11) goto L_0x0611
            r34 = r4
            r4 = r3[r13]
            if (r4 >= r10) goto L_0x0622
            r4 = 1
            goto L_0x0623
        L_0x0622:
            r4 = 0
        L_0x0623:
            if (r4 != 0) goto L_0x0626
            goto L_0x05fd
        L_0x0626:
            int r13 = r13 + 1
            r4 = r34
            goto L_0x0618
        L_0x062b:
            if (r4 == 0) goto L_0x0655
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r4 = r30.getItemProvider()
            r13 = r5
            r11 = 0
            long r4 = r0.m33555getSpanRangelOCCd4c(r4, r10, r11)
            if (r8 != 0) goto L_0x063e
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x063e:
            r21 = r7
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r7 = r30.getMeasuredItemProvider()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r4 = r7.m33563getAndMeasurejy6DScQ(r10, r4)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridPositionedItem r5 = r4.position(r11, r1, r11, r2)
            int r4 = r4.getSizeWithSpacings()
            int r1 = r1 + r4
            r8.add(r5)
            goto L_0x0658
        L_0x0655:
            r13 = r5
            r21 = r7
        L_0x0658:
            int r9 = r9 + 1
            r4 = r34
            r5 = r13
            r7 = r21
            goto L_0x05e1
        L_0x0660:
            r13 = r5
            if (r8 != 0) goto L_0x0667
            java.util.List r8 = kotlin.collections.C12726w.m28524k()
        L_0x0667:
            r1 = 0
            r2 = r12[r1]
            if (r2 != 0) goto L_0x0674
            r2 = r28[r1]
            if (r2 <= 0) goto L_0x0671
            goto L_0x0674
        L_0x0671:
            r24 = 0
            goto L_0x0676
        L_0x0674:
            r24 = 1
        L_0x0676:
            r4 = r26
            r1 = 0
        L_0x0679:
            if (r1 >= r4) goto L_0x068d
            r2 = r6[r1]
            int r5 = r30.getMainAxisAvailableSize()
            if (r2 <= r5) goto L_0x0685
            r2 = 1
            goto L_0x0686
        L_0x0685:
            r2 = 0
        L_0x0686:
            if (r2 == 0) goto L_0x068a
            r1 = 1
            goto L_0x068e
        L_0x068a:
            int r1 = r1 + 1
            goto L_0x0679
        L_0x068d:
            r1 = 0
        L_0x068e:
            if (r1 != 0) goto L_0x06aa
            int r1 = r3.length
            r2 = 0
        L_0x0692:
            if (r2 >= r1) goto L_0x06a4
            r4 = r3[r2]
            int r5 = r15 + -1
            if (r4 >= r5) goto L_0x069c
            r4 = 1
            goto L_0x069d
        L_0x069c:
            r4 = 0
        L_0x069d:
            if (r4 != 0) goto L_0x06a1
            r1 = 0
            goto L_0x06a5
        L_0x06a1:
            int r2 = r2 + 1
            goto L_0x0692
        L_0x06a4:
            r1 = 1
        L_0x06a5:
            if (r1 == 0) goto L_0x06a8
            goto L_0x06aa
        L_0x06a8:
            r11 = 0
            goto L_0x06ab
        L_0x06aa:
            r11 = 1
        L_0x06ab:
            r4 = 0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$29 r5 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$29
            r1 = r13
            r5.<init>(r1, r14, r8, r0)
            r6 = 4
            r7 = 0
            r1 = r23
            r2 = r20
            r3 = r22
            androidx.compose.ui.layout.MeasureResult r10 = androidx.compose.p002ui.layout.MeasureScope.layout$default(r1, r2, r3, r4, r5, r6, r7)
            boolean r13 = r30.isVertical()
            r25 = r29
            r1 = r22
            long r16 = androidx.compose.p002ui.unit.IntSizeKt.IntSize(r2, r1)
            int r20 = r30.getBeforeContentPadding()
            int r21 = r30.getAfterContentPadding()
            int r22 = r30.getMainAxisSpacing()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult
            r6 = r0
            r23 = 0
            r7 = r12
            r8 = r28
            r9 = r31
            r12 = r24
            r24 = r33
            r1 = r14
            r14 = r15
            r15 = r1
            r18 = r24
            r19 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23)
            return r0
        L_0x06ef:
            r24 = r33
            r4 = r10
            r10 = r25
            r14 = r26
            r12 = r27
            r9 = -2
            r25 = r8
            r8 = r6
            r6 = r11
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r2 = r30.getItemProvider()
            r11 = r10
            long r9 = r0.m33555getSpanRangelOCCd4c(r2, r1, r5)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r2 = r30.getLaneInfo()
            r26 = r4
            r21 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r9 & r21
            int r4 = (int) r4
            r31 = r11
            r5 = 32
            long r11 = r9 >> r5
            int r11 = (int) r11
            int r12 = r4 - r11
            r13 = 1
            if (r12 == r13) goto L_0x0723
            r19 = r13
            goto L_0x0725
        L_0x0723:
            r19 = 0
        L_0x0725:
            if (r19 == 0) goto L_0x0729
            r5 = -2
            goto L_0x072a
        L_0x0729:
            r5 = r11
        L_0x072a:
            r2.setLane(r1, r5)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r2 = r30.getMeasuredItemProvider()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r2 = r2.m33563getAndMeasurejy6DScQ(r1, r9)
            int r5 = m33558maxInRangejy6DScQ(r6, r9)
            if (r12 == r13) goto L_0x073d
            r9 = r13
            goto L_0x073e
        L_0x073d:
            r9 = 0
        L_0x073e:
            if (r9 == 0) goto L_0x0751
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r9 = r30.getLaneInfo()
            int[] r9 = r9.getGaps(r1)
            if (r9 != 0) goto L_0x0752
            int r9 = r30.getLaneCount()
            int[] r9 = new int[r9]
            goto L_0x0752
        L_0x0751:
            r9 = 0
        L_0x0752:
            r10 = r11
        L_0x0753:
            if (r10 >= r4) goto L_0x076e
            if (r9 == 0) goto L_0x075d
            r12 = r6[r10]
            int r12 = r5 - r12
            r9[r10] = r12
        L_0x075d:
            r3[r10] = r1
            int r12 = r2.getSizeWithSpacings()
            int r12 = r12 + r5
            r6[r10] = r12
            r12 = r7[r10]
            r12.addLast(r2)
            int r10 = r10 + 1
            goto L_0x0753
        L_0x076e:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r4 = r30.getLaneInfo()
            r4.setGaps(r1, r9)
            r1 = r6[r11]
            int r4 = r30.getMainAxisSpacing()
            int r4 = r24 + r4
            if (r1 > r4) goto L_0x0783
            r1 = 0
            r2.setVisible(r1)
        L_0x0783:
            r11 = r6
            r6 = r8
            r33 = r24
            r29 = r25
            r10 = r26
            r25 = r31
            r26 = r14
            goto L_0x0212
        L_0x0791:
            r23 = r4
            long r3 = r30.m33552getConstraintsmsEJaDk()
            int r5 = androidx.compose.p002ui.unit.Constraints.m38414getMinWidthimpl(r3)
            long r3 = r30.m33552getConstraintsmsEJaDk()
            int r6 = androidx.compose.p002ui.unit.Constraints.m38413getMinHeightimpl(r3)
            r7 = 0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1 r8 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1.INSTANCE
            r9 = 4
            r10 = 0
            r4 = r23
            androidx.compose.ui.layout.MeasureResult r5 = androidx.compose.p002ui.layout.MeasureScope.layout$default(r4, r5, r6, r7, r8, r9, r10)
            boolean r8 = r30.isVertical()
            java.util.List r10 = kotlin.collections.C12726w.m28524k()
            long r3 = r30.m33552getConstraintsmsEJaDk()
            int r1 = androidx.compose.p002ui.unit.Constraints.m38414getMinWidthimpl(r3)
            long r3 = r30.m33552getConstraintsmsEJaDk()
            int r3 = androidx.compose.p002ui.unit.Constraints.m38413getMinHeightimpl(r3)
            long r11 = androidx.compose.p002ui.unit.IntSizeKt.IntSize(r1, r3)
            int r1 = r30.getBeforeContentPadding()
            int r13 = -r1
            int r1 = r30.getMainAxisAvailableSize()
            int r3 = r30.getAfterContentPadding()
            int r14 = r1 + r3
            int r1 = r30.getBeforeContentPadding()
            r9 = r15
            r15 = r1
            int r16 = r30.getAfterContentPadding()
            int r17 = r30.getMainAxisSpacing()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult
            r1 = r0
            r4 = 0
            r6 = 0
            r7 = 0
            r18 = 0
            r2 = r32
            r3 = r33
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    private static final boolean measure$lambda$37$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$37$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
        boolean z;
        boolean z2;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i2], i2) != -1 || iArr2[i2] == iArr2[i]) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i3], i3) == -1 || iArr2[i3] < iArr2[i]) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        if (lane == 0 || lane == -1 || lane == -2) {
            return false;
        }
        return true;
    }

    @ExperimentalFoundationApi
    /* renamed from: measureStaggeredGrid-BTfHGGE  reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m33559measureStaggeredGridBTfHGGE(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int[] iArr, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4, int i5) {
        Snapshot makeCurrent;
        Object obj;
        Object obj2;
        int i6;
        int i7;
        int i8;
        int[] iArr2 = iArr;
        C12775o.m28639i(lazyLayoutMeasureScope, "$this$measureStaggeredGrid");
        C12775o.m28639i(lazyStaggeredGridState, "state");
        C12775o.m28639i(lazyStaggeredGridItemProvider, "itemProvider");
        C12775o.m28639i(iArr2, "resolvedSlotSums");
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = r1;
        LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState2, lazyStaggeredGridItemProvider, iArr, j, z, lazyLayoutMeasureScope, i, j2, i4, i5, z2, i2, i3, (DefaultConstructorMarker) null);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            makeCurrent = createNonObservableSnapshot.makeCurrent();
            int[] indices = lazyStaggeredGridState.getScrollPosition$foundation_release().getIndices();
            int[] offsets = lazyStaggeredGridState.getScrollPosition$foundation_release().getOffsets();
            if (indices.length == iArr2.length) {
                obj = indices;
            } else {
                lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                for (int i9 = 0; i9 < length; i9++) {
                    if (i9 < indices.length && (i8 = indices[i9]) != -1) {
                        i7 = i8;
                    } else if (i9 == 0) {
                        i7 = 0;
                    } else {
                        i7 = m33558maxInRangejy6DScQ(iArr3, SpanRange.m33569constructorimpl(0, i9)) + 1;
                    }
                    iArr3[i9] = i7;
                    lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr3[i9], i9);
                }
                obj = iArr3;
            }
            ref$ObjectRef.f20403b = obj;
            if (offsets.length == iArr2.length) {
                obj2 = offsets;
            } else {
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                for (int i10 = 0; i10 < length2; i10++) {
                    if (i10 < offsets.length) {
                        i6 = offsets[i10];
                    } else if (i10 == 0) {
                        i6 = 0;
                    } else {
                        i6 = iArr4[i10 - 1];
                    }
                    iArr4[i10] = i6;
                }
                obj2 = iArr4;
            }
            ref$ObjectRef2.f20403b = obj2;
            C11921v vVar = C11921v.f18618a;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
            return measure(lazyStaggeredGridMeasureContext, C13265c.m30134c(lazyStaggeredGridState.getScrollToBeConsumed$foundation_release()), (int[]) ref$ObjectRef.f20403b, (int[]) ref$ObjectRef2.f20403b, true);
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }

    private static final void offsetBy(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    private static final int[] transform(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = function1.invoke(Integer.valueOf(iArr[i])).intValue();
        }
        return iArr;
    }

    @ExperimentalFoundationApi
    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, Function1<? super LazyLayoutMeasureScope, ? extends T> function1) {
        return function1.invoke(lazyLayoutMeasureScope);
    }

    private static final void debugLog(C13074a<String> aVar) {
    }
}
