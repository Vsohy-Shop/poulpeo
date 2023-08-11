package androidx.compose.p002ui.text.intl;

import androidx.compose.runtime.Immutable;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.C12761g;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p412pf.C13212a;

@Immutable
@SourceDebugExtension({"SMAP\nLocaleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,84:1\n151#2,3:85\n33#2,4:88\n154#2,2:92\n38#2:94\n156#2:95\n33#2,4:96\n154#2,2:100\n38#2:102\n156#2:103\n*S KotlinDebug\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n*L\n48#1:85,3\n48#1:88,4\n48#1:92,2\n48#1:94\n48#1:95\n48#1:96,4\n48#1:100,2\n48#1:102\n48#1:103\n*E\n"})
/* renamed from: androidx.compose.ui.text.intl.LocaleList */
/* compiled from: LocaleList.kt */
public final class LocaleList implements Collection<Locale>, C13212a {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final List<Locale> localeList;
    private final int size;

    /* renamed from: androidx.compose.ui.text.intl.LocaleList$Companion */
    /* compiled from: LocaleList.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LocaleList getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent();
        }
    }

    public LocaleList(List<Locale> list) {
        C12775o.m28639i(list, "localeList");
        this.localeList = list;
        this.size = list.size();
    }

    public boolean add(Locale locale) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends Locale> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Locale)) {
            return false;
        }
        return contains((Locale) obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        return this.localeList.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LocaleList) && C12775o.m28634d(this.localeList, ((LocaleList) obj).localeList)) {
            return true;
        }
        return false;
    }

    public final Locale get(int i) {
        return this.localeList.get(i);
    }

    public final List<Locale> getLocaleList() {
        return this.localeList;
    }

    public int getSize() {
        return this.size;
    }

    public int hashCode() {
        return this.localeList.hashCode();
    }

    public boolean isEmpty() {
        return this.localeList.isEmpty();
    }

    public Iterator<Locale> iterator() {
        return this.localeList.iterator();
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeIf(Predicate<? super Locale> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public Object[] toArray() {
        return C12761g.m28583a(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.localeList + ')';
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Locale locale) {
        C12775o.m28639i(locale, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return this.localeList.contains(locale);
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        return C12761g.m28584b(this, tArr);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocaleList(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "languageTags"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = ","
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r8
            java.util.List r8 = p454wf.C13755w.m31594t0(r1, r2, r3, r4, r5, r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.size()
            r0.<init>(r1)
            int r1 = r8.size()
            r2 = 0
            r3 = r2
        L_0x0023:
            if (r3 >= r1) goto L_0x0039
            java.lang.Object r4 = r8.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = p454wf.C13755w.m31561N0(r4)
            java.lang.String r4 = r4.toString()
            r0.add(r4)
            int r3 = r3 + 1
            goto L_0x0023
        L_0x0039:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r1 = r0.size()
            r8.<init>(r1)
            int r1 = r0.size()
        L_0x0046:
            if (r2 >= r1) goto L_0x0059
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            androidx.compose.ui.text.intl.Locale r4 = new androidx.compose.ui.text.intl.Locale
            r4.<init>((java.lang.String) r3)
            r8.add(r4)
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0059:
            r7.<init>((java.util.List<androidx.compose.p002ui.text.intl.Locale>) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.intl.LocaleList.<init>(java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LocaleList(Locale... localeArr) {
        this((List<Locale>) C12710p.m28405g0(localeArr));
        C12775o.m28639i(localeArr, "locales");
    }
}
