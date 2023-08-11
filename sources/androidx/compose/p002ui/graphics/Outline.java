package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.RoundRect;
import androidx.compose.p002ui.geometry.RoundRectKt;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* renamed from: androidx.compose.ui.graphics.Outline */
/* compiled from: Outline.kt */
public abstract class Outline {

    /* renamed from: androidx.compose.ui.graphics.Outline$Generic */
    /* compiled from: Outline.kt */
    public static final class Generic extends Outline {
        private final Path path;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Generic(Path path2) {
            super((DefaultConstructorMarker) null);
            C12775o.m28639i(path2, "path");
            this.path = path2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Generic) && C12775o.m28634d(this.path, ((Generic) obj).path)) {
                return true;
            }
            return false;
        }

        public Rect getBounds() {
            return this.path.getBounds();
        }

        public final Path getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode();
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.Outline$Rectangle */
    /* compiled from: Outline.kt */
    public static final class Rectangle extends Outline {
        private final Rect rect;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Rectangle(Rect rect2) {
            super((DefaultConstructorMarker) null);
            C12775o.m28639i(rect2, "rect");
            this.rect = rect2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Rectangle) && C12775o.m28634d(this.rect, ((Rectangle) obj).rect)) {
                return true;
            }
            return false;
        }

        public Rect getBounds() {
            return this.rect;
        }

        public final Rect getRect() {
            return this.rect;
        }

        public int hashCode() {
            return this.rect.hashCode();
        }
    }

    @Immutable
    @SourceDebugExtension({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/Outline$Rounded\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1#2:308\n*E\n"})
    /* renamed from: androidx.compose.ui.graphics.Outline$Rounded */
    /* compiled from: Outline.kt */
    public static final class Rounded extends Outline {
        private final RoundRect roundRect;
        private final Path roundRectPath;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Rounded(RoundRect roundRect2) {
            super((DefaultConstructorMarker) null);
            C12775o.m28639i(roundRect2, "roundRect");
            Path path = null;
            this.roundRect = roundRect2;
            if (!OutlineKt.hasSameCornerRadius(roundRect2)) {
                path = AndroidPath_androidKt.Path();
                path.addRoundRect(roundRect2);
            }
            this.roundRectPath = path;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Rounded) && C12775o.m28634d(this.roundRect, ((Rounded) obj).roundRect)) {
                return true;
            }
            return false;
        }

        public Rect getBounds() {
            return RoundRectKt.getBoundingRect(this.roundRect);
        }

        public final RoundRect getRoundRect() {
            return this.roundRect;
        }

        public final Path getRoundRectPath$ui_graphics_release() {
            return this.roundRectPath;
        }

        public int hashCode() {
            return this.roundRect.hashCode();
        }
    }

    private Outline() {
    }

    public /* synthetic */ Outline(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Rect getBounds();
}
