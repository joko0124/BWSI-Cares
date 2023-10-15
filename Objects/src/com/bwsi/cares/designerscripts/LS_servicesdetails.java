package com.bwsi.cares.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_servicesdetails{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnlmain").vw.setWidth((int)((100d / 100 * width)));
views.get("pnlmain").vw.setHeight((int)((90d / 100 * height)));
views.get("pnltitlebar").vw.setLeft((int)(0d));
views.get("pnltitlebar").vw.setWidth((int)((views.get("pnlmain").vw.getWidth()) - (0d)));
views.get("pnltitlebar").vw.setTop((int)(0d));
views.get("pnltitlebar").vw.setHeight((int)((48d * scale) - (0d)));
views.get("back").vw.setWidth((int)((10d / 100 * width)));
views.get("back").vw.setHeight((int)((views.get("back").vw.getWidth())));
views.get("back").vw.setTop((int)(0d));
views.get("back").vw.setLeft((int)((3d / 100 * width)));
views.get("lbltitle").vw.setTop((int)((views.get("back").vw.getTop() + views.get("back").vw.getHeight()/2) - (views.get("lbltitle").vw.getHeight() / 2)));
views.get("lbltitle").vw.setLeft((int)((views.get("back").vw.getLeft() + views.get("back").vw.getWidth())+(10d * scale)));
views.get("lbltitle").vw.setWidth((int)((views.get("pnltitlebar").vw.getWidth()) - ((views.get("back").vw.getLeft() + views.get("back").vw.getWidth())+(10d * scale))));
views.get("panel1").vw.setLeft((int)(0d));
views.get("panel1").vw.setWidth((int)((views.get("pnlmain").vw.getWidth()) - (0d)));
views.get("panel1").vw.setTop((int)((views.get("pnltitlebar").vw.getTop() + views.get("pnltitlebar").vw.getHeight())));
views.get("panel1").vw.setHeight((int)((views.get("pnlmain").vw.getHeight())-(60d / 100 * height) - ((views.get("pnltitlebar").vw.getTop() + views.get("pnltitlebar").vw.getHeight()))));
views.get("imageview1").vw.setLeft((int)((1d / 100 * width)));
views.get("imageview1").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
views.get("imageview1").vw.setTop((int)((views.get("pnltitlebar").vw.getTop() + views.get("pnltitlebar").vw.getHeight())+(1d / 100 * height)));
views.get("imageview1").vw.setHeight((int)((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight())-(1d / 100 * height) - ((views.get("pnltitlebar").vw.getTop() + views.get("pnltitlebar").vw.getHeight())+(1d / 100 * height))));
views.get("servicesview").vw.setLeft((int)(0d));
views.get("servicesview").vw.setWidth((int)((views.get("pnlmain").vw.getWidth()) - (0d)));
views.get("servicesview").vw.setTop((int)((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight())+(10d * scale)));
views.get("servicesview").vw.setHeight((int)((views.get("pnlmain").vw.getHeight()) - ((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight())+(10d * scale))));
views.get("btnhome").vw.setWidth((int)((6d / 100 * width)));
views.get("btnhome").vw.setHeight((int)((views.get("btnhome").vw.getWidth())));
views.get("btnhome").vw.setLeft((int)((10d / 100 * width)));
views.get("btnhome").vw.setTop((int)((95d / 100 * height) - (views.get("btnhome").vw.getHeight() / 2)));
views.get("btnservices").vw.setWidth((int)((6d / 100 * width)));
views.get("btnservices").vw.setHeight((int)((views.get("btnservices").vw.getWidth())));
views.get("btnservices").vw.setLeft((int)((views.get("btnhome").vw.getLeft() + views.get("btnhome").vw.getWidth())+(12.5d / 100 * width)));
views.get("btnservices").vw.setTop((int)((95d / 100 * height) - (views.get("btnservices").vw.getHeight() / 2)));
views.get("btnbranches").vw.setWidth((int)((6d / 100 * width)));
views.get("btnbranches").vw.setHeight((int)((views.get("btnhome").vw.getWidth())));
views.get("btnbranches").vw.setLeft((int)((views.get("btnservices").vw.getLeft() + views.get("btnservices").vw.getWidth())+(12.5d / 100 * width)));
views.get("btnbranches").vw.setTop((int)((95d / 100 * height) - (views.get("btnbranches").vw.getHeight() / 2)));
views.get("btncallus").vw.setWidth((int)((6d / 100 * width)));
views.get("btncallus").vw.setHeight((int)((views.get("btnhome").vw.getWidth())));
views.get("btncallus").vw.setLeft((int)((views.get("btnbranches").vw.getLeft() + views.get("btnbranches").vw.getWidth())+(12.5d / 100 * width)));
views.get("btncallus").vw.setTop((int)((95d / 100 * height) - (views.get("btncallus").vw.getHeight() / 2)));
views.get("btnaccount").vw.setWidth((int)((6d / 100 * width)));
views.get("btnaccount").vw.setHeight((int)((views.get("btnhome").vw.getWidth())));
views.get("btnaccount").vw.setLeft((int)((views.get("btncallus").vw.getLeft() + views.get("btncallus").vw.getWidth())+(12.5d / 100 * width)));
views.get("btnaccount").vw.setTop((int)((95d / 100 * height) - (views.get("btnaccount").vw.getHeight() / 2)));

}
}