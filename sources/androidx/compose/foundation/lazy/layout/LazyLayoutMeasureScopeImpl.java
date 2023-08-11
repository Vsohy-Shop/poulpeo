package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.layout.SubcomposeMeasureScope;
import androidx.compose.p002ui.unit.DpRect;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
@ExperimentalFoundationApi
/* compiled from: LazyLayoutMeasureScope.kt */
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {
    private final LazyLayoutItemContentFactory itemContentFactory;
    private final HashMap<Integer, List<Placeable>> placeablesCache = new HashMap<>();
    private final SubcomposeMeasureScope subcomposeMeasureScope;

    public LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeMeasureScope subcomposeMeasureScope2) {
        C12775o.m28639i(lazyLayoutItemContentFactory, "itemContentFactory");
        C12775o.m28639i(subcomposeMeasureScope2, "subcomposeMeasureScope");
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeMeasureScope = subcomposeMeasureScope2;
    }

    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    public LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    public MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, Function1<? super Placeable.PlacementScope, C11921v> function1) {
        C12775o.m28639i(map, "alignmentLines");
        C12775o.m28639i(function1, "placementBlock");
        return this.subcomposeMeasureScope.layout(i, i2, map, function1);
    }

    /* renamed from: measure-0kLqBqw  reason: not valid java name */
    public List<Placeable> m33526measure0kLqBqw(int i, long j) {
        List<Placeable> list = this.placeablesCache.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        Object key = this.itemContentFactory.getItemProvider().invoke().getKey(i);
        List<Measurable> subcompose = this.subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(i, key));
        int size = subcompose.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(subcompose.get(i2).m37365measureBRTryo0(j));
        }
        this.placeablesCache.put(Integer.valueOf(i), arrayList);
        return arrayList;
    }

    @Stable
    /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
    public int m33527roundToPxR2X_6o(long j) {
        return this.subcomposeMeasureScope.m38442roundToPxR2X_6o(j);
    }

    @Stable
    /* renamed from: roundToPx-0680j_4  reason: not valid java name */
    public int m33528roundToPx0680j_4(float f) {
        return this.subcomposeMeasureScope.m38443roundToPx0680j_4(f);
    }

    /* renamed from: toDp-GaN1DYA  reason: not valid java name */
    public float m33529toDpGaN1DYA(long j) {
        return this.subcomposeMeasureScope.m38444toDpGaN1DYA(j);
    }

    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float m33531toDpu2uoSUM(int i) {
        return this.subcomposeMeasureScope.m38446toDpu2uoSUM(i);
    }

    /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
    public long m33532toDpSizekrfVVM(long j) {
        return this.subcomposeMeasureScope.m38447toDpSizekrfVVM(j);
    }

    @Stable
    /* renamed from: toPx--R2X_6o  reason: not valid java name */
    public float m33533toPxR2X_6o(long j) {
        return this.subcomposeMeasureScope.m38448toPxR2X_6o(j);
    }

    @Stable
    /* renamed from: toPx-0680j_4  reason: not valid java name */
    public float m33534toPx0680j_4(float f) {
        return this.subcomposeMeasureScope.m38449toPx0680j_4(f);
    }

    @Stable
    public Rect toRect(DpRect dpRect) {
        C12775o.m28639i(dpRect, "<this>");
        return this.subcomposeMeasureScope.toRect(dpRect);
    }

    /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
    public long m33535toSizeXkaWNTQ(long j) {
        return this.subcomposeMeasureScope.m38450toSizeXkaWNTQ(j);
    }

    /* renamed from: toSp-0xMU5do  reason: not valid java name */
    public long m33536toSp0xMU5do(float f) {
        return this.subcomposeMeasureScope.m38451toSp0xMU5do(f);
    }

    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long m33537toSpkPz2Gy4(float f) {
        return this.subcomposeMeasureScope.m38452toSpkPz2Gy4(f);
    }

    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float m33530toDpu2uoSUM(float f) {
        return this.subcomposeMeasureScope.m38445toDpu2uoSUM(f);
    }

    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long m33538toSpkPz2Gy4(int i) {
        return this.subcomposeMeasureScope.m38453toSpkPz2Gy4(i);
    }
}
