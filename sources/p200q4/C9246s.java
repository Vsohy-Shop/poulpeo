package p200q4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;

/* renamed from: q4.s */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9246s extends BroadcastReceiver {
    @Nullable

    /* renamed from: a */
    Context f13588a;

    /* renamed from: b */
    private final C9245r f13589b;

    public C9246s(C9245r rVar) {
        this.f13589b = rVar;
    }

    /* renamed from: a */
    public final void mo43540a(Context context) {
        this.f13588a = context;
    }

    /* renamed from: b */
    public final synchronized void mo43541b() {
        Context context = this.f13588a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f13588a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.f13589b.mo32526a();
            mo43541b();
        }
    }
}
