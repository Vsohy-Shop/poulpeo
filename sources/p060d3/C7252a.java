package p060d3;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C4509a;
import com.facebook.C4550k;
import com.facebook.C4555l;
import com.facebook.C4574o;
import com.facebook.C4576p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p072e3.C7455a;
import p072e3.C7459c;
import p072e3.C7465f;
import p178o2.C8953b;
import p178o2.C8954c;
import p178o2.C8955d;
import p178o2.C8956e;
import p188p2.C9048a;
import p198q2.C9144e0;
import p251v2.C9925a;

@Deprecated
/* renamed from: d3.a */
/* compiled from: DeviceShareDialogFragment */
public class C7252a extends DialogFragment {

    /* renamed from: h */
    private static ScheduledThreadPoolExecutor f9985h;

    /* renamed from: b */
    private ProgressBar f9986b;

    /* renamed from: c */
    private TextView f9987c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Dialog f9988d;

    /* renamed from: e */
    private volatile C7256d f9989e;

    /* renamed from: f */
    private volatile ScheduledFuture f9990f;

    /* renamed from: g */
    private C7455a f9991g;

    /* renamed from: d3.a$a */
    /* compiled from: DeviceShareDialogFragment */
    class C7253a implements View.OnClickListener {
        C7253a() {
        }

        public void onClick(View view) {
            if (!C9925a.m20734d(this)) {
                try {
                    C7252a.this.f9988d.dismiss();
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: d3.a$b */
    /* compiled from: DeviceShareDialogFragment */
    class C7254b implements C4555l.C4557b {
        C7254b() {
        }

        public void onCompleted(C4574o oVar) {
            C4550k b = oVar.mo31709b();
            if (b != null) {
                C7252a.this.m14068n2(b);
                return;
            }
            JSONObject c = oVar.mo31710c();
            C7256d dVar = new C7256d();
            try {
                dVar.mo40823d(c.getString("user_code"));
                dVar.mo40822c(c.getLong("expires_in"));
                C7252a.this.m14071q2(dVar);
            } catch (JSONException unused) {
                C7252a.this.m14068n2(new C4550k(0, "", "Malformed server response"));
            }
        }
    }

    /* renamed from: d3.a$c */
    /* compiled from: DeviceShareDialogFragment */
    class C7255c implements Runnable {
        C7255c() {
        }

        public void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    C7252a.this.f9988d.dismiss();
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: d3.a$d */
    /* compiled from: DeviceShareDialogFragment */
    private static class C7256d implements Parcelable {
        public static final Parcelable.Creator<C7256d> CREATOR = new C7257a();

        /* renamed from: b */
        private String f9995b;

        /* renamed from: c */
        private long f9996c;

        /* renamed from: d3.a$d$a */
        /* compiled from: DeviceShareDialogFragment */
        static class C7257a implements Parcelable.Creator<C7256d> {
            C7257a() {
            }

            /* renamed from: a */
            public C7256d createFromParcel(Parcel parcel) {
                return new C7256d(parcel);
            }

            /* renamed from: b */
            public C7256d[] newArray(int i) {
                return new C7256d[i];
            }
        }

        C7256d() {
        }

        protected C7256d(Parcel parcel) {
            this.f9995b = parcel.readString();
            this.f9996c = parcel.readLong();
        }

        /* renamed from: a */
        public long mo40820a() {
            return this.f9996c;
        }

        /* renamed from: b */
        public String mo40821b() {
            return this.f9995b;
        }

        /* renamed from: c */
        public void mo40822c(long j) {
            this.f9996c = j;
        }

        /* renamed from: d */
        public void mo40823d(String str) {
            this.f9995b = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f9995b);
            parcel.writeLong(this.f9996c);
        }
    }

    /* renamed from: l2 */
    private void m14066l2() {
        if (isAdded()) {
            getFragmentManager().beginTransaction().remove(this).commit();
        }
    }

    /* renamed from: m2 */
    private void m14067m2(int i, Intent intent) {
        if (this.f9989e != null) {
            C9048a.m18373a(this.f9989e.mo40821b());
        }
        C4550k kVar = (C4550k) intent.getParcelableExtra(MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
        if (kVar != null) {
            Toast.makeText(getContext(), kVar.mo31597c(), 0).show();
        }
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            activity.setResult(i, intent);
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public void m14068n2(C4550k kVar) {
        m14066l2();
        Intent intent = new Intent();
        intent.putExtra(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, kVar);
        m14067m2(-1, intent);
    }

    /* renamed from: o2 */
    private static synchronized ScheduledThreadPoolExecutor m14069o2() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (C7252a.class) {
            if (f9985h == null) {
                f9985h = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f9985h;
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: p2 */
    private Bundle m14070p2() {
        C7455a aVar = this.f9991g;
        if (aVar == null) {
            return null;
        }
        if (aVar instanceof C7459c) {
            return C7262d.m14092a((C7459c) aVar);
        }
        if (aVar instanceof C7465f) {
            return C7262d.m14093b((C7465f) aVar);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public void m14071q2(C7256d dVar) {
        this.f9989e = dVar;
        this.f9987c.setText(dVar.mo40821b());
        this.f9987c.setVisibility(0);
        this.f9986b.setVisibility(8);
        this.f9990f = m14069o2().schedule(new C7255c(), dVar.mo40820a(), TimeUnit.SECONDS);
    }

    /* renamed from: s2 */
    private void m14072s2() {
        Bundle p2 = m14070p2();
        if (p2 == null || p2.size() == 0) {
            m14068n2(new C4550k(0, "", "Failed to get share content"));
        }
        p2.putString("access_token", C9144e0.m18683b() + "|" + C9144e0.m18684c());
        p2.putString("device_info", C9048a.m18376d());
        new C4555l((C4509a) null, "device/share", p2, C4576p.f4293c, new C7254b()).mo31621j();
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        this.f9988d = new Dialog(getActivity(), C8956e.f13007b);
        View inflate = getActivity().getLayoutInflater().inflate(C8954c.f12996b, (ViewGroup) null);
        this.f9986b = (ProgressBar) inflate.findViewById(C8953b.f12994f);
        this.f9987c = (TextView) inflate.findViewById(C8953b.f12993e);
        ((Button) inflate.findViewById(C8953b.f12989a)).setOnClickListener(new C7253a());
        ((TextView) inflate.findViewById(C8953b.f12990b)).setText(Html.fromHtml(getString(C8955d.f12999a)));
        this.f9988d.setContentView(inflate);
        m14072s2();
        return this.f9988d;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7256d dVar;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (!(bundle == null || (dVar = (C7256d) bundle.getParcelable("request_state")) == null)) {
            m14071q2(dVar);
        }
        return onCreateView;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f9990f != null) {
            this.f9990f.cancel(true);
        }
        m14067m2(-1, new Intent());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f9989e != null) {
            bundle.putParcelable("request_state", this.f9989e);
        }
    }

    /* renamed from: r2 */
    public void mo40817r2(C7455a aVar) {
        this.f9991g = aVar;
    }
}
