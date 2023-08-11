package p058d1;

import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: d1.e */
/* compiled from: Key */
public interface C7218e {

    /* renamed from: a */
    public static final Charset f9912a = Charset.forName(Constants.ENCODING);

    /* renamed from: a */
    void mo31272a(@NonNull MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
