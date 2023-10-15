B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.2
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
End Sub

Sub Globals
	Private Back As Label
	Private DPView As BBCodeView
	Private TextEngine As BCTextEngine
	Private xui As XUI
	Private imgLogo As ImageView
	Private cdBtn As ColorDrawable
'	Private picbmp As Bitmap
	Private btnContinue As ACButton
	Private chkAgree As CheckBox
End Sub

Sub Activity_Create(FirstTime As Boolean)
	SetStatusBarAndNavigationColor(GlobalVariables.PriColor1)
	Activity.LoadLayout("DataPrivacy")
	TextEngine.Initialize(Activity)
	DPView.TextEngine = TextEngine
	DPView.Text = ""
	cdBtn.Initialize2(GlobalVariables.PriColor1,20,0,Colors.Transparent)
	btnContinue.Background = cdBtn
	btnContinue.TextColor = Colors.White
	LoadDataPrivacy
End Sub

Sub Activity_Resume
	chkAgree.Checked = False
	btnContinue.Enabled = False
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


Sub LoadDataPrivacy
	Dim pnl As B4XView = xui.CreatePanel("")
	pnl.SetLayoutAnimated(0, 0, 0, 200dip, 120dip)
'	HistoryView.Views.Put("btn", btn)

	DPView.Text = _
$"[color=#1E4369][Alignment=Left][TextSize=26][b]Your Privacy is
important to us[/b][/TextSize][/Alignment][/color]

