package p021a3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C4509a;
import com.facebook.C4537e;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p021a3.C2166l;

/* renamed from: a3.e */
/* compiled from: DeviceAuthMethodHandler */
class C2152e extends C2188q {
    public static final Parcelable.Creator<C2152e> CREATOR = new C2153a();

    /* renamed from: d */
    private static ScheduledThreadPoolExecutor f862d;

    /* renamed from: a3.e$a */
    /* compiled from: DeviceAuthMethodHandler */
    static class C2153a implements Parcelable.Creator {
        C2153a() {
        }

        /* renamed from: a */
        public C2152e createFromParcel(Parcel parcel) {
            return new C2152e(parcel);
        }

        /* renamed from: b */
        public C2152e[] newArray(int i) {
            return new C2152e[i];
        }
    }

    C2152e(C2166l lVar) {
        super(lVar);
    }

    /* renamed from: s */
    public static synchronized ScheduledThreadPoolExecutor m1552s() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (C2152e.class) {
            if (f862d == null) {
                f862d = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f862d;
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: y */
    private void m1553y(C2166l.C2170d dVar) {
        FragmentActivity i = this.f956c.mo23381i();
        if (i != null && !i.isFinishing()) {
            C2141d q = mo23322q();
            q.show(i.getSupportFragmentManager(), "login_with_facebook");
            q.mo23291G2(dVar);
        }
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo23275g() {
        return "device_auth";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo23279p(C2166l.C2170d dVar) {
        m1553y(dVar);
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C2141d mo23322q() {
        return new C2141d();
    }

    /* renamed from: v */
    public void mo23323v() {
        this.f956c.mo23380g(C2166l.C2172e.m1655a(this.f956c.mo23386s(), "User canceled log in."));
    }

    /* renamed from: w */
    public void mo23324w(Exception exc) {
        this.f956c.mo23380g(C2166l.C2172e.m1657c(this.f956c.mo23386s(), (String) null, exc.getMessage()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: x */
    public void mo23325x(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, C4537e eVar, Date date, Date date2, Date date3) {
        this.f956c.mo23380g(C2166l.C2172e.m1659e(this.f956c.mo23386s(), new C4509a(str, str2, str3, collection, collection2, collection3, eVar, date, date2, date3)));
    }

    protected C2152e(Parcel parcel) {
        super(parcel);
    }
}
