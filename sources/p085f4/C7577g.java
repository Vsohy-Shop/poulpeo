package p085f4;

import androidx.annotation.Nullable;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.api.C4733c;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p190p4.C9052b;
import p190p4.C9054c;
import p200q4.C9238l;
import p231t4.C9713p;
import p264w4.C10112a;

/* renamed from: f4.g */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C7577g implements Runnable {

    /* renamed from: d */
    private static final C10112a f10557d = new C10112a("RevokeAccessOperation", new String[0]);

    /* renamed from: b */
    private final String f10558b;

    /* renamed from: c */
    private final C9238l f10559c = new C9238l((C4733c) null);

    private C7577g(String str) {
        this.f10558b = C9713p.m20271f(str);
    }

    /* renamed from: a */
    public static C9052b<Status> m14914a(@Nullable String str) {
        if (str == null) {
            return C9054c.m18392a(new Status(4), (C4733c) null);
        }
        C7577g gVar = new C7577g(str);
        new Thread(gVar).start();
        return gVar.f10559c;
    }

    public final void run() {
        String str;
        String str2;
        String str3;
        Status status = Status.f4891i;
        try {
            String valueOf = String.valueOf(this.f10558b);
            if (valueOf.length() != 0) {
                str3 = "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf);
            } else {
                str3 = new String("https://accounts.google.com/o/oauth2/revoke?token=");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f4889g;
            } else {
                f10557d.mo44691b("Unable to revoke access!", new Object[0]);
            }
            C10112a aVar = f10557d;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            aVar.mo44690a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            C10112a aVar2 = f10557d;
            String valueOf2 = String.valueOf(e.toString());
            if (valueOf2.length() != 0) {
                str = "IOException when revoking access: ".concat(valueOf2);
            } else {
                str = new String("IOException when revoking access: ");
            }
            aVar2.mo44691b(str, new Object[0]);
        } catch (Exception e2) {
            C10112a aVar3 = f10557d;
            String valueOf3 = String.valueOf(e2.toString());
            if (valueOf3.length() != 0) {
                str2 = "Exception when revoking access: ".concat(valueOf3);
            } else {
                str2 = new String("Exception when revoking access: ");
            }
            aVar3.mo44691b(str2, new Object[0]);
        }
        this.f10559c.mo32442j(status);
    }
}
