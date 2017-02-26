package com.isaigarciamoso.demoblueicon.tools;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by isaigarciamoso on 24/02/17.
 */

public class GuiTools {
    private static double BaseWidth = 320.0D;
    private static double ScaleFactor = 1.0D;
    private static boolean initialized = false;
    private static boolean virtualButtonsEnabled = false;
    private static DisplayMetrics metrics = null;
    private static GuiTools current = null;
    public int ScreenWidth = 0;
    public int ScreenHeigth = 0;

    public static GuiTools getCurrent() {
        if(null == current) {
            current = new GuiTools();
        }

        return current;
    }

    private GuiTools() {
        BaseWidth = 320.0D;
        ScaleFactor = 1.0D;
    }

    public void init(WindowManager manager) {
        if(null != manager) {
            metrics = new DisplayMetrics();
            manager.getDefaultDisplay().getMetrics(metrics);
            ScaleFactor = (double)metrics.widthPixels / BaseWidth;
            initialized = true;
            this.ScreenWidth = metrics.widthPixels;
            this.ScreenHeigth = metrics.heightPixels;
        }
    }

    public static boolean isInitialized() {
        return initialized;
    }

    public static double getScaleFactor() {
        return ScaleFactor;
    }

    public int getEquivalenceInPixels(double baseMeasure) {
        return baseMeasure < 0.0D?0:(int)(baseMeasure * ScaleFactor);
    }

    public int getEquivalenceInPixels(int baseMeasure) {
        return (double)baseMeasure < 0.0D?0:(int)((double)baseMeasure * ScaleFactor);
    }

    public int getEquivalenceFromScaledPixels(double baseMeasure) {
        return baseMeasure < 0.0D?0:this.getEquivalenceInPixels(this.pxToDip((int)baseMeasure));
    }

    public int getEquivalenceFromScaledPixels(int baseMeasure) {
        return (double)baseMeasure < 0.0D?0:this.getEquivalenceInPixels(this.pxToDip(baseMeasure));
    }

    public void scalePaddings(View view) {
        if(null != view) {
            int[] paddings = new int[]{this.getEquivalenceInPixels(this.pxToDip(view.getPaddingLeft())), this.getEquivalenceInPixels(this.pxToDip(view.getPaddingTop())), this.getEquivalenceInPixels(this.pxToDip(view.getPaddingRight())), this.getEquivalenceInPixels(this.pxToDip(view.getPaddingBottom()))};
            view.setPadding(paddings[0], paddings[1], paddings[2], paddings[3]);
        }
    }

    public void scaleLayoutParams(View view) {
        if(null != view) {
            ViewGroup.LayoutParams params = view.getLayoutParams();
            if(params instanceof android.widget.LinearLayout.LayoutParams) {
                android.widget.LinearLayout.LayoutParams relativeLayoutParams = (android.widget.LinearLayout.LayoutParams)params;
                // this.scaleLinearLayoutParams(view, relativeLayoutParams);
            } else if(params instanceof android.widget.FrameLayout.LayoutParams) {
                android.widget.FrameLayout.LayoutParams relativeLayoutParams1 = (android.widget.FrameLayout.LayoutParams)params;
                //this.scaleFrameLayoutParams(view, relativeLayoutParams1);
            } else if(params instanceof android.widget.RelativeLayout.LayoutParams) {
                android.widget.RelativeLayout.LayoutParams relativeLayoutParams2 = (android.widget.RelativeLayout.LayoutParams)params;
                //  this.scaleRelativeLayoutParams(view, relativeLayoutParams2);
            }

        }
    }

