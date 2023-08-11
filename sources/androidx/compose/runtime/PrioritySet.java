package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3443:1\n4513#2,5:3444\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n3392#1:3444,5\n*E\n"})
/* compiled from: SlotTable.kt */
public final class PrioritySet {
    private final List<Integer> list;

    public PrioritySet() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public final void add(int i) {
        if (!this.list.isEmpty()) {
            if (this.list.get(0).intValue() != i) {
                List<Integer> list2 = this.list;
                if (list2.get(list2.size() - 1).intValue() == i) {
                    return;
                }
            } else {
                return;
            }
        }
        int size = this.list.size();
        this.list.add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int intValue = this.list.get(i2).intValue();
            if (i <= intValue) {
                break;
            }
            this.list.set(size, Integer.valueOf(intValue));
            size = i2;
        }
        this.list.set(size, Integer.valueOf(i));
    }

    public final boolean isEmpty() {
        return this.list.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.list.isEmpty();
    }

    public final int peek() {
        return ((Number) C12686e0.m28221Z(this.list)).intValue();
    }

    public final int takeMax() {
        boolean z;
        int intValue;
        if (this.list.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int intValue2 = this.list.get(0).intValue();
            while ((!this.list.isEmpty()) && this.list.get(0).intValue() == intValue2) {
                List<Integer> list2 = this.list;
                list2.set(0, C12686e0.m28231j0(list2));
                List<Integer> list3 = this.list;
                list3.remove(list3.size() - 1);
                int size = this.list.size();
                int size2 = this.list.size() >>> 1;
                int i = 0;
                while (i < size2) {
                    int intValue3 = this.list.get(i).intValue();
                    int i2 = (i + 1) * 2;
                    int i3 = i2 - 1;
                    int intValue4 = this.list.get(i3).intValue();
                    if (i2 < size && (intValue = this.list.get(i2).intValue()) > intValue4) {
                        if (intValue <= intValue3) {
                            break;
                        }
                        this.list.set(i, Integer.valueOf(intValue));
                        this.list.set(i2, Integer.valueOf(intValue3));
                        i = i2;
                    } else if (intValue4 <= intValue3) {
                        break;
                    } else {
                        this.list.set(i, Integer.valueOf(intValue4));
                        this.list.set(i3, Integer.valueOf(intValue3));
                        i = i3;
                    }
                }
            }
            return intValue2;
        }
        ComposerKt.composeRuntimeError("Set is empty".toString());
        throw new KotlinNothingValueException();
    }

    public final void validateHeap() {
        boolean z;
        int size = this.list.size();
        int i = size / 2;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            int i4 = i3 * 2;
            boolean z2 = true;
            if (this.list.get(i2).intValue() >= this.list.get(i4 - 1).intValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i4 < size && this.list.get(i2).intValue() < this.list.get(i4).intValue()) {
                    z2 = false;
                }
                if (z2) {
                    i2 = i3;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    public PrioritySet(List<Integer> list2) {
        C12775o.m28639i(list2, "list");
        this.list = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrioritySet(List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list2);
    }
}
