package p128j2;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.adjust.sdk.Constants;
import com.facebook.FacebookSdk;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONObject;
import p251v2.C9925a;
import p454wf.C13726d;
import p454wf.C13735j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: j2.g */
/* compiled from: Utils.kt */
public final class C8354g {

    /* renamed from: a */
    public static final C8354g f11786a = new C8354g();

    private C8354g() {
    }

    /* renamed from: a */
    public static final File m16609a() {
        Class<C8354g> cls = C8354g.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            File file = new File(FacebookSdk.getApplicationContext().getFilesDir(), "facebook_ml/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static final Map<String, C8338a> m16610c(File file) {
        int i;
        File file2 = file;
        Class<C8354g> cls = C8354g.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(file2, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                int available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (available < 4) {
                    return null;
                }
                int i2 = 0;
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                C12775o.m28638h(wrap, "bb");
                int i3 = wrap.getInt();
                int i4 = i3 + 4;
                if (available < i4) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i3, C13726d.f22152b));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                for (int i5 = 0; i5 < length; i5++) {
                    strArr[i5] = names.getString(i5);
                }
                C12708o.m28359z(strArr);
                HashMap hashMap = new HashMap();
                int i6 = 0;
                while (i6 < length) {
                    String str = strArr[i6];
                    if (str == null) {
                        i = i2;
                    } else {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i7 = 1;
                        while (i2 < length2) {
                            int i8 = jSONArray.getInt(i2);
                            iArr[i2] = i8;
                            i7 *= i8;
                            i2++;
                        }
                        int i9 = i7 * 4;
                        int i10 = i4 + i9;
                        if (i10 > available) {
                            return null;
                        }
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i4, i9);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        C8338a aVar = new C8338a(iArr);
                        i = 0;
                        wrap2.asFloatBuffer().get(aVar.mo42289a(), 0, i7);
                        hashMap.put(str, aVar);
                        i4 = i10;
                    }
                    i6++;
                    i2 = i;
                }
                return hashMap;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public final String mo42312b(String str) {
        int i;
        boolean z;
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            C12775o.m28639i(str, "str");
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                if (i2 > length) {
                    break;
                }
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (C12775o.m28641k(str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            Object[] array = new C13735j("\\s+").mo53415h(str.subSequence(i2, length + 1).toString(), 0).toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(" ", (String[]) array);
                C12775o.m28638h(join, "TextUtils.join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public final int[] mo42313d(String str, int i) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            C12775o.m28639i(str, "texts");
            int[] iArr = new int[i];
            String b = mo42312b(str);
            Charset forName = Charset.forName(Constants.ENCODING);
            C12775o.m28638h(forName, "Charset.forName(\"UTF-8\")");
            if (b != null) {
                byte[] bytes = b.getBytes(forName);
                C12775o.m28638h(bytes, "(this as java.lang.String).getBytes(charset)");
                for (int i2 = 0; i2 < i; i2++) {
                    if (i2 < bytes.length) {
                        iArr[i2] = bytes[i2] & 255;
                    } else {
                        iArr[i2] = 0;
                    }
                }
                return iArr;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }
}
