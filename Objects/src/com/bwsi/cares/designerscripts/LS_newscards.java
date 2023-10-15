package com.bwsi.cares.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_newscards{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnlcard").vw.setWidth((int)((100d / 100 * width)));
views.get("pnlcard").vw.setHeight((int)((100d / 100 * height)));
views.get("pnldesc").vw.setLeft((int)((2d / 100 * width)));
views.get("pnldesc").vw.setWidth((int)((views.get("pnlcard").vw.getWidth())-(2d / 100 * width) - ((2d / 100 * width))));
views.get("pnldesc").vw.setTop((int)(0d));
views.get("pnldesc").vw.setHeight((int)((50d / 100 * height) - (0d)));
views.get("imgnews").vw.setLeft((int)((2d / 100 * width)));
views.get("imgnews").vw.setWidth((int)((views.get("pnlcard").vw.getWidth())-(2d / 100 * width) - ((2d / 100 * width))));
views.get("imgnews").vw.setTop((int)((1d / 100 * height)));
views.get("imgnews").vw.setHeight((int)((42d / 100 * height) - ((1d / 100 * height))));
views.get("pnlauthor").vw.setTop((int)((36d / 100 * height)));
views.get("pnlauthor").vw.setHeight((int)((41d / 100 * height) - ((36d / 100 * height))));
views.get("pnlauthor").vw.setLeft((int)((3d / 100 * width)));
views.get("pnlauthor").vw.setWidth((int)((views.get("pnlcard").vw.getWidth())-(3d / 100 * width) - ((3d / 100 * width))));
views.get("lblauthor").vw.setLeft((int)((2d / 100 * width)));
views.get("lblauthor").vw.setWidth((int)((views.get("pnlauthor").vw.getWidth())-(40d / 100 * width) - ((2d / 100 * width))));
views.get("lblauthor").vw.setTop((int)((0.5d / 100 * height)));
views.get("lblauthor").vw.setHeight((int)((views.get("pnlauthor").vw.getHeight())-(0.5d / 100 * height) - ((0.5d / 100 * height))));
views.get("lbldate").vw.setLeft((int)((70d / 100 * width)));
views.get("lbldate").vw.setWidth((int)((views.get("pnlauthor").vw.getWidth())-(2d / 100 * width) - ((70d / 100 * width))));
views.get("lbldate").vw.setTop((int)((0.5d / 100 * height)));
views.get("lbldate").vw.setHeight((int)((views.get("pnlauthor").vw.getHeight())-(0.5d / 100 * height) - ((0.5d / 100 * height))));
views.get("lblnewstitle").vw.setLeft((int)(0d));
views.get("lblnewstitle").vw.setWidth((int)((views.get("pnldesc").vw.getWidth()) - (0d)));
views.get("lblnewstitle").vw.setTop((int)((views.get("imgnews").vw.getTop() + views.get("imgnews").vw.getHeight())+(5d * scale)));
views.get("lblnewstitle").vw.setHeight((int)((views.get("pnldesc").vw.getHeight())-(1d / 100 * height) - ((views.get("imgnews").vw.getTop() + views.get("imgnews").vw.getHeight())+(5d * scale))));

}
}