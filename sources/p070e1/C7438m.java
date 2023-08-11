package p070e1;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import p070e1.C7424e;

/* renamed from: e1.m */
/* compiled from: ParcelFileDescriptorRewinder */
public final class C7438m implements C7424e<ParcelFileDescriptor> {

    /* renamed from: a */
    private final C7440b f10287a;

    @RequiresApi(21)
    /* renamed from: e1.m$a */
    /* compiled from: ParcelFileDescriptorRewinder */
    public static final class C7439a implements C7424e.C7425a<ParcelFileDescriptor> {
        @NonNull
        /* renamed from: a */
        public Class<ParcelFileDescriptor> mo41087a() {
            return ParcelFileDescriptor.class;
        }

        @NonNull
        /* renamed from: c */
        public C7424e<ParcelFileDescriptor> mo41088b(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new C7438m(parcelFileDescriptor);
        }
    }

    @RequiresApi(21)
    /* renamed from: e1.m$b */
    /* compiled from: ParcelFileDescriptorRewinder */
    private static final class C7440b {

        /* renamed from: a */
        private final ParcelFileDescriptor f10288a;

        C7440b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f10288a = parcelFileDescriptor;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public ParcelFileDescriptor mo41107a() {
            try {
                Os.lseek(this.f10288a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f10288a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    @RequiresApi(21)
    public C7438m(ParcelFileDescriptor parcelFileDescriptor) {
        this.f10287a = new C7440b(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m14548c() {
        return true;
    }

    @RequiresApi(21)
    @NonNull
    /* renamed from: d */
    public ParcelFileDescriptor mo41085a() {
        return this.f10287a.mo41107a();
    }

    /* renamed from: b */
    public void mo41086b() {
    }
}
