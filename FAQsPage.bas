B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
End Sub

Sub Globals
	Private Back As Label
	Private TextEngine As BCTextEngine
	Private xui As XUI
	Private FilterTab As ASSegmentedTab
	Private clvTabs As CustomListView
	Private clvFAQs As CustomListView
	Type itemInfo(ID As Int, parentID As String, ascendantIDs As List)
	Private expandable As CLVExpandable
End Sub

Sub Activity_Create(FirstTime As Boolean)
	SetStatusBarAndNavigationColor(GlobalVariables.PriColor1)
	Activity.LoadLayout("FAQs")
	TextEngine.Initialize(Activity)
'	DPView.TextEngine = TextEngine
'	DPView.Text = ""
	#If B4I
	Wait For B4XPage_Resize (Width As Int, Height As Int)
	#End If
	
	Dim xpnl_seg_Tab_background As B4XView = xui.CreatePanel("")
	xpnl_seg_Tab_background.SetLayoutAnimated(0,0,0,(Activity.Width)*2, 40dip)
	xpnl_seg_Tab_background.LoadLayout("FAQsTab")
	clvTabs.Add(xpnl_seg_Tab_background,"")
	
'	FilterTab.Base.SetColorAndBorder(FilterTab.Base.Color,0,0,FilterTab.Base.Height/2) 'make the view rounded

	FilterTab.CornerRadiusBackground = FilterTab.Base.Height/2 'make the view rounded
'	FilterTab.CornerRadiusBackground = 10dip 'make the view rounded

	FilterTab.AddTab("ALL", Null)
	FilterTab.AddTab("General", Null)
	FilterTab.AddTab("Billing Concern", Null)
	FilterTab.AddTab("Technical Concern",Null)
	FilterTab.AddTab("Product & Installation",Null)

End Sub

Sub Activity_Resume
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub Back_Click
	Activity.Finish
End Sub

Sub SetStatusBarAndNavigationColor(clr As Int)
	Try
		Dim jo As JavaObject
		jo.InitializeContext
		Dim window As JavaObject = jo.RunMethodJO("getWindow", Null)
		window.RunMethod("addFlags", Array (0x80000000))
		window.RunMethod("clearFlags", Array (0x04000000))
		window.RunMethod("setStatusBarColor", Array(clr))
		Dim jo2 As JavaObject
		jo2.InitializeContext
		jo2.RunMethodJO("getWindow", Null).RunMethod("setNavigationBarColor", Array(clr))
	Catch
		ToastMessageShow("Some error with your android version ( <5 )",True)
	End Try
End Sub

Private Sub FilterTab_TabChanged(index As Int)
	
End Sub