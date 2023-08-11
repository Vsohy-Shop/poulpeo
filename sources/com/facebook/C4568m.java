package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p198q2.C9138d0;
import p251v2.C9925a;

/* renamed from: com.facebook.m */
/* compiled from: GraphRequestAsyncTask.kt */
public class C4568m extends AsyncTask<Void, Void, List<? extends C4574o>> {

    /* renamed from: d */
    private static final String f4269d = C4568m.class.getCanonicalName();

    /* renamed from: e */
    public static final C4569a f4270e = new C4569a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private Exception f4271a;

    /* renamed from: b */
    private final HttpURLConnection f4272b;

    /* renamed from: c */
    private final C4570n f4273c;

    /* renamed from: com.facebook.m$a */
    /* compiled from: GraphRequestAsyncTask.kt */
    public static final class C4569a {
        private C4569a() {
        }

        public /* synthetic */ C4569a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C4568m(HttpURLConnection httpURLConnection, C4570n nVar) {
        C12775o.m28639i(nVar, "requests");
        this.f4272b = httpURLConnection;
        this.f4273c = nVar;
    }

    @VisibleForTesting(otherwise = 4)
    /* renamed from: a */
    public List<C4574o> mo31671a(Void... voidArr) {
        List<C4574o> m;
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            if (C9925a.m20734d(this)) {
                return null;
            }
            try {
                C12775o.m28639i(voidArr, "params");
                HttpURLConnection httpURLConnection = this.f4272b;
                if (httpURLConnection == null) {
                    m = this.f4273c.mo31699q();
                } else {
                    m = C4555l.f4241t.mo31647m(httpURLConnection, this.f4273c);
                }
                return m;
            } catch (Exception e) {
                this.f4271a = e;
                return null;
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
                return null;
            }
        } catch (Throwable th2) {
            C9925a.m20732b(th2, this);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo31672b(List<C4574o> list) {
        if (!C9925a.m20734d(this)) {
            try {
                if (!C9925a.m20734d(this)) {
                    C12775o.m28639i(list, "result");
                    super.onPostExecute(list);
                    Exception exc = this.f4271a;
                    if (exc != null) {
                        String str = f4269d;
                        C12770k0 k0Var = C12770k0.f20423a;
                        String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
                        C9138d0.m18626a0(str, format);
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            if (C9925a.m20734d(this)) {
                return null;
            }
            return mo31671a((Void[]) objArr);
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (!C9925a.m20734d(this)) {
            try {
                if (!C9925a.m20734d(this)) {
                    mo31672b((List) obj);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    @VisibleForTesting(otherwise = 4)
    public void onPreExecute() {
        Handler handler;
        if (!C9925a.m20734d(this)) {
            try {
                if (!C9925a.m20734d(this)) {
                    super.onPreExecute();
                    if (FacebookSdk.isDebugEnabled()) {
                        String str = f4269d;
                        C12770k0 k0Var = C12770k0.f20423a;
                        String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
                        C9138d0.m18626a0(str, format);
                    }
                    if (this.f4273c.mo31707z() == null) {
                        if (Thread.currentThread() instanceof HandlerThread) {
                            handler = new Handler();
                        } else {
                            handler = new Handler(Looper.getMainLooper());
                        }
                        this.f4273c.mo31687N(handler);
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask: " + " connection: " + this.f4272b + ", requests: " + this.f4273c + "}";
        C12775o.m28638h(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C4568m(C4570n nVar) {
        this((HttpURLConnection) null, nVar);
        C12775o.m28639i(nVar, "requests");
    }
}
