package p382lc;

import android.os.Handler;
import android.os.Message;
import com.rmn.iosadapters.android.p323os.AndroidOsMessage;

/* renamed from: lc.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12821c implements Handler.Callback {

    /* renamed from: b */
    public final /* synthetic */ C12822d f20488b;

    public /* synthetic */ C12821c(C12822d dVar) {
        this.f20488b = dVar;
    }

    public final boolean handleMessage(Message message) {
        return this.f20488b.mo49078a(new AndroidOsMessage(message));
    }
}
