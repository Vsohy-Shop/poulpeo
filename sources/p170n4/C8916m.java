package p170n4;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import p276x5.C10394a;

/* renamed from: n4.m */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class C8916m implements C10394a {

    /* renamed from: a */
    public static final /* synthetic */ C8916m f12943a = new C8916m();

    private /* synthetic */ C8916m() {
    }

    /* renamed from: a */
    public final Object mo39780a(Task task) {
        if (task.mo35465p()) {
            return (Bundle) task.mo35461l();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(task.mo35460k());
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.mo35460k());
    }
}
