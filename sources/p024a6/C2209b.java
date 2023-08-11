package p024a6;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a6.b */
public final class C2209b {

    /* renamed from: a */
    private final Map<String, Object> f991a = new HashMap();

    /* renamed from: a */
    public final synchronized void mo23534a(Bundle bundle) {
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj != null && this.f991a.get(next) == null) {
                this.f991a.put(next, obj);
            }
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo23535b() {
        Object obj = this.f991a.get("usingExtractorStream");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}
