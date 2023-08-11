package p144k8;

import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.google.firebase.C6922c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: k8.c */
/* compiled from: PersistedInstallation */
public class C8589c {

    /* renamed from: a */
    private final File f12272a;
    @NonNull

    /* renamed from: b */
    private final C6922c f12273b;

    /* renamed from: k8.c$a */
    /* compiled from: PersistedInstallation */
    public enum C8590a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C8589c(@NonNull C6922c cVar) {
        File filesDir = cVar.mo39766h().getFilesDir();
        this.f12272a = new File(filesDir, "PersistedInstallation." + cVar.mo39770l() + ".json");
        this.f12273b = cVar;
    }

    /* renamed from: b */
    private JSONObject m17254b() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(this.f12272a);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @NonNull
    /* renamed from: a */
    public C8591d mo42667a(@NonNull C8591d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.mo42648d());
            jSONObject.put("Status", dVar.mo42652g().ordinal());
            jSONObject.put("AuthToken", dVar.mo42646b());
            jSONObject.put("RefreshToken", dVar.mo42651f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.mo42653h());
            jSONObject.put("ExpiresInSecs", dVar.mo42647c());
            jSONObject.put("FisError", dVar.mo42649e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f12273b.mo39766h().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(Constants.ENCODING));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.f12272a)) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    @NonNull
    /* renamed from: c */
    public C8591d mo42668c() {
        JSONObject b = m17254b();
        String optString = b.optString("Fid", (String) null);
        int optInt = b.optInt("Status", C8590a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = b.optString("AuthToken", (String) null);
        String optString3 = b.optString("RefreshToken", (String) null);
        long optLong = b.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = b.optLong("ExpiresInSecs", 0);
        return C8591d.m17257a().mo42660d(optString).mo42663g(C8590a.values()[optInt]).mo42658b(optString2).mo42662f(optString3).mo42664h(optLong).mo42659c(optLong2).mo42661e(b.optString("FisError", (String) null)).mo42657a();
    }
}
