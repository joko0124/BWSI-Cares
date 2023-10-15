package com.bwsi.cares.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_faqs{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnlmain").vw.setWidth((int)((100d / 100 * width)));
views.get("pnlmain").vw.setHeight((int)((100d / 100 * height)));
views.get("pnltitlebar").vw.setLeft((int)(0d));
views.get("pnltitlebar").vw.setWidth((int)((views.get("pnlmain").vw.getWidth()) - (0d)));
views.get("pnltitlebar").vw.setTop((int)(0d));
views.get("pnltitlebar").vw.setHeight((int)((48d * scale) - (0d)));
views.get("back").vw.setWidth((int)((10d / 100 * width)));
views.get("back").vw.setHeight((int)((views.get("back").vw.getWidth())));
views.get("back").vw.setTop((int)(0d));
views.get("back").vw.setLeft((int)((3d / 100 * width)));
views.get("lbltitle").vw.setTop((int)((views.get("back").vw.getTop() + views.get("back").vw.getHeight()/2) - (views.get("lbltitle").vw.getHeight() / 2)));
views.get("lbltitle").vw.setLeft((int)((views.get("back").vw.getLeft() + views.get("back").vw.getWidth())+(5d * scale)));
views.get("lbltitle").vw.setWidth((int)((views.get("pnltitlebar").vw.getWidth()) - ((views.get("back").vw.getLeft() + views.get("back").vw.getWidth())+(5d * scale))));
views.get("pnltabs").vw.setLeft((int)((2d / 100 * width)));
views.get("pnltabs").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(2d / 100 * width) - ((2d / 100 * width))));
views.get("pnltabs").vw.setTop((int)((views.get("pnltitlebar").vw.getTop() + views.get("pnltitlebar").vw.getHeight())+(10d * scale)));
views.get("pnltabs").vw.setHeight((int)((views.get("pnlmain").vw.getHeight())-(82d / 100 * height) - ((views.get("pnltitlebar").vw.getTop() + views.get("pnltitlebar").vw.getHeight())+(10d * scale))));
views.get("filtertab").vw.setLeft((int)((1d / 100 * width)));
views.get("filtertab").vw.setWidth((int)((views.get("pnltabs").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
views.get("filtertab").vw.setTop((int)((1d / 100 * height)));
views.get("filtertab").vw.setHeight((int)((views.get("pnltabs").vw.getHeight())-(1d / 100 * height) - ((1d / 100 * height))));
views.get("pnlsearch").vw.setLeft((int)((2d / 100 * width)));
views.get("pnlsearch").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(2d / 100 * width) - ((2d / 100 * width))));
views.get("pnlsearch").vw.setTop((int)((views.get("pnltabs").vw.getTop() + views.get("pnltabs").vw.getHeight())+(5d * scale)));
views.get("pnlsearch").vw.setHeight((int)((views.get("pnltabs").vw.getHeight())));
views.get("lblsearchicon").vw.setLeft((int)((1d / 100 * width)));
views.get("lblsearchicon").vw.setTop((int)((0.5d / 100 * height)));
views.get("lblsearchicon").vw.setHeight((int)((views.get("pnlsearch").vw.getHeight())-(0.5d / 100 * height) - ((0.5d / 100 * height))));
//BA.debugLineNum = 26;BA.debugLine="txtSearch.SetLeftAndRight(lblSearchIcon.Right, pnlSearch.Width - 1%x)"[FAQs/General script]
views.get("txtsearch").vw.setLeft((int)((views.get("lblsearchicon").vw.getLeft() + views.get("lblsearchicon").vw.getWidth())));
views.get("txtsearch").vw.setWidth((int)((views.get("pnlsearch").vw.getWidth())-(1d / 100 * width) - ((views.get("lblsearchicon").vw.getLeft() + views.get("lblsearchicon").vw.getWidth()))));
//BA.debugLineNum = 27;BA.debugLine="txtSearch.SetTopAndBottom(0.5%y, pnlSearch.Height - 0.5%y)"[FAQs/General script]
views.get("txtsearch").vw.setTop((int)((0.5d / 100 * height)));
views.get("txtsearch").vw.setHeight((int)((views.get("pnlsearch").vw.getHeight())-(0.5d / 100 * height) - ((0.5d / 100 * height))));
//BA.debugLineNum = 29;BA.debugLine="scvMain.SetLeftAndRight(1%x, pnlMain.Width - 1%x)"[FAQs/General script]
views.get("scvmain").vw.setLeft((int)((1d / 100 * width)));
views.get("scvmain").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 30;BA.debugLine="scvMain.SetTopAndBottom(pnlSearch.Bottom, pnlMain.Height)"[FAQs/General script]
views.get("scvmain").vw.setTop((int)((views.get("pnlsearch").vw.getTop() + views.get("pnlsearch").vw.getHeight())));
views.get("scvmain").vw.setHeight((int)((views.get("pnlmain").vw.getHeight()) - ((views.get("pnlsearch").vw.getTop() + views.get("pnlsearch").vw.getHeight()))));

}
}