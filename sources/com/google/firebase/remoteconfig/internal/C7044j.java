package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.C6949f;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C7048m;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p113h8.C8030b;
import p124i8.C8213d;
import p192p6.C9063a;
import p276x5.C10410i;
import p286y4.C10671e;

/* renamed from: com.google.firebase.remoteconfig.internal.j */
/* compiled from: ConfigFetchHandler */
public class C7044j {

    /* renamed from: j */
    public static final long f9451j = TimeUnit.HOURS.toSeconds(12);
    @VisibleForTesting

    /* renamed from: k */
    static final int[] f9452k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a */
    private final C8213d f9453a;

    /* renamed from: b */
    private final C8030b<C9063a> f9454b;

    /* renamed from: c */
    private final Executor f9455c;

    /* renamed from: d */
    private final C10671e f9456d;

    /* renamed from: e */
    private final Random f9457e;

    /* renamed from: f */
    private final C7034d f9458f;

    /* renamed from: g */
    private final ConfigFetchHttpClient f9459g;

    /* renamed from: h */
    private final C7048m f9460h;

    /* renamed from: i */
    private final Map<String, String> f9461i;

    /* renamed from: com.google.firebase.remoteconfig.internal.j$a */
    /* compiled from: ConfigFetchHandler */
    public static class C7045a {

        /* renamed from: a */
        private final Date f9462a;

        /* renamed from: b */
        private final int f9463b;

        /* renamed from: c */
        private final C7037e f9464c;
        @Nullable

        /* renamed from: d */
        private final String f9465d;

        private C7045a(Date date, int i, C7037e eVar, @Nullable String str) {
            this.f9462a = date;
            this.f9463b = i;
            this.f9464c = eVar;
            this.f9465d = str;
        }

        /* renamed from: a */
        public static C7045a m12551a(Date date) {
            return new C7045a(date, 1, (C7037e) null, (String) null);
        }

        /* renamed from: b */
        public static C7045a m12552b(C7037e eVar, String str) {
            return new C7045a(eVar.mo40045e(), 0, eVar, str);
        }

        /* renamed from: c */
        public static C7045a m12553c(Date date) {
            return new C7045a(date, 2, (C7037e) null, (String) null);
        }

        /* renamed from: d */
        public C7037e mo40056d() {
            return this.f9464c;
        }

        /* access modifiers changed from: package-private */
        @Nullable
        /* renamed from: e */
        public String mo40057e() {
            return this.f9465d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo40058f() {
            return this.f9463b;
        }
    }

    public C7044j(C8213d dVar, C8030b<C9063a> bVar, Executor executor, C10671e eVar, Random random, C7034d dVar2, ConfigFetchHttpClient configFetchHttpClient, C7048m mVar, Map<String, String> map) {
        this.f9453a = dVar;
        this.f9454b = bVar;
        this.f9455c = executor;
        this.f9456d = eVar;
        this.f9457e = random;
        this.f9458f = dVar2;
        this.f9459g = configFetchHttpClient;
        this.f9460h = mVar;
        this.f9461i = map;
    }

    /* renamed from: e */
    private boolean m12532e(long j, Date date) {
        Date d = this.f9460h.mo40065d();
        if (d.equals(C7048m.f9476d)) {
            return false;
        }
        return date.before(new Date(d.getTime() + TimeUnit.SECONDS.toMillis(j)));
    }

    /* renamed from: f */
    private FirebaseRemoteConfigServerException m12533f(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        String str;
        int a = firebaseRemoteConfigServerException.mo40019a();
        if (a == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (a == 429) {
            throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else if (a != 500) {
            switch (a) {
                case TypedValues.PositionType.TYPE_DRAWPATH:
                case TypedValues.PositionType.TYPE_PERCENT_WIDTH:
                case TypedValues.PositionType.TYPE_PERCENT_HEIGHT:
                    str = "The server is unavailable. Please try again later.";
                    break;
                default:
                    str = "The server returned an unexpected error.";
                    break;
            }
        } else {
            str = "There was an internal server error.";
        }
        int a2 = firebaseRemoteConfigServerException.mo40019a();
        return new FirebaseRemoteConfigServerException(a2, "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    /* renamed from: g */
    private String m12534g(long j) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j))});
    }

