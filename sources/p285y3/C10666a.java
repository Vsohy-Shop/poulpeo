package p285y3;

import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.mediarouter.media.MediaRouter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p086f5.C7603i;

/* renamed from: y3.a */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public final class C10666a {
    @WorkerThread
    /* renamed from: a */
    public static final void m22663a(String str) {
        HttpURLConnection httpURLConnection;
        try {
            C7603i.m14963b(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_UNSELECTED);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                sb.append("Received non-success response code ");
                sb.append(responseCode);
                sb.append(" from pinging URL: ");
                sb.append(str);
                Log.w("HttpUrlPinger", sb.toString());
            }
            httpURLConnection.disconnect();
            C7603i.m14962a();
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
            sb2.append("Error while parsing ping URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            Log.w("HttpUrlPinger", sb2.toString(), e);
            C7603i.m14962a();
        } catch (IOException | RuntimeException e2) {
            try {
                String message2 = e2.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
                sb3.append("Error while pinging URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message2);
                Log.w("HttpUrlPinger", sb3.toString(), e2);
            } finally {
                C7603i.m14962a();
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
