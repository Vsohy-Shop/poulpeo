package p382lc;

import android.os.Handler;
import android.os.Message;
import com.rmn.iosadapters.android.p323os.AndroidOsMessage;

/* renamed from: lc.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12820b implements Handler.Callback {

    /* renamed from: b */
    public final /* synthetic */ C12822d f20487b;

    public /* synthetic */ C12820b(C12822d dVar) {
        this.f20487b = dVar;
    }

    public final boolean handleMessage(Message message) {
        return this.f20487b.mo49078a(new AndroidOsMessage(message));
    }
}
