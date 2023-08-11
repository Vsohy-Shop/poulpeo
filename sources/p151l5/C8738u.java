package p151l5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.google.firebase.encoders.EncodingException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import p153l7.C8746b;
import p153l7.C8749c;
import p153l7.C8750d;
import p153l7.C8751e;

/* renamed from: l5.u */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
final class C8738u implements C8750d {

    /* renamed from: f */
    private static final Charset f12571f = Charset.forName(Constants.ENCODING);

    /* renamed from: g */
    private static final C8746b f12572g;

    /* renamed from: h */
    private static final C8746b f12573h;

    /* renamed from: i */
    private static final C8749c<Map.Entry<Object, Object>> f12574i = C8737t.f12570a;

    /* renamed from: a */
    private OutputStream f12575a;

    /* renamed from: b */
    private final Map<Class<?>, C8749c<?>> f12576b;

    /* renamed from: c */
    private final Map<Class<?>, C8751e<?>> f12577c;

    /* renamed from: d */
    private final C8749c<Object> f12578d;

    /* renamed from: e */
    private final C8742y f12579e = new C8742y(this);

    static {
        C8746b.C8748b a = C8746b.m17693a("key");
        C8732o oVar = new C8732o();
        oVar.mo42861a(1);
        f12572g = a.mo42892b(oVar.mo42862b()).mo42891a();
        C8746b.C8748b a2 = C8746b.m17693a("value");
        C8732o oVar2 = new C8732o();
        oVar2.mo42861a(2);
        f12573h = a2.mo42892b(oVar2.mo42862b()).mo42891a();
    }

    C8738u(OutputStream outputStream, Map<Class<?>, C8749c<?>> map, Map<Class<?>, C8751e<?>> map2, C8749c<Object> cVar) {
        this.f12575a = outputStream;
        this.f12576b = map;
        this.f12577c = map2;
        this.f12578d = cVar;
    }

    /* renamed from: k */
    static /* synthetic */ void m17662k(Map.Entry entry, C8750d dVar) {
        dVar.mo42873f(f12572g, entry.getKey());
        dVar.mo42873f(f12573h, entry.getValue());
    }

    /* renamed from: l */
    private static int m17663l(C8746b bVar) {
        C8736s sVar = (C8736s) bVar.mo42887c(C8736s.class);
        if (sVar != null) {
            return sVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final <T> long m17664m(C8749c<T> cVar, T t) {
        OutputStream outputStream;
        C8733p pVar = new C8733p();
        try {
            outputStream = this.f12575a;
            this.f12575a = pVar;
            cVar.mo42340a(t, this);
            this.f12575a = outputStream;
            long a = pVar.mo42863a();
            pVar.close();
            return a;
        } catch (Throwable th) {
            try {
                pVar.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: n */
    private static C8736s m17665n(C8746b bVar) {
        C8736s sVar = (C8736s) bVar.mo42887c(C8736s.class);
        if (sVar != null) {
            return sVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: o */
    private final <T> C8738u m17666o(C8749c<T> cVar, C8746b bVar, T t, boolean z) {
        long m = m17664m(cVar, t);
        if (z && m == 0) {
            return this;
        }
        m17669r((m17663l(bVar) << 3) | 2);
        m17670s(m);
        cVar.mo42340a(t, this);
        return this;
    }

    /* renamed from: p */
    private final <T> C8738u m17667p(C8751e<T> eVar, C8746b bVar, T t, boolean z) {
        this.f12579e.mo42881a(bVar, z);
        eVar.mo42893a(t, this.f12579e);
        return this;
    }

    /* renamed from: q */
    private static ByteBuffer m17668q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    private final void m17669r(int i) {
        while (((long) (i & -128)) != 0) {
            this.f12575a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f12575a.write(i & 127);
    }

    /* renamed from: s */
    private final void m17670s(long j) {
        while ((-128 & j) != 0) {
            this.f12575a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f12575a.write(((int) j) & 127);
    }

    @NonNull
    /* renamed from: a */
    public final /* synthetic */ C8750d mo42868a(@NonNull C8746b bVar, int i) {
        mo42875h(bVar, i, true);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public final /* synthetic */ C8750d mo42869b(@NonNull C8746b bVar, long j) {
        mo42876i(bVar, j, true);
        return this;
    }

    @NonNull
    /* renamed from: c */
    public final /* synthetic */ C8750d mo42870c(@NonNull C8746b bVar, boolean z) {
        mo42875h(bVar, z ? 1 : 0, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C8750d mo42871d(@NonNull C8746b bVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m17669r((m17663l(bVar) << 3) | 1);
        this.f12575a.write(m17668q(8).putDouble(d).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C8750d mo42872e(@NonNull C8746b bVar, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m17669r((m17663l(bVar) << 3) | 5);
        this.f12575a.write(m17668q(4).putFloat(f).array());
        return this;
    }

    @NonNull
    /* renamed from: f */
    public final C8750d mo42873f(@NonNull C8746b bVar, @Nullable Object obj) {
        mo42874g(bVar, obj, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C8750d mo42874g(@NonNull C8746b bVar, @Nullable Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m17669r((m17663l(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f12571f);
            m17669r(bytes.length);
            this.f12575a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object g : (Collection) obj) {
                mo42874g(bVar, g, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry o : ((Map) obj).entrySet()) {
                m17666o(f12574i, bVar, o, false);
            }
            return this;
        } else if (obj instanceof Double) {
            mo42871d(bVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            mo42872e(bVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            mo42876i(bVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            mo42875h(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m17669r((m17663l(bVar) << 3) | 2);
            m17669r(bArr.length);
            this.f12575a.write(bArr);
            return this;
        } else {
            C8749c cVar = this.f12576b.get(obj.getClass());
            if (cVar != null) {
                m17666o(cVar, bVar, obj, z);
                return this;
            }
            C8751e eVar = this.f12577c.get(obj.getClass());
            if (eVar != null) {
                m17667p(eVar, bVar, obj, z);
                return this;
            } else if (obj instanceof C8734q) {
                mo42875h(bVar, ((C8734q) obj).mo42867y(), true);
                return this;
            } else if (obj instanceof Enum) {
                mo42875h(bVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m17666o(this.f12578d, bVar, obj, z);
                return this;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C8738u mo42875h(@NonNull C8746b bVar, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        C8736s n = m17665n(bVar);
        C8735r rVar = C8735r.DEFAULT;
        int ordinal = n.zzb().ordinal();
        if (ordinal == 0) {
            m17669r(n.zza() << 3);
            m17669r(i);
        } else if (ordinal == 1) {
            m17669r(n.zza() << 3);
            m17669r((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            m17669r((n.zza() << 3) | 5);
            this.f12575a.write(m17668q(4).putInt(i).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C8738u mo42876i(@NonNull C8746b bVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        C8736s n = m17665n(bVar);
        C8735r rVar = C8735r.DEFAULT;
        int ordinal = n.zzb().ordinal();
        if (ordinal == 0) {
            m17669r(n.zza() << 3);
            m17670s(j);
        } else if (ordinal == 1) {
            m17669r(n.zza() << 3);
            m17670s((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            m17669r((n.zza() << 3) | 1);
            this.f12575a.write(m17668q(8).putLong(j).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C8738u mo42877j(@Nullable Object obj) {
        if (obj == null) {
            return this;
        }
        C8749c cVar = this.f12576b.get(obj.getClass());
        if (cVar != null) {
            cVar.mo42340a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }
}
