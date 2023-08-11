package okio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.C12671c;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* renamed from: okio.m0 */
/* compiled from: Options.kt */
public final class C13151m0 extends C12671c<C13133f> implements RandomAccess {

    /* renamed from: d */
    public static final C13152a f20932d = new C13152a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final C13133f[] f20933b;

    /* renamed from: c */
    private final int[] f20934c;

    @SourceDebugExtension({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 -Util.kt\nokio/_UtilKt\n*L\n1#1,236:1\n11335#2:237\n11670#2,3:238\n13644#2,3:243\n37#3,2:241\n1#4:246\n72#5:247\n72#5:248\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n43#1:237\n43#1:238,3\n44#1:243,3\n43#1:241,2\n151#1:247\n208#1:248\n*E\n"})
    /* renamed from: okio.m0$a */
    /* compiled from: Options.kt */
    public static final class C13152a {
        private C13152a() {
        }

        public /* synthetic */ C13152a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final void m29780a(long j, C13121c cVar, int i, List<? extends C13133f> list, int i2, int i3, List<Integer> list2) {
            boolean z;
            int i4;
            int i5;
            boolean z2;
            int i6;
            int i7;
            C13121c cVar2;
            boolean z3;
            C13121c cVar3 = cVar;
            int i8 = i;
            List<? extends C13133f> list3 = list;
            int i9 = i2;
            int i10 = i3;
            List<Integer> list4 = list2;
            if (i9 < i10) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i11 = i9;
                while (i11 < i10) {
                    if (((C13133f) list3.get(i11)).mo52590H() >= i8) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i11++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                C13133f fVar = (C13133f) list.get(i2);
                C13133f fVar2 = (C13133f) list3.get(i10 - 1);
                int i12 = -1;
                if (i8 == fVar.mo52590H()) {
                    int intValue = list4.get(i9).intValue();
                    int i13 = i9 + 1;
                    i4 = i13;
                    i5 = intValue;
                    fVar = (C13133f) list3.get(i13);
                } else {
                    i4 = i9;
                    i5 = -1;
                }
                if (fVar.mo52603g(i8) != fVar2.mo52603g(i8)) {
                    int i14 = 1;
                    for (int i15 = i4 + 1; i15 < i10; i15++) {
                        if (((C13133f) list3.get(i15 - 1)).mo52603g(i8) != ((C13133f) list3.get(i15)).mo52603g(i8)) {
                            i14++;
                        }
                    }
                    long c = j + m29782c(cVar3) + ((long) 2) + ((long) (i14 * 2));
                    cVar3.writeInt(i14);
                    cVar3.writeInt(i5);
                    for (int i16 = i4; i16 < i10; i16++) {
                        byte g = ((C13133f) list3.get(i16)).mo52603g(i8);
                        if (i16 == i4 || g != ((C13133f) list3.get(i16 - 1)).mo52603g(i8)) {
                            cVar3.writeInt(g & 255);
                        }
                    }
                    C13121c cVar4 = new C13121c();
                    while (i4 < i10) {
                        byte g2 = ((C13133f) list3.get(i4)).mo52603g(i8);
                        int i17 = i4 + 1;
                        int i18 = i17;
                        while (true) {
                            if (i18 >= i10) {
                                i6 = i10;
                                break;
                            } else if (g2 != ((C13133f) list3.get(i18)).mo52603g(i8)) {
                                i6 = i18;
                                break;
                            } else {
                                i18++;
                            }
                        }
                        if (i17 == i6 && i8 + 1 == ((C13133f) list3.get(i4)).mo52590H()) {
                            cVar3.writeInt(list4.get(i4).intValue());
                            i7 = i6;
                            cVar2 = cVar4;
                        } else {
                            cVar3.writeInt(((int) (c + m29782c(cVar4))) * i12);
                            i7 = i6;
                            cVar2 = cVar4;
                            m29780a(c, cVar4, i8 + 1, list, i4, i6, list2);
                        }
                        cVar4 = cVar2;
                        i4 = i7;
                        i12 = -1;
                    }
                    cVar3.mo52494K(cVar4);
                    return;
                }
                int min = Math.min(fVar.mo52590H(), fVar2.mo52590H());
                int i19 = i8;
                int i20 = 0;
                while (i19 < min && fVar.mo52603g(i19) == fVar2.mo52603g(i19)) {
                    i20++;
                    i19++;
                }
                long c2 = j + m29782c(cVar3) + ((long) 2) + ((long) i20) + 1;
                cVar3.writeInt(-i20);
                cVar3.writeInt(i5);
                int i21 = i8 + i20;
                while (i8 < i21) {
                    cVar3.writeInt(fVar.mo52603g(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i10) {
                    if (i21 == ((C13133f) list3.get(i4)).mo52590H()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        cVar3.writeInt(list4.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C13121c cVar5 = new C13121c();
                cVar3.writeInt(((int) (m29782c(cVar5) + c2)) * -1);
                m29780a(c2, cVar5, i21, list, i4, i3, list2);
                cVar3.mo52494K(cVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: b */
        static /* synthetic */ void m29781b(C13152a aVar, long j, C13121c cVar, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            long j2;
            int i5;
            int i6;
            int i7;
            if ((i4 & 1) != 0) {
                j2 = 0;
            } else {
                j2 = j;
            }
            if ((i4 & 4) != 0) {
                i5 = 0;
            } else {
                i5 = i;
            }
            if ((i4 & 16) != 0) {
                i6 = 0;
            } else {
                i6 = i2;
            }
            if ((i4 & 32) != 0) {
                i7 = list.size();
            } else {
                i7 = i3;
            }
            aVar.m29780a(j2, cVar, i5, list, i6, i7, list2);
        }

        /* renamed from: c */
        private final long m29782c(C13121c cVar) {
            return cVar.size() / ((long) 4);
        }

        /* renamed from: d */
        public final C13151m0 mo52666d(C13133f... fVarArr) {
            boolean z;
            boolean z2;
            boolean z3;
            C13133f[] fVarArr2 = fVarArr;
            C12775o.m28639i(fVarArr2, "byteStrings");
            int i = 0;
            if (fVarArr2.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new C13151m0(new C13133f[0], new int[]{0, -1}, (DefaultConstructorMarker) null);
            }
            List i0 = C12710p.m28407i0(fVarArr);
            C12664a0.m28171z(i0);
            ArrayList arrayList = new ArrayList(fVarArr2.length);
            for (C13133f fVar : fVarArr2) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            List q = C12726w.m28530q(Arrays.copyOf(numArr, numArr.length));
            int length = fVarArr2.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                q.set(C12726w.m28523j(i0, fVarArr2[i2], 0, 0, 6, (Object) null), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (((C13133f) i0.get(0)).mo52590H() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i4 = 0;
                while (i4 < i0.size()) {
                    C13133f fVar2 = (C13133f) i0.get(i4);
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (i6 < i0.size()) {
                        C13133f fVar3 = (C13133f) i0.get(i6);
                        if (!fVar3.mo52591I(fVar2)) {
                            continue;
                            break;
                        }
                        if (fVar3.mo52590H() != fVar2.mo52590H()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            throw new IllegalArgumentException(("duplicate option: " + fVar3).toString());
                        } else if (((Number) q.get(i6)).intValue() > ((Number) q.get(i4)).intValue()) {
                            i0.remove(i6);
                            q.remove(i6);
                        } else {
                            i6++;
                        }
                    }
                    i4 = i5;
                }
                C13121c cVar = new C13121c();
                m29781b(this, 0, cVar, 0, i0, 0, 0, q, 53, (Object) null);
                int[] iArr = new int[((int) m29782c(cVar))];
                while (!cVar.mo52552t()) {
                    iArr[i] = cVar.readInt();
                    i++;
                }
                Object[] copyOf = Arrays.copyOf(fVarArr2, fVarArr2.length);
                C12775o.m28638h(copyOf, "copyOf(this, size)");
                return new C13151m0((C13133f[]) copyOf, iArr, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
    }

    public /* synthetic */ C13151m0(C13133f[] fVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVarArr, iArr);
    }

    /* renamed from: b */
    public /* bridge */ boolean mo52660b(C13133f fVar) {
        return super.contains(fVar);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C13133f)) {
            return false;
        }
        return mo52660b((C13133f) obj);
    }

    public int getSize() {
        return this.f20933b.length;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C13133f)) {
            return -1;
        }
        return mo52664r((C13133f) obj);
    }

    /* renamed from: j */
    public C13133f get(int i) {
        return this.f20933b[i];
    }

    /* renamed from: k */
    public final C13133f[] mo52662k() {
        return this.f20933b;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C13133f)) {
            return -1;
        }
        return mo52665s((C13133f) obj);
    }

    /* renamed from: q */
    public final int[] mo52663q() {
        return this.f20934c;
    }

    /* renamed from: r */
    public /* bridge */ int mo52664r(C13133f fVar) {
        return super.indexOf(fVar);
    }

    /* renamed from: s */
    public /* bridge */ int mo52665s(C13133f fVar) {
        return super.lastIndexOf(fVar);
    }

    private C13151m0(C13133f[] fVarArr, int[] iArr) {
        this.f20933b = fVarArr;
        this.f20934c = iArr;
    }
}
