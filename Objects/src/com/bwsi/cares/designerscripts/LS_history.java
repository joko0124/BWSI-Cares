package com.bwsi.cares.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_history{

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
views.get("pnl65years").vw.setLeft((int)((1d / 100 * width)));
views.get("pnl65years").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
views.get("pnl65years").vw.setTop((int)((views.get("pnltitlebar").vw.getTop() + views.get("pnltitlebar").vw.getHeight())+(2d * scale)));
views.get("pnl65years").vw.setHeight((int)((35d / 100 * height) - ((views.get("pnltitlebar").vw.getTop() + views.get("pnltitlebar").vw.getHeight())+(2d * scale))));
views.get("historyview").vw.setLeft((int)((1.5d / 100 * width)));
views.get("historyview").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(1.5d / 100 * width) - ((1.5d / 100 * width))));
views.get("historyview").vw.setTop((int)((views.get("pnl65years").vw.getTop() + views.get("pnl65years").vw.getHeight())+(15d * scale)));
views.get("historyview").vw.setHeight((int)((100d / 100 * height) - ((views.get("pnl65years").vw.getTop() + views.get("pnl65years").vw.getHeight())+(15d * scale))));

}
}