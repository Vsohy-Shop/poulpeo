package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.C1303R;

public class ImageFilterButton extends AppCompatImageButton {
    private Drawable mAltDrawable = null;
    private float mCrossfade = 0.0f;
    private Drawable mDrawable = null;
    private ImageFilterView.ImageMatrix mImageMatrix = new ImageFilterView.ImageMatrix();
    LayerDrawable mLayer;
    Drawable[] mLayers = new Drawable[2];
    private boolean mOverlay = true;
    private float mPanX = Float.NaN;
    private float mPanY = Float.NaN;
    private Path mPath;
    RectF mRect;
    private float mRotate = Float.NaN;
    /* access modifiers changed from: private */
    public float mRound = Float.NaN;
    /* access modifiers changed from: private */
    public float mRoundPercent = 0.0f;
    ViewOutlineProvider mViewOutlineProvider;
    private float mZoom = Float.NaN;

    public ImageFilterButton(Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1303R.styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.mAltDrawable = obtainStyledAttributes.getDrawable(C1303R.styleable.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1303R.styleable.ImageFilterView_crossfade) {
                    this.mCrossfade = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C1303R.styleable.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C1303R.styleable.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C1303R.styleable.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C1303R.styleable.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C1303R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C1303R.styleable.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.mOverlay));
                } else if (index == C1303R.styleable.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.mPanX));
                } else if (index == C1303R.styleable.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.mPanY));
                } else if (index == C1303R.styleable.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.mRotate));
                } else if (index == C1303R.styleable.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.mZoom));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.mDrawable = drawable;
            if (this.mAltDrawable == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.mDrawable = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.mLayers;
                    Drawable mutate = drawable2.mutate();
                    this.mDrawable = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.mLayers;
            Drawable mutate2 = getDrawable().mutate();
            this.mDrawable = mutate2;
            drawableArr2[0] = mutate2;
            this.mLayers[1] = this.mAltDrawable.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.mLayers);
            this.mLayer = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.mCrossfade * 255.0f));
            if (!this.mOverlay) {
                this.mLayer.getDrawable(0).setAlpha((int) ((1.0f - this.mCrossfade) * 255.0f));
            }
            super.setImageDrawable(this.mLayer);
        }
    }

    private void setMatrix() {
        float f;
        float f2;
        float f3;
        float f4;
        if (!Float.isNaN(this.mPanX) || !Float.isNaN(this.mPanY) || !Float.isNaN(this.mZoom) || !Float.isNaN(this.mRotate)) {
            float f5 = 0.0f;
            if (Float.isNaN(this.mPanX)) {
                f = 0.0f;
            } else {
                f = this.mPanX;
            }
            if (Float.isNaN(this.mPanY)) {
                f2 = 0.0f;
            } else {
                f2 = this.mPanY;
            }
            if (Float.isNaN(this.mZoom)) {
                f3 = 1.0f;
            } else {
                f3 = this.mZoom;
            }
            if (!Float.isNaN(this.mRotate)) {
                f5 = this.mRotate;
            }
            Matrix matrix = new Matrix();
            matrix.reset();
            float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
            float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
            float width = (float) getWidth();
            float height = (float) getHeight();
            if (intrinsicWidth * height < intrinsicHeight * width) {
                f4 = width / intrinsicWidth;
            } else {
                f4 = height / intrinsicHeight;
            }
            float f6 = f3 * f4;
            matrix.postScale(f6, f6);
            float f7 = intrinsicWidth * f6;
            float f8 = f6 * intrinsicHeight;
            matrix.postTranslate((((f * (width - f7)) + width) - f7) * 0.5f, (((f2 * (height - f8)) + height) - f8) * 0.5f);
            matrix.postRotate(f5, width / 2.0f, height / 2.0f);
            setImageMatrix(matrix);
            setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    private void setOverlay(boolean z) {
        this.mOverlay = z;
    }

    private void updateViewMatrix() {
        if (!Float.isNaN(this.mPanX) || !Float.isNaN(this.mPanY) || !Float.isNaN(this.mZoom) || !Float.isNaN(this.mRotate)) {
            setMatrix();
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.mImageMatrix.mContrast;
    }

    public float getCrossfade() {
        return this.mCrossfade;
    }

    public float getImagePanX() {
        return this.mPanX;
    }

    public float getImagePanY() {
        return this.mPanY;
    }

    public float getImageRotate() {
        return this.mRotate;
    }

    public float getImageZoom() {
        return this.mZoom;
    }

    public float getRound() {
        return this.mRound;
    }

    public float getRoundPercent() {
        return this.mRoundPercent;
    }

    public float getSaturation() {
        return this.mImageMatrix.mSaturation;
    }

    public float getWarmth() {
        return this.mImageMatrix.mWarmth;
    }

    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        setMatrix();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = AppCompatResources.getDrawable(getContext(), i).mutate();
        this.mAltDrawable = mutate;
        Drawable[] drawableArr = this.mLayers;
        drawableArr[0] = this.mDrawable;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.mLayers);
        this.mLayer = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.mCrossfade);
    }

    public void setBrightness(float f) {
        ImageFilterView.ImageMatrix imageMatrix = this.mImageMatrix;
        imageMatrix.mBrightness = f;
        imageMatrix.updateMatrix(this);
    }

    public void setContrast(float f) {
        ImageFilterView.ImageMatrix imageMatrix = this.mImageMatrix;
        imageMatrix.mContrast = f;
        imageMatrix.updateMatrix(this);
    }

    public void setCrossfade(float f) {
        this.mCrossfade = f;
        if (this.mLayers != null) {
            if (!this.mOverlay) {
                this.mLayer.getDrawable(0).setAlpha((int) ((1.0f - this.mCrossfade) * 255.0f));
            }
            this.mLayer.getDrawable(1).setAlpha((int) (this.mCrossfade * 255.0f));
            super.setImageDrawable(this.mLayer);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.mAltDrawable == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.mDrawable = mutate;
        Drawable[] drawableArr = this.mLayers;
        drawableArr[0] = mutate;
        drawableArr[1] = this.mAltDrawable;
        LayerDrawable layerDrawable = new LayerDrawable(this.mLayers);
        this.mLayer = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.mCrossfade);
    }

    public void setImagePanX(float f) {
        this.mPanX = f;
        updateViewMatrix();
    }

    public void setImagePanY(float f) {
        this.mPanY = f;
        updateViewMatrix();
    }

    public void setImageResource(int i) {
        if (this.mAltDrawable != null) {
            Drawable mutate = AppCompatResources.getDrawable(getContext(), i).mutate();
            this.mDrawable = mutate;
            Drawable[] drawableArr = this.mLayers;
            drawableArr[0] = mutate;
            drawableArr[1] = this.mAltDrawable;
            LayerDrawable layerDrawable = new LayerDrawable(this.mLayers);
            this.mLayer = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.mCrossfade);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.mRotate = f;
        updateViewMatrix();
    }

    public void setImageZoom(float f) {
        this.mZoom = f;
        updateViewMatrix();
    }

    @RequiresApi(21)
    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.mRound = f;
            float f2 = this.mRoundPercent;
            this.mRoundPercent = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.mRound != f) {
            z = true;
        } else {
            z = false;
        }
        this.mRound = f;
        if (f != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (this.mViewOutlineProvider == null) {
                C12942 r5 = new ViewOutlineProvider() {
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.mRound);
                    }
                };
                this.mViewOutlineProvider = r5;
                setOutlineProvider(r5);
            }
            setClipToOutline(true);
            this.mRect.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.mPath.reset();
            Path path = this.mPath;
            RectF rectF = this.mRect;
            float f3 = this.mRound;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float f) {
        boolean z;
        if (this.mRoundPercent != f) {
            z = true;
        } else {
            z = false;
        }
        this.mRoundPercent = f;
        if (f != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (this.mViewOutlineProvider == null) {
                C12931 r6 = new ViewOutlineProvider() {
                    public void getOutline(View view, Outline outline) {
                        int width = ImageFilterButton.this.getWidth();
                        int height = ImageFilterButton.this.getHeight();
                        outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterButton.this.mRoundPercent) / 2.0f);
                    }
                };
                this.mViewOutlineProvider = r6;
                setOutlineProvider(r6);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.mRoundPercent) / 2.0f;
            this.mRect.set(0.0f, 0.0f, (float) width, (float) height);
            this.mPath.reset();
            this.mPath.addRoundRect(this.mRect, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageFilterView.ImageMatrix imageMatrix = this.mImageMatrix;
        imageMatrix.mSaturation = f;
        imageMatrix.updateMatrix(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.ImageMatrix imageMatrix = this.mImageMatrix;
        imageMatrix.mWarmth = f;
        imageMatrix.updateMatrix(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
