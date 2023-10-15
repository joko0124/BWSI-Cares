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
End Sub

Sub Activity_Create(FirstTime As Boolean)
	SetStatusBarAndNavigationColor(GlobalVariables.PriColor1)
	Activity.LoadLayout("FAQs")
	TextEngine.Initialize(Activity)
'	DPView.TextEngine = TextEngine
'	DPView.Text = ""
	FilterTab.CornerRadiusBackground = FilterTab.Base.Height/2 'make the view rounded
	FilterTab.CornerRadiusBackground = 10dip 'make the view rounded

	FilterTab.AddTab("GENERAL", Null)
	FilterTab.AddTab("BILLING", Null)
	FilterTab.AddTab("TECHNICAL",Null)
'	FilterTab.AddTab("PRODUCT & INSTALLATION REQUEST",Null)

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