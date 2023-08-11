package p198q2;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.appboy.Constants;
import com.facebook.C4509a;
import com.facebook.C4550k;
import com.facebook.C4555l;
import com.facebook.C4574o;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import p021a3.C2190s;
import p178o2.C8952a;
import p178o2.C8955d;
import p178o2.C8956e;
import p251v2.C9925a;

/* renamed from: q2.f0 */
/* compiled from: WebDialog */
public class C9146f0 extends Dialog {

    /* renamed from: n */
    private static final int f13350n = C8956e.f13006a;

    /* renamed from: o */
    private static volatile int f13351o;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f13352b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f13353c;

    /* renamed from: d */
    private C9154h f13354d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WebView f13355e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ProgressDialog f13356f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ImageView f13357g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public FrameLayout f13358h;

    /* renamed from: i */
    private C9155i f13359i;

    /* renamed from: j */
    private boolean f13360j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f13361k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f13362l;

    /* renamed from: m */
    private WindowManager.LayoutParams f13363m;

    /* renamed from: q2.f0$a */
    /* compiled from: WebDialog */
    class C9147a implements DialogInterface.OnCancelListener {
        C9147a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C9146f0.this.cancel();
        }
    }

    /* renamed from: q2.f0$b */
    /* compiled from: WebDialog */
    class C9148b implements View.OnClickListener {
        C9148b() {
        }

        public void onClick(View view) {
            if (!C9925a.m20734d(this)) {
                try {
                    C9146f0.this.cancel();
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: q2.f0$c */
    /* compiled from: WebDialog */
    class C9149c extends WebView {
        C9149c(Context context) {
            super(context);
        }

        public void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: q2.f0$d */
    /* compiled from: WebDialog */
    class C9150d implements View.OnTouchListener {
        C9150d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* renamed from: q2.f0$e */
    /* compiled from: WebDialog */
    static /* synthetic */ class C9151e {

        /* renamed from: a */
        static final /* synthetic */ int[] f13368a;

        static {
            int[] iArr = new int[C2190s.values().length];
            f13368a = iArr;
            try {
                iArr[C2190s.INSTAGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: q2.f0$g */
    /* compiled from: WebDialog */
    private class C9153g extends WebViewClient {
        private C9153g() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!C9146f0.this.f13361k) {
                C9146f0.this.f13356f.dismiss();
            }
            C9146f0.this.f13358h.setBackgroundColor(0);
            C9146f0.this.f13355e.setVisibility(0);
            C9146f0.this.f13357g.setVisibility(0);
            boolean unused = C9146f0.this.f13362l = true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C9138d0.m18626a0("FacebookSDK.WebDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
            if (!C9146f0.this.f13361k) {
                C9146f0.this.f13356f.show();
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C9146f0.this.mo43415u(new FacebookDialogException(str, i, str2));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            C9146f0.this.mo43415u(new FacebookDialogException((String) null, -11, (String) null));
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Redirect URL: "
                r6.append(r0)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "FacebookSDK.WebDialog"
                p198q2.C9138d0.m18626a0(r0, r6)
                android.net.Uri r6 = android.net.Uri.parse(r7)
                java.lang.String r0 = r6.getPath()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0030
                java.lang.String r0 = "^/(v\\d+\\.\\d+/)??dialog/.*"
                java.lang.String r6 = r6.getPath()
                boolean r6 = java.util.regex.Pattern.matches(r0, r6)
                if (r6 == 0) goto L_0x0030
                r6 = r2
                goto L_0x0031
            L_0x0030:
                r6 = r1
            L_0x0031:
                q2.f0 r0 = p198q2.C9146f0.this
                java.lang.String r0 = r0.f13353c
                boolean r0 = r7.startsWith(r0)
                if (r0 == 0) goto L_0x00c0
                q2.f0 r6 = p198q2.C9146f0.this
                android.os.Bundle r6 = r6.mo43413s(r7)
                java.lang.String r7 = "error"
                java.lang.String r7 = r6.getString(r7)
                if (r7 != 0) goto L_0x0051
                java.lang.String r7 = "error_type"
                java.lang.String r7 = r6.getString(r7)
            L_0x0051:
                java.lang.String r0 = "error_msg"
                java.lang.String r0 = r6.getString(r0)
                if (r0 != 0) goto L_0x005f
                java.lang.String r0 = "error_message"
                java.lang.String r0 = r6.getString(r0)
            L_0x005f:
                if (r0 != 0) goto L_0x0067
                java.lang.String r0 = "error_description"
                java.lang.String r0 = r6.getString(r0)
            L_0x0067:
                java.lang.String r1 = "error_code"
                java.lang.String r1 = r6.getString(r1)
                boolean r3 = p198q2.C9138d0.m18618T(r1)
                r4 = -1
                if (r3 != 0) goto L_0x0079
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0079 }
                goto L_0x007a
            L_0x0079:
                r1 = r4
            L_0x007a:
                boolean r3 = p198q2.C9138d0.m18618T(r7)
                if (r3 == 0) goto L_0x008e
                boolean r3 = p198q2.C9138d0.m18618T(r0)
                if (r3 == 0) goto L_0x008e
                if (r1 != r4) goto L_0x008e
                q2.f0 r7 = p198q2.C9146f0.this
                r7.mo43416v(r6)
                goto L_0x00bf
            L_0x008e:
                if (r7 == 0) goto L_0x00a6
                java.lang.String r6 = "access_denied"
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L_0x00a0
                java.lang.String r6 = "OAuthAccessDeniedException"
                boolean r6 = r7.equals(r6)
                if (r6 == 0) goto L_0x00a6
            L_0x00a0:
                q2.f0 r6 = p198q2.C9146f0.this
                r6.cancel()
                goto L_0x00bf
            L_0x00a6:
                r6 = 4201(0x1069, float:5.887E-42)
                if (r1 != r6) goto L_0x00b0
                q2.f0 r6 = p198q2.C9146f0.this
                r6.cancel()
                goto L_0x00bf
            L_0x00b0:
                com.facebook.k r6 = new com.facebook.k
                r6.<init>(r1, r7, r0)
                q2.f0 r7 = p198q2.C9146f0.this
                com.facebook.FacebookServiceException r1 = new com.facebook.FacebookServiceException
                r1.<init>(r6, r0)
                r7.mo43415u(r1)
            L_0x00bf:
                return r2
            L_0x00c0:
                java.lang.String r0 = "fbconnect://cancel"
                boolean r0 = r7.startsWith(r0)
                if (r0 == 0) goto L_0x00ce
                q2.f0 r6 = p198q2.C9146f0.this
                r6.cancel()
                return r2
            L_0x00ce:
                if (r6 != 0) goto L_0x00ee
                java.lang.String r6 = "touch"
                boolean r6 = r7.contains(r6)
                if (r6 == 0) goto L_0x00d9
                goto L_0x00ee
            L_0x00d9:
                q2.f0 r6 = p198q2.C9146f0.this     // Catch:{ ActivityNotFoundException -> 0x00ee }
                android.content.Context r6 = r6.getContext()     // Catch:{ ActivityNotFoundException -> 0x00ee }
                android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00ee }
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x00ee }
                r0.<init>(r3, r7)     // Catch:{ ActivityNotFoundException -> 0x00ee }
                r6.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x00ee }
                return r2
            L_0x00ee:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p198q2.C9146f0.C9153g.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }

        /* synthetic */ C9153g(C9146f0 f0Var, C9147a aVar) {
            this();
        }
    }

    /* renamed from: q2.f0$h */
    /* compiled from: WebDialog */
    public interface C9154h {
        /* renamed from: a */
        void mo23483a(Bundle bundle, FacebookException facebookException);
    }

    /* renamed from: q2.f0$i */
    /* compiled from: WebDialog */
    private class C9155i extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a */
        private String f13377a;

        /* renamed from: b */
        private Bundle f13378b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Exception[] f13379c;

        /* renamed from: q2.f0$i$a */
        /* compiled from: WebDialog */
        class C9156a implements C4555l.C4557b {

            /* renamed from: a */
            final /* synthetic */ String[] f13381a;

            /* renamed from: b */
            final /* synthetic */ int f13382b;

            /* renamed from: c */
            final /* synthetic */ CountDownLatch f13383c;

            C9156a(String[] strArr, int i, CountDownLatch countDownLatch) {
                this.f13381a = strArr;
                this.f13382b = i;
                this.f13383c = countDownLatch;
            }

            public void onCompleted(C4574o oVar) {
                try {
                    C4550k b = oVar.mo31709b();
                    String str = "Error staging photo.";
                    if (b != null) {
                        String c = b.mo31597c();
                        if (c != null) {
                            str = c;
                        }
                        throw new FacebookGraphResponseException(oVar, str);
                    }
                    JSONObject c2 = oVar.mo31710c();
                    if (c2 != null) {
                        String optString = c2.optString(Constants.APPBOY_PUSH_DEEP_LINK_KEY);
                        if (optString != null) {
                            this.f13381a[this.f13382b] = optString;
                            this.f13383c.countDown();
                            return;
                        }
                        throw new FacebookException(str);
                    }
                    throw new FacebookException(str);
                } catch (Exception e) {
                    C9155i.this.f13379c[this.f13382b] = e;
                }
            }
        }

        C9155i(String str, Bundle bundle) {
            this.f13377a = str;
            this.f13378b = bundle;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|(2:28|26)|38|29) */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r10 = r3.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
            if (r10.hasNext() != false) goto L_0x007e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
            ((android.os.AsyncTask) r10.next()).cancel(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
            return null;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0074 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String[] mo43434b(java.lang.Void... r10) {
            /*
                r9 = this;
                boolean r10 = p251v2.C9925a.m20734d(r9)
                r0 = 0
                if (r10 == 0) goto L_0x0008
                return r0
            L_0x0008:
                android.os.Bundle r10 = r9.f13378b     // Catch:{ all -> 0x0089 }
                java.lang.String r1 = "media"
                java.lang.String[] r10 = r10.getStringArray(r1)     // Catch:{ all -> 0x0089 }
                int r1 = r10.length     // Catch:{ all -> 0x0089 }
                java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0089 }
                int r2 = r10.length     // Catch:{ all -> 0x0089 }
                java.lang.Exception[] r2 = new java.lang.Exception[r2]     // Catch:{ all -> 0x0089 }
                r9.f13379c = r2     // Catch:{ all -> 0x0089 }
                java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0089 }
                int r3 = r10.length     // Catch:{ all -> 0x0089 }
                r2.<init>(r3)     // Catch:{ all -> 0x0089 }
                java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch:{ all -> 0x0089 }
                r3.<init>()     // Catch:{ all -> 0x0089 }
                com.facebook.a r4 = com.facebook.C4509a.m5515d()     // Catch:{ all -> 0x0089 }
                r5 = 0
            L_0x0028:
                r6 = 1
                int r7 = r10.length     // Catch:{ Exception -> 0x0074 }
                if (r5 >= r7) goto L_0x0070
                boolean r7 = r9.isCancelled()     // Catch:{ Exception -> 0x0074 }
                if (r7 == 0) goto L_0x0047
                java.util.Iterator r10 = r3.iterator()     // Catch:{ Exception -> 0x0074 }
            L_0x0036:
                boolean r1 = r10.hasNext()     // Catch:{ Exception -> 0x0074 }
                if (r1 == 0) goto L_0x0046
                java.lang.Object r1 = r10.next()     // Catch:{ Exception -> 0x0074 }
                android.os.AsyncTask r1 = (android.os.AsyncTask) r1     // Catch:{ Exception -> 0x0074 }
                r1.cancel(r6)     // Catch:{ Exception -> 0x0074 }
                goto L_0x0036
            L_0x0046:
                return r0
            L_0x0047:
                r7 = r10[r5]     // Catch:{ Exception -> 0x0074 }
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x0074 }
                boolean r8 = p198q2.C9138d0.m18620V(r7)     // Catch:{ Exception -> 0x0074 }
                if (r8 == 0) goto L_0x005d
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0074 }
                r1[r5] = r7     // Catch:{ Exception -> 0x0074 }
                r2.countDown()     // Catch:{ Exception -> 0x0074 }
                goto L_0x006d
            L_0x005d:
                q2.f0$i$a r8 = new q2.f0$i$a     // Catch:{ Exception -> 0x0074 }
                r8.<init>(r1, r5, r2)     // Catch:{ Exception -> 0x0074 }
                com.facebook.l r7 = p060d3.C7260c.m14086b(r4, r7, r8)     // Catch:{ Exception -> 0x0074 }
                com.facebook.m r7 = r7.mo31621j()     // Catch:{ Exception -> 0x0074 }
                r3.add(r7)     // Catch:{ Exception -> 0x0074 }
            L_0x006d:
                int r5 = r5 + 1
                goto L_0x0028
            L_0x0070:
                r2.await()     // Catch:{ Exception -> 0x0074 }
                return r1
            L_0x0074:
                java.util.Iterator r10 = r3.iterator()     // Catch:{ all -> 0x0089 }
            L_0x0078:
                boolean r1 = r10.hasNext()     // Catch:{ all -> 0x0089 }
                if (r1 == 0) goto L_0x0088
                java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x0089 }
                android.os.AsyncTask r1 = (android.os.AsyncTask) r1     // Catch:{ all -> 0x0089 }
                r1.cancel(r6)     // Catch:{ all -> 0x0089 }
                goto L_0x0078
            L_0x0088:
                return r0
            L_0x0089:
                r10 = move-exception
                p251v2.C9925a.m20732b(r10, r9)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p198q2.C9146f0.C9155i.mo43434b(java.lang.Void[]):java.lang.String[]");
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo43435c(String[] strArr) {
            if (!C9925a.m20734d(this)) {
                try {
                    C9146f0.this.f13356f.dismiss();
                    for (Exception exc : this.f13379c) {
                        if (exc != null) {
                            C9146f0.this.mo43415u(exc);
                            return;
                        }
                    }
                    if (strArr == null) {
                        C9146f0.this.mo43415u(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    List asList = Arrays.asList(strArr);
                    if (asList.contains((Object) null)) {
                        C9146f0.this.mo43415u(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    C9138d0.m18638g0(this.f13378b, "media", new JSONArray(asList));
                    String unused = C9146f0.this.f13352b = C9138d0.m18631d(C9212z.m18909b(), FacebookSdk.getGraphApiVersion() + "/" + "dialog/" + this.f13377a, this.f13378b).toString();
                    C9146f0.this.m18712y((C9146f0.this.f13357g.getDrawable().getIntrinsicWidth() / 2) + 1);
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            if (C9925a.m20734d(this)) {
                return null;
            }
            try {
                return mo43434b((Void[]) objArr);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            if (!C9925a.m20734d(this)) {
                try {
                    mo43435c((String[]) obj);
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    protected C9146f0(Context context, String str) {
        this(context, str, m18708l());
    }

    /* renamed from: j */
    private void m18706j() {
        ImageView imageView = new ImageView(getContext());
        this.f13357g = imageView;
        imageView.setOnClickListener(new C9148b());
        this.f13357g.setImageDrawable(getContext().getResources().getDrawable(C8952a.f12988a));
        this.f13357g.setVisibility(4);
    }

    /* renamed from: k */
    private int m18707k(int i, float f, int i2, int i3) {
        double d;
        int i4 = (int) (((float) i) / f);
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 >= i3) {
            d = 0.5d;
        } else {
            d = ((((double) (i3 - i4)) / ((double) (i3 - i2))) * 0.5d) + 0.5d;
        }
        return (int) (((double) i) * d);
    }

    /* renamed from: l */
    public static int m18708l() {
        C9144e0.m18693l();
        return f13351o;
    }

    /* renamed from: n */
    protected static void m18709n(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null && f13351o == 0) {
                    m18713z(applicationInfo.metaData.getInt(FacebookSdk.WEB_DIALOG_THEME));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: q */
    public static C9146f0 m18710q(Context context, String str, Bundle bundle, int i, C2190s sVar, C9154h hVar) {
        m18709n(context);
        return new C9146f0(context, str, bundle, i, sVar, hVar);
    }

    /* renamed from: r */
    public static C9146f0 m18711r(Context context, String str, Bundle bundle, int i, C9154h hVar) {
        m18709n(context);
        return new C9146f0(context, str, bundle, i, C2190s.FACEBOOK, hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m18712y(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        C9149c cVar = new C9149c(getContext());
        this.f13355e = cVar;
        cVar.setVerticalScrollBarEnabled(false);
        this.f13355e.setHorizontalScrollBarEnabled(false);
        this.f13355e.setWebViewClient(new C9153g(this, (C9147a) null));
        this.f13355e.getSettings().setJavaScriptEnabled(true);
        this.f13355e.loadUrl(this.f13352b);
        this.f13355e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f13355e.setVisibility(4);
        this.f13355e.getSettings().setSavePassword(false);
        this.f13355e.getSettings().setSaveFormData(false);
        this.f13355e.setFocusable(true);
        this.f13355e.setFocusableInTouchMode(true);
        this.f13355e.setOnTouchListener(new C9150d());
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f13355e);
        linearLayout.setBackgroundColor(-872415232);
        this.f13358h.addView(linearLayout);
    }

    /* renamed from: z */
    public static void m18713z(int i) {
        if (i == 0) {
            i = f13350n;
        }
        f13351o = i;
    }

    public void cancel() {
        if (this.f13354d != null && !this.f13360j) {
            mo43415u(new FacebookOperationCanceledException());
        }
    }

    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f13355e;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f13361k && (progressDialog = this.f13356f) != null && progressDialog.isShowing()) {
            this.f13356f.dismiss();
        }
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public WebView mo43403m() {
        return this.f13355e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo43404o() {
        return this.f13360j;
    }

    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        this.f13361k = false;
        if (C9138d0.m18634e0(getContext()) && (layoutParams = this.f13363m) != null && layoutParams.token == null) {
            layoutParams.token = getOwnerActivity().getWindow().getAttributes().token;
            C9138d0.m18626a0("FacebookSDK.WebDialog", "Set token on onAttachedToWindow(): " + this.f13363m.token);
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f13356f = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f13356f.setMessage(getContext().getString(C8955d.f13002d));
        this.f13356f.setCanceledOnTouchOutside(false);
        this.f13356f.setOnCancelListener(new C9147a());
        requestWindowFeature(1);
        this.f13358h = new FrameLayout(getContext());
        mo43414t();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        m18706j();
        if (this.f13352b != null) {
            m18712y((this.f13357g.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.f13358h.addView(this.f13357g, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.f13358h);
    }

    public void onDetachedFromWindow() {
        this.f13361k = true;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            WebView webView = this.f13355e;
            if (webView == null || !webView.canGoBack()) {
                cancel();
            } else {
                this.f13355e.goBack();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C9155i iVar = this.f13359i;
        if (iVar == null || iVar.getStatus() != AsyncTask.Status.PENDING) {
            mo43414t();
            return;
        }
        this.f13359i.execute(new Void[0]);
        this.f13356f.show();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C9155i iVar = this.f13359i;
        if (iVar != null) {
            iVar.cancel(true);
            this.f13356f.dismiss();
        }
        super.onStop();
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.f13363m = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo43412p() {
        return this.f13362l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public Bundle mo43413s(String str) {
        Uri parse = Uri.parse(str);
        Bundle f0 = C9138d0.m18636f0(parse.getQuery());
        f0.putAll(C9138d0.m18636f0(parse.getFragment()));
        return f0;
    }

    /* renamed from: t */
    public void mo43414t() {
        int i;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        if (i2 < i3) {
            i = i2;
        } else {
            i = i3;
        }
        if (i2 < i3) {
            i2 = i3;
        }
        getWindow().setLayout(Math.min(m18707k(i, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(m18707k(i2, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo43415u(Throwable th) {
        FacebookException facebookException;
        if (this.f13354d != null && !this.f13360j) {
            this.f13360j = true;
            if (th instanceof FacebookException) {
                facebookException = (FacebookException) th;
            } else {
                facebookException = new FacebookException(th);
            }
            this.f13354d.mo23483a((Bundle) null, facebookException);
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo43416v(Bundle bundle) {
        C9154h hVar = this.f13354d;
        if (hVar != null && !this.f13360j) {
            this.f13360j = true;
            hVar.mo23483a(bundle, (FacebookException) null);
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo43417w(String str) {
        this.f13353c = str;
    }

    /* renamed from: x */
    public void mo43418x(C9154h hVar) {
        this.f13354d = hVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C9146f0(Context context, String str, int i) {
        super(context, i == 0 ? m18708l() : i);
        this.f13353c = "fbconnect://success";
        this.f13360j = false;
        this.f13361k = false;
        this.f13362l = false;
        this.f13352b = str;
    }

    /* renamed from: q2.f0$f */
    /* compiled from: WebDialog */
    public static class C9152f {

        /* renamed from: a */
        private Context f13369a;

        /* renamed from: b */
        private String f13370b;

        /* renamed from: c */
        private String f13371c;

        /* renamed from: d */
        private int f13372d;

        /* renamed from: e */
        private C9154h f13373e;

        /* renamed from: f */
        private Bundle f13374f;

        /* renamed from: g */
        private C4509a f13375g;

        public C9152f(Context context, String str, Bundle bundle) {
            this.f13375g = C4509a.m5515d();
            if (!C4509a.m5516p()) {
                String B = C9138d0.m18600B(context);
                if (B != null) {
                    this.f13370b = B;
                } else {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            m18723b(context, str, bundle);
        }

        /* renamed from: b */
        private void m18723b(Context context, String str, Bundle bundle) {
            this.f13369a = context;
            this.f13371c = str;
            if (bundle != null) {
                this.f13374f = bundle;
            } else {
                this.f13374f = new Bundle();
            }
        }

        /* renamed from: a */
        public C9146f0 mo23488a() {
            C4509a aVar = this.f13375g;
            if (aVar != null) {
                this.f13374f.putString("app_id", aVar.mo31488c());
                this.f13374f.putString("access_token", this.f13375g.mo31500n());
            } else {
                this.f13374f.putString("app_id", this.f13370b);
            }
            return C9146f0.m18711r(this.f13369a, this.f13371c, this.f13374f, this.f13372d, this.f13373e);
        }

        /* renamed from: c */
        public String mo43423c() {
            return this.f13370b;
        }

        /* renamed from: d */
        public Context mo43424d() {
            return this.f13369a;
        }

        /* renamed from: e */
        public C9154h mo43425e() {
            return this.f13373e;
        }

        /* renamed from: f */
        public Bundle mo43426f() {
            return this.f13374f;
        }

        /* renamed from: g */
        public int mo43427g() {
            return this.f13372d;
        }

        /* renamed from: h */
        public C9152f mo43428h(C9154h hVar) {
            this.f13373e = hVar;
            return this;
        }

        public C9152f(Context context, String str, String str2, Bundle bundle) {
            str = str == null ? C9138d0.m18600B(context) : str;
            C9144e0.m18692k(str, "applicationId");
            this.f13370b = str;
            m18723b(context, str2, bundle);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C9146f0(Context context, String str, Bundle bundle, int i, C2190s sVar, C9154h hVar) {
        super(context, i == 0 ? m18708l() : i);
        Uri uri;
        String str2 = "fbconnect://success";
        this.f13353c = str2;
        this.f13360j = false;
        this.f13361k = false;
        this.f13362l = false;
        bundle = bundle == null ? new Bundle() : bundle;
        str2 = C9138d0.m18613O(context) ? "fbconnect://chrome_os_success" : str2;
        this.f13353c = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", FacebookSdk.getApplicationId());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{FacebookSdk.getSdkVersion()}));
        this.f13354d = hVar;
        if (!str.equals("share") || !bundle.containsKey("media")) {
            if (C9151e.f13368a[sVar.ordinal()] != 1) {
                String b = C9212z.m18909b();
                uri = C9138d0.m18631d(b, FacebookSdk.getGraphApiVersion() + "/" + "dialog/" + str, bundle);
            } else {
                uri = C9138d0.m18631d(C9212z.m18917j(), "oauth/authorize", bundle);
            }
            this.f13352b = uri.toString();
            return;
        }
        this.f13359i = new C9155i(str, bundle);
    }
}
