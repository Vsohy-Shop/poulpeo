package p021a3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import androidx.fragment.app.DialogFragment;
import com.facebook.C4509a;
import com.facebook.C4537e;
import com.facebook.C4550k;
import com.facebook.C4555l;
import com.facebook.C4568m;
import com.facebook.C4574o;
import com.facebook.C4576p;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p021a3.C2166l;
import p033b2.C2867m;
import p178o2.C8953b;
import p178o2.C8954c;
import p178o2.C8955d;
import p178o2.C8956e;
import p188p2.C9048a;
import p198q2.C9119a0;
import p198q2.C9138d0;
import p198q2.C9144e0;
import p198q2.C9181q;
import p251v2.C9925a;

/* renamed from: a3.d */
/* compiled from: DeviceAuthDialog */
public class C2141d extends DialogFragment {

    /* renamed from: b */
    private View f830b;

    /* renamed from: c */
    private TextView f831c;

    /* renamed from: d */
    private TextView f832d;

    /* renamed from: e */
    private C2152e f833e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AtomicBoolean f834f = new AtomicBoolean();

    /* renamed from: g */
    private volatile C4568m f835g;

    /* renamed from: h */
    private volatile ScheduledFuture f836h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile C2150i f837i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f838j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f839k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C2166l.C2170d f840l = null;

    /* renamed from: a3.d$a */
    /* compiled from: DeviceAuthDialog */
    class C2142a extends Dialog {
        C2142a(Context context, int i) {
            super(context, i);
        }

        public void onBackPressed() {
            C2141d.this.mo23298y2();
            super.onBackPressed();
        }
    }

    /* renamed from: a3.d$b */
    /* compiled from: DeviceAuthDialog */
    class C2143b implements C4555l.C4557b {
        C2143b() {
        }

        public void onCompleted(C4574o oVar) {
            if (!C2141d.this.f838j) {
                if (oVar.mo31709b() != null) {
                    C2141d.this.mo23290A2(oVar.mo31709b().mo31600e());
                    return;
                }
                JSONObject c = oVar.mo31710c();
                C2150i iVar = new C2150i();
                try {
                    iVar.mo23314h(c.getString("user_code"));
                    iVar.mo23313g(c.getString("code"));
                    iVar.mo23311e(c.getLong("interval"));
                    C2141d.this.m1520F2(iVar);
                } catch (JSONException e) {
                    C2141d.this.mo23290A2(new FacebookException((Throwable) e));
                }
            }
        }
    }

    /* renamed from: a3.d$c */
    /* compiled from: DeviceAuthDialog */
    class C2144c implements View.OnClickListener {
        C2144c() {
        }

