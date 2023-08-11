package p137k1;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.C4368f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p058d1.C7214a;
import p058d1.C7222g;
import p070e1.C7422d;
import p137k1.C8476n;
import p283y1.C10652b;

/* renamed from: k1.f */
/* compiled from: FileLoader */
public class C8454f<Data> implements C8476n<File, Data> {

    /* renamed from: a */
    private final C8459d<Data> f12038a;

    /* renamed from: k1.f$a */
    /* compiled from: FileLoader */
    public static class C8455a<Data> implements C8478o<File, Data> {

        /* renamed from: a */
        private final C8459d<Data> f12039a;

        public C8455a(C8459d<Data> dVar) {
            this.f12039a = dVar;
        }

        @NonNull
        /* renamed from: b */
        public final C8476n<File, Data> mo42462b(@NonNull C8484r rVar) {
            return new C8454f(this.f12039a);
        }
    }

    /* renamed from: k1.f$b */
    /* compiled from: FileLoader */
    public static class C8456b extends C8455a<ParcelFileDescriptor> {

        /* renamed from: k1.f$b$a */
        /* compiled from: FileLoader */
        class C8457a implements C8459d<ParcelFileDescriptor> {
            C8457a() {
            }

            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo42479a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void mo42480b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor mo42481c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public C8456b() {
            super(new C8457a());
        }
    }

    /* renamed from: k1.f$d */
    /* compiled from: FileLoader */
    public interface C8459d<Data> {
        /* renamed from: a */
        Class<Data> mo42479a();

        /* renamed from: b */
        void mo42480b(Data data);

        /* renamed from: c */
        Data mo42481c(File file);
    }

    /* renamed from: k1.f$e */
    /* compiled from: FileLoader */
    public static class C8460e extends C8455a<InputStream> {

        /* renamed from: k1.f$e$a */
        /* compiled from: FileLoader */
        class C8461a implements C8459d<InputStream> {
            C8461a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo42479a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo42480b(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo42481c(File file) {
                return new FileInputStream(file);
            }
        }

        public C8460e() {
            super(new C8461a());
        }
    }

    public C8454f(C8459d<Data> dVar) {
        this.f12038a = dVar;
    }

    /* renamed from: c */
    public C8476n.C8477a<Data> mo42458b(@NonNull File file, int i, int i2, @NonNull C7222g gVar) {
        return new C8476n.C8477a<>(new C10652b(file), new C8458c(file, this.f12038a));
    }

    /* renamed from: d */
    public boolean mo42457a(@NonNull File file) {
        return true;
    }

    /* renamed from: k1.f$c */
    /* compiled from: FileLoader */
    private static final class C8458c<Data> implements C7422d<Data> {

        /* renamed from: b */
        private final File f12040b;

        /* renamed from: c */
        private final C8459d<Data> f12041c;

        /* renamed from: d */
        private Data f12042d;

        C8458c(File file, C8459d<Data> dVar) {
            this.f12040b = file;
            this.f12041c = dVar;
        }

        @NonNull
        /* renamed from: a */
        public Class<Data> mo41069a() {
            return this.f12041c.mo42479a();
        }

        /* renamed from: b */
        public void mo41074b() {
            Data data = this.f12042d;
            if (data != null) {
                try {
                    this.f12041c.mo42480b(data);
                } catch (IOException unused) {
                }
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
                Data c = this.f12041c.mo42481c(this.f12040b);
                this.f12042d = c;
                aVar.mo31271f(c);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.mo31269c(e);
            }
        }

        public void cancel() {
        }
    }
}
