package p183o7;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p153l7.C8749c;
import p153l7.C8750d;
import p153l7.C8751e;
import p163m7.C8831a;
import p163m7.C8832b;

/* renamed from: o7.h */
/* compiled from: ProtobufEncoder */
public class C9010h {

    /* renamed from: a */
    private final Map<Class<?>, C8749c<?>> f13115a;

    /* renamed from: b */
    private final Map<Class<?>, C8751e<?>> f13116b;

    /* renamed from: c */
    private final C8749c<Object> f13117c;

    /* renamed from: o7.h$a */
    /* compiled from: ProtobufEncoder */
    public static final class C9011a implements C8832b<C9011a> {

        /* renamed from: d */
        private static final C8749c<Object> f13118d = new C9009g();

        /* renamed from: a */
        private final Map<Class<?>, C8749c<?>> f13119a = new HashMap();

        /* renamed from: b */
        private final Map<Class<?>, C8751e<?>> f13120b = new HashMap();

        /* renamed from: c */
        private C8749c<Object> f13121c = f13118d;

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m18285e(Object obj, C8750d dVar) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: c */
        public C9010h mo43199c() {
            return new C9010h(new HashMap(this.f13119a), new HashMap(this.f13120b), this.f13121c);
        }

        @NonNull
        /* renamed from: d */
        public C9011a mo43200d(@NonNull C8831a aVar) {
            aVar.mo42339a(this);
            return this;
        }

        @NonNull
        /* renamed from: f */
        public <U> C9011a mo42878a(@NonNull Class<U> cls, @NonNull C8749c<? super U> cVar) {
            this.f13119a.put(cls, cVar);
            this.f13120b.remove(cls);
            return this;
        }
    }

    C9010h(Map<Class<?>, C8749c<?>> map, Map<Class<?>, C8751e<?>> map2, C8749c<Object> cVar) {
        this.f13115a = map;
        this.f13116b = map2;
        this.f13117c = cVar;
    }

    /* renamed from: a */
    public static C9011a m18281a() {
        return new C9011a();
    }

    /* renamed from: b */
    public void mo43197b(@NonNull Object obj, @NonNull OutputStream outputStream) {
        new C9007f(outputStream, this.f13115a, this.f13116b, this.f13117c).mo43196s(obj);
    }

    @NonNull
    /* renamed from: c */
    public byte[] mo43198c(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            mo43197b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
