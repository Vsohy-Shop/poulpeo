package p137k1;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.C4368f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p058d1.C7214a;
import p058d1.C7222g;
import p070e1.C7422d;
import p137k1.C8476n;
import p283y1.C10652b;

/* renamed from: k1.e */
/* compiled from: DataUrlLoader */
public final class C8449e<Model, Data> implements C8476n<Model, Data> {

    /* renamed from: a */
    private final C8450a<Data> f12032a;

    /* renamed from: k1.e$a */
    /* compiled from: DataUrlLoader */
    public interface C8450a<Data> {
        /* renamed from: a */
        Class<Data> mo42472a();

        /* renamed from: b */
        void mo42473b(Data data);

        /* renamed from: c */
        Data mo42474c(String str);
    }

    /* renamed from: k1.e$c */
    /* compiled from: DataUrlLoader */
    public static final class C8452c<Model> implements C8478o<Model, InputStream> {

        /* renamed from: a */
        private final C8450a<InputStream> f12036a = new C8453a();

        /* renamed from: k1.e$c$a */
        /* compiled from: DataUrlLoader */
        class C8453a implements C8450a<InputStream> {
            C8453a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo42472a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo42473b(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo42474c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        @NonNull
        /* renamed from: b */
        public C8476n<Model, InputStream> mo42462b(@NonNull C8484r rVar) {
            return new C8449e(this.f12036a);
        }
    }

    public C8449e(C8450a<Data> aVar) {
        this.f12032a = aVar;
    }

    /* renamed from: a */
    public boolean mo42457a(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    /* renamed from: b */
    public C8476n.C8477a<Data> mo42458b(@NonNull Model model, int i, int i2, @NonNull C7222g gVar) {
        return new C8476n.C8477a<>(new C10652b(model), new C8451b(model.toString(), this.f12032a));
    }

    /* renamed from: k1.e$b */
    /* compiled from: DataUrlLoader */
    private static final class C8451b<Data> implements C7422d<Data> {

        /* renamed from: b */
        private final String f12033b;

        /* renamed from: c */
        private final C8450a<Data> f12034c;

        /* renamed from: d */
        private Data f12035d;

        C8451b(String str, C8450a<Data> aVar) {
            this.f12033b = str;
            this.f12034c = aVar;
        }

        @NonNull
        /* renamed from: a */
        public Class<Data> mo41069a() {
            return this.f12034c.mo42472a();
        }

        /* renamed from: b */
        public void mo41074b() {
            try {
                this.f12034c.mo42473b(this.f12035d);
            } catch (IOException unused) {
            }
        }

        @NonNull
        /* renamed from: d */
        public C7214a mo41077d() {
            return C7214a.LOCAL;
        }

        /* renamed from: e */
        public void mo41078e(@NonNull C4368f fVar, @NonNull C7422d.C7423a<? super Data> aVar) {
            try {
                Data c = this.f12034c.mo42474c(this.f12033b);
                this.f12035d = c;
                aVar.mo31271f(c);
            } catch (IllegalArgumentException e) {
                aVar.mo31269c(e);
            }
        }

        public void cancel() {
        }
    }
}
