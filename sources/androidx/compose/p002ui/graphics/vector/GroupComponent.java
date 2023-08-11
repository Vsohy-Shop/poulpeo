package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.graphics.AndroidPath_androidKt;
import androidx.compose.p002ui.graphics.Matrix;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.drawscope.DrawContext;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawTransform;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,555:1\n33#2,6:556\n33#2,6:571\n33#2,6:580\n261#3,7:562\n268#3:570\n269#3,3:577\n1#4:569\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n*L\n374#1:556,6\n536#1:571,6\n549#1:580,6\n529#1:562,7\n529#1:570\n529#1:577,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.GroupComponent */
/* compiled from: Vector.kt */
public final class GroupComponent extends VNode {
    private final List<VNode> children = new ArrayList();
    private Path clipPath;
    private List<? extends PathNode> clipPathData = VectorKt.getEmptyPath();
    private float[] groupMatrix;
    private C13074a<C11921v> invalidateListener;
    private boolean isClipPathDirty = true;
    private boolean isMatrixDirty = true;
    private String name = "";
    private PathParser parser;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float translationX;
    private float translationY;

    public GroupComponent() {
        super((DefaultConstructorMarker) null);
    }

    private final boolean getWillClipPath() {
        return !this.clipPathData.isEmpty();
    }

    private final void updateClipPath() {
        if (getWillClipPath()) {
            PathParser pathParser = this.parser;
            if (pathParser == null) {
                pathParser = new PathParser();
                this.parser = pathParser;
            } else {
                pathParser.clear();
            }
            Path path = this.clipPath;
            if (path == null) {
                path = AndroidPath_androidKt.Path();
                this.clipPath = path;
            } else {
                path.reset();
            }
            pathParser.addPathNodes(this.clipPathData).toPath(path);
        }
    }

    private final void updateMatrix() {
        float[] fArr = this.groupMatrix;
        if (fArr == null) {
            fArr = Matrix.m35898constructorimpl$default((float[]) null, 1, (DefaultConstructorMarker) null);
            this.groupMatrix = fArr;
        } else {
            Matrix.m35907resetimpl(fArr);
        }
        Matrix.m35918translateimpl$default(fArr, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, (Object) null);
        Matrix.m35910rotateZimpl(fArr, this.rotation);
        Matrix.m35911scaleimpl(fArr, this.scaleX, this.scaleY, 1.0f);
        Matrix.m35918translateimpl$default(fArr, -this.pivotX, -this.pivotY, 0.0f, 4, (Object) null);
    }

    public void draw(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "<this>");
        if (this.isMatrixDirty) {
            updateMatrix();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            updateClipPath();
            this.isClipPathDirty = false;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long r2 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        float[] fArr = this.groupMatrix;
        if (fArr != null) {
            transform.m36334transform58bKbWc(Matrix.m35896boximpl(fArr).m35919unboximpl());
        }
        Path path = this.clipPath;
        if (getWillClipPath() && path != null) {
            DrawTransform.m36324clipPathmtrdDE$default(transform, path, 0, 2, (Object) null);
        }
        List<VNode> list = this.children;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).draw(drawScope);
        }
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r2);
    }

    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    public C13074a<C11921v> getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    public final String getName() {
        return this.name;
    }

    public final int getNumChildren() {
        return this.children.size();
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void insertAt(int i, VNode vNode) {
        C12775o.m28639i(vNode, "instance");
        if (i < getNumChildren()) {
            this.children.set(i, vNode);
        } else {
            this.children.add(vNode);
        }
        vNode.setInvalidateListener$ui_release(getInvalidateListener$ui_release());
        invalidate();
    }

    public final void move(int i, int i2, int i3) {
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                this.children.remove(i);
                this.children.add(i2, this.children.get(i));
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                this.children.remove(i);
                this.children.add(i2 - 1, this.children.get(i));
                i4++;
            }
        }
        invalidate();
    }

    public final void remove(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (i < this.children.size()) {
                this.children.get(i).setInvalidateListener$ui_release((C13074a<C11921v>) null);
                this.children.remove(i);
            }
        }
        invalidate();
    }

    public final void setClipPathData(List<? extends PathNode> list) {
        C12775o.m28639i(list, "value");
        this.clipPathData = list;
        this.isClipPathDirty = true;
        invalidate();
    }

    public void setInvalidateListener$ui_release(C13074a<C11921v> aVar) {
        this.invalidateListener = aVar;
        List<VNode> list = this.children;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).setInvalidateListener$ui_release(aVar);
        }
    }

    public final void setName(String str) {
        C12775o.m28639i(str, "value");
        this.name = str;
        invalidate();
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setRotation(float f) {
        this.rotation = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.name);
        List<VNode> list = this.children;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append("\t");
            sb.append(list.get(i).toString());
            sb.append("\n");
        }
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "sb.toString()");
        return sb2;
    }
}
