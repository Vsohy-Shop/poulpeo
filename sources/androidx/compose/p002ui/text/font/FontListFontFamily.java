package androidx.compose.p002ui.text.font;

import androidx.compose.runtime.Immutable;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C12761g;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p412pf.C13212a;

@Immutable
@SourceDebugExtension({"SMAP\nFontFamily.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamily.kt\nandroidx/compose/ui/text/font/FontListFontFamily\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n1#2:271\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.FontListFontFamily */
/* compiled from: FontFamily.kt */
public final class FontListFontFamily extends FileBasedFontFamily implements List<Font>, C13212a {
    public static final int $stable = 0;
    private final /* synthetic */ List<Font> $$delegate_0;
    private final List<Font> fonts;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FontListFontFamily(List<? extends Font> list) {
        super((DefaultConstructorMarker) null);
        C12775o.m28639i(list, "fonts");
        this.$$delegate_0 = list;
        Collection collection = list;
        if (!collection.isEmpty()) {
            this.fonts = new ArrayList(collection);
            return;
        }
        throw new IllegalStateException("At least one font should be passed to FontFamily".toString());
    }

    public void add(int i, Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends Font> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Font font) {
        C12775o.m28639i(font, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return this.$$delegate_0.contains(font);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        return this.$$delegate_0.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FontListFontFamily) && C12775o.m28634d(this.fonts, ((FontListFontFamily) obj).fonts)) {
            return true;
        }
        return false;
    }

    public Font get(int i) {
        return this.$$delegate_0.get(i);
    }

    public final List<Font> getFonts() {
        return this.fonts;
    }

    public int getSize() {
        return this.$$delegate_0.size();
    }

    public int hashCode() {
        return this.fonts.hashCode();
    }

    public int indexOf(Font font) {
        C12775o.m28639i(font, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return this.$$delegate_0.indexOf(font);
    }

    public boolean isEmpty() {
        return this.$$delegate_0.isEmpty();
    }

    public Iterator<Font> iterator() {
        return this.$$delegate_0.iterator();
    }

    public int lastIndexOf(Font font) {
        C12775o.m28639i(font, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return this.$$delegate_0.lastIndexOf(font);
    }

    public ListIterator<Font> listIterator() {
        return this.$$delegate_0.listIterator();
    }

    public Font remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<Font> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Font set(int i, Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public void sort(Comparator<? super Font> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<Font> subList(int i, int i2) {
        return this.$$delegate_0.subList(i, i2);
    }

    public Object[] toArray() {
        return C12761g.m28583a(this);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.fonts + ')';
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends Font> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Font)) {
            return false;
        }
        return contains((Font) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Font)) {
            return -1;
        }
        return indexOf((Font) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Font)) {
            return -1;
        }
        return lastIndexOf((Font) obj);
    }

    public ListIterator<Font> listIterator(int i) {
        return this.$$delegate_0.listIterator(i);
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        return C12761g.m28584b(this, tArr);
    }

    public boolean add(Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
