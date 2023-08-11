package okhttp3;

import androidx.autofill.HintConstants;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.jvm.internal.C12751c;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import p336ef.C11906l;
import p336ef.C11915r;
import p370jf.C12624c;
import p412pf.C13212a;

/* compiled from: Headers.kt */
public final class Headers implements Iterable<C11906l<? extends String, ? extends String>>, C13212a {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String[] namesAndValues;

    /* compiled from: Headers.kt */
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String str) {
            C12775o.m28639i(str, "line");
            int V = C13755w.m31570V(str, ':', 0, false, 6, (Object) null);
            if (V != -1) {
                String substring = str.substring(0, V);
                C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String obj = C13755w.m31561N0(substring).toString();
                String substring2 = str.substring(V + 1);
                C12775o.m28638h(substring2, "this as java.lang.String).substring(startIndex)");
                add(obj, substring2);
                return this;
            }
            throw new IllegalArgumentException(C12775o.m28647q("Unexpected header: ", str).toString());
        }

        public final Builder addAll(Headers headers) {
            C12775o.m28639i(headers, "headers");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                addLenient$okhttp(headers.name(i), headers.value(i));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String str) {
            C12775o.m28639i(str, "line");
            int V = C13755w.m31570V(str, ':', 1, false, 4, (Object) null);
            if (V != -1) {
                String substring = str.substring(0, V);
                C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = str.substring(V + 1);
                C12775o.m28638h(substring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                C12775o.m28638h(substring3, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", substring3);
            } else {
                addLenient$okhttp("", str);
            }
            return this;
        }

        public final Builder addUnsafeNonAscii(String str, String str2) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            C12775o.m28639i(str2, "value");
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array, (DefaultConstructorMarker) null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String get(String str) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            int size = this.namesAndValues.size() - 2;
            int c = C12624c.m28013c(size, 0, -2);
            if (c > size) {
                return null;
            }
            while (true) {
                int i = size - 2;
                if (C13754v.m31530r(str, this.namesAndValues.get(size), true)) {
                    return this.namesAndValues.get(size + 1);
                }
                if (size == c) {
                    return null;
                }
                size = i;
            }
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String str) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            int i = 0;
            while (i < getNamesAndValues$okhttp().size()) {
                if (C13754v.m31530r(str, getNamesAndValues$okhttp().get(i), true)) {
                    getNamesAndValues$okhttp().remove(i);
                    getNamesAndValues$okhttp().remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final Builder set(String str, Date date) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            C12775o.m28639i(date, "value");
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }

        public final Builder set(String str, Instant instant) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            C12775o.m28639i(instant, "value");
            return set(str, new Date(instant.toEpochMilli()));
        }

        public final Builder set(String str, String str2) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            C12775o.m28639i(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder add(String str, String str2) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            C12775o.m28639i(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder addLenient$okhttp(String str, String str2) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            C12775o.m28639i(str2, "value");
            getNamesAndValues$okhttp().add(str);
            getNamesAndValues$okhttp().add(C13755w.m31561N0(str2).toString());
            return this;
        }

        public final Builder add(String str, Date date) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            C12775o.m28639i(date, "value");
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        public final Builder add(String str, Instant instant) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            C12775o.m28639i(instant, "value");
            add(str, new Date(instant.toEpochMilli()));
            return this;
        }
    }

    /* compiled from: Headers.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final void checkName(String str) {
            boolean z;
            boolean z2;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    char charAt = str.charAt(i);
                    if ('!' > charAt || charAt >= 127) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        i = i2;
                    } else {
                        throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005b A[LOOP:0: B:1:0x0006->B:20:0x005b, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0026 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void checkValue(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                int r0 = r8.length()
                r1 = 0
                r2 = r1
            L_0x0006:
                if (r2 >= r0) goto L_0x005d
                int r3 = r2 + 1
                char r4 = r8.charAt(r2)
                r5 = 9
                r6 = 1
                if (r4 == r5) goto L_0x0023
                r5 = 32
                if (r5 > r4) goto L_0x001d
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r5) goto L_0x001d
                r5 = r6
                goto L_0x001e
            L_0x001d:
                r5 = r1
            L_0x001e:
                if (r5 == 0) goto L_0x0021
                goto L_0x0023
            L_0x0021:
                r5 = r1
                goto L_0x0024
            L_0x0023:
                r5 = r6
            L_0x0024:
                if (r5 != 0) goto L_0x005b
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r0[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0[r6] = r1
                r1 = 2
                r0[r1] = r9
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r0 = okhttp3.internal.Util.format(r1, r0)
                boolean r9 = okhttp3.internal.Util.isSensitiveHeader(r9)
                if (r9 == 0) goto L_0x0047
                java.lang.String r8 = ""
                goto L_0x004d
            L_0x0047:
                java.lang.String r9 = ": "
                java.lang.String r8 = kotlin.jvm.internal.C12775o.m28647q(r9, r8)
            L_0x004d:
                java.lang.String r8 = kotlin.jvm.internal.C12775o.m28647q(r0, r8)
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
            L_0x005b:
                r2 = r3
                goto L_0x0006
            L_0x005d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Headers.Companion.checkValue(java.lang.String, java.lang.String):void");
        }

        /* access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int c = C12624c.m28013c(length, 0, -2);
            if (c > length) {
                return null;
            }
            while (true) {
                int i = length - 2;
                if (C13754v.m31530r(str, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length == c) {
                    return null;
                }
                length = i;
            }
        }

        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m38791deprecated_of(String... strArr) {
            C12775o.m28639i(strArr, "namesAndValues");
            return mo51311of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* renamed from: of */
        public final Headers mo51311of(String... strArr) {
            C12775o.m28639i(strArr, "namesAndValues");
            int i = 0;
            if (strArr.length % 2 == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    String str = strArr2[i2];
                    if (str != null) {
                        strArr2[i2] = C13755w.m31561N0(str).toString();
                        i2 = i3;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                int c = C12624c.m28013c(0, strArr2.length - 1, 2);
                if (c >= 0) {
                    while (true) {
                        int i4 = i + 2;
                        String str2 = strArr2[i];
                        String str3 = strArr2[i + 1];
                        checkName(str2);
                        checkValue(str3, str2);
                        if (i == c) {
                            break;
                        }
                        i = i4;
                    }
                }
                return new Headers(strArr2, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }

        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m38790deprecated_of(Map<String, String> map) {
            C12775o.m28639i(map, "headers");
            return mo51310of(map);
        }

        /* renamed from: of */
        public final Headers mo51310of(Map<String, String> map) {
            C12775o.m28639i(map, "<this>");
            String[] strArr = new String[(map.size() * 2)];
            int i = 0;
            for (Map.Entry next : map.entrySet()) {
                String obj = C13755w.m31561N0((String) next.getKey()).toString();
                String obj2 = C13755w.m31561N0((String) next.getValue()).toString();
                checkName(obj);
                checkValue(obj2, obj);
                strArr[i] = obj;
                strArr[i + 1] = obj2;
                i += 2;
            }
            return new Headers(strArr, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    /* renamed from: of */
    public static final Headers m29486of(Map<String, String> map) {
        return Companion.mo51310of(map);
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m38789deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = (long) (strArr.length * 2);
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.namesAndValues[i].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Headers) || !Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues)) {
            return false;
        }
        return true;
    }

    public final String get(String str) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        return Companion.get(this.namesAndValues, str);
    }

    public final Date getDate(String str) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        String str2 = get(str);
        if (str2 == null) {
            return null;
        }
        return DatesKt.toHttpDateOrNull(str2);
    }

    public final Instant getInstant(String str) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        Date date = getDate(str);
        if (date == null) {
            return null;
        }
        return date.toInstant();
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    public Iterator<C11906l<String, String>> iterator() {
        int size = size();
        C11906l[] lVarArr = new C11906l[size];
        for (int i = 0; i < size; i++) {
            lVarArr[i] = C11915r.m25707a(name(i), value(i));
        }
        return C12751c.m28576a(lVarArr);
    }

    public final String name(int i) {
        return this.namesAndValues[i * 2];
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(C13754v.m31531s(C12770k0.f20423a));
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        C12775o.m28638h(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        boolean unused = C12669b0.m28180D(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(C13754v.m31531s(C12770k0.f20423a));
        int size = size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String name = name(i);
            Locale locale = Locale.US;
            C12775o.m28638h(locale, "US");
            String lowerCase = name.toLowerCase(locale);
            C12775o.m28638h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i));
            i = i2;
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String name = name(i);
            String value = value(i);
            sb.append(name);
            sb.append(": ");
            if (Util.isSensitiveHeader(name)) {
                value = "██";
            }
            sb.append(value);
            sb.append("\n");
            i = i2;
        }
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String value(int i) {
        return this.namesAndValues[(i * 2) + 1];
    }

    public final List<String> values(String str) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        int size = size();
        ArrayList arrayList = null;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (C13754v.m31530r(str, name(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
            i = i2;
        }
        if (arrayList == null) {
            return C12726w.m28524k();
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        C12775o.m28638h(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    /* renamed from: of */
    public static final Headers m29487of(String... strArr) {
        return Companion.mo51311of(strArr);
    }
}
