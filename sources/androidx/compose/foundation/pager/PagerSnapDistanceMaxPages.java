package androidx.compose.foundation.pager;

/* compiled from: Pager.kt */
public final class PagerSnapDistanceMaxPages implements PagerSnapDistance {
    private final int pagesLimit;

    public PagerSnapDistanceMaxPages(int i) {
        this.pagesLimit = i;
    }

    public int calculateTargetPage(int i, int i2, float f, int i3, int i4) {
        int i5 = this.pagesLimit;
        return C13537l.m30886m(i2, i - i5, i + i5);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PagerSnapDistanceMaxPages) || this.pagesLimit != ((PagerSnapDistanceMaxPages) obj).pagesLimit) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.pagesLimit);
    }
}
