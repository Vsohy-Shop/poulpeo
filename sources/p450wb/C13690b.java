package p450wb;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.poulpeo.R;
import com.rmn.utils.TypefaceSpan;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C12775o;
import p336ef.C11906l;
import p336ef.C11915r;

@StabilityInferred(parameters = 0)
/* renamed from: wb.b */
/* compiled from: SpanUtils.kt */
public final class C13690b {

    /* renamed from: a */
    public static final C13690b f22034a = new C13690b();

    private C13690b() {
    }

    /* renamed from: a */
    private final SpannableStringBuilder m31340a(Context context, String str, String str2, String str3, CharacterStyle characterStyle) {
        SpannableStringBuilder b = m31341b(str2, C12723v.m28509d(C11915r.m25707a(str, characterStyle)));
        m31342c(str2, b, mo53347e(context, str3));
        return b;
    }

    /* renamed from: b */
    private final SpannableStringBuilder m31341b(String str, Collection<? extends C11906l<String, ? extends CharacterStyle>> collection) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        f22034a.m31342c(str, spannableStringBuilder, collection);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    private final void m31342c(String str, SpannableStringBuilder spannableStringBuilder, Collection<? extends C11906l<String, ? extends CharacterStyle>> collection) {
        for (C11906l lVar : collection) {
            String str2 = (String) lVar.mo49111c();
            int b0 = C13755w.m31576b0(str, str2, 0, false, 6, (Object) null);
            spannableStringBuilder.setSpan((CharacterStyle) lVar.mo49112d(), b0, str2.length() + b0, 33);
        }
    }

    /* renamed from: d */
    public final void mo53346d(Context context, String str, TextView textView, String str2, String str3, CharacterStyle characterStyle) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "fullText");
        C12775o.m28639i(textView, "textView");
        C12775o.m28639i(str2, "textCashback");
        C12775o.m28639i(str3, "textLastCashback");
        C12775o.m28639i(characterStyle, "styleForCashback");
        textView.setText(m31340a(context, str2, str, str3, characterStyle));
    }

    /* renamed from: e */
    public final Collection<C11906l<String, CharacterStyle>> mo53347e(Context context, String str) {
        C12775o.m28639i(context, "context");
        if (TextUtils.isEmpty(str)) {
            return C12726w.m28524k();
        }
        C12775o.m28636f(str);
        return C12726w.m28527n(C11915r.m25707a(str, new AbsoluteSizeSpan(12, true)), C11915r.m25707a(str, new StrikethroughSpan()));
    }

    /* renamed from: f */
    public final Collection<C11906l<String, CharacterStyle>> mo53348f(Context context, String str, Integer num, Integer num2) {
        C12775o.m28639i(context, "context");
        if (TextUtils.isEmpty(str)) {
            return C12726w.m28524k();
        }
        C12775o.m28636f(str);
        Typeface create = Typeface.create(ResourcesCompat.getFont(context, R.font.permanentmarker), 0);
        C12775o.m28638h(create, "create(ResourcesCompat.g…marker), Typeface.NORMAL)");
        List q = C12726w.m28530q(C11915r.m25707a(str, new TypefaceSpan(create)));
        if (num != null) {
            q.add(C11915r.m25707a(str, new AbsoluteSizeSpan(num.intValue(), true)));
        }
        if (num2 != null) {
            q.add(C11915r.m25707a(str, new ForegroundColorSpan(ContextCompat.getColor(context, num2.intValue()))));
        }
        return q;
    }

    /* renamed from: g */
    public final SpannableStringBuilder mo53349g(Context context, String str, String str2, String str3, CharacterStyle characterStyle) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "textCashback");
        C12775o.m28639i(str2, "fullText");
        C12775o.m28639i(str3, "textLastCashback");
        C12775o.m28639i(characterStyle, "styleForCashback");
        return m31340a(context, str, str2, str3, characterStyle);
    }

    /* renamed from: h */
    public final SpannableStringBuilder mo53350h(String str) {
        int start;
        C12775o.m28639i(str, "text");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Matcher matcher = Pattern.compile("\\d{1,3}[,.]?(\\d{1,2})?(%|€|\\s%|\\s€)").matcher(str);
        if (!matcher.find() || (start = matcher.start()) < 0) {
            return spannableStringBuilder;
        }
        String substring = str.substring(start, matcher.end());
        C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return m31341b(str, C12723v.m28509d(C11915r.m25707a(substring, new StyleSpan(1))));
    }

    /* renamed from: i */
    public final SpannableStringBuilder mo53351i(String str, CharacterStyle characterStyle) {
        C12775o.m28639i(str, "fullText");
        C12775o.m28639i(characterStyle, "style");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        m31342c(str, spannableStringBuilder, C12723v.m28509d(C11915r.m25707a(str, characterStyle)));
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public final void mo53352j(TextView textView, String str, String str2, CharacterStyle characterStyle) {
        C12775o.m28639i(textView, "textView");
        C12775o.m28639i(str, "fullText");
        C12775o.m28639i(str2, "subText");
        C12775o.m28639i(characterStyle, "style");
        mo53353k(textView, str, C12723v.m28509d(C11915r.m25707a(str2, characterStyle)));
    }

    /* renamed from: k */
    public final void mo53353k(TextView textView, String str, Collection<? extends C11906l<String, ? extends CharacterStyle>> collection) {
        C12775o.m28639i(textView, "textView");
        C12775o.m28639i(str, "fullText");
        C12775o.m28639i(collection, "stylesForSubtext");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        m31342c(str, spannableStringBuilder, collection);
        textView.setText(spannableStringBuilder);
    }
}
