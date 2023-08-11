package p446vd;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: vd.p */
/* compiled from: SecuredStorageManager */
public class C13635p {

    /* renamed from: b */
    private static volatile C13635p f21952b;

    /* renamed from: c */
    private static final Charset f21953c = StandardCharsets.UTF_8;
    @NonNull

    /* renamed from: a */
    private ContextContainer f21954a;

    private C13635p(@NonNull ContextContainer contextContainer) {
        this.f21954a = contextContainer;
    }

    /* renamed from: a */
    private String m31170a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new String(m31171b(Base64.decode(str, 2)), f21953c);
        } catch (Exception e) {
            C13633n.m31151g(this, e);
            return null;
        }
    }

    /* renamed from: b */
    private byte[] m31171b(byte[] bArr) {
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, new SecretKeySpec(m31175f(), "AES"), new IvParameterSpec(copyOfRange));
        return instance.doFinal(copyOfRange2);
    }

    /* renamed from: c */
    private String m31172c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Base64.encodeToString(m31173d(str.getBytes(f21953c)), 2);
        } catch (Exception e) {
            C13633n.m31151g(this, e);
            return null;
        }
    }

    /* renamed from: d */
    private byte[] m31173d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        new SecureRandom().nextBytes(bArr2);
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, new SecretKeySpec(m31175f(), "AES"), new IvParameterSpec(bArr2));
        byte[] doFinal = instance.doFinal(bArr);
        byte[] bArr3 = new byte[(doFinal.length + 16)];
        System.arraycopy(bArr2, 0, bArr3, 0, 16);
        System.arraycopy(doFinal, 0, bArr3, 16, doFinal.length);
        return bArr3;
    }

    /* renamed from: e */
    private void m31174e(byte[] bArr, int i) {
        int i2 = i + 1;
        if (i2 < bArr.length) {
            bArr[i2] = (byte) (bArr[i] + (i2 * 1081));
            m31174e(bArr, i2);
        }
    }

    /* renamed from: f */
    private byte[] m31175f() {
        byte[] bArr = new byte[32];
        bArr[0] = 42;
        m31174e(bArr, 0);
        return bArr;
    }

    /* renamed from: g */
    public static C13635p m31176g(@NonNull ContextContainer contextContainer) {
        if (f21952b == null) {
            synchronized (C13635p.class) {
                if (f21952b == null) {
                    f21952b = new C13635p(contextContainer);
                }
            }
        } else {
            f21952b.f21954a = contextContainer;
        }
        return f21952b;
    }

    /* renamed from: h */
    private SharedPreferences m31177h() {
        return PreferenceManager.getDefaultSharedPreferences(this.f21954a.mo47843a());
    }

    /* renamed from: i */
    public void mo53289i(String str) {
        if (str != null) {
            m31177h().edit().remove(str).apply();
        }
    }

    /* renamed from: j */
    public String mo53290j(String str) {
        if (str == null) {
            return null;
        }
        return m31170a(m31177h().getString(str, (String) null));
    }

    /* renamed from: k */
    public void mo53291k(String str, String str2) {
        String c;
        if (str != null && (c = m31172c(str2)) != null) {
            m31177h().edit().putString(str, c).apply();
        }
    }
}