[TextSize=15][INDENT=1]To be allowed to collect and process [/INDENT][Alignment=justify]your personal information, you need to [b]agree our Data Privacy Statement[/b].
[/Alignment][/TextSize]
[color=#1E4369][Alignment=Left][TextSize=26][b]Balibago Waterworks
Data Privacy Statement[/b][/TextSize][/Alignment][/color]

[TextSize=15][INDENT=1]We at Balibago Waterworks System, Inc. are[/INDENT][Alignment=justify]
committed to ensuring and promoting the protection of your privacy and the confidentiality of your Personal Data as defined under the [b]Data Privacy Act of 2012[/b] and [b]its Implementing Rules and Regulations[/b].
This privacy policy is created to inform you on how we collect and process your Personal Data.
[/Alignment][/TextSize][TextSize=15][INDENT=1]We may update this policy to the extent [/INDENT]
[Alignment=justify]necessary to comply with data privacy laws and regulations, and technological changes and updates. Hence, we highly encourage you to check this page from time to time so that you are aware of any changes we have made to our privacy policy.
[/Alignment][/TextSize]
[color=#1E4369][Alignment=Left][TextSize=26][b]Purpose of the Collection and Processing of your Personal Data[/b][/TextSize][/Alignment][/color]

[TextSize=15][INDENT=1]We collect and process your Personal Data [/INDENT][Alignment=justify]to provide you with the best customer experience in the availment of our products and services. In particular, we use your Personal Data to:[/Alignment][/TextSize]
[TextSize=15][list]
[*]Facilitate transactions in accordance with your instructions and manage customer relations.
[*]Accommodate applications with AllEasy, Inc. for the availment of its payment platform at the option of the Data Subject.
[*]Facilitate payment of water bills and other changes through authorized third-party service providers such As AllEasy, Inc.
[*]Send promotional advertisements, rewards programs, and latest products And services; and
[*]Conduct research and marketing initiatives to assist us in improving our products and services.
[/list][/TextSize][TextSize=15][INDENT=1]Along with our primordial objective to [/INDENT][Alignment=justify]provide you with the highest quality of products and services, we are committed to abiding by all applicable legal requirements. Included in these legal requirements in our mandate To collect and process your Personal Data for the promotion of safe and honest commercial dealings.[/Alignment][/TextSize]

[color=#1E4369][Alignment=Left][TextSize=22][b]Personal Data Collected[/b][/TextSize][/Alignment][/color]

[TextSize=15][INDENT=1]We collect the following Personal Data from [/INDENT]
you:[/TextSize][TextSize=15][list style=ordered]
[*]Basic personal information such as name, date of birth, gender, nationality, and address.
[*]Payment details such as bank account, credit card and debit card (as may be necessary).
[*]Contact details such as telephone number, mobile phone number, and email address and
[*]Other identifying and supporting documents such as photos and government-issued IDs[/list]

[color=#1E4369][Alignment=Left][TextSize=26][b]Method by which we collect
your Personal Data[/b][/TextSize][/Alignment][/color]

[TextSize=15][INDENT=1]We collect your Personal Data through our [/INDENT]
[Alignment=justify][b]Balibago Waterworks Customer Care App[/b], market research activities, and authorized third-party platform providers, affiliates, partners, subsidiaries, and/or third-party service providers.[/Alignment][/TextSize]

[color=#1E4369][Alignment=Left][TextSize=26][b]Security of your Personal Data[/b][/TextSize][/Alignment][/color]

[TextSize=15][INDENT=1]Your Personal Data in whatever form are of[/INDENT]
[Alignment=Justify]great importance to us. Therefore, we have [b]imposed strict policies[/b] within our company [b]to ensure that the integrity and confidentiality of your Personal Data are ensured[/b]. We have [b]implemented technological, organizational, and physical security measures to protect your Personal Data from unauthorized access, alteration, modification, disclosure, destruction, erasure, loss and interference[/b].[/Alignment][/TextSize]

[color=#1E4369][Alignment=Left][TextSize=26][b]Disclosure and Sharing of your Personal Data[/b][/TextSize][/Alignment][/color]

[TextSize=15][INDENT=1]In compliance with legal and regulatory [/INDENT]
[Alignment=Justify]mandates, we may need to submit and disclose your Personal Data to appropriate government agencies including but not limited to [b]Bangko Sentral ng Pilipinas [/b]and [b]Anti-Money Laundering Council[/b].[/Alignment][/TextSize]
[TextSize=15][INDENT=1]We may share your Personal Data with our [/INDENT]affiliates,[Alignment=Justify]partners, subsidiaries, and/or third-party service providers (the [b]“Recipients”[/b]) for advertising, marketing, research, and other commercial purposes only after obtaining your consent. We ensure that the sharing of your Personal data shall be administered and conducted with the highest degree of care to maintain confidentiality of your Personal Data. We shall further safeguard your privacy and the protection of your Personal Data by entering into data sharing agreements or data processing agreements with Recipients requiring the observance and compliance of certain measures by the Recipients.[/Alignment][/TextSize]

[color=#1E4369][Alignment=Left][TextSize=26][b]Access to or Correction of your Personal Data[/b][/TextSize][/Alignment][/color]

[TextSize=15][INDENT=1]We adhere and respect your rights in [/INDENT][Alignment=Justify]relation to the collection and processing of your Personal Data including, the [b]right access your Personal Data collected[/b] and kept by us, the [b]right to modify inaccurate Personal Data[/b], and the [b]right to erase or block your Personal Data[/b].
Nevertheless, while we recognize your right to the erasure of your Personal Data stored with us, we will retain certain information relating to you and your transactions with us for periods as required by the law.[/Alignment][/TextSize]
[TextSize=15][INDENT=1]Unless there are legal and contractual[/INDENT][Alignment=Justify]
constraints, we shall process all your requests for access to, and correction of erasure, your Personal Data.
For these requests, kindly contact us at:[/Alignment][/TextSize]
[TextSize=15][INDENT=1]Address: [b]3923 McArthur Hiway, Balibago, 
	       Angeles City, Pampanga[/b]
Email: [b]privacy@bwsi.com.ph[/b][/INDENT][/TextSize]



"$
	chkAgree.Checked = False
	btnContinue.Enabled = False
End Sub

Private Sub btnContinue_Click
	
End Sub

Private Sub chkAgree_CheckedChange(Checked As Boolean)
	btnContinue.Enabled = Checked
End Sub