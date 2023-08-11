package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.adjust.sdk.Constants;
import com.facebook.C4509a;
import com.facebook.C4555l;
import com.facebook.C4570n;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import p198q2.C9138d0;
import p251v2.C9925a;

/* renamed from: com.facebook.d */
/* compiled from: AccessTokenManager.kt */
public final class C4527d {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static C4527d f4138f;

    /* renamed from: g */
    public static final C4528a f4139g = new C4528a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private C4509a f4140a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicBoolean f4141b = new AtomicBoolean(false);

    /* renamed from: c */
    private Date f4142c = new Date(0);

    /* renamed from: d */
    private final LocalBroadcastManager f4143d;

    /* renamed from: e */
    private final C4524c f4144e;

    /* renamed from: com.facebook.d$a */
    /* compiled from: AccessTokenManager.kt */
    public static final class C4528a {
        private C4528a() {
        }

        public /* synthetic */ C4528a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final C4555l m5569c(C4509a aVar, C4555l.C4557b bVar) {
            C4532e f = m5571f(aVar);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", f.mo31544a());
            bundle.putString("client_id", aVar.mo31488c());
            return new C4555l(aVar, f.mo31545b(), bundle, C4576p.f4292b, bVar, (String) null, 32, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final C4555l m5570d(C4509a aVar, C4555l.C4557b bVar) {
            return new C4555l(aVar, "me/permissions", new Bundle(), C4576p.f4292b, bVar, (String) null, 32, (DefaultConstructorMarker) null);
        }

        /* renamed from: f */
        private final C4532e m5571f(C4509a aVar) {
            String i = aVar.mo31496i();
            if (i == null) {
                i = "facebook";
            }
            if (i.hashCode() == 28903346 && i.equals(FacebookSdk.INSTAGRAM)) {
                return new C4530c();
            }
            return new C4529b();
        }

        /* renamed from: e */
        public final C4527d mo31543e() {
            C4527d a;
            C4527d a2 = C4527d.f4138f;
            if (a2 != null) {
                return a2;
            }
            synchronized (this) {
                a = C4527d.f4138f;
                if (a == null) {
                    LocalBroadcastManager instance = LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext());
                    C12775o.m28638h(instance, "LocalBroadcastManager.ge…tance(applicationContext)");
                    C4527d dVar = new C4527d(instance, new C4524c());
                    C4527d.f4138f = dVar;
                    a = dVar;
                }
            }
            return a;
        }
    }

    /* renamed from: com.facebook.d$b */
    /* compiled from: AccessTokenManager.kt */
    public static final class C4529b implements C4532e {

        /* renamed from: a */
        private final String f4145a = "oauth/access_token";

        /* renamed from: b */
        private final String f4146b = "fb_extend_sso_token";

        /* renamed from: a */
        public String mo31544a() {
            return this.f4146b;
        }

        /* renamed from: b */
        public String mo31545b() {
            return this.f4145a;
        }
    }

    /* renamed from: com.facebook.d$c */
    /* compiled from: AccessTokenManager.kt */
    public static final class C4530c implements C4532e {

        /* renamed from: a */
        private final String f4147a = "refresh_access_token";

        /* renamed from: b */
        private final String f4148b = "ig_refresh_token";

        /* renamed from: a */
        public String mo31544a() {
            return this.f4148b;
        }

        /* renamed from: b */
        public String mo31545b() {
            return this.f4147a;
        }
    }

    /* renamed from: com.facebook.d$d */
    /* compiled from: AccessTokenManager.kt */
    private static final class C4531d {

        /* renamed from: a */
        private String f4149a;

        /* renamed from: b */
        private int f4150b;

        /* renamed from: c */
        private int f4151c;

        /* renamed from: d */
        private Long f4152d;

        /* renamed from: e */
        private String f4153e;

        /* renamed from: a */
        public final String mo31546a() {
            return this.f4149a;
        }

        /* renamed from: b */
        public final Long mo31547b() {
            return this.f4152d;
        }

