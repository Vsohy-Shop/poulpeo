package p072e3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p072e3.C7469h;

/* renamed from: e3.e */
/* compiled from: ShareOpenGraphAction */
public final class C7462e extends C7469h<C7462e, C7464b> {
    public static final Parcelable.Creator<C7462e> CREATOR = new C7463a();

    /* renamed from: e3.e$a */
    /* compiled from: ShareOpenGraphAction */
    static class C7463a implements Parcelable.Creator<C7462e> {
        C7463a() {
        }

        /* renamed from: a */
        public C7462e createFromParcel(Parcel parcel) {
            return new C7462e(parcel);
        }

        /* renamed from: b */
        public C7462e[] newArray(int i) {
            return new C7462e[i];
        }
    }

    /* renamed from: e3.e$b */
    /* compiled from: ShareOpenGraphAction */
    public static final class C7464b extends C7469h.C7470a<C7462e, C7464b> {
        /* renamed from: d */
        public C7462e mo41158d() {
            return new C7462e(this, (C7463a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C7464b mo41159e(Parcel parcel) {
            return mo41160f((C7462e) parcel.readParcelable(C7462e.class.getClassLoader()));
        }

        /* renamed from: f */
        public C7464b mo41160f(C7462e eVar) {
            if (eVar == null) {
                return this;
            }
            return ((C7464b) super.mo41178c(eVar)).mo41161g(eVar.mo41153e());
        }

        /* renamed from: g */
        public C7464b mo41161g(String str) {
            mo41177b("og:type", str);
            return this;
        }
    }

    /* synthetic */ C7462e(C7464b bVar, C7463a aVar) {
        this(bVar);
    }

    @Nullable
    /* renamed from: e */
    public String mo41153e() {
        return mo41173c("og:type");
    }

    private C7462e(C7464b bVar) {
        super(bVar);
    }

    C7462e(Parcel parcel) {
        super(parcel);
    }
}
