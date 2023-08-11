package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.DpKt;
import androidx.compose.p002ui.unit.DpSize;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitKt;
import androidx.compose.p002ui.unit.TextUnitType;
import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,147:1\n1#2:148\n174#3:149\n174#3:150\n473#3:151\n152#4:152\n*S KotlinDebug\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n*L\n70#1:149\n73#1:150\n85#1:151\n92#1:152\n*E\n"})
@ExperimentalFoundationApi
@Stable
/* compiled from: LazyLayoutMeasureScope.kt */
public interface LazyLayoutMeasureScope extends MeasureScope {
    /* renamed from: measure-0kLqBqw  reason: not valid java name */
    List<Placeable> m33517measure0kLqBqw(int i, long j);

    @Stable
    /* renamed from: toDp-GaN1DYA  reason: not valid java name */
    float m33518toDpGaN1DYA(long j) {
        if (TextUnitType.m38677equalsimpl0(TextUnit.m38648getTypeUIouoOA(j), TextUnitType.Companion.m38682getSpUIouoOA())) {
            return C1232Dp.m38468constructorimpl(TextUnit.m38649getValueimpl(j) * getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Stable
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    float m33520toDpu2uoSUM(int i) {
        return C1232Dp.m38468constructorimpl(((float) i) / getDensity());
    }

    @Stable
    /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
    long m33521toDpSizekrfVVM(long j) {
        boolean z;
        if (j != Size.Companion.m35499getUnspecifiedNHjbRc()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return DpKt.m38490DpSizeYgX7TsA(m33519toDpu2uoSUM(Size.m35491getWidthimpl(j)), m33519toDpu2uoSUM(Size.m35488getHeightimpl(j)));
        }
        return DpSize.Companion.m38575getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
    long m33522toSizeXkaWNTQ(long j) {
        boolean z;
        if (j != DpSize.Companion.m38575getUnspecifiedMYxV2XQ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return SizeKt.Size(m38449toPx0680j_4(DpSize.m38566getWidthD9Ej5fM(j)), m38449toPx0680j_4(DpSize.m38564getHeightD9Ej5fM(j)));
        }
        return Size.Companion.m35499getUnspecifiedNHjbRc();
    }

    @Stable
    /* renamed from: toSp-0xMU5do  reason: not valid java name */
    long m33523toSp0xMU5do(float f) {
        return TextUnitKt.getSp(f / getFontScale());
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    long m33524toSpkPz2Gy4(float f) {
        return TextUnitKt.getSp(f / (getFontScale() * getDensity()));
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    long m33525toSpkPz2Gy4(int i) {
        return TextUnitKt.getSp(((float) i) / (getFontScale() * getDensity()));
    }

    @Stable
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    float m33519toDpu2uoSUM(float f) {
        return C1232Dp.m38468constructorimpl(f / getDensity());
    }
}
