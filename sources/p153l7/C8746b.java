package p153l7;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l7.b */
/* compiled from: FieldDescriptor */
public final class C8746b {

    /* renamed from: a */
    private final String f12593a;

    /* renamed from: b */
    private final Map<Class<?>, Object> f12594b;

    /* renamed from: l7.b$b */
    /* compiled from: FieldDescriptor */
    public static final class C8748b {

        /* renamed from: a */
        private final String f12595a;

        /* renamed from: b */
        private Map<Class<?>, Object> f12596b = null;

        C8748b(String str) {
            this.f12595a = str;
        }

        @NonNull
        /* renamed from: a */
        public C8746b mo42891a() {
            Map map;
            String str = this.f12595a;
            if (this.f12596b == null) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(new HashMap(this.f12596b));
            }
            return new C8746b(str, map);
        }

        @NonNull
        /* renamed from: b */
        public <T extends Annotation> C8748b mo42892b(@NonNull T t) {
            if (this.f12596b == null) {
                this.f12596b = new HashMap();
            }
            this.f12596b.put(t.annotationType(), t);
            return this;
        }
    }

    @NonNull
    /* renamed from: a */
    public static C8748b m17693a(@NonNull String str) {
        return new C8748b(str);
    }

    @NonNull
    /* renamed from: d */
    public static C8746b m17694d(@NonNull String str) {
        return new C8746b(str, Collections.emptyMap());
    }

    @NonNull
    /* renamed from: b */
    public String mo42886b() {
        return this.f12593a;
    }

    @Nullable
    /* renamed from: c */
    public <T extends Annotation> T mo42887c(@NonNull Class<T> cls) {
        return (Annotation) this.f12594b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8746b)) {
            return false;
        }
        C8746b bVar = (C8746b) obj;
        if (!this.f12593a.equals(bVar.f12593a) || !this.f12594b.equals(bVar.f12594b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f12593a.hashCode() * 31) + this.f12594b.hashCode();
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.f12593a + ", properties=" + this.f12594b.values() + "}";
    }

    private C8746b(String str, Map<Class<?>, Object> map) {
        this.f12593a = str;
        this.f12594b = map;
    }
}
