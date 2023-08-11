package p005b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p005b.C1991a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: b.b */
/* compiled from: ResultReceiver */
public class C1995b implements Parcelable {
    public static final Parcelable.Creator<C1995b> CREATOR = new C1996a();

    /* renamed from: b */
    final boolean f564b = false;

    /* renamed from: c */
    final Handler f565c = null;

    /* renamed from: d */
    C1991a f566d;

    /* renamed from: b.b$a */
    /* compiled from: ResultReceiver */
    class C1996a implements Parcelable.Creator<C1995b> {
        C1996a() {
        }

        /* renamed from: a */
        public C1995b createFromParcel(Parcel parcel) {
            return new C1995b(parcel);
        }

        /* renamed from: b */
        public C1995b[] newArray(int i) {
            return new C1995b[i];
        }
    }

    /* renamed from: b.b$b */
    /* compiled from: ResultReceiver */
    class C1997b extends C1991a.C1992a {
        C1997b() {
        }

        /* renamed from: Y2 */
        public void mo23212Y2(int i, Bundle bundle) {
            C1995b bVar = C1995b.this;
            Handler handler = bVar.f565c;
            if (handler != null) {
                handler.post(new C1998c(i, bundle));
            } else {
                bVar.mo53a(i, bundle);
            }
        }
    }

    /* renamed from: b.b$c */
    /* compiled from: ResultReceiver */
    class C1998c implements Runnable {

        /* renamed from: b */
        final int f568b;

        /* renamed from: c */
        final Bundle f569c;

        C1998c(int i, Bundle bundle) {
            this.f568b = i;
            this.f569c = bundle;
        }

        public void run() {
            C1995b.this.mo53a(this.f568b, this.f569c);
        }
    }

    C1995b(Parcel parcel) {
        this.f566d = C1991a.C1992a.m1295E(parcel.readStrongBinder());
    }

    /* renamed from: b */
    public void mo23216b(int i, Bundle bundle) {
        if (this.f564b) {
            Handler handler = this.f565c;
            if (handler != null) {
                handler.post(new C1998c(i, bundle));
            } else {
                mo53a(i, bundle);
            }
        } else {
            C1991a aVar = this.f566d;
            if (aVar != null) {
                try {
                    aVar.mo23212Y2(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        synchronized (this) {
            if (this.f566d == null) {
                this.f566d = new C1997b();
            }
            parcel.writeStrongBinder(this.f566d.asBinder());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53a(int i, Bundle bundle) {
    }
}
