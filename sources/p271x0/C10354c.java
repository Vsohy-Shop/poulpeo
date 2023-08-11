package p271x0;

import android.content.Context;
import android.webkit.JavascriptInterface;
import androidx.annotation.VisibleForTesting;
import com.appboy.enums.Gender;
import com.appboy.enums.Month;
import com.appboy.enums.NotificationSubscriptionType;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import p126j0.C8266c;
import p270x.C10156b;
import p270x.C10300f;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: x0.c */
/* compiled from: InAppMessageUserJavascriptInterface.kt */
public final class C10354c {

    /* renamed from: b */
    public static final C10355a f15628b = new C10355a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f15629a;

    /* renamed from: x0.c$a */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    public static final class C10355a {
        private C10355a() {
        }

        public /* synthetic */ C10355a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final void m21745c(C10156b bVar, Function1<? super C10300f, C11921v> function1) {
            bVar.mo44769M(new C10353b(function1));
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m21746d(Function1 function1, C10300f fVar) {
            C12775o.m28639i(function1, "$block");
            C12775o.m28639i(fVar, "it");
            function1.invoke(fVar);
        }
    }

    /* renamed from: x0.c$a0 */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10356a0 extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15630g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10356a0(String str) {
            super(1);
            this.f15630g = str;
        }

        /* renamed from: a */
        public final void mo45065a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44985y(this.f15630g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45065a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$b */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10357b extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15631g;

        /* renamed from: h */
        final /* synthetic */ String f15632h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10357b(String str, String str2) {
            super(1);
            this.f15631g = str;
            this.f15632h = str2;
        }

        /* renamed from: a */
        public final void mo45066a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44962a(this.f15631g, this.f15632h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45066a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$b0 */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10358b0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15633g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10358b0(String str) {
            super(0);
            this.f15633g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: ", this.f15633g);
        }
    }

    /* renamed from: x0.c$c */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10359c extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15634g;

        /* renamed from: h */
        final /* synthetic */ String f15635h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10359c(String str, String str2) {
            super(1);
            this.f15634g = str;
            this.f15635h = str2;
        }

        /* renamed from: a */
        public final void mo45067a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44963b(this.f15634g, this.f15635h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45067a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$c0 */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10360c0 extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ NotificationSubscriptionType f15636g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10360c0(NotificationSubscriptionType notificationSubscriptionType) {
            super(1);
            this.f15636g = notificationSubscriptionType;
        }

        /* renamed from: a */
        public final void mo45068a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44986z(this.f15636g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45068a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$d */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10361d extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15637g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10361d(String str) {
            super(1);
            this.f15637g = str;
        }

        /* renamed from: a */
        public final void mo45069a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44964c(this.f15637g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45069a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$e */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10362e extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15638g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10362e(String str) {
            super(1);
            this.f15638g = str;
        }

        /* renamed from: a */
        public final void mo45070a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            C10300f.m21653f(fVar, this.f15638g, 0, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45070a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$f */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10363f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10363f f15639g = new C10363f();

        C10363f() {
            super(0);
        }

        public final String invoke() {
            return "Failed to parse custom attribute array";
        }
    }

    /* renamed from: x0.c$g */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10364g extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15640g;

        /* renamed from: h */
        final /* synthetic */ String f15641h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10364g(String str, String str2) {
            super(1);
            this.f15640g = str;
            this.f15641h = str2;
        }

        /* renamed from: a */
        public final void mo45071a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44967g(this.f15640g, this.f15641h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45071a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$h */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10365h extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15642g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10365h(String str) {
            super(1);
            this.f15642g = str;
        }

        /* renamed from: a */
        public final void mo45072a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44968h(this.f15642g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45072a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$i */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10366i extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15643g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10366i(String str) {
            super(1);
            this.f15643g = str;
        }

        /* renamed from: a */
        public final void mo45073a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44969i(this.f15643g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45073a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$j */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10367j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15644g;

        /* renamed from: h */
        final /* synthetic */ String f15645h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10367j(String str, String str2) {
            super(0);
            this.f15644g = str;
            this.f15645h = str2;
        }

        public final String invoke() {
            return "Failed to parse custom attribute type for key: " + this.f15644g + " and json string value: " + this.f15645h;
        }
    }

    /* renamed from: x0.c$k */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10368k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15646g;

        /* renamed from: h */
        final /* synthetic */ String f15647h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10368k(String str, String str2) {
            super(0);
            this.f15646g = str;
            this.f15647h = str2;
        }

        public final String invoke() {
            return "Failed to parse custom attribute type for key: " + this.f15646g + " and json string value: " + this.f15647h;
        }
    }

    /* renamed from: x0.c$l */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10369l extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15648g;

        /* renamed from: h */
        final /* synthetic */ double f15649h;

        /* renamed from: i */
        final /* synthetic */ double f15650i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10369l(String str, double d, double d2) {
            super(1);
            this.f15648g = str;
            this.f15649h = d;
            this.f15650i = d2;
        }

        /* renamed from: a */
        public final void mo45074a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44984x(this.f15648g, this.f15649h, this.f15650i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45074a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$m */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10370m extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15651g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10370m(String str) {
            super(0);
            this.f15651g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Failed to set custom attribute array for key ", this.f15651g);
        }
    }

    /* renamed from: x0.c$n */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10371n extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15652g;

        /* renamed from: h */
        final /* synthetic */ String[] f15653h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10371n(String str, String[] strArr) {
            super(1);
            this.f15652g = str;
            this.f15653h = strArr;
        }

        /* renamed from: a */
        public final void mo45075a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44971k(this.f15652g, this.f15653h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45075a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$o */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10372o extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C10354c f15654g;

        /* renamed from: h */
        final /* synthetic */ String f15655h;

        /* renamed from: i */
        final /* synthetic */ String f15656i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10372o(C10354c cVar, String str, String str2) {
            super(1);
            this.f15654g = cVar;
            this.f15655h = str;
            this.f15656i = str2;
        }

        /* renamed from: a */
        public final void mo45076a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            this.f15654g.mo45046d(fVar, this.f15655h, this.f15656i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45076a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$p */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10373p extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f15657g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10373p(int i) {
            super(0);
            this.f15657g = i;
        }

        public final String invoke() {
            return C12775o.m28647q("Failed to parse month for value ", Integer.valueOf(this.f15657g));
        }
    }

    /* renamed from: x0.c$q */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10374q extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ int f15658g;

        /* renamed from: h */
        final /* synthetic */ Month f15659h;

        /* renamed from: i */
        final /* synthetic */ int f15660i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10374q(int i, Month month, int i2) {
            super(1);
            this.f15658g = i;
            this.f15659h = month;
            this.f15660i = i2;
        }

        /* renamed from: a */
        public final void mo45077a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44976p(this.f15658g, this.f15659h, this.f15660i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45077a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$r */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10375r extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15661g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10375r(String str) {
            super(1);
            this.f15661g = str;
        }

        /* renamed from: a */
        public final void mo45078a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44977q(this.f15661g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45078a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$s */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10376s extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15662g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10376s(String str) {
            super(0);
            this.f15662g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription ", this.f15662g);
        }
    }

    /* renamed from: x0.c$t */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10377t extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ NotificationSubscriptionType f15663g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10377t(NotificationSubscriptionType notificationSubscriptionType) {
            super(1);
            this.f15663g = notificationSubscriptionType;
        }

        /* renamed from: a */
        public final void mo45079a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44978r(this.f15663g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45079a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$u */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10378u extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15664g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10378u(String str) {
            super(1);
            this.f15664g = str;
        }

        /* renamed from: a */
        public final void mo45080a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44979s(this.f15664g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45080a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$v */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10379v extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15665g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10379v(String str) {
            super(0);
            this.f15665g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Failed to parse gender in Braze HTML in-app message javascript interface with gender: ", this.f15665g);
        }
    }

    /* renamed from: x0.c$w */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10380w extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ Gender f15666g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10380w(Gender gender) {
            super(1);
            this.f15666g = gender;
        }

        /* renamed from: a */
        public final void mo45081a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44980t(this.f15666g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45081a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$x */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10381x extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15667g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10381x(String str) {
            super(1);
            this.f15667g = str;
        }

        /* renamed from: a */
        public final void mo45082a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44981u(this.f15667g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45082a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$y */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10382y extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15668g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10382y(String str) {
            super(1);
            this.f15668g = str;
        }

        /* renamed from: a */
        public final void mo45083a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44982v(this.f15668g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45083a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: x0.c$z */
    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    static final class C10383z extends C12777p implements Function1<C10300f, C11921v> {

        /* renamed from: g */
        final /* synthetic */ String f15669g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10383z(String str) {
            super(1);
            this.f15669g = str;
        }

        /* renamed from: a */
        public final void mo45084a(C10300f fVar) {
            C12775o.m28639i(fVar, "it");
            fVar.mo44983w(this.f15669g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45084a((C10300f) obj);
            return C11921v.f18618a;
        }
    }

    public C10354c(Context context) {
        C12775o.m28639i(context, "context");
        this.f15629a = context;
    }

    @VisibleForTesting
    /* renamed from: a */
    public final Month mo45040a(int i) {
        if (i < 1 || i > 12) {
            return null;
        }
        return Month.Companion.getMonth(i - 1);
    }

    @JavascriptInterface
    public final void addAlias(String str, String str2) {
        C12775o.m28639i(str, "alias");
        C12775o.m28639i(str2, "label");
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10357b(str, str2));
    }

    @JavascriptInterface
    public final void addToCustomAttributeArray(String str, String str2) {
        C12775o.m28639i(str, "key");
        C12775o.m28639i(str2, "value");
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10359c(str, str2));
    }

    @JavascriptInterface
    public final void addToSubscriptionGroup(String str) {
        C12775o.m28639i(str, "subscriptionGroupId");
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10361d(str));
    }

    @VisibleForTesting
    /* renamed from: b */
    public final Gender mo45044b(String str) {
        C12775o.m28639i(str, "genderString");
        Locale locale = Locale.US;
        C12775o.m28638h(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        C12775o.m28638h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        Gender gender = Gender.MALE;
        if (C12775o.m28634d(lowerCase, gender.forJsonPut())) {
            return gender;
        }
        Gender gender2 = Gender.FEMALE;
        if (C12775o.m28634d(lowerCase, gender2.forJsonPut())) {
            return gender2;
        }
        Gender gender3 = Gender.OTHER;
        if (C12775o.m28634d(lowerCase, gender3.forJsonPut())) {
            return gender3;
        }
        Gender gender4 = Gender.UNKNOWN;
        if (C12775o.m28634d(lowerCase, gender4.forJsonPut())) {
            return gender4;
        }
        Gender gender5 = Gender.NOT_APPLICABLE;
        if (C12775o.m28634d(lowerCase, gender5.forJsonPut())) {
            return gender5;
        }
        Gender gender6 = Gender.PREFER_NOT_TO_SAY;
        if (C12775o.m28634d(lowerCase, gender6.forJsonPut())) {
            return gender6;
        }
        return null;
    }

    @VisibleForTesting
    /* renamed from: c */
    public final String[] mo45045c(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.getString(i));
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C10363f.f15639g, 4, (Object) null);
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    public final void mo45046d(C10300f fVar, String str, String str2) {
        C12775o.m28639i(fVar, "user");
        C12775o.m28639i(str, "key");
        C12775o.m28639i(str2, "jsonStringValue");
        try {
            Object obj = new JSONObject(str2).get("value");
            if (obj instanceof String) {
                fVar.mo44974n(str, (String) obj);
            } else if (obj instanceof Boolean) {
                fVar.mo44975o(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                fVar.mo44973m(str, ((Number) obj).intValue());
            } else if (obj instanceof Double) {
                fVar.mo44972l(str, ((Number) obj).doubleValue());
            } else {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C10367j(str, str2), 6, (Object) null);
            }
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C10368k(str, str2), 4, (Object) null);
        }
    }

    @VisibleForTesting
    /* renamed from: e */
    public final NotificationSubscriptionType mo45047e(String str) {
        return NotificationSubscriptionType.Companion.fromValue(str);
    }

    @JavascriptInterface
    public final void incrementCustomUserAttribute(String str) {
        C12775o.m28639i(str, "attribute");
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10362e(str));
    }

    @JavascriptInterface
    public final void removeFromCustomAttributeArray(String str, String str2) {
        C12775o.m28639i(str, "key");
        C12775o.m28639i(str2, "value");
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10364g(str, str2));
    }

    @JavascriptInterface
    public final void removeFromSubscriptionGroup(String str) {
        C12775o.m28639i(str, "subscriptionGroupId");
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10365h(str));
    }

    @JavascriptInterface
    public final void setCountry(String str) {
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10366i(str));
    }

    @JavascriptInterface
    public final void setCustomLocationAttribute(String str, double d, double d2) {
        C12775o.m28639i(str, "attribute");
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10369l(str, d, d2));
    }

    @JavascriptInterface
    public final void setCustomUserAttributeArray(String str, String str2) {
        C12775o.m28639i(str, "key");
        String[] c = mo45045c(str2);
        if (c == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C10370m(str), 6, (Object) null);
            return;
        }
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10371n(str, c));
    }

    @JavascriptInterface
    public final void setCustomUserAttributeJSON(String str, String str2) {
        C12775o.m28639i(str, "key");
        C12775o.m28639i(str2, "jsonStringValue");
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10372o(this, str, str2));
    }

    @JavascriptInterface
    public final void setDateOfBirth(int i, int i2, int i3) {
        Month a = mo45040a(i2);
        if (a == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C10373p(i2), 6, (Object) null);
            return;
        }
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10374q(i, a, i3));
    }

    @JavascriptInterface
    public final void setEmail(String str) {
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10375r(str));
    }

    @JavascriptInterface
    public final void setEmailNotificationSubscriptionType(String str) {
        C12775o.m28639i(str, "subscriptionType");
        NotificationSubscriptionType e = mo45047e(str);
        if (e == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C10376s(str), 6, (Object) null);
            return;
        }
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10377t(e));
    }

    @JavascriptInterface
    public final void setFirstName(String str) {
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10378u(str));
    }

    @JavascriptInterface
    public final void setGender(String str) {
        C12775o.m28639i(str, "genderString");
        Gender b = mo45044b(str);
        if (b == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C10379v(str), 6, (Object) null);
            return;
        }
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10380w(b));
    }

    @JavascriptInterface
    public final void setHomeCity(String str) {
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10381x(str));
    }

    @JavascriptInterface
    public final void setLanguage(String str) {
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10382y(str));
    }

    @JavascriptInterface
    public final void setLastName(String str) {
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10383z(str));
    }

    @JavascriptInterface
    public final void setPhoneNumber(String str) {
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10356a0(str));
    }

    @JavascriptInterface
    public final void setPushNotificationSubscriptionType(String str) {
        C12775o.m28639i(str, "subscriptionType");
        NotificationSubscriptionType e = mo45047e(str);
        if (e == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C10358b0(str), 6, (Object) null);
            return;
        }
        f15628b.m21745c(C10156b.f15345m.mo44811g(this.f15629a), new C10360c0(e));
    }
}