        public void onClick(View view) {
            if (!C9925a.m20734d(this)) {
                try {
                    C2141d.this.mo23299z2();
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: a3.d$d */
    /* compiled from: DeviceAuthDialog */
    class C2145d implements Runnable {
        C2145d() {
        }

        public void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    C2141d.this.m1517C2();
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: a3.d$e */
    /* compiled from: DeviceAuthDialog */
    class C2146e implements C4555l.C4557b {
        C2146e() {
        }

        public void onCompleted(C4574o oVar) {
            if (!C2141d.this.f834f.get()) {
                C4550k b = oVar.mo31709b();
                if (b != null) {
                    int g = b.mo31602g();
                    if (g != 1349152) {
                        switch (g) {
                            case 1349172:
                            case 1349174:
                                C2141d.this.m1519E2();
                                return;
                            case 1349173:
                                C2141d.this.mo23299z2();
                                return;
                            default:
                                C2141d.this.mo23290A2(oVar.mo31709b().mo31600e());
                                return;
                        }
                    } else {
                        if (C2141d.this.f837i != null) {
                            C9048a.m18373a(C2141d.this.f837i.mo23309d());
                        }
                        if (C2141d.this.f840l != null) {
                            C2141d dVar = C2141d.this;
                            dVar.mo23291G2(dVar.f840l);
                            return;
                        }
                        C2141d.this.mo23299z2();
                    }
                } else {
                    try {
                        JSONObject c = oVar.mo31710c();
                        C2141d.this.m1516B2(c.getString("access_token"), Long.valueOf(c.getLong("expires_in")), Long.valueOf(c.optLong("data_access_expiration_time")));
                    } catch (JSONException e) {
                        C2141d.this.mo23290A2(new FacebookException((Throwable) e));
                    }
                }
            }
        }
    }

    /* renamed from: a3.d$f */
    /* compiled from: DeviceAuthDialog */
    class C2147f implements DialogInterface.OnClickListener {
        C2147f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2141d.this.getDialog().setContentView(C2141d.this.mo23297x2(false));
            C2141d dVar = C2141d.this;
            dVar.mo23291G2(dVar.f840l);
        }
    }

    /* renamed from: a3.d$g */
    /* compiled from: DeviceAuthDialog */
    class C2148g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ String f847b;

        /* renamed from: c */
        final /* synthetic */ C9138d0.C9140b f848c;

        /* renamed from: d */
        final /* synthetic */ String f849d;

        /* renamed from: e */
        final /* synthetic */ Date f850e;

        /* renamed from: f */
        final /* synthetic */ Date f851f;

        C2148g(String str, C9138d0.C9140b bVar, String str2, Date date, Date date2) {
            this.f847b = str;
            this.f848c = bVar;
            this.f849d = str2;
            this.f850e = date;
            this.f851f = date2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2141d.this.m1533u2(this.f847b, this.f848c, this.f849d, this.f850e, this.f851f);
        }
    }

    /* renamed from: a3.d$h */
    /* compiled from: DeviceAuthDialog */
    class C2149h implements C4555l.C4557b {

        /* renamed from: a */
        final /* synthetic */ String f853a;

        /* renamed from: b */
        final /* synthetic */ Date f854b;

        /* renamed from: c */
        final /* synthetic */ Date f855c;

        C2149h(String str, Date date, Date date2) {
            this.f853a = str;
            this.f854b = date;
            this.f855c = date2;
        }

        public void onCompleted(C4574o oVar) {
            if (!C2141d.this.f834f.get()) {
                if (oVar.mo31709b() != null) {
                    C2141d.this.mo23290A2(oVar.mo31709b().mo31600e());
                    return;
                }
                try {
                    JSONObject c = oVar.mo31710c();
                    String string = c.getString("id");
                    C9138d0.C9140b H = C9138d0.m18606H(c);
                    String string2 = c.getString(HintConstants.AUTOFILL_HINT_NAME);
                    C9048a.m18373a(C2141d.this.f837i.mo23309d());
                    if (!C9181q.m18806j(FacebookSdk.getApplicationId()).mo43462j().contains(C9119a0.RequireConfirm) || C2141d.this.f839k) {
                        C2141d.this.m1533u2(string, H, this.f853a, this.f854b, this.f855c);
                        return;
                    }
                    boolean unused = C2141d.this.f839k = true;
                    C2141d.this.m1518D2(string, H, this.f853a, string2, this.f854b, this.f855c);
                } catch (JSONException e) {
                    C2141d.this.mo23290A2(new FacebookException((Throwable) e));
                }
            }
        }
    }

    /* renamed from: a3.d$i */
    /* compiled from: DeviceAuthDialog */
    private static class C2150i implements Parcelable {
        public static final Parcelable.Creator<C2150i> CREATOR = new C2151a();

        /* renamed from: b */
        private String f857b;

        /* renamed from: c */
        private String f858c;

        /* renamed from: d */
        private String f859d;

        /* renamed from: e */
        private long f860e;

        /* renamed from: f */
        private long f861f;

        /* renamed from: a3.d$i$a */
        /* compiled from: DeviceAuthDialog */
        static class C2151a implements Parcelable.Creator<C2150i> {
            C2151a() {
            }

            /* renamed from: a */
            public C2150i createFromParcel(Parcel parcel) {
                return new C2150i(parcel);
            }

            /* renamed from: b */
            public C2150i[] newArray(int i) {
                return new C2150i[i];
            }
        }

        C2150i() {
        }

        protected C2150i(Parcel parcel) {
            this.f857b = parcel.readString();
            this.f858c = parcel.readString();
            this.f859d = parcel.readString();
            this.f860e = parcel.readLong();
            this.f861f = parcel.readLong();
        }

        /* renamed from: a */
        public String mo23306a() {
            return this.f857b;
        }

        /* renamed from: b */
        public long mo23307b() {
            return this.f860e;
        }

        /* renamed from: c */
        public String mo23308c() {
            return this.f859d;
        }

        /* renamed from: d */
        public String mo23309d() {
            return this.f858c;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public void mo23311e(long j) {
            this.f860e = j;
        }

        /* renamed from: f */
        public void mo23312f(long j) {
            this.f861f = j;
        }

        /* renamed from: g */
        public void mo23313g(String str) {
            this.f859d = str;
        }

        /* renamed from: h */
        public void mo23314h(String str) {
            this.f858c = str;
            this.f857b = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{str});
        }

        /* renamed from: i */
        public boolean mo23315i() {
            if (this.f861f != 0 && (new Date().getTime() - this.f861f) - (this.f860e * 1000) < 0) {
                return true;
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f857b);
            parcel.writeString(this.f858c);
            parcel.writeString(this.f859d);
            parcel.writeLong(this.f860e);
            parcel.writeLong(this.f861f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public void m1516B2(String str, Long l, Long l2) {
        Date date;
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date2 = null;
        if (l.longValue() != 0) {
            date = new Date(new Date().getTime() + (l.longValue() * 1000));
        } else {
            date = null;
        }
        if (l2.longValue() != 0) {
            date2 = new Date(l2.longValue() * 1000);
        }
        new C4555l(new C4509a(str, FacebookSdk.getApplicationId(), "0", (Collection<String>) null, (Collection<String>) null, (Collection<String>) null, (C4537e) null, date, (Date) null, date2), "me", bundle, C4576p.f4292b, new C2149h(str, date, date2)).mo31621j();
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public void m1517C2() {
        this.f837i.mo23312f(new Date().getTime());
        this.f835g = m1534w2().mo31621j();
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public void m1518D2(String str, C9138d0.C9140b bVar, String str2, String str3, Date date, Date date2) {
        String string = getResources().getString(C8955d.f13005g);
        String string2 = getResources().getString(C8955d.f13004f);
        String string3 = getResources().getString(C8955d.f13003e);
        String format = String.format(string2, new Object[]{str3});
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new C2148g(str, bVar, str2, date, date2)).setPositiveButton(string3, new C2147f());
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public void m1519E2() {
        this.f836h = C2152e.m1552s().schedule(new C2145d(), this.f837i.mo23307b(), TimeUnit.SECONDS);
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public void m1520F2(C2150i iVar) {
        this.f837i = iVar;
        this.f831c.setText(iVar.mo23309d());
        this.f832d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new BitmapDrawable(getResources(), C9048a.m18375c(iVar.mo23306a())), (Drawable) null, (Drawable) null);
        this.f831c.setVisibility(0);
        this.f830b.setVisibility(8);
        if (!this.f839k && C9048a.m18378f(iVar.mo23309d())) {
            new C2867m(getContext()).mo28391f("fb_smart_login_service");
        }
        if (iVar.mo23315i()) {
            m1519E2();
        } else {
            m1517C2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public void m1533u2(String str, C9138d0.C9140b bVar, String str2, Date date, Date date2) {
        this.f833e.mo23325x(str2, FacebookSdk.getApplicationId(), str, bVar.mo43398c(), bVar.mo43396a(), bVar.mo43397b(), C4537e.DEVICE_AUTH, date, (Date) null, date2);
        getDialog().dismiss();
    }

    /* renamed from: w2 */
    private C4555l m1534w2() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.f837i.mo23308c());
        return new C4555l((C4509a) null, "device/login_status", bundle, C4576p.f4293c, new C2146e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: A2 */
    public void mo23290A2(FacebookException facebookException) {
        if (this.f834f.compareAndSet(false, true)) {
            if (this.f837i != null) {
                C9048a.m18373a(this.f837i.mo23309d());
            }
            this.f833e.mo23324w(facebookException);
            getDialog().dismiss();
        }
    }

    /* renamed from: G2 */
    public void mo23291G2(C2166l.C2170d dVar) {
        this.f840l = dVar;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", dVar.mo23409l()));
        String f = dVar.mo23404f();
        if (f != null) {
            bundle.putString("redirect_uri", f);
        }
        String e = dVar.mo23403e();
        if (e != null) {
            bundle.putString("target_user_id", e);
        }
        bundle.putString("access_token", C9144e0.m18683b() + "|" + C9144e0.m18684c());
        bundle.putString("device_info", C9048a.m18376d());
        new C4555l((C4509a) null, "device/login", bundle, C4576p.f4293c, new C2143b()).mo31621j();
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        C2142a aVar = new C2142a(getActivity(), C8956e.f13007b);
        if (!C9048a.m18377e() || this.f839k) {
            z = false;
        } else {
            z = true;
        }
        aVar.setContentView(mo23297x2(z));
        return aVar;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2150i iVar;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f833e = (C2152e) ((C2177n) ((FacebookActivity) getActivity()).mo31475m2()).mo23437l2().mo23382k();
        if (!(bundle == null || (iVar = (C2150i) bundle.getParcelable("request_state")) == null)) {
            m1520F2(iVar);
        }
        return onCreateView;
    }

    public void onDestroyView() {
        this.f838j = true;
        this.f834f.set(true);
        super.onDestroyView();
        if (this.f835g != null) {
            this.f835g.cancel(true);
        }
        if (this.f836h != null) {
            this.f836h.cancel(true);
        }
        this.f830b = null;
        this.f831c = null;
        this.f832d = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.f838j) {
            mo23299z2();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f837i != null) {
            bundle.putParcelable("request_state", this.f837i);
        }
    }

    /* access modifiers changed from: protected */
    @LayoutRes
    /* renamed from: v2 */
    public int mo23296v2(boolean z) {
        if (z) {
            return C8954c.f12998d;
        }
        return C8954c.f12996b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public View mo23297x2(boolean z) {
        View inflate = getActivity().getLayoutInflater().inflate(mo23296v2(z), (ViewGroup) null);
        this.f830b = inflate.findViewById(C8953b.f12994f);
        this.f831c = (TextView) inflate.findViewById(C8953b.f12993e);
        ((Button) inflate.findViewById(C8953b.f12989a)).setOnClickListener(new C2144c());
        TextView textView = (TextView) inflate.findViewById(C8953b.f12990b);
        this.f832d = textView;
        textView.setText(Html.fromHtml(getString(C8955d.f12999a)));
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z2 */
    public void mo23299z2() {
        if (this.f834f.compareAndSet(false, true)) {
            if (this.f837i != null) {
                C9048a.m18373a(this.f837i.mo23309d());
            }
            C2152e eVar = this.f833e;
            if (eVar != null) {
                eVar.mo23323v();
            }
            getDialog().dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public void mo23298y2() {
    }
}
