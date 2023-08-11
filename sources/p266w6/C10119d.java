package p266w6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p025a7.C2217f;
import p222s6.C9511f;
import p255v6.C9972g;

/* renamed from: w6.d */
/* compiled from: MetaDataStore */
class C10119d {

    /* renamed from: b */
    private static final Charset f15287b = Charset.forName(Constants.ENCODING);

    /* renamed from: a */
    private final C2217f f15288a;

    public C10119d(C2217f fVar) {
        this.f15288a = fVar;
    }

    /* renamed from: d */
    private static Map<String, String> m21267d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m21269h(jSONObject, next));
        }
        return hashMap;
    }

    @Nullable
    /* renamed from: e */
    private String m21268e(String str) {
        return m21269h(new JSONObject(str), "userId");
    }

    /* renamed from: h */
    private static String m21269h(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    @NonNull
    /* renamed from: a */
    public File mo44707a(String str) {
        return this.f15288a.mo23562n(str, "internal-keys");
    }

    @NonNull
    /* renamed from: b */
    public File mo44708b(String str) {
        return this.f15288a.mo23562n(str, "keys");
    }

    @NonNull
    /* renamed from: c */
    public File mo44709c(String str) {
        return this.f15288a.mo23562n(str, "user-data");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Map<String, String> mo44710f(String str, boolean z) {
        File file;
        if (z) {
            file = mo44707a(str);
        } else {
            file = mo44708b(str);
        }
        if (!file.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                Map<String, String> d = m21267d(C9972g.m20810A(fileInputStream2));
                C9972g.m20815e(fileInputStream2, "Failed to close user metadata file.");
                return d;
            } catch (Exception e) {
                e = e;
                fileInputStream = fileInputStream2;
                try {
                    C9511f.m19696f().mo43968e("Error deserializing user metadata.", e);
                    C9972g.m20815e(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    C9972g.m20815e(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                C9972g.m20815e(fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C9511f.m19696f().mo43968e("Error deserializing user metadata.", e);
            C9972g.m20815e(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        }
    }

    @Nullable
    /* renamed from: g */
    public String mo44711g(String str) {
        FileInputStream fileInputStream;
        File c = mo44709c(str);
        FileInputStream fileInputStream2 = null;
        if (!c.exists()) {
            C9511f.m19696f().mo43965b("No userId set for session " + str);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(c);
            try {
                String e = m21268e(C9972g.m20810A(fileInputStream));
                C9511f.m19696f().mo43965b("Loaded userId " + e + " for session " + str);
                C9972g.m20815e(fileInputStream, "Failed to close user metadata file.");
                return e;
            } catch (Exception e2) {
                e = e2;
                try {
                    C9511f.m19696f().mo43968e("Error deserializing user metadata.", e);
                    C9972g.m20815e(fileInputStream, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    C9972g.m20815e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            C9511f.m19696f().mo43968e("Error deserializing user metadata.", e);
            C9972g.m20815e(fileInputStream, "Failed to close user metadata file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            C9972g.m20815e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
