package p198q2;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C12775o;
import org.json.JSONObject;

/* renamed from: q2.y */
/* compiled from: ProfileInformationCache.kt */
public final class C9211y {

    /* renamed from: a */
    private static final ConcurrentHashMap<String, JSONObject> f13532a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final C9211y f13533b = new C9211y();

    private C9211y() {
    }

    /* renamed from: a */
    public static final JSONObject m18906a(String str) {
        C12775o.m28639i(str, "accessToken");
        return f13532a.get(str);
    }

    /* renamed from: b */
    public static final void m18907b(String str, JSONObject jSONObject) {
        C12775o.m28639i(str, "key");
        C12775o.m28639i(jSONObject, "value");
        f13532a.put(str, jSONObject);
    }
}
