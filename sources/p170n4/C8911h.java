package p170n4;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* renamed from: n4.h */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C8911h implements Parcelable {
    public static final Parcelable.Creator<C8911h> CREATOR = new C8909f();

    /* renamed from: b */
    Messenger f12932b;

    public C8911h(IBinder iBinder) {
        this.f12932b = new Messenger(iBinder);
    }

    /* renamed from: a */
    public final IBinder mo43054a() {
        Messenger messenger = this.f12932b;
        messenger.getClass();
        return messenger.getBinder();
    }

    /* renamed from: b */
    public final void mo43055b(Message message) {
        Messenger messenger = this.f12932b;
        messenger.getClass();
        messenger.send(message);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return mo43054a().equals(((C8911h) obj).mo43054a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return mo43054a().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f12932b;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
