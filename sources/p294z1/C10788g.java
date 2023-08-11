package p294z1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: z1.g */
/* compiled from: LruCache */
public class C10788g<T, Y> {

    /* renamed from: a */
    private final Map<T, Y> f16502a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private final long f16503b;

    /* renamed from: c */
    private long f16504c;

    /* renamed from: d */
    private long f16505d;

    public C10788g(long j) {
        this.f16503b = j;
        this.f16504c = j;
    }

    /* renamed from: f */
    private void m22933f() {
        mo45702m(this.f16504c);
    }

    /* renamed from: b */
    public void mo45697b() {
        mo45702m(0);
    }

    @Nullable
    /* renamed from: g */
    public synchronized Y mo45698g(@NonNull T t) {
        return this.f16502a.get(t);
    }

    /* renamed from: h */
    public synchronized long mo45699h() {
        return this.f16504c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo41905i(@Nullable Y y) {
        return 1;
    }

    @Nullable
    /* renamed from: k */
    public synchronized Y mo45700k(@NonNull T t, @Nullable Y y) {
        long i = (long) mo41905i(y);
        if (i >= this.f16504c) {
            mo41906j(t, y);
            return null;
        }
        if (y != null) {
            this.f16505d += i;
        }
        Y put = this.f16502a.put(t, y);
        if (put != null) {
            this.f16505d -= (long) mo41905i(put);
            if (!put.equals(y)) {
                mo41906j(t, put);
            }
        }
        m22933f();
        return put;
    }

    @Nullable
    /* renamed from: l */
    public synchronized Y mo45701l(@NonNull T t) {
        Y remove;
        remove = this.f16502a.remove(t);
        if (remove != null) {
            this.f16505d -= (long) mo41905i(remove);
        }
        return remove;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public synchronized void mo45702m(long j) {
        while (this.f16505d > j) {
            Iterator<Map.Entry<T, Y>> it = this.f16502a.entrySet().iterator();
            Map.Entry next = it.next();
            Object value = next.getValue();
            this.f16505d -= (long) mo41905i(value);
            Object key = next.getKey();
            it.remove();
            mo41906j(key, value);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo41906j(@NonNull T t, @Nullable Y y) {
    }
}
