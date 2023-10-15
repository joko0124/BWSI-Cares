package com.bwsi.cares;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class newspage extends Activity implements B4AActivity{
	public static newspage mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "com.bwsi.cares", "com.bwsi.cares.newspage");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (newspage).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "com.bwsi.cares", "com.bwsi.cares.newspage");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.bwsi.cares.newspage", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (newspage) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (newspage) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return newspage.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (newspage) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (newspage) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            newspage mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (newspage) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public com.bwsi.cares.b4ximageview _person1_img = null;
public com.bwsi.cares.b4ximageview _person2_img = null;
public com.bwsi.cares.b4ximageview _person3_img = null;
public com.bwsi.cares.b4ximageview _person4_img = null;
public com.bwsi.cares.b4ximageview _imgnews = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlreader = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper[] _bmp = null;
public anywheresoftware.b4a.objects.LabelWrapper _back = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnewstitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblauthor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldatepublished = null;
public com.bwsi.cares.bbcodeview _newsdescview = null;
public com.bwsi.cares.bctextengine _textengine = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.dateutils _dateutils = null;
public com.bwsi.cares.main _main = null;
public com.bwsi.cares.faqspage _faqspage = null;
public com.bwsi.cares.globalvariables _globalvariables = null;
public com.bwsi.cares.dataprivacypage _dataprivacypage = null;
public com.bwsi.cares.dbutils _dbutils = null;
public com.bwsi.cares.historypage _historypage = null;
public com.bwsi.cares.starter _starter = null;
public com.bwsi.cares.httputils2service _httputils2service = null;
public com.bwsi.cares.b4xcollections _b4xcollections = null;
public com.bwsi.cares.xuiviewsutils _xuiviewsutils = null;

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
int _i = 0;
 //BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 21;BA.debugLine="SetStatusBarAndNavigationColor(0xFF03051A)";
_setstatusbarandnavigationcolor(((int)0xff03051a));
 //BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"NewDetails\")";
mostCurrent._activity.LoadLayout("NewDetails",mostCurrent.activityBA);
 //BA.debugLineNum = 23;BA.debugLine="TextEngine.Initialize(Activity)";
mostCurrent._textengine._initialize /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())));
 //BA.debugLineNum = 24;BA.debugLine="NewsDescView.TextEngine = TextEngine";
mostCurrent._newsdescview._settextengine /*com.bwsi.cares.bctextengine*/ (mostCurrent._textengine);
 //BA.debugLineNum = 25;BA.debugLine="NewsDescView.Text = \"\"";
mostCurrent._newsdescview._settext /*String*/ ("");
 //BA.debugLineNum = 27;BA.debugLine="For i = 0 To 3";
{
final int step6 = 1;
final int limit6 = (int) (3);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 28;BA.debugLine="bmp(i) = LoadBitmap(File.DirAssets,\"Person\" & i";
mostCurrent._bmp[_i] = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Person"+BA.NumberToString(_i)+".jpg");
 }
};
 //BA.debugLineNum = 30;BA.debugLine="Person1_Img.RoundedImage = True";
mostCurrent._person1_img._setroundedimage /*boolean*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 31;BA.debugLine="Person1_Img.Bitmap = bmp(0)";
mostCurrent._person1_img._setbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(mostCurrent._bmp[(int) (0)].getObject())));
 //BA.debugLineNum = 33;BA.debugLine="Person2_Img.RoundedImage = True";
mostCurrent._person2_img._setroundedimage /*boolean*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 34;BA.debugLine="Person2_Img.Bitmap = bmp(1)";
mostCurrent._person2_img._setbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(mostCurrent._bmp[(int) (1)].getObject())));
 //BA.debugLineNum = 36;BA.debugLine="Person3_Img.RoundedImage = True";
mostCurrent._person3_img._setroundedimage /*boolean*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 37;BA.debugLine="Person3_Img.Bitmap = bmp(2)";
mostCurrent._person3_img._setbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(mostCurrent._bmp[(int) (2)].getObject())));
 //BA.debugLineNum = 39;BA.debugLine="Person4_Img.RoundedImage = True";
mostCurrent._person4_img._setroundedimage /*boolean*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 40;BA.debugLine="Person4_Img.Bitmap = bmp(3)";
mostCurrent._person4_img._setbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(mostCurrent._bmp[(int) (3)].getObject())));
 //BA.debugLineNum = 42;BA.debugLine="imgNews.Bitmap = Main.SelectedNews.Thumbnails";
mostCurrent._imgnews._setbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(mostCurrent._main._selectednews /*com.bwsi.cares.main._mynews*/ .Thumbnails /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject())));
 //BA.debugLineNum = 43;BA.debugLine="lblNewsTitle.Text = Main.SelectedNews.Title";
mostCurrent._lblnewstitle.setText(BA.ObjectToCharSequence(mostCurrent._main._selectednews /*com.bwsi.cares.main._mynews*/ .Title /*String*/ ));
 //BA.debugLineNum = 44;BA.debugLine="lblAuthor.Text = Main.SelectedNews.Author";
