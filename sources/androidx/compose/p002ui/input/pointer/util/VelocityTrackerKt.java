package androidx.compose.p002ui.input.pointer.util;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.HistoricalChange;
import androidx.compose.p002ui.input.pointer.PointerEventKt;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,599:1\n33#2,6:600\n1#3:606\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n297#1:600,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.util.VelocityTrackerKt */
/* compiled from: VelocityTracker.kt */
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;

    public static final void addPointerInputChange(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        C12775o.m28639i(velocityTracker, "<this>");
        C12775o.m28639i(pointerInputChange, NotificationCompat.CATEGORY_EVENT);
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.m37292setCurrentPointerPositionAccumulatork4lQ0M$ui_release(pointerInputChange.m37169getPositionF1C5BW0());
            velocityTracker.resetTracking();
        }
        long r0 = pointerInputChange.m37170getPreviousPositionF1C5BW0();
        List<HistoricalChange> historical = pointerInputChange.getHistorical();
        int size = historical.size();
        int i = 0;
        while (i < size) {
            HistoricalChange historicalChange = historical.get(i);
            long r02 = Offset.m35426minusMKHz9U(historicalChange.m37099getPositionF1C5BW0(), r0);
            long r6 = historicalChange.m37099getPositionF1C5BW0();
            velocityTracker.m37292setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m35427plusMKHz9U(velocityTracker.m37291getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), r02));
            velocityTracker.m37289addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.m37291getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
            i++;
            r0 = r6;
        }
        velocityTracker.m37292setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m35427plusMKHz9U(velocityTracker.m37291getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), Offset.m35426minusMKHz9U(pointerInputChange.m37169getPositionF1C5BW0(), r0)));
        velocityTracker.m37289addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), velocityTracker.m37291getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
    }

    /* access modifiers changed from: private */
    public static final float calculateImpulseVelocity(List<Float> list, List<Float> list2, boolean z) {
        boolean z2;
        float f;
        boolean z3;
        float f2;
        int size = list.size();
        float f3 = 0.0f;
        if (size < 2) {
            return 0.0f;
        }
        if (size == 2) {
            if (list2.get(0).floatValue() == list2.get(1).floatValue()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                return 0.0f;
            }
            if (z) {
                f2 = list.get(0).floatValue();
            } else {
                f2 = list.get(0).floatValue() - list.get(1).floatValue();
            }
            return f2 / (list2.get(0).floatValue() - list2.get(1).floatValue());
        }
        int i = size - 1;
        for (int i2 = i; i2 > 0; i2--) {
            int i3 = i2 - 1;
            if (list2.get(i2).floatValue() == list2.get(i3).floatValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                float kineticEnergyToVelocity = kineticEnergyToVelocity(f3);
                if (z) {
                    f = -list.get(i3).floatValue();
                } else {
                    f = list.get(i2).floatValue() - list.get(i3).floatValue();
                }
                float floatValue = f / (list2.get(i2).floatValue() - list2.get(i3).floatValue());
                f3 += (floatValue - kineticEnergyToVelocity) * Math.abs(floatValue);
                if (i2 == i) {
                    f3 *= 0.5f;
                }
            }
        }
        return kineticEnergyToVelocity(f3);
    }

    private static final float kineticEnergyToVelocity(float f) {
        return Math.signum(f) * ((float) Math.sqrt((double) (((float) 2) * Math.abs(f))));
    }

    public static final List<Float> polyFitLeastSquares(List<Float> list, List<Float> list2, int i) {
        int i2;
        float f;
        List<Float> list3 = list;
        List<Float> list4 = list2;
        int i3 = i;
        C12775o.m28639i(list3, "x");
        C12775o.m28639i(list4, "y");
        if (i3 < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        } else if (!list.isEmpty()) {
            if (i3 >= list.size()) {
                i2 = list.size() - 1;
            } else {
                i2 = i3;
            }
            int i4 = i3 + 1;
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(Float.valueOf(0.0f));
            }
            int size = list.size();
            int i6 = i2 + 1;
            Matrix matrix = new Matrix(i6, size);
            for (int i7 = 0; i7 < size; i7++) {
                matrix.set(0, i7, 1.0f);
                for (int i8 = 1; i8 < i6; i8++) {
                    matrix.set(i8, i7, matrix.get(i8 - 1, i7) * list3.get(i7).floatValue());
                }
            }
            Matrix matrix2 = new Matrix(i6, size);
            Matrix matrix3 = new Matrix(i6, i6);
            int i9 = 0;
            while (i9 < i6) {
                for (int i10 = 0; i10 < size; i10++) {
                    matrix2.set(i9, i10, matrix.get(i9, i10));
                }
                for (int i11 = 0; i11 < i9; i11++) {
                    float times = matrix2.getRow(i9).times(matrix2.getRow(i11));
                    for (int i12 = 0; i12 < size; i12++) {
                        matrix2.set(i9, i12, matrix2.get(i9, i12) - (matrix2.get(i11, i12) * times));
                    }
                }
                float norm = matrix2.getRow(i9).norm();
                if (((double) norm) >= 1.0E-6d) {
                    float f2 = 1.0f / norm;
                    for (int i13 = 0; i13 < size; i13++) {
                        matrix2.set(i9, i13, matrix2.get(i9, i13) * f2);
                    }
                    for (int i14 = 0; i14 < i6; i14++) {
                        if (i14 < i9) {
                            f = 0.0f;
                        } else {
                            f = matrix2.getRow(i9).times(matrix.getRow(i14));
                        }
                        matrix3.set(i9, i14, f);
                    }
                    i9++;
                } else {
                    throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                }
            }
            Vector vector = new Vector(size);
            for (int i15 = 0; i15 < size; i15++) {
                vector.set(i15, list4.get(i15).floatValue() * 1.0f);
            }
            int i16 = i6 - 1;
            for (int i17 = i16; -1 < i17; i17--) {
                arrayList.set(i17, Float.valueOf(matrix2.getRow(i17).times(vector)));
                int i18 = i17 + 1;
                if (i18 <= i16) {
                    int i19 = i16;
                    while (true) {
                        arrayList.set(i17, Float.valueOf(((Number) arrayList.get(i17)).floatValue() - (matrix3.get(i17, i19) * ((Number) arrayList.get(i19)).floatValue())));
                        if (i19 == i18) {
                            break;
                        }
                        i19--;
                    }
                }
                arrayList.set(i17, Float.valueOf(((Number) arrayList.get(i17)).floatValue() / matrix3.get(i17, i17)));
            }
            return arrayList;
        } else {
            throw new IllegalArgumentException("At least one point must be provided");
        }
    }

    /* access modifiers changed from: private */
    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i, long j, float f) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i] = new DataPointAtTime(j, f);
            return;
        }
        dataPointAtTime.setTime(j);
        dataPointAtTime.setDataPoint(f);
    }
}
