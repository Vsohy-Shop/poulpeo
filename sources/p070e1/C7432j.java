package p070e1;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.C4368f;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p058d1.C7214a;
import p070e1.C7422d;
import p137k1.C8462g;
import p294z1.C10782c;
import p294z1.C10787f;

/* renamed from: e1.j */
/* compiled from: HttpUrlFetcher */
public class C7432j implements C7422d<InputStream> {
    @VisibleForTesting

    /* renamed from: h */
    static final C7434b f10275h = new C7433a();

    /* renamed from: b */
    private final C8462g f10276b;

    /* renamed from: c */
    private final int f10277c;

    /* renamed from: d */
    private final C7434b f10278d;

    /* renamed from: e */
    private HttpURLConnection f10279e;

    /* renamed from: f */
    private InputStream f10280f;

    /* renamed from: g */
    private volatile boolean f10281g;

    /* renamed from: e1.j$a */
    /* compiled from: HttpUrlFetcher */
    private static class C7433a implements C7434b {
        C7433a() {
        }

        /* renamed from: a */
        public HttpURLConnection mo41101a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: e1.j$b */
    /* compiled from: HttpUrlFetcher */
    interface C7434b {
        /* renamed from: a */
        HttpURLConnection mo41101a(URL url);
    }

    public C7432j(C8462g gVar, int i) {
        this(gVar, i, f10275h);
    }

    /* renamed from: c */
    private InputStream m14526c(HttpURLConnection httpURLConnection) {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f10280f = C10782c.m22924b(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            this.f10280f = httpURLConnection.getInputStream();
        }
        return this.f10280f;
    }

    /* renamed from: f */
    private static boolean m14527f(int i) {
        if (i / 100 == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m14528g(int i) {
        if (i / 100 == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private InputStream m14529h(URL url, int i, URL url2, Map<String, String> map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f10279e = this.f10278d.mo41101a(url);
            for (Map.Entry next : map.entrySet()) {
                this.f10279e.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            this.f10279e.setConnectTimeout(this.f10277c);
            this.f10279e.setReadTimeout(this.f10277c);
            this.f10279e.setUseCaches(false);
            this.f10279e.setDoInput(true);
            this.f10279e.setInstanceFollowRedirects(false);
            this.f10279e.connect();
            this.f10280f = this.f10279e.getInputStream();
            if (this.f10281g) {
                return null;
            }
            int responseCode = this.f10279e.getResponseCode();
            if (m14527f(responseCode)) {
                return m14526c(this.f10279e);
            }
            if (m14528g(responseCode)) {
                String headerField = this.f10279e.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    mo41074b();
                    return m14529h(url3, i + 1, url, map);
                }
                throw new HttpException("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new HttpException(responseCode);
            } else {
                throw new HttpException(this.f10279e.getResponseMessage(), responseCode);
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!");
        }
    }

    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo41069a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo41074b() {
        InputStream inputStream = this.f10280f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f10279e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f10279e = null;
    }

    public void cancel() {
        this.f10281g = true;
    }

    @NonNull
    /* renamed from: d */
    public C7214a mo41077d() {
        return C7214a.REMOTE;
    }

    /* renamed from: e */
    public void mo41078e(@NonNull C4368f fVar, @NonNull C7422d.C7423a<? super InputStream> aVar) {
        StringBuilder sb;
        long b = C10787f.m22932b();
        try {
            aVar.mo31271f(m14529h(this.f10276b.mo42488h(), 0, (URL) null, this.f10276b.mo42487e()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C10787f.m22931a(b));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            aVar.mo31269c(e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C10787f.m22931a(b));
            }
            throw th;
        }
    }

    @VisibleForTesting
    C7432j(C8462g gVar, int i, C7434b bVar) {
        this.f10276b = gVar;
        this.f10277c = i;
        this.f10278d = bVar;
    }
}