    @WorkerThread
    /* renamed from: i */
    private C7045a m12535i(String str, String str2, Date date) {
        try {
            C7045a fetch = this.f9459g.fetch(this.f9459g.mo40031c(), str, str2, m12540n(), this.f9460h.mo40064c(), this.f9461i, date);
            if (fetch.mo40057e() != null) {
                this.f9460h.mo40068g(fetch.mo40057e());
            }
            this.f9460h.mo40066e();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e) {
            C7048m.C7049a u = m12547u(e.mo40019a(), date);
            if (m12546t(u, e.mo40019a())) {
                throw new FirebaseRemoteConfigFetchThrottledException(u.mo40072a().getTime());
            }
            throw m12533f(e);
        }
    }

    /* renamed from: j */
    private Task<C7045a> m12536j(String str, String str2, Date date) {
        try {
            C7045a i = m12535i(str, str2, date);
            if (i.mo40058f() != 0) {
                return C10410i.m21831e(i);
            }
            return this.f9458f.mo40039k(i.mo40056d()).mo35466q(this.f9455c, new C7043i(i));
        } catch (FirebaseRemoteConfigException e) {
            return C10410i.m21830d(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public Task<C7045a> m12542p(Task<C7037e> task, long j) {
        Task<TContinuationResult> task2;
        Date date = new Date(this.f9456d.mo33547a());
        if (task.mo35465p() && m12532e(j, date)) {
            return C10410i.m21831e(C7045a.m12553c(date));
        }
        Date l = m12538l(date);
        if (l != null) {
            task2 = C10410i.m21830d(new FirebaseRemoteConfigFetchThrottledException(m12534g(l.getTime() - date.getTime()), l.getTime()));
        } else {
            Task<String> id = this.f9453a.getId();
            Task<C6949f> a = this.f9453a.mo39832a(false);
            task2 = C10410i.m21835i(id, a).mo35459j(this.f9455c, new C7041g(this, id, a, date));
        }
        return task2.mo35459j(this.f9455c, new C7042h(this, date));
    }

    @Nullable
    /* renamed from: l */
    private Date m12538l(Date date) {
        Date a = this.f9460h.mo40062a().mo40072a();
        if (date.before(a)) {
            return a;
        }
        return null;
    }

    /* renamed from: m */
    private long m12539m(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f9452k;
        long millis = timeUnit.toMillis((long) iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f9457e.nextInt((int) millis));
    }

    @WorkerThread
    /* renamed from: n */
    private Map<String, String> m12540n() {
        HashMap hashMap = new HashMap();
        C9063a aVar = this.f9454b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry next : aVar.mo30045a(false).entrySet()) {
            hashMap.put((String) next.getKey(), next.getValue().toString());
        }
        return hashMap;
    }

    /* renamed from: o */
    private boolean m12541o(int i) {
        if (i == 429 || i == 502 || i == 503 || i == 504) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Task m12544r(Task task, Task task2, Date date, Task task3) {
        if (!task.mo35465p()) {
            return C10410i.m21830d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.mo35460k()));
        }
        if (!task2.mo35465p()) {
            return C10410i.m21830d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.mo35460k()));
        }
        return m12536j((String) task.mo35461l(), ((C6949f) task2.mo35461l()).mo39821b(), date);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Task m12545s(Date date, Task task) {
        m12549w(task, date);
        return task;
    }

    /* renamed from: t */
    private boolean m12546t(C7048m.C7049a aVar, int i) {
        if (aVar.mo40073b() > 1 || i == 429) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private C7048m.C7049a m12547u(int i, Date date) {
        if (m12541o(i)) {
            m12548v(date);
        }
        return this.f9460h.mo40062a();
    }

    /* renamed from: v */
    private void m12548v(Date date) {
        int b = this.f9460h.mo40062a().mo40073b() + 1;
        this.f9460h.mo40067f(b, new Date(date.getTime() + m12539m(b)));
    }

    /* renamed from: w */
    private void m12549w(Task<C7045a> task, Date date) {
        if (task.mo35465p()) {
            this.f9460h.mo40070i(date);
            return;
        }
        Exception k = task.mo35460k();
        if (k != null) {
            if (k instanceof FirebaseRemoteConfigFetchThrottledException) {
                this.f9460h.mo40071j();
            } else {
                this.f9460h.mo40069h();
            }
        }
    }

    /* renamed from: h */
    public Task<C7045a> mo40055h(long j) {
        return this.f9458f.mo40036e().mo35459j(this.f9455c, new C7040f(this, j));
    }
}
