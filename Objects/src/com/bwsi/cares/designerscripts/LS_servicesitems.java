package com.bwsi.cares.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_servicesitems{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("pnlservicetitle").vw.setLeft((int)(0d));
views.get("pnlservicetitle").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("pnlservicetitle").vw.setTop((int)(0d));
views.get("pnlservicetitle").vw.setHeight((int)((7d / 100 * height) - (0d)));
views.get("lbldot").vw.setLeft((int)((2d / 100 * width)));
views.get("lbldot").vw.setTop((int)((views.get("pnlservicetitle").vw.getHeight())/2d - (views.get("lbldot").vw.getHeight() / 2)));
views.get("lblservices").vw.setLeft((int)((views.get("lbldot").vw.getLeft() + views.get("lbldot").vw.getWidth())+(5d * scale)));
views.get("lblservices").vw.setWidth((int)((90d / 100 * width) - ((views.get("lbldot").vw.getLeft() + views.get("lbldot").vw.getWidth())+(5d * scale))));
views.get("lblservices").vw.setTop((int)((views.get("lbldot").vw.getTop() + views.get("lbldot").vw.getHeight()/2) - (views.get("lblservices").vw.getHeight() / 2)));
views.get("arrow").vw.setLeft((int)((views.get("pnlservicetitle").vw.getWidth())-(1d / 100 * height) - (views.get("arrow").vw.getWidth())));
views.get("arrow").vw.setTop((int)((views.get("lblservices").vw.getTop() + views.get("lblservices").vw.getHeight()/2) - (views.get("arrow").vw.getHeight() / 2)));
views.get("pane2").vw.setTop((int)((views.get("pnlservicetitle").vw.getTop() + views.get("pnlservicetitle").vw.getHeight())+(10d * scale)));
views.get("pane2").vw.setHeight((int)((100d / 100 * height) - ((views.get("pnlservicetitle").vw.getTop() + views.get("pnlservicetitle").vw.getHeight())+(10d * scale))));
views.get("bblistitem1").vw.setLeft((int)((1d / 100 * width)));
views.get("bblistitem1").vw.setWidth((int)((views.get("pane2").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
views.get("bblistitem1").vw.setTop((int)(0d));
views.get("bblistitem1").vw.setHeight((int)((views.get("pane2").vw.getHeight()) - (0d)));
views.get("imgfade").vw.setTop((int)((views.get("bblistitem1").vw.getTop() + views.get("bblistitem1").vw.getHeight())));
views.get("imgfade").vw.setHeight((int)((100d / 100 * height) - ((views.get("bblistitem1").vw.getTop() + views.get("bblistitem1").vw.getHeight()))));

}
}