    /*private void scaleLinearLayoutParams(View view, android.widget.LinearLayout.LayoutParams params) {
        if(null != view && null != params && initialized) {
            params.leftMargin = this.getEquivalenceInPixels(this.pxToDip(params.leftMargin));
            params.rightMargin = this.getEquivalenceInPixels(this.pxToDip(params.rightMargin));
            params.topMargin = this.getEquivalenceInPixels(this.pxToDip(params.topMargin));
            params.bottomMargin = this.getEquivalenceInPixels(this.pxToDip(params.bottomMargin));
            if(metrics.widthPixels != params.width && -1 != params.width && -2 != params.width) {
                params.width = this.getEquivalenceInPixels(this.pxToDip(params.width));
            }

            if(metrics.heightPixels != params.height && -1 != params.height && -2 != params.height) {
                params.height = this.getEquivalenceInPixels(this.pxToDip(params.height));
            }

            view.setLayoutParams(params);
        }
    }*/

    /*private void scaleRelativeLayoutParams(View view, android.widget.RelativeLayout.LayoutParams params) {
        if(null != view && null != params && initialized) {
            params.leftMargin = this.getEquivalenceInPixels(this.pxToDip(params.leftMargin));
            params.rightMargin = this.getEquivalenceInPixels(this.pxToDip(params.rightMargin));
            params.topMargin = this.getEquivalenceInPixels(this.pxToDip(params.topMargin));
            params.bottomMargin = this.getEquivalenceInPixels(this.pxToDip(params.bottomMargin));
            if(metrics.widthPixels != params.width && -1 != params.width && -2 != params.width) {
                params.width = this.getEquivalenceInPixels(this.pxToDip(params.width));
            }

            if(metrics.heightPixels != params.height && -1 != params.height && -2 != params.height) {
                params.height = this.getEquivalenceInPixels(this.pxToDip(params.height));
            }

            view.setLayoutParams(params);
        }
    }*/

    /*private void scaleFrameLayoutParams(View view, android.widget.FrameLayout.LayoutParams params) {
        if(null != view && null != params && initialized) {
            params.leftMargin = this.getEquivalenceInPixels(this.pxToDip(params.leftMargin));
            params.rightMargin = this.getEquivalenceInPixels(this.pxToDip(params.rightMargin));
            params.topMargin = this.getEquivalenceInPixels(this.pxToDip(params.topMargin));
            params.bottomMargin = this.getEquivalenceInPixels(this.pxToDip(params.bottomMargin));
            if(metrics.widthPixels != params.width && -1 != params.width && -2 != params.width) {
                params.width = this.getEquivalenceInPixels(this.pxToDip(params.width));
            }

            if(metrics.heightPixels != params.height && -1 != params.height && -2 != params.width) {
                params.height = this.getEquivalenceInPixels(this.pxToDip(params.height));
            }

            view.setLayoutParams(params);
        }
    }*/

    private double pxToDip(int px) {
        double dblPx = (double)px;
        double equivalent = dblPx / (double)metrics.density;
        return equivalent;
    }

    public void tryScaleText(TextView view) {
        try {
            double ex = 1.0D;
            view.setTextSize(0, (float)((double)view.getTextSize() * ScaleFactor * ex));
        } catch (Exception var4) {
            /*if(CommonSession.getInstance().getCommonSessionService().getAllowLog().booleanValue()) {
                Log.e("GuiTools", "Trying to scale text on an invalid view.", var4);
            }*/
        }

    }

    public void scale(View view) {
        if(null != view) {
            this.scaleLayoutParams(view);
            this.scalePaddings(view);
            if(view instanceof TextView) {
                this.tryScaleText((TextView)view);
            }

        }
    }

    public void scale(View view, boolean isTextView) {
        if(null != view) {
            this.scaleLayoutParams(view);
            this.scalePaddings(view);
            if(isTextView) {
                this.tryScaleText((TextView)view);
            }

        }
    }

    public void scaleAll(ViewGroup viewGroup) {
        if(null != viewGroup) {
            int childCount = viewGroup.getChildCount();

            for(int counter = 0; counter < childCount; ++counter) {
                View view = viewGroup.getChildAt(counter);
                this.scale(view);
                if(view instanceof ViewGroup) {
                    this.scaleAll((ViewGroup)view);
                }
            }

        }
    }
}

