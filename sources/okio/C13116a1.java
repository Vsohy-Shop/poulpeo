package okio;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nUtf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utf8.kt\nokio/Utf8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -Util.kt\nokio/_UtilKt\n*L\n1#1,558:1\n396#1,9:562\n127#1:571\n405#1,20:573\n439#1,4:594\n127#1:598\n445#1,10:600\n127#1:610\n455#1,5:611\n127#1:616\n460#1,24:617\n499#1,4:642\n127#1:646\n505#1,2:648\n127#1:650\n509#1,10:651\n127#1:661\n519#1,5:662\n127#1:667\n524#1,5:668\n127#1:673\n529#1,28:674\n396#1,9:703\n127#1:712\n405#1,20:714\n439#1,4:735\n127#1:739\n445#1,10:741\n127#1:751\n455#1,5:752\n127#1:757\n460#1,24:758\n499#1,4:783\n127#1:787\n505#1,2:789\n127#1:791\n509#1,10:792\n127#1:802\n519#1,5:803\n127#1:808\n524#1,5:809\n127#1:814\n529#1,28:815\n127#1:843\n127#1:845\n127#1:847\n127#1:849\n127#1:851\n127#1:853\n127#1:855\n127#1:857\n127#1:859\n1#2:559\n72#3:560\n66#3:561\n72#3:572\n66#3:593\n72#3:599\n66#3:641\n72#3:647\n66#3:702\n72#3:713\n66#3:734\n72#3:740\n66#3:782\n72#3:788\n72#3:844\n72#3:846\n72#3:848\n72#3:850\n72#3:852\n72#3:854\n72#3:856\n72#3:858\n72#3:860\n*S KotlinDebug\n*F\n+ 1 Utf8.kt\nokio/Utf8\n*L\n228#1:562,9\n228#1:571\n228#1:573,20\n232#1:594,4\n232#1:598\n232#1:600,10\n232#1:610\n232#1:611,5\n232#1:616\n232#1:617,24\n236#1:642,4\n236#1:646\n236#1:648,2\n236#1:650\n236#1:651,10\n236#1:661\n236#1:662,5\n236#1:667\n236#1:668,5\n236#1:673\n236#1:674,28\n276#1:703,9\n276#1:712\n276#1:714,20\n280#1:735,4\n280#1:739\n280#1:741,10\n280#1:751\n280#1:752,5\n280#1:757\n280#1:758,24\n284#1:783,4\n284#1:787\n284#1:789,2\n284#1:791\n284#1:792,10\n284#1:802\n284#1:803,5\n284#1:808\n284#1:809,5\n284#1:814\n284#1:815,28\n404#1:843\n442#1:845\n454#1:847\n459#1:849\n502#1:851\n506#1:853\n518#1:855\n523#1:857\n528#1:859\n127#1:560\n226#1:561\n228#1:572\n230#1:593\n232#1:599\n234#1:641\n236#1:647\n274#1:702\n276#1:713\n278#1:734\n280#1:740\n282#1:782\n284#1:788\n404#1:844\n442#1:846\n454#1:848\n459#1:850\n502#1:852\n506#1:854\n518#1:856\n523#1:858\n528#1:860\n*E\n"})
/* renamed from: okio.a1 */
/* compiled from: Utf8.kt */
public final class C13116a1 {
    /* renamed from: a */
    public static final long m29509a(String str, int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        char c;
        C12775o.m28639i(str, "<this>");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > str.length()) {
                    z3 = false;
                }
                if (z3) {
                    long j = 0;
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            j++;
                        } else {
                            if (charAt < 2048) {
                                i3 = 2;
                            } else if (charAt < 55296 || charAt > 57343) {
                                i3 = 3;
                            } else {
                                int i4 = i + 1;
                                if (i4 < i2) {
                                    c = str.charAt(i4);
                                } else {
                                    c = 0;
                                }
                                if (charAt > 56319 || c < 56320 || c > 57343) {
                                    j++;
                                    i = i4;
                                } else {
                                    j += (long) 4;
                                    i += 2;
                                }
                            }
                            j += (long) i3;
                        }
                        i++;
                    }
                    return j;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ long m29510b(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m29509a(str, i, i2);
    }
}
