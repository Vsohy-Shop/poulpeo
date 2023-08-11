package p173n7;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p153l7.C8745a;
import p153l7.C8749c;
import p153l7.C8750d;
import p153l7.C8751e;
import p153l7.C8752f;
import p163m7.C8831a;
import p163m7.C8832b;

/* renamed from: n7.d */
/* compiled from: JsonDataEncoderBuilder */
public final class C8934d implements C8832b<C8934d> {

    /* renamed from: e */
    private static final C8749c<Object> f12964e = new C8931a();

    /* renamed from: f */
    private static final C8751e<String> f12965f = new C8932b();

    /* renamed from: g */
    private static final C8751e<Boolean> f12966g = new C8933c();

    /* renamed from: h */
    private static final C8936b f12967h = new C8936b((C8935a) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<Class<?>, C8749c<?>> f12968a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<Class<?>, C8751e<?>> f12969b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8749c<Object> f12970c = f12964e;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f12971d = false;

    /* renamed from: n7.d$a */
    /* compiled from: JsonDataEncoderBuilder */
    class C8935a implements C8745a {
        C8935a() {
        }

        /* renamed from: a */
        public void mo42884a(@NonNull Object obj, @NonNull Writer writer) {
            C8937e eVar = new C8937e(writer, C8934d.this.f12968a, C8934d.this.f12969b, C8934d.this.f12970c, C8934d.this.f12971d);
            eVar.mo43081i(obj, false);
            eVar.mo43089r();
        }

        /* renamed from: b */
        public String mo42885b(@NonNull Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo42884a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* renamed from: n7.d$b */
    /* compiled from: JsonDataEncoderBuilder */
    private static final class C8936b implements C8751e<Date> {

        /* renamed from: a */
        private static final DateFormat f12973a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f12973a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private C8936b() {
        }

        /* synthetic */ C8936b(C8935a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo42893a(@NonNull Date date, @NonNull C8752f fVar) {
            fVar.mo42882d(f12973a.format(date));
        }
    }

    public C8934d() {
        mo43077p(String.class, f12965f);
        mo43077p(Boolean.class, f12966g);
        mo43077p(Date.class, f12967h);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m18094l(Object obj, C8750d dVar) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @NonNull
    /* renamed from: i */
    public C8745a mo43073i() {
        return new C8935a();
    }

    @NonNull
    /* renamed from: j */
    public C8934d mo43074j(@NonNull C8831a aVar) {
        aVar.mo42339a(this);
        return this;
    }

    @NonNull
    /* renamed from: k */
    public C8934d mo43075k(boolean z) {
        this.f12971d = z;
        return this;
    }

    @NonNull
    /* renamed from: o */
    public <T> C8934d mo42878a(@NonNull Class<T> cls, @NonNull C8749c<? super T> cVar) {
        this.f12968a.put(cls, cVar);
        this.f12969b.remove(cls);
        return this;
    }

    @NonNull
    /* renamed from: p */
    public <T> C8934d mo43077p(@NonNull Class<T> cls, @NonNull C8751e<? super T> eVar) {
        this.f12969b.put(cls, eVar);
        this.f12968a.remove(cls);
        return this;
    }
}
