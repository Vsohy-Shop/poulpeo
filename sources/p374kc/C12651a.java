package p374kc;

import com.appboy.Constants;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11905k;
import p367jc.C12612a;
import p367jc.C12614b;

/* renamed from: kc.a */
/* compiled from: HtmlTagExtensions.kt */
public final class C12651a {
    /* renamed from: a */
    public static final void m28142a(C12612a aVar, String str) {
        C12775o.m28639i(aVar, "<this>");
        C12775o.m28639i(str, "text");
        if (!C13754v.m31532t(str)) {
            if (!aVar.mo50340b().isEmpty()) {
                aVar.mo50340b().add(new C12612a(C12614b.PlainText, str, (List) null, (List) null, 12, (DefaultConstructorMarker) null));
            } else {
                aVar.mo50343e(str);
            }
        }
    }

    /* renamed from: b */
    public static final C12614b m28143b(String str) {
        C12775o.m28639i(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C12775o.m28638h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -891980137) {
            if (hashCode != 97) {
                if (hashCode != 112) {
                    if (hashCode != 3240) {
                        if (hashCode != 3453) {
                            if (hashCode != 3549) {
                                if (hashCode != 3735) {
                                    if (hashCode != 104387) {
                                        if (hashCode != 3536714) {
                                            switch (hashCode) {
                                                case 3273:
                                                    if (lowerCase.equals("h1")) {
                                                        return C12614b.H1;
                                                    }
                                                    break;
                                                case 3274:
                                                    if (lowerCase.equals("h2")) {
                                                        return C12614b.H2;
                                                    }
                                                    break;
                                                case 3275:
                                                    if (lowerCase.equals("h3")) {
                                                        return C12614b.H3;
                                                    }
                                                    break;
                                                case 3276:
                                                    if (lowerCase.equals("h4")) {
                                                        return C12614b.H4;
                                                    }
                                                    break;
                                                case 3277:
                                                    if (lowerCase.equals("h5")) {
                                                        return C12614b.H5;
                                                    }
                                                    break;
                                                case 3278:
                                                    if (lowerCase.equals("h6")) {
                                                        return C12614b.H6;
                                                    }
                                                    break;
                                            }
                                        } else if (lowerCase.equals("span")) {
                                            return C12614b.Span;
                                        }
                                    } else if (lowerCase.equals("img")) {
                                        return C12614b.Image;
                                    }
                                } else if (lowerCase.equals("ul")) {
                                    return C12614b.UnorderedList;
                                }
                            } else if (lowerCase.equals("ol")) {
                                return C12614b.OrderedList;
                            }
                        } else if (lowerCase.equals("li")) {
                            return C12614b.ListItem;
                        }
                    } else if (lowerCase.equals("em")) {
                        return C12614b.EmphasizedText;
                    }
                } else if (lowerCase.equals(Constants.APPBOY_PUSH_PRIORITY_KEY)) {
                    return C12614b.Paragraph;
                }
            } else if (lowerCase.equals(Constants.APPBOY_PUSH_CONTENT_KEY)) {
                return C12614b.Link;
            }
        } else if (lowerCase.equals("strong")) {
            return C12614b.Bold;
        }
        throw new C11905k("An operation is not implemented: " + ("implement: " + str));
    }
}
