package p263w3;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.HashMap;
import p119i3.C8111d;

/* renamed from: w3.a */
/* compiled from: PriorityMapping */
public final class C10111a {

    /* renamed from: a */
    private static SparseArray<C8111d> f15272a = new SparseArray<>();

    /* renamed from: b */
    private static HashMap<C8111d, Integer> f15273b;

    static {
        HashMap<C8111d, Integer> hashMap = new HashMap<>();
        f15273b = hashMap;
        hashMap.put(C8111d.DEFAULT, 0);
        f15273b.put(C8111d.VERY_LOW, 1);
        f15273b.put(C8111d.HIGHEST, 2);
        for (C8111d next : f15273b.keySet()) {
            f15272a.append(f15273b.get(next).intValue(), next);
        }
    }

    /* renamed from: a */
    public static int m21240a(@NonNull C8111d dVar) {
        Integer num = f15273b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    @NonNull
    /* renamed from: b */
    public static C8111d m21241b(int i) {
        C8111d dVar = f15272a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
