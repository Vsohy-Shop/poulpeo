package p470zd;

import com.adjust.sdk.Constants;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: zd.i */
/* compiled from: Util */
public final class C14104i {

    /* renamed from: a */
    public static final byte[] f23171a = new byte[0];

    /* renamed from: b */
    public static final String[] f23172b = new String[0];

    /* renamed from: c */
    public static final Charset f23173c = Charset.forName(Constants.ENCODING);

    /* renamed from: a */
    public static <T> List<T> m32741a(T[] tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: b */
    private static <T> List<T> m32742b(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            int length = tArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                T t2 = tArr2[i];
                if (t.equals(t2)) {
                    arrayList.add(t2);
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static <T> T[] m32743c(Class<T> cls, T[] tArr, T[] tArr2) {
        List b = m32742b(tArr, tArr2);
        return b.toArray((Object[]) Array.newInstance(cls, b.size()));
    }
}
