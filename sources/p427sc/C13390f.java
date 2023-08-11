package p427sc;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import p415qc.C13242g;

/* renamed from: sc.f */
/* compiled from: CTTrackingCommandEvent */
public class C13390f extends C13388e {

    /* renamed from: c */
    private String f21455c;

    /* renamed from: d */
    private String f21456d;

    /* renamed from: e */
    private List<String> f21457e;

    /* renamed from: f */
    private String f21458f;

    public C13390f(String str, Integer num, String str2) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        }
        this.f21455c = str;
        if (num != null) {
            try {
                this.f21456d = String.valueOf(num);
            } catch (Exception unused) {
            }
        }
        this.f21458f = str2;
        mo52894e(C13242g.f21085P);
    }

    /* renamed from: c */
    public String mo52892c() {
        return NotificationCompat.CATEGORY_EVENT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo53005i() {
        mo52890a(C13242g.f21085P, this.f21455c);
        String str = this.f21456d;
        if (str == null || str.equals("")) {
            List<String> list = this.f21457e;
            if (list != null && !list.isEmpty()) {
                mo52890a(C13242g.f21087R, this.f21457e);
            }
        } else {
            mo52890a(C13242g.f21086Q, this.f21456d);
        }
        String str2 = this.f21458f;
        if (str2 != null && !str2.equals("")) {
            mo52890a(C13242g.f21088S, this.f21458f);
        }
    }

    public C13390f(String str, String str2, String str3) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        }
        this.f21455c = str;
        this.f21456d = str2;
        this.f21458f = str3;
        mo52894e(C13242g.f21085P);
    }

    public C13390f(String str, List<String> list, String str2) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        }
        this.f21455c = str;
        this.f21457e = new ArrayList(list);
        this.f21458f = str2;
        mo52894e(C13242g.f21085P);
    }
}
