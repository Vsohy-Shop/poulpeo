package p198q2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;
import p251v2.C9925a;

/* renamed from: q2.k */
/* compiled from: FacebookWebFallbackDialog */
public class C9164k extends C9146f0 {

    /* renamed from: q */
    private static final String f13399q = "q2.k";

    /* renamed from: p */
    private boolean f13400p;

    /* renamed from: q2.k$a */
    /* compiled from: FacebookWebFallbackDialog */
    class C9165a implements Runnable {
        C9165a() {
        }

        public void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    C9164k.super.cancel();
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    private C9164k(Context context, String str, String str2) {
        super(context, str);
        mo43417w(str2);
    }

    /* renamed from: B */
    public static C9164k m18752B(Context context, String str, String str2) {
        C9146f0.m18709n(context);
        return new C9164k(context, str, str2);
    }

    public void cancel() {
        WebView m = mo43403m();
        if (!mo43412p() || mo43404o() || m == null || !m.isShown()) {
            super.cancel();
        } else if (!this.f13400p) {
            this.f13400p = true;
            m.loadUrl("javascript:" + "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new C9165a(), 1500);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public Bundle mo43413s(String str) {
        Bundle f0 = C9138d0.m18636f0(Uri.parse(str).getQuery());
        String string = f0.getString("bridge_args");
        f0.remove("bridge_args");
        if (!C9138d0.m18618T(string)) {
            try {
                f0.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C9124c.m18579a(new JSONObject(string)));
            } catch (JSONException e) {
                C9138d0.m18628b0(f13399q, "Unable to parse bridge_args JSON", e);
            }
        }
        String string2 = f0.getString("method_results");
        f0.remove("method_results");
        if (!C9138d0.m18618T(string2)) {
            if (C9138d0.m18618T(string2)) {
                string2 = "{}";
            }
            try {
                f0.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C9124c.m18579a(new JSONObject(string2)));
            } catch (JSONException e2) {
                C9138d0.m18628b0(f13399q, "Unable to parse bridge_args JSON", e2);
            }
        }
        f0.remove("version");
        f0.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C9196w.m18865v());
        return f0;
    }
}
