package p371jg;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13121c;
import okio.C13133f;

@SourceDebugExtension({"SMAP\n-ByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -ByteString.kt\nokio/internal/_ByteStringKt\n+ 2 -Util.kt\nokio/_UtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Utf8.kt\nokio/Utf8\n*L\n1#1,361:1\n129#1,2:367\n131#1,9:370\n66#2:362\n72#2:363\n72#2:365\n72#2:366\n66#2:394\n72#2:406\n1#3:364\n1#3:369\n212#4,7:379\n122#4:386\n219#4,5:387\n122#4:392\n226#4:393\n228#4:395\n396#4,2:396\n122#4:398\n399#4,6:399\n127#4:405\n405#4:407\n122#4:408\n406#4,13:409\n122#4:422\n421#4:423\n122#4:424\n424#4:425\n230#4,3:426\n439#4,3:429\n122#4:432\n442#4:433\n127#4:434\n445#4,10:435\n127#4:445\n455#4:446\n122#4:447\n456#4,4:448\n127#4:452\n460#4:453\n122#4:454\n461#4,14:455\n122#4:469\n476#4,2:470\n122#4:472\n480#4:473\n122#4:474\n483#4:475\n234#4,3:476\n499#4,3:479\n122#4:482\n502#4:483\n127#4:484\n505#4,2:485\n127#4:487\n509#4,10:488\n127#4:498\n519#4:499\n122#4:500\n520#4,4:501\n127#4:505\n524#4:506\n122#4:507\n525#4,4:508\n127#4:512\n529#4:513\n122#4:514\n530#4,15:515\n122#4:530\n546#4,2:531\n122#4:533\n549#4,2:534\n122#4:536\n553#4:537\n122#4:538\n556#4:539\n241#4:540\n122#4:541\n242#4,5:542\n*S KotlinDebug\n*F\n+ 1 -ByteString.kt\nokio/internal/_ByteStringKt\n*L\n327#1:367,2\n327#1:370,9\n65#1:362\n66#1:363\n256#1:365\n257#1:366\n346#1:394\n346#1:406\n327#1:369\n346#1:379,7\n351#1:386\n346#1:387,5\n351#1:392\n346#1:393\n346#1:395\n346#1:396,2\n351#1:398\n346#1:399,6\n346#1:405\n346#1:407\n351#1:408\n346#1:409,13\n351#1:422\n346#1:423\n351#1:424\n346#1:425\n346#1:426,3\n346#1:429,3\n351#1:432\n346#1:433\n346#1:434\n346#1:435,10\n346#1:445\n346#1:446\n351#1:447\n346#1:448,4\n346#1:452\n346#1:453\n351#1:454\n346#1:455,14\n351#1:469\n346#1:470,2\n351#1:472\n346#1:473\n351#1:474\n346#1:475\n346#1:476,3\n346#1:479,3\n351#1:482\n346#1:483\n346#1:484\n346#1:485,2\n346#1:487\n346#1:488,10\n346#1:498\n346#1:499\n351#1:500\n346#1:501,4\n346#1:505\n346#1:506\n351#1:507\n346#1:508,4\n346#1:512\n346#1:513\n351#1:514\n346#1:515,15\n351#1:530\n346#1:531,2\n351#1:533\n346#1:534,2\n351#1:536\n346#1:537\n351#1:538\n346#1:539\n346#1:540\n351#1:541\n346#1:542,5\n*E\n"})
/* renamed from: jg.g */
/* compiled from: -ByteString.kt */
public final class C12637g {

