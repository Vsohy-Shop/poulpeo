package p382lc;

import android.os.AsyncTask;
import java.util.concurrent.RejectedExecutionException;
import p446vd.C13633n;

/* renamed from: lc.a */
/* compiled from: AndroidOsAsyncTaskWrapper */
public abstract class C12818a {

    /* renamed from: b */
    private static int f20483b = 128;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static int f20484c;

    /* renamed from: a */
    private AsyncTask<Void, Void, Boolean> f20485a;

    /* renamed from: lc.a$a */
    /* compiled from: AndroidOsAsyncTaskWrapper */
    class C12819a extends AsyncTask<Void, Void, Boolean> {
        C12819a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            return Boolean.valueOf(C12818a.this.mo46874d());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            C12818a.this.mo46875h(bool.booleanValue());
            C12818a.f20484c = C12818a.f20484c - 1;
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            super.onCancelled();
            C12818a.this.mo47088g();
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            C12818a.this.mo47089i();
        }
    }

    public C12818a() {
        m28768f();
    }

    /* renamed from: f */
    private void m28768f() {
        this.f20485a = new C12819a();
    }

    /* renamed from: c */
    public final boolean mo50710c(boolean z) {
        return this.f20485a.cancel(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo46874d();

    /* renamed from: e */
    public final C12818a mo50711e() {
        int i = f20484c + 1;
        f20484c = i;
        if (i < f20483b) {
            try {
                this.f20485a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } catch (RejectedExecutionException e) {
                C13633n.m31165u("AsyncTask Rejected at : " + f20484c, e);
                int i2 = f20484c;
                f20483b = i2 + -1;
                f20484c = i2 + -1;
            }
        } else {
            this.f20485a.execute(new Void[0]);
        }
        return this;
    }

    public boolean equals(Object obj) {
        return this.f20485a.equals(obj);
    }

    public int hashCode() {
        return this.f20485a.hashCode();
    }

    public String toString() {
        return this.f20485a.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo47088g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo47089i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo46875h(boolean z) {
    }
}
