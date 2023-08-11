package androidx.constraintlayout.core.widgets;

public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x */
    public int f422x;

    /* renamed from: y */
    public int f423y;

    public boolean contains(int i, int i2) {
        int i3;
        int i4 = this.f422x;
        if (i < i4 || i >= i4 + this.width || i2 < (i3 = this.f423y) || i2 >= i3 + this.height) {
            return false;
        }
        return true;
    }

    public int getCenterX() {
        return (this.f422x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f423y + this.height) / 2;
    }

    /* access modifiers changed from: package-private */
    public void grow(int i, int i2) {
        this.f422x -= i;
        this.f423y -= i2;
        this.width += i * 2;
        this.height += i2 * 2;
    }

    /* access modifiers changed from: package-private */
    public boolean intersects(Rectangle rectangle) {
        int i;
        int i2;
        int i3 = this.f422x;
        int i4 = rectangle.f422x;
        if (i3 < i4 || i3 >= i4 + rectangle.width || (i = this.f423y) < (i2 = rectangle.f423y) || i >= i2 + rectangle.height) {
            return false;
        }
        return true;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        this.f422x = i;
        this.f423y = i2;
        this.width = i3;
        this.height = i4;
    }
}
