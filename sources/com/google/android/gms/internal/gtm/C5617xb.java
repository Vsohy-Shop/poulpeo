package com.google.android.gms.internal.gtm;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.internal.gtm.xb */
final class C5617xb implements C5631yb {

    /* renamed from: a */
    private HttpURLConnection f6727a;

    /* renamed from: b */
    private InputStream f6728b = null;

    C5617xb() {
    }

    /* renamed from: a */
    public final InputStream mo33619a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
        httpURLConnection.setConnectTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
        this.f6727a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            this.f6728b = inputStream;
            return inputStream;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Bad response: ");
        sb.append(responseCode);
        String sb2 = sb.toString();
        if (responseCode == 404) {
            throw new FileNotFoundException(sb2);
        } else if (responseCode == 503) {
            throw new zznl(sb2);
        } else {
            throw new IOException(sb2);
        }
    }

    public final void close() {
        String str;
        HttpURLConnection httpURLConnection = this.f6727a;
        try {
            InputStream inputStream = this.f6728b;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "HttpUrlConnectionNetworkClient: Error when closing http input stream: ".concat(valueOf);
            } else {
                str = new String("HttpUrlConnectionNetworkClient: Error when closing http input stream: ");
            }
            C5426l3.m8132b(str, e);
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
