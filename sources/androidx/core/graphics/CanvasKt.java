package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: Canvas.kt */
public final class CanvasKt {
    public static final void withClip(Canvas canvas, Rect rect, Function1<? super Canvas, C11921v> function1) {
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(rect, "clipRect");
        C12775o.m28639i(function1, "block");
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            function1.invoke(canvas);
        } finally {
            C12773m.m28629b(1);
            canvas.restoreToCount(save);
            C12773m.m28628a(1);
        }
    }

    public static final void withMatrix(Canvas canvas, Matrix matrix, Function1<? super Canvas, C11921v> function1) {
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(matrix, "matrix");
        C12775o.m28639i(function1, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            function1.invoke(canvas);
        } finally {
            C12773m.m28629b(1);
            canvas.restoreToCount(save);
            C12773m.m28628a(1);
        }
    }

    public static /* synthetic */ void withMatrix$default(Canvas canvas, Matrix matrix, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = new Matrix();
        }
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(matrix, "matrix");
        C12775o.m28639i(function1, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            function1.invoke(canvas);
        } finally {
            C12773m.m28629b(1);
            canvas.restoreToCount(save);
            C12773m.m28628a(1);
        }
    }

    public static final void withRotation(Canvas canvas, float f, float f2, float f3, Function1<? super Canvas, C11921v> function1) {
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(function1, "block");
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            function1.invoke(canvas);
        } finally {
            C12773m.m28629b(1);
            canvas.restoreToCount(save);
            C12773m.m28628a(1);
        }
    }

    public static /* synthetic */ void withRotation$default(Canvas canvas, float f, float f2, float f3, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(function1, "block");
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            function1.invoke(canvas);
        } finally {
            C12773m.m28629b(1);
            canvas.restoreToCount(save);
            C12773m.m28628a(1);
        }
    }

    public static final void withSave(Canvas canvas, Function1<? super Canvas, C11921v> function1) {
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(function1, "block");
        int save = canvas.save();
        try {
            function1.invoke(canvas);
        } finally {
            C12773m.m28629b(1);
            canvas.restoreToCount(save);
            C12773m.m28628a(1);
        }
    }

    public static final void withScale(Canvas canvas, float f, float f2, float f3, float f4, Function1<? super Canvas, C11921v> function1) {
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(function1, "block");
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            function1.invoke(canvas);
        } finally {
            C12773m.m28629b(1);
            canvas.restoreToCount(save);
            C12773m.m28628a(1);
        }
    }

    public static /* synthetic */ void withScale$default(Canvas canvas, float f, float f2, float f3, float f4, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(function1, "block");
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            function1.invoke(canvas);
        } finally {
            C12773m.m28629b(1);
            canvas.restoreToCount(save);
            C12773m.m28628a(1);
        }
    }

    public static final void withSkew(Canvas canvas, float f, float f2, Function1<? super Canvas, C11921v> function1) {
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(function1, "block");
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            function1.invoke(canvas);
        } finally {
            C12773m.m28629b(1);
            canvas.restoreToCount(save);
            C12773m.m28628a(1);
        }
    }

    public static /* synthetic */ void withSkew$default(Canvas canvas, float f, float f2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(function1, "block");
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            function1.invoke(canvas);
        } finally {
            C12773m.m28629b(1);
            canvas.restoreToCount(save);
            C12773m.m28628a(1);
        }
    }

    public static final void withTranslation(Canvas canvas, float f, float f2, Function1<? super Canvas, C11921v> function1) {
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(function1, "block");
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            function1.invoke(canvas);
        } finally {
            C12773m.m28629b(1);
            canvas.restoreToCount(save);
            C12773m.m28628a(1);
        }
    }

    public static /* synthetic */ void withTranslation$default(Canvas canvas, float f, float f2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(function1, "block");
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            function1.invoke(canvas);
        } finally {
            C12773m.m28629b(1);
            canvas.restoreToCount(save);
            C12773m.m28628a(1);
        }
    }

    public static final void withClip(Canvas canvas, RectF rectF, Function1<? super Canvas, C11921v> function1) {
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(rectF, "clipRect");
        C12775o.m28639i(function1, "block");
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            function1.invoke(canvas);
        } finally {
            C12773m.m28629b(1);
            canvas.restoreToCount(save);
            C12773m.m28628a(1);
        }
    }

    public static final void withClip(Canvas canvas, int i, int i2, int i3, int i4, Function1<? super Canvas, C11921v> function1) {
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(function1, "block");
        int save = canvas.save();
        canvas.clipRect(i, i2, i3, i4);
        try {
            function1.invoke(canvas);
        } finally {
            C12773m.m28629b(1);
            canvas.restoreToCount(save);
            C12773m.m28628a(1);
        }
    }

    public static final void withClip(Canvas canvas, float f, float f2, float f3, float f4, Function1<? super Canvas, C11921v> function1) {
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(function1, "block");
        int save = canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        try {
            function1.invoke(canvas);
        } finally {
            C12773m.m28629b(1);
            canvas.restoreToCount(save);
            C12773m.m28628a(1);
        }
    }

    public static final void withClip(Canvas canvas, Path path, Function1<? super Canvas, C11921v> function1) {
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(path, "clipPath");
        C12775o.m28639i(function1, "block");
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            function1.invoke(canvas);
        } finally {
            C12773m.m28629b(1);
            canvas.restoreToCount(save);
            C12773m.m28628a(1);
        }
    }
}