mostCurrent._lblauthor.setText(BA.ObjectToCharSequence(mostCurrent._main._selectednews /*com.bwsi.cares.main._mynews*/ .Author /*String*/ ));
 //BA.debugLineNum = 45;BA.debugLine="lblDatePublished.Text = Main.SelectedNews.DatePub";
mostCurrent._lbldatepublished.setText(BA.ObjectToCharSequence(mostCurrent._main._selectednews /*com.bwsi.cares.main._mynews*/ .DatePublished /*String*/ ));
 //BA.debugLineNum = 46;BA.debugLine="NewsDescView.Text = Main.SelectedNews.NewsInfo";
mostCurrent._newsdescview._settext /*String*/ (mostCurrent._main._selectednews /*com.bwsi.cares.main._mynews*/ .NewsInfo /*String*/ );
 //BA.debugLineNum = 47;BA.debugLine="imgNews.CornersRadius = 30dip";
mostCurrent._imgnews._setcornersradius /*int*/ (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)));
 //BA.debugLineNum = 48;BA.debugLine="pnlReader.Enabled = False";
mostCurrent._pnlreader.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public static String  _back_click() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Private Sub Back_Click";
 //BA.debugLineNum = 60;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 //BA.debugLineNum = 61;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private Person1_Img,Person2_Img,Person3_Img,Perso";
mostCurrent._person1_img = new com.bwsi.cares.b4ximageview();
mostCurrent._person2_img = new com.bwsi.cares.b4ximageview();
mostCurrent._person3_img = new com.bwsi.cares.b4ximageview();
mostCurrent._person4_img = new com.bwsi.cares.b4ximageview();
mostCurrent._imgnews = new com.bwsi.cares.b4ximageview();
 //BA.debugLineNum = 11;BA.debugLine="Private pnlReader As Panel";
mostCurrent._pnlreader = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private bmp(4) As Bitmap";
mostCurrent._bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper[(int) (4)];
{
int d0 = mostCurrent._bmp.length;
for (int i0 = 0;i0 < d0;i0++) {
mostCurrent._bmp[i0] = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
}
}
;
 //BA.debugLineNum = 13;BA.debugLine="Private Back,lblNewsTitle,lblAuthor, lblDatePubli";
mostCurrent._back = new anywheresoftware.b4a.objects.LabelWrapper();
mostCurrent._lblnewstitle = new anywheresoftware.b4a.objects.LabelWrapper();
mostCurrent._lblauthor = new anywheresoftware.b4a.objects.LabelWrapper();
mostCurrent._lbldatepublished = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private imgNews As B4XImageView";
mostCurrent._imgnews = new com.bwsi.cares.b4ximageview();
 //BA.debugLineNum = 15;BA.debugLine="Private NewsDescView As BBCodeView";
mostCurrent._newsdescview = new com.bwsi.cares.bbcodeview();
 //BA.debugLineNum = 16;BA.debugLine="Private TextEngine As BCTextEngine";
mostCurrent._textengine = new com.bwsi.cares.bctextengine();
 //BA.debugLineNum = 17;BA.debugLine="Private xui As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _setstatusbarandnavigationcolor(int _clr) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _window = null;
anywheresoftware.b4j.object.JavaObject _jo2 = null;
 //BA.debugLineNum = 64;BA.debugLine="Sub SetStatusBarAndNavigationColor(clr As Int)";
 //BA.debugLineNum = 65;BA.debugLine="Try";
try { //BA.debugLineNum = 66;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 67;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(processBA);
 //BA.debugLineNum = 68;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getWi";
_window = new anywheresoftware.b4j.object.JavaObject();
_window = _jo.RunMethodJO("getWindow",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 69;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000))";
_window.RunMethod("addFlags",new Object[]{(Object)(((int)0x80000000))});
 //BA.debugLineNum = 70;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x04000000";
_window.RunMethod("clearFlags",new Object[]{(Object)(((int)0x04000000))});
 //BA.debugLineNum = 71;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(clr)";
_window.RunMethod("setStatusBarColor",new Object[]{(Object)(_clr)});
 //BA.debugLineNum = 72;BA.debugLine="Dim jo2 As JavaObject";
_jo2 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 73;BA.debugLine="jo2.InitializeContext";
_jo2.InitializeContext(processBA);
 //BA.debugLineNum = 74;BA.debugLine="jo2.RunMethodJO(\"getWindow\", Null).RunMethod(\"se";
_jo2.RunMethodJO("getWindow",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("setNavigationBarColor",new Object[]{(Object)(_clr)});
 } 
       catch (Exception e12) {
			processBA.setLastException(e12); //BA.debugLineNum = 76;BA.debugLine="ToastMessageShow(\"Some error with your android v";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Some error with your android version ( <5 )"),anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
}
