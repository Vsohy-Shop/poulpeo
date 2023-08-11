package androidx.compose.p002ui.text.font;

import androidx.compose.p002ui.text.font.FontWeight;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFontMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n102#1,34:189\n102#1,34:234\n108#1,28:279\n108#1,28:318\n35#2,3:166\n38#2,2:173\n40#2:176\n35#2,3:177\n38#2,2:184\n40#2:187\n35#2,3:223\n38#2,2:230\n40#2:233\n35#2,3:268\n38#2,2:275\n40#2:278\n35#2,3:307\n38#2,2:314\n40#2:317\n35#2,3:346\n38#2,2:353\n40#2:356\n35#2,3:357\n38#2,2:364\n40#2:367\n35#2,3:368\n38#2,2:375\n40#2:378\n33#3,4:169\n38#3:175\n33#3,4:180\n38#3:186\n33#3,4:226\n38#3:232\n33#3,4:271\n38#3:277\n33#3,4:310\n38#3:316\n33#3,4:349\n38#3:355\n33#3,4:360\n38#3:366\n33#3,4:371\n38#3:377\n1#4:188\n*S KotlinDebug\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n*L\n65#1:189,34\n71#1:234,34\n80#1:279,28\n87#1:318,28\n49#1:166,3\n49#1:173,2\n49#1:176\n57#1:177,3\n57#1:184,2\n57#1:187\n65#1:223,3\n65#1:230,2\n65#1:233\n71#1:268,3\n71#1:275,2\n71#1:278\n80#1:307,3\n80#1:314,2\n80#1:317\n87#1:346,3\n87#1:353,2\n87#1:356\n135#1:357,3\n135#1:364,2\n135#1:367\n135#1:368,3\n135#1:375,2\n135#1:378\n49#1:169,4\n49#1:175\n57#1:180,4\n57#1:186\n65#1:226,4\n65#1:232\n71#1:271,4\n71#1:277\n80#1:310,4\n80#1:316\n87#1:349,4\n87#1:355\n135#1:360,4\n135#1:366\n135#1:371,4\n135#1:377\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.FontMatcher */
/* compiled from: FontMatcher.kt */
public final class FontMatcher {
    public static /* synthetic */ List filterByClosestWeight$ui_text_release$default(FontMatcher fontMatcher, List list, FontWeight fontWeight, boolean z, FontWeight fontWeight2, FontWeight fontWeight3, int i, Object obj) {
        FontWeight fontWeight4 = null;
        if ((i & 4) != 0) {
            fontWeight2 = null;
        }
        if ((i & 8) != 0) {
            fontWeight3 = null;
        }
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(fontWeight, "fontWeight");
        int size = list.size();
        int i2 = 0;
        FontWeight fontWeight5 = null;
        while (true) {
            if (i2 >= size) {
                break;
            }
            FontWeight weight = ((Font) list.get(i2)).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    } else if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                    fontWeight4 = weight;
                }
            }
            i2++;
        }
        if (!z ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Object obj2 = list.get(i3);
            if (C12775o.m28634d(((Font) obj2).getWeight(), fontWeight4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final List<Font> filterByClosestWeight$ui_text_release(List<? extends Font> list, FontWeight fontWeight, boolean z, FontWeight fontWeight2, FontWeight fontWeight3) {
        C12775o.m28639i(list, "<this>");
        C12775o.m28639i(fontWeight, "fontWeight");
        int size = list.size();
        FontWeight fontWeight4 = null;
        FontWeight fontWeight5 = null;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            FontWeight weight = ((Font) list.get(i)).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    } else if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                    fontWeight4 = weight;
                }
            }
            i++;
        }
        if (!z ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Object obj = list.get(i2);
            if (C12775o.m28634d(((Font) obj).getWeight(), fontWeight4)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: matchFont-RetOiIg  reason: not valid java name */
    public final List<Font> m38057matchFontRetOiIg(FontFamily fontFamily, FontWeight fontWeight, int i) {
        C12775o.m28639i(fontFamily, "fontFamily");
        C12775o.m28639i(fontWeight, "fontWeight");
        if (fontFamily instanceof FontListFontFamily) {
            return m38058matchFontRetOiIg((FontListFontFamily) fontFamily, fontWeight, i);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    /* renamed from: matchFont-RetOiIg  reason: not valid java name */
    public final List<Font> m38058matchFontRetOiIg(FontListFontFamily fontListFontFamily, FontWeight fontWeight, int i) {
        C12775o.m28639i(fontListFontFamily, "fontFamily");
        C12775o.m28639i(fontWeight, "fontWeight");
        return m38059matchFontRetOiIg((List<? extends Font>) fontListFontFamily.getFonts(), fontWeight, i);
    }

    /* renamed from: matchFont-RetOiIg  reason: not valid java name */
    public final List<Font> m38059matchFontRetOiIg(List<? extends Font> list, FontWeight fontWeight, int i) {
        C12775o.m28639i(list, "fontList");
        C12775o.m28639i(fontWeight, "fontWeight");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= size) {
                break;
            }
            Object obj = list.get(i3);
            Font font = (Font) obj;
            if (!C12775o.m28634d(font.getWeight(), fontWeight) || !FontStyle.m38063equalsimpl0(font.m38035getStyle_LCdwA(), i)) {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
            i3++;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj2 = list.get(i4);
            if (FontStyle.m38063equalsimpl0(((Font) obj2).m38035getStyle_LCdwA(), i)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        List list2 = list;
        FontWeight.Companion companion = FontWeight.Companion;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.getW400()) < 0) {
            int size3 = list2.size();
            FontWeight fontWeight3 = null;
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    break;
                }
                FontWeight weight = ((Font) list2.get(i5)).getWeight();
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight3 = weight;
                        fontWeight2 = fontWeight3;
                        break;
                    } else if (fontWeight3 == null || weight.compareTo(fontWeight3) < 0) {
                        fontWeight3 = weight;
                    }
                } else if (fontWeight2 == null || weight.compareTo(fontWeight2) > 0) {
                    fontWeight2 = weight;
                }
                i5++;
            }
            if (fontWeight2 != null) {
                fontWeight3 = fontWeight2;
            }
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size4 = list2.size();
            while (i2 < size4) {
                Object obj3 = list2.get(i2);
                if (C12775o.m28634d(((Font) obj3).getWeight(), fontWeight3)) {
                    arrayList3.add(obj3);
                }
                i2++;
            }
            return arrayList3;
        } else if (fontWeight.compareTo(companion.getW500()) > 0) {
            int size5 = list2.size();
            FontWeight fontWeight4 = null;
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    break;
                }
                FontWeight weight2 = ((Font) list2.get(i6)).getWeight();
                if (weight2.compareTo(fontWeight) >= 0) {
                    if (weight2.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight2;
                        fontWeight2 = fontWeight4;
                        break;
                    } else if (fontWeight4 == null || weight2.compareTo(fontWeight4) < 0) {
                        fontWeight4 = weight2;
                    }
                } else if (fontWeight2 == null || weight2.compareTo(fontWeight2) > 0) {
                    fontWeight2 = weight2;
                }
                i6++;
            }
            if (fontWeight4 == null) {
                fontWeight4 = fontWeight2;
            }
            ArrayList arrayList4 = new ArrayList(list2.size());
            int size6 = list2.size();
            while (i2 < size6) {
                Object obj4 = list2.get(i2);
                if (C12775o.m28634d(((Font) obj4).getWeight(), fontWeight4)) {
                    arrayList4.add(obj4);
                }
                i2++;
            }
            return arrayList4;
        } else {
            FontWeight w500 = companion.getW500();
            int size7 = list2.size();
            FontWeight fontWeight5 = null;
            FontWeight fontWeight6 = null;
            int i7 = 0;
            while (true) {
                if (i7 >= size7) {
                    break;
                }
                FontWeight weight3 = ((Font) list2.get(i7)).getWeight();
                if (w500 == null || weight3.compareTo(w500) <= 0) {
                    if (weight3.compareTo(fontWeight) >= 0) {
                        if (weight3.compareTo(fontWeight) <= 0) {
                            fontWeight5 = weight3;
                            fontWeight6 = fontWeight5;
                            break;
                        } else if (fontWeight6 == null || weight3.compareTo(fontWeight6) < 0) {
                            fontWeight6 = weight3;
                        }
                    } else if (fontWeight5 == null || weight3.compareTo(fontWeight5) > 0) {
                        fontWeight5 = weight3;
                    }
                }
                i7++;
            }
            if (fontWeight6 != null) {
                fontWeight5 = fontWeight6;
            }
            ArrayList arrayList5 = new ArrayList(list2.size());
            int size8 = list2.size();
            for (int i8 = 0; i8 < size8; i8++) {
                Object obj5 = list2.get(i8);
                if (C12775o.m28634d(((Font) obj5).getWeight(), fontWeight5)) {
                    arrayList5.add(obj5);
                }
            }
            if (!arrayList5.isEmpty()) {
                return arrayList5;
            }
            FontWeight w5002 = FontWeight.Companion.getW500();
            int size9 = list2.size();
            FontWeight fontWeight7 = null;
            int i9 = 0;
            while (true) {
                if (i9 >= size9) {
                    break;
                }
                FontWeight weight4 = ((Font) list2.get(i9)).getWeight();
                if (w5002 == null || weight4.compareTo(w5002) >= 0) {
                    if (weight4.compareTo(fontWeight) >= 0) {
                        if (weight4.compareTo(fontWeight) <= 0) {
                            fontWeight2 = weight4;
                            fontWeight7 = fontWeight2;
                            break;
                        } else if (fontWeight7 == null || weight4.compareTo(fontWeight7) < 0) {
                            fontWeight7 = weight4;
                        }
                    } else if (fontWeight2 == null || weight4.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight4;
                    }
                }
                i9++;
            }
            if (fontWeight7 != null) {
                fontWeight2 = fontWeight7;
            }
            ArrayList arrayList6 = new ArrayList(list2.size());
            int size10 = list2.size();
            while (i2 < size10) {
                Object obj6 = list2.get(i2);
                if (C12775o.m28634d(((Font) obj6).getWeight(), fontWeight2)) {
                    arrayList6.add(obj6);
                }
                i2++;
            }
            return arrayList6;
        }
    }
}
