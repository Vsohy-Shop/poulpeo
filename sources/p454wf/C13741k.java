package p454wf;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p436tf.C13528f;

/* renamed from: wf.k */
/* compiled from: Regex.kt */
public final class C13741k {
    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C13731h m31451d(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new C13732i(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C13528f m31452e(MatchResult matchResult) {
        return C13537l.m30893t(matchResult.start(), matchResult.end());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C13528f m31453f(MatchResult matchResult, int i) {
        return C13537l.m30893t(matchResult.start(i), matchResult.end(i));
    }
}
