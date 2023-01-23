package com.test.channelplay.utils;

public class Constants {

    //private Constants() {}
    
    
    public static final long TIMINGS_EXPLICIT_TIMEOUT = 20;
    public static final long TIMINGS_IMPLICIT_TIMEOUT = 20;
    
    
    // Project List
	    // Dixcy Test Project(67)
	       public final String project_xpath = "//a[@href=\"javascript:selectProject(67, 1);\"]";
	    
	    
	    
	// Module --> Market Working
	   public final String Market_Working_Module = "//li[@id=\"364\"]";
	
	    // Questionnaire Management
		   public final String Questionnaire_Management_under_Market_Working = "//li[@id='364']//a/span[contains(text(), 'Questionnaire Management')]";
		
			// Questionnaire
			   public final String Questionnaire_under_Questionnaire_Management = "//li[@id='368']";
			   
			   // Add Questionnaire
			   	  public final String Add_Questionnaire_Button = "//a[@onclick=\"questionnaireStructureAndReorder(0);\"]";
			   	  
			   	  // Add Drop-down 
			   	  	 public final String Add_Dropdown = "//a[text()=\" Add \"]";
			   	  	 
			   	  	 // Question - Create New Question
			   	  	    public final String Question = "//a[@onclick=\"showCreateQuestionForm('0')\"]";
			   	  	    
			   	  	    // Questionnaire Field
			   	  	       public final String Questionnaire_Field = "//label[text()=\"Questionnaire\"]/following::div/input";
			   	  	       
			   	  	    // Question Field
			   	  	       public final String Question_Field = "//label[text()=\"Question\"]/following::div/input";
			   	  	       
			   	  	    // Reporting Question Field
			   	  	       public final String Reporting_Question_Field = "//label[text()=\"Reporting Question\"]/following::div/input";
			   	  	       
			   	  	    // Weightage Field
			   	  	       public final String Weightage_Field = "//label[text()=\"Weightage\"]/following::div/input";
			   	  	       
			   	  	       
			   	  	    // Question Type Drop-down
			   	  	       public final String Question_Type_Dropdown = "//label[text()=\"Question Type\"]/following::div/select";
			   	  	       // Options
			   	  	          public final String Open_Ended_Question_Option = "//option[text()=\"Open Ended Question\"]";
			   	  	          public final String Radio_Button_Option = "//option[text()=\"Radio Button\"]";
			   	  	          public final String Checkbox_Option = "//option[text()=\"Checkbox\"]";
			   	  	          public final String Drop_Down_Option = "//option[text()=\"Drop Down\"]";
			   	  	          public final String Rating_Question_Option = "//option[text()=\"Rating Question\"]";
			   	  	          public final String Rank_Order_Question_Option = "//option[text()=\"Rank Order Question\"]";
			   	  	          public final String Matrix_question_Option = "//option[text()=\"Matrix question\"]";
			   	  	          public final String Upload_Attachments_Option = "//option[text()=\"Upload Attachments\"]";
			   	  	          public final String Upload_Multiple_Attachments_Option = "//option[text()=\"Upload Multiple Attachments\"]";
			   	  	          public final String Tabular_Questions_Option = "//option[text()=\"Tabular Questions\"]";
			   	  	          public final String Digital_Signature_Option = "//option[text()=\"Digital Signature\"]";
			   	  	          public final String Reference_Documents_Option = "//option[text()=\"Reference Documents\"]";
			   	  	          public final String QR_Code_Scan_Option = "//option[text()=\"QR Code Scan\"]";
			   	  	          public final String Repetitive_Questions_Option = "//option[text()=\"Repetitive Questions\"]";
			   	  	          
					   	// Answer Tab
				   	  	   public final String Answer_Tab = "//a[@href=\"#tab_6_2_1\"]";
				   	  	   
				   	    // Ques List Tab
				   	  	   public final String Ques_List_Tab = "//a[@href=\"#tab_6_2_1\"]";
				   	  	   // Fields
				   	  	      // Question Type
				   	  	         public final String Ques_List_Question_Type_Dropdown = "//table//td[2]/select";
				   	  	         // Options
				   	  	            public final String Simple_Text_Option = "//option[text()=\"Simple Text\"]";
				   	  	            public final String Numeric_Option = "//option[text()=\"Numeric\"]";
				   	  	            public final String Email_Option = "//option[text()=\"Email\"]";
				   	  	            public final String Date_Option = "//option[text()=\"Date\"]";
				   	  	            public final String Question_Type_Drop_Down_Option = "//option[text()=\"Drop Down\"]";
				   	  	      // Mandatory
				   	  	         public final String Ques_List_Mandatory_CheckBox = "//td[text()=\"Mandatory\"]/following::td/input";
				   	  	      // Audit Required
				   	  	         public final String Ques_List_Audit_Required_CheckBox = "//td[text()=\"Audit Required\"]/following::td/input";
				   	  	      // Key Question
				   	  	         public final String Ques_List_Key_Question_CheckBox = "//td[text()=\"Key Question\"]/following::td/input";
				   	  	      // Display Only
				   	  	         public final String Ques_List_Display_Only_CheckBox = "//td[text()=\"Display Only\"]/following::td/input";
			   	  	          
			   	  	    // Categorization Tab
			   	  	       public final String Categorization_Tab = "//a[@href=\"#tab_6_2_2\"]";
			   	  	       // Fields
			   	  	       	  public final String Category_Field = "//label[text()=\"Category\"]/following::div/select";
			   	  	       	  public final String SubCategory_Field = "Sub Category";
			   	  	       
			   	  	    // Validation Tab
			   	  	       public final String Validation_Tab = "//a[@href=\"#tab_6_2_3\"]";
			   	  	       // Fields
			   	  	       