    /* renamed from: a */
    private static final char[] f20305a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0217 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0047 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x016c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0081 A[EDGE_INSN: B:263:0x0081->B:51:0x0081 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x00da A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m28072c(byte[] r19, int r20) {
        /*
            r0 = r19
            r1 = r20
            int r2 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0008:
            if (r4 >= r2) goto L_0x022b
            byte r7 = r0[r4]
            r8 = 160(0xa0, float:2.24E-43)
            r9 = 127(0x7f, float:1.78E-43)
            r10 = 32
            r11 = 13
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 10
            r14 = 65536(0x10000, float:9.18355E-41)
            r16 = -1
            r17 = 1
            if (r7 < 0) goto L_0x008a
            int r18 = r6 + 1
            if (r6 != r1) goto L_0x0026
            return r5
        L_0x0026:
            if (r7 == r13) goto L_0x0045
            if (r7 == r11) goto L_0x0045
            if (r7 < 0) goto L_0x0031
            if (r7 >= r10) goto L_0x0031
            r6 = r17
            goto L_0x0032
        L_0x0031:
            r6 = 0
        L_0x0032:
            if (r6 != 0) goto L_0x0041
            if (r9 > r7) goto L_0x003b
            if (r7 >= r8) goto L_0x003b
            r6 = r17
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            if (r6 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r6 = 0
            goto L_0x0043
        L_0x0041:
            r6 = r17
        L_0x0043:
            if (r6 != 0) goto L_0x0047
        L_0x0045:
            if (r7 != r12) goto L_0x0048
        L_0x0047:
            return r16
        L_0x0048:
            if (r7 >= r14) goto L_0x004d
            r6 = r17
            goto L_0x004e
        L_0x004d:
            r6 = 2
        L_0x004e:
            int r5 = r5 + r6
            int r4 = r4 + 1
        L_0x0051:
            r6 = r18
            if (r4 >= r2) goto L_0x0008
            byte r7 = r0[r4]
            if (r7 < 0) goto L_0x0008
            int r4 = r4 + 1
            int r18 = r6 + 1
            if (r6 != r1) goto L_0x0060
            return r5
        L_0x0060:
            if (r7 == r13) goto L_0x007f
            if (r7 == r11) goto L_0x007f
            if (r7 < 0) goto L_0x006b
            if (r7 >= r10) goto L_0x006b
            r6 = r17
            goto L_0x006c
        L_0x006b:
            r6 = 0
        L_0x006c:
            if (r6 != 0) goto L_0x007b
            if (r9 > r7) goto L_0x0075
            if (r7 >= r8) goto L_0x0075
            r6 = r17
            goto L_0x0076
        L_0x0075:
            r6 = 0
        L_0x0076:
            if (r6 == 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r6 = 0
            goto L_0x007d
        L_0x007b:
            r6 = r17
        L_0x007d:
            if (r6 != 0) goto L_0x0081
        L_0x007f:
            if (r7 != r12) goto L_0x0082
        L_0x0081:
            return r16
        L_0x0082:
            if (r7 >= r14) goto L_0x0087
            r6 = r17
            goto L_0x0088
        L_0x0087:
            r6 = 2
        L_0x0088:
            int r5 = r5 + r6
            goto L_0x0051
        L_0x008a:
            int r3 = r7 >> 5
            r15 = -2
            r14 = 128(0x80, float:1.794E-43)
            if (r3 != r15) goto L_0x00eb
            int r3 = r4 + 1
            if (r2 > r3) goto L_0x0099
            if (r6 != r1) goto L_0x0098
            return r5
        L_0x0098:
            return r16
        L_0x0099:
            byte r3 = r0[r3]
            r15 = r3 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x00a2
            r15 = r17
            goto L_0x00a3
        L_0x00a2:
            r15 = 0
        L_0x00a3:
            if (r15 != 0) goto L_0x00a9
            if (r6 != r1) goto L_0x00a8
            return r5
        L_0x00a8:
            return r16
        L_0x00a9:
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r7 << 6
            r3 = r3 ^ r7
            if (r3 >= r14) goto L_0x00b4
            if (r6 != r1) goto L_0x00b3
            return r5
        L_0x00b3:
            return r16
        L_0x00b4:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x00b9
            return r5
        L_0x00b9:
            if (r3 == r13) goto L_0x00d8
            if (r3 == r11) goto L_0x00d8
            if (r3 < 0) goto L_0x00c4
            if (r3 >= r10) goto L_0x00c4
            r6 = r17
            goto L_0x00c5
        L_0x00c4:
            r6 = 0
        L_0x00c5:
            if (r6 != 0) goto L_0x00d4
            if (r9 > r3) goto L_0x00ce
            if (r3 >= r8) goto L_0x00ce
            r6 = r17
            goto L_0x00cf
        L_0x00ce:
            r6 = 0
        L_0x00cf:
            if (r6 == 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            r6 = 0
            goto L_0x00d6
        L_0x00d4:
            r6 = r17
        L_0x00d6:
            if (r6 != 0) goto L_0x00da
        L_0x00d8:
            if (r3 != r12) goto L_0x00db
        L_0x00da:
            return r16
        L_0x00db:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x00e2
            r15 = r17
            goto L_0x00e3
        L_0x00e2:
            r15 = 2
        L_0x00e3:
            int r5 = r5 + r15
            ef.v r3 = p336ef.C11921v.f18618a
            int r4 = r4 + 2
        L_0x00e8:
            r6 = r7
            goto L_0x0008
        L_0x00eb:
            int r3 = r7 >> 4
            r12 = 57344(0xe000, float:8.0356E-41)
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r3 != r15) goto L_0x017c
            int r3 = r4 + 2
            if (r2 > r3) goto L_0x00fd
            if (r6 != r1) goto L_0x00fc
            return r5
        L_0x00fc:
            return r16
        L_0x00fd:
            int r15 = r4 + 1
            byte r15 = r0[r15]
            r9 = r15 & 192(0xc0, float:2.69E-43)
            if (r9 != r14) goto L_0x0108
            r9 = r17
            goto L_0x0109
        L_0x0108:
            r9 = 0
        L_0x0109:
            if (r9 != 0) goto L_0x010f
            if (r6 != r1) goto L_0x010e
            return r5
        L_0x010e:
            return r16
        L_0x010f:
            byte r3 = r0[r3]
            r9 = r3 & 192(0xc0, float:2.69E-43)
            if (r9 != r14) goto L_0x0118
            r9 = r17
            goto L_0x0119
        L_0x0118:
            r9 = 0
        L_0x0119:
            if (r9 != 0) goto L_0x011f
            if (r6 != r1) goto L_0x011e
            return r5
        L_0x011e:
            return r16
        L_0x011f:
            r9 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r9
            int r9 = r15 << 6
            r3 = r3 ^ r9
            int r7 = r7 << 12
            r3 = r3 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 >= r7) goto L_0x0131
            if (r6 != r1) goto L_0x0130
            return r5
        L_0x0130:
            return r16
        L_0x0131:
            if (r8 > r3) goto L_0x0138
            if (r3 >= r12) goto L_0x0138
            r7 = r17
            goto L_0x0139
        L_0x0138:
            r7 = 0
        L_0x0139:
            if (r7 == 0) goto L_0x013f
            if (r6 != r1) goto L_0x013e
            return r5
        L_0x013e:
            return r16
        L_0x013f:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x0144
            return r5
        L_0x0144:
            if (r3 == r13) goto L_0x0167
            if (r3 == r11) goto L_0x0167
            if (r3 < 0) goto L_0x014f
            if (r3 >= r10) goto L_0x014f
            r6 = r17
            goto L_0x0150
        L_0x014f:
            r6 = 0
        L_0x0150:
            if (r6 != 0) goto L_0x0163
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 > r3) goto L_0x015d
            r6 = 160(0xa0, float:2.24E-43)
            if (r3 >= r6) goto L_0x015d
            r6 = r17
            goto L_0x015e
        L_0x015d:
            r6 = 0
        L_0x015e:
            if (r6 == 0) goto L_0x0161
            goto L_0x0163
        L_0x0161:
            r6 = 0
            goto L_0x0165
        L_0x0163:
            r6 = r17
        L_0x0165:
            if (r6 != 0) goto L_0x016c
        L_0x0167:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x016d
        L_0x016c:
            return r16
        L_0x016d:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x0174
            r15 = r17
            goto L_0x0175
        L_0x0174:
            r15 = 2
        L_0x0175:
            int r5 = r5 + r15
            ef.v r3 = p336ef.C11921v.f18618a
            int r4 = r4 + 3
            goto L_0x00e8
        L_0x017c:
            int r3 = r7 >> 3
            if (r3 != r15) goto L_0x0227
            int r3 = r4 + 3
            if (r2 > r3) goto L_0x0188
            if (r6 != r1) goto L_0x0187
            return r5
        L_0x0187:
            return r16
        L_0x0188:
            int r9 = r4 + 1
            byte r9 = r0[r9]
            r15 = r9 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x0193
            r15 = r17
            goto L_0x0194
        L_0x0193:
            r15 = 0
        L_0x0194:
            if (r15 != 0) goto L_0x019a
            if (r6 != r1) goto L_0x0199
            return r5
        L_0x0199:
            return r16
        L_0x019a:
            int r15 = r4 + 2
            byte r15 = r0[r15]
            r10 = r15 & 192(0xc0, float:2.69E-43)
            if (r10 != r14) goto L_0x01a5
            r10 = r17
            goto L_0x01a6
        L_0x01a5:
            r10 = 0
        L_0x01a6:
            if (r10 != 0) goto L_0x01ac
            if (r6 != r1) goto L_0x01ab
            return r5
        L_0x01ab:
            return r16
        L_0x01ac:
            byte r3 = r0[r3]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r14) goto L_0x01b5
            r10 = r17
            goto L_0x01b6
        L_0x01b5:
            r10 = 0
        L_0x01b6:
            if (r10 != 0) goto L_0x01bc
            if (r6 != r1) goto L_0x01bb
            return r5
        L_0x01bb:
            return r16
        L_0x01bc:
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r10
            int r10 = r15 << 6
            r3 = r3 ^ r10
            int r9 = r9 << 12
            r3 = r3 ^ r9
            int r7 = r7 << 18
            r3 = r3 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r7) goto L_0x01d2
            if (r6 != r1) goto L_0x01d1
            return r5
        L_0x01d1:
            return r16
        L_0x01d2:
            if (r8 > r3) goto L_0x01d9
            if (r3 >= r12) goto L_0x01d9
            r7 = r17
            goto L_0x01da
        L_0x01d9:
            r7 = 0
        L_0x01da:
            if (r7 == 0) goto L_0x01e0
            if (r6 != r1) goto L_0x01df
            return r5
        L_0x01df:
            return r16
        L_0x01e0:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r7) goto L_0x01e8
            if (r6 != r1) goto L_0x01e7
            return r5
        L_0x01e7:
            return r16
        L_0x01e8:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x01ed
            return r5
        L_0x01ed:
            if (r3 == r13) goto L_0x0212
            if (r3 == r11) goto L_0x0212
            if (r3 < 0) goto L_0x01fa
            r6 = 32
            if (r3 >= r6) goto L_0x01fa
            r6 = r17
            goto L_0x01fb
        L_0x01fa:
            r6 = 0
        L_0x01fb:
            if (r6 != 0) goto L_0x020e
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 > r3) goto L_0x0208
            r6 = 160(0xa0, float:2.24E-43)
            if (r3 >= r6) goto L_0x0208
            r6 = r17
            goto L_0x0209
        L_0x0208:
            r6 = 0
        L_0x0209:
            if (r6 == 0) goto L_0x020c
            goto L_0x020e
        L_0x020c:
            r6 = 0
            goto L_0x0210
        L_0x020e:
            r6 = r17
        L_0x0210:
            if (r6 != 0) goto L_0x0217
        L_0x0212:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x0218
        L_0x0217:
            return r16
        L_0x0218:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x021f
            r15 = r17
            goto L_0x0220
        L_0x021f:
            r15 = 2
        L_0x0220:
            int r5 = r5 + r15
            ef.v r3 = p336ef.C11921v.f18618a
            int r4 = r4 + 4
            goto L_0x00e8
        L_0x0227:
            if (r6 != r1) goto L_0x022a
            return r5
        L_0x022a:
            return r16
        L_0x022b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p371jg.C12637g.m28072c(byte[], int):int");
    }

    /* renamed from: d */
    public static final void m28073d(C13133f fVar, C13121c cVar, int i, int i2) {
        C12775o.m28639i(fVar, "<this>");
        C12775o.m28639i(cVar, "buffer");
        cVar.write(fVar.mo52604h(), i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final int m28074e(char c) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if ('0' > c || c >= ':') {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || c >= 'g') {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            c2 = 'A';
            if ('A' > c || c >= 'G') {
                z3 = false;
            }
            if (!z3) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: f */
    public static final char[] m28075f() {
        return f20305a;
    }
}
