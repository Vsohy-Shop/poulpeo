package p445vc;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vc.d */
/* compiled from: GTMScreenEvent */
public class C13615d {
    @NonNull

    /* renamed from: a */
    public final String f21906a;
    @NonNull

    /* renamed from: b */
    public final C13617f f21907b;
    @NonNull

    /* renamed from: c */
    private Map<C13612a, String> f21908c = new HashMap();

    public C13615d(@NonNull String str, @NonNull C13617f fVar) {
        if (!str.isEmpty()) {
            this.f21906a = str;
            this.f21907b = fVar;
            return;
        }
        throw new IllegalArgumentException("The screen name must not be empty");
    }

    @NonNull
    /* renamed from: a */
    public C13615d mo53270a(@NonNull C13612a aVar, int i) {
        this.f21908c.put(aVar, String.valueOf(i));
        return this;
    }

    @NonNull
    /* renamed from: b */
    public C13615d mo53271b(@NonNull C13612a aVar, @NonNull String str) {
        this.f21908c.put(aVar, str);
        return this;
    }

    /* renamed from: c */
    public Map<String, String> mo53272c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f21908c.entrySet()) {
            hashMap.put(((C13612a) next.getKey()).f21888b, (String) next.getValue());
        }
        hashMap.put(C13612a.SCREEN_NAME.f21888b, this.f21906a);
        hashMap.put(C13612a.SCREEN_TYPE.f21888b, this.f21907b.f21929b);
        return hashMap;
    }
}