        /* renamed from: c */
        public final int mo31548c() {
            return this.f4150b;
        }

        /* renamed from: d */
        public final int mo31549d() {
            return this.f4151c;
        }

        /* renamed from: e */
        public final String mo31550e() {
            return this.f4153e;
        }

        /* renamed from: f */
        public final void mo31551f(String str) {
            this.f4149a = str;
        }

        /* renamed from: g */
        public final void mo31552g(Long l) {
            this.f4152d = l;
        }

        /* renamed from: h */
        public final void mo31553h(int i) {
            this.f4150b = i;
        }

        /* renamed from: i */
        public final void mo31554i(int i) {
            this.f4151c = i;
        }

        /* renamed from: j */
        public final void mo31555j(String str) {
            this.f4153e = str;
        }
    }

    /* renamed from: com.facebook.d$e */
    /* compiled from: AccessTokenManager.kt */
    public interface C4532e {
        /* renamed from: a */
        String mo31544a();

        /* renamed from: b */
        String mo31545b();
    }

    /* renamed from: com.facebook.d$f */
    /* compiled from: AccessTokenManager.kt */
    static final class C4533f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C4527d f4154b;

        C4533f(C4527d dVar, C4509a.C4510a aVar) {
            this.f4154b = dVar;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        this.f4154b.m5556j((C4509a.C4510a) null);
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.d$g */
    /* compiled from: AccessTokenManager.kt */
    static final class C4534g implements C4570n.C4571a {

        /* renamed from: a */
        final /* synthetic */ C4527d f4155a;

        /* renamed from: b */
        final /* synthetic */ C4531d f4156b;

        /* renamed from: c */
        final /* synthetic */ C4509a f4157c;

        /* renamed from: d */
        final /* synthetic */ AtomicBoolean f4158d;

        /* renamed from: e */
        final /* synthetic */ Set f4159e;

        /* renamed from: f */
        final /* synthetic */ Set f4160f;

        /* renamed from: g */
        final /* synthetic */ Set f4161g;

        C4534g(C4527d dVar, C4531d dVar2, C4509a aVar, C4509a.C4510a aVar2, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.f4155a = dVar;
            this.f4156b = dVar2;
            this.f4157c = aVar;
            this.f4158d = atomicBoolean;
            this.f4159e = set;
            this.f4160f = set2;
            this.f4161g = set3;
        }

        /* renamed from: a */
        public final void mo31557a(C4570n nVar) {
            String str;
            Set<String> set;
            Set<String> set2;
            Set<String> set3;
            Date date;
            C12775o.m28639i(nVar, "it");
            String a = this.f4156b.mo31546a();
            int c = this.f4156b.mo31548c();
            Long b = this.f4156b.mo31547b();
            String e = this.f4156b.mo31550e();
            try {
                C4528a aVar = C4527d.f4139g;
                if (aVar.mo31543e().mo31539g() != null) {
                    C4509a g = aVar.mo31543e().mo31539g();
                    if (g != null) {
                        str = g.mo31501o();
                    } else {
                        str = null;
                    }
                    if (str == this.f4157c.mo31501o()) {
                        if (!this.f4158d.get() && a == null && c == 0) {
                            this.f4155a.f4141b.set(false);
                            return;
                        }
                        Date h = this.f4157c.mo31494h();
                        if (this.f4156b.mo31548c() != 0) {
                            h = new Date(((long) this.f4156b.mo31548c()) * 1000);
                        } else if (this.f4156b.mo31549d() != 0) {
                            h = new Date((((long) this.f4156b.mo31549d()) * 1000) + new Date().getTime());
                        }
                        Date date2 = h;
                        if (a == null) {
                            a = this.f4157c.mo31500n();
                        }
                        String str2 = a;
                        String c2 = this.f4157c.mo31488c();
                        String o = this.f4157c.mo31501o();
                        if (this.f4158d.get()) {
                            set = this.f4159e;
                        } else {
                            set = this.f4157c.mo31498l();
                        }
                        Set<String> set4 = set;
                        if (this.f4158d.get()) {
                            set2 = this.f4160f;
                        } else {
                            set2 = this.f4157c.mo31492f();
                        }
                        Set<String> set5 = set2;
                        if (this.f4158d.get()) {
                            set3 = this.f4161g;
                        } else {
                            set3 = this.f4157c.mo31493g();
                        }
                        Set<String> set6 = set3;
                        C4537e m = this.f4157c.mo31499m();
                        Date date3 = new Date();
                        if (b != null) {
                            date = new Date(b.longValue() * 1000);
                        } else {
                            date = this.f4157c.mo31490e();
                        }
                        Date date4 = date;
                        if (e == null) {
                            e = this.f4157c.mo31496i();
                        }
                        aVar.mo31543e().mo31542l(new C4509a(str2, c2, o, set4, set5, set6, m, date2, date3, date4, e));
                        this.f4155a.f4141b.set(false);
                    }
                }
            } finally {
                this.f4155a.f4141b.set(false);
            }
        }
    }

    /* renamed from: com.facebook.d$h */
    /* compiled from: AccessTokenManager.kt */
    static final class C4535h implements C4555l.C4557b {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f4162a;

        /* renamed from: b */
        final /* synthetic */ Set f4163b;

        /* renamed from: c */
        final /* synthetic */ Set f4164c;

        /* renamed from: d */
        final /* synthetic */ Set f4165d;

        C4535h(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.f4162a = atomicBoolean;
            this.f4163b = set;
            this.f4164c = set2;
            this.f4165d = set3;
        }

        public final void onCompleted(C4574o oVar) {
            JSONArray optJSONArray;
            C12775o.m28639i(oVar, "response");
            JSONObject d = oVar.mo31711d();
            if (d != null && (optJSONArray = d.optJSONArray("data")) != null) {
                this.f4162a.set(true);
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("permission");
                        String optString2 = optJSONObject.optString(NotificationCompat.CATEGORY_STATUS);
                        if (!C9138d0.m18618T(optString) && !C9138d0.m18618T(optString2)) {
                            C12775o.m28638h(optString2, NotificationCompat.CATEGORY_STATUS);
                            Locale locale = Locale.US;
                            C12775o.m28638h(locale, "Locale.US");
                            if (optString2 != null) {
                                String lowerCase = optString2.toLowerCase(locale);
                                C12775o.m28638h(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                                if (lowerCase != null) {
                                    int hashCode = lowerCase.hashCode();
                                    if (hashCode != -1309235419) {
                                        if (hashCode != 280295099) {
                                            if (hashCode == 568196142 && lowerCase.equals("declined")) {
                                                this.f4164c.add(optString);
                                            }
                                        } else if (lowerCase.equals("granted")) {
                                            this.f4163b.add(optString);
                                        }
                                    } else if (lowerCase.equals("expired")) {
                                        this.f4165d.add(optString);
                                    }
                                }
                                Log.w("AccessTokenManager", "Unexpected status: " + lowerCase);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.d$i */
    /* compiled from: AccessTokenManager.kt */
    static final class C4536i implements C4555l.C4557b {

        /* renamed from: a */
        final /* synthetic */ C4531d f4166a;

        C4536i(C4531d dVar) {
            this.f4166a = dVar;
        }

        public final void onCompleted(C4574o oVar) {
            C12775o.m28639i(oVar, "response");
            JSONObject d = oVar.mo31711d();
            if (d != null) {
                this.f4166a.mo31551f(d.optString("access_token"));
                this.f4166a.mo31553h(d.optInt("expires_at"));
                this.f4166a.mo31554i(d.optInt("expires_in"));
                this.f4166a.mo31552g(Long.valueOf(d.optLong("data_access_expiration_time")));
                this.f4166a.mo31555j(d.optString("graph_domain", (String) null));
            }
        }
    }

    public C4527d(LocalBroadcastManager localBroadcastManager, C4524c cVar) {
        C12775o.m28639i(localBroadcastManager, "localBroadcastManager");
        C12775o.m28639i(cVar, "accessTokenCache");
        this.f4143d = localBroadcastManager;
        this.f4144e = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m5556j(C4509a.C4510a aVar) {
        C4509a g = mo31539g();
        if (g == null) {
            if (aVar != null) {
                aVar.mo31506a(new FacebookException("No current access token to refresh"));
            }
        } else if (this.f4141b.compareAndSet(false, true)) {
            this.f4142c = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C4531d dVar = new C4531d();
            C4528a aVar2 = f4139g;
            C4570n nVar = new C4570n(aVar2.m5570d(g, new C4535h(atomicBoolean, hashSet, hashSet2, hashSet3)), aVar2.m5569c(g, new C4536i(dVar)));
            nVar.mo31696j(new C4534g(this, dVar, g, aVar, atomicBoolean, hashSet, hashSet2, hashSet3));
            nVar.mo31702s();
        } else if (aVar != null) {
            aVar.mo31506a(new FacebookException("Refresh already in progress"));
        }
    }

    /* renamed from: k */
    private final void m5557k(C4509a aVar, C4509a aVar2) {
        Intent intent = new Intent(FacebookSdk.getApplicationContext(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aVar2);
        this.f4143d.sendBroadcast(intent);
    }

    /* renamed from: m */
    private final void m5558m(C4509a aVar, boolean z) {
        C4509a aVar2 = this.f4140a;
        this.f4140a = aVar;
        this.f4141b.set(false);
        this.f4142c = new Date(0);
        if (z) {
            if (aVar != null) {
                this.f4144e.mo31535g(aVar);
            } else {
                this.f4144e.mo31533a();
                C9138d0.m18635f(FacebookSdk.getApplicationContext());
            }
        }
        if (!C9138d0.m18625a(aVar2, aVar)) {
            m5557k(aVar2, aVar);
            m5559n();
        }
    }

    /* renamed from: n */
    private final void m5559n() {
        Date date;
        Context applicationContext = FacebookSdk.getApplicationContext();
        C4509a.C4512c cVar = C4509a.f4119q;
        C4509a e = cVar.mo31515e();
        AlarmManager alarmManager = (AlarmManager) applicationContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (cVar.mo31517g()) {
            if (e != null) {
                date = e.mo31494h();
            } else {
                date = null;
            }
            if (date != null && alarmManager != null) {
                Intent intent = new Intent(applicationContext, CurrentAccessTokenExpirationBroadcastReceiver.class);
                intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                try {
                    alarmManager.set(1, e.mo31494h().getTime(), PendingIntent.getBroadcast(applicationContext, 0, intent, 67108864));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: o */
    private final boolean m5560o() {
        C4509a g = mo31539g();
        if (g == null) {
            return false;
        }
        long time = new Date().getTime();
        if (!g.mo31499m().mo31558a() || time - this.f4142c.getTime() <= ((long) Constants.ONE_HOUR) || time - g.mo31497k().getTime() <= ((long) 86400000)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo31537e() {
        m5557k(mo31539g(), mo31539g());
    }

    /* renamed from: f */
    public final void mo31538f() {
        if (m5560o()) {
            mo31541i((C4509a.C4510a) null);
        }
    }

    /* renamed from: g */
    public final C4509a mo31539g() {
        return this.f4140a;
    }

    /* renamed from: h */
    public final boolean mo31540h() {
        C4509a f = this.f4144e.mo31534f();
        if (f == null) {
            return false;
        }
        m5558m(f, false);
        return true;
    }

    /* renamed from: i */
    public final void mo31541i(C4509a.C4510a aVar) {
        if (C12775o.m28634d(Looper.getMainLooper(), Looper.myLooper())) {
            m5556j(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new C4533f(this, aVar));
        }
    }

    /* renamed from: l */
    public final void mo31542l(C4509a aVar) {
        m5558m(aVar, true);
    }
}
