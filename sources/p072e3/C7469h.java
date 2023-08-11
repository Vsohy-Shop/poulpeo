package p072e3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Set;
import p072e3.C7469h;
import p072e3.C7469h.C7470a;

/* renamed from: e3.h */
/* compiled from: ShareOpenGraphValueContainer */
public abstract class C7469h<P extends C7469h, E extends C7470a> implements Parcelable {

    /* renamed from: b */
    private final Bundle f10351b;

    /* renamed from: e3.h$a */
    /* compiled from: ShareOpenGraphValueContainer */
    public static abstract class C7470a<P extends C7469h, E extends C7470a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f10352a = new Bundle();

        /* renamed from: b */
        public E mo41177b(String str, @Nullable String str2) {
            this.f10352a.putString(str, str2);
            return this;
        }

        /* renamed from: c */
        public E mo41178c(P p) {
            if (p != null) {
                this.f10352a.putAll(p.mo41172b());
            }
            return this;
        }
    }

    protected C7469h(C7470a<P, E> aVar) {
        this.f10351b = (Bundle) aVar.f10352a.clone();
    }

    @Nullable
    /* renamed from: a */
    public Object mo41171a(String str) {
        return this.f10351b.get(str);
    }

    /* renamed from: b */
    public Bundle mo41172b() {
        return (Bundle) this.f10351b.clone();
    }

    @Nullable
    /* renamed from: c */
    public String mo41173c(String str) {
        return this.f10351b.getString(str);
    }

    /* renamed from: d */
    public Set<String> mo41174d() {
        return this.f10351b.keySet();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f10351b);
    }

    C7469h(Parcel parcel) {
        this.f10351b = parcel.readBundle(C7470a.class.getClassLoader());
    }
}
