package okhttp3.internal.publicsuffix;

import androidx.webkit.ProxyConfig;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;

/* compiled from: PublicSuffixDatabase.kt */
public final class PublicSuffixDatabase {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final char EXCEPTION_MARKER = '!';
    private static final List<String> PREVAILING_RULE = C12723v.m28509d(ProxyConfig.MATCH_ALL_SCHEMES);
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private static final byte[] WILDCARD_LABEL = {42};
    /* access modifiers changed from: private */
    public static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* compiled from: PublicSuffixDatabase.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int and;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr3[i5] != 10) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr3[i2] == 10) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        z = z2;
                        i3 = Util.and(bArr4[i9][i10], 255);
                    }
                    and = i3 - Util.and(bArr3[i6 + i11], 255);
                    if (and == 0) {
                        i11++;
                        i10++;
                        if (i11 == i8) {
                            break;
                        } else if (bArr4[i9].length != i10) {
                            z2 = z;
                        } else if (i9 == bArr4.length - 1) {
                            break;
                        } else {
                            i9++;
                            i10 = -1;
                            z2 = true;
                        }
                    } else {
                        break;
                    }
                }
                if (and >= 0) {
                    if (and <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr4[i9].length - i10;
                        int length3 = bArr4.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr4[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                C12775o.m28638h(charset, "UTF_8");
                                return new String(bArr3, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }
    }

    private final List<String> findMatchingRule(List<String> list) {
        boolean z;
        List<String> list2;
        String str;
        String str2;
        String str3;
        List<String> list3;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int size = list.size();
            byte[][] bArr = new byte[size][];
            for (int i = 0; i < size; i++) {
                Charset charset = StandardCharsets.UTF_8;
                C12775o.m28638h(charset, "UTF_8");
                byte[] bytes = list.get(i).getBytes(charset);
                C12775o.m28638h(bytes, "this as java.lang.String).getBytes(charset)");
                bArr[i] = bytes;
            }
            int i2 = 0;
            while (true) {
                list2 = null;
                if (i2 >= size) {
                    str = null;
                    break;
                }
                int i3 = i2 + 1;
                Companion companion = Companion;
                byte[] bArr2 = this.publicSuffixListBytes;
                if (bArr2 == null) {
                    C12775o.m28656z("publicSuffixListBytes");
                    bArr2 = null;
                }
                String access$binarySearch = companion.binarySearch(bArr2, bArr, i2);
                if (access$binarySearch != null) {
                    str = access$binarySearch;
                    break;
                }
                i2 = i3;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    int i5 = i4 + 1;
                    bArr3[i4] = WILDCARD_LABEL;
                    Companion companion2 = Companion;
                    byte[] bArr4 = this.publicSuffixListBytes;
                    if (bArr4 == null) {
                        C12775o.m28656z("publicSuffixListBytes");
                        bArr4 = null;
                    }
                    String access$binarySearch2 = companion2.binarySearch(bArr4, bArr3, i4);
                    if (access$binarySearch2 != null) {
                        str2 = access$binarySearch2;
                        break;
                    }
                    i4 = i5;
                }
            }
            str2 = null;
            if (str2 != null) {
                int i6 = size - 1;
                int i7 = 0;
                while (true) {
                    if (i7 >= i6) {
                        break;
                    }
                    int i8 = i7 + 1;
                    Companion companion3 = Companion;
                    byte[] bArr5 = this.publicSuffixExceptionListBytes;
                    if (bArr5 == null) {
                        C12775o.m28656z("publicSuffixExceptionListBytes");
                        bArr5 = null;
                    }
                    str3 = companion3.binarySearch(bArr5, bArr, i7);
                    if (str3 != null) {
                        break;
                    }
                    i7 = i8;
                }
            }
            str3 = null;
            if (str3 != null) {
                return C13755w.m31593s0(C12775o.m28647q("!", str3), new char[]{'.'}, false, 0, 6, (Object) null);
            } else if (str == null && str2 == null) {
                return PREVAILING_RULE;
            } else {
                if (str == null) {
                    list3 = null;
                } else {
                    list3 = C13755w.m31593s0(str, new char[]{'.'}, false, 0, 6, (Object) null);
                }
                if (list3 == null) {
                    list3 = C12726w.m28524k();
                }
                if (str2 != null) {
                    list2 = C13755w.m31593s0(str2, new char[]{'.'}, false, 0, 6, (Object) null);
                }
                if (list2 == null) {
                    list2 = C12726w.m28524k();
                }
                if (list3.size() > list2.size()) {
                    return list3;
                }
                return list2;
            }
        } else {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        p392mf.C12941b.m29245a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readTheList() {
        /*
            r4 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            okio.o r1 = new okio.o
            okio.y0 r0 = okio.C13145j0.m29747l(r0)
            r1.<init>(r0)
            okio.e r0 = okio.C13145j0.m29739d(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x0045 }
            long r1 = (long) r1     // Catch:{ all -> 0x0045 }
            byte[] r1 = r0.mo52513Z(r1)     // Catch:{ all -> 0x0045 }
            int r2 = r0.readInt()     // Catch:{ all -> 0x0045 }
            long r2 = (long) r2     // Catch:{ all -> 0x0045 }
            byte[] r2 = r0.mo52513Z(r2)     // Catch:{ all -> 0x0045 }
            ef.v r3 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0045 }
            r3 = 0
            p392mf.C12941b.m29245a(r0, r3)
            monitor-enter(r4)
            kotlin.jvm.internal.C12775o.m28636f(r1)     // Catch:{ all -> 0x0042 }
            r4.publicSuffixListBytes = r1     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C12775o.m28636f(r2)     // Catch:{ all -> 0x0042 }
            r4.publicSuffixExceptionListBytes = r2     // Catch:{ all -> 0x0042 }
            monitor-exit(r4)
            java.util.concurrent.CountDownLatch r0 = r4.readCompleteLatch
            r0.countDown()
            return
        L_0x0042:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r2 = move-exception
            p392mf.C12941b.m29245a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.readTheList():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readTheListUninterruptibly() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.readTheList()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002c
        L_0x0010:
            r1 = move-exception
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x000e }
            okhttp3.internal.platform.Platform r2 = r2.get()     // Catch:{ all -> 0x000e }
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.log(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0026
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0026:
            return
        L_0x0027:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0035:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.readTheListUninterruptibly():void");
    }

    private final List<String> splitDomain(String str) {
        List<String> s0 = C13755w.m31593s0(str, new char[]{'.'}, false, 0, 6, (Object) null);
        if (C12775o.m28634d(C12686e0.m28231j0(s0), "")) {
            return C12686e0.m28217V(s0, 1);
        }
        return s0;
    }

    public final String getEffectiveTldPlusOne(String str) {
        int i;
        int i2;
        C12775o.m28639i(str, "domain");
        String unicode = IDN.toUnicode(str);
        C12775o.m28638h(unicode, "unicodeDomain");
        List<String> splitDomain = splitDomain(unicode);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            i2 = splitDomain.size();
            i = findMatchingRule.size();
        } else {
            i2 = splitDomain.size();
            i = findMatchingRule.size() + 1;
        }
        return C13662o.m31286s(C13662o.m31279l(C12686e0.m28213R(splitDomain(str)), i2 - i), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        C12775o.m28639i(bArr, "publicSuffixListBytes");
        C12775o.m28639i(bArr2, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
