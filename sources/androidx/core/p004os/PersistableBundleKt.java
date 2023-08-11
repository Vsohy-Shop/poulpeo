package androidx.core.p004os;

import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p336ef.C11906l;

/* renamed from: androidx.core.os.PersistableBundleKt */
/* compiled from: PersistableBundle.kt */
public final class PersistableBundleKt {
    @RequiresApi(21)
    public static final PersistableBundle persistableBundleOf(C11906l<String, ? extends Object>... lVarArr) {
        C12775o.m28639i(lVarArr, "pairs");
        PersistableBundle createPersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(lVarArr.length);
        for (C11906l<String, ? extends Object> lVar : lVarArr) {
            PersistableBundleApi21ImplKt.putValue(createPersistableBundle, lVar.mo49109a(), lVar.mo49110b());
        }
        return createPersistableBundle;
    }

    @RequiresApi(21)
    public static final PersistableBundle toPersistableBundle(Map<String, ? extends Object> map) {
        C12775o.m28639i(map, "<this>");
        PersistableBundle createPersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(map.size());
        for (Map.Entry next : map.entrySet()) {
            PersistableBundleApi21ImplKt.putValue(createPersistableBundle, (String) next.getKey(), next.getValue());
        }
        return createPersistableBundle;
    }

    @RequiresApi(21)
    public static final PersistableBundle persistableBundleOf() {
        return PersistableBundleApi21ImplKt.createPersistableBundle(0);
    }
}
