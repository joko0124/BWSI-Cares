package com.bwsi.cares.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_login{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnlheader").vw.setLeft((int)(0d));
views.get("pnlheader").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("pnlheader").vw.setTop((int)(0d));
views.get("pnlheader").vw.setHeight((int)((40d / 100 * height) - (0d)));
views.get("pnllogin").vw.setLeft((int)((50d / 100 * width) - (views.get("pnllogin").vw.getWidth() / 2)));
views.get("pnllogin").vw.setTop((int)((views.get("pnlheader").vw.getHeight())/2d+(35d * scale)));
views.get("pnllogin").vw.setHeight((int)((73d / 100 * height) - ((views.get("pnlheader").vw.getHeight())/2d+(35d * scale))));
views.get("btnlogin").vw.setLeft((int)((views.get("pnllogin").vw.getLeft() + views.get("pnllogin").vw.getWidth()/2) - (views.get("btnlogin").vw.getWidth() / 2)));
views.get("btnlogin").vw.setTop((int)((views.get("pnllogin").vw.getTop() + views.get("pnllogin").vw.getHeight()) - (views.get("btnlogin").vw.getHeight() / 2)));
views.get("lbllogin").vw.setLeft((int)((10d / 100 * width)));
views.get("lbllogin").vw.setTop((int)((3d / 100 * height)));
views.get("lblloginstyle").vw.setTop((int)((views.get("lbllogin").vw.getTop() + views.get("lbllogin").vw.getHeight())+(5d * scale)));
views.get("lblloginstyle").vw.setLeft((int)((views.get("lbllogin").vw.getLeft() + views.get("lbllogin").vw.getWidth()/2) - (views.get("lblloginstyle").vw.getWidth() / 2)));
views.get("btnregister").vw.setLeft((int)((views.get("pnllogin").vw.getWidth())-(10d / 100 * width) - (views.get("btnregister").vw.getWidth())));
views.get("btnregister").vw.setTop((int)((3d / 100 * height)));
views.get("emailanchor").vw.setTop((int)((14d / 100 * height)));
views.get("emailanchor").vw.setHeight((int)((22d / 100 * height) - ((14d / 100 * height))));
views.get("emailanchor").vw.setLeft((int)((5d / 100 * width)));
views.get("emailanchor").vw.setWidth((int)((views.get("pnllogin").vw.getWidth())-(5d / 100 * width) - ((5d / 100 * width))));
views.get("lblloginemail").vw.setLeft((int)((2d / 100 * width)));
views.get("lblloginemail").vw.setTop((int)((views.get("emailanchor").vw.getHeight())/2d - (views.get("lblloginemail").vw.getHeight() / 2)));
views.get("txtloginemail").vw.setLeft((int)((views.get("lblloginemail").vw.getLeft() + views.get("lblloginemail").vw.getWidth())));
views.get("txtloginemail").vw.setWidth((int)((views.get("emailanchor").vw.getWidth())-(1d / 100 * width) - ((views.get("lblloginemail").vw.getLeft() + views.get("lblloginemail").vw.getWidth()))));
views.get("txtloginemail").vw.setTop((int)((0.5d / 100 * height)));
views.get("txtloginemail").vw.setHeight((int)((views.get("emailanchor").vw.getHeight())-(0.5d / 100 * height) - ((0.5d / 100 * height))));
views.get("passwordanchor").vw.setTop((int)((25d / 100 * height)));
views.get("passwordanchor").vw.setHeight((int)((33d / 100 * height) - ((25d / 100 * height))));
views.get("passwordanchor").vw.setLeft((int)((5d / 100 * width)));
views.get("passwordanchor").vw.setWidth((int)((views.get("pnllogin").vw.getWidth())-(5d / 100 * width) - ((5d / 100 * width))));
views.get("lblloginpassword").vw.setLeft((int)((2d / 100 * width)));
views.get("lblloginpassword").vw.setTop((int)((views.get("passwordanchor").vw.getHeight())/2d - (views.get("lblloginpassword").vw.getHeight() / 2)));
views.get("txtloginpassword").vw.setLeft((int)((views.get("lblloginpassword").vw.getLeft() + views.get("lblloginpassword").vw.getWidth())));
views.get("txtloginpassword").vw.setWidth((int)((views.get("passwordanchor").vw.getWidth())-(1d / 100 * width) - ((views.get("lblloginpassword").vw.getLeft() + views.get("lblloginpassword").vw.getWidth()))));
views.get("txtloginpassword").vw.setTop((int)((0.5d / 100 * height)));
views.get("txtloginpassword").vw.setHeight((int)((views.get("passwordanchor").vw.getHeight())-(0.5d / 100 * height) - ((0.5d / 100 * height))));
views.get("lblcheck").vw.setLeft((int)((views.get("passwordanchor").vw.getLeft())+(5d * scale)));
views.get("chkremember").vw.setTop((int)((views.get("passwordanchor").vw.getTop() + views.get("passwordanchor").vw.getHeight())+(15d * scale)));
views.get("chkremember").vw.setLeft((int)((views.get("lblcheck").vw.getLeft())-(1d * scale)));
views.get("lblcheck").vw.setTop((int)((views.get("chkremember").vw.getTop() + views.get("chkremember").vw.getHeight()/2) - (views.get("lblcheck").vw.getHeight() / 2)));
views.get("lblforgotpassword").vw.setTop((int)((views.get("passwordanchor").vw.getTop() + views.get("passwordanchor").vw.getHeight())+(15d * scale)));
views.get("pnlfb").vw.setLeft((int)((20d / 100 * width)));
views.get("pnlfb").vw.setWidth((int)((45d / 100 * width) - ((20d / 100 * width))));
views.get("lblfblogo").vw.setLeft((int)((1d / 100 * width)));
views.get("lblfblogo").vw.setTop((int)((views.get("pnlfb").vw.getHeight())/2d - (views.get("lblfblogo").vw.getHeight() / 2)));
views.get("lblfb").vw.setLeft((int)((views.get("lblfblogo").vw.getLeft() + views.get("lblfblogo").vw.getWidth())));
views.get("lblfb").vw.setWidth((int)((views.get("pnlfb").vw.getWidth()) - ((views.get("lblfblogo").vw.getLeft() + views.get("lblfblogo").vw.getWidth()))));
views.get("lblfb").vw.setTop((int)(0d));
views.get("lblfb").vw.setHeight((int)((views.get("pnlfb").vw.getHeight()) - (0d)));
views.get("pnlgoogle").vw.setLeft((int)((55d / 100 * width)));
views.get("pnlgoogle").vw.setWidth((int)((80d / 100 * width) - ((55d / 100 * width))));
views.get("lblgooglepluslogo").vw.setLeft((int)((2d / 100 * width)));
views.get("lblgooglepluslogo").vw.setTop((int)((views.get("pnlgoogle").vw.getHeight())/2d - (views.get("lblgooglepluslogo").vw.getHeight() / 2)));
views.get("lblgoogle").vw.setLeft((int)((views.get("lblgooglepluslogo").vw.getLeft() + views.get("lblgooglepluslogo").vw.getWidth())));
views.get("lblgoogle").vw.setWidth((int)((views.get("pnlgoogle").vw.getWidth()) - ((views.get("lblgooglepluslogo").vw.getLeft() + views.get("lblgooglepluslogo").vw.getWidth()))));
views.get("lblgoogle").vw.setTop((int)(0d));
views.get("lblgoogle").vw.setHeight((int)((views.get("pnlgoogle").vw.getHeight()) - (0d)));
views.get("pnlregister").vw.setLeft((int)((50d / 100 * width) - (views.get("pnlregister").vw.getWidth() / 2)));
views.get("pnlregister").vw.setTop((int)((views.get("pnlheader").vw.getHeight())/2d+(35d * scale)));
views.get("pnlregister").vw.setHeight((int)((83d / 100 * height) - ((views.get("pnlheader").vw.getHeight())/2d+(35d * scale))));
views.get("btnreg").vw.setLeft((int)((views.get("pnlregister").vw.getLeft() + views.get("pnlregister").vw.getWidth()/2) - (views.get("btnreg").vw.getWidth() / 2)));
views.get("btnreg").vw.setTop((int)((views.get("pnlregister").vw.getTop() + views.get("pnlregister").vw.getHeight()) - (views.get("btnreg").vw.getHeight() / 2)));
views.get("reglbllogin").vw.setLeft((int)((10d / 100 * width)));
views.get("reglbllogin").vw.setTop((int)((3d / 100 * height)));
views.get("regbtnregister").vw.setLeft((int)((views.get("pnllogin").vw.getWidth())-(10d / 100 * width) - (views.get("regbtnregister").vw.getWidth())));
views.get("regbtnregister").vw.setTop((int)((3d / 100 * height)));
views.get("lblregisterstyle").vw.setTop((int)((views.get("regbtnregister").vw.getTop() + views.get("regbtnregister").vw.getHeight())+(5d * scale)));
views.get("lblregisterstyle").vw.setLeft((int)((views.get("regbtnregister").vw.getLeft() + views.get("regbtnregister").vw.getWidth()/2) - (views.get("lblregisterstyle").vw.getWidth() / 2)));

}
}