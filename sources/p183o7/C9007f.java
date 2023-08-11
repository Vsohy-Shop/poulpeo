package p183o7;

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

/* renamed from: o7.f */
/* compiled from: ProtobufDataEncoderContext */
final class C9007f implements C8750d {

    /* renamed from: f */
    private static final Charset f13105f = Charset.forName(Constants.ENCODING);

    /* renamed from: g */
    private static final C8746b f13106g = C8746b.m17693a("key").mo42892b(C9000a.m18250b().mo43176c(1).mo43175a()).mo42891a();

    /* renamed from: h */
    private static final C8746b f13107h = C8746b.m17693a("value").mo42892b(C9000a.m18250b().mo43176c(2).mo43175a()).mo42891a();

    /* renamed from: i */
    private static final C8749c<Map.Entry<Object, Object>> f13108i = new C9006e();

    /* renamed from: a */
    private OutputStream f13109a;

    /* renamed from: b */
    private final Map<Class<?>, C8749c<?>> f13110b;

    /* renamed from: c */
    private final Map<Class<?>, C8751e<?>> f13111c;

    /* renamed from: d */
    private final C8749c<Object> f13112d;

    /* renamed from: e */
    private final C9012i f13113e = new C9012i(this);

    /* renamed from: o7.f$a */
    /* compiled from: ProtobufDataEncoderContext */
    static /* synthetic */ class C9008a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13114a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o7.d$a[] r0 = p183o7.C9004d.C9005a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13114a = r0
                o7.d$a r1 = p183o7.C9004d.C9005a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13114a     // Catch:{ NoSuchFieldError -> 0x001d }
                o7.d$a r1 = p183o7.C9004d.C9005a.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13114a     // Catch:{ NoSuchFieldError -> 0x0028 }
                o7.d$a r1 = p183o7.C9004d.C9005a.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p183o7.C9007f.C9008a.<clinit>():void");
        }
    }

    C9007f(OutputStream outputStream, Map<Class<?>, C8749c<?>> map, Map<Class<?>, C8751e<?>> map2, C8749c<Object> cVar) {
        this.f13109a = outputStream;
        this.f13110b = map;
        this.f13111c = map2;
        this.f13112d = cVar;
    }

    /* renamed from: o */
    private static ByteBuffer m18257o(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: p */
    private <T> long m18258p(C8749c<T> cVar, T t) {
        OutputStream outputStream;
        C9002b bVar = new C9002b();
        try {
            outputStream = this.f13109a;
            this.f13109a = bVar;
            cVar.mo42340a(t, this);
            this.f13109a = outputStream;
            long a = bVar.mo43183a();
            bVar.close();
            return a;
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: q */
    private <T> C9007f m18259q(C8749c<T> cVar, C8746b bVar, T t, boolean z) {
        long p = m18258p(cVar, t);
        if (z && p == 0) {
            return this;
        }
        m18264w((m18262u(bVar) << 3) | 2);
        m18265x(p);
        cVar.mo42340a(t, this);
        return this;
    }

    /* renamed from: r */
    private <T> C9007f m18260r(C8751e<T> eVar, C8746b bVar, T t, boolean z) {
        this.f13113e.mo43202b(bVar, z);
        eVar.mo42893a(t, this.f13113e);
        return this;
    }

    /* renamed from: t */
    private static C9004d m18261t(C8746b bVar) {
        C9004d dVar = (C9004d) bVar.mo42887c(C9004d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: u */
    private static int m18262u(C8746b bVar) {
        C9004d dVar = (C9004d) bVar.mo42887c(C9004d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ void m18263v(Map.Entry entry, C8750d dVar) {
        dVar.mo42873f(f13106g, entry.getKey());
        dVar.mo42873f(f13107h, entry.getValue());
    }

    /* renamed from: w */
    private void m18264w(int i) {
        while (((long) (i & -128)) != 0) {
            this.f13109a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f13109a.write(i & 127);
    }

    /* renamed from: x */
    private void m18265x(long j) {
        while ((-128 & j) != 0) {
            this.f13109a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f13109a.write(((int) j) & 127);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C8750d mo43187e(@NonNull C8746b bVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m18264w((m18262u(bVar) << 3) | 1);
        this.f13109a.write(m18257o(8).putDouble(d).array());
        return this;
    }

    @NonNull
    /* renamed from: f */
    public C8750d mo42873f(@NonNull C8746b bVar, @Nullable Object obj) {
        return mo43189h(bVar, obj, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C8750d mo43188g(@NonNull C8746b bVar, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m18264w((m18262u(bVar) << 3) | 5);
        this.f13109a.write(m18257o(4).putFloat(f).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C8750d mo43189h(@NonNull C8746b bVar, @Nullable Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m18264w((m18262u(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f13105f);
            m18264w(bytes.length);
            this.f13109a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object h : (Collection) obj) {
                mo43189h(bVar, h, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry q : ((Map) obj).entrySet()) {
                m18259q(f13108i, bVar, q, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return mo43187e(bVar, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return mo43188g(bVar, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return mo43193l(bVar, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return mo43195n(bVar, ((Boolean) obj).booleanValue(), z);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return this;
                }
                m18264w((m18262u(bVar) << 3) | 2);
                m18264w(bArr.length);
                this.f13109a.write(bArr);
                return this;
            }
            C8749c cVar = this.f13110b.get(obj.getClass());
            if (cVar != null) {
                return m18259q(cVar, bVar, obj, z);
            }
            C8751e eVar = this.f13111c.get(obj.getClass());
            if (eVar != null) {
                return m18260r(eVar, bVar, obj, z);
            }
            if (obj instanceof C9003c) {
                return mo42868a(bVar, ((C9003c) obj).mo43122y());
            }
            if (obj instanceof Enum) {
                return mo42868a(bVar, ((Enum) obj).ordinal());
            }
            return m18259q(this.f13112d, bVar, obj, z);
        }
    }

    @NonNull
    /* renamed from: i */
    public C9007f mo42868a(@NonNull C8746b bVar, int i) {
        return mo43191j(bVar, i, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C9007f mo43191j(@NonNull C8746b bVar, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        C9004d t = m18261t(bVar);
        int i2 = C9008a.f13114a[t.intEncoding().ordinal()];
        if (i2 == 1) {
            m18264w(t.tag() << 3);
            m18264w(i);
        } else if (i2 == 2) {
            m18264w(t.tag() << 3);
            m18264w((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            m18264w((t.tag() << 3) | 5);
            this.f13109a.write(m18257o(4).putInt(i).array());
        }
        return this;
    }

    @NonNull
    /* renamed from: k */
    public C9007f mo42869b(@NonNull C8746b bVar, long j) {
        return mo43193l(bVar, j, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C9007f mo43193l(@NonNull C8746b bVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        C9004d t = m18261t(bVar);
        int i = C9008a.f13114a[t.intEncoding().ordinal()];
        if (i == 1) {
            m18264w(t.tag() << 3);
            m18265x(j);
        } else if (i == 2) {
            m18264w(t.tag() << 3);
            m18265x((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            m18264w((t.tag() << 3) | 1);
            this.f13109a.write(m18257o(8).putLong(j).array());
        }
        return this;
    }

    @NonNull
    /* renamed from: m */
    public C9007f mo42870c(@NonNull C8746b bVar, boolean z) {
        return mo43195n(bVar, z, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C9007f mo43195n(@NonNull C8746b bVar, boolean z, boolean z2) {
        return mo43191j(bVar, z ? 1 : 0, z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C9007f mo43196s(@Nullable Object obj) {
        if (obj == null) {
            return this;
        }
        C8749c cVar = this.f13110b.get(obj.getClass());
        if (cVar != null) {
            cVar.mo42340a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