			   	  	          // Mandatory
			   	  	       	     public final String Mandatory_CheckBox = "//label[text()=\"Mandatory\"]/following::div/input";
			   	  	       	  // Key Question
			   	  	             public final String Key_Question_CheckBox = "//label[text()=\"Key Question\"]/following::div/input";
			   	  	          
			   	  	          // Simple Text
			   	  	             public final String Simple_Text_RadioButton = "//label[text()=\"Simple Text\"]/following::div/input[@type=\"radio\"]";
			   	  	          	   public final String Simple_Text_Dropdown = "//label[text()=\"Simple Text\"]/following::div/select";
			   	  	          	   // Options
			   	  	          	      public final String Simple_Text_Characters_Option = "//option[text()=\"Characters\"]";
			   	  	          	   	    public final String Simple_Text_Min_Value_Field = "//label[text()=\"Simple Text\"]/following::input[@placeholder=\"Min.\"]";
			   	  	          	   	    public final String Simple_Text_Max_Value_Field = "//label[text()=\"Simple Text\"]/following::input[@placeholder=\"Max.\"]";

			   	  	          // Numeric	   	 
					   	  	     public final String Numeric_RadioButton = "//label[text()=\"Numeric\"]/following::div/input[@type=\"radio\"]";
					   	  	        public final String Numeric_Dropdown = "//label[text()=\"Numeric\"]/following::div/select";
					   	  	        // Options
					   	  	           public final String Numeric_Characters_Option = "//label[text()=\"Numeric\"]/following::div//option[text()=\"Characters\"]";
					   	  	           public final String Numeric_Value_Option = "//label[text()=\"Numeric\"]/following::div//option[text()=\"Value\"]";
					   	  	             public final String Numeric_Min_Value_Field = "//label[text()=\"Numeric\"]/following::input[@placeholder=\"Min.\"]";
					   	  	             public final String Numeric_Max_Value_Field = "//label[text()=\"Numeric\"]/following::input[@placeholder=\"Max.\"]";
					   	  	          
					   	  	  // Email        
			   	  	             public final String Email_RadioButton = "//label[text()=\"Email\"]/following::div/input";
			   	  	          // Date
			   	  	             public final String Date_RadioButton = "//label[text()=\"Date\"]/following::div/input";
			   	  	          // Time
			   	  	             public final String Time_RadioButton = "//label[text()=\"Time\"]/following::div/input";
			   	  	          // OTP
			   	  	             public final String OTP_RadioButton = "//label[text()=\"OTP\"]/following::div/input";
			   	  	                public final String OTP_Dropdown = "//label[text()=\"OTP\"]/following::div/select";
			   	  	                // Options
			   	  	                   public final String OTP_User_Option = "//label[text()=\"OTP\"]/following::div/select/option[text()=\"User\"]";
			   	  	                   public final String OTP_Store_Option = "//label[text()=\"OTP\"]/following::div/select/option[text()=\"Store\"]";
			   	  	                   public final String OTP_User_with_editable_number_Option = "//label[text()=\"OTP\"]/following::div/select/option[text()=\"User with editable number\"]";
			   	  	                   public final String OTP_Store_with_editable_number_Option = "//label[text()=\"OTP\"]/following::div/select/option[text()=\"Store with editable number\"]";
			   	  	             
			   	  	          // Comments      
			   	  	             public final String Comments_CheckBox = "//label[text()=\"Comments\"]/following::div/input";
			   	  	          // Audit Required
			   	  	             public final String Audit_Required_CheckBox = "//label[text()=\"Audit Required\"]/following::div/input";
			   	  	          // Display Only
			   	  	             public final String Display_Only_CheckBox = "//label[text()=\"Display Only\"]/following::div/input";
			   	  	          // Hidden
			   	  	             public final String Hidden_CheckBox = "//label[text()=\"Hidden\"]/following::div/input";
			   	  	          
			   	  	          // Default Option
			   	  	             public final String Default_Option_Dropdown = "//label[text()=\"Default Option\"]/following::select";
			   	  	          // Multi Select
			   	  	             public final String Multi_Select_CheckBox = "//label[text()=\"Multi Select\"]/following::input";
			   	  	          // Allow browsing
			   	  	             public final String Allow_browsing_CheckBox = "//label[text()=\"Allow browsing\"]/following::input";
			   	  	          // Video        
			   	  	             public final String Video_RadioButton = "//label[text()=\"Video\"]/following::div/input";
			   	  	          // Document        
			   	  	             public final String Document_RadioButton = "//label[text()=\"Document\"]/following::div/input";
			   	  	          // Signatory Name required
			   	  	             public final String Signatory_Name_required_CheckBox = "//label[text()=\"Signatory Name required\"]/following::input";
			   	  	          // Signatory Designation Required
			   	  	             public final String Signatory_Designation_Required_CheckBox = "//label[text()=\"Signatory Designation Required\"]/following::input";
			   	  	          // Outlet Info Required
			   	  	             public final String Outlet_Info_Required_CheckBox = "//label[text()=\"Outlet Info Required\"]/following::input";
			   	  	          // Images        
			   	  	             public final String Images_RadioButton = "//label[text()=\"Images\"]/following::div/input";
			   	  	          // Check Against DB
			   	  	             public final String Check_Against_DB_CheckBox = "//label[text()=\"Check Against DB\"]/following::input";
			   	  	          



			   
	    
	    // Audit
		   public final String Audit_under_Market_Working = "//li[@id='364']//a/span[contains(text(), 'Audit')]";
	    
	    // Market Working Activity
		   public final String Market_Working_Activity_under_Market_Working = "//li[@id='364']//a/span[contains(text(), 'Market Working Activity')]";
}