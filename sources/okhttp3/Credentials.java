package okhttp3;

import androidx.autofill.HintConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.C12775o;
import okio.C13133f;

/* compiled from: Credentials.kt */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String str, String str2) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_USERNAME);
        C12775o.m28639i(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
        return basic$default(str, str2, (Charset) null, 4, (Object) null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            C12775o.m28638h(charset, "ISO_8859_1");
        }
        return basic(str, str2, charset);
    }

    public static final String basic(String str, String str2, Charset charset) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_USERNAME);
        C12775o.m28639i(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
        C12775o.m28639i(charset, "charset");
        return C12775o.m28647q("Basic ", C13133f.f20903e.mo52621c(str + ':' + str2, charset).mo52597a());
    }
}
