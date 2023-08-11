package p050c7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
import p025a7.C2217f;
import p222s6.C9511f;
import p255v6.C9972g;

/* renamed from: c7.a */
/* compiled from: CachedSettingsIo */
public class C3889a {

    /* renamed from: a */
    private final File f2975a;

    public C3889a(C2217f fVar) {
        this.f2975a = fVar.mo23553d("com.crashlytics.settings.json");
    }

    /* renamed from: a */
    private File m4379a() {
        return this.f2975a;
    }

    /* renamed from: b */
    public JSONObject mo29933b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C9511f.m19696f().mo43965b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File a = m4379a();
            if (a.exists()) {
                fileInputStream = new FileInputStream(a);
                try {
                    jSONObject = new JSONObject(C9972g.m20810A(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        C9511f.m19696f().mo43968e("Failed to fetch cached settings", e);
                        C9972g.m20815e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        C9972g.m20815e(fileInputStream, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                C9511f.m19696f().mo43971i("Settings file does not exist.");
                jSONObject = null;
            }
            C9972g.m20815e(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            C9511f.m19696f().mo43968e("Failed to fetch cached settings", e);
            C9972g.m20815e(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
            C9972g.m20815e(fileInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: c */
    public void mo29934c(long j, JSONObject jSONObject) {
        C9511f.m19696f().mo43971i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(m4379a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C9972g.m20815e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        C9511f.m19696f().mo43968e("Failed to cache settings", e);
                        C9972g.m20815e(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        C9972g.m20815e(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    C9972g.m20815e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C9511f.m19696f().mo43968e("Failed to cache settings", e);
                C9972g.m20815e(fileWriter, "Failed to close settings writer.");
            }
        }
    }
}
