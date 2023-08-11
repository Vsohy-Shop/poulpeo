package p173n7;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import p153l7.C8746b;
import p153l7.C8749c;
import p153l7.C8750d;
import p153l7.C8751e;
import p153l7.C8752f;

/* renamed from: n7.e */
/* compiled from: JsonValueObjectEncoderContext */
final class C8937e implements C8750d, C8752f {

    /* renamed from: a */
    private C8937e f12974a = null;

    /* renamed from: b */
    private boolean f12975b = true;

    /* renamed from: c */
    private final JsonWriter f12976c;

    /* renamed from: d */
    private final Map<Class<?>, C8749c<?>> f12977d;

    /* renamed from: e */
    private final Map<Class<?>, C8751e<?>> f12978e;

    /* renamed from: f */
    private final C8749c<Object> f12979f;

    /* renamed from: g */
    private final boolean f12980g;

    C8937e(@NonNull Writer writer, @NonNull Map<Class<?>, C8749c<?>> map, @NonNull Map<Class<?>, C8751e<?>> map2, C8749c<Object> cVar, boolean z) {
        this.f12976c = new JsonWriter(writer);
        this.f12977d = map;
        this.f12978e = map2;
        this.f12979f = cVar;
        this.f12980g = z;
    }

    /* renamed from: q */
    private boolean m18107q(Object obj) {
        if (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private C8937e m18108t(@NonNull String str, @Nullable Object obj) {
        m18110v();
        this.f12976c.name(str);
        if (obj != null) {
            return mo43081i(obj, false);
        }
        this.f12976c.nullValue();
        return this;
    }

    /* renamed from: u */
    private C8937e m18109u(@NonNull String str, @Nullable Object obj) {
        if (obj == null) {
            return this;
        }
        m18110v();
        this.f12976c.name(str);
        return mo43081i(obj, false);
    }

    /* renamed from: v */
    private void m18110v() {
        if (this.f12975b) {
            C8937e eVar = this.f12974a;
            if (eVar != null) {
                eVar.m18110v();
                this.f12974a.f12975b = false;
                this.f12974a = null;
                this.f12976c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @NonNull
    /* renamed from: a */
    public C8750d mo42868a(@NonNull C8746b bVar, int i) {
        return mo43083k(bVar.mo42886b(), i);
    }

    @NonNull
    /* renamed from: b */
    public C8750d mo42869b(@NonNull C8746b bVar, long j) {
        return mo43084l(bVar.mo42886b(), j);
    }

    @NonNull
    /* renamed from: c */
    public C8750d mo42870c(@NonNull C8746b bVar, boolean z) {
        return mo43086n(bVar.mo42886b(), z);
    }

    @NonNull
    /* renamed from: f */
    public C8750d mo42873f(@NonNull C8746b bVar, @Nullable Object obj) {
        return mo43085m(bVar.mo42886b(), obj);
    }

    @NonNull
    /* renamed from: g */
    public C8937e mo43079g(int i) {
        m18110v();
        this.f12976c.value((long) i);
        return this;
    }

    @NonNull
    /* renamed from: h */
    public C8937e mo43080h(long j) {
        m18110v();
        this.f12976c.value(j);
        return this;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: i */
    public C8937e mo43081i(@Nullable Object obj, boolean z) {
        Class<?> cls;
        int i = 0;
        if (z && m18107q(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f12976c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f12976c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return mo43088p((byte[]) obj);
            }
            this.f12976c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.f12976c.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    mo43080h(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f12976c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f12976c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number i2 : (Number[]) obj) {
                    mo43081i(i2, false);
                }
            } else {
                for (Object i3 : (Object[]) obj) {
                    mo43081i(i3, false);
                }
            }
            this.f12976c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f12976c.beginArray();
            for (Object i4 : (Collection) obj) {
                mo43081i(i4, false);
            }
            this.f12976c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f12976c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    mo43085m((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                }
            }
            this.f12976c.endObject();
            return this;
        } else {
            C8749c cVar = this.f12977d.get(obj.getClass());
            if (cVar != null) {
                return mo43090s(cVar, obj, z);
            }
            C8751e eVar = this.f12978e.get(obj.getClass());
            if (eVar != null) {
                eVar.mo42893a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return mo43090s(this.f12979f, obj, z);
            } else {
                mo42882d(((Enum) obj).name());
                return this;
            }
        }
    }

    @NonNull
    /* renamed from: j */
    public C8937e mo42882d(@Nullable String str) {
        m18110v();
        this.f12976c.value(str);
        return this;
    }

    @NonNull
    /* renamed from: k */
    public C8937e mo43083k(@NonNull String str, int i) {
        m18110v();
        this.f12976c.name(str);
        return mo43079g(i);
    }

    @NonNull
    /* renamed from: l */
    public C8937e mo43084l(@NonNull String str, long j) {
        m18110v();
        this.f12976c.name(str);
        return mo43080h(j);
    }

    @NonNull
    /* renamed from: m */
    public C8937e mo43085m(@NonNull String str, @Nullable Object obj) {
        if (this.f12980g) {
            return m18109u(str, obj);
        }
        return m18108t(str, obj);
    }

    @NonNull
    /* renamed from: n */
    public C8937e mo43086n(@NonNull String str, boolean z) {
        m18110v();
        this.f12976c.name(str);
        return mo42883e(z);
    }

    @NonNull
    /* renamed from: o */
    public C8937e mo42883e(boolean z) {
        m18110v();
        this.f12976c.value(z);
        return this;
    }

    @NonNull
    /* renamed from: p */
    public C8937e mo43088p(@Nullable byte[] bArr) {
        m18110v();
        if (bArr == null) {
            this.f12976c.nullValue();
        } else {
            this.f12976c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo43089r() {
        m18110v();
        this.f12976c.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C8937e mo43090s(C8749c<Object> cVar, Object obj, boolean z) {
        if (!z) {
            this.f12976c.beginObject();
        }
        cVar.mo42340a(obj, this);
        if (!z) {
            this.f12976c.endObject();
        }
        return this;
    }
}